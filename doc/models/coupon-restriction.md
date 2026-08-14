
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

## Example

```java
import com.maxio.advancedbilling.models.CouponRestriction;
import com.maxio.advancedbilling.models.RestrictionType;

CouponRestriction couponRestriction = new CouponRestriction.Builder()
    .id(66)
    .itemType(RestrictionType.COMPONENT)
    .itemId(214)
    .name("name0")
    .handle("handle6")
    .build();
```

