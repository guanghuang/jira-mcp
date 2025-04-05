

# UpdatePrioritySchemeRequestBean

Details of a priority scheme.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**defaultPriorityId** | **Long** | The default priority of the scheme. |  [optional] |
|**description** | **String** | The description of the priority scheme. |  [optional] |
|**mappings** | [**PriorityMapping**](PriorityMapping.md) | Instructions to migrate the priorities of issues.  &#x60;in&#x60; mappings are used to migrate the priorities of issues to priorities used within the priority scheme.  &#x60;out&#x60; mappings are used to migrate the priorities of issues to priorities not used within the priority scheme.   *  When **priorities** are **added** to the priority scheme, no mapping needs to be provided as the new priorities are not used by any issues.  *  When **priorities** are **removed** from the priority scheme, issues that are using those priorities must be migrated to new priorities used by the priority scheme.           *  An &#x60;in&#x60; mapping must be provided for each of these priorities.  *  When **projects** are **added** to the priority scheme, the priorities of issues in those projects might need to be migrated to new priorities used by the priority scheme. This can occur when the current scheme does not use all the priorities in the project(s)&#39; priority scheme(s).           *  An &#x60;in&#x60; mapping must be provided for each of these priorities.  *  When **projects** are **removed** from the priority scheme, the priorities of issues in those projects might need to be migrated to new priorities within the **Default Priority Scheme** that are not used by the priority scheme. This can occur when the **Default Priority Scheme** does not use all the priorities within the current scheme.           *  An &#x60;out&#x60; mapping must be provided for each of these priorities.  For more information on &#x60;in&#x60; and &#x60;out&#x60; mappings, see the child properties documentation for the &#x60;PriorityMapping&#x60; object below. |  [optional] |
|**name** | **String** | The name of the priority scheme. Must be unique. |  [optional] |
|**priorities** | **UpdatePrioritiesInSchemeRequestBean** | The priorities in the scheme. |  [optional] |
|**projects** | **UpdateProjectsInSchemeRequestBean** | The projects in the scheme. |  [optional] |



