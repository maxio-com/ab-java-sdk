
# Payment Method Credit Card Type

## Structure

`PaymentMethodCreditCardType`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CardBrand` | `String` | Optional | - | String getCardBrand() | setCardBrand(String cardBrand) |
| `CardExpiration` | `String` | Optional | - | String getCardExpiration() | setCardExpiration(String cardExpiration) |
| `LastFour` | `String` | Optional | - | String getLastFour() | setLastFour(String lastFour) |
| `MaskedCardNumber` | `String` | Optional | - | String getMaskedCardNumber() | setMaskedCardNumber(String maskedCardNumber) |
| `Type` | `String` | Optional | **Default**: `"credit_card"` | String getType() | setType(String type) |

## Example (as JSON)

```json
{
  "type": "credit_card",
  "card_brand": "card_brand0",
  "card_expiration": "card_expiration8",
  "last_four": "last_four0",
  "masked_card_number": "masked_card_number4"
}
```

