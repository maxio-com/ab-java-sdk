
# Customers Json 422 Error Exception

## Structure

`CustomersJson422ErrorException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Errors` | [`CustomerError`](../../doc/models/customer-error.md) | Optional | - | CustomerError getErrors() | setErrors(CustomerError errors) |

## Example (as JSON)

```json
{
  "errors": {
    "customer": "customer0"
  }
}
```

