
# Coupon Usage

## Structure

`CouponUsage`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | The Chargify id of the product | Integer getId() | setId(Integer id) |
| `Name` | `String` | Optional | Name of the product | String getName() | setName(String name) |
| `Signups` | `Integer` | Optional | Number of times the coupon has been applied | Integer getSignups() | setSignups(Integer signups) |
| `Savings` | `Integer` | Optional | Dollar amount of customer savings as a result of the coupon. | Integer getSavings() | setSavings(Integer savings) |
| `SavingsInCents` | `Integer` | Optional | Dollar amount of customer savings as a result of the coupon. | Integer getSavingsInCents() | setSavingsInCents(Integer savingsInCents) |
| `Revenue` | `Integer` | Optional | Total revenue of the all subscriptions that have received a discount from this coupon. | Integer getRevenue() | setRevenue(Integer revenue) |
| `RevenueInCents` | `Integer` | Optional | Total revenue of the all subscriptions that have received a discount from this coupon. | Integer getRevenueInCents() | setRevenueInCents(Integer revenueInCents) |

## Example (as JSON)

```json
{
  "id": 14,
  "name": "name0",
  "signups": 34,
  "savings": 52,
  "savings_in_cents": 138
}
```

