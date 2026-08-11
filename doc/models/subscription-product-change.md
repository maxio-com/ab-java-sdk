
# Subscription Product Change

## Structure

`SubscriptionProductChange`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PreviousProductId` | `int` | Required | - | int getPreviousProductId() | setPreviousProductId(int previousProductId) |
| `NewProductId` | `int` | Required | - | int getNewProductId() | setNewProductId(int newProductId) |

## Example

```java
import com.maxio.advancedbilling.models.SubscriptionProductChange;

SubscriptionProductChange subscriptionProductChange = new SubscriptionProductChange.Builder(
    104,
    10
)
.build();
```

