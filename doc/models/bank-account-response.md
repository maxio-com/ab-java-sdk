
# Bank Account Response

## Structure

`BankAccountResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PaymentProfile` | [`BankAccountPaymentProfile`](../../doc/models/bank-account-payment-profile.md) | Required | - | BankAccountPaymentProfile getPaymentProfile() | setPaymentProfile(BankAccountPaymentProfile paymentProfile) |

## Example

```java
import com.maxio.advancedbilling.models.BankAccountPaymentProfile;
import com.maxio.advancedbilling.models.BankAccountResponse;
import com.maxio.advancedbilling.models.BankAccountVault;
import com.maxio.advancedbilling.models.PaymentType;

BankAccountResponse bankAccountResponse = new BankAccountResponse.Builder(
    new BankAccountPaymentProfile.Builder(
        PaymentType.BANK_ACCOUNT
    )
    .id(44)
    .firstName("first_name4")
    .lastName("last_name2")
    .customerId(82)
    .currentVault(BankAccountVault.AUTHORIZENET)
    .verified(false)
    .build()
)
.build();
```

