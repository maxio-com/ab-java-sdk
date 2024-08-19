
# Activate Event Based Component

## Structure

`ActivateEventBasedComponent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PricePointId` | `Integer` | Optional | The Chargify id of the price point | Integer getPricePointId() | setPricePointId(Integer pricePointId) |
| `BillingSchedule` | [`BillingSchedule`](../../doc/models/billing-schedule.md) | Optional | This attribute is particularly useful when you need to align billing events for different components on distinct schedules within a subscription. Please note this only works for site with Multifrequency enabled | BillingSchedule getBillingSchedule() | setBillingSchedule(BillingSchedule billingSchedule) |
| `CustomPrice` | [`ComponentCustomPrice`](../../doc/models/component-custom-price.md) | Optional | Create or update custom pricing unique to the subscription. Used in place of `price_point_id`. | ComponentCustomPrice getCustomPrice() | setCustomPrice(ComponentCustomPrice customPrice) |

## Example (as JSON)

```json
{
  "price_point_id": 44,
  "billing_schedule": {
    "initial_billing_at": "2016-03-13"
  },
  "custom_price": {
    "tax_included": false,
    "pricing_scheme": "stairstep",
    "interval": 66,
    "interval_unit": "day",
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
    ]
  }
}
```

