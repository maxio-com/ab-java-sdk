
# List Invoice Events Input

Input structure for the method ListInvoiceEvents

## Structure

`ListInvoiceEventsInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SinceDate` | `String` | Optional | The timestamp in a format `YYYY-MM-DD T HH:MM:SS Z`, or `YYYY-MM-DD`(in this case, it returns data from the beginning of the day). of the event from which you want to start the search. All the events before the `since_date` timestamp are not returned in the response. | String getSinceDate() | setSinceDate(String sinceDate) |
| `SinceId` | `Long` | Optional | The ID of the event from which you want to start the search(ID is not included. e.g. if ID is set to 2, then all events with ID 3 and more will be shown) This parameter is not used if since_date is defined. | Long getSinceId() | setSinceId(Long sinceId) |
| `Page` | `Integer` | Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br><br>**Default**: `1`<br><br>**Constraints**: `>= 1` | Integer getPage() | setPage(Integer page) |
| `PerPage` | `Integer` | Optional | This parameter indicates how many records to fetch in each request. Default value is 100. The maximum allowed values is 200; any per_page value over 200 will be changed to 200.<br><br>**Default**: `100` | Integer getPerPage() | setPerPage(Integer perPage) |
| `InvoiceUid` | `String` | Optional | Providing an invoice_uid allows for scoping of the invoice events to a single invoice or credit note. | String getInvoiceUid() | setInvoiceUid(String invoiceUid) |
| `WithChangeInvoiceStatus` | `String` | Optional | Use this parameter if you want to fetch also invoice events with change_invoice_status type. | String getWithChangeInvoiceStatus() | setWithChangeInvoiceStatus(String withChangeInvoiceStatus) |
| `EventTypes` | [`List<InvoiceEventType>`](../../doc/models/invoice-event-type.md) | Optional | Filter results by event_type. Supply a comma separated list of event types (listed above). Use in query: `event_types=void_invoice,void_remainder`. | List<InvoiceEventType> getEventTypes() | setEventTypes(List<InvoiceEventType> eventTypes) |

## Example

```java
import com.maxio.advancedbilling.models.InvoiceEventType;
import com.maxio.advancedbilling.models.ListInvoiceEventsInput;
import java.util.Arrays;

ListInvoiceEventsInput listInvoiceEventsInput = new ListInvoiceEventsInput.Builder()
    .sinceDate("since_date4")
    .sinceId(104L)
    .page(1)
    .perPage(100)
    .invoiceUid("invoice_uid0")
    .withChangeInvoiceStatus("with_change_invoice_status2")
    .eventTypes(Arrays.asList(
        InvoiceEventType.APPLY_PAYMENT,
        InvoiceEventType.APPLY_DEBIT_NOTE
    ))
    .build();
```

