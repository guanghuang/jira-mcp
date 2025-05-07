package io.github.kvr.mcp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.platform.api.*;
import com.atlassian.jira.platform.model.*;
import io.quarkiverse.mcp.server.Tool;
import io.quarkiverse.mcp.server.ToolArg;
import jakarta.inject.Inject;


/**
 * Jira Platform MCP Service
 */
public class JiraPlatformMCPService {
    private final ApiClient apiClient;

    /**
     * Constructor
     */
    @Inject
    public JiraPlatformMCPService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get an issue 
     * @param issueIdOrKey The ID or key of the issue.
     * @param fields A list of fields to return for the issue.
     * @param fieldsByKeys Whether fields in fields are referenced by keys rather than IDs.
     * @param expand Expand options.
     * @param properties A list of issue properties to return for the issue.
     * @param updateHistory Whether the project in which the issue is created is added to the user's Recently viewed project list, as shown under Projects in Jira. This also populates the JQL issues search lastViewed field.
     * @return The issue details.
     */
    @Tool(name = "get_issue", description = """
        Returns the details for an issue.
        The issue is identified by its ID or key, however, if the identifier doesn't match an issue, a case-insensitive search and check for moved issues is performed. If a matching issue is found its details are returned, a 302 or other redirect is not returned. The issue key returned in the response is the key of the issue found.""")
    public IssueBean getIssue(@ToolArg(description = "The ID or key of the issue.") String issueIdOrKey,
        @ToolArg(required = false, description = """
            A list of fields to return for the issue. This parameter accepts a comma-separated list. Use it to retrieve a subset of fields. Allowed values:
            *all Returns all fields.
            *navigable Returns navigable fields.
            Any issue field, prefixed with a minus to exclude.
            Examples:
            summary,comment Returns only the summary and comments fields.
            -description Returns all (default) fields except description.
            *navigable,-comment Returns all navigable fields except comment.""") List<String> fields,
        @ToolArg(required = false, description = "Whether fields in fields are referenced by keys rather than IDs. This parameter is useful where fields have been added by a connect app and a field's key may differ from its ID.") Boolean fieldsByKeys,
        @ToolArg(required = false, description = """
            Use expand to include additional information about the issues in the response. This parameter accepts a comma-separated list. Expand options include:
            renderedFields Returns field values rendered in HTML format.
            names Returns the display name of each field.
            schema Returns the schema describing a field type.
            transitions Returns all possible transitions for the issue.
            editmeta Returns information about how each field can be edited.
            changelog Returns a list of recent updates to an issue, sorted by date, starting from the most recent.
            versionedRepresentations Returns a JSON array for each version of a field's value, with the highest number representing the most recent version. Note: When included in the request, the fields parameter is ignored.""") String expand,
        @ToolArg(required = false, description = """
            A list of issue properties to return for the issue. This parameter accepts a comma-separated list. Allowed values:
            *all Returns all issue properties.
            Any issue property key, prefixed with a minus to exclude.
            Examples:
            *all Returns all properties.
            *all,-prop1 Returns all properties except prop1.
            prop1,prop2 Returns prop1 and prop2 properties.""") List<String> properties,
        @ToolArg(required = false, description = "Whether the project in which the issue is created is added to the user's Recently viewed project list, as shown under Projects in Jira. This also populates the JQL issues search lastViewed field.") Boolean updateHistory
        ) {
        return ExceptionFunction.DoInException(() -> new IssuesApi(apiClient).getIssue(issueIdOrKey, fields, fieldsByKeys, expand, properties, updateHistory, false), "get_issue");
    }

