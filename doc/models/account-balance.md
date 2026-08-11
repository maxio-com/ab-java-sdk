
# Account Balance

## Structure

`AccountBalance`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BalanceInCents` | `Long` | Optional | The balance in cents. | Long getBalanceInCents() | setBalanceInCents(Long balanceInCents) |
| `AutomaticBalanceInCents` | `Long` | Optional | The automatic balance in cents. | Long getAutomaticBalanceInCents() | setAutomaticBalanceInCents(Long automaticBalanceInCents) |
| `RemittanceBalanceInCents` | `Long` | Optional | The remittance balance in cents. | Long getRemittanceBalanceInCents() | setRemittanceBalanceInCents(Long remittanceBalanceInCents) |

## Example

```java
import com.maxio.advancedbilling.models.AccountBalance;

AccountBalance accountBalance = new AccountBalance.Builder()
    .balanceInCents(242L)
    .automaticBalanceInCents(0L)
    .remittanceBalanceInCents(32L)
    .build();
```

