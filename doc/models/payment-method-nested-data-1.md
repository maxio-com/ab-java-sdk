
# Payment Method Nested Data 1

A nested data structure detailing the method of payment

## Structure

`PaymentMethodNestedData1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Optional | - | String getType() | setType(String type) |
| `MaskedAccountNumber` | `String` | Required | - | String getMaskedAccountNumber() | setMaskedAccountNumber(String maskedAccountNumber) |
| `MaskedRoutingNumber` | `String` | Required | - | String getMaskedRoutingNumber() | setMaskedRoutingNumber(String maskedRoutingNumber) |
| `CardBrand` | `String` | Required | - | String getCardBrand() | setCardBrand(String cardBrand) |
| `CardExpiration` | `String` | Optional | - | String getCardExpiration() | setCardExpiration(String cardExpiration) |
| `LastFour` | `String` | Optional | - | String getLastFour() | setLastFour(String lastFour) |
| `MaskedCardNumber` | `String` | Required | - | String getMaskedCardNumber() | setMaskedCardNumber(String maskedCardNumber) |
| `Details` | `String` | Required | - | String getDetails() | setDetails(String details) |
| `Kind` | `String` | Required | - | String getKind() | setKind(String kind) |
| `Memo` | `String` | Required | - | String getMemo() | setMemo(String memo) |
| `Email` | `String` | Required | - | String getEmail() | setEmail(String email) |

## Example (as JSON)

```json
{
  "type": "Payment Method Nested Data1",
  "masked_account_number": "masked_account_number8",
  "masked_routing_number": "masked_routing_number8",
  "card_brand": "card_brand4",
  "card_expiration": "card_expiration2",
  "last_four": "last_four6",
  "masked_card_number": "masked_card_number0",
  "details": "details2",
  "kind": "kind0",
  "memo": "memo6",
  "email": "email4"
}
```

