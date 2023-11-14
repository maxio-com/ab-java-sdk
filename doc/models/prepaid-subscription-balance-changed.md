
# Prepaid Subscription Balance Changed

## Structure

`PrepaidSubscriptionBalanceChanged`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Reason` | `String` | Required | - | String getReason() | setReason(String reason) |
| `CurrentAccountBalanceInCents` | `long` | Required | - | long getCurrentAccountBalanceInCents() | setCurrentAccountBalanceInCents(long currentAccountBalanceInCents) |
| `PrepaymentAccountBalanceInCents` | `long` | Required | - | long getPrepaymentAccountBalanceInCents() | setPrepaymentAccountBalanceInCents(long prepaymentAccountBalanceInCents) |
| `CurrentUsageAmountInCents` | `long` | Required | - | long getCurrentUsageAmountInCents() | setCurrentUsageAmountInCents(long currentUsageAmountInCents) |

## Example (as JSON)

```json
{
  "reason": "reason8",
  "current_account_balance_in_cents": 250,
  "prepayment_account_balance_in_cents": 44,
  "current_usage_amount_in_cents": 242
}
```

