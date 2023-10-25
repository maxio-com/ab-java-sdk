
# Payment Method Nested Data

A nested data structure detailing the method of payment

## Structure

`PaymentMethodNestedData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Optional | **Default**: `"apple_pay"` | String getType() | setType(String type) |
| `MaskedAccountNumber` | `String` | Optional | - | String getMaskedAccountNumber() | setMaskedAccountNumber(String maskedAccountNumber) |
| `MaskedRoutingNumber` | `String` | Optional | - | String getMaskedRoutingNumber() | setMaskedRoutingNumber(String maskedRoutingNumber) |
| `CardBrand` | `String` | Optional | - | String getCardBrand() | setCardBrand(String cardBrand) |
| `CardExpiration` | `String` | Optional | - | String getCardExpiration() | setCardExpiration(String cardExpiration) |
| `LastFour` | `String` | Optional | - | String getLastFour() | setLastFour(String lastFour) |
| `MaskedCardNumber` | `String` | Optional | - | String getMaskedCardNumber() | setMaskedCardNumber(String maskedCardNumber) |
| `Details` | `String` | Optional | - | String getDetails() | setDetails(String details) |
| `Kind` | `String` | Optional | - | String getKind() | setKind(String kind) |
| `Memo` | `String` | Optional | - | String getMemo() | setMemo(String memo) |
| `Email` | `String` | Optional | - | String getEmail() | setEmail(String email) |

## Example (as JSON)

```json
{
  "type": "apple_pay",
  "masked_account_number": "masked_account_number8",
  "masked_routing_number": "masked_routing_number8",
  "card_brand": "card_brand4",
  "card_expiration": "card_expiration2"
}
```

