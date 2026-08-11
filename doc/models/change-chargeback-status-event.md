
# Change Chargeback Status Event

## Structure

`ChangeChargebackStatusEvent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `long` | Required | - | long getId() | setId(long id) |
| `Timestamp` | `ZonedDateTime` | Required | - | ZonedDateTime getTimestamp() | setTimestamp(ZonedDateTime timestamp) |
| `Invoice` | [`Invoice`](../../doc/models/invoice.md) | Required | - | Invoice getInvoice() | setInvoice(Invoice invoice) |
| `EventType` | [`InvoiceEventType`](../../doc/models/invoice-event-type.md) | Required | **Default**: `InvoiceEventType.CHANGE_CHARGEBACK_STATUS` | InvoiceEventType getEventType() | setEventType(InvoiceEventType eventType) |
| `EventData` | [`ChangeChargebackStatusEventData`](../../doc/models/change-chargeback-status-event-data.md) | Required | Example schema for an `change_chargeback_status` event | ChangeChargebackStatusEventData getEventData() | setEventData(ChangeChargebackStatusEventData eventData) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.ChangeChargebackStatusEvent;
import com.maxio.advancedbilling.models.ChangeChargebackStatusEventData;
import com.maxio.advancedbilling.models.ChargebackStatus;
import com.maxio.advancedbilling.models.Invoice;
import com.maxio.advancedbilling.models.InvoiceEventType;

ChangeChargebackStatusEvent changeChargebackStatusEvent = new ChangeChargebackStatusEvent.Builder(
    136L,
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
    InvoiceEventType.CHANGE_CHARGEBACK_STATUS,
    new ChangeChargebackStatusEventData.Builder(
        ChargebackStatus.WON
    )
    .build()
)
.build();
```

