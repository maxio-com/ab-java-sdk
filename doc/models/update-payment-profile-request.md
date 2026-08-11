
# Update Payment Profile Request

## Structure

`UpdatePaymentProfileRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PaymentProfile` | [`UpdatePaymentProfile`](../../doc/models/update-payment-profile.md) | Required | - | UpdatePaymentProfile getPaymentProfile() | setPaymentProfile(UpdatePaymentProfile paymentProfile) |

## Example

```java
import com.maxio.advancedbilling.models.CardType;
import com.maxio.advancedbilling.models.UpdatePaymentProfile;
import com.maxio.advancedbilling.models.UpdatePaymentProfileRequest;

UpdatePaymentProfileRequest updatePaymentProfileRequest = new UpdatePaymentProfileRequest.Builder(
    new UpdatePaymentProfile.Builder()
        .firstName("first_name4")
        .lastName("last_name2")
        .fullNumber("5424000000000015")
        .cardType(CardType.BOGUS)
        .expirationMonth("expiration_month0")
        .build()
)
.build();
```

