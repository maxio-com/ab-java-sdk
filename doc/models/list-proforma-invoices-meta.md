
# List Proforma Invoices Meta

## Structure

`ListProformaInvoicesMeta`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalCount` | `Integer` | Optional | - | Integer getTotalCount() | setTotalCount(Integer totalCount) |
| `CurrentPage` | `Integer` | Optional | - | Integer getCurrentPage() | setCurrentPage(Integer currentPage) |
| `TotalPages` | `Integer` | Optional | - | Integer getTotalPages() | setTotalPages(Integer totalPages) |
| `StatusCode` | `Integer` | Optional | - | Integer getStatusCode() | setStatusCode(Integer statusCode) |

## Example

```java
import com.maxio.advancedbilling.models.ListProformaInvoicesMeta;

ListProformaInvoicesMeta listProformaInvoicesMeta = new ListProformaInvoicesMeta.Builder()
    .totalCount(50)
    .currentPage(26)
    .totalPages(38)
    .statusCode(68)
    .build();
```

