
# List MRR Response

## Structure

`ListMRRResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Mrr` | [`ListMRRResponseResult`](../../doc/models/list-mrr-response-result.md) | Required | - | ListMRRResponseResult getMrr() | setMrr(ListMRRResponseResult mrr) |

## Example

```java
import com.maxio.advancedbilling.models.ListMRRResponse;
import com.maxio.advancedbilling.models.ListMRRResponseResult;

ListMRRResponse listMRRResponse = new ListMRRResponse.Builder(
    new ListMRRResponseResult.Builder()
        .page(30)
        .perPage(198)
        .totalPages(92)
        .totalEntries(188)
        .currency("currency4")
        .build()
)
.build();
```

