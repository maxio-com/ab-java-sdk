
# Create Usage

## Structure

`CreateUsage`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Quantity` | [`CreateUsageQuantity`](../../doc/models/containers/create-usage-quantity.md) | Optional | This is a container for one-of cases. | CreateUsageQuantity getQuantity() | setQuantity(CreateUsageQuantity quantity) |
| `PricePointId` | `String` | Optional | - | String getPricePointId() | setPricePointId(String pricePointId) |
| `Memo` | `String` | Optional | - | String getMemo() | setMemo(String memo) |

## Example (as JSON)

```json
{
  "quantity": 218,
  "price_point_id": "price_point_id0",
  "memo": "memo2"
}
```

