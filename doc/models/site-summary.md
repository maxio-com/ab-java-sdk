
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

## Example (as JSON)

```json
{
  "seller_name": "seller_name0",
  "site_name": "site_name4",
  "site_id": 218,
  "site_currency": "site_currency6",
  "stats": {
    "total_subscriptions": 110,
    "subscriptions_today": 228,
    "total_revenue": "total_revenue6",
    "revenue_today": "revenue_today4",
    "revenue_this_month": "revenue_this_month4"
  }
}
```

