
# List Public Keys Meta

## Structure

`ListPublicKeysMeta`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalCount` | `Integer` | Optional | - | Integer getTotalCount() | setTotalCount(Integer totalCount) |
| `CurrentPage` | `Integer` | Optional | - | Integer getCurrentPage() | setCurrentPage(Integer currentPage) |
| `TotalPages` | `Integer` | Optional | - | Integer getTotalPages() | setTotalPages(Integer totalPages) |
| `PerPage` | `Integer` | Optional | - | Integer getPerPage() | setPerPage(Integer perPage) |

## Example

```java
import com.maxio.advancedbilling.models.ListPublicKeysMeta;

ListPublicKeysMeta listPublicKeysMeta = new ListPublicKeysMeta.Builder()
    .totalCount(232)
    .currentPage(208)
    .totalPages(220)
    .perPage(70)
    .build();
```

