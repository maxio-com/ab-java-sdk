
# Account Balances

## Structure

`AccountBalances`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `OpenInvoices` | [`AccountBalance`](../../doc/models/account-balance.md) | Optional | The balance, in cents, of the sum of the subscription's  open, payable invoices. | AccountBalance getOpenInvoices() | setOpenInvoices(AccountBalance openInvoices) |
| `PendingDiscounts` | [`AccountBalance`](../../doc/models/account-balance.md) | Optional | The balance, in cents, of the subscription's Pending Discount account. | AccountBalance getPendingDiscounts() | setPendingDiscounts(AccountBalance pendingDiscounts) |
| `ServiceCredits` | [`AccountBalance`](../../doc/models/account-balance.md) | Optional | The balance, in cents, of the subscription's Service Credit account. | AccountBalance getServiceCredits() | setServiceCredits(AccountBalance serviceCredits) |
| `Prepayments` | [`AccountBalance`](../../doc/models/account-balance.md) | Optional | The balance, in cents, of the subscription's Prepayment account. | AccountBalance getPrepayments() | setPrepayments(AccountBalance prepayments) |

## Example (as JSON)

```json
{
  "open_invoices": {
    "balance_in_cents": 40
  },
  "pending_discounts": {
    "balance_in_cents": 88
  },
  "service_credits": {
    "balance_in_cents": 84
  },
  "prepayments": {
    "balance_in_cents": 192
  }
}
```

