
# Invoice Previous Balance

## Structure

`InvoicePreviousBalance`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CapturedAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getCapturedAt() | setCapturedAt(ZonedDateTime capturedAt) |
| `Invoices` | [`List<InvoiceBalanceItem>`](../../doc/models/invoice-balance-item.md) | Optional | - | List<InvoiceBalanceItem> getInvoices() | setInvoices(List<InvoiceBalanceItem> invoices) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.InvoiceBalanceItem;
import com.maxio.advancedbilling.models.InvoicePreviousBalance;
import java.util.Arrays;

InvoicePreviousBalance invoicePreviousBalance = new InvoicePreviousBalance.Builder()
    .capturedAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .invoices(Arrays.asList(
        new InvoiceBalanceItem.Builder()
            .uid("uid6")
            .number("number6")
            .outstandingAmount("outstanding_amount8")
            .build(),
        new InvoiceBalanceItem.Builder()
            .uid("uid6")
            .number("number6")
            .outstandingAmount("outstanding_amount8")
            .build(),
        new InvoiceBalanceItem.Builder()
            .uid("uid6")
            .number("number6")
            .outstandingAmount("outstanding_amount8")
            .build()
    ))
    .build();
```

