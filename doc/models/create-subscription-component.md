
# Create Subscription Component

## Structure

`CreateSubscriptionComponent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ComponentId` | [`CreateSubscriptionComponentComponentId`](../../doc/models/containers/create-subscription-component-component-id.md) | Optional | This is a container for one-of cases. | CreateSubscriptionComponentComponentId getComponentId() | setComponentId(CreateSubscriptionComponentComponentId componentId) |
| `Enabled` | `Boolean` | Optional | Used for on/off components only. | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `UnitBalance` | [`CreateSubscriptionComponentUnitBalance`](../../doc/models/containers/create-subscription-component-unit-balance.md) | Optional | This is a container for one-of cases. | CreateSubscriptionComponentUnitBalance getUnitBalance() | setUnitBalance(CreateSubscriptionComponentUnitBalance unitBalance) |
| `AllocatedQuantity` | [`CreateSubscriptionComponentAllocatedQuantity`](../../doc/models/containers/create-subscription-component-allocated-quantity.md) | Optional | This is a container for one-of cases. | CreateSubscriptionComponentAllocatedQuantity getAllocatedQuantity() | setAllocatedQuantity(CreateSubscriptionComponentAllocatedQuantity allocatedQuantity) |
| `Quantity` | `Integer` | Optional | Deprecated. Use `allocated_quantity` instead. | Integer getQuantity() | setQuantity(Integer quantity) |
| `PricePointId` | [`CreateSubscriptionComponentPricePointId`](../../doc/models/containers/create-subscription-component-price-point-id.md) | Optional | This is a container for one-of cases. | CreateSubscriptionComponentPricePointId getPricePointId() | setPricePointId(CreateSubscriptionComponentPricePointId pricePointId) |
| `CustomPrice` | [`ComponentCustomPrice`](../../doc/models/component-custom-price.md) | Optional | Create or update custom pricing unique to the subscription. Used in place of `price_point_id`. | ComponentCustomPrice getCustomPrice() | setCustomPrice(ComponentCustomPrice customPrice) |

## Example

```java
import com.maxio.advancedbilling.models.CreateSubscriptionComponent;
import com.maxio.advancedbilling.models.containers.CreateSubscriptionComponentAllocatedQuantity;
import com.maxio.advancedbilling.models.containers.CreateSubscriptionComponentComponentId;
import com.maxio.advancedbilling.models.containers.CreateSubscriptionComponentUnitBalance;

CreateSubscriptionComponent createSubscriptionComponent = new CreateSubscriptionComponent.Builder()
    .componentId(CreateSubscriptionComponentComponentId.fromNumber(
        210
    ))
    .enabled(false)
    .unitBalance(CreateSubscriptionComponentUnitBalance.fromNumber(
        12
    ))
    .allocatedQuantity(CreateSubscriptionComponentAllocatedQuantity.fromNumber(
        48
    ))
    .quantity(134)
    .build();
```

