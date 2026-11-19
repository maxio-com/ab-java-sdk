
# Aggregated Entitlement Periodicity

## Structure

`AggregatedEntitlementPeriodicity`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Interval` | `Integer` | Optional | - | Integer getInterval() | setInterval(Integer interval) |
| `Unit` | [`EntitlementPeriodicityUnit`](../../doc/models/entitlement-periodicity-unit.md) | Optional | The recurring window over which a `usage_limit` feature's allowance resets. | EntitlementPeriodicityUnit getUnit() | setUnit(EntitlementPeriodicityUnit unit) |

## Example

```java
import com.maxio.advancedbilling.models.AggregatedEntitlementPeriodicity;
import com.maxio.advancedbilling.models.EntitlementPeriodicityUnit;

AggregatedEntitlementPeriodicity aggregatedEntitlementPeriodicity = new AggregatedEntitlementPeriodicity.Builder()
    .interval(128)
    .unit(EntitlementPeriodicityUnit.YEAR)
    .build();
```

