
# List Subscriptions Input

Input structure for the method ListSubscriptions

## Structure

`ListSubscriptionsInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Page` | `Integer` | Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br><br>**Default**: `1`<br><br>**Constraints**: `>= 1` | Integer getPage() | setPage(Integer page) |
| `PerPage` | `Integer` | Optional | This parameter indicates how many records to fetch in each request. Default value is 20. The maximum allowed values is 200; any per_page value over 200 will be changed to 200.<br>Use in query `per_page=200`.<br><br>**Default**: `20`<br><br>**Constraints**: `<= 200` | Integer getPerPage() | setPerPage(Integer perPage) |
| `State` | [`SubscriptionStateFilter`](../../doc/models/subscription-state-filter.md) | Optional | The current state of the subscription | SubscriptionStateFilter getState() | setState(SubscriptionStateFilter state) |
| `Product` | `Integer` | Optional | The product id of the subscription. (Note that the product handle cannot be used.) | Integer getProduct() | setProduct(Integer product) |
| `ProductPricePointId` | `Integer` | Optional | The ID of the product price point. If supplied, product is required | Integer getProductPricePointId() | setProductPricePointId(Integer productPricePointId) |
| `Coupon` | `Integer` | Optional | The numeric id of the coupon currently applied to the subscription. (This can be found in the URL when editing a coupon. Note that the coupon code cannot be used.) | Integer getCoupon() | setCoupon(Integer coupon) |
| `CouponCode` | `String` | Optional | The coupon code currently applied to the subscription | String getCouponCode() | setCouponCode(String couponCode) |
| `DateField` | [`SubscriptionDateField`](../../doc/models/subscription-date-field.md) | Optional | The type of filter you'd like to apply to your search.  Allowed Values: , current_period_ends_at, current_period_starts_at, created_at, activated_at, canceled_at, expires_at, trial_started_at, trial_ended_at, updated_at | SubscriptionDateField getDateField() | setDateField(SubscriptionDateField dateField) |
| `StartDate` | `LocalDate` | Optional | The start date (format YYYY-MM-DD) with which to filter the date_field. Returns subscriptions with a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date specified. Use in query `start_date=2022-07-01`. | LocalDate getStartDate() | setStartDate(LocalDate startDate) |
| `EndDate` | `LocalDate` | Optional | The end date (format YYYY-MM-DD) with which to filter the date_field. Returns subscriptions with a timestamp up to and including 11:59:59PM in your site’s time zone on the date specified. Use in query `end_date=2022-08-01`. | LocalDate getEndDate() | setEndDate(LocalDate endDate) |
| `StartDatetime` | `ZonedDateTime` | Optional | The start date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field. Returns subscriptions with a timestamp at or after exact time provided in query. You can specify timezone in query - otherwise your site's time zone will be used. If provided, this parameter will be used instead of start_date. Use in query `start_datetime=2022-07-01 09:00:05`. | ZonedDateTime getStartDatetime() | setStartDatetime(ZonedDateTime startDatetime) |
| `EndDatetime` | `ZonedDateTime` | Optional | The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field. Returns subscriptions with a timestamp at or before exact time provided in query. You can specify timezone in query - otherwise your site's time zone will be used. If provided, this parameter will be used instead of end_date. Use in query `end_datetime=2022-08-01 10:00:05`. | ZonedDateTime getEndDatetime() | setEndDatetime(ZonedDateTime endDatetime) |
| `Metadata` | `Map<String, String>` | Optional | The value of the metadata field specified in the parameter. Use in query `metadata[my-field]=value&metadata[other-field]=another_value`. | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `Direction` | [`SortingDirection`](../../doc/models/sorting-direction.md) | Optional | Controls the order in which results are returned.<br>Use in query `direction=asc`. | SortingDirection getDirection() | setDirection(SortingDirection direction) |
| `Sort` | [`SubscriptionSort`](../../doc/models/subscription-sort.md) | Optional | The attribute by which to sort<br><br>**Default**: `SubscriptionSort.SIGNUP_DATE` | SubscriptionSort getSort() | setSort(SubscriptionSort sort) |
| `Include` | [`List<SubscriptionListInclude>`](../../doc/models/subscription-list-include.md) | Optional | Allows including additional data in the response. Use in query: `include[]=self_service_page_token`. | List<SubscriptionListInclude> getInclude() | setInclude(List<SubscriptionListInclude> include) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.ListSubscriptionsInput;
import com.maxio.advancedbilling.models.SortingDirection;
import com.maxio.advancedbilling.models.SubscriptionDateField;
import com.maxio.advancedbilling.models.SubscriptionListInclude;
import com.maxio.advancedbilling.models.SubscriptionSort;
import com.maxio.advancedbilling.models.SubscriptionStateFilter;
import java.util.Arrays;
import java.util.LinkedHashMap;

ListSubscriptionsInput listSubscriptionsInput = new ListSubscriptionsInput.Builder()
    .page(1)
    .perPage(50)
    .state(SubscriptionStateFilter.SUSPENDED)
    .product(22)
    .productPricePointId(234)
    .coupon(84)
    .couponCode("coupon_code4")
    .dateField(SubscriptionDateField.TRIAL_STARTED_AT)
    .startDate(DateTimeHelper.fromSimpleDate("2022-07-01"))
    .endDate(DateTimeHelper.fromSimpleDate("2022-08-01"))
    .startDatetime(DateTimeHelper.fromRfc8601DateTime("2022-07-01 09:00:05"))
    .endDatetime(DateTimeHelper.fromRfc8601DateTime("2022-08-01 10:00:05"))
    .metadata(new LinkedHashMap<String, String>() {{
        put("key0", "metadata3");
        put("key1", "metadata4");
        put("key2", "metadata5");
    }})
    .direction(SortingDirection.ASC)
    .sort(SubscriptionSort.SIGNUP_DATE)
    .include(Arrays.asList(
        SubscriptionListInclude.SELF_SERVICE_PAGE_TOKEN
    ))
    .build();
```

