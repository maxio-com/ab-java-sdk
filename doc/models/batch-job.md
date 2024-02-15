
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

## Example (as JSON)

```json
{
  "id": 246,
  "finished_at": "2016-03-13T12:52:32.123Z",
  "row_count": 254,
  "created_at": "2016-03-13T12:52:32.123Z",
  "completed": "completed0"
}
```

