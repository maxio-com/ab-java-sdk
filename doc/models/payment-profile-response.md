
# Payment Profile Response

## Structure

`PaymentProfileResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PaymentProfile` | [`PaymentProfile`](../../doc/models/containers/payment-profile.md) | Required | - | PaymentProfile getPaymentProfile() | setPaymentProfile(PaymentProfile paymentProfile) |

## Example

```java
import com.maxio.advancedbilling.models.ApplePayPaymentProfile;
import com.maxio.advancedbilling.models.ApplePayVault;
import com.maxio.advancedbilling.models.PaymentProfileResponse;
import com.maxio.advancedbilling.models.PaymentType;
import com.maxio.advancedbilling.models.containers.PaymentProfile;

PaymentProfileResponse paymentProfileResponse = new PaymentProfileResponse.Builder(
    PaymentProfile.fromApplePayPaymentProfile(
        new ApplePayPaymentProfile.Builder(
            PaymentType.APPLE_PAY
        )
        .id(60)
        .firstName("first_name2")
        .lastName("last_name0")
        .customerId(98)
        .currentVault(ApplePayVault.BRAINTREE_BLUE)
        .build()
    )
)
.build();
```

