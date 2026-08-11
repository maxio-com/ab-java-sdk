
# Update Subscription Note

Updatable fields for Subscription Note

## Structure

`UpdateSubscriptionNote`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Body` | `String` | Required | - | String getBody() | setBody(String body) |
| `Sticky` | `boolean` | Required | - | boolean getSticky() | setSticky(boolean sticky) |

## Example

```java
import com.maxio.advancedbilling.models.UpdateSubscriptionNote;

UpdateSubscriptionNote updateSubscriptionNote = new UpdateSubscriptionNote.Builder(
    "body2",
    false
)
.build();
```

