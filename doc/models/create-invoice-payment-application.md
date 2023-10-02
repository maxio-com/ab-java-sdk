
# Create Invoice Payment Application

## Structure

`CreateInvoicePaymentApplication`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `InvoiceUid` | `String` | Required | Unique identifier for the invoice. It has the prefix "inv_" followed by alphanumeric characters. | String getInvoiceUid() | setInvoiceUid(String invoiceUid) |
| `Amount` | `String` | Required | Dollar amount of the invoice payment (eg. "10.50" => $10.50). | String getAmount() | setAmount(String amount) |

## Example (as JSON)

```json
{
  "invoice_uid": "invoice_uid4",
  "amount": "amount6"
}
```

