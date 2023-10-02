
# Components Price Points Segments Bulk Json 422 Error Exception

## Structure

`ComponentsPricePointsSegmentsBulkJson422ErrorException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Errors` | [`Errors12`](../../doc/models/errors-12.md) | Required | - | Errors12 getErrors() | setErrors(Errors12 errors) |

## Example (as JSON)

```json
{
  "errors": {
    "segments": {
      "'x'": {
        "base": [
          "base9",
          "base0",
          "base1"
        ],
        "pricing_scheme": [
          "pricing_scheme1",
          "pricing_scheme0",
          "pricing_scheme9"
        ],
        "prices": [
          "prices3",
          "prices2",
          "prices1"
        ],
        "property_values_fingerprint": [
          "property_values_fingerprint5",
          "property_values_fingerprint4"
        ]
      }
    }
  }
}
```

