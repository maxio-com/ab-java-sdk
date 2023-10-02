
# Subscription Groups Signup Json 422 Error Exception

## Structure

`SubscriptionGroupsSignupJson422ErrorException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Errors` | [`Errors7`](../../doc/models/errors-7.md) | Required | - | Errors7 getErrors() | setErrors(Errors7 errors) |

## Example (as JSON)

```json
{
  "errors": {
    "customer": {
      "key1": "val1",
      "key2": "val2"
    },
    "payment_profile": {
      "key1": "val1",
      "key2": "val2"
    },
    "subscriptions": {
      "key1": "val1",
      "key2": "val2"
    }
  }
}
```

