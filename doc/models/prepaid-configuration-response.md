
# Prepaid Configuration Response

## Structure

`PrepaidConfigurationResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PrepaidConfiguration` | [`PrepaidConfiguration`](../../doc/models/prepaid-configuration.md) | Required | - | PrepaidConfiguration getPrepaidConfiguration() | setPrepaidConfiguration(PrepaidConfiguration prepaidConfiguration) |

## Example (as JSON)

```json
{
  "prepaid_configuration": {
    "id": 142,
    "initial_funding_amount_in_cents": 74,
    "replenish_to_amount_in_cents": 76,
    "auto_replenish": false,
    "replenish_threshold_amount_in_cents": 20
  }
}
```

