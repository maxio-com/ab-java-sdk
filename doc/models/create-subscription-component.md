
# Create Subscription Component

## Structure

`CreateSubscriptionComponent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ComponentId` | [`CreateSubscriptionComponentComponentId`](../../doc/models/containers/create-subscription-component-component-id.md) | Optional | This is a container for one-of cases. | CreateSubscriptionComponentComponentId getComponentId() | setComponentId(CreateSubscriptionComponentComponentId componentId) |
| `Enabled` | `Boolean` | Optional | Used for on/off components only. | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `UnitBalance` | `Integer` | Optional | Used for metered and events based components. | Integer getUnitBalance() | setUnitBalance(Integer unitBalance) |
| `AllocatedQuantity` | `Integer` | Optional | Used for quantity based components. | Integer getAllocatedQuantity() | setAllocatedQuantity(Integer allocatedQuantity) |
| `Quantity` | `Integer` | Optional | Deprecated. Use `allocated_quantity` instead. | Integer getQuantity() | setQuantity(Integer quantity) |
| `PricePointId` | [`CreateSubscriptionComponentPricePointId`](../../doc/models/containers/create-subscription-component-price-point-id.md) | Optional | This is a container for one-of cases. | CreateSubscriptionComponentPricePointId getPricePointId() | setPricePointId(CreateSubscriptionComponentPricePointId pricePointId) |
| `CustomPrice` | [`ComponentCustomPrice`](../../doc/models/component-custom-price.md) | Optional | Create or update custom pricing unique to the subscription. Used in place of `price_point_id`. | ComponentCustomPrice getCustomPrice() | setCustomPrice(ComponentCustomPrice customPrice) |

## Example (as JSON)

```json
{
  "component_id": 8,
  "enabled": false,
  "unit_balance": 144,
  "allocated_quantity": 180,
  "quantity": 188
}
```