    /**
     * Search for issues using JQL enhanced search
     * @param jql A JQL (JIRA Query Language) expression to search for issues.
     * @param maxResults The maximum number of items to return per page. To manage page size, API may return fewer items per page where a large number of fields are requested. The greatest number of items returned per page is achieved when requesting id or key only. It returns max 5000 issues. Default is 50 if not provided.
     * @param fields A list of fields to return for each issue, use it to retrieve a subset of fields. This parameter accepts a comma-separated list.
     * @param expand Expand options.
     * @param properties A list of issue properties to return for the issue.
     * @return A list of issues that match the JQL query.
     */
    @Tool(name = "search_issues_by_jql", description = """
        Search for issues using Jira Query Language(JQL) enhanced search.
        The JQL query is used to search for issues in Jira. The query can include various fields and operators to filter the results.
        """)
    public SearchAndReconcileResults searchIssuesByJql(@ToolArg(required = false, description = """
            A JQL (JIRA Query Language) expression to search for issues.
            JQL fields documentation: https://support.atlassian.com/jira-software-cloud/docs/jql-fields/
            Examples:
            - Find Epics: "issuetype = Epic AND project = PROJECT_KEY"
            - Find issues in Epic: "parent = PROJECT_KEY-123"
            - Find by status: "status = 'In Progress' AND project = PROJECT_KEY"
            - Find by assignee: "assignee = currentUser()"
            - Find recently updated: "updated >= -7d AND project = PROJECT_KEY"
            - Find by label: "labels = frontend AND project = PROJECT_KEY"
            - Find by priority: "priority = High AND project = PROJECT_KEY"
            """) String jql,
        @ToolArg(required = false, description = "The maximum number of items to return per page. To manage page size, API may return fewer items per page where a large number of fields are requested. The greatest number of items returned per page is achieved when requesting id or key only. It returns max 5000 issues. Default is 50 if not provided.") Integer maxResults,
        @ToolArg(required = false, description = """
            A list of fields to return for each issue, use it to retrieve a subset of fields. This parameter accepts a comma-separated list.
            Allowed values:
            *all Returns all fields.
            *navigable Returns navigable fields.
            Any issue field, prefixed with a minus to exclude.
            Examples:
            summary,comment Returns only the summary and comments fields.
            -description Returns all (default) fields except description.
            *navigable,-comment Returns all navigable fields except comment.
            """) List<String> fields,
        @ToolArg(required = false, description = """
            Whether to expand the fields in the response. This parameter accepts a comma-separated list. Expand options include:
            renderedFields Returns field values rendered in HTML format.
            names Returns the display name of each field.
            schema Returns the schema describing a field type.
            transitions Returns all possible transitions for the issue.
            editmeta Returns information about how each field can be edited.
            changelog Returns a list of recent updates to an issue, sorted by date, starting from the most recent.
            """) String expand,
        @ToolArg(required = false, description = "A list of up to 5 issue properties to include in the results. This parameter accepts a comma-separated list.") List<String> properties,
        @ToolArg(required = false, description = "Whether fields in fields are referenced by keys rather than IDs. This parameter is useful where fields have been added by a connect app and a field's key may differ from its ID.") Boolean fieldsByKeys) {
        return ExceptionFunction.DoInException(() -> new IssueSearchApi(apiClient).searchAndReconsileIssuesUsingJql(jql, null, maxResults, fields, expand, properties, fieldsByKeys, false, null), "search_issues_by_jql");
    }

    /**
     * Get all jira issue fields
     * @return A list of all jira issue fields.
     */
    @Tool(name = "get_issue_fields", description = "Get all jira issue fields")
    public List<FieldDetails> getIssueFields() {        
        return ExceptionFunction.DoInException(() -> new IssueFieldsApi(apiClient).getFields(), "get_issue_fields");
    }

    /**
     * Get current user info
     * @return The current user info.
     */
    @Tool(name = "get_myself_info", description = "Get current user info")
    public User getMyselfInfo() {
        return ExceptionFunction.DoInException(() -> new MyselfApi(apiClient).getCurrentUser(null), "get_myself_info");
    }

    /**
     * Search for users by name or email
     * @param nameOrEmail The name or email of the user to search for. The string can match the prefix of the attribute's value.
     * @return A list of users that match the name or email.
     */
    @Tool(name = "search_users", description = "Search for users by name or email")
    public List<User> SearchUsers(@ToolArg(description = "The name or email of the user to search for. The string can match the prefix of the attribute's value.") String nameOrEmail) {
        return ExceptionFunction.DoInException(() -> new UserSearchApi(apiClient).findUsers(nameOrEmail, null, null, null, null, null), "search_users");
    }

