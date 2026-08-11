
# Coupon Subcodes

## Structure

`CouponSubcodes`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Codes` | `List<String>` | Optional | - | List<String> getCodes() | setCodes(List<String> codes) |

## Example

```java
import com.maxio.advancedbilling.models.CouponSubcodes;
import java.util.Arrays;

CouponSubcodes couponSubcodes = new CouponSubcodes.Builder()
    .codes(Arrays.asList(
        "codes8",
        "codes9"
    ))
    .build();
```

