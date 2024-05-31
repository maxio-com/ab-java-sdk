
# Create Debit Note Event

## Structure

`CreateDebitNoteEvent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `long` | Required | - | long getId() | setId(long id) |
| `Timestamp` | `ZonedDateTime` | Required | - | ZonedDateTime getTimestamp() | setTimestamp(ZonedDateTime timestamp) |
| `Invoice` | [`Invoice`](../../doc/models/invoice.md) | Required | - | Invoice getInvoice() | setInvoice(Invoice invoice) |
| `EventType` | [`InvoiceEventType`](../../doc/models/invoice-event-type.md) | Required | **Default**: `InvoiceEventType.CREATE_DEBIT_NOTE` | InvoiceEventType getEventType() | setEventType(InvoiceEventType eventType) |
| `EventData` | [`DebitNote`](../../doc/models/debit-note.md) | Required | Example schema for an `create_debit_note` event | DebitNote getEventData() | setEventData(DebitNote eventData) |

## Example (as JSON)

```json
{
  "id": 98,
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
  "event_type": "create_debit_note",
  "event_data": {
    "uid": "uid6",
    "site_id": 132,
    "customer_id": 244,
    "subscription_id": 60,
    "number": 64
  }
}
```

