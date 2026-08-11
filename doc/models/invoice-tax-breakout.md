
# Invoice Tax Breakout

## Structure

`InvoiceTaxBreakout`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Optional | - | String getUid() | setUid(String uid) |
| `TaxableAmount` | `String` | Optional | - | String getTaxableAmount() | setTaxableAmount(String taxableAmount) |
| `TaxAmount` | `String` | Optional | - | String getTaxAmount() | setTaxAmount(String taxAmount) |
| `TaxExemptAmount` | `String` | Optional | - | String getTaxExemptAmount() | setTaxExemptAmount(String taxExemptAmount) |

## Example

```java
import com.maxio.advancedbilling.models.InvoiceTaxBreakout;

InvoiceTaxBreakout invoiceTaxBreakout = new InvoiceTaxBreakout.Builder()
    .uid("uid4")
    .taxableAmount("taxable_amount8")
    .taxAmount("tax_amount2")
    .taxExemptAmount("tax_exempt_amount4")
    .build();
```

