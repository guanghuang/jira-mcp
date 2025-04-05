package io.github.kvr.mcp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.platform.api.IssueCommentsApi;
import com.atlassian.jira.platform.api.IssueFieldsApi;
import com.atlassian.jira.platform.api.IssueSearchApi;
import com.atlassian.jira.platform.api.IssuesApi;
import com.atlassian.jira.platform.api.MyselfApi;
import com.atlassian.jira.platform.api.UserSearchApi;
import com.atlassian.jira.platform.model.Comment;
import com.atlassian.jira.platform.model.CreatedIssue;
import com.atlassian.jira.platform.model.EntityProperty;
import com.atlassian.jira.platform.model.FieldDetails;
import com.atlassian.jira.platform.model.IssueBean;
import com.atlassian.jira.platform.model.IssueTransition;
import com.atlassian.jira.platform.model.IssueUpdateDetails;
import com.atlassian.jira.platform.model.SearchAndReconcileResults;
import com.atlassian.jira.platform.model.Transitions;
import com.atlassian.jira.platform.model.User;
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
        ) throws ApiException {
        return new IssuesApi(apiClient).getIssue(issueIdOrKey, fields, fieldsByKeys, expand, properties, updateHistory, false);
    }

    @Tool(name = "search_issue", description = "Search for issues using JQL enhanced search")
    public SearchAndReconcileResults searchIssue(@ToolArg(description = """
        A JQL (JIRA Query Language) expression to search for issues.
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
        @ToolArg(description = """
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
        @ToolArg(required = false, description = "Whether fields in fields are referenced by keys rather than IDs. This parameter is useful where fields have been added by a connect app and a field's key may differ from its ID.") Boolean fieldsByKeys) throws ApiException {
        return new IssueSearchApi(apiClient).searchAndReconsileIssuesUsingJql(jql, null, maxResults, fields, expand, properties, fieldsByKeys, false, null);
    }


    @Tool(name = "get_issue_fields", description = "Get all jira issue fields")
    public List<FieldDetails> getIssueFields() throws ApiException {        
        return new IssueFieldsApi(apiClient).getFields();
    }

    @Tool(name = "get_myself_info", description = "Get current user info")
    public User getMyselfInfo() throws ApiException {
        return new MyselfApi(apiClient).getCurrentUser(null);
    }

    @Tool(name = "search_user", description = "Search for users by name or email")
    public List<User> SearchUser(@ToolArg(description = "The name or email of the user to search for. The string can match the prefix of the attribute's value.") String nameOrEmail) throws ApiException {
        return new UserSearchApi(apiClient).findUsers(nameOrEmail, null, null, null, null, null);
    }

    @Tool(name = "get_issue_transitions", description = "Get either all transitions or a transition that can be performed by the user on an issue, based on the issue's status")
    public Transitions getIssueTransitions(@ToolArg(description = "The ID or key of the issue.") String issueIdOrKey) throws ApiException {
        return new IssuesApi(apiClient).getTransitions(issueIdOrKey, null, null, null, null, null);
    }

    @Tool(name = "create_issue", description = "Create an jira issue")
    public CreatedIssue createIssue(@ToolArg(description = "The project key of the issue.") String projectKeyOrId,
        @ToolArg(description = "The issue type name or ID of the issue.") String issueTypeNameOrId,
        @ToolArg(description = "The summary of the issue.") String summary,
        @ToolArg(required = false, description = "The assignee Id of the issue.") String assigneeId,
        @ToolArg(required = false, description = "The description of the issue.") String description,
        @ToolArg(required = false, description = "List of issue screen fields to update, specifying the sub-field to update and its value for each field. This field provides a straightforward option when setting a sub-field. ") Map<String, Object> fields,
        @ToolArg(required = false, description = "List of issue properties to update, specifying the sub-field to update and its value for each field. This field provides a straightforward option when setting a sub-field. ") Map<String, Object> properties
        ) throws ApiException {
        IssueUpdateDetails issueUpdateDetails = new IssueUpdateDetails();
        if (projectKeyOrId != null) {
            if (projectKeyOrId.matches("-?\\d+(\\.\\d+)?")) {
                issueUpdateDetails.putFieldsItem("project", new HashMap<String, Object>() {{
                    put("id", projectKeyOrId);
                }});
            } else {
                issueUpdateDetails.putFieldsItem("project", new HashMap<String, Object>() {{
                    put("key", projectKeyOrId);
                }});
            }
        }
        if (issueTypeNameOrId != null) {
            if (issueTypeNameOrId.matches("-?\\d+(\\.\\d+)?")) {
                issueUpdateDetails.putFieldsItem("issuetype", new HashMap<String, Object>() {{
                    put("id", issueTypeNameOrId);
                }});
            } else {
                issueUpdateDetails.putFieldsItem("issuetype", new HashMap<String, Object>() {{
                    put("name", issueTypeNameOrId);
                }});
            }
        }
        if (assigneeId != null) {
            issueUpdateDetails.putFieldsItem("assignee", new HashMap<String, Object>() {{
                put("id", assigneeId);
            }});
        }
        if (fields != null) {
            for (Map.Entry<String, Object> entry : fields.entrySet()) {
                issueUpdateDetails.putFieldsItem(entry.getKey(), entry.getValue());
            }
        }
        if (summary != null) {
            issueUpdateDetails.putFieldsItem("summary", summary);
        }
        if (description != null) {
            issueUpdateDetails.putFieldsItem("description", description);
        }
        populateProperties(properties, issueUpdateDetails);

        return new IssuesApi(apiClient).createIssue(issueUpdateDetails, null);  
    }

    private void populateProperties(@ToolArg(required = false, description = "List of issue properties to update, specifying the sub-field to update and its value for each field. This field provides a straightforward option when setting a sub-field. ") Map<String, Object> properties, IssueUpdateDetails issueUpdateDetails) {
        if (properties != null) {
            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                var property = new EntityProperty();
                property.setKey(entry.getKey());
                property.setValue(entry.getValue());
                issueUpdateDetails.addPropertiesItem(property);
            }
        }
    }

    @Tool(name = "update_issue", description = "Update an jira issue")
    public Object updateIssue(@ToolArg(description = "The ID or key of the issue.") String issueIdOrKey,
        @ToolArg(description = "The summary of the issue.") String summary,
        @ToolArg(required = false, description = "The description of the issue.") String description,
        @ToolArg(required = false, description = "List of issue screen fields to update, specifying the sub-field to update and its value for each field. This field provides a straightforward option when setting a sub-field. ") Map<String, Object> fields,
        @ToolArg(required = false, description = "List of issue properties to update, specifying the sub-field to update and its value for each field. This field provides a straightforward option when setting a sub-field. ") Map<String, Object> properties
        ) throws ApiException {
        IssueUpdateDetails issueUpdateDetails = new IssueUpdateDetails();
        if (summary != null) {
            issueUpdateDetails.putFieldsItem("summary", summary);
        }
        if (description != null) {
            issueUpdateDetails.putFieldsItem("description", description);
        }
        if (fields != null) {
            for (Map.Entry<String, Object> entry : fields.entrySet()) {
                issueUpdateDetails.putFieldsItem(entry.getKey(), entry.getValue());
            }
        }

        populateProperties(properties, issueUpdateDetails);
        return new IssuesApi(apiClient).editIssue(issueIdOrKey, issueUpdateDetails, null, null, null, null, null);
    }

    @Tool(name = "delete_issue", description = "Delete an jira issue")
    public String deleteIssue(@ToolArg(description = "The ID or key of the issue.") String issueIdOrKey) throws ApiException {
        new IssuesApi(apiClient).deleteIssue(issueIdOrKey, null);
        return "Issue deleted";
    }

    @Tool(name = "add_jira_comment", description = "Add a comment to an jira issue")
    public String addComment(@ToolArg(description = "The ID or key of the issue.") String issueIdOrKey,
        @ToolArg(description = "The comment to add.") String commentBody) throws ApiException {
        var comment = new Comment();
        comment.setBody(commentBody);
        new IssueCommentsApi(apiClient).addComment(issueIdOrKey, comment, null);
        return "Comment added";
    }

    @Tool(name = "transition_jira_issue", description = "Transition an jira issue")
    public String transitionIssue(@ToolArg(description = "The ID or key of the issue.") String issueIdOrKey,
        @ToolArg(description = "The transition Id to perform.") String transitionId,
        @ToolArg(required = false, description = "List of issue screen fields to update, specifying the sub-field to update and its value for each field. This field provides a straightforward option when setting a sub-field. ") Map<String, Object> fields) throws ApiException {
        var issueUpdateDetails = new IssueUpdateDetails();
        var transition = new IssueTransition();
        transition.setId(transitionId);
        issueUpdateDetails.setTransition(transition);
        if (fields != null) {
            for (Map.Entry<String, Object> entry : fields.entrySet()) {
                issueUpdateDetails.putFieldsItem(entry.getKey(), entry.getValue());
            }
        }
        return new IssuesApi(apiClient).doTransition(issueIdOrKey, issueUpdateDetails).toString();
    }
}
