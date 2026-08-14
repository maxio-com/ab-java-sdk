
# Coupon Subcodes Response

## Structure

`CouponSubcodesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CreatedCodes` | `List<String>` | Optional | - | List<String> getCreatedCodes() | setCreatedCodes(List<String> createdCodes) |
| `DuplicateCodes` | `List<String>` | Optional | - | List<String> getDuplicateCodes() | setDuplicateCodes(List<String> duplicateCodes) |
| `InvalidCodes` | `List<String>` | Optional | - | List<String> getInvalidCodes() | setInvalidCodes(List<String> invalidCodes) |

## Example

```java
import com.maxio.advancedbilling.models.CouponSubcodesResponse;
import java.util.Arrays;

CouponSubcodesResponse couponSubcodesResponse = new CouponSubcodesResponse.Builder()
    .createdCodes(Arrays.asList(
        "created_codes7"
    ))
    .duplicateCodes(Arrays.asList(
        "duplicate_codes8"
    ))
    .invalidCodes(Arrays.asList(
        "invalid_codes4",
        "invalid_codes3"
    ))
    .build();
```

