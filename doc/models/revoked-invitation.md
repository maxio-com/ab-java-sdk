
# Revoked Invitation

## Structure

`RevokedInvitation`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LastSentAt` | `String` | Optional | - | String getLastSentAt() | setLastSentAt(String lastSentAt) |
| `LastAcceptedAt` | `String` | Optional | - | String getLastAcceptedAt() | setLastAcceptedAt(String lastAcceptedAt) |
| `UninvitedCount` | `Integer` | Optional | - | Integer getUninvitedCount() | setUninvitedCount(Integer uninvitedCount) |

## Example

```java
import com.maxio.advancedbilling.models.RevokedInvitation;

RevokedInvitation revokedInvitation = new RevokedInvitation.Builder()
    .lastSentAt("last_sent_at8")
    .lastAcceptedAt("last_accepted_at8")
    .uninvitedCount(130)
    .build();
```

