
# List Sale Rep Item

## Structure

`ListSaleRepItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `FullName` | `String` | Optional | - | String getFullName() | setFullName(String fullName) |
| `SubscriptionsCount` | `Integer` | Optional | - | Integer getSubscriptionsCount() | setSubscriptionsCount(Integer subscriptionsCount) |
| `MrrData` | [`Map<String, SaleRepItemMrr>`](../../doc/models/sale-rep-item-mrr.md) | Optional | - | Map<String, SaleRepItemMrr> getMrrData() | setMrrData(Map<String, SaleRepItemMrr> mrrData) |
| `TestMode` | `Boolean` | Optional | - | Boolean getTestMode() | setTestMode(Boolean testMode) |

## Example

```java
import com.maxio.advancedbilling.models.ListSaleRepItem;
import com.maxio.advancedbilling.models.SaleRepItemMrr;
import java.util.LinkedHashMap;

ListSaleRepItem listSaleRepItem = new ListSaleRepItem.Builder()
    .id(54)
    .fullName("full_name2")
    .subscriptionsCount(126)
    .mrrData(new LinkedHashMap<String, SaleRepItemMrr>() {{
        put("november_2019", new SaleRepItemMrr.Builder()
            .mrr("$0.00")
            .usage("$0.00")
            .recurring("$0.00")
            .build());
        put("december_2019", new SaleRepItemMrr.Builder()
            .mrr("$0.00")
            .usage("$0.00")
            .recurring("$0.00")
            .build());
        put("january_2020", new SaleRepItemMrr.Builder()
            .mrr("$400.00")
            .usage("$0.00")
            .recurring("$400.00")
            .build());
    }})
    .testMode(false)
    .build();
```

