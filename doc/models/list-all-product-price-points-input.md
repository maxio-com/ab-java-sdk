
# List All Product Price Points Input

Input structure for the method ListAllProductPricePoints

## Structure

`ListAllProductPricePointsInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Direction` | [`SortingDirection`](../../doc/models/sorting-direction.md) | Optional | Controls the order in which results are returned.<br>Use in query `direction=asc`. | SortingDirection getDirection() | setDirection(SortingDirection direction) |
| `Filter` | [`ListPricePointsFilter`](../../doc/models/list-price-points-filter.md) | Optional | Filter to use for List PricePoints operations | ListPricePointsFilter getFilter() | setFilter(ListPricePointsFilter filter) |
| `Include` | [`ListProductsPricePointsInclude`](../../doc/models/list-products-price-points-include.md) | Optional | Allows including additional data in the response. Use in query: `include=currency_prices`. | ListProductsPricePointsInclude getInclude() | setInclude(ListProductsPricePointsInclude include) |
| `Page` | `Integer` | Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br><br>**Default**: `1`<br><br>**Constraints**: `>= 1` | Integer getPage() | setPage(Integer page) |
| `PerPage` | `Integer` | Optional | This parameter indicates how many records to fetch in each request. Default value is 20. The maximum allowed values is 200; any per_page value over 200 will be changed to 200.<br>Use in query `per_page=200`.<br><br>**Default**: `20`<br><br>**Constraints**: `<= 200` | Integer getPerPage() | setPerPage(Integer perPage) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.BasicDateField;
import com.maxio.advancedbilling.models.ListAllProductPricePointsInput;
import com.maxio.advancedbilling.models.ListPricePointsFilter;
import com.maxio.advancedbilling.models.ListProductsPricePointsInclude;
import com.maxio.advancedbilling.models.PricePointType;
import com.maxio.advancedbilling.models.SortingDirection;
import java.util.Arrays;

ListAllProductPricePointsInput listAllProductPricePointsInput = new ListAllProductPricePointsInput.Builder()
    .direction(SortingDirection.ASC)
    .filter(new ListPricePointsFilter.Builder()
        .dateField(BasicDateField.UPDATED_AT)
        .startDate(DateTimeHelper.fromSimpleDate("2011-12-17"))
        .endDate(DateTimeHelper.fromSimpleDate("2011-12-15"))
        .startDatetime(DateTimeHelper.fromRfc8601DateTime("12/19/2011 09:15:30"))
        .endDatetime(DateTimeHelper.fromRfc8601DateTime("06/07/2019 17:20:06"))
        .type(Arrays.asList(
            PricePointType.CATALOG,
            PricePointType.ENUM_DEFAULT,
            PricePointType.CUSTOM
        ))
        .ids(Arrays.asList(
            1,
            2,
            3
        ))
        .build())
    .include(ListProductsPricePointsInclude.CURRENCY_PRICES)
    .page(1)
    .perPage(50)
    .build();
```

