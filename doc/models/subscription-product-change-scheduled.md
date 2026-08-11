
# Subscription Product Change Scheduled

## Structure

`SubscriptionProductChangeScheduled`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PreviousProductId` | `int` | Required | - | int getPreviousProductId() | setPreviousProductId(int previousProductId) |
| `NewProductId` | `int` | Required | - | int getNewProductId() | setNewProductId(int newProductId) |
| `PreviousProductPricePointId` | `Integer` | Optional | - | Integer getPreviousProductPricePointId() | setPreviousProductPricePointId(Integer previousProductPricePointId) |
| `NewProductPricePointId` | `Integer` | Optional | - | Integer getNewProductPricePointId() | setNewProductPricePointId(Integer newProductPricePointId) |
| `EffectiveAt` | `ZonedDateTime` | Optional | When the scheduled product change takes effect (the subscription's next renewal). | ZonedDateTime getEffectiveAt() | setEffectiveAt(ZonedDateTime effectiveAt) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.SubscriptionProductChangeScheduled;

SubscriptionProductChangeScheduled subscriptionProductChangeScheduled = new SubscriptionProductChangeScheduled.Builder(
    26,
    88
)
.previousProductPricePointId(150)
.newProductPricePointId(144)
.effectiveAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
.build();
```

