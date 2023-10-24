
# Invoice Line Item Event Data

## Structure

`InvoiceLineItemEventData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Optional | - | String getUid() | setUid(String uid) |
| `Title` | `String` | Optional | - | String getTitle() | setTitle(String title) |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `Quantity` | `Integer` | Optional | - | Integer getQuantity() | setQuantity(Integer quantity) |
| `QuantityDelta` | `Integer` | Optional | - | Integer getQuantityDelta() | setQuantityDelta(Integer quantityDelta) |
| `UnitPrice` | `String` | Optional | - | String getUnitPrice() | setUnitPrice(String unitPrice) |
| `PeriodRangeStart` | `String` | Optional | - | String getPeriodRangeStart() | setPeriodRangeStart(String periodRangeStart) |
| `PeriodRangeEnd` | `String` | Optional | - | String getPeriodRangeEnd() | setPeriodRangeEnd(String periodRangeEnd) |
| `Amount` | `String` | Optional | - | String getAmount() | setAmount(String amount) |
| `LineReferences` | `String` | Optional | - | String getLineReferences() | setLineReferences(String lineReferences) |
| `PricingDetailsIndex` | `Integer` | Optional | - | Integer getPricingDetailsIndex() | setPricingDetailsIndex(Integer pricingDetailsIndex) |
| `PricingDetails` | [`List<InvoiceLineItemPricingDetail>`](../../doc/models/invoice-line-item-pricing-detail.md) | Optional | - | List<InvoiceLineItemPricingDetail> getPricingDetails() | setPricingDetails(List<InvoiceLineItemPricingDetail> pricingDetails) |
| `TaxCode` | `String` | Optional | - | String getTaxCode() | setTaxCode(String taxCode) |
| `TaxAmount` | `String` | Optional | - | String getTaxAmount() | setTaxAmount(String taxAmount) |
| `ProductId` | `Integer` | Optional | - | Integer getProductId() | setProductId(Integer productId) |
| `ProductPricePointId` | `Integer` | Optional | - | Integer getProductPricePointId() | setProductPricePointId(Integer productPricePointId) |
| `PricePointId` | `Integer` | Optional | - | Integer getPricePointId() | setPricePointId(Integer pricePointId) |
| `ComponentId` | `Integer` | Optional | - | Integer getComponentId() | setComponentId(Integer componentId) |
| `BillingScheduleItemId` | `Integer` | Optional | - | Integer getBillingScheduleItemId() | setBillingScheduleItemId(Integer billingScheduleItemId) |
| `CustomItem` | `Boolean` | Optional | - | Boolean getCustomItem() | setCustomItem(Boolean customItem) |

## Example (as JSON)

```json
{
  "uid": "uid4",
  "title": "title0",
  "description": "description6",
  "quantity": 40,
  "quantity_delta": 114
}
```

