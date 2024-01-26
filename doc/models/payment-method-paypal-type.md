
# Payment Method Paypal Type

## Structure

`PaymentMethodPaypalType`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Email` | `String` | Required | - | String getEmail() | setEmail(String email) |
| `Type` | `String` | Required | **Default**: `"paypal_account"` | String getType() | setType(String type) |

## Example (as JSON)

```json
{
  "email": "email4",
  "type": "paypal_account"
}
```

