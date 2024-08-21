
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

## Example (as JSON)

```json
{
  "last_invite_sent_at": "01/01/2024 04:30:00",
  "last_invite_accepted_at": "01/01/2024 04:35:00",
  "last_sent_at": "last_sent_at8",
  "last_accepted_at": "last_accepted_at8",
  "send_invite_link_text": "send_invite_link_text6",
  "uninvited_count": 6
}
```

