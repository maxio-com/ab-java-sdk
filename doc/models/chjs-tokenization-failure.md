
# Chjs Tokenization Failure

## Structure

`ChjsTokenizationFailure`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Errors` | `String` | Required | - | String getErrors() | setErrors(String errors) |
| `PaymentProfileParams` | [`PaymentProfileParams`](../../doc/models/payment-profile-params.md) | Optional | PCI-safe cardholder fields only. Full card numbers, CVV, and billing address are never included. | PaymentProfileParams getPaymentProfileParams() | setPaymentProfileParams(PaymentProfileParams paymentProfileParams) |

## Example

```java
import com.maxio.advancedbilling.models.ChjsTokenizationFailure;
import com.maxio.advancedbilling.models.PaymentProfileParams;

ChjsTokenizationFailure chjsTokenizationFailure = new ChjsTokenizationFailure.Builder(
    "errors2"
)
.paymentProfileParams(new PaymentProfileParams.Builder()
        .firstName("first_name2")
        .lastName("last_name0")
        .cardType("card_type2")
        .build())
.build();
```

