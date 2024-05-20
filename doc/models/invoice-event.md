
# Invoice Event

## Structure

`InvoiceEvent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Long` | Optional | - | Long getId() | setId(Long id) |
| `EventType` | [`InvoiceEventType`](../../doc/models/invoice-event-type.md) | Optional | Invoice Event Type | InvoiceEventType getEventType() | setEventType(InvoiceEventType eventType) |
| `EventData` | [`InvoiceEventEventData`](../../doc/models/containers/invoice-event-event-data.md) | Optional | This is a container for any-of cases. | InvoiceEventEventData getEventData() | setEventData(InvoiceEventEventData eventData) |
| `Timestamp` | `ZonedDateTime` | Optional | - | ZonedDateTime getTimestamp() | setTimestamp(ZonedDateTime timestamp) |
| `Invoice` | [`Invoice`](../../doc/models/invoice.md) | Optional | - | Invoice getInvoice() | setInvoice(Invoice invoice) |

## Example (as JSON)

```json
{
  "id": 78,
  "event_type": "create_debit_note",
  "event_data": {
    "uid": "uid2",
    "credit_note_number": "credit_note_number4",
    "credit_note_uid": "credit_note_uid4",
    "original_amount": "original_amount6",
    "applied_amount": "applied_amount6",
    "transaction_time": "2016-03-13T12:52:32.123Z",
    "memo": "memo6",
    "role": "role4",
    "consolidated_invoice": false,
    "applied_credit_notes": [
      {
        "uid": "uid4",
        "number": "number8"
      },
      {
        "uid": "uid4",
        "number": "number8"
      }
    ]
  },
  "timestamp": "2016-03-13T12:52:32.123Z",
  "invoice": {
    "id": 166,
    "uid": "uid6",
    "site_id": 92,
    "customer_id": 204,
    "subscription_id": 20
  }
}
```

