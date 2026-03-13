
# List Exported Proforma Invoices Input

Input structure for the method ListExportedProformaInvoices

## Structure

`ListExportedProformaInvoicesInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BatchId` | `String` | Required | Id of a Batch Job. | String getBatchId() | setBatchId(String batchId) |
| `PerPage` | `Integer` | Optional | This parameter indicates how many records to fetch in each request.<br>Default value is 100.<br>The maximum allowed values is 10000; any per_page value over 10000 will be changed to 10000.<br><br>**Default**: `100`<br><br>**Constraints**: `>= 1`, `<= 10000` | Integer getPerPage() | setPerPage(Integer perPage) |
| `Page` | `Integer` | Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br><br>**Default**: `1`<br><br>**Constraints**: `>= 1` | Integer getPage() | setPage(Integer page) |

## Example

```java
import com.maxio.advancedbilling.models.ListExportedProformaInvoicesInput;

ListExportedProformaInvoicesInput listExportedProformaInvoicesInput = new ListExportedProformaInvoicesInput.Builder(
    "batch_id8"
)
.perPage(100)
.page(1)
.build();
```

