
# Subscriptions Mrr Error Response Exception

## Structure

`SubscriptionsMrrErrorResponseException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Errors` | [`AttributeError`](../../doc/models/attribute-error.md) | Required | - | AttributeError getErrors() | setErrors(AttributeError errors) |

## Example (as JSON)

```json
{
  "errors": {
    "attribute": [
      "supplied value is invalid, expected ISO 8601 format"
    ]
  }
}
```

