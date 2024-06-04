
# Void Invoice Event

## Structure

`VoidInvoiceEvent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `long` | Required | - | long getId() | setId(long id) |
| `Timestamp` | `ZonedDateTime` | Required | - | ZonedDateTime getTimestamp() | setTimestamp(ZonedDateTime timestamp) |
| `Invoice` | [`Invoice`](../../doc/models/invoice.md) | Required | - | Invoice getInvoice() | setInvoice(Invoice invoice) |
| `EventType` | [`InvoiceEventType`](../../doc/models/invoice-event-type.md) | Required | **Default**: `InvoiceEventType.VOID_INVOICE` | InvoiceEventType getEventType() | setEventType(InvoiceEventType eventType) |
| `EventData` | [`VoidInvoiceEventData`](../../doc/models/void-invoice-event-data.md) | Required | Example schema for an `void_invoice` event | VoidInvoiceEventData getEventData() | setEventData(VoidInvoiceEventData eventData) |

## Example (as JSON)

```json
{
  "id": 16,
  "timestamp": "2016-03-13T12:52:32.123Z",
  "invoice": {
    "issue_date": "2024-01-01",
    "due_date": "2024-01-01",
    "paid_date": "2024-01-01",
    "id": 166,
    "uid": "uid6",
    "site_id": 92,
    "customer_id": 204,
    "subscription_id": 20
  },
  "event_type": "void_invoice",
  "event_data": {
    "credit_note_attributes": {
      "uid": "uid2",
      "site_id": 72,
      "customer_id": 184,
      "subscription_id": 0,
      "number": "number0"
    },
    "memo": "memo0",
    "applied_amount": "applied_amount2",
    "transaction_time": "2016-03-13T12:52:32.123Z",
    "is_advance_invoice": false,
    "reason": "reason2"
  }
}
```

