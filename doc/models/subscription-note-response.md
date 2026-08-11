
# Subscription Note Response

## Structure

`SubscriptionNoteResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Note` | [`SubscriptionNote`](../../doc/models/subscription-note.md) | Required | - | SubscriptionNote getNote() | setNote(SubscriptionNote note) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.SubscriptionNote;
import com.maxio.advancedbilling.models.SubscriptionNoteResponse;

SubscriptionNoteResponse subscriptionNoteResponse = new SubscriptionNoteResponse.Builder(
    new SubscriptionNote.Builder()
        .id(28)
        .body("body0")
        .subscriptionId(138)
        .createdAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
        .updatedAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
        .build()
)
.build();
```