    /**
     * Get either all transitions or a transition that can be performed by the user on an issue, based on the issue's status
     * @param issueIdOrKey The ID or key of the issue.
     * @return A list of transitions that can be performed by the user on the issue.
     */
    @Tool(name = "get_issue_transitions", description = "Get either all transitions or a transition that can be performed by the user on an issue, based on the issue's status")
    public Transitions getIssueTransitions(@ToolArg(description = "The ID or key of the issue.") String issueIdOrKey) {
        return ExceptionFunction.DoInException(() -> new IssuesApi(apiClient).getTransitions(issueIdOrKey, null, null, null, null, null), "get_issue_transitions");
    }

    /**
     * Create an jira issue
     * @param projectKeyOrId The project key of the issue.
     * @param issueTypeNameOrId The issue type name or ID of the issue.
     * @param summary The summary of the issue.
     * @param assigneeId The assignee Id of the issue.
     * @return The created issue.
     */
    @Tool(name = "create_issue", description = "Create an jira issue")
    public CreatedIssue createIssue(@ToolArg(description = "The project key or ID of the issue.") String projectKeyOrId,
        @ToolArg(description = "The issue type name or ID of the issue.") String issueTypeNameOrId,
        @ToolArg(description = "The summary of the issue.") String summary,
        @ToolArg(required = false, description = "The assignee Id of the issue.") String assigneeId,
        @ToolArg(required = false, description = """
            The description of the issue.
            The description is the json of the `Atlassian Document Format.` from https://developer.atlassian.com/cloud/jira/platform/apis/document/structure/
            Here is the simple sample of comment `Hello, world` for mainly `text type`:
            ```
                {
                  "version": 1,
                  "type": "doc",
                  "content": [
                    {
                      "type": "paragraph",
                      "content": [
                        {
                          "type": "text",
                          "text": "Hello "
                        },
                        {
                          "type": "text",
                          "text": "world",
                          "marks": [
                            {
                              "type": "strong"
                            }
                          ]
                        }
                      ]
                    }
                  ]
                }
            ```
            """) String description,
        @ToolArg(required = false, description = """
            A valid JSON object of fields to update as a string.
            YExample: {"priority": {"name": "High"}, "assignee": {"id": "2342423423"}, "customfield_10010": 1, "customfield_10048": {value:"value", id:"123"},  "summary": "Completed orders still displaying in pending"}""") String fields,
        @ToolArg(required = false, description = """
            List of properties to update.
            Example: [{"key": "key1", "value":"value1"}, {"key": "key2", "value": "value2"}]""") List<EntityProperty> properties,
        @ToolArg(required = false, description = """
           A Map containing the field field name and a list of operations to perform on the issue screen field.
           Note that fields included in here cannot be included in fields.
           Here is the example of the map for adding an `issuelinks` to ticket
           ```
            {
               "issuelinks":[
                {
                    //add, copy, edit, remove or set
                    "add":{
                        "values":[
                            {
                                "type":{
                                    // link type id
                                    "id":"10036"
                                },
                                "outwardIssues":[
                                    {
                                        "key": ticket
                                    }
                                ]
                            }
                        ]
                    }
                }
            ]
            }
           ```
           """) Map<String, List<FieldUpdateOperation>> update
        ) {
        return ExceptionFunction.DoInException(() -> {
            IssueUpdateDetails issueUpdateDetails = new IssueUpdateDetails();
            if (fields != null) {
                issueUpdateDetails.setFields(Helper.getMapFromJsonString(fields));
            }
            if (projectKeyOrId != null) {
                if (projectKeyOrId.matches("\\d+")) {
                    var map = new HashMap<String, Object>();
                    map.put("id", projectKeyOrId);
                    issueUpdateDetails.putFieldsItem("project", map);
                } else {
                    var map = new HashMap<String, Object>();
                    map.put("key", projectKeyOrId);
                    issueUpdateDetails.putFieldsItem("project", map);
                }
            }
            if (issueTypeNameOrId != null) {
                if (issueTypeNameOrId.matches("\\d+")) {
                    var map = new HashMap<String, Object>();
                    map.put("id", issueTypeNameOrId);
                    issueUpdateDetails.putFieldsItem("issuetype", map);
                } else {
                    var map = new HashMap<String, Object>();
                    map.put("name", issueTypeNameOrId);
                    issueUpdateDetails.putFieldsItem("issuetype", map);
                }
            }
            if (assigneeId != null) {
                var map = new HashMap<String, Object>();
                map.put("id", assigneeId);
                issueUpdateDetails.putFieldsItem("assignee", map);
            }
            if (summary != null) {
                issueUpdateDetails.putFieldsItem("summary", summary);
            }
            if (description != null) {
                issueUpdateDetails.putFieldsItem("description", Helper.getMapFromJsonString(description));
            }
            if (update != null) {
                issueUpdateDetails.setUpdate(update);
            }
            if (properties != null) {
                issueUpdateDetails.setProperties(properties);
            }
            return new IssuesApi(apiClient).createIssue(issueUpdateDetails, null);  
        }, "create_issue");
    }

