
# List Proforma Invoices Response

## Structure

`ListProformaInvoicesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ProformaInvoices` | [`List<ProformaInvoice>`](../../doc/models/proforma-invoice.md) | Optional | - | List<ProformaInvoice> getProformaInvoices() | setProformaInvoices(List<ProformaInvoice> proformaInvoices) |
| `Meta` | [`ListProformaInvoicesMeta`](../../doc/models/list-proforma-invoices-meta.md) | Optional | - | ListProformaInvoicesMeta getMeta() | setMeta(ListProformaInvoicesMeta meta) |

## Example

```java
import com.maxio.advancedbilling.models.ListProformaInvoicesMeta;
import com.maxio.advancedbilling.models.ListProformaInvoicesResponse;
import com.maxio.advancedbilling.models.ProformaInvoice;
import java.util.Arrays;

ListProformaInvoicesResponse listProformaInvoicesResponse = new ListProformaInvoicesResponse.Builder()
    .proformaInvoices(Arrays.asList(
        new ProformaInvoice.Builder()
            .uid("uid0")
            .siteId(140)
            .customerId(252)
            .subscriptionId(68)
            .number(56)
            .build(),
        new ProformaInvoice.Builder()
            .uid("uid0")
            .siteId(140)
            .customerId(252)
            .subscriptionId(68)
            .number(56)
            .build(),
        new ProformaInvoice.Builder()
            .uid("uid0")
            .siteId(140)
            .customerId(252)
            .subscriptionId(68)
            .number(56)
            .build()
    ))
    .meta(new ListProformaInvoicesMeta.Builder()
        .totalCount(150)
        .currentPage(126)
        .totalPages(138)
        .statusCode(168)
        .build())
    .build();
```

