
# Create Invoice Item

## Structure

`CreateInvoiceItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Title` | `String` | Optional | - | String getTitle() | setTitle(String title) |
| `Quantity` | [`CreateInvoiceItemQuantity`](../../doc/models/containers/create-invoice-item-quantity.md) | Optional | This is a container for one-of cases. | CreateInvoiceItemQuantity getQuantity() | setQuantity(CreateInvoiceItemQuantity quantity) |
| `UnitPrice` | [`CreateInvoiceItemUnitPrice`](../../doc/models/containers/create-invoice-item-unit-price.md) | Optional | This is a container for one-of cases. | CreateInvoiceItemUnitPrice getUnitPrice() | setUnitPrice(CreateInvoiceItemUnitPrice unitPrice) |
| `Taxable` | `Boolean` | Optional | Set to true to automatically calculate taxes. Site must be configured to use and calculate taxes. If using AvaTax, a tax_code parameter must also be sent. | Boolean getTaxable() | setTaxable(Boolean taxable) |
| `TaxCode` | `String` | Optional | A string representing the tax code related to the product type. This is especially important when using AvaTax to tax based on locale. This attribute has a max length of 25 characters. | String getTaxCode() | setTaxCode(String taxCode) |
| `PeriodRangeStart` | `String` | Optional | YYYY-MM-DD | String getPeriodRangeStart() | setPeriodRangeStart(String periodRangeStart) |
| `PeriodRangeEnd` | `String` | Optional | YYYY-MM-DD | String getPeriodRangeEnd() | setPeriodRangeEnd(String periodRangeEnd) |
| `ProductId` | [`CreateInvoiceItemProductId`](../../doc/models/containers/create-invoice-item-product-id.md) | Optional | This is a container for one-of cases. | CreateInvoiceItemProductId getProductId() | setProductId(CreateInvoiceItemProductId productId) |
| `ComponentId` | [`CreateInvoiceItemComponentId`](../../doc/models/containers/create-invoice-item-component-id.md) | Optional | This is a container for one-of cases. | CreateInvoiceItemComponentId getComponentId() | setComponentId(CreateInvoiceItemComponentId componentId) |
| `PricePointId` | [`CreateInvoiceItemPricePointId`](../../doc/models/containers/create-invoice-item-price-point-id.md) | Optional | This is a container for one-of cases. | CreateInvoiceItemPricePointId getPricePointId() | setPricePointId(CreateInvoiceItemPricePointId pricePointId) |
| `ProductPricePointId` | [`CreateInvoiceItemProductPricePointId`](../../doc/models/containers/create-invoice-item-product-price-point-id.md) | Optional | This is a container for one-of cases. | CreateInvoiceItemProductPricePointId getProductPricePointId() | setProductPricePointId(CreateInvoiceItemProductPricePointId productPricePointId) |
| `Description` | `String` | Optional | **Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |

## Example (as JSON)

```json
{
  "title": "title2",
  "quantity": 154.86,
  "unit_price": 138.08,
  "taxable": false,
  "tax_code": "tax_code4"
}
```

