
# Subscription Product Change

Event data for both `subscription_product_change` and `subscription_product_change_scheduled`. The price point and `effective_at` fields are only populated for scheduled changes.

## Structure

`SubscriptionProductChange`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PreviousProductId` | `int` | Required | - | int getPreviousProductId() | setPreviousProductId(int previousProductId) |
| `NewProductId` | `int` | Required | - | int getNewProductId() | setNewProductId(int newProductId) |
| `PreviousProductPricePointId` | `Integer` | Optional | - | Integer getPreviousProductPricePointId() | setPreviousProductPricePointId(Integer previousProductPricePointId) |
| `NewProductPricePointId` | `Integer` | Optional | - | Integer getNewProductPricePointId() | setNewProductPricePointId(Integer newProductPricePointId) |
| `EffectiveAt` | `ZonedDateTime` | Optional | When the scheduled product change takes effect (the subscription's next renewal). Only sent for `subscription_product_change_scheduled`. | ZonedDateTime getEffectiveAt() | setEffectiveAt(ZonedDateTime effectiveAt) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.SubscriptionProductChange;

SubscriptionProductChange subscriptionProductChange = new SubscriptionProductChange.Builder(
    104,
    10
)
.previousProductPricePointId(228)
.newProductPricePointId(222)
.effectiveAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
.build();
```

