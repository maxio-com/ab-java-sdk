
# Invoice Line Item Pricing Detail

## Structure

`InvoiceLineItemPricingDetail`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Label` | `String` | Optional | - | String getLabel() | setLabel(String label) |
| `Amount` | `String` | Optional | - | String getAmount() | setAmount(String amount) |

## Example

```java
import com.maxio.advancedbilling.models.InvoiceLineItemPricingDetail;

InvoiceLineItemPricingDetail invoiceLineItemPricingDetail = new InvoiceLineItemPricingDetail.Builder()
    .label("label4")
    .amount("amount6")
    .build();
```

