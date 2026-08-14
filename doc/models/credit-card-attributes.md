
# Credit Card Attributes

## Structure

`CreditCardAttributes`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FullNumber` | `String` | Optional | - | String getFullNumber() | setFullNumber(String fullNumber) |
| `ExpirationMonth` | `String` | Optional | - | String getExpirationMonth() | setExpirationMonth(String expirationMonth) |
| `ExpirationYear` | `String` | Optional | - | String getExpirationYear() | setExpirationYear(String expirationYear) |

## Example

```java
import com.maxio.advancedbilling.models.CreditCardAttributes;

CreditCardAttributes creditCardAttributes = new CreditCardAttributes.Builder()
    .fullNumber("full_number8")
    .expirationMonth("expiration_month8")
    .expirationYear("expiration_year2")
    .build();
```

