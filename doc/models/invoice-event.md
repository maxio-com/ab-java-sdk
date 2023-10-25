
# Invoice Event

## Structure

`InvoiceEvent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `EventType` | [`InvoiceEventType`](../../doc/models/invoice-event-type.md) | Optional | Invoice Event Type | InvoiceEventType getEventType() | setEventType(InvoiceEventType eventType) |
| `EventData` | [`InvoiceEventEventData`](../../doc/models/containers/invoice-event-event-data.md) | Optional | This is a container for any-of cases. | InvoiceEventEventData getEventData() | setEventData(InvoiceEventEventData eventData) |
| `Timestamp` | `String` | Optional | - | String getTimestamp() | setTimestamp(String timestamp) |
| `Invoice` | [`Invoice`](../../doc/models/invoice.md) | Optional | - | Invoice getInvoice() | setInvoice(Invoice invoice) |

## Example (as JSON)

```json
{
  "id": 78,
  "event_type": "remove_payment",
  "event_data": {
    "uid": "uid2",
    "credit_note_number": "credit_note_number4",
    "credit_note_uid": "credit_note_uid4",
    "original_amount": "original_amount6",
    "applied_amount": "applied_amount6"
  },
  "timestamp": "timestamp8",
  "invoice": {
    "id": 166,
    "uid": "uid6",
    "site_id": 92,
    "customer_id": 204,
    "subscription_id": 20
  }
}
```

