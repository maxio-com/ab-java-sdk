
# List Webhooks Input

Input structure for the method ListWebhooks

## Structure

`ListWebhooksInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | [`WebhookStatus`](../../doc/models/webhook-status.md) | Optional | Webhooks with matching status would be returned. | WebhookStatus getStatus() | setStatus(WebhookStatus status) |
| `SinceDate` | `String` | Optional | Format YYYY-MM-DD. Returns Webhooks with the created_at date greater than or equal to the one specified. | String getSinceDate() | setSinceDate(String sinceDate) |
| `UntilDate` | `String` | Optional | Format YYYY-MM-DD. Returns Webhooks with the created_at date less than or equal to the one specified. | String getUntilDate() | setUntilDate(String untilDate) |
| `Page` | `Integer` | Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br><br>**Default**: `1`<br><br>**Constraints**: `>= 1` | Integer getPage() | setPage(Integer page) |
| `PerPage` | `Integer` | Optional | This parameter indicates how many records to fetch in each request. Default value is 20. The maximum allowed values is 200; any per_page value over 200 will be changed to 200.<br>Use in query `per_page=200`.<br><br>**Default**: `20`<br><br>**Constraints**: `<= 200` | Integer getPerPage() | setPerPage(Integer perPage) |
| `Order` | [`WebhookOrder`](../../doc/models/webhook-order.md) | Optional | The order in which the Webhooks are returned. | WebhookOrder getOrder() | setOrder(WebhookOrder order) |
| `Subscription` | `Integer` | Optional | The Advanced Billing id of a subscription you'd like to filter for | Integer getSubscription() | setSubscription(Integer subscription) |

## Example

```java
import com.maxio.advancedbilling.models.ListWebhooksInput;
import com.maxio.advancedbilling.models.WebhookOrder;
import com.maxio.advancedbilling.models.WebhookStatus;

ListWebhooksInput listWebhooksInput = new ListWebhooksInput.Builder()
    .status(WebhookStatus.SUCCESSFUL)
    .sinceDate("since_date4")
    .untilDate("until_date6")
    .page(1)
    .perPage(50)
    .order(WebhookOrder.NEWEST_FIRST)
    .subscription(152)
    .build();
```

