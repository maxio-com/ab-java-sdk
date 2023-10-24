
# Payment Method Bank Account Type

## Structure

`PaymentMethodBankAccountType`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MaskedAccountNumber` | `String` | Optional | - | String getMaskedAccountNumber() | setMaskedAccountNumber(String maskedAccountNumber) |
| `MaskedRoutingNumber` | `String` | Optional | - | String getMaskedRoutingNumber() | setMaskedRoutingNumber(String maskedRoutingNumber) |
| `Type` | `String` | Optional | **Default**: `"bank_account"` | String getType() | setType(String type) |

## Example (as JSON)

```json
{
  "type": "bank_account",
  "masked_account_number": "masked_account_number2",
  "masked_routing_number": "masked_routing_number2"
}
```

