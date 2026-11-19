
# Proforma Invoice Tax

## Structure

`ProformaInvoiceTax`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getUid() | setUid(String uid) |
| `Title` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getTitle() | setTitle(String title) |
| `SourceType` | [`ProformaInvoiceTaxSourceType`](../../doc/models/proforma-invoice-tax-source-type.md) | Optional | The source of the tax. `Tax` is a tax configured in Advanced Billing. The other values identify the tax service that calculated the tax. | ProformaInvoiceTaxSourceType getSourceType() | setSourceType(ProformaInvoiceTaxSourceType sourceType) |
| `Percentage` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getPercentage() | setPercentage(String percentage) |
| `TaxableAmount` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getTaxableAmount() | setTaxableAmount(String taxableAmount) |
| `TaxAmount` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getTaxAmount() | setTaxAmount(String taxAmount) |
| `LineItemBreakouts` | [`List<InvoiceTaxBreakout>`](../../doc/models/invoice-tax-breakout.md) | Optional | **Constraints**: *Minimum Items*: `1`, *Unique Items Required* | List<InvoiceTaxBreakout> getLineItemBreakouts() | setLineItemBreakouts(List<InvoiceTaxBreakout> lineItemBreakouts) |

## Example

```java
import com.maxio.advancedbilling.models.ProformaInvoiceTax;
import com.maxio.advancedbilling.models.ProformaInvoiceTaxSourceType;

ProformaInvoiceTax proformaInvoiceTax = new ProformaInvoiceTax.Builder()
    .uid("uid4")
    .title("title0")
    .sourceType(ProformaInvoiceTaxSourceType.NUMERAL)
    .percentage("percentage2")
    .taxableAmount("taxable_amount8")
    .build();
```

