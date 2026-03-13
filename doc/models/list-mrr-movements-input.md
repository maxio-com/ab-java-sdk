
# List Mrr Movements Input

Input structure for the method ListMrrMovements

## Structure

`ListMrrMovementsInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SubscriptionId` | `Integer` | Optional | optionally filter results by subscription | Integer getSubscriptionId() | setSubscriptionId(Integer subscriptionId) |
| `Page` | `Integer` | Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br><br>**Default**: `1`<br><br>**Constraints**: `>= 1` | Integer getPage() | setPage(Integer page) |
| `PerPage` | `Integer` | Optional | This parameter indicates how many records to fetch in each request. Default value is 10. The maximum allowed values is 50; any per_page value over 50 will be changed to 50.<br>Use in query `per_page=20`.<br><br>**Default**: `10`<br><br>**Constraints**: `<= 50` | Integer getPerPage() | setPerPage(Integer perPage) |
| `Direction` | [`SortingDirection`](../../doc/models/sorting-direction.md) | Optional | Controls the order in which results are returned.<br>Use in query `direction=asc`. | SortingDirection getDirection() | setDirection(SortingDirection direction) |

## Example

```java
import com.maxio.advancedbilling.models.ListMrrMovementsInput;
import com.maxio.advancedbilling.models.SortingDirection;

ListMrrMovementsInput listMrrMovementsInput = new ListMrrMovementsInput.Builder()
    .subscriptionId(222)
    .page(1)
    .perPage(20)
    .direction(SortingDirection.ASC)
    .build();
```

