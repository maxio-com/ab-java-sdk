
# List Mrr Per Subscription Input

Input structure for the method ListMrrPerSubscription

## Structure

`ListMrrPerSubscriptionInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Filter` | [`ListMrrFilter`](../../doc/models/list-mrr-filter.md) | Optional | Filter to use for List MRR per subscription operation | ListMrrFilter getFilter() | setFilter(ListMrrFilter filter) |
| `AtTime` | `String` | Optional | Submit a timestamp in ISO8601 format to request MRR for a historic time. Use in query: `at_time=2022-01-10T10:00:00-05:00`. | String getAtTime() | setAtTime(String atTime) |
| `Page` | `Integer` | Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br><br>**Default**: `1`<br><br>**Constraints**: `>= 1` | Integer getPage() | setPage(Integer page) |
| `PerPage` | `Integer` | Optional | This parameter indicates how many records to fetch in each request. Default value is 20. The maximum allowed values is 200; any per_page value over 200 will be changed to 200.<br>Use in query `per_page=200`.<br><br>**Default**: `20`<br><br>**Constraints**: `<= 200` | Integer getPerPage() | setPerPage(Integer perPage) |
| `Direction` | [`Direction`](../../doc/models/direction.md) | Optional | Controls the order in which results are returned. Records are ordered by subscription_id in ascending order by default. Use in query `direction=desc`. | Direction getDirection() | setDirection(Direction direction) |

## Example

```java
import com.maxio.advancedbilling.models.Direction;
import com.maxio.advancedbilling.models.ListMrrFilter;
import com.maxio.advancedbilling.models.ListMrrPerSubscriptionInput;
import java.util.Arrays;

ListMrrPerSubscriptionInput listMrrPerSubscriptionInput = new ListMrrPerSubscriptionInput.Builder()
    .filter(new ListMrrFilter.Builder()
        .subscriptionIds(Arrays.asList(
            1,
            2,
            3
        ))
        .build())
    .atTime("at_time=2022-01-10T10:00:00-05:00")
    .page(1)
    .perPage(50)
    .direction(Direction.DESC)
    .build();
```

