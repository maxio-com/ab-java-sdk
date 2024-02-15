
# Portal Management Link

## Structure

`PortalManagementLink`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Optional | - | String getUrl() | setUrl(String url) |
| `FetchCount` | `Integer` | Optional | - | Integer getFetchCount() | setFetchCount(Integer fetchCount) |
| `CreatedAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getCreatedAt() | setCreatedAt(ZonedDateTime createdAt) |
| `NewLinkAvailableAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getNewLinkAvailableAt() | setNewLinkAvailableAt(ZonedDateTime newLinkAvailableAt) |
| `ExpiresAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getExpiresAt() | setExpiresAt(ZonedDateTime expiresAt) |
| `LastInviteSentAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getLastInviteSentAt() | setLastInviteSentAt(ZonedDateTime lastInviteSentAt) |

## Example (as JSON)

```json
{
  "url": "url0",
  "fetch_count": 222,
  "created_at": "2016-03-13T12:52:32.123Z",
  "new_link_available_at": "2016-03-13T12:52:32.123Z",
  "expires_at": "2016-03-13T12:52:32.123Z"
}
```

