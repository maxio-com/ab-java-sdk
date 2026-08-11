
# Create Invoice Request

## Structure

`CreateInvoiceRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Invoice` | [`CreateInvoice`](../../doc/models/create-invoice.md) | Required | - | CreateInvoice getInvoice() | setInvoice(CreateInvoice invoice) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.CreateInvoice;
import com.maxio.advancedbilling.models.CreateInvoiceItem;
import com.maxio.advancedbilling.models.CreateInvoiceRequest;
import com.maxio.advancedbilling.models.CreateInvoiceStatus;
import com.maxio.advancedbilling.models.containers.CreateInvoiceItemQuantity;
import com.maxio.advancedbilling.models.containers.CreateInvoiceItemUnitPrice;
import java.util.Arrays;

CreateInvoiceRequest createInvoiceRequest = new CreateInvoiceRequest.Builder(
    new CreateInvoice.Builder()
        .lineItems(Arrays.asList(
            new CreateInvoiceItem.Builder()
                .title("title4")
                .quantity(CreateInvoiceItemQuantity.fromPrecision(
                    56.68D
                ))
                .unitPrice(CreateInvoiceItemUnitPrice.fromPrecision(
                    39.9D
                ))
                .taxable(false)
                .taxCode("tax_code6")
                .build(),
            new CreateInvoiceItem.Builder()
                .title("title4")
                .quantity(CreateInvoiceItemQuantity.fromPrecision(
                    56.68D
                ))
                .unitPrice(CreateInvoiceItemUnitPrice.fromPrecision(
                    39.9D
                ))
                .taxable(false)
                .taxCode("tax_code6")
                .build(),
            new CreateInvoiceItem.Builder()
                .title("title4")
                .quantity(CreateInvoiceItemQuantity.fromPrecision(
                    56.68D
                ))
                .unitPrice(CreateInvoiceItemUnitPrice.fromPrecision(
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
        .status(CreateInvoiceStatus.DRAFT)
        .build()
)
.build();
```

