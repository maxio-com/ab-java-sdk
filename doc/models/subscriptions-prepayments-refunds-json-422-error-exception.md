
# Subscriptions Prepayments Refunds Json 422 Error Exception

## Structure

`SubscriptionsPrepaymentsRefundsJson422ErrorException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Errors` | [`Errors16`](../../doc/models/errors-16.md) | Optional | - | Errors16 getErrors() | setErrors(Errors16 errors) |

## Example (as JSON)

```json
{
  "errors": {
    "refund": {
      "amount_in_cents": [
        "amount_in_cents5"
      ],
      "base": [
        "base7"
      ],
      "external": [
        "external0",
        "external1"
      ]
    }
  }
}
```

