
# Upsert Prepaid Configuration

## Structure

`UpsertPrepaidConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `InitialFundingAmountInCents` | `Integer` | Optional | - | Integer getInitialFundingAmountInCents() | setInitialFundingAmountInCents(Integer initialFundingAmountInCents) |
| `ReplenishToAmountInCents` | `Integer` | Optional | - | Integer getReplenishToAmountInCents() | setReplenishToAmountInCents(Integer replenishToAmountInCents) |
| `AutoReplenish` | `Boolean` | Optional | - | Boolean getAutoReplenish() | setAutoReplenish(Boolean autoReplenish) |
| `ReplenishThresholdAmountInCents` | `Integer` | Optional | - | Integer getReplenishThresholdAmountInCents() | setReplenishThresholdAmountInCents(Integer replenishThresholdAmountInCents) |

## Example (as JSON)

```json
{
  "initial_funding_amount_in_cents": 40,
  "replenish_to_amount_in_cents": 42,
  "auto_replenish": false,
  "replenish_threshold_amount_in_cents": 242
}
```

