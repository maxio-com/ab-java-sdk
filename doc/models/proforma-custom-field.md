
# Proforma Custom Field

## Structure

`ProformaCustomField`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `OwnerId` | `Integer` | Optional | - | Integer getOwnerId() | setOwnerId(Integer ownerId) |
| `OwnerType` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getOwnerType() | setOwnerType(String ownerType) |
| `Name` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getName() | setName(String name) |
| `Value` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getValue() | setValue(String value) |
| `MetadatumId` | `Integer` | Optional | - | Integer getMetadatumId() | setMetadatumId(Integer metadatumId) |

## Example (as JSON)

```json
{
  "owner_id": 224,
  "owner_type": "owner_type0",
  "name": "name8",
  "value": "value0",
  "metadatum_id": 224
}
```

