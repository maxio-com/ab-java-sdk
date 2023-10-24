
# Proforma Error

## Structure

`ProformaError`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Subscription` | [`BaseStringError`](../../doc/models/base-string-error.md) | Optional | The error is base if it is not directly associated with a single attribute. | BaseStringError getSubscription() | setSubscription(BaseStringError subscription) |

## Example (as JSON)

```json
{
  "subscription": {
    "base": [
      "base3",
      "base4"
    ]
  }
}
```

