
# Payment Profile Params

PCI-safe cardholder fields only. Full card numbers, CVV, and billing address are never included.

## Structure

`PaymentProfileParams`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FirstName` | `String` | Optional | - | String getFirstName() | setFirstName(String firstName) |
| `LastName` | `String` | Optional | - | String getLastName() | setLastName(String lastName) |
| `CardType` | `String` | Optional | - | String getCardType() | setCardType(String cardType) |

## Example

```java
import com.maxio.advancedbilling.models.PaymentProfileParams;

PaymentProfileParams paymentProfileParams = new PaymentProfileParams.Builder()
    .firstName("first_name2")
    .lastName("last_name0")
    .cardType("card_type2")
    .build();
```

