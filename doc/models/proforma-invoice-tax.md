
# Proforma Invoice Tax

## Structure

`ProformaInvoiceTax`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getUid() | setUid(String uid) |
| `Title` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getTitle() | setTitle(String title) |
| `SourceType` | [`ProformaInvoiceTaxSourceType`](../../doc/models/proforma-invoice-tax-source-type.md) | Optional | - | ProformaInvoiceTaxSourceType getSourceType() | setSourceType(ProformaInvoiceTaxSourceType sourceType) |
| `Percentage` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getPercentage() | setPercentage(String percentage) |
| `TaxableAmount` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getTaxableAmount() | setTaxableAmount(String taxableAmount) |
| `TaxAmount` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getTaxAmount() | setTaxAmount(String taxAmount) |
| `LineItemBreakouts` | [`List<InvoiceTaxBreakout>`](../../doc/models/invoice-tax-breakout.md) | Optional | **Constraints**: *Minimum Items*: `1`, *Unique Items Required* | List<InvoiceTaxBreakout> getLineItemBreakouts() | setLineItemBreakouts(List<InvoiceTaxBreakout> lineItemBreakouts) |

## Example (as JSON)

```json
{
  "uid": "uid8",
  "title": "title4",
  "source_type": "Tax",
  "percentage": "percentage6",
  "taxable_amount": "taxable_amount2"
}
```

