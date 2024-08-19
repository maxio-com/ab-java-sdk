
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

## Example (as JSON)

```json
{
  "id": 246,
  "timestamp": "2016-03-13T12:52:32.123Z",
  "invoice": {
    "issue_date": "2024-01-01",
    "due_date": "2024-01-01",
    "paid_date": "2024-01-01",
    "public_url_expires_on": "2024-01-21",
    "id": 166,
    "uid": "uid6",
    "site_id": 92,
    "customer_id": 204,
    "subscription_id": 20
  },
  "event_type": "change_invoice_collection_method",
  "event_data": {
    "from_collection_method": "from_collection_method4",
    "to_collection_method": "to_collection_method8"
  }
}
```

