
# Prepaid Configuration

## Structure

`PrepaidConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `InitialFundingAmountInCents` | `Integer` | Optional | - | Integer getInitialFundingAmountInCents() | setInitialFundingAmountInCents(Integer initialFundingAmountInCents) |
| `ReplenishToAmountInCents` | `Integer` | Optional | - | Integer getReplenishToAmountInCents() | setReplenishToAmountInCents(Integer replenishToAmountInCents) |
| `AutoReplenish` | `Boolean` | Optional | - | Boolean getAutoReplenish() | setAutoReplenish(Boolean autoReplenish) |
| `ReplenishThresholdAmountInCents` | `Integer` | Optional | - | Integer getReplenishThresholdAmountInCents() | setReplenishThresholdAmountInCents(Integer replenishThresholdAmountInCents) |

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

