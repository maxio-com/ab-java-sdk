
# Upsert Prepaid Configuration

## Structure

`UpsertPrepaidConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `InitialFundingAmountInCents` | `Long` | Optional | - | Long getInitialFundingAmountInCents() | setInitialFundingAmountInCents(Long initialFundingAmountInCents) |
| `ReplenishToAmountInCents` | `Long` | Optional | - | Long getReplenishToAmountInCents() | setReplenishToAmountInCents(Long replenishToAmountInCents) |
| `AutoReplenish` | `Boolean` | Optional | - | Boolean getAutoReplenish() | setAutoReplenish(Boolean autoReplenish) |
| `ReplenishThresholdAmountInCents` | `Long` | Optional | - | Long getReplenishThresholdAmountInCents() | setReplenishThresholdAmountInCents(Long replenishThresholdAmountInCents) |

## Example (as JSON)

```json
{
  "initial_funding_amount_in_cents": 40,
  "replenish_to_amount_in_cents": 42,
  "auto_replenish": false,
  "replenish_threshold_amount_in_cents": 242
}
```

