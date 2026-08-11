
# Referral Code

## Structure

`ReferralCode`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `SiteId` | `Integer` | Optional | - | Integer getSiteId() | setSiteId(Integer siteId) |
| `SubscriptionId` | `Integer` | Optional | - | Integer getSubscriptionId() | setSubscriptionId(Integer subscriptionId) |
| `Code` | `String` | Optional | - | String getCode() | setCode(String code) |

## Example

```java
import com.maxio.advancedbilling.models.ReferralCode;

ReferralCode referralCode = new ReferralCode.Builder()
    .id(186)
    .siteId(112)
    .subscriptionId(40)
    .code("code6")
    .build();
```

