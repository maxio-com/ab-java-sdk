
# Sale Rep

## Structure

`SaleRep`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `FullName` | `String` | Optional | - | String getFullName() | setFullName(String fullName) |
| `SubscriptionsCount` | `Integer` | Optional | - | Integer getSubscriptionsCount() | setSubscriptionsCount(Integer subscriptionsCount) |
| `TestMode` | `Boolean` | Optional | - | Boolean getTestMode() | setTestMode(Boolean testMode) |
| `Subscriptions` | [`List<SaleRepSubscription>`](../../doc/models/sale-rep-subscription.md) | Optional | - | List<SaleRepSubscription> getSubscriptions() | setSubscriptions(List<SaleRepSubscription> subscriptions) |

## Example

```java
import com.maxio.advancedbilling.models.SaleRep;
import com.maxio.advancedbilling.models.SaleRepSubscription;
import java.util.Arrays;

SaleRep saleRep = new SaleRep.Builder()
    .id(78)
    .fullName("full_name0")
    .subscriptionsCount(102)
    .testMode(false)
    .subscriptions(Arrays.asList(
        new SaleRepSubscription.Builder()
            .id(202)
            .siteName("site_name8")
            .subscriptionUrl("subscription_url2")
            .customerName("customer_name8")
            .createdAt("created_at4")
            .build(),
        new SaleRepSubscription.Builder()
            .id(202)
            .siteName("site_name8")
            .subscriptionUrl("subscription_url2")
            .customerName("customer_name8")
            .createdAt("created_at4")
            .build(),
        new SaleRepSubscription.Builder()
            .id(202)
            .siteName("site_name8")
            .subscriptionUrl("subscription_url2")
            .customerName("customer_name8")
            .createdAt("created_at4")
            .build()
    ))
    .build();
```

