
# Invoice Payment Method

## Structure

`InvoicePaymentMethod`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Details` | `String` | Optional | - | String getDetails() | setDetails(String details) |
| `Kind` | `String` | Optional | - | String getKind() | setKind(String kind) |
| `Memo` | `String` | Optional | - | String getMemo() | setMemo(String memo) |
| `Type` | `String` | Optional | - | String getType() | setType(String type) |
| `CardBrand` | `String` | Optional | - | String getCardBrand() | setCardBrand(String cardBrand) |
| `CardExpiration` | `String` | Optional | - | String getCardExpiration() | setCardExpiration(String cardExpiration) |
| `LastFour` | `String` | Optional | - | String getLastFour() | setLastFour(String lastFour) |
| `MaskedCardNumber` | `String` | Optional | - | String getMaskedCardNumber() | setMaskedCardNumber(String maskedCardNumber) |

## Example

```java
import com.maxio.advancedbilling.models.InvoicePaymentMethod;

InvoicePaymentMethod invoicePaymentMethod = new InvoicePaymentMethod.Builder()
    .details("details2")
    .kind("kind0")
    .memo("memo6")
    .type("type8")
    .cardBrand("card_brand4")
    .build();
```

