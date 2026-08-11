
# Referral Validation Response

## Structure

`ReferralValidationResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ReferralCode` | [`ReferralCode`](../../doc/models/referral-code.md) | Optional | - | ReferralCode getReferralCode() | setReferralCode(ReferralCode referralCode) |

## Example

```java
import com.maxio.advancedbilling.models.ReferralCode;
import com.maxio.advancedbilling.models.ReferralValidationResponse;

ReferralValidationResponse referralValidationResponse = new ReferralValidationResponse.Builder()
    .referralCode(new ReferralCode.Builder()
        .id(46)
        .siteId(228)
        .subscriptionId(156)
        .code("code0")
        .build())
    .build();
```

