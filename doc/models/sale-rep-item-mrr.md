
# Sale Rep Item Mrr

## Structure

`SaleRepItemMrr`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Mrr` | `String` | Optional | - | String getMrr() | setMrr(String mrr) |
| `Usage` | `String` | Optional | - | String getUsage() | setUsage(String usage) |
| `Recurring` | `String` | Optional | - | String getRecurring() | setRecurring(String recurring) |

## Example

```java
import com.maxio.advancedbilling.models.SaleRepItemMrr;

SaleRepItemMrr saleRepItemMrr = new SaleRepItemMrr.Builder()
    .mrr("mrr8")
    .usage("usage0")
    .recurring("recurring6")
    .build();
```

