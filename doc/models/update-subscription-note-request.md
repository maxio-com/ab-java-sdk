
# Update Subscription Note Request

Updatable fields for Subscription Note

## Structure

`UpdateSubscriptionNoteRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Note` | [`UpdateSubscriptionNote`](../../doc/models/update-subscription-note.md) | Required | Updatable fields for Subscription Note | UpdateSubscriptionNote getNote() | setNote(UpdateSubscriptionNote note) |

## Example

```java
import com.maxio.advancedbilling.models.UpdateSubscriptionNote;
import com.maxio.advancedbilling.models.UpdateSubscriptionNoteRequest;

UpdateSubscriptionNoteRequest updateSubscriptionNoteRequest = new UpdateSubscriptionNoteRequest.Builder(
    new UpdateSubscriptionNote.Builder(
        "body0",
        false
    )
    .build()
)
.build();
```

