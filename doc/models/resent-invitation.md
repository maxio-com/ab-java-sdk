
# Resent Invitation

## Structure

`ResentInvitation`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LastSentAt` | `String` | Optional | - | String getLastSentAt() | setLastSentAt(String lastSentAt) |
| `LastAcceptedAt` | `String` | Optional | - | String getLastAcceptedAt() | setLastAcceptedAt(String lastAcceptedAt) |
| `SendInviteLinkText` | `String` | Optional | - | String getSendInviteLinkText() | setSendInviteLinkText(String sendInviteLinkText) |
| `UninvitedCount` | `Integer` | Optional | - | Integer getUninvitedCount() | setUninvitedCount(Integer uninvitedCount) |
| `LastInviteSentAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getLastInviteSentAt() | setLastInviteSentAt(ZonedDateTime lastInviteSentAt) |
| `LastInviteAcceptedAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getLastInviteAcceptedAt() | setLastInviteAcceptedAt(ZonedDateTime lastInviteAcceptedAt) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.ResentInvitation;

ResentInvitation resentInvitation = new ResentInvitation.Builder()
    .lastSentAt("last_sent_at0")
    .lastAcceptedAt("last_accepted_at0")
    .sendInviteLinkText("send_invite_link_text8")
    .uninvitedCount(178)
    .lastInviteSentAt(DateTimeHelper.fromRfc8601DateTime("2024-01-01T04:30:00+00:00"))
    .lastInviteAcceptedAt(DateTimeHelper.fromRfc8601DateTime("2024-01-01T04:35:00+00:00"))
    .build();
```

