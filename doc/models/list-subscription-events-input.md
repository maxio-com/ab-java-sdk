
# List Subscription Events Input

Input structure for the method ListSubscriptionEvents

## Structure

`ListSubscriptionEventsInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SubscriptionId` | `int` | Required | The Chargify id of the subscription. | int getSubscriptionId() | setSubscriptionId(int subscriptionId) |
| `Page` | `Integer` | Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br><br>**Default**: `1`<br><br>**Constraints**: `>= 1` | Integer getPage() | setPage(Integer page) |
| `PerPage` | `Integer` | Optional | This parameter indicates how many records to fetch in each request. Default value is 20. The maximum allowed values is 200; any per_page value over 200 will be changed to 200.<br>Use in query `per_page=200`.<br><br>**Default**: `20`<br><br>**Constraints**: `<= 200` | Integer getPerPage() | setPerPage(Integer perPage) |
| `SinceId` | `Long` | Optional | Returns events with an id greater than or equal to the one specified. | Long getSinceId() | setSinceId(Long sinceId) |
| `MaxId` | `Long` | Optional | Returns events with an id less than or equal to the one specified. | Long getMaxId() | setMaxId(Long maxId) |
| `Direction` | [`Direction`](../../doc/models/direction.md) | Optional | The sort direction of the returned events.<br><br>**Default**: `Direction.DESC` | Direction getDirection() | setDirection(Direction direction) |
| `Filter` | [`List<EventKey>`](../../doc/models/event-key.md) | Optional | You can pass multiple event keys after comma.<br>Use in query `filter=signup_success,payment_success`. | List<EventKey> getFilter() | setFilter(List<EventKey> filter) |

## Example

```java
import com.maxio.advancedbilling.models.Direction;
import com.maxio.advancedbilling.models.EventKey;
import com.maxio.advancedbilling.models.ListSubscriptionEventsInput;
import java.util.Arrays;

ListSubscriptionEventsInput listSubscriptionEventsInput = new ListSubscriptionEventsInput.Builder(
    222
)
.page(1)
.perPage(50)
.sinceId(104L)
.maxId(0L)
.direction(Direction.DESC)
.filter(Arrays.asList(
        EventKey.CUSTOM_FIELD_VALUE_CHANGE,
        EventKey.PAYMENT_SUCCESS
    ))
.build();
```

