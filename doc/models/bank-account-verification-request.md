
# Bank Account Verification Request

## Structure

`BankAccountVerificationRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BankAccountVerification` | [`BankAccountVerification`](../../doc/models/bank-account-verification.md) | Required | - | BankAccountVerification getBankAccountVerification() | setBankAccountVerification(BankAccountVerification bankAccountVerification) |

## Example

```java
import com.maxio.advancedbilling.models.BankAccountVerification;
import com.maxio.advancedbilling.models.BankAccountVerificationRequest;

BankAccountVerificationRequest bankAccountVerificationRequest = new BankAccountVerificationRequest.Builder(
    new BankAccountVerification.Builder()
        .deposit1InCents(244L)
        .deposit2InCents(6L)
        .build()
)
.build();
```

