
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

## Example

```java
import com.maxio.advancedbilling.models.ItemPricePointChanged;
import com.maxio.advancedbilling.models.ItemPricePointData;

ItemPricePointChanged itemPricePointChanged = new ItemPricePointChanged.Builder(
    30,
    "item_type6",
    "item_handle4",
    "item_name8",
    new ItemPricePointData.Builder()
        .id(216)
        .handle("handle6")
        .name("name0")
        .build(),
    new ItemPricePointData.Builder()
        .id(218)
        .handle("handle6")
        .name("name0")
        .build()
)
.build();
```

