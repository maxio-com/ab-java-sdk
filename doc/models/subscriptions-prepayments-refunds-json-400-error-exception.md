
# Subscriptions Prepayments Refunds Json 400 Error Exception

## Structure

`SubscriptionsPrepaymentsRefundsJson400ErrorException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Errors` | [`Errors15`](../../doc/models/errors-15.md) | Optional | - | Errors15 getErrors() | setErrors(Errors15 errors) |

## Example (as JSON)

```json
{
  "errors": {
    "refund": {
      "base": [
        {
          "key1": "val1",
          "key2": "val2"
        }
      ]
    }
  }
}
```

