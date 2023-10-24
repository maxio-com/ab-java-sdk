
# Proforma Invoice Tax

## Structure

`ProformaInvoiceTax`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getUid() | setUid(String uid) |
| `Title` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getTitle() | setTitle(String title) |
| `SourceType` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getSourceType() | setSourceType(String sourceType) |
| `Percentage` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getPercentage() | setPercentage(String percentage) |
| `TaxableAmount` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getTaxableAmount() | setTaxableAmount(String taxableAmount) |
| `TaxAmount` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getTaxAmount() | setTaxAmount(String taxAmount) |
| `LineItemBreakouts` | [`List<ProformaInvoiceTaxBreakout>`](../../doc/models/proforma-invoice-tax-breakout.md) | Optional | **Constraints**: *Minimum Items*: `1`, *Unique Items Required* | List<ProformaInvoiceTaxBreakout> getLineItemBreakouts() | setLineItemBreakouts(List<ProformaInvoiceTaxBreakout> lineItemBreakouts) |

## Example (as JSON)

```json
{
  "uid": "uid8",
  "title": "title4",
  "source_type": "source_type8",
  "percentage": "percentage6",
  "taxable_amount": "taxable_amount2"
}
```

