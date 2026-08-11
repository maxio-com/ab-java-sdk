
# Bank Account Verification

## Structure

`BankAccountVerification`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Deposit1InCents` | `Long` | Optional | - | Long getDeposit1InCents() | setDeposit1InCents(Long deposit1InCents) |
| `Deposit2InCents` | `Long` | Optional | - | Long getDeposit2InCents() | setDeposit2InCents(Long deposit2InCents) |

## Example

```java
import com.maxio.advancedbilling.models.BankAccountVerification;

BankAccountVerification bankAccountVerification = new BankAccountVerification.Builder()
    .deposit1InCents(248L)
    .deposit2InCents(10L)
    .build();
```

