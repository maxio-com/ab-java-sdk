
# Coupon Request

## Structure

`CouponRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Coupon` | [`CouponPayload`](../../doc/models/coupon-payload.md) | Optional | - | CouponPayload getCoupon() | setCoupon(CouponPayload coupon) |
| `RestrictedProducts` | `Map<String, Boolean>` | Optional | An object where the keys are product IDs or handles (prefixed with 'handle:'), and the values are booleans indicating if the coupon should be applicable to the product. | Map<String, Boolean> getRestrictedProducts() | setRestrictedProducts(Map<String, Boolean> restrictedProducts) |
| `RestrictedComponents` | `Map<String, Boolean>` | Optional | An object where the keys are component IDs or handles (prefixed with 'handle:'), and the values are booleans indicating if the coupon should be applicable to the component. | Map<String, Boolean> getRestrictedComponents() | setRestrictedComponents(Map<String, Boolean> restrictedComponents) |

## Example

```java
import com.maxio.advancedbilling.models.CouponPayload;
import com.maxio.advancedbilling.models.CouponRequest;
import com.maxio.advancedbilling.models.containers.CouponPayloadPercentage;
import java.util.LinkedHashMap;

CouponRequest couponRequest = new CouponRequest.Builder()
    .coupon(new CouponPayload.Builder()
        .name("name4")
        .code("code2")
        .description("description6")
        .percentage(CouponPayloadPercentage.fromString(
            "String3"
        ))
        .amountInCents(230L)
        .build())
    .restrictedProducts(new LinkedHashMap<String, Boolean>() {{
        put("key0", true);
        put("key1", false);
    }})
    .restrictedComponents(new LinkedHashMap<String, Boolean>() {{
        put("key0", true);
        put("key1", false);
    }})
    .build();
```

