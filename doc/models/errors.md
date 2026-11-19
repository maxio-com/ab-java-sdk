
# Errors

## Structure

`Errors`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PricePoint` | `List<String>` | Required | - | List<String> getPricePoint() | setPricePoint(List<String> pricePoint) |

## Example

```java
import com.maxio.advancedbilling.models.Errors;
import java.util.Arrays;

Errors errors = new Errors.Builder(
    Arrays.asList(
        "price_point0",
        "price_point9",
        "price_point8"
    )
)
.build();
```

