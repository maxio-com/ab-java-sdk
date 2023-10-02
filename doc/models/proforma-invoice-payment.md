
# Proforma Invoice Payment

## Structure

`ProformaInvoicePayment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Memo` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getMemo() | setMemo(String memo) |
| `OriginalAmount` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getOriginalAmount() | setOriginalAmount(String originalAmount) |
| `AppliedAmount` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getAppliedAmount() | setAppliedAmount(String appliedAmount) |
| `Prepayment` | `Boolean` | Optional | - | Boolean getPrepayment() | setPrepayment(Boolean prepayment) |

## Example (as JSON)

```json
{
  "memo": "memo4",
  "original_amount": "original_amount4",
  "applied_amount": "applied_amount8",
  "prepayment": false
}
```

