
# Invoice Event Payment 1

A nested data structure detailing the method of payment

## Structure

`InvoiceEventPayment1`

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
  "type": "Invoice Event Payment1",
  "masked_account_number": "masked_account_number4",
  "masked_routing_number": "masked_routing_number4",
  "card_brand": "card_brand8",
  "card_expiration": "card_expiration4",
  "last_four": "last_four2",
  "masked_card_number": "masked_card_number6",
  "details": "details8",
  "kind": "kind6",
  "memo": "memo2",
  "email": "email8"
}
```

