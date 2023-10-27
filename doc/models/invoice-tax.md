
# Invoice Tax

## Structure

`InvoiceTax`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Optional | - | String getUid() | setUid(String uid) |
| `Title` | `String` | Optional | - | String getTitle() | setTitle(String title) |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `SourceType` | `String` | Optional | - | String getSourceType() | setSourceType(String sourceType) |
| `SourceId` | `Integer` | Optional | - | Integer getSourceId() | setSourceId(Integer sourceId) |
| `Percentage` | `String` | Optional | - | String getPercentage() | setPercentage(String percentage) |
| `TaxableAmount` | `String` | Optional | - | String getTaxableAmount() | setTaxableAmount(String taxableAmount) |
| `TaxAmount` | `String` | Optional | - | String getTaxAmount() | setTaxAmount(String taxAmount) |
| `TransactionId` | `Integer` | Optional | - | Integer getTransactionId() | setTransactionId(Integer transactionId) |
| `LineItemBreakouts` | [`List<InvoiceTaxBreakout>`](../../doc/models/invoice-tax-breakout.md) | Optional | - | List<InvoiceTaxBreakout> getLineItemBreakouts() | setLineItemBreakouts(List<InvoiceTaxBreakout> lineItemBreakouts) |
| `TaxComponentBreakouts` | [`List<InvoiceTaxComponentBreakout>`](../../doc/models/invoice-tax-component-breakout.md) | Optional | - | List<InvoiceTaxComponentBreakout> getTaxComponentBreakouts() | setTaxComponentBreakouts(List<InvoiceTaxComponentBreakout> taxComponentBreakouts) |

## Example (as JSON)

```json
{
  "uid": "uid8",
  "title": "title6",
  "description": "description2",
  "source_type": "source_type8",
  "source_id": 164
}
```

