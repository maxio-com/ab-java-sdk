
# List MRR Response Result

## Structure

`ListMRRResponseResult`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Page` | `Integer` | Optional | - | Integer getPage() | setPage(Integer page) |
| `PerPage` | `Integer` | Optional | - | Integer getPerPage() | setPerPage(Integer perPage) |
| `TotalPages` | `Integer` | Optional | - | Integer getTotalPages() | setTotalPages(Integer totalPages) |
| `TotalEntries` | `Integer` | Optional | - | Integer getTotalEntries() | setTotalEntries(Integer totalEntries) |
| `Currency` | `String` | Optional | - | String getCurrency() | setCurrency(String currency) |
| `CurrencySymbol` | `String` | Optional | - | String getCurrencySymbol() | setCurrencySymbol(String currencySymbol) |
| `Movements` | [`List<Movement>`](../../doc/models/movement.md) | Optional | - | List<Movement> getMovements() | setMovements(List<Movement> movements) |

## Example

```java
import com.maxio.advancedbilling.models.ListMRRResponseResult;

ListMRRResponseResult listMRRResponseResult = new ListMRRResponseResult.Builder()
    .page(40)
    .perPage(208)
    .totalPages(82)
    .totalEntries(78)
    .currency("currency6")
    .build();
```

