
# Invoice Line Item

## Structure

`InvoiceLineItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Optional | Unique identifier for the line item.  Useful when cross-referencing the line against individual discounts in the `discounts` or `taxes` lists. | String getUid() | setUid(String uid) |
| `Title` | `String` | Optional | A short descriptor for the charge or item represented by this line. | String getTitle() | setTitle(String title) |
| `Description` | `String` | Optional | Detailed description for the charge or item represented by this line.  May include proration details in plain text.<br><br>Note: this string may contain line breaks that are hints for the best display format on the invoice. | String getDescription() | setDescription(String description) |
| `Quantity` | `String` | Optional | The quantity or count of units billed by the line item.<br><br>This is a decimal number represented as a string. (See "About Decimal Numbers".) | String getQuantity() | setQuantity(String quantity) |
| `UnitPrice` | `String` | Optional | The price per unit for the line item.<br><br>When tiered pricing was used (i.e. not every unit was actually priced at the same price) this will be the blended average cost per unit and the `tiered_unit_price` field will be set to `true`. | String getUnitPrice() | setUnitPrice(String unitPrice) |
| `SubtotalAmount` | `String` | Optional | The line subtotal, generally calculated as `quantity * unit_price`. This is the canonical amount of record for the line - when rounding differences are in play, `subtotal_amount` takes precedence over the value derived from `quantity * unit_price` (which may not have the proper precision to exactly equal this amount). | String getSubtotalAmount() | setSubtotalAmount(String subtotalAmount) |
| `DiscountAmount` | `String` | Optional | The approximate discount applied to just this line.<br><br>The value is approximated in cases where rounding errors make it difficult to apportion exactly a total discount among many lines. Several lines may have been summed prior to applying the discount to arrive at `discount_amount` for the invoice - backing that out to the discount on a single line may introduce rounding or precision errors. | String getDiscountAmount() | setDiscountAmount(String discountAmount) |
| `TaxAmount` | `String` | Optional | The approximate tax applied to just this line.<br><br>The value is approximated in cases where rounding errors make it difficult to apportion exactly a total tax among many lines. Several lines may have been summed prior to applying the tax rate to arrive at `tax_amount` for the invoice - backing that out to the tax on a single line may introduce rounding or precision errors. | String getTaxAmount() | setTaxAmount(String taxAmount) |
| `TotalAmount` | `String` | Optional | The non-canonical total amount for the line.<br><br>`subtotal_amount` is the canonical amount for a line. The invoice `total_amount` is derived from the sum of the line `subtotal_amount`s and discounts or taxes applied thereafter.  Therefore, due to rounding or precision errors, the sum of line `total_amount`s may not equal the invoice `total_amount`. | String getTotalAmount() | setTotalAmount(String totalAmount) |
| `TieredUnitPrice` | `Boolean` | Optional | When `true`, indicates that the actual pricing scheme for the line was tiered, so the `unit_price` shown is the blended average for all units. | Boolean getTieredUnitPrice() | setTieredUnitPrice(Boolean tieredUnitPrice) |
| `PeriodRangeStart` | `String` | Optional | Start date for the period covered by this line. The format is `"YYYY-MM-DD"`.<br><br>* For periodic charges paid in advance, this date will match the billing date, and the end date will be in the future.<br>* For periodic charges paid in arrears (e.g. metered charges), this date will be the date of the previous billing, and the end date will be the current billing date.<br>* For non-periodic charges, this date and the end date will match. | String getPeriodRangeStart() | setPeriodRangeStart(String periodRangeStart) |
| `PeriodRangeEnd` | `String` | Optional | End date for the period covered by this line. The format is `"YYYY-MM-DD"`.<br><br>* For periodic charges paid in advance, this date will match the next (future) billing date.<br>* For periodic charges paid in arrears (e.g. metered charges), this date will be the date of the current billing date.<br>* For non-periodic charges, this date and the start date will match. | String getPeriodRangeEnd() | setPeriodRangeEnd(String periodRangeEnd) |
| `TransactionId` | `Integer` | Optional | - | Integer getTransactionId() | setTransactionId(Integer transactionId) |
| `ProductId` | `Integer` | Optional | The ID of the product subscribed when the charge was made.<br><br>This may be set even for component charges, so true product-only (non-component) charges will also have a nil `component_id`. | Integer getProductId() | setProductId(Integer productId) |
| `ProductVersion` | `Integer` | Optional | The version of the product subscribed when the charge was made. | Integer getProductVersion() | setProductVersion(Integer productVersion) |
| `ComponentId` | `Integer` | Optional | The ID of the component being billed. Will be `nil` for non-component charges. | Integer getComponentId() | setComponentId(Integer componentId) |
| `PricePointId` | `Integer` | Optional | The price point ID of the component being billed. Will be `nil` for non-component charges. | Integer getPricePointId() | setPricePointId(Integer pricePointId) |
| `Hide` | `Boolean` | Optional | - | Boolean getHide() | setHide(Boolean hide) |
| `ComponentCostData` | [`InvoiceLineItemComponentCostData2`](../../doc/models/containers/invoice-line-item-component-cost-data-2.md) | Optional | This is a container for one-of cases. | InvoiceLineItemComponentCostData2 getComponentCostData() | setComponentCostData(InvoiceLineItemComponentCostData2 componentCostData) |
| `ProductPricePointId` | `Integer` | Optional | The price point ID of the line item's product | Integer getProductPricePointId() | setProductPricePointId(Integer productPricePointId) |
| `CustomItem` | `Boolean` | Optional | - | Boolean getCustomItem() | setCustomItem(Boolean customItem) |

## Example (as JSON)

```json
{
  "uid": "uid4",
  "title": "title0",
  "description": "description4",
  "quantity": "quantity0",
  "unit_price": "unit_price2"
}
```

