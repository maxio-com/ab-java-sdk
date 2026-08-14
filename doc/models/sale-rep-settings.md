
# Sale Rep Settings

## Structure

`SaleRepSettings`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CustomerName` | `String` | Optional | - | String getCustomerName() | setCustomerName(String customerName) |
| `SubscriptionId` | `Integer` | Optional | - | Integer getSubscriptionId() | setSubscriptionId(Integer subscriptionId) |
| `SiteLink` | `String` | Optional | - | String getSiteLink() | setSiteLink(String siteLink) |
| `SiteName` | `String` | Optional | - | String getSiteName() | setSiteName(String siteName) |
| `SubscriptionMrr` | `String` | Optional | - | String getSubscriptionMrr() | setSubscriptionMrr(String subscriptionMrr) |
| `SalesRepId` | `Integer` | Optional | - | Integer getSalesRepId() | setSalesRepId(Integer salesRepId) |
| `SalesRepName` | `String` | Optional | - | String getSalesRepName() | setSalesRepName(String salesRepName) |

## Example

```java
import com.maxio.advancedbilling.models.SaleRepSettings;

SaleRepSettings saleRepSettings = new SaleRepSettings.Builder()
    .customerName("customer_name6")
    .subscriptionId(202)
    .siteLink("site_link2")
    .siteName("site_name6")
    .subscriptionMrr("subscription_mrr4")
    .build();
```

