
# Invoice Payment Application

## Structure

`InvoicePaymentApplication`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `InvoiceUid` | `String` | Optional | Unique identifier for the paid invoice. It has the prefix "inv_" followed by alphanumeric characters. | String getInvoiceUid() | setInvoiceUid(String invoiceUid) |
| `ApplicationUid` | `String` | Optional | Unique identifier for the payment. It has the prefix "pmt_" followed by alphanumeric characters. | String getApplicationUid() | setApplicationUid(String applicationUid) |
| `AppliedAmount` | `String` | Optional | Dollar amount of the paid invoice. | String getAppliedAmount() | setAppliedAmount(String appliedAmount) |

## Example (as JSON)

```json
{
  "invoice_uid": "invoice_uid2",
  "application_uid": "application_uid4",
  "applied_amount": "applied_amount6"
}
```

