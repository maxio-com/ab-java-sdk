
# Scheduled Renewal Item Request Body Component

## Structure

`ScheduledRenewalItemRequestBodyComponent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ItemType` | `String` | Required, Constant | Item type to add. Either Product or Component.<br><br>**Value**: `"Component"` | String getItemType() | setItemType(String itemType) |
| `ItemId` | `int` | Required | Product or component identifier. | int getItemId() | setItemId(int itemId) |
| `PricePointId` | `Integer` | Optional | Price point identifier. | Integer getPricePointId() | setPricePointId(Integer pricePointId) |
| `Quantity` | `Integer` | Optional | Optional quantity for the item. | Integer getQuantity() | setQuantity(Integer quantity) |
| `CustomPrice` | [`ScheduledRenewalComponentCustomPrice`](../../doc/models/scheduled-renewal-component-custom-price.md) | Optional | Custom pricing for a component within a scheduled renewal. | ScheduledRenewalComponentCustomPrice getCustomPrice() | setCustomPrice(ScheduledRenewalComponentCustomPrice customPrice) |

## Example (as JSON)

```json
{
  "item_type": "Component",
  "item_id": 108,
  "price_point_id": 122,
  "quantity": 212,
  "custom_price": {
    "tax_included": false,
    "pricing_scheme": "stairstep",
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

