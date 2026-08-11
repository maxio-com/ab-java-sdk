
# Sale Rep Subscription

## Structure

`SaleRepSubscription`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `SiteName` | `String` | Optional | - | String getSiteName() | setSiteName(String siteName) |
| `SubscriptionUrl` | `String` | Optional | - | String getSubscriptionUrl() | setSubscriptionUrl(String subscriptionUrl) |
| `CustomerName` | `String` | Optional | - | String getCustomerName() | setCustomerName(String customerName) |
| `CreatedAt` | `String` | Optional | - | String getCreatedAt() | setCreatedAt(String createdAt) |
| `Mrr` | `String` | Optional | - | String getMrr() | setMrr(String mrr) |
| `Usage` | `String` | Optional | - | String getUsage() | setUsage(String usage) |
| `Recurring` | `String` | Optional | - | String getRecurring() | setRecurring(String recurring) |
| `LastPayment` | `String` | Optional | - | String getLastPayment() | setLastPayment(String lastPayment) |
| `ChurnDate` | `String` | Optional | - | String getChurnDate() | setChurnDate(String churnDate) |

## Example

```java
import com.maxio.advancedbilling.models.SaleRepSubscription;

SaleRepSubscription saleRepSubscription = new SaleRepSubscription.Builder()
    .id(68)
    .siteName("site_name8")
    .subscriptionUrl("subscription_url2")
    .customerName("customer_name8")
    .createdAt("created_at4")
    .build();
```

