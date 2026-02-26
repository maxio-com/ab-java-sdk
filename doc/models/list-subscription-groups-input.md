
# List Subscription Groups Input

Input structure for the method ListSubscriptionGroups

## Structure

`ListSubscriptionGroupsInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Page` | `Integer` | Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br><br>**Default**: `1`<br><br>**Constraints**: `>= 1` | Integer getPage() | setPage(Integer page) |
| `PerPage` | `Integer` | Optional | This parameter indicates how many records to fetch in each request. Default value is 20. The maximum allowed values is 200; any per_page value over 200 will be changed to 200.<br>Use in query `per_page=200`.<br><br>**Default**: `20`<br><br>**Constraints**: `<= 200` | Integer getPerPage() | setPerPage(Integer perPage) |
| `Include` | [`List<SubscriptionGroupsListInclude>`](../../doc/models/subscription-groups-list-include.md) | Optional | A list of additional information to include in the response. The following values are supported:<br><br>- `account_balances`: Account balance information for the subscription groups. Use in query: `include[]=account_balances` | List<SubscriptionGroupsListInclude> getInclude() | setInclude(List<SubscriptionGroupsListInclude> include) |

## Example

```java
import com.maxio.advancedbilling.models.ListSubscriptionGroupsInput;
import com.maxio.advancedbilling.models.SubscriptionGroupsListInclude;
import java.util.Arrays;

ListSubscriptionGroupsInput listSubscriptionGroupsInput = new ListSubscriptionGroupsInput.Builder()
    .page(1)
    .perPage(50)
    .include(Arrays.asList(
        SubscriptionGroupsListInclude.ACCOUNT_BALANCES
    ))
    .build();
```

