
# Account Balances

## Structure

`AccountBalances`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `OpenInvoices` | [`AccountBalance`](../../doc/models/account-balance.md) | Optional | The balance, in cents, of the sum of the subscription's open, payable invoices. | AccountBalance getOpenInvoices() | setOpenInvoices(AccountBalance openInvoices) |
| `PendingInvoices` | [`AccountBalance`](../../doc/models/account-balance.md) | Optional | The balance, in cents, of the sum of the subscription's pending, payable invoices. | AccountBalance getPendingInvoices() | setPendingInvoices(AccountBalance pendingInvoices) |
| `PendingDiscounts` | [`AccountBalance`](../../doc/models/account-balance.md) | Optional | The balance, in cents, of the subscription's Pending Discount account. | AccountBalance getPendingDiscounts() | setPendingDiscounts(AccountBalance pendingDiscounts) |
| `ServiceCredits` | [`AccountBalance`](../../doc/models/account-balance.md) | Optional | The balance, in cents, of the subscription's Service Credit account. | AccountBalance getServiceCredits() | setServiceCredits(AccountBalance serviceCredits) |
| `Prepayments` | [`AccountBalance`](../../doc/models/account-balance.md) | Optional | The balance, in cents, of the subscription's Prepayment account. | AccountBalance getPrepayments() | setPrepayments(AccountBalance prepayments) |

## Example

```java
import com.maxio.advancedbilling.models.AccountBalance;
import com.maxio.advancedbilling.models.AccountBalances;

AccountBalances accountBalances = new AccountBalances.Builder()
    .openInvoices(new AccountBalance.Builder()
        .balanceInCents(40L)
        .automaticBalanceInCents(202L)
        .remittanceBalanceInCents(170L)
        .build())
    .pendingInvoices(new AccountBalance.Builder()
        .balanceInCents(0L)
        .automaticBalanceInCents(242L)
        .remittanceBalanceInCents(46L)
        .build())
    .pendingDiscounts(new AccountBalance.Builder()
        .balanceInCents(88L)
        .automaticBalanceInCents(154L)
        .remittanceBalanceInCents(134L)
        .build())
    .serviceCredits(new AccountBalance.Builder()
        .balanceInCents(84L)
        .automaticBalanceInCents(70L)
        .remittanceBalanceInCents(38L)
        .build())
    .prepayments(new AccountBalance.Builder()
        .balanceInCents(192L)
        .automaticBalanceInCents(178L)
        .remittanceBalanceInCents(146L)
        .build())
    .build();
```

