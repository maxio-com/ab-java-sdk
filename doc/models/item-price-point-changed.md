
# Item Price Point Changed

## Structure

`ItemPricePointChanged`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ItemId` | `int` | Required | - | int getItemId() | setItemId(int itemId) |
| `ItemType` | `String` | Required | - | String getItemType() | setItemType(String itemType) |
| `ItemHandle` | `String` | Required | - | String getItemHandle() | setItemHandle(String itemHandle) |
| `ItemName` | `String` | Required | - | String getItemName() | setItemName(String itemName) |
| `PreviousPricePoint` | [`ItemPricePointData`](../../doc/models/item-price-point-data.md) | Required | - | ItemPricePointData getPreviousPricePoint() | setPreviousPricePoint(ItemPricePointData previousPricePoint) |
| `CurrentPricePoint` | [`ItemPricePointData`](../../doc/models/item-price-point-data.md) | Required | - | ItemPricePointData getCurrentPricePoint() | setCurrentPricePoint(ItemPricePointData currentPricePoint) |

## Example (as JSON)

```json
{
  "item_id": 66,
  "item_type": "item_type6",
  "item_handle": "item_handle4",
  "item_name": "item_name8",
  "previous_price_point": {
    "id": 216,
    "handle": "handle6",
    "name": "name0"
  },
  "current_price_point": {
    "id": 218,
    "handle": "handle6",
    "name": "name0"
  }
}
```

