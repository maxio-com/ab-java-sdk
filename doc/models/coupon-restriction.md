
# Coupon Restriction

## Structure

`CouponRestriction`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `ItemType` | [`RestrictionType`](../../doc/models/restriction-type.md) | Optional | - | RestrictionType getItemType() | setItemType(RestrictionType itemType) |
| `ItemId` | `Integer` | Optional | - | Integer getItemId() | setItemId(Integer itemId) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Handle` | `String` | Optional | - | String getHandle() | setHandle(String handle) |

## Example (as JSON)

```json
{
  "id": 180,
  "item_type": "Component",
  "item_id": 184,
  "name": "name4",
  "handle": "handle0"
}
```

