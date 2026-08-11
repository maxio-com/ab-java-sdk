
# Batch Job Response

## Structure

`BatchJobResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Batchjob` | [`BatchJob`](../../doc/models/batch-job.md) | Required | - | BatchJob getBatchjob() | setBatchjob(BatchJob batchjob) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.BatchJob;
import com.maxio.advancedbilling.models.BatchJobResponse;

BatchJobResponse batchJobResponse = new BatchJobResponse.Builder(
    new BatchJob.Builder()
        .id(54)
        .finishedAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
        .rowCount(62)
        .createdAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
        .completed("completed4")
        .build()
)
.build();
```

