
# Prepaid Subscription Balance Changed

## Structure

`PrepaidSubscriptionBalanceChanged`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Reason` | `String` | Required | - | String getReason() | setReason(String reason) |
| `CurrentAccountBalanceInCents` | `int` | Required | - | int getCurrentAccountBalanceInCents() | setCurrentAccountBalanceInCents(int currentAccountBalanceInCents) |
| `PrepaymentAccountBalanceInCents` | `int` | Required | - | int getPrepaymentAccountBalanceInCents() | setPrepaymentAccountBalanceInCents(int prepaymentAccountBalanceInCents) |
| `CurrentUsageAmountInCents` | `int` | Required | - | int getCurrentUsageAmountInCents() | setCurrentUsageAmountInCents(int currentUsageAmountInCents) |

## Example (as JSON)

```json
{
  "reason": "reason8",
  "current_account_balance_in_cents": 250,
  "prepayment_account_balance_in_cents": 44,
  "current_usage_amount_in_cents": 242
}
```

