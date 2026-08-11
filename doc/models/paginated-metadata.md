
# Paginated Metadata

## Structure

`PaginatedMetadata`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalCount` | `Integer` | Optional | - | Integer getTotalCount() | setTotalCount(Integer totalCount) |
| `CurrentPage` | `Integer` | Optional | - | Integer getCurrentPage() | setCurrentPage(Integer currentPage) |
| `TotalPages` | `Integer` | Optional | - | Integer getTotalPages() | setTotalPages(Integer totalPages) |
| `PerPage` | `Integer` | Optional | - | Integer getPerPage() | setPerPage(Integer perPage) |
| `Metadata` | [`List<Metadata>`](../../doc/models/metadata.md) | Optional | - | List<Metadata> getMetadata() | setMetadata(List<Metadata> metadata) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.Metadata;
import com.maxio.advancedbilling.models.PaginatedMetadata;
import java.util.Arrays;

PaginatedMetadata paginatedMetadata = new PaginatedMetadata.Builder()
    .totalCount(166)
    .currentPage(142)
    .totalPages(154)
    .perPage(136)
    .metadata(Arrays.asList(
        new Metadata.Builder()
            .id(50)
            .value("value8")
            .resourceId(134)
            .name("name6")
            .deletedAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
            .build()
    ))
    .build();
```

