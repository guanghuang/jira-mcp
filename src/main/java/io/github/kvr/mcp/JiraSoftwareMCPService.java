package io.github.kvr.mcp;

import java.util.ArrayList;
import java.util.List;

import javax.naming.directory.SearchResult;

import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.software.api.BoardApi;
import com.atlassian.jira.software.api.EpicApi;
import com.atlassian.jira.software.model.GetAllBoards200Response;
import com.atlassian.jira.software.model.GetAllSprints200Response;
import com.atlassian.jira.software.model.GetEpics200Response;
import com.atlassian.jira.software.model.MoveIssuesToBacklogRequest;
import com.atlassian.jira.software.model.SearchResults;

import io.quarkiverse.mcp.server.Tool;
import io.quarkiverse.mcp.server.ToolArg;
import jakarta.inject.Inject;

public class JiraSoftwareMCPService {
    private final ApiClient apiClient;

    @Inject
    public JiraSoftwareMCPService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    @Tool(name = "get_all_agile_boards", description = "Get all jira boards")
    public GetAllBoards200Response getAllBoards(@ToolArg(required = false, description = "Filters results to boards that match or partially match the specified name.") String name,
        @ToolArg(required = false, description = "Filters results to boards of the specified types. Valid values: scrum, kanban, simple") String type,
        @ToolArg(required = false, description = "Filters results to boards that are relevant to a project.") String projectKeyOrId,
        @ToolArg(required = false, description = "The maximum number of boards to return. Default is 50.") Integer maxResults,
        @ToolArg(required = false, description = "The starting index of the returned boards. Base index: 0. Default is 0.") Long startAt) throws ApiException {
        return new BoardApi(apiClient).getAllBoards(startAt, maxResults, type, name, projectKeyOrId, null, null, null, null, null, null, null, null);
    }

    @Tool(name = "get_issues_from_board", description = "Get issues from a board")
    public SearchResults getIssuesFromBoard(@ToolArg(description = "The ID of the jira board.") Long boardId,
        @ToolArg(required = false, description = "Filters results using a JQL query. If you define an order in your JQL query, it will override the default order of the returned issues. Note that username and userkey can't be used as search terms for this parameter due to privacy reasons. Use accountId instead.") String jql,
        @ToolArg(required = false, description = "A list of fields to return for each issue. This parameter accepts a comma-separated list. Allowed values: *all, *navigable, summary, comment, renderedFields, names, schema, transitions, editmeta, changelog, versionedRepresentations") List<String> fields,
        @ToolArg(required = false, description = "The maximum number of issues to return. Default is 50.") Integer maxResults,
        @ToolArg(required = false, description = "The starting index of the returned issues. Base index: 0. Default is 0.") Long startAt) throws ApiException {
        return new BoardApi(apiClient).getIssuesForBoard(boardId, startAt, maxResults, jql, null, getFieldsList(fields), null);
    }

    /**
     * convert fields list of strings to list of objects
     */
    private List<Object> getFieldsList(List<String> fields) {
        List<Object> fieldsList = null;
        if (fields != null) {
            fieldsList = new ArrayList<>(fields);
        }
        return fieldsList;
    }

    @Tool(name = "get_sprints_from_board", description = "Get sprints from a board")
    public GetAllSprints200Response getSprintsFromBoard(@ToolArg(description = "The ID of the jira board.") Long boardId,
        @ToolArg(required = false, description = "Filters results to sprints in specified states. Valid values: future, active, closed. You can define multiple states separated by commas, e.g. state=active,closed") String state,
        @ToolArg(required = false, description = "The maximum number of sprints to return. Default is 50.") Integer maxResults,
        @ToolArg(required = false, description = "The starting index of the returned sprints. Base index: 0. Default is 0.") Long startAt) throws ApiException {
        return new BoardApi(apiClient).getAllSprints(boardId, startAt, maxResults, state);
    }
    
    @Tool(name = "get_epics_from_board", description = "Get epics from a board")
    public GetEpics200Response getEpicsFromBoard(@ToolArg(description = "The ID of the jira board.") Long boardId,
        @ToolArg(required = false, description = "The maximum number of sprints to return. Default is 50.") Integer maxResults,
        @ToolArg(required = false, description = "The starting index of the returned sprints. Base index: 0. Default is 0.") Long startAt) throws ApiException {
        return new BoardApi(apiClient).getEpics(boardId, startAt, maxResults, null);
    }

    @Tool(name = "get_issues_from_sprint", description = "Get issues from a sprint")
    public SearchResults getIssuesFromSprint(@ToolArg(description = "The ID of the jira board.") Long boardId,
        @ToolArg(description = "The ID of the jira sprint.") Long sprintId,
        @ToolArg(required = false, description = "Filters results using a JQL query. If you define an order in your JQL query, it will override the default order of the returned issues. Note that username and userkey can't be used as search terms for this parameter due to privacy reasons. Use accountId instead.") String jql,
        @ToolArg(required = false, description = "A list of fields to return for each issue. This parameter accepts a comma-separated list. Allowed values: *all, *navigable, summary, comment, renderedFields, names, schema, transitions, editmeta, changelog, versionedRepresentations") List<String> fields,        
        @ToolArg(required = false, description = "The maximum number of issues to return. Default is 50.") Integer maxResults,
        @ToolArg(required = false, description = "The starting index of the returned issues. Base index: 0. Default is 0.") Long startAt) throws ApiException {
        return new BoardApi(apiClient).getBoardIssuesForSprint(boardId, sprintId, startAt, maxResults, jql, null, getFieldsList(fields), null);
    }

    @Tool(name = "get_issues_from_epic", description = "Get issues from an epic")
    public SearchResults getIssuesFromEpic(@ToolArg(description = "The ID of the jira board.") Long boardId,
        @ToolArg(description = "The ID of the jira epic.") Long epicId,
        @ToolArg(required = false, description = "Filters results using a JQL query. If you define an order in your JQL query, it will override the default order of the returned issues. Note that username and userkey can't be used as search terms for this parameter due to privacy reasons. Use accountId instead.") String jql,
        @ToolArg(required = false, description = "A list of fields to return for each issue. This parameter accepts a comma-separated list. Allowed values: *all, *navigable, summary, comment, renderedFields, names, schema, transitions, editmeta, changelog, versionedRepresentations") List<String> fields,
        @ToolArg(required = false, description = "The maximum number of issues to return. Default is 50.") Integer maxResults,
        @ToolArg(required = false, description = "The starting index of the returned issues. Base index: 0. Default is 0.") Long startAt) throws ApiException {
        return new BoardApi(apiClient).getBoardIssuesForEpic(boardId, epicId, startAt, maxResults, jql, null, getFieldsList(fields), null);
    }

    @Tool(name = "move_issues_to_epic", description = "Move the selected issues to an epic")
    public String moveIssuesToEpic(@ToolArg(description = "The ID or key of the jira epic.") String epicIdOrKey,
        @ToolArg(description = "The IDs or keys of the issues to move.") List<String> issueIdOrKeys) throws ApiException {
        var moveIssuesToBacklogRequest = new MoveIssuesToBacklogRequest();
        for (String issueIdOrKey : issueIdOrKeys) {
            moveIssuesToBacklogRequest.addIssuesItem(issueIdOrKey);
        }
        new EpicApi(apiClient).moveIssuesToEpic(epicIdOrKey, moveIssuesToBacklogRequest);
        return "Issues moved to epic";
    }

}
