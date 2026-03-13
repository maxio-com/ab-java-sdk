
# List Sales Reps Input

Input structure for the method ListSalesReps

## Structure

`ListSalesRepsInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SellerId` | `String` | Required | The Chargify id of your seller account | String getSellerId() | setSellerId(String sellerId) |
| `Authorization` | `String` | Optional | For authorization use user API key. See details [here](https://developers.chargify.com/docs/developer-docs/ZG9jOjMyNzk5NTg0-2020-04-20-new-api-authentication).<br><br>**Default**: `"Bearer <<apiKey>>"` | String getAuthorization() | setAuthorization(String authorization) |
| `LiveMode` | `Boolean` | Optional | This parameter indicates if records should be fetched from live mode sites. Default value is true. | Boolean getLiveMode() | setLiveMode(Boolean liveMode) |
| `Page` | `Integer` | Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br><br>**Default**: `1`<br><br>**Constraints**: `>= 1` | Integer getPage() | setPage(Integer page) |
| `PerPage` | `Integer` | Optional | This parameter indicates how many records to fetch in each request. Default value is 100.<br><br>**Default**: `100` | Integer getPerPage() | setPerPage(Integer perPage) |

## Example

```java
import com.maxio.advancedbilling.models.ListSalesRepsInput;

ListSalesRepsInput listSalesRepsInput = new ListSalesRepsInput.Builder(
    "seller_id8"
)
.authorization("Bearer <<apiKey>>")
.liveMode(false)
.page(1)
.perPage(100)
.build();
```

