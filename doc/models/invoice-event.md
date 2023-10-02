
# Invoice Event

## Structure

`InvoiceEvent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `EventType` | [`InvoiceEventTypeEnum`](../../doc/models/invoice-event-type-enum.md) | Optional | Invoice Event Type | InvoiceEventTypeEnum getEventType() | setEventType(InvoiceEventTypeEnum eventType) |
| `EventData` | [`InvoiceEventEventData`](../../doc/models/containers/invoice-event-event-data.md) | Optional | This is a container for any-of cases. | InvoiceEventEventData getEventData() | setEventData(InvoiceEventEventData eventData) |
| `Timestamp` | `String` | Optional | - | String getTimestamp() | setTimestamp(String timestamp) |
| `Invoice` | [`Invoice`](../../doc/models/invoice.md) | Optional | - | Invoice getInvoice() | setInvoice(Invoice invoice) |

## Example (as JSON)

```json
{
  "id": 78,
  "event_type": "issue_invoice",
  "event_data": {
    "memo": "memo8",
    "original_amount": "original_amount8",
    "applied_amount": "applied_amount4",
    "transaction_time": "transaction_time6",
    "payment_method": {
      "key1": "val1",
      "key2": "val2"
    }
  },
  "timestamp": "timestamp8",
  "invoice": {
    "uid": "uid6",
    "site_id": 92,
    "customer_id": 204,
    "subscription_id": 20,
    "number": "number6"
  }
}
```

