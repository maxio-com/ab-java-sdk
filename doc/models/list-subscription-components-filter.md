
# List Subscription Components Filter

## Structure

`ListSubscriptionComponentsFilter`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Currencies` | `List<String>` | Optional | Allows fetching components allocation with matching currency based on provided values. Use in query `filter[currencies]=EUR,USD`.<br><br>**Constraints**: *Minimum Items*: `1` | List<String> getCurrencies() | setCurrencies(List<String> currencies) |
| `UseSiteExchangeRate` | `Boolean` | Optional | Allows fetching components allocation with matching use_site_exchange_rate based on provided value. Use in query `filter[use_site_exchange_rate]=true`. | Boolean getUseSiteExchangeRate() | setUseSiteExchangeRate(Boolean useSiteExchangeRate) |

## Example

```java
import com.maxio.advancedbilling.models.ListSubscriptionComponentsFilter;
import java.util.Arrays;

ListSubscriptionComponentsFilter listSubscriptionComponentsFilter = new ListSubscriptionComponentsFilter.Builder()
    .currencies(Arrays.asList(
        "EUR",
        "USD"
    ))
    .useSiteExchangeRate(false)
    .build();
```

