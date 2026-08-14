
# List Coupons Input

Input structure for the method ListCoupons

## Structure

`ListCouponsInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Page` | `Integer` | Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br><br>**Default**: `1`<br><br>**Constraints**: `>= 1` | Integer getPage() | setPage(Integer page) |
| `PerPage` | `Integer` | Optional | This parameter indicates how many records to fetch in each request. Default value is 30. The maximum allowed values is 200; any per_page value over 200 will be changed to 200.<br>Use in query `per_page=200`.<br><br>**Default**: `30`<br><br>**Constraints**: `<= 200` | Integer getPerPage() | setPerPage(Integer perPage) |
| `Filter` | [`ListCouponsFilter`](../../doc/models/list-coupons-filter.md) | Optional | Filter to use for List Coupons operations | ListCouponsFilter getFilter() | setFilter(ListCouponsFilter filter) |
| `CurrencyPrices` | `Boolean` | Optional | (Optional) If you have defined multiple currencies at the site level, you can pass `?currency_prices=true` to include an array of currency price data in the response. Use in query `currency_prices=true`. | Boolean getCurrencyPrices() | setCurrencyPrices(Boolean currencyPrices) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.BasicDateField;
import com.maxio.advancedbilling.models.ListCouponsFilter;
import com.maxio.advancedbilling.models.ListCouponsInput;
import java.util.Arrays;

ListCouponsInput listCouponsInput = new ListCouponsInput.Builder()
    .page(1)
    .perPage(50)
    .filter(new ListCouponsFilter.Builder()
        .dateField(BasicDateField.UPDATED_AT)
        .startDate(DateTimeHelper.fromSimpleDate("2011-12-17"))
        .endDate(DateTimeHelper.fromSimpleDate("2011-12-15"))
        .startDatetime(DateTimeHelper.fromRfc8601DateTime("12/19/2011 09:15:30"))
        .endDatetime(DateTimeHelper.fromRfc8601DateTime("06/07/2019 17:20:06"))
        .ids(Arrays.asList(
            1,
            2,
            3
        ))
        .codes(Arrays.asList(
            "free",
            "free_trial"
        ))
        .build())
    .currencyPrices(true)
    .build();
```

