
# Batch Job

## Structure

`BatchJob`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `FinishedAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getFinishedAt() | setFinishedAt(ZonedDateTime finishedAt) |
| `RowCount` | `Integer` | Optional | - | Integer getRowCount() | setRowCount(Integer rowCount) |
| `CreatedAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getCreatedAt() | setCreatedAt(ZonedDateTime createdAt) |
| `Completed` | `String` | Optional | - | String getCompleted() | setCompleted(String completed) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.BatchJob;

BatchJob batchJob = new BatchJob.Builder()
    .id(60)
    .finishedAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .rowCount(68)
    .createdAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .completed("completed6")
    .build();
```

