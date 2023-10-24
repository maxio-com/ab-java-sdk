
# Create Usage

## Structure

`CreateUsage`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Quantity` | `Double` | Optional | integer by default or decimal number if fractional quantities are enabled for the component | Double getQuantity() | setQuantity(Double quantity) |
| `PricePointId` | `String` | Optional | - | String getPricePointId() | setPricePointId(String pricePointId) |
| `Memo` | `String` | Optional | - | String getMemo() | setMemo(String memo) |

## Example (as JSON)

```json
{
  "quantity": 23.44,
  "price_point_id": "price_point_id0",
  "memo": "memo2"
}
```

