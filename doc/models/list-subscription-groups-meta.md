
# List Subscription Groups Meta

## Structure

`ListSubscriptionGroupsMeta`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CurrentPage` | `Integer` | Optional | - | Integer getCurrentPage() | setCurrentPage(Integer currentPage) |
| `TotalCount` | `Integer` | Optional | - | Integer getTotalCount() | setTotalCount(Integer totalCount) |

## Example

```java
import com.maxio.advancedbilling.models.ListSubscriptionGroupsMeta;

ListSubscriptionGroupsMeta listSubscriptionGroupsMeta = new ListSubscriptionGroupsMeta.Builder()
    .currentPage(104)
    .totalCount(128)
    .build();
```

