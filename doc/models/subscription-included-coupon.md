
# Subscription Included Coupon

## Structure

`SubscriptionIncludedCoupon`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | `String` | Optional | - | String getCode() | setCode(String code) |
| `UseCount` | `Integer` | Optional | - | Integer getUseCount() | setUseCount(Integer useCount) |
| `UsesAllowed` | `Integer` | Optional | - | Integer getUsesAllowed() | setUsesAllowed(Integer usesAllowed) |
| `ExpiresAt` | `String` | Optional | - | String getExpiresAt() | setExpiresAt(String expiresAt) |
| `Recurring` | `Boolean` | Optional | - | Boolean getRecurring() | setRecurring(Boolean recurring) |
| `AmountInCents` | `Long` | Optional | **Constraints**: `>= 0` | Long getAmountInCents() | setAmountInCents(Long amountInCents) |
| `Percentage` | `String` | Optional | - | String getPercentage() | setPercentage(String percentage) |

## Example

```java
import com.maxio.advancedbilling.models.SubscriptionIncludedCoupon;

SubscriptionIncludedCoupon subscriptionIncludedCoupon = new SubscriptionIncludedCoupon.Builder()
    .code("\"ABCD_10\"")
    .useCount(2)
    .usesAllowed(10)
    .expiresAt("\"2023-07-13T05:18:58-04:00\"")
    .recurring(false)
    .amountInCents(1000L)
    .percentage("\"15.0\"")
    .build();
```

