
# Site Statistics

## Structure

`SiteStatistics`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalSubscriptions` | `Integer` | Optional | - | Integer getTotalSubscriptions() | setTotalSubscriptions(Integer totalSubscriptions) |
| `SubscriptionsToday` | `Integer` | Optional | - | Integer getSubscriptionsToday() | setSubscriptionsToday(Integer subscriptionsToday) |
| `TotalRevenue` | `String` | Optional | - | String getTotalRevenue() | setTotalRevenue(String totalRevenue) |
| `RevenueToday` | `String` | Optional | - | String getRevenueToday() | setRevenueToday(String revenueToday) |
| `RevenueThisMonth` | `String` | Optional | - | String getRevenueThisMonth() | setRevenueThisMonth(String revenueThisMonth) |
| `RevenueThisYear` | `String` | Optional | - | String getRevenueThisYear() | setRevenueThisYear(String revenueThisYear) |
| `TotalCanceledSubscriptions` | `Integer` | Optional | - | Integer getTotalCanceledSubscriptions() | setTotalCanceledSubscriptions(Integer totalCanceledSubscriptions) |
| `TotalActiveSubscriptions` | `Integer` | Optional | - | Integer getTotalActiveSubscriptions() | setTotalActiveSubscriptions(Integer totalActiveSubscriptions) |
| `TotalPastDueSubscriptions` | `Integer` | Optional | - | Integer getTotalPastDueSubscriptions() | setTotalPastDueSubscriptions(Integer totalPastDueSubscriptions) |
| `TotalUnpaidSubscriptions` | `Integer` | Optional | - | Integer getTotalUnpaidSubscriptions() | setTotalUnpaidSubscriptions(Integer totalUnpaidSubscriptions) |
| `TotalDunningSubscriptions` | `Integer` | Optional | - | Integer getTotalDunningSubscriptions() | setTotalDunningSubscriptions(Integer totalDunningSubscriptions) |

## Example

```java
import com.maxio.advancedbilling.models.SiteStatistics;

SiteStatistics siteStatistics = new SiteStatistics.Builder()
    .totalSubscriptions(168)
    .subscriptionsToday(170)
    .totalRevenue("total_revenue2")
    .revenueToday("revenue_today0")
    .revenueThisMonth("revenue_this_month0")
    .build();
```

