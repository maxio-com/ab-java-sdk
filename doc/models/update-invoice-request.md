
# Update Invoice Request

Request payload for updating a draft ad hoc invoice.

## Structure

`UpdateInvoiceRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Invoice` | [`UpdateInvoice`](../../doc/models/update-invoice.md) | Required | Attributes of a draft ad hoc invoice which can be updated. Only the submitted attributes are changed. | UpdateInvoice getInvoice() | setInvoice(UpdateInvoice invoice) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.UpdateInvoice;
import com.maxio.advancedbilling.models.UpdateInvoiceItem;
import com.maxio.advancedbilling.models.UpdateInvoiceRequest;
import com.maxio.advancedbilling.models.containers.UpdateInvoiceItemQuantity;
import com.maxio.advancedbilling.models.containers.UpdateInvoiceItemUnitPrice;
import java.util.Arrays;

UpdateInvoiceRequest updateInvoiceRequest = new UpdateInvoiceRequest.Builder(
    new UpdateInvoice.Builder()
        .lineItems(Arrays.asList(
            new UpdateInvoiceItem.Builder()
                .title("title4")
                .quantity(UpdateInvoiceItemQuantity.fromPrecision(
                    56.68D
                ))
                .unitPrice(UpdateInvoiceItemUnitPrice.fromPrecision(
                    39.9D
                ))
                .taxable(false)
                .taxCode("tax_code6")
                .build(),
            new UpdateInvoiceItem.Builder()
                .title("title4")
                .quantity(UpdateInvoiceItemQuantity.fromPrecision(
                    56.68D
                ))
                .unitPrice(UpdateInvoiceItemUnitPrice.fromPrecision(
                    39.9D
                ))
                .taxable(false)
                .taxCode("tax_code6")
                .build(),
            new UpdateInvoiceItem.Builder()
                .title("title4")
                .quantity(UpdateInvoiceItemQuantity.fromPrecision(
                    56.68D
                ))
                .unitPrice(UpdateInvoiceItemUnitPrice.fromPrecision(
                    39.9D
                ))
                .taxable(false)
                .taxCode("tax_code6")
                .build()
        ))
        .issueDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
        .netTerms(144)
        .paymentInstructions("payment_instructions6")
        .memo("memo0")
        .build()
)
.build();
```

