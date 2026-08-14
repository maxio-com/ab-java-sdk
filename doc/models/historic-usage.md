
# Historic Usage

(Optional) For Event Based Components. If the `include=historic_usages` query param is provided, the last ten billing periods will be returned.

## Structure

`HistoricUsage`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalUsageQuantity` | `Double` | Optional | Total usage of a component for billing period | Double getTotalUsageQuantity() | setTotalUsageQuantity(Double totalUsageQuantity) |
| `BillingPeriodStartsAt` | `ZonedDateTime` | Optional | Start date of billing period | ZonedDateTime getBillingPeriodStartsAt() | setBillingPeriodStartsAt(ZonedDateTime billingPeriodStartsAt) |
| `BillingPeriodEndsAt` | `ZonedDateTime` | Optional | End date of billing period | ZonedDateTime getBillingPeriodEndsAt() | setBillingPeriodEndsAt(ZonedDateTime billingPeriodEndsAt) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.HistoricUsage;

HistoricUsage historicUsage = new HistoricUsage.Builder()
    .totalUsageQuantity(140.74D)
    .billingPeriodStartsAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .billingPeriodEndsAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .build();
```

