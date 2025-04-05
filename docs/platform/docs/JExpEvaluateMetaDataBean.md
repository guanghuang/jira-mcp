

# JExpEvaluateMetaDataBean

Contains information about the expression evaluation. This bean will be replacing `JiraExpressionEvaluationMetaDataBean` bean as part of new `evaluate` endpoint

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**complexity** | [**JiraExpressionsComplexityBean**](JiraExpressionsComplexityBean.md) | Contains information about the expression complexity. For example, the number of steps it took to evaluate the expression. |  [optional] |
|**issues** | [**JExpEvaluateIssuesMetaBean**](JExpEvaluateIssuesMetaBean.md) | Contains information about the &#x60;issues&#x60; variable in the context. For example, is the issues were loaded with JQL, information about the page will be included here. |  [optional] |