    /**
     * Update an jira issue
     * @param issueIdOrKey The ID or key of the issue.
     * @param summary The summary of the issue.
     * @param description The description of the issue.
     * @return A message indicating that the issue has been updated.
     */
    @Tool(name = "update_issue", description = "Update an jira issue")
    public String updateIssue(@ToolArg(description = "The ID or key of the issue.") String issueIdOrKey,
        @ToolArg(required = false, description = "The summary of the issue.") String summary,
        @ToolArg(required = false, description = """
            The description of the issue.
            The description is the json of the `Atlassian Document Format.` from https://developer.atlassian.com/cloud/jira/platform/apis/document/structure/
            Here is the simple sample of comment `Hello, world` for mainly `text type`:
            ```
                {
                  "version": 1,
                  "type": "doc",
                  "content": [
                    {
                      "type": "paragraph",
                      "content": [
                        {
                          "type": "text",
                          "text": "Hello "
                        },
                        {
                          "type": "text",
                          "text": "world",
                          "marks": [
                            {
                              "type": "strong"
                            }
                          ]
                        }
                      ]
                    }
                  ]
                }
            ```
            """) String description,
        @ToolArg(required = false, description = """
            A valid JSON object of fields to update as a string. For assignee, use key "id" for user account Id
            Example: {"priority": {"name": "High"}, "assignee": {"id": "2342423423"}, "customfield_10010": 1,  "summary": "Completed orders still displaying in pending"}""") String fields,
        @ToolArg(required = false, description = """
            List of properties to update.
            Example: [{"key": "key1", "value":"value1"}, {"key": "key2", "value": "value2"}]""") List<EntityProperty> properties,
        @ToolArg(required = false, description = """
           A Map containing the field field name and a list of operations to perform on the issue screen field.
           Note that fields included in here cannot be included in fields.
           Here is the example of the map for adding an `issuelinks` to ticket
           ```
            {
               "issuelinks":[
                {
                    //add, copy, edit, remove or set
                    "add":{
                        "values":[
                            {
                                "type":{
                                    // link type id
                                    "id":"10036"
                                },
                                "outwardIssues":[
                                    {
                                        "key": ticket
                                    }
                                ]
                            }
                        ]
                    }
                }
            ]
            }
           ```
           """) Map<String, List<FieldUpdateOperation>> update
        ) {
        return ExceptionFunction.DoInException(() -> {
            IssueUpdateDetails issueUpdateDetails = new IssueUpdateDetails();
            if (fields != null) {
                issueUpdateDetails.fields(Helper.getMapFromJsonString(fields));
            }
            if (summary != null) {
                issueUpdateDetails.putFieldsItem("summary", summary);
            }
            if (description != null) {
                issueUpdateDetails.putFieldsItem("description", Helper.getMapFromJsonString(description));
            }
            if (update != null) {
                issueUpdateDetails.setUpdate(update);
            }
            if (properties != null) {
                issueUpdateDetails.setProperties(properties);
            }
            var ret = new IssuesApi(apiClient).editIssue(issueIdOrKey, issueUpdateDetails, null, null, null, null, null);
            return ret == null ? "Issue updated" : ret.toString();
        }, "update_issue");
    }

