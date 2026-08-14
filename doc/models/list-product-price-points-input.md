
# List Product Price Points Input

Input structure for the method ListProductPricePoints

## Structure

`ListProductPricePointsInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ProductId` | [`ListProductPricePointsInputProductId`](../../doc/models/containers/list-product-price-points-input-product-id.md) | Required | This is a container for one-of cases. | ListProductPricePointsInputProductId getProductId() | setProductId(ListProductPricePointsInputProductId productId) |
| `Page` | `Integer` | Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br><br>**Default**: `1`<br><br>**Constraints**: `>= 1` | Integer getPage() | setPage(Integer page) |
| `PerPage` | `Integer` | Optional | This parameter indicates how many records to fetch in each request. Default value is 10. The maximum allowed values is 200; any per_page value over 200 will be changed to 200.<br><br>**Default**: `10`<br><br>**Constraints**: `<= 200` | Integer getPerPage() | setPerPage(Integer perPage) |
| `CurrencyPrices` | `Boolean` | Optional | (Optional) If you have defined multiple currencies at the site level, you can pass ?currency_prices=true to include an array of currency price data in the response. If the product price point is set to use_site_exchange_rate: true, it will return pricing based on the current exchange rate. If the flag is set to false, it will return all of the defined prices for each currency. | Boolean getCurrencyPrices() | setCurrencyPrices(Boolean currencyPrices) |
| `FilterType` | [`List<PricePointType>`](../../doc/models/price-point-type.md) | Optional | Use in query: `filter[type]=catalog,default`. | List<PricePointType> getFilterType() | setFilterType(List<PricePointType> filterType) |
| `Archived` | `Boolean` | Optional | Set to include archived price points in the response. | Boolean getArchived() | setArchived(Boolean archived) |

## Example

```java
import com.maxio.advancedbilling.models.ListProductPricePointsInput;
import com.maxio.advancedbilling.models.containers.ListProductPricePointsInputProductId;

ListProductPricePointsInput listProductPricePointsInput = new ListProductPricePointsInput.Builder(
    ListProductPricePointsInputProductId.fromNumber(
        124
    )
)
.page(1)
.perPage(10)
.currencyPrices(false)
.filterType(Liquid error: Value cannot be null. (Parameter 'key'))
.archived(false)
.build();
```

