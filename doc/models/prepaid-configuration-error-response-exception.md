
# Prepaid Configuration Error Response Exception

## Structure

`PrepaidConfigurationErrorResponseException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Errors` | [`PrepaidConfigurationErrorResponseErrors`](../../doc/models/containers/prepaid-configuration-error-response-errors.md) | Optional | This is a container for one-of cases. | PrepaidConfigurationErrorResponseErrors getErrors() | setErrors(PrepaidConfigurationErrorResponseErrors errors) |

## Example (as JSON)

```json
{
  "errors": {
    "errors": {
      "key0": "errors9"
    }
  }
}
```

