

# GoogleCloudAiplatformV1SuggestTrialsRequest

Request message for VizierService.SuggestTrials.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientId** | **String** | Required. The identifier of the client that is requesting the suggestion. If multiple SuggestTrialsRequests have the same &#x60;client_id&#x60;, the service will return the identical suggested Trial if the Trial is pending, and provide a new Trial if the last suggested Trial was completed. |  [optional] |
|**suggestionCount** | **Integer** | Required. The number of suggestions requested. It must be positive. |  [optional] |
|**contexts** | [**List&lt;GoogleCloudAiplatformV1TrialContext&gt;**](GoogleCloudAiplatformV1TrialContext.md) | Optional. This allows you to specify the \&quot;context\&quot; for a Trial; a context is a slice (a subspace) of the search space. Typical uses for contexts: 1) You are using Vizier to tune a server for best performance, but there&#39;s a strong weekly cycle. The context specifies the day-of-week. This allows Tuesday to generalize from Wednesday without assuming that everything is identical. 2) Imagine you&#39;re optimizing some medical treatment for people. As they walk in the door, you know certain facts about them (e.g. sex, weight, height, blood-pressure). Put that information in the context, and Vizier will adapt its suggestions to the patient. 3) You want to do a fair A/B test efficiently. Specify the \&quot;A\&quot; and \&quot;B\&quot; conditions as contexts, and Vizier will generalize between \&quot;A\&quot; and \&quot;B\&quot; conditions. If they are similar, this will allow Vizier to converge to the optimum faster than if \&quot;A\&quot; and \&quot;B\&quot; were separate Studies. NOTE: You can also enter contexts as REQUESTED Trials, e.g. via the CreateTrial() RPC; that&#39;s the asynchronous option where you don&#39;t need a close association between contexts and suggestions. NOTE: All the Parameters you set in a context MUST be defined in the Study. NOTE: You must supply 0 or $suggestion_count contexts. If you don&#39;t supply any contexts, Vizier will make suggestions from the full search space specified in the StudySpec; if you supply a full set of context, each suggestion will match the corresponding context. NOTE: A Context with no features set matches anything, and allows suggestions from the full search space. NOTE: Contexts MUST lie within the search space specified in the StudySpec. It&#39;s an error if they don&#39;t. NOTE: Contexts preferentially match ACTIVE then REQUESTED trials before new suggestions are generated. NOTE: Generation of suggestions involves a match between a Context and (optionally) a REQUESTED trial; if that match is not fully specified, a suggestion will be geneated in the merged subspace. |  [optional] |



