
# Create Usage

## Structure

`CreateUsage`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Quantity` | `Double` | Optional | integer by default or decimal number if fractional quantities are enabled for the component | Double getQuantity() | setQuantity(Double quantity) |
| `PricePointId` | `String` | Optional | - | String getPricePointId() | setPricePointId(String pricePointId) |
| `Memo` | `String` | Optional | - | String getMemo() | setMemo(String memo) |
| `BillingSchedule` | [`BillingSchedule`](../../doc/models/billing-schedule.md) | Optional | Billing schedule settings for component allocations or usages on multi-frequency subscriptions. Use this to start a component's billing period on a custom date instead of aligning with the product charge schedule. | BillingSchedule getBillingSchedule() | setBillingSchedule(BillingSchedule billingSchedule) |
| `CustomPrice` | [`ComponentCustomPrice`](../../doc/models/component-custom-price.md) | Optional | Create or update custom pricing unique to the subscription. Used in place of `price_point_id`. | ComponentCustomPrice getCustomPrice() | setCustomPrice(ComponentCustomPrice customPrice) |

## Example (as JSON)

```json
{
  "quantity": 23.44,
  "price_point_id": "price_point_id0",
  "memo": "memo2",
  "billing_schedule": {
    "initial_billing_at": "2016-03-13"
  },
  "custom_price": {
    "tax_included": false,
    "pricing_scheme": "stairstep",
    "interval": 66,
    "interval_unit": "day",
    "list_price_point_id": 174,
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

