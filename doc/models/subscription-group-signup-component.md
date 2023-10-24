
# Subscription Group Signup Component

## Structure

`SubscriptionGroupSignupComponent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ComponentId` | [`SubscriptionGroupSignupComponentComponentId`](../../doc/models/containers/subscription-group-signup-component-component-id.md) | Optional | This is a container for one-of cases. | SubscriptionGroupSignupComponentComponentId getComponentId() | setComponentId(SubscriptionGroupSignupComponentComponentId componentId) |
| `AllocatedQuantity` | [`SubscriptionGroupSignupComponentAllocatedQuantity`](../../doc/models/containers/subscription-group-signup-component-allocated-quantity.md) | Optional | This is a container for one-of cases. | SubscriptionGroupSignupComponentAllocatedQuantity getAllocatedQuantity() | setAllocatedQuantity(SubscriptionGroupSignupComponentAllocatedQuantity allocatedQuantity) |
| `UnitBalance` | [`SubscriptionGroupSignupComponentUnitBalance`](../../doc/models/containers/subscription-group-signup-component-unit-balance.md) | Optional | This is a container for one-of cases. | SubscriptionGroupSignupComponentUnitBalance getUnitBalance() | setUnitBalance(SubscriptionGroupSignupComponentUnitBalance unitBalance) |
| `PricePointId` | [`SubscriptionGroupSignupComponentPricePointId`](../../doc/models/containers/subscription-group-signup-component-price-point-id.md) | Optional | This is a container for one-of cases. | SubscriptionGroupSignupComponentPricePointId getPricePointId() | setPricePointId(SubscriptionGroupSignupComponentPricePointId pricePointId) |
| `CustomPrice` | [`SubscriptionGroupComponentCustomPrice`](../../doc/models/subscription-group-component-custom-price.md) | Optional | Used in place of `price_point_id` to define a custom price point unique to the subscription. You still need to provide `component_id`. | SubscriptionGroupComponentCustomPrice getCustomPrice() | setCustomPrice(SubscriptionGroupComponentCustomPrice customPrice) |

## Example (as JSON)

```json
{
  "component_id": "String1",
  "allocated_quantity": "String5",
  "unit_balance": "String9",
  "price_point_id": "String5",
  "custom_price": {
    "pricing_scheme": "volume",
    "prices": [
      {
        "starting_quantity": 242,
        "ending_quantity": 40,
        "unit_price": 23.26
      },
      {
        "starting_quantity": 242,
        "ending_quantity": 40,
        "unit_price": 23.26
      }
    ],
    "overage_pricing": [
      {
        "pricing_scheme": "volume",
        "prices": [
          {
            "starting_quantity": 242,
            "ending_quantity": 40,
            "unit_price": 23.26
          }
        ]
      },
      {
        "pricing_scheme": "volume",
        "prices": [
          {
            "starting_quantity": 242,
            "ending_quantity": 40,
            "unit_price": 23.26
          }
        ]
      },
      {
        "pricing_scheme": "volume",
        "prices": [
          {
            "starting_quantity": 242,
            "ending_quantity": 40,
            "unit_price": 23.26
          }
        ]
      }
    ]
  }
}
```

