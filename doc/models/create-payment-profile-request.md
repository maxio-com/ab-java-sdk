
# Create Payment Profile Request

## Structure

`CreatePaymentProfileRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PaymentProfile` | [`CreatePaymentProfile`](../../doc/models/create-payment-profile.md) | Required | - | CreatePaymentProfile getPaymentProfile() | setPaymentProfile(CreatePaymentProfile paymentProfile) |

## Example

```java
import com.maxio.advancedbilling.models.CreatePaymentProfile;
import com.maxio.advancedbilling.models.CreatePaymentProfileRequest;
import com.maxio.advancedbilling.models.PaymentType;

CreatePaymentProfileRequest createPaymentProfileRequest = new CreatePaymentProfileRequest.Builder(
    new CreatePaymentProfile.Builder()
        .chargifyToken("tok_9g6hw85pnpt6knmskpwp4ttt")
        .id(44)
        .paymentType(PaymentType.CREDIT_CARD)
        .firstName("first_name4")
        .lastName("last_name2")
        .fullNumber("5424000000000015")
        .build()
)
.build();
```

