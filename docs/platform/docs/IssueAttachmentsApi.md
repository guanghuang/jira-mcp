# IssueAttachmentsApi

All URIs are relative to *https://your-domain.atlassian.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addAttachment**](IssueAttachmentsApi.md#addAttachment) | **POST** /rest/api/3/issue/{issueIdOrKey}/attachments | Add attachment |
| [**expandAttachmentForHumans**](IssueAttachmentsApi.md#expandAttachmentForHumans) | **GET** /rest/api/3/attachment/{id}/expand/human | Get all metadata for an expanded attachment |
| [**expandAttachmentForMachines**](IssueAttachmentsApi.md#expandAttachmentForMachines) | **GET** /rest/api/3/attachment/{id}/expand/raw | Get contents metadata for an expanded attachment |
| [**getAttachment**](IssueAttachmentsApi.md#getAttachment) | **GET** /rest/api/3/attachment/{id} | Get attachment metadata |
| [**getAttachmentContent**](IssueAttachmentsApi.md#getAttachmentContent) | **GET** /rest/api/3/attachment/content/{id} | Get attachment content |
| [**getAttachmentMeta**](IssueAttachmentsApi.md#getAttachmentMeta) | **GET** /rest/api/3/attachment/meta | Get Jira attachment settings |
| [**getAttachmentThumbnail**](IssueAttachmentsApi.md#getAttachmentThumbnail) | **GET** /rest/api/3/attachment/thumbnail/{id} | Get attachment thumbnail |
| [**removeAttachment**](IssueAttachmentsApi.md#removeAttachment) | **DELETE** /rest/api/3/attachment/{id} | Delete attachment |


<a id="addAttachment"></a>
# **addAttachment**
> List&lt;Attachment&gt; addAttachment(issueIdOrKey)

Add attachment

Adds one or more attachments to an issue. Attachments are posted as multipart/form-data ([RFC 1867](https://www.ietf.org/rfc/rfc1867.txt)).  Note that:   *  The request must have a &#x60;X-Atlassian-Token: no-check&#x60; header, if not it is blocked. See [Special headers](#special-request-headers) for more information.  *  The name of the multipart/form-data parameter that contains the attachments must be &#x60;file&#x60;.  The following examples upload a file called *myfile.txt* to the issue *TEST-123*:  #### curl ####      curl --location --request POST &#39;https://your-domain.atlassian.net/rest/api/3/issue/TEST-123/attachments&#39;      -u &#39;email@example.com:&lt;api_token&gt;&#39;      -H &#39;X-Atlassian-Token: no-check&#39;      --form &#39;file&#x3D;@\&quot;myfile.txt\&quot;&#39;  #### Node.js ####      // This code sample uses the &#39;node-fetch&#39; and &#39;form-data&#39; libraries:      // https://www.npmjs.com/package/node-fetch      // https://www.npmjs.com/package/form-data      const fetch &#x3D; require(&#39;node-fetch&#39;);      const FormData &#x3D; require(&#39;form-data&#39;);      const fs &#x3D; require(&#39;fs&#39;);           const filePath &#x3D; &#39;myfile.txt&#39;;      const form &#x3D; new FormData();      const stats &#x3D; fs.statSync(filePath);      const fileSizeInBytes &#x3D; stats.size;      const fileStream &#x3D; fs.createReadStream(filePath);           form.append(&#39;file&#39;, fileStream, {knownLength: fileSizeInBytes});           fetch(&#39;https://your-domain.atlassian.net/rest/api/3/issue/TEST-123/attachments&#39;, {          method: &#39;POST&#39;,          body: form,          headers: {              &#39;Authorization&#39;: &#x60;Basic ${Buffer.from(                  &#39;email@example.com:&#39;              ).toString(&#39;base64&#39;)}&#x60;,              &#39;Accept&#39;: &#39;application/json&#39;,              &#39;X-Atlassian-Token&#39;: &#39;no-check&#39;          }      })          .then(response &#x3D;&gt; {              console.log(                  &#x60;Response: ${response.status} ${response.statusText}&#x60;              );              return response.text();          })          .then(text &#x3D;&gt; console.log(text))          .catch(err &#x3D;&gt; console.error(err));  #### Java ####      // This code sample uses the  &#39;Unirest&#39; library:      // http://unirest.io/java.html      HttpResponse response &#x3D; Unirest.post(\&quot;https://your-domain.atlassian.net/rest/api/2/issue/{issueIdOrKey}/attachments\&quot;)              .basicAuth(\&quot;email@example.com\&quot;, \&quot;\&quot;)              .header(\&quot;Accept\&quot;, \&quot;application/json\&quot;)              .header(\&quot;X-Atlassian-Token\&quot;, \&quot;no-check\&quot;)              .field(\&quot;file\&quot;, new File(\&quot;myfile.txt\&quot;))              .asJson();                   System.out.println(response.getBody());  #### Python ####      # This code sample uses the &#39;requests&#39; library:      # http://docs.python-requests.org      import requests      from requests.auth import HTTPBasicAuth      import json           url &#x3D; \&quot;https://your-domain.atlassian.net/rest/api/2/issue/{issueIdOrKey}/attachments\&quot;           auth &#x3D; HTTPBasicAuth(\&quot;email@example.com\&quot;, \&quot;\&quot;)           headers &#x3D; {         \&quot;Accept\&quot;: \&quot;application/json\&quot;,         \&quot;X-Atlassian-Token\&quot;: \&quot;no-check\&quot;      }           response &#x3D; requests.request(         \&quot;POST\&quot;,         url,         headers &#x3D; headers,         auth &#x3D; auth,         files &#x3D; {              \&quot;file\&quot;: (\&quot;myfile.txt\&quot;, open(\&quot;myfile.txt\&quot;,\&quot;rb\&quot;), \&quot;application-type\&quot;)         }      )           print(json.dumps(json.loads(response.text), sort_keys&#x3D;True, indent&#x3D;4, separators&#x3D;(\&quot;,\&quot;, \&quot;: \&quot;)))  #### PHP ####      // This code sample uses the &#39;Unirest&#39; library:      // http://unirest.io/php.html      Unirest\\Request::auth(&#39;email@example.com&#39;, &#39;&#39;);           $headers &#x3D; array(        &#39;Accept&#39; &#x3D;&gt; &#39;application/json&#39;,        &#39;X-Atlassian-Token&#39; &#x3D;&gt; &#39;no-check&#39;      );           $parameters &#x3D; array(        &#39;file&#39; &#x3D;&gt; File::add(&#39;myfile.txt&#39;)      );           $response &#x3D; Unirest\\Request::post(        &#39;https://your-domain.atlassian.net/rest/api/2/issue/{issueIdOrKey}/attachments&#39;,        $headers,        $parameters      );           var_dump($response)  #### Forge ####      // This sample uses Atlassian Forge and the &#x60;form-data&#x60; library.      // https://developer.atlassian.com/platform/forge/      // https://www.npmjs.com/package/form-data      import api from \&quot;@forge/api\&quot;;      import FormData from \&quot;form-data\&quot;;           const form &#x3D; new FormData();      form.append(&#39;file&#39;, fileStream, {knownLength: fileSizeInBytes});           const response &#x3D; await api.asApp().requestJira(&#39;/rest/api/2/issue/{issueIdOrKey}/attachments&#39;, {          method: &#39;POST&#39;,          body: form,          headers: {              &#39;Accept&#39;: &#39;application/json&#39;,              &#39;X-Atlassian-Token&#39;: &#39;no-check&#39;          }      });           console.log(&#x60;Response: ${response.status} ${response.statusText}&#x60;);      console.log(await response.json());  Tip: Use a client library. Many client libraries have classes for handling multipart POST operations. For example, in Java, the Apache HTTP Components library provides a [MultiPartEntity](http://hc.apache.org/httpcomponents-client-ga/httpmime/apidocs/org/apache/http/entity/mime/MultipartEntity.html) class for multipart POST operations.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**    *  *Browse Projects* and *Create attachments* [ project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.IssueAttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    IssueAttachmentsApi apiInstance = new IssueAttachmentsApi(defaultClient);
    String issueIdOrKey = "issueIdOrKey_example"; // String | The ID or key of the issue that attachments are added to.
    try {
      List<Attachment> result = apiInstance.addAttachment(issueIdOrKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueAttachmentsApi#addAttachment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **issueIdOrKey** | **String**| The ID or key of the issue that attachments are added to. | |

### Return type

[**List&lt;Attachment&gt;**](Attachment.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |
| **404** | Returned if any of the following is true:   *  the issue is not found.  *  the user does not have permission to view the issue. |  -  |
| **413** | Returned if any of the following is true:   *  the attachments exceed the maximum attachment size for issues.  *  more than 60 files are requested to be uploaded.  *  the per-issue limit for attachments has been breached.  See [Configuring file attachments](https://confluence.atlassian.com/x/wIXKM) for details. |  -  |

<a id="expandAttachmentForHumans"></a>
# **expandAttachmentForHumans**
> AttachmentArchiveMetadataReadable expandAttachmentForHumans(id)

Get all metadata for an expanded attachment

Returns the metadata for the contents of an attachment, if it is an archive, and metadata for the attachment itself. For example, if the attachment is a ZIP archive, then information about the files in the archive is returned and metadata for the ZIP archive. Currently, only the ZIP archive format is supported.  Use this operation to retrieve data that is presented to the user, as this operation returns the metadata for the attachment itself, such as the attachment&#39;s ID and name. Otherwise, use [ Get contents metadata for an expanded attachment](#api-rest-api-3-attachment-id-expand-raw-get), which only returns the metadata for the attachment&#39;s contents.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** For the issue containing the attachment:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If attachments are added in private comments, the comment-level restriction will be applied.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.IssueAttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    IssueAttachmentsApi apiInstance = new IssueAttachmentsApi(defaultClient);
    String id = "id_example"; // String | The ID of the attachment.
    try {
      AttachmentArchiveMetadataReadable result = apiInstance.expandAttachmentForHumans(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueAttachmentsApi#expandAttachmentForHumans");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the attachment. | |

### Return type

[**AttachmentArchiveMetadataReadable**](AttachmentArchiveMetadataReadable.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. If an empty list is returned in the response, the attachment is empty, corrupt, or not an archive. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | The user does not have the necessary permission. |  -  |
| **404** | Returned if:   *  the attachment is not found.  *  attachments are disabled in the Jira settings. |  -  |
| **409** | Returned if the attachment is an archive, but not a supported archive format. |  -  |

<a id="expandAttachmentForMachines"></a>
# **expandAttachmentForMachines**
> AttachmentArchiveImpl expandAttachmentForMachines(id)

Get contents metadata for an expanded attachment

Returns the metadata for the contents of an attachment, if it is an archive. For example, if the attachment is a ZIP archive, then information about the files in the archive is returned. Currently, only the ZIP archive format is supported.  Use this operation if you are processing the data without presenting it to the user, as this operation only returns the metadata for the contents of the attachment. Otherwise, to retrieve data to present to the user, use [ Get all metadata for an expanded attachment](#api-rest-api-3-attachment-id-expand-human-get) which also returns the metadata for the attachment itself, such as the attachment&#39;s ID and name.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** For the issue containing the attachment:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If attachments are added in private comments, the comment-level restriction will be applied.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.IssueAttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    IssueAttachmentsApi apiInstance = new IssueAttachmentsApi(defaultClient);
    String id = "id_example"; // String | The ID of the attachment.
    try {
      AttachmentArchiveImpl result = apiInstance.expandAttachmentForMachines(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueAttachmentsApi#expandAttachmentForMachines");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the attachment. | |

### Return type

[**AttachmentArchiveImpl**](AttachmentArchiveImpl.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. If an empty list is returned in the response, the attachment is empty, corrupt, or not an archive. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | The user does not have the necessary permission. |  -  |
| **404** | Returned if:   *  the attachment is not found.  *  attachments are disabled in the Jira settings. |  -  |
| **409** | Returned if the attachment is an archive, but not a supported archive format. |  -  |

<a id="getAttachment"></a>
# **getAttachment**
> AttachmentMetadata getAttachment(id)

Get attachment metadata

Returns the metadata for an attachment. Note that the attachment itself is not returned.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If attachments are added in private comments, the comment-level restriction will be applied.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.IssueAttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    IssueAttachmentsApi apiInstance = new IssueAttachmentsApi(defaultClient);
    String id = "id_example"; // String | The ID of the attachment.
    try {
      AttachmentMetadata result = apiInstance.getAttachment(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueAttachmentsApi#getAttachment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the attachment. | |

### Return type

[**AttachmentMetadata**](AttachmentMetadata.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |
| **404** | Returned if:   *  the attachment is not found.  *  attachments are disabled in the Jira settings. |  -  |

<a id="getAttachmentContent"></a>
# **getAttachmentContent**
> List&lt;Object&gt; getAttachmentContent(id, redirect)

Get attachment content

Returns the contents of an attachment. A &#x60;Range&#x60; header can be set to define a range of bytes within the attachment to download. See the [HTTP Range header standard](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Range) for details.  To return a thumbnail of the attachment, use [Get attachment thumbnail](#api-rest-api-3-attachment-thumbnail-id-get).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** For the issue containing the attachment:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If attachments are added in private comments, the comment-level restriction will be applied.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.IssueAttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    IssueAttachmentsApi apiInstance = new IssueAttachmentsApi(defaultClient);
    String id = "id_example"; // String | The ID of the attachment.
    Boolean redirect = true; // Boolean | Whether a redirect is provided for the attachment download. Clients that do not automatically follow redirects can set this to `false` to avoid making multiple requests to download the attachment.
    try {
      List<Object> result = apiInstance.getAttachmentContent(id, redirect);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueAttachmentsApi#getAttachmentContent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the attachment. | |
| **redirect** | **Boolean**| Whether a redirect is provided for the attachment download. Clients that do not automatically follow redirects can set this to &#x60;false&#x60; to avoid making multiple requests to download the attachment. | [optional] [default to true] |

### Return type

**List&lt;Object&gt;**

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful when &#x60;redirect&#x60; is set to &#x60;false&#x60;. |  -  |
| **206** | Returned if the request is successful when a &#x60;Range&#x60; header is provided and &#x60;redirect&#x60; is set to &#x60;false&#x60;. |  -  |
| **303** | Returned if the request is successful. See the &#x60;Location&#x60; header for the download URL. |  -  |
| **400** | Returned if the range supplied in the &#x60;Range&#x60; header is malformed. |  -  |
| **401** | Returned if the authentication credentials are incorrect. |  -  |
| **403** | The user does not have the necessary permission. |  -  |
| **404** | Returned if:   *  the attachment is not found.  *  attachments are disabled in the Jira settings. |  -  |
| **416** | Returned if the server is unable to satisfy the range of bytes provided. |  -  |

<a id="getAttachmentMeta"></a>
# **getAttachmentMeta**
> AttachmentSettings getAttachmentMeta()

Get Jira attachment settings

Returns the attachment settings, that is, whether attachments are enabled and the maximum attachment size allowed.  Note that there are also [project permissions](https://confluence.atlassian.com/x/yodKLg) that restrict whether users can create and delete attachments.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.IssueAttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    IssueAttachmentsApi apiInstance = new IssueAttachmentsApi(defaultClient);
    try {
      AttachmentSettings result = apiInstance.getAttachmentMeta();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueAttachmentsApi#getAttachmentMeta");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AttachmentSettings**](AttachmentSettings.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |

<a id="getAttachmentThumbnail"></a>
# **getAttachmentThumbnail**
> List&lt;Object&gt; getAttachmentThumbnail(id, redirect, fallbackToDefault, width, height)

Get attachment thumbnail

Returns the thumbnail of an attachment.  To return the attachment contents, use [Get attachment content](#api-rest-api-3-attachment-content-id-get).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** For the issue containing the attachment:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If attachments are added in private comments, the comment-level restriction will be applied.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.IssueAttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    IssueAttachmentsApi apiInstance = new IssueAttachmentsApi(defaultClient);
    String id = "id_example"; // String | The ID of the attachment.
    Boolean redirect = true; // Boolean | Whether a redirect is provided for the attachment download. Clients that do not automatically follow redirects can set this to `false` to avoid making multiple requests to download the attachment.
    Boolean fallbackToDefault = true; // Boolean | Whether a default thumbnail is returned when the requested thumbnail is not found.
    Integer width = 56; // Integer | The maximum width to scale the thumbnail to.
    Integer height = 56; // Integer | The maximum height to scale the thumbnail to.
    try {
      List<Object> result = apiInstance.getAttachmentThumbnail(id, redirect, fallbackToDefault, width, height);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueAttachmentsApi#getAttachmentThumbnail");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the attachment. | |
| **redirect** | **Boolean**| Whether a redirect is provided for the attachment download. Clients that do not automatically follow redirects can set this to &#x60;false&#x60; to avoid making multiple requests to download the attachment. | [optional] [default to true] |
| **fallbackToDefault** | **Boolean**| Whether a default thumbnail is returned when the requested thumbnail is not found. | [optional] [default to true] |
| **width** | **Integer**| The maximum width to scale the thumbnail to. | [optional] |
| **height** | **Integer**| The maximum height to scale the thumbnail to. | [optional] |

### Return type

**List&lt;Object&gt;**

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful when &#x60;redirect&#x60; is set to &#x60;false&#x60;. |  -  |
| **303** | Returned if the request is successful. See the &#x60;Location&#x60; header for the download URL. |  -  |
| **400** | Returned if the request is invalid. |  -  |
| **401** | Returned if the authentication credentials are incorrect. |  -  |
| **403** | The user does not have the necessary permission. |  -  |
| **404** | Returned if:   *  the attachment is not found.  *  attachments are disabled in the Jira settings.  *  &#x60;fallbackToDefault&#x60; is &#x60;false&#x60; and the request thumbnail cannot be downloaded. |  -  |

<a id="removeAttachment"></a>
# **removeAttachment**
> removeAttachment(id)

Delete attachment

Deletes an attachment from an issue.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** For the project holding the issue containing the attachment:   *  *Delete own attachments* [project permission](https://confluence.atlassian.com/x/yodKLg) to delete an attachment created by the calling user.  *  *Delete all attachments* [project permission](https://confluence.atlassian.com/x/yodKLg) to delete an attachment created by any user.

### Example
```java
// Import classes:
import com.atlassian.jira.invoker.ApiClient;
import com.atlassian.jira.invoker.ApiException;
import com.atlassian.jira.invoker.Configuration;
import com.atlassian.jira.invoker.auth.*;
import com.atlassian.jira.invoker.models.*;
import com.atlassian.jira.platform.api.IssueAttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://your-domain.atlassian.net");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    IssueAttachmentsApi apiInstance = new IssueAttachmentsApi(defaultClient);
    String id = "id_example"; // String | The ID of the attachment.
    try {
      apiInstance.removeAttachment(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssueAttachmentsApi#removeAttachment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the attachment. | |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returned if the request is successful. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |
| **404** | Returned if:   *  the attachment is not found.  *  attachments are disabled in the Jira settings. |  -  |

