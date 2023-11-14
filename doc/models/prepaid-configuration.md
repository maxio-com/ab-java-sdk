
# Prepaid Configuration

## Structure

`PrepaidConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `InitialFundingAmountInCents` | `Long` | Optional | - | Long getInitialFundingAmountInCents() | setInitialFundingAmountInCents(Long initialFundingAmountInCents) |
| `ReplenishToAmountInCents` | `Long` | Optional | - | Long getReplenishToAmountInCents() | setReplenishToAmountInCents(Long replenishToAmountInCents) |
| `AutoReplenish` | `Boolean` | Optional | - | Boolean getAutoReplenish() | setAutoReplenish(Boolean autoReplenish) |
| `ReplenishThresholdAmountInCents` | `Long` | Optional | - | Long getReplenishThresholdAmountInCents() | setReplenishThresholdAmountInCents(Long replenishThresholdAmountInCents) |

## Example (as JSON)

```json
{
  "id": 156,
  "initial_funding_amount_in_cents": 88,
  "replenish_to_amount_in_cents": 166,
  "auto_replenish": false,
  "replenish_threshold_amount_in_cents": 222
}
```

