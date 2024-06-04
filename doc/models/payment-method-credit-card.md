
# Payment Method Credit Card

## Structure

`PaymentMethodCreditCard`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CardBrand` | `String` | Required | - | String getCardBrand() | setCardBrand(String cardBrand) |
| `CardExpiration` | `String` | Optional | - | String getCardExpiration() | setCardExpiration(String cardExpiration) |
| `LastFour` | `String` | Optional | - | String getLastFour() | setLastFour(String lastFour) |
| `MaskedCardNumber` | `String` | Required | - | String getMaskedCardNumber() | setMaskedCardNumber(String maskedCardNumber) |
| `Type` | [`InvoiceEventPaymentMethod`](../../doc/models/invoice-event-payment-method.md) | Required | - | InvoiceEventPaymentMethod getType() | setType(InvoiceEventPaymentMethod type) |

## Example (as JSON)

```json
{
  "card_brand": "card_brand4",
  "masked_card_number": "masked_card_number0",
  "type": "credit_card",
  "card_expiration": "card_expiration2",
  "last_four": "last_four4"
}
```

