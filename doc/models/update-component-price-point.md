
# Update Component Price Point

## Structure

`UpdateComponentPricePoint`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Prices` | [`List<UpdatePrice>`](../../doc/models/update-price.md) | Optional | - | List<UpdatePrice> getPrices() | setPrices(List<UpdatePrice> prices) |

## Example (as JSON)

```json
{
  "name": "name2",
  "prices": [
    {
      "id": 18,
      "ending_quantity": 38,
      "unit_price": 88,
      "_destroy": "_destroy4",
      "starting_quantity": 64
    },
    {
      "id": 18,
      "ending_quantity": 38,
      "unit_price": 88,
      "_destroy": "_destroy4",
      "starting_quantity": 64
    }
  ]
}
```

