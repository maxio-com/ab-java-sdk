
# Payment Method External

## Structure

`PaymentMethodExternal`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Details` | `String` | Required | - | String getDetails() | setDetails(String details) |
| `Kind` | `String` | Required | - | String getKind() | setKind(String kind) |
| `Memo` | `String` | Required | - | String getMemo() | setMemo(String memo) |
| `Type` | [`InvoiceEventPaymentMethod`](../../doc/models/invoice-event-payment-method.md) | Required | - | InvoiceEventPaymentMethod getType() | setType(InvoiceEventPaymentMethod type) |

## Example (as JSON)

```json
{
  "details": "details4",
  "kind": "kind2",
  "memo": "memo8",
  "type": "bank_account"
}
```

