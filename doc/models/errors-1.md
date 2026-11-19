
# Errors 1

## Structure

`Errors1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PerPage` | `List<String>` | Optional | - | List<String> getPerPage() | setPerPage(List<String> perPage) |
| `PricePoint` | `List<String>` | Optional | - | List<String> getPricePoint() | setPricePoint(List<String> pricePoint) |

## Example

```java
import com.maxio.advancedbilling.models.Errors1;
import java.util.Arrays;

Errors1 errors1 = new Errors1.Builder()
    .perPage(Arrays.asList(
        "per_page9"
    ))
    .pricePoint(Arrays.asList(
        "price_point0"
    ))
    .build();
```

