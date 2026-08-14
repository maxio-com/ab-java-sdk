
# Change Invoice Collection Method Event

## Structure

`ChangeInvoiceCollectionMethodEvent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `long` | Required | - | long getId() | setId(long id) |
| `Timestamp` | `ZonedDateTime` | Required | - | ZonedDateTime getTimestamp() | setTimestamp(ZonedDateTime timestamp) |
| `Invoice` | [`Invoice`](../../doc/models/invoice.md) | Required | - | Invoice getInvoice() | setInvoice(Invoice invoice) |
| `EventType` | [`InvoiceEventType`](../../doc/models/invoice-event-type.md) | Required | **Default**: `InvoiceEventType.CHANGE_INVOICE_COLLECTION_METHOD` | InvoiceEventType getEventType() | setEventType(InvoiceEventType eventType) |
| `EventData` | [`ChangeInvoiceCollectionMethodEventData`](../../doc/models/change-invoice-collection-method-event-data.md) | Required | Example schema for an `change_invoice_collection_method` event | ChangeInvoiceCollectionMethodEventData getEventData() | setEventData(ChangeInvoiceCollectionMethodEventData eventData) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.ChangeInvoiceCollectionMethodEvent;
import com.maxio.advancedbilling.models.ChangeInvoiceCollectionMethodEventData;
import com.maxio.advancedbilling.models.Invoice;
import com.maxio.advancedbilling.models.InvoiceEventType;

ChangeInvoiceCollectionMethodEvent changeInvoiceCollectionMethodEvent = new ChangeInvoiceCollectionMethodEvent.Builder(
    110L,
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
    InvoiceEventType.CHANGE_INVOICE_COLLECTION_METHOD,
    new ChangeInvoiceCollectionMethodEventData.Builder(
        "from_collection_method4",
        "to_collection_method8"
    )
    .build()
)
.build();
```

