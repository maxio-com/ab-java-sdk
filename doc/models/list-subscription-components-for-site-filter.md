
# List Subscription Components for Site Filter

## Structure

`ListSubscriptionComponentsForSiteFilter`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Currencies` | `List<String>` | Optional | Allows fetching components allocation with matching currency based on provided values. Use in query `filter[currencies]=USD,EUR`.<br><br>**Constraints**: *Minimum Items*: `1` | List<String> getCurrencies() | setCurrencies(List<String> currencies) |
| `UseSiteExchangeRate` | `Boolean` | Optional | Allows fetching components allocation with matching use_site_exchange_rate based on provided value. Use in query `filter[use_site_exchange_rate]=true`. | Boolean getUseSiteExchangeRate() | setUseSiteExchangeRate(Boolean useSiteExchangeRate) |
| `Subscription` | [`SubscriptionFilter`](../../doc/models/subscription-filter.md) | Optional | Nested filter used for List Subscription Components For Site Filter | SubscriptionFilter getSubscription() | setSubscription(SubscriptionFilter subscription) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.ListSubscriptionComponentsForSiteFilter;
import com.maxio.advancedbilling.models.SubscriptionFilter;
import com.maxio.advancedbilling.models.SubscriptionListDateField;
import com.maxio.advancedbilling.models.SubscriptionStateFilter;
import java.util.Arrays;

ListSubscriptionComponentsForSiteFilter listSubscriptionComponentsForSiteFilter = new ListSubscriptionComponentsForSiteFilter.Builder()
    .currencies(Arrays.asList(
        "EUR",
        "USD"
    ))
    .useSiteExchangeRate(false)
    .subscription(new SubscriptionFilter.Builder()
        .states(Arrays.asList(
            SubscriptionStateFilter.TRIALING,
            SubscriptionStateFilter.UNPAID,
            SubscriptionStateFilter.ACTIVE
        ))
        .dateField(SubscriptionListDateField.UPDATED_AT)
        .startDate(DateTimeHelper.fromSimpleDate("2016-03-13"))
        .endDate(DateTimeHelper.fromSimpleDate("2016-03-13"))
        .startDatetime(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
        .build())
    .build();
```

