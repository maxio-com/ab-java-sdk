
# Subscription Group Payment Profile

## Structure

`SubscriptionGroupPaymentProfile`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `FirstName` | `String` | Optional | - | String getFirstName() | setFirstName(String firstName) |
| `LastName` | `String` | Optional | - | String getLastName() | setLastName(String lastName) |
| `MaskedCardNumber` | `String` | Optional | - | String getMaskedCardNumber() | setMaskedCardNumber(String maskedCardNumber) |

## Example

```java
import com.maxio.advancedbilling.models.SubscriptionGroupPaymentProfile;

SubscriptionGroupPaymentProfile subscriptionGroupPaymentProfile = new SubscriptionGroupPaymentProfile.Builder()
    .id(246)
    .firstName("first_name6")
    .lastName("last_name4")
    .maskedCardNumber("masked_card_number4")
    .build();
```

