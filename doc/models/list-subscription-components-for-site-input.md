
# List Subscription Components for Site Input

Input structure for the method ListSubscriptionComponentsForSite

## Structure

`ListSubscriptionComponentsForSiteInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Page` | `Integer` | Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br><br>**Default**: `1`<br><br>**Constraints**: `>= 1` | Integer getPage() | setPage(Integer page) |
| `PerPage` | `Integer` | Optional | This parameter indicates how many records to fetch in each request. Default value is 20. The maximum allowed values is 200; any per_page value over 200 will be changed to 200.<br>Use in query `per_page=200`.<br><br>**Default**: `20`<br><br>**Constraints**: `<= 200` | Integer getPerPage() | setPerPage(Integer perPage) |
| `Sort` | [`ListSubscriptionComponentsSort`](../../doc/models/list-subscription-components-sort.md) | Optional | The attribute by which to sort. Use in query: `sort=updated_at`. | ListSubscriptionComponentsSort getSort() | setSort(ListSubscriptionComponentsSort sort) |
| `Direction` | [`SortingDirection`](../../doc/models/sorting-direction.md) | Optional | Controls the order in which results are returned.<br>Use in query `direction=asc`. | SortingDirection getDirection() | setDirection(SortingDirection direction) |
| `Filter` | [`ListSubscriptionComponentsForSiteFilter`](../../doc/models/list-subscription-components-for-site-filter.md) | Optional | Filter to use for List Subscription Components For Site operation | ListSubscriptionComponentsForSiteFilter getFilter() | setFilter(ListSubscriptionComponentsForSiteFilter filter) |
| `DateField` | [`SubscriptionListDateField`](../../doc/models/subscription-list-date-field.md) | Optional | The type of filter you'd like to apply to your search. Use in query: `date_field=updated_at`. | SubscriptionListDateField getDateField() | setDateField(SubscriptionListDateField dateField) |
| `StartDate` | `String` | Optional | The start date (format YYYY-MM-DD) with which to filter the date_field. Returns components with a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date specified. Use in query `start_date=2011-12-15`. | String getStartDate() | setStartDate(String startDate) |
| `StartDatetime` | `String` | Optional | The start date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field. Returns components with a timestamp at or after exact time provided in query. You can specify timezone in query - otherwise your site''s time zone will be used. If provided, this parameter will be used instead of start_date. Use in query `start_datetime=2022-07-01 09:00:05`. | String getStartDatetime() | setStartDatetime(String startDatetime) |
| `EndDate` | `String` | Optional | The end date (format YYYY-MM-DD) with which to filter the date_field. Returns components with a timestamp up to and including 11:59:59PM in your site’s time zone on the date specified. Use in query `end_date=2011-12-16`. | String getEndDate() | setEndDate(String endDate) |
| `EndDatetime` | `String` | Optional | The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field. Returns components with a timestamp at or before exact time provided in query. You can specify timezone in query - otherwise your site''s time zone will be used. If provided, this parameter will be used instead of end_date. Use in query `end_datetime=2022-07-01 09:00:05`. | String getEndDatetime() | setEndDatetime(String endDatetime) |
| `SubscriptionIds` | `List<Integer>` | Optional | Allows fetching components allocation with matching subscription id based on provided ids. Use in query `subscription_ids=1,2,3`.<br><br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `200` | List<Integer> getSubscriptionIds() | setSubscriptionIds(List<Integer> subscriptionIds) |
| `PricePointIds` | [`IncludeNotNull`](../../doc/models/include-not-null.md) | Optional | Allows fetching components allocation only if price point id is present. Use in query `price_point_ids=not_null`. | IncludeNotNull getPricePointIds() | setPricePointIds(IncludeNotNull pricePointIds) |
| `ProductFamilyIds` | `List<Integer>` | Optional | Allows fetching components allocation with matching product family id based on provided ids. Use in query `product_family_ids=1,2,3`. | List<Integer> getProductFamilyIds() | setProductFamilyIds(List<Integer> productFamilyIds) |
| `Include` | [`ListSubscriptionComponentsInclude`](../../doc/models/list-subscription-components-include.md) | Optional | Allows including additional data in the response. Use in query `include=subscription,historic_usages`. | ListSubscriptionComponentsInclude getInclude() | setInclude(ListSubscriptionComponentsInclude include) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.IncludeNotNull;
import com.maxio.advancedbilling.models.ListSubscriptionComponentsForSiteFilter;
import com.maxio.advancedbilling.models.ListSubscriptionComponentsForSiteInput;
import com.maxio.advancedbilling.models.ListSubscriptionComponentsInclude;
import com.maxio.advancedbilling.models.ListSubscriptionComponentsSort;
import com.maxio.advancedbilling.models.SortingDirection;
import com.maxio.advancedbilling.models.SubscriptionFilter;
import com.maxio.advancedbilling.models.SubscriptionListDateField;
import com.maxio.advancedbilling.models.SubscriptionStateFilter;
import java.util.Arrays;

ListSubscriptionComponentsForSiteInput listSubscriptionComponentsForSiteInput = new ListSubscriptionComponentsForSiteInput.Builder()
    .page(1)
    .perPage(50)
    .sort(ListSubscriptionComponentsSort.UPDATED_AT)
    .direction(SortingDirection.ASC)
    .filter(new ListSubscriptionComponentsForSiteFilter.Builder()
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
        .build())
    .dateField(SubscriptionListDateField.UPDATED_AT)
    .startDate("start_date6")
    .startDatetime("start_datetime0")
    .endDate("end_date0")
    .endDatetime("end_datetime8")
    .subscriptionIds(Arrays.asList(
        1,
        2,
        3
    ))
    .pricePointIds(IncludeNotNull.NOT_NULL)
    .productFamilyIds(Arrays.asList(
        1,
        2,
        3
    ))
    .include(ListSubscriptionComponentsInclude.SUBSCRIPTION)
    .build();
```

