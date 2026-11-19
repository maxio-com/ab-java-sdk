
# Feature 3

## Structure

`Feature3`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Value` | `String` | Optional | - | String getValue() | setValue(String value) |
| `PeriodicityInterval` | `Integer` | Optional | - | Integer getPeriodicityInterval() | setPeriodicityInterval(Integer periodicityInterval) |
| `PeriodicityUnit` | [`EntitlementPeriodicityUnit`](../../doc/models/entitlement-periodicity-unit.md) | Optional | - | EntitlementPeriodicityUnit getPeriodicityUnit() | setPeriodicityUnit(EntitlementPeriodicityUnit periodicityUnit) |
| `PropagateToSubscriptions` | `Boolean` | Optional | When `true`, existing subscriptions on the item's price point are updated with the new `value`/periodicity by a background job shortly after. Has no effect on a product/component-level item. When `false` (default) and the item's price point already has subscribers, the update is made on a clone of the price point instead, and existing subscribers are unaffected.<br><br>**Default**: `false` | Boolean getPropagateToSubscriptions() | setPropagateToSubscriptions(Boolean propagateToSubscriptions) |

## Example

```java
import com.maxio.advancedbilling.models.EntitlementPeriodicityUnit;
import com.maxio.advancedbilling.models.Feature3;

Feature3 feature3 = new Feature3.Builder()
    .value("value0")
    .periodicityInterval(222)
    .periodicityUnit(EntitlementPeriodicityUnit.DAY)
    .propagateToSubscriptions(false)
    .build();
```

