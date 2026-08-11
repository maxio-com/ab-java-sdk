
# Add Coupons Request

## Structure

`AddCouponsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Codes` | `List<String>` | Optional | - | List<String> getCodes() | setCodes(List<String> codes) |

## Example

```java
import com.maxio.advancedbilling.models.AddCouponsRequest;
import java.util.Arrays;

AddCouponsRequest addCouponsRequest = new AddCouponsRequest.Builder()
    .codes(Arrays.asList(
        "codes6",
        "codes7"
    ))
    .build();
```

