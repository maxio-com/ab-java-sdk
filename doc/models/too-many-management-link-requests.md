
# Too Many Management Link Requests

## Structure

`TooManyManagementLinkRequests`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Error` | `String` | Required | - | String getError() | setError(String error) |
| `NewLinkAvailableAt` | `ZonedDateTime` | Required | - | ZonedDateTime getNewLinkAvailableAt() | setNewLinkAvailableAt(ZonedDateTime newLinkAvailableAt) |

## Example (as JSON)

```json
{
  "error": "error2",
  "new_link_available_at": "2016-03-13T12:52:32.123Z"
}
```

