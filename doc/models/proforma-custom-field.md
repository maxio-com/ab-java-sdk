
# Proforma Custom Field

## Structure

`ProformaCustomField`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `OwnerId` | `Double` | Optional | - | Double getOwnerId() | setOwnerId(Double ownerId) |
| `OwnerType` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getOwnerType() | setOwnerType(String ownerType) |
| `Name` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getName() | setName(String name) |
| `Value` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getValue() | setValue(String value) |
| `MetadatumId` | `Double` | Optional | - | Double getMetadatumId() | setMetadatumId(Double metadatumId) |

## Example (as JSON)

```json
{
  "owner_id": 86.72,
  "owner_type": "owner_type0",
  "name": "name8",
  "value": "value0",
  "metadatum_id": 32.96
}
```

