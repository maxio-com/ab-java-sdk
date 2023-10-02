
# Upsert Prepaid Configuration Request

## Structure

`UpsertPrepaidConfigurationRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PrepaidConfiguration` | [`UpsertPrepaidConfiguration`](../../doc/models/upsert-prepaid-configuration.md) | Required | - | UpsertPrepaidConfiguration getPrepaidConfiguration() | setPrepaidConfiguration(UpsertPrepaidConfiguration prepaidConfiguration) |

## Example (as JSON)

```json
{
  "prepaid_configuration": {
    "initial_funding_amount_in_cents": 74,
    "replenish_to_amount_in_cents": 76,
    "auto_replenish": false,
    "replenish_threshold_amount_in_cents": 20
  }
}
```

