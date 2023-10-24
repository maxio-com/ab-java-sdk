
# Subscription Group Update Error Response Exception

## Structure

`SubscriptionGroupUpdateErrorResponseException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Errors` | [`SubscriptionGroupUpdateError`](../../doc/models/subscription-group-update-error.md) | Optional | - | SubscriptionGroupUpdateError getErrors() | setErrors(SubscriptionGroupUpdateError errors) |

## Example (as JSON)

```json
{
  "errors": {
    "members": [
      {
        "id": 204,
        "type": "type2",
        "message": "message8"
      },
      {
        "id": 204,
        "type": "type2",
        "message": "message8"
      }
    ]
  }
}
```

