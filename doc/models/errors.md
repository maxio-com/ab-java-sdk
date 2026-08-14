
# Errors

## Structure

`Errors`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PerPage` | `List<String>` | Optional | - | List<String> getPerPage() | setPerPage(List<String> perPage) |
| `PricePoint` | `List<String>` | Optional | - | List<String> getPricePoint() | setPricePoint(List<String> pricePoint) |

## Example

```java
import com.maxio.advancedbilling.models.Errors;
import java.util.Arrays;

Errors errors = new Errors.Builder()
    .perPage(Arrays.asList(
        "per_page1",
        "per_page2",
        "per_page3"
    ))
    .pricePoint(Arrays.asList(
        "price_point0",
        "price_point9",
        "price_point8"
    ))
    .build();
```

