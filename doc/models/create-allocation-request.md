
# Create Allocation Request

## Structure

`CreateAllocationRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Allocation` | [`CreateAllocation`](../../doc/models/create-allocation.md) | Required | - | CreateAllocation getAllocation() | setAllocation(CreateAllocation allocation) |

## Example (as JSON)

```json
{
  "allocation": {
    "quantity": 228.94,
    "component_id": 8,
    "memo": "memo2",
    "proration_downgrade_scheme": "proration_downgrade_scheme4",
    "proration_upgrade_scheme": "proration_upgrade_scheme6",
    "accrue_charge": false
  }
}
```

