
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

## Example

```java
import com.maxio.advancedbilling.models.InvoiceEventPaymentMethod;
import com.maxio.advancedbilling.models.PaymentMethodCreditCard;

PaymentMethodCreditCard paymentMethodCreditCard = new PaymentMethodCreditCard.Builder(
    "card_brand4",
    "masked_card_number0",
    InvoiceEventPaymentMethod.CREDIT_CARD
)
.cardExpiration("card_expiration2")
.lastFour("last_four6")
.build();
```

