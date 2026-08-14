
# Subscription Group Balances

## Structure

`SubscriptionGroupBalances`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Prepayments` | [`AccountBalance`](../../doc/models/account-balance.md) | Optional | - | AccountBalance getPrepayments() | setPrepayments(AccountBalance prepayments) |
| `ServiceCredits` | [`AccountBalance`](../../doc/models/account-balance.md) | Optional | - | AccountBalance getServiceCredits() | setServiceCredits(AccountBalance serviceCredits) |
| `OpenInvoices` | [`AccountBalance`](../../doc/models/account-balance.md) | Optional | - | AccountBalance getOpenInvoices() | setOpenInvoices(AccountBalance openInvoices) |
| `PendingDiscounts` | [`AccountBalance`](../../doc/models/account-balance.md) | Optional | - | AccountBalance getPendingDiscounts() | setPendingDiscounts(AccountBalance pendingDiscounts) |

## Example

```java
import com.maxio.advancedbilling.models.AccountBalance;
import com.maxio.advancedbilling.models.SubscriptionGroupBalances;

SubscriptionGroupBalances subscriptionGroupBalances = new SubscriptionGroupBalances.Builder()
    .prepayments(new AccountBalance.Builder()
        .balanceInCents(192L)
        .automaticBalanceInCents(178L)
        .remittanceBalanceInCents(146L)
        .build())
    .serviceCredits(new AccountBalance.Builder()
        .balanceInCents(84L)
        .automaticBalanceInCents(70L)
        .remittanceBalanceInCents(38L)
        .build())
    .openInvoices(new AccountBalance.Builder()
        .balanceInCents(40L)
        .automaticBalanceInCents(202L)
        .remittanceBalanceInCents(170L)
        .build())
    .pendingDiscounts(new AccountBalance.Builder()
        .balanceInCents(88L)
        .automaticBalanceInCents(154L)
        .remittanceBalanceInCents(134L)
        .build())
    .build();
```

