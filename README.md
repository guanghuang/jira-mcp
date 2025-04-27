# Jira MCP (Model Context Protocol)

## Overview

This Model Context Protocol (MCP) server enables Large Language Models (LLMs) to interact with Jira through a standardized API. It allows AI assistants to perform common Jira operations without requiring direct API integration, making it easier to build AI-powered tools that work with your Jira instance.

## Features

- **Jira Platform API Integration**: Comprehensive access to Jira Cloud Platform REST API
- **Jira Software API Integration**: Work with Jira Software features like boards, sprints, and epics
- **MCP Protocol Support**: Standardized interface for AI assistants and automation tools
- **Authentication**: Basic auth support using Atlassian PAT (Personal Access Token)

## Supported MCP tools

The MCP server supports the following Jira operations:

### Agile & Board Tools
- `get_all_agile_boards`: Retrieve all available agile boards
- `get_epics_from_board`: Get all epics associated with a specific board
- `get_issues_from_board`: Get all issues from a specified board
- `get_issues_from_epic`: Retrieve all issues associated with a specific epic
- `get_issues_from_sprint`: Get all issues from a specified sprint
- `get_sprints_from_board`: Retrieve all sprints associated with a board
- `move_issues_to_epic`: Move specified issues under an epic

### Issue Operations
- `add_jira_comment`: Add a comment to a Jira issue
- `create_issue`: Create a new Jira issue
- `delete_issue`: Delete an existing Jira issue
- `get_issue`: Retrieve details of a specific issue
- `get_issue_fields`: Get all available fields for issues
- `get_issue_transitions`: Get possible status transitions for an issue
- `search_issue_by_jql`: Search for issues using JQL (Jira Query Language)
- `transition_jira_issue`: Change the status of an issue
- `update_issue`: Update the details of an existing issue
- `add_jira_attachments`: add attachments to an existing issue

### User Operations
- `search_user`: Find Jira users based on search criteria
- `get_myself_info`: Get information about the authenticated user

## How to use this image

### MCP SSE
#### Simple usage
```bash
docker run -d --name jira-mcp \
  -p 8080:8080 \
  -e atlassian.url=https://your-company.atlassian.net \
  -e atlassian.username=your-jira-email \
  -e atlassian.pat=your-jira-pat \
  guang1/jira-mcp:latest
```

#### Using an Environment File

Create a configuration file (e.g., `atlassian.config`):
```
atlassian.url=https://your-company.atlassian.net
atlassian.username=your-jira-email
atlassian.pat=your-jira-pat
```

Then run:
```bash
docker run -d --name jira-mcp \
  -p 8080:8080 \
  --env-file atlassian.config \
  guang1/jira-mcp:latest
```
### Docker Compose for SSE

#### Basic Example

```yaml
services:
  jira:
    container_name: jira-mcp
    image: guang1/jira-mcp
    environment:
      - atlassian.url=https://your-company.atlassian.net
      - atlassian.username=your-jira-email
      - atlassian.pat=your-jira-pat
    ports:
      - "8080:8080"
    restart: always
```

#### With Environment File

```yaml
services:
  jira:
    container_name: jira-mcp
    image: guang1/jira-mcp
    env_file:
      - jira.config
    ports:
      - "8080:8080"
    restart: always
```

#### MCP SSE URL
```http://localhost:8080/mcp/sse```


### MCP STDIO
**Must** pass `quarkus.mcp.server.stdio.enabled=true`, `quarkus.log.console.enable=false` and `quarkus.log.console.stderr=false` environment variables with `-i` interactive option.
#### Simple usage
```
docker run --rm \
  -e atlassian.url=https://your-company.atlassian.net \
  -e atlassian.username=your-jira-email \
  -e atlassian.pat=your-jira-pat \
  -e quarkus.mcp.server.stdio.enabled=true \
  -e quarkus.log.console.enable=false \
  -e quarkus.log.console.stderr=false \
  -i guang1/jira-mcp:latest
``` 

#### Using an Environment File
```
docker run --rm --env-file=atlassian.config \
   -e quarkus.mcp.server.stdio.enabled=true \
   -e quarkus.log.console.enable=false \
   -e quarkus.log.console.stderr=false \
   -i guang1/jira-mcp:latest
```

### Claude Desktop Configuration (STDIO)
To use the Docker version with Claude Desktop, add this to your `claude_desktop_config.json` or `server_config.json` file:
#### Simple usage
```
{
  "mcpServers": {
    "jira": {
      "command": "docker",
      "args": [
        "run",
        "--rm",
        "-e",
        "atlassian.url=https://your-company.atlassian.net",
        "-e",
        "atlassian.username=your-jira-email",
        "-e",
        "atlassian.pat=your-jira-pat",       
        "-e",
        "quarkus.log.console.enable=false",
        "-e",
        "quarkus.log.console.stderr=false",
        "-i",
        "guang1/jira-mcp:latest"
      ]
    }
  }
}
```

#### Using an Environment File
```
{
  "mcpServers": {
    "jira": {
      "command": "docker",
      "args": [
        "run",
        "--rm",
        "--env-file=atlassian.conf",
        "-e",
        "quarkus.mcp.server.stdio.enabled=true",
        "-e",
        "quarkus.log.console.enable=false",
        "-e",
        "quarkus.log.console.stderr=false",
        "-i",
        "guang1/jira-mcp:latest"
      ]
    }
  }
}
```

## Configuration

### Environment Variables

| Variable | Description | Required |
|----------|-------------|----------|
| `atlassian.url` | atlassian instance URL (e.g., https://your-company.atlassian.net) | Yes |
| `atlassian.username` | atlassian account email address | Yes |
| `atlassian.pat` | atlassian Personal Access Token (API Token) | Yes |

### Creating a Jira API Token

To generate a Personal Access Token for Jira:
1. Go to [https://id.atlassian.com/manage-profile/security/api-tokens](https://id.atlassian.com/manage-profile/security/api-tokens)
2. Click "Create API token"
3. Give your token a name (e.g., "MCP Server")
4. Copy the generated token for use with this MCP server

## Security Considerations

⚠️ **Warning**: This MCP server requires authentication credentials with access to your Jira instance. Consider the following security practices:

- Create a dedicated Jira service account with appropriate permissions
- Regularly rotate your API token
- Run the container in a secure, isolated environment
- Use network security rules to restrict access to the MCP server
- Be cautious about which operations you allow LLMs to perform

## Example Use Cases

## Example Use Cases

- **Set a Default Ticket Prefix**  
  Define a default ticket prefix in your rules (e.g., `MyProj-`). This allows you to reference tickets in chat by number only (e.g., `1234` instead of `MyProj-1234`).

- **Configure Personal Jira Account ID**  
  Specify your Jira account ID in the rules to avoid repeated API calls (such as `get_myself_info`) for every operation.

- **Customize Jira Fields**  
  Set custom fields (e.g., story points, developer, etc.) in your rules to prevent the AI from calling `get_issue_fields` each time.

- **Automate Issue Management**  
  Create and update Jira issues automatically based on natural language requests.

- **Generate Reports and Summaries**  
  Produce Jira reports and summaries on demand.

- **Sprint Planning and Epic Management**  
  Assist with sprint planning and epic management tasks.

- **Conversational Jira Interaction**  
  Enable team members to interact with Jira using natural, conversational language.

## Troubleshooting

If you encounter issues:
- Verify your API token has the required permissions
- Check that your atlassian URL is correct and accessible
- Ensure your atlassian username (email) is correct
- Check container logs for detailed error information

## License

This project is licensed under the MIT License - see the LICENSE file for details.
