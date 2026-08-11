
# Update Invoice Item

A line item change for a draft ad hoc invoice. Supports the same attributes as line items on invoice creation, plus `uid` and `_destroy` for updating or removing existing line items.

## Structure

`UpdateInvoiceItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Title` | `String` | Optional | - | String getTitle() | setTitle(String title) |
| `Quantity` | [`UpdateInvoiceItemQuantity`](../../doc/models/containers/update-invoice-item-quantity.md) | Optional | This is a container for one-of cases. | UpdateInvoiceItemQuantity getQuantity() | setQuantity(UpdateInvoiceItemQuantity quantity) |
| `UnitPrice` | [`UpdateInvoiceItemUnitPrice`](../../doc/models/containers/update-invoice-item-unit-price.md) | Optional | This is a container for one-of cases. | UpdateInvoiceItemUnitPrice getUnitPrice() | setUnitPrice(UpdateInvoiceItemUnitPrice unitPrice) |
| `Taxable` | `Boolean` | Optional | Set to true to automatically calculate taxes. Site must be configured to use and calculate taxes. If using AvaTax, a tax_code parameter must also be sent. | Boolean getTaxable() | setTaxable(Boolean taxable) |
| `TaxCode` | `String` | Optional | A string representing the tax code related to the product type. This is especially important when using AvaTax to tax based on locale. This attribute has a max length of 25 characters. | String getTaxCode() | setTaxCode(String taxCode) |
| `PeriodRangeStart` | `String` | Optional | YYYY-MM-DD | String getPeriodRangeStart() | setPeriodRangeStart(String periodRangeStart) |
| `PeriodRangeEnd` | `String` | Optional | YYYY-MM-DD | String getPeriodRangeEnd() | setPeriodRangeEnd(String periodRangeEnd) |
| `ProductId` | [`UpdateInvoiceItemProductId`](../../doc/models/containers/update-invoice-item-product-id.md) | Optional | This is a container for one-of cases. | UpdateInvoiceItemProductId getProductId() | setProductId(UpdateInvoiceItemProductId productId) |
| `ComponentId` | [`UpdateInvoiceItemComponentId`](../../doc/models/containers/update-invoice-item-component-id.md) | Optional | This is a container for one-of cases. | UpdateInvoiceItemComponentId getComponentId() | setComponentId(UpdateInvoiceItemComponentId componentId) |
| `PricePointId` | [`UpdateInvoiceItemPricePointId`](../../doc/models/containers/update-invoice-item-price-point-id.md) | Optional | This is a container for one-of cases. | UpdateInvoiceItemPricePointId getPricePointId() | setPricePointId(UpdateInvoiceItemPricePointId pricePointId) |
| `ProductPricePointId` | [`UpdateInvoiceItemProductPricePointId`](../../doc/models/containers/update-invoice-item-product-price-point-id.md) | Optional | This is a container for one-of cases. | UpdateInvoiceItemProductPricePointId getProductPricePointId() | setProductPricePointId(UpdateInvoiceItemProductPricePointId productPricePointId) |
| `Description` | `String` | Optional | **Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Uid` | `String` | Optional | Unique identifier of an existing line item on the invoice. When provided, the matching line item is updated with the submitted attributes. When omitted, a new line item is added to the invoice. | String getUid() | setUid(String uid) |
| `Destroy` | `Boolean` | Optional | Set to `true` together with `uid` to remove the matching line item from the invoice. Line items not referenced in the request remain unchanged. | Boolean getDestroy() | setDestroy(Boolean destroy) |

## Example

```java
import com.maxio.advancedbilling.models.UpdateInvoiceItem;
import com.maxio.advancedbilling.models.containers.UpdateInvoiceItemQuantity;
import com.maxio.advancedbilling.models.containers.UpdateInvoiceItemUnitPrice;

UpdateInvoiceItem updateInvoiceItem = new UpdateInvoiceItem.Builder()
    .title("title8")
    .quantity(UpdateInvoiceItemQuantity.fromPrecision(
        94.82D
    ))
    .unitPrice(UpdateInvoiceItemUnitPrice.fromPrecision(
        78.04D
    ))
    .taxable(false)
    .taxCode("tax_code0")
    .build();
```

