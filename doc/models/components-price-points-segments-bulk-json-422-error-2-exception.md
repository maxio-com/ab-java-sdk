
# Components Price Points Segments Bulk Json 422 Error 2 Exception

## Structure

`ComponentsPricePointsSegmentsBulkJson422Error2Exception`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Errors` | [`Errors13`](../../doc/models/errors-13.md) | Required | - | Errors13 getErrors() | setErrors(Errors13 errors) |

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
        ]
      }
    }
  }
}
```

