

# GoogleCloudAiplatformV1BatchPredictionJobOutputConfig

Configures the output of BatchPredictionJob. See Model.supported_output_storage_formats for supported output formats, and how predictions are expressed via any of them.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bigqueryDestination** | [**GoogleCloudAiplatformV1BigQueryDestination**](GoogleCloudAiplatformV1BigQueryDestination.md) | The BigQuery project or dataset location where the output is to be written to. If project is provided, a new dataset is created with name &#x60;prediction__&#x60; where is made BigQuery-dataset-name compatible (for example, most special characters become underscores), and timestamp is in YYYY_MM_DDThh_mm_ss_sssZ \&quot;based on ISO-8601\&quot; format. In the dataset two tables will be created, &#x60;predictions&#x60;, and &#x60;errors&#x60;. If the Model has both instance and prediction schemata defined then the tables have columns as follows: The &#x60;predictions&#x60; table contains instances for which the prediction succeeded, it has columns as per a concatenation of the Model&#39;s instance and prediction schemata. The &#x60;errors&#x60; table contains rows for which the prediction has failed, it has instance columns, as per the instance schema, followed by a single \&quot;errors\&quot; column, which as values has google.rpc.Status represented as a STRUCT, and containing only &#x60;code&#x60; and &#x60;message&#x60;. |  [optional] |
|**predictionsFormat** | **String** | Required. The format in which Vertex AI gives the predictions, must be one of the Model&#39;s supported_output_storage_formats. |  [optional] |
|**gcsDestination** | [**GoogleCloudAiplatformV1GcsDestination**](GoogleCloudAiplatformV1GcsDestination.md) | The Cloud Storage location of the directory where the output is to be written to. In the given directory a new directory is created. Its name is &#x60;prediction--&#x60;, where timestamp is in YYYY-MM-DDThh:mm:ss.sssZ ISO-8601 format. Inside of it files &#x60;predictions_0001.&#x60;, &#x60;predictions_0002.&#x60;, ..., &#x60;predictions_N.&#x60; are created where &#x60;&#x60; depends on chosen predictions_format, and N may equal 0001 and depends on the total number of successfully predicted instances. If the Model has both instance and prediction schemata defined then each such file contains predictions as per the predictions_format. If prediction for any instance failed (partially or completely), then an additional &#x60;errors_0001.&#x60;, &#x60;errors_0002.&#x60;,..., &#x60;errors_N.&#x60; files are created (N depends on total number of failed predictions). These files contain the failed instances, as per their schema, followed by an additional &#x60;error&#x60; field which as value has google.rpc.Status containing only &#x60;code&#x60; and &#x60;message&#x60; fields. |  [optional] |



