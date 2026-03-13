
# List Subscription Components Input

Input structure for the method ListSubscriptionComponents

## Structure

`ListSubscriptionComponentsInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SubscriptionId` | `int` | Required | The Chargify id of the subscription. | int getSubscriptionId() | setSubscriptionId(int subscriptionId) |
| `DateField` | [`SubscriptionListDateField`](../../doc/models/subscription-list-date-field.md) | Optional | The type of filter you'd like to apply to your search. Use in query `date_field=updated_at`. | SubscriptionListDateField getDateField() | setDateField(SubscriptionListDateField dateField) |
| `Direction` | [`SortingDirection`](../../doc/models/sorting-direction.md) | Optional | Controls the order in which results are returned.<br>Use in query `direction=asc`. | SortingDirection getDirection() | setDirection(SortingDirection direction) |
| `Filter` | [`ListSubscriptionComponentsFilter`](../../doc/models/list-subscription-components-filter.md) | Optional | Filter to use for List Subscription Components operation | ListSubscriptionComponentsFilter getFilter() | setFilter(ListSubscriptionComponentsFilter filter) |
| `EndDate` | `String` | Optional | The end date (format YYYY-MM-DD) with which to filter the date_field. Returns components with a timestamp up to and including 11:59:59PM in your site’s time zone on the date specified. | String getEndDate() | setEndDate(String endDate) |
| `EndDatetime` | `String` | Optional | The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field. Returns components with a timestamp at or before exact time provided in query. You can specify timezone in query - otherwise your site''s time zone will be used. If provided, this parameter will be used instead of end_date. | String getEndDatetime() | setEndDatetime(String endDatetime) |
| `PricePointIds` | [`IncludeNotNull`](../../doc/models/include-not-null.md) | Optional | Allows fetching components allocation only if price point id is present. Use in query `price_point_ids=not_null`. | IncludeNotNull getPricePointIds() | setPricePointIds(IncludeNotNull pricePointIds) |
| `ProductFamilyIds` | `List<Integer>` | Optional | Allows fetching components allocation with matching product family id based on provided ids. Use in query `product_family_ids=1,2,3`. | List<Integer> getProductFamilyIds() | setProductFamilyIds(List<Integer> productFamilyIds) |
| `Sort` | [`ListSubscriptionComponentsSort`](../../doc/models/list-subscription-components-sort.md) | Optional | The attribute by which to sort. Use in query `sort=updated_at`. | ListSubscriptionComponentsSort getSort() | setSort(ListSubscriptionComponentsSort sort) |
| `StartDate` | `String` | Optional | The start date (format YYYY-MM-DD) with which to filter the date_field. Returns components with a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date specified. | String getStartDate() | setStartDate(String startDate) |
| `StartDatetime` | `String` | Optional | The start date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field. Returns components with a timestamp at or after exact time provided in query. You can specify timezone in query - otherwise your site''s time zone will be used. If provided, this parameter will be used instead of start_date. | String getStartDatetime() | setStartDatetime(String startDatetime) |
| `Include` | [`List<ListSubscriptionComponentsInclude>`](../../doc/models/list-subscription-components-include.md) | Optional | Allows including additional data in the response. Use in query `include=subscription,historic_usages`. | List<ListSubscriptionComponentsInclude> getInclude() | setInclude(List<ListSubscriptionComponentsInclude> include) |
| `InUse` | `Boolean` | Optional | If in_use is set to true, it returns only components that are currently in use. However, if it's set to false or not provided, it returns all components connected with the subscription. | Boolean getInUse() | setInUse(Boolean inUse) |

## Example

```java
import com.maxio.advancedbilling.models.IncludeNotNull;
import com.maxio.advancedbilling.models.ListSubscriptionComponentsFilter;
import com.maxio.advancedbilling.models.ListSubscriptionComponentsInclude;
import com.maxio.advancedbilling.models.ListSubscriptionComponentsInput;
import com.maxio.advancedbilling.models.ListSubscriptionComponentsSort;
import com.maxio.advancedbilling.models.SortingDirection;
import com.maxio.advancedbilling.models.SubscriptionListDateField;
import java.util.Arrays;

ListSubscriptionComponentsInput listSubscriptionComponentsInput = new ListSubscriptionComponentsInput.Builder(
    222
)
.dateField(SubscriptionListDateField.UPDATED_AT)
.direction(SortingDirection.ASC)
.filter(new ListSubscriptionComponentsFilter.Builder()
        .currencies(Arrays.asList(
            "EUR",
            "USD"
        ))
        .useSiteExchangeRate(false)
        .build())
.endDate("end_date0")
.endDatetime("end_datetime8")
.pricePointIds(IncludeNotNull.NOT_NULL)
.productFamilyIds(Arrays.asList(
        1,
        2,
        3
    ))
.sort(ListSubscriptionComponentsSort.UPDATED_AT)
.startDate("start_date6")
.startDatetime("start_datetime0")
.include(Arrays.asList(
        ListSubscriptionComponentsInclude.SUBSCRIPTION,
        ListSubscriptionComponentsInclude.HISTORIC_USAGES
    ))
.inUse(true)
.build();
```

