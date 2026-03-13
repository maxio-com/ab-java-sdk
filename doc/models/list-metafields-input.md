
# List Metafields Input

Input structure for the method ListMetafields

## Structure

`ListMetafieldsInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ResourceType` | [`ResourceType`](../../doc/models/resource-type.md) | Required | The resource type to which the metafields belong. | ResourceType getResourceType() | setResourceType(ResourceType resourceType) |
| `Name` | `String` | Optional | Filter by the name of the metafield. | String getName() | setName(String name) |
| `Page` | `Integer` | Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br><br>**Default**: `1`<br><br>**Constraints**: `>= 1` | Integer getPage() | setPage(Integer page) |
| `PerPage` | `Integer` | Optional | This parameter indicates how many records to fetch in each request. Default value is 20. The maximum allowed values is 200; any per_page value over 200 will be changed to 200.<br>Use in query `per_page=200`.<br><br>**Default**: `20`<br><br>**Constraints**: `<= 200` | Integer getPerPage() | setPerPage(Integer perPage) |
| `Direction` | [`SortingDirection`](../../doc/models/sorting-direction.md) | Optional | Controls the order in which results are returned.<br>Use in query `direction=asc`. | SortingDirection getDirection() | setDirection(SortingDirection direction) |

## Example

```java
import com.maxio.advancedbilling.models.ListMetafieldsInput;
import com.maxio.advancedbilling.models.ResourceType;
import com.maxio.advancedbilling.models.SortingDirection;

ListMetafieldsInput listMetafieldsInput = new ListMetafieldsInput.Builder(
    ResourceType.SUBSCRIPTIONS
)
.name("name0")
.page(1)
.perPage(50)
.direction(SortingDirection.ASC)
.build();
```

