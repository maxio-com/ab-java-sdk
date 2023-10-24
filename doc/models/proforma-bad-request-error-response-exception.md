
# Proforma Bad Request Error Response Exception

## Structure

`ProformaBadRequestErrorResponseException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Errors` | [`ProformaError`](../../doc/models/proforma-error.md) | Optional | - | ProformaError getErrors() | setErrors(ProformaError errors) |

## Example (as JSON)

```json
{
  "errors": {
    "subscription": {
      "base": [
        "base3",
        "base4"
      ]
    }
  }
}
```

