
# List Invoices Response

## Structure

`ListInvoicesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Invoices` | [`List<Invoice>`](../../doc/models/invoice.md) | Required | - | List<Invoice> getInvoices() | setInvoices(List<Invoice> invoices) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.Invoice;
import com.maxio.advancedbilling.models.ListInvoicesResponse;
import java.util.Arrays;

ListInvoicesResponse listInvoicesResponse = new ListInvoicesResponse.Builder(
    Arrays.asList(
        new Invoice.Builder()
            .id(196L)
            .uid("uid6")
            .siteId(122)
            .customerId(234)
            .subscriptionId(50)
            .issueDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
            .dueDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
            .paidDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
            .publicUrlExpiresOn(DateTimeHelper.fromSimpleDate("2024-01-21"))
            .build()
    )
)
.build();
```

