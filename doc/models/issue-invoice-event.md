
# Issue Invoice Event

## Structure

`IssueInvoiceEvent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `long` | Required | - | long getId() | setId(long id) |
| `Timestamp` | `ZonedDateTime` | Required | - | ZonedDateTime getTimestamp() | setTimestamp(ZonedDateTime timestamp) |
| `Invoice` | [`Invoice`](../../doc/models/invoice.md) | Required | - | Invoice getInvoice() | setInvoice(Invoice invoice) |
| `EventType` | [`InvoiceEventType`](../../doc/models/invoice-event-type.md) | Required | **Default**: `InvoiceEventType.ISSUE_INVOICE` | InvoiceEventType getEventType() | setEventType(InvoiceEventType eventType) |
| `EventData` | [`IssueInvoiceEventData`](../../doc/models/issue-invoice-event-data.md) | Required | Example schema for an `issue_invoice` event | IssueInvoiceEventData getEventData() | setEventData(IssueInvoiceEventData eventData) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.Invoice;
import com.maxio.advancedbilling.models.InvoiceConsolidationLevel;
import com.maxio.advancedbilling.models.InvoiceEventType;
import com.maxio.advancedbilling.models.InvoiceStatus;
import com.maxio.advancedbilling.models.IssueInvoiceEvent;
import com.maxio.advancedbilling.models.IssueInvoiceEventData;

IssueInvoiceEvent issueInvoiceEvent = new IssueInvoiceEvent.Builder(
    144L,
    DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
    new Invoice.Builder()
        .id(166L)
        .uid("uid6")
        .siteId(92)
        .customerId(204)
        .subscriptionId(20)
        .issueDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
        .dueDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
        .paidDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
        .publicUrlExpiresOn(DateTimeHelper.fromSimpleDate("2024-01-21"))
        .build(),
    InvoiceEventType.ISSUE_INVOICE,
    new IssueInvoiceEventData.Builder(
        InvoiceConsolidationLevel.CHILD,
        InvoiceStatus.OPEN,
        InvoiceStatus.PENDING,
        "due_amount8",
        "total_amount2"
    )
    .build()
)
.build();
```

