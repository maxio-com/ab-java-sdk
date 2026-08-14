
# Site Summary

## Structure

`SiteSummary`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SellerName` | `String` | Optional | - | String getSellerName() | setSellerName(String sellerName) |
| `SiteName` | `String` | Optional | - | String getSiteName() | setSiteName(String siteName) |
| `SiteId` | `Integer` | Optional | - | Integer getSiteId() | setSiteId(Integer siteId) |
| `SiteCurrency` | `String` | Optional | - | String getSiteCurrency() | setSiteCurrency(String siteCurrency) |
| `Stats` | [`SiteStatistics`](../../doc/models/site-statistics.md) | Optional | - | SiteStatistics getStats() | setStats(SiteStatistics stats) |

## Example

```java
import com.maxio.advancedbilling.models.SiteStatistics;
import com.maxio.advancedbilling.models.SiteSummary;

SiteSummary siteSummary = new SiteSummary.Builder()
    .sellerName("seller_name4")
    .siteName("site_name8")
    .siteId(252)
    .siteCurrency("site_currency0")
    .stats(new SiteStatistics.Builder()
        .totalSubscriptions(110)
        .subscriptionsToday(228)
        .totalRevenue("total_revenue6")
        .revenueToday("revenue_today4")
        .revenueThisMonth("revenue_this_month4")
        .build())
    .build();
```

