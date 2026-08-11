
# List Usages Input

Input structure for the method ListUsages

## Structure

`ListUsagesInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SubscriptionIdOrReference` | [`ListUsagesInputSubscriptionIdOrReference`](../../doc/models/containers/list-usages-input-subscription-id-or-reference.md) | Required | This is a container for one-of cases. | ListUsagesInputSubscriptionIdOrReference getSubscriptionIdOrReference() | setSubscriptionIdOrReference(ListUsagesInputSubscriptionIdOrReference subscriptionIdOrReference) |
| `ComponentId` | [`ListUsagesInputComponentId`](../../doc/models/containers/list-usages-input-component-id.md) | Required | This is a container for one-of cases. | ListUsagesInputComponentId getComponentId() | setComponentId(ListUsagesInputComponentId componentId) |
| `SinceId` | `Long` | Optional | Returns usages with an id greater than or equal to the one specified. | Long getSinceId() | setSinceId(Long sinceId) |
| `MaxId` | `Long` | Optional | Returns usages with an id less than or equal to the one specified. | Long getMaxId() | setMaxId(Long maxId) |
| `SinceDate` | `LocalDate` | Optional | Returns usages with a created_at date greater than or equal to midnight (12:00 AM) on the date specified. | LocalDate getSinceDate() | setSinceDate(LocalDate sinceDate) |
| `UntilDate` | `LocalDate` | Optional | Returns usages with a created_at date less than or equal to midnight (12:00 AM) on the date specified. | LocalDate getUntilDate() | setUntilDate(LocalDate untilDate) |
| `Page` | `Integer` | Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br><br>**Default**: `1`<br><br>**Constraints**: `>= 1` | Integer getPage() | setPage(Integer page) |
| `PerPage` | `Integer` | Optional | This parameter indicates how many records to fetch in each request. Default value is 20. The maximum allowed values is 200; any per_page value over 200 will be changed to 200.<br>Use in query `per_page=200`.<br><br>**Default**: `20`<br><br>**Constraints**: `<= 200` | Integer getPerPage() | setPerPage(Integer perPage) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.ListUsagesInput;
import com.maxio.advancedbilling.models.containers.ListUsagesInputComponentId;
import com.maxio.advancedbilling.models.containers.ListUsagesInputSubscriptionIdOrReference;

ListUsagesInput listUsagesInput = new ListUsagesInput.Builder(
    ListUsagesInputSubscriptionIdOrReference.fromNumber(
        234
    ),
    ListUsagesInputComponentId.fromNumber(
        144
    )
)
.sinceId(104L)
.maxId(0L)
.sinceDate(DateTimeHelper.fromSimpleDate("2016-03-13"))
.untilDate(DateTimeHelper.fromSimpleDate("2016-03-13"))
.page(1)
.perPage(50)
.build();
```

