
# Invoice Custom Field

## Structure

`InvoiceCustomField`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `OwnerId` | `Integer` | Optional | - | Integer getOwnerId() | setOwnerId(Integer ownerId) |
| `OwnerType` | [`CustomFieldOwner`](../../doc/models/custom-field-owner.md) | Optional | - | CustomFieldOwner getOwnerType() | setOwnerType(CustomFieldOwner ownerType) |
| `Name` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getName() | setName(String name) |
| `Value` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getValue() | setValue(String value) |
| `MetadatumId` | `Integer` | Optional | - | Integer getMetadatumId() | setMetadatumId(Integer metadatumId) |

## Example (as JSON)

```json
{
  "owner_id": 142,
  "owner_type": "Customer",
  "name": "name0",
  "value": "value2",
  "metadatum_id": 142
}
```

