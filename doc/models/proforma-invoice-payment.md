
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

## Example

```java
import com.maxio.advancedbilling.models.ProformaInvoicePayment;

ProformaInvoicePayment proformaInvoicePayment = new ProformaInvoicePayment.Builder()
    .memo("memo2")
    .originalAmount("original_amount2")
    .appliedAmount("applied_amount0")
    .prepayment(false)
    .build();
```

