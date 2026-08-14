
# List Metafields Response

## Structure

`ListMetafieldsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalCount` | `Integer` | Optional | - | Integer getTotalCount() | setTotalCount(Integer totalCount) |
| `CurrentPage` | `Integer` | Optional | - | Integer getCurrentPage() | setCurrentPage(Integer currentPage) |
| `TotalPages` | `Integer` | Optional | - | Integer getTotalPages() | setTotalPages(Integer totalPages) |
| `PerPage` | `Integer` | Optional | - | Integer getPerPage() | setPerPage(Integer perPage) |
| `Metafields` | [`List<Metafield>`](../../doc/models/metafield.md) | Optional | - | List<Metafield> getMetafields() | setMetafields(List<Metafield> metafields) |

## Example

```java
import com.maxio.advancedbilling.models.IncludeOption;
import com.maxio.advancedbilling.models.ListMetafieldsResponse;
import com.maxio.advancedbilling.models.Metafield;
import com.maxio.advancedbilling.models.MetafieldInput;
import com.maxio.advancedbilling.models.MetafieldScope;
import java.util.Arrays;

ListMetafieldsResponse listMetafieldsResponse = new ListMetafieldsResponse.Builder()
    .totalCount(228)
    .currentPage(204)
    .totalPages(216)
    .perPage(74)
    .metafields(Arrays.asList(
        new Metafield.Builder()
            .id(22)
            .name("name2")
            .scope(new MetafieldScope.Builder()
                .csv(IncludeOption.EXCLUDE)
                .invoices(IncludeOption.EXCLUDE)
                .statements(IncludeOption.EXCLUDE)
                .portal(IncludeOption.EXCLUDE)
                .publicShow(IncludeOption.EXCLUDE)
                .build())
            .dataCount(10)
            .inputType(MetafieldInput.BALANCE_TRACKER)
            .build(),
        new Metafield.Builder()
            .id(22)
            .name("name2")
            .scope(new MetafieldScope.Builder()
                .csv(IncludeOption.EXCLUDE)
                .invoices(IncludeOption.EXCLUDE)
                .statements(IncludeOption.EXCLUDE)
                .portal(IncludeOption.EXCLUDE)
                .publicShow(IncludeOption.EXCLUDE)
                .build())
            .dataCount(10)
            .inputType(MetafieldInput.BALANCE_TRACKER)
            .build(),
        new Metafield.Builder()
            .id(22)
            .name("name2")
            .scope(new MetafieldScope.Builder()
                .csv(IncludeOption.EXCLUDE)
                .invoices(IncludeOption.EXCLUDE)
                .statements(IncludeOption.EXCLUDE)
                .portal(IncludeOption.EXCLUDE)
                .publicShow(IncludeOption.EXCLUDE)
                .build())
            .dataCount(10)
            .inputType(MetafieldInput.BALANCE_TRACKER)
            .build()
    ))
    .build();
```

