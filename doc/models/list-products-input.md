
# List Products Input

Input structure for the method ListProducts

## Structure

`ListProductsInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DateField` | [`BasicDateField`](../../doc/models/basic-date-field.md) | Optional | The type of filter you would like to apply to your search.<br>Use in query: `date_field=created_at`. | BasicDateField getDateField() | setDateField(BasicDateField dateField) |
| `Filter` | [`ListProductsFilter`](../../doc/models/list-products-filter.md) | Optional | Filter to use for List Products operations | ListProductsFilter getFilter() | setFilter(ListProductsFilter filter) |
| `EndDate` | `LocalDate` | Optional | The end date (format YYYY-MM-DD) with which to filter the date_field. Returns products with a timestamp up to and including 11:59:59PM in your site’s time zone on the date specified. | LocalDate getEndDate() | setEndDate(LocalDate endDate) |
| `EndDatetime` | `ZonedDateTime` | Optional | The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field. Returns products with a timestamp at or before exact time provided in query. You can specify timezone in query - otherwise your site''s time zone will be used. If provided, this parameter will be used instead of end_date. | ZonedDateTime getEndDatetime() | setEndDatetime(ZonedDateTime endDatetime) |
| `StartDate` | `LocalDate` | Optional | The start date (format YYYY-MM-DD) with which to filter the date_field. Returns products with a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date specified. | LocalDate getStartDate() | setStartDate(LocalDate startDate) |
| `StartDatetime` | `ZonedDateTime` | Optional | The start date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field. Returns products with a timestamp at or after exact time provided in query. You can specify timezone in query - otherwise your site''s time zone will be used. If provided, this parameter will be used instead of start_date. | ZonedDateTime getStartDatetime() | setStartDatetime(ZonedDateTime startDatetime) |
| `Page` | `Integer` | Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br><br>**Default**: `1`<br><br>**Constraints**: `>= 1` | Integer getPage() | setPage(Integer page) |
| `PerPage` | `Integer` | Optional | This parameter indicates how many records to fetch in each request. Default value is 20. The maximum allowed values is 200; any per_page value over 200 will be changed to 200.<br>Use in query `per_page=200`.<br><br>**Default**: `20`<br><br>**Constraints**: `<= 200` | Integer getPerPage() | setPerPage(Integer perPage) |
| `IncludeArchived` | `Boolean` | Optional | Include archived products. Use in query: `include_archived=true`. | Boolean getIncludeArchived() | setIncludeArchived(Boolean includeArchived) |
| `Include` | [`ListProductsInclude`](../../doc/models/list-products-include.md) | Optional | Allows including additional data in the response. Use in query `include=prepaid_product_price_point`. | ListProductsInclude getInclude() | setInclude(ListProductsInclude include) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.BasicDateField;
import com.maxio.advancedbilling.models.ListProductsFilter;
import com.maxio.advancedbilling.models.ListProductsInclude;
import com.maxio.advancedbilling.models.ListProductsInput;
import com.maxio.advancedbilling.models.PrepaidProductPricePointFilter;
import java.util.Arrays;

ListProductsInput listProductsInput = new ListProductsInput.Builder()
    .dateField(BasicDateField.UPDATED_AT)
    .filter(new ListProductsFilter.Builder()
        .ids(Arrays.asList(
            1,
            2,
            3
        ))
        .prepaidProductPricePoint(new PrepaidProductPricePointFilter.Builder(
            "product_price_point_id2"
        )
        .build())
        .useSiteExchangeRate(false)
        .build())
    .endDate(DateTimeHelper.fromSimpleDate("2016-03-13"))
    .endDatetime(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .startDate(DateTimeHelper.fromSimpleDate("2016-03-13"))
    .startDatetime(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .page(1)
    .perPage(50)
    .includeArchived(true)
    .include(ListProductsInclude.PREPAID_PRODUCT_PRICE_POINT)
    .build();
```

