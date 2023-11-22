
# Product Price Point Errors

## Structure

`ProductPricePointErrors`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PricePoint` | `String` | Optional | - | String getPricePoint() | setPricePoint(String pricePoint) |
| `Interval` | `List<String>` | Optional | - | List<String> getInterval() | setInterval(List<String> interval) |
| `IntervalUnit` | `List<String>` | Optional | - | List<String> getIntervalUnit() | setIntervalUnit(List<String> intervalUnit) |
| `Name` | `List<String>` | Optional | - | List<String> getName() | setName(List<String> name) |
| `Price` | `List<String>` | Optional | - | List<String> getPrice() | setPrice(List<String> price) |
| `PriceInCents` | `List<String>` | Optional | - | List<String> getPriceInCents() | setPriceInCents(List<String> priceInCents) |

## Example (as JSON)

```json
{
  "price_point": "can't be blank",
  "interval": [
    "Recurring Interval: cannot be blank.",
    "Recurring Interval: must be greater than or equal to 1."
  ],
  "interval_unit": [
    "Interval unit: cannot be blank.",
    "Interval unit: must be 'month' or 'day'."
  ],
  "name": [
    "Name: cannot be blank."
  ],
  "price": [
    "Price: is not a number.",
    "Price: must be greater than or equal to 0."
  ],
  "price_in_cents": [
    "Price in cents: cannot be blank."
  ]
}
```

