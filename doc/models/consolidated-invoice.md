
# Consolidated Invoice

## Structure

`ConsolidatedInvoice`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Invoices` | [`List<Invoice>`](../../doc/models/invoice.md) | Optional | - | List<Invoice> getInvoices() | setInvoices(List<Invoice> invoices) |

## Example

```java
import com.maxio.advancedbilling.models.ConsolidatedInvoice;
import com.maxio.advancedbilling.models.Invoice;
import java.util.Arrays;

ConsolidatedInvoice consolidatedInvoice = new ConsolidatedInvoice.Builder()
    .invoices(Arrays.asList(
        new Invoice.Builder()
            .id(196L)
            .uid("uid6")
            .siteId(122)
            .customerId(234)
            .subscriptionId(50)
            .build(),
        new Invoice.Builder()
            .id(196L)
            .uid("uid6")
            .siteId(122)
            .customerId(234)
            .subscriptionId(50)
            .build(),
        new Invoice.Builder()
            .id(196L)
            .uid("uid6")
            .siteId(122)
            .customerId(234)
            .subscriptionId(50)
            .build()
    ))
    .build();
```

