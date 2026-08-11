
# Change Invoice Status Event

## Structure

`ChangeInvoiceStatusEvent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `long` | Required | - | long getId() | setId(long id) |
| `Timestamp` | `ZonedDateTime` | Required | - | ZonedDateTime getTimestamp() | setTimestamp(ZonedDateTime timestamp) |
| `Invoice` | [`Invoice`](../../doc/models/invoice.md) | Required | - | Invoice getInvoice() | setInvoice(Invoice invoice) |
| `EventType` | [`InvoiceEventType`](../../doc/models/invoice-event-type.md) | Required | **Default**: `InvoiceEventType.CHANGE_INVOICE_STATUS` | InvoiceEventType getEventType() | setEventType(InvoiceEventType eventType) |
| `EventData` | [`ChangeInvoiceStatusEventData`](../../doc/models/change-invoice-status-event-data.md) | Required | Example schema for an `change_invoice_status` event | ChangeInvoiceStatusEventData getEventData() | setEventData(ChangeInvoiceStatusEventData eventData) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.ChangeInvoiceStatusEvent;
import com.maxio.advancedbilling.models.ChangeInvoiceStatusEventData;
import com.maxio.advancedbilling.models.Invoice;
import com.maxio.advancedbilling.models.InvoiceConsolidationLevel;
import com.maxio.advancedbilling.models.InvoiceEventType;
import com.maxio.advancedbilling.models.InvoiceStatus;

ChangeInvoiceStatusEvent changeInvoiceStatusEvent = new ChangeInvoiceStatusEvent.Builder(
    148L,
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
    InvoiceEventType.CHANGE_INVOICE_STATUS,
    new ChangeInvoiceStatusEventData.Builder(
        InvoiceStatus.OPEN,
        InvoiceStatus.PENDING
    )
    .gatewayTransId("gateway_trans_id2")
    .amount("amount8")
    .consolidationLevel(InvoiceConsolidationLevel.CHILD)
    .build()
)
.build();
```

