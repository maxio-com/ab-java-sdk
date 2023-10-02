
# Proforma Invoice Credit

## Structure

`ProformaInvoiceCredit`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getUid() | setUid(String uid) |
| `Memo` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getMemo() | setMemo(String memo) |
| `OriginalAmount` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getOriginalAmount() | setOriginalAmount(String originalAmount) |
| `AppliedAmount` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getAppliedAmount() | setAppliedAmount(String appliedAmount) |

## Example (as JSON)

```json
{
  "uid": "uid8",
  "memo": "memo2",
  "original_amount": "original_amount2",
  "applied_amount": "applied_amount0"
}
```

