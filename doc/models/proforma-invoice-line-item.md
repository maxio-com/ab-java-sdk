
# Proforma Invoice Line Item

## Structure

`ProformaInvoiceLineItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Optional | - | String getUid() | setUid(String uid) |
| `Title` | `String` | Optional | - | String getTitle() | setTitle(String title) |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `Quantity` | `String` | Optional | - | String getQuantity() | setQuantity(String quantity) |
| `UnitPrice` | `String` | Optional | - | String getUnitPrice() | setUnitPrice(String unitPrice) |
| `SubtotalAmount` | `String` | Optional | - | String getSubtotalAmount() | setSubtotalAmount(String subtotalAmount) |
| `DiscountAmount` | `String` | Optional | - | String getDiscountAmount() | setDiscountAmount(String discountAmount) |
| `TaxAmount` | `String` | Optional | - | String getTaxAmount() | setTaxAmount(String taxAmount) |
| `TotalAmount` | `String` | Optional | - | String getTotalAmount() | setTotalAmount(String totalAmount) |
| `TieredUnitPrice` | `Boolean` | Optional | - | Boolean getTieredUnitPrice() | setTieredUnitPrice(Boolean tieredUnitPrice) |
| `PeriodRangeStart` | `String` | Optional | - | String getPeriodRangeStart() | setPeriodRangeStart(String periodRangeStart) |
| `PeriodRangeEnd` | `String` | Optional | - | String getPeriodRangeEnd() | setPeriodRangeEnd(String periodRangeEnd) |
| `ProductId` | `Integer` | Optional | - | Integer getProductId() | setProductId(Integer productId) |
| `ProductVersion` | `Integer` | Optional | - | Integer getProductVersion() | setProductVersion(Integer productVersion) |
| `ProductPricePointId` | `Integer` | Optional | - | Integer getProductPricePointId() | setProductPricePointId(Integer productPricePointId) |
| `ComponentId` | `String` | Optional | - | String getComponentId() | setComponentId(String componentId) |
| `PricePointId` | `String` | Optional | - | String getPricePointId() | setPricePointId(String pricePointId) |

## Example (as JSON)

```json
{
  "uid": "uid6",
  "title": "title2",
  "description": "description6",
  "quantity": "quantity2",
  "unit_price": "unit_price4"
}
```

