
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

## Example (as JSON)

```json
{
  "prepayments": {
    "balance_in_cents": 192
  },
  "service_credits": {
    "balance_in_cents": 84
  },
  "open_invoices": {
    "balance_in_cents": 40
  },
  "pending_discounts": {
    "balance_in_cents": 88
  }
}
```

