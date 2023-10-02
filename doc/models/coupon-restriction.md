
# Coupon Restriction

## Structure

`CouponRestriction`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `ItemType` | [`RestrictionTypeEnum`](../../doc/models/restriction-type-enum.md) | Optional | - | RestrictionTypeEnum getItemType() | setItemType(RestrictionTypeEnum itemType) |
| `ItemId` | `Integer` | Optional | - | Integer getItemId() | setItemId(Integer itemId) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Handle` | `String` | Optional | - | String getHandle() | setHandle(String handle) |

## Example (as JSON)

```json
{
  "id": "id4",
  "item_type": "Component",
  "item_id": 184,
  "name": "name4",
  "handle": "handle0"
}
```