    /**
     * Delete an jira issue
     * @param issueIdOrKey The ID or key of the issue.
     * @return A message indicating that the issue has been deleted.
     */
    @Tool(name = "delete_issue", description = "Delete an jira issue")
    public String deleteIssue(@ToolArg(description = "The ID or key of the issue.") String issueIdOrKey) {
        return ExceptionFunction.DoInException(() -> {
            new IssuesApi(apiClient).deleteIssue(issueIdOrKey, null);
            return "Issue deleted";
        }, "delete_issue");
    }

    /**
     * Add a comment to an jira issue
     * @param issueIdOrKey The ID or key of the issue.
     * @param commentBody The comment to add.
     * @return A message indicating that the comment has been added.
     */
    @Tool(name = "add_jira_comment", description = "Add comments to an jira issue")
    public Comment addComment(@ToolArg(description = "The ID or key of the issue.") String issueIdOrKey,
        @ToolArg(description = """
            The comment to add.
            The comment is the json of the `Atlassian Document Format.` from https://developer.atlassian.com/cloud/jira/platform/apis/document/structure/
            Here is the simple sample of comment `Hello, world` for mainly `text type`:
            ```
                {
                  "version": 1,
                  "type": "doc",
                  "content": [
                    {
                      "type": "paragraph",
                      "content": [
                        {
                          "type": "text",
                          "text": "Hello "
                        },
                        {
                          "type": "text",
                          "text": "world",
                          "marks": [
                            {
                              "type": "strong"
                            }
                          ]
                        }
                      ]
                    }
                  ]
                }
            ```
            """) String commentBody) {
        var comment = new Comment();
        comment.setBody(Helper.getMapFromJsonString(commentBody));
        return ExceptionFunction.DoInException(() -> new IssueCommentsApi(apiClient).addComment(issueIdOrKey, comment, null), "add_jira_comment");
    }

    /**
     * Transition an jira issue
     * @param issueIdOrKey The ID or key of the issue.
     * @param transitionId The transition Id to perform.
     * @param fields A valid JSON object of fields to update as a string. For assignee, use key "id"
     * @return A message indicating that the issue has been transitioned.
     */
    @Tool(name = "transition_jira_issue", description = "Transition an jira issue")
    public String transitionIssue(@ToolArg(description = "The ID or key of the issue.") String issueIdOrKey,
        @ToolArg(description = "The transition Id to perform.") String transitionId,
        @ToolArg(required = false, description = """
            A valid JSON object of fields to update as a string. For assignee, use key "id"
            Example: {"priority": {"name": "High"}, "assignee": {"id": "2342423423"}, "customfield_10010": 1,  "summary": "Completed orders still displaying in pending"}""") String fields) {
        return ExceptionFunction.DoInException(() -> {
            var issueUpdateDetails = new IssueUpdateDetails();
            var transition = new IssueTransition();
            transition.setId(transitionId);
            issueUpdateDetails.setTransition(transition);
            if (fields != null) {
            issueUpdateDetails.fields(Helper.getMapFromJsonString(fields));
            }
            var ret = new IssuesApi(apiClient).doTransition(issueIdOrKey, issueUpdateDetails);
            return ret == null ? "Transitioned" : ret.toString();
        }, "transition_jira_issue");
    }

    /**
     * Add attachments to a jira issue
     * @param issueIdOrKey The ID or key of the issue.
     * @param files The files to add as attachments.
     * @return A message indicating that the attachment have been added.
     */
    @Tool(name = "add_jira_attachments", description = "Add attachments to a jira issue")
    public List<Attachment> addJiraAttachments(@ToolArg(description = "The ID or key of the issue that attachments are added to.") String issueIdOrKey,
        @ToolArg(description = """
           The files to add as attachments.
           fields in `MultipartFile`:
            - `base64Content`: The base64 encoded file content to add as an attachment.
            - `name`: The name of the attachment. default is `file` for jira attachment. Not need to be set for this tool
            - `originalFilename`: The original file name of the attachment, normally it is the file name of attachment. default is noname
            - `contentType`: The content/media type of the attachment. default is `text/plain`, e.g. `text/csv`,`application/pdf` ...
           """) List<MultipartFile> files) {
        return  ExceptionFunction.DoInException(() -> new IssueAttachmentsApiEx(apiClient).addAttachments(issueIdOrKey, files), "add_jira_attachments");
    }
}
