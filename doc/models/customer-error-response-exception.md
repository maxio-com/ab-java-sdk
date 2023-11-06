
# Customer Error Response Exception

## Structure

`CustomerErrorResponseException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Errors` | [`CustomerErrorResponseErrors`](../../doc/models/containers/customer-error-response-errors.md) | Optional | This is a container for one-of cases. | CustomerErrorResponseErrors getErrors() | setErrors(CustomerErrorResponseErrors errors) |

## Example (as JSON)

```json
{
  "errors": {
    "customer": "customer8"
  }
}
```

