
# Reactivate Subscription Request

## Structure

`ReactivateSubscriptionRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CalendarBilling` | [`ReactivationBilling`](../../doc/models/reactivation-billing.md) | Optional | These values are only applicable to subscriptions using calendar billing. | ReactivationBilling getCalendarBilling() | setCalendarBilling(ReactivationBilling calendarBilling) |
| `IncludeTrial` | `Boolean` | Optional | If `true` is sent, the reactivated Subscription will include a trial if one is available. If `false` is sent, the trial period will be ignored. | Boolean getIncludeTrial() | setIncludeTrial(Boolean includeTrial) |
| `PreserveBalance` | `Boolean` | Optional | If `true` is passed, the existing subscription balance will NOT be cleared/reset before adding the additional reactivation charges. | Boolean getPreserveBalance() | setPreserveBalance(Boolean preserveBalance) |
| `CouponCode` | `String` | Optional | The coupon code to be applied during reactivation. | String getCouponCode() | setCouponCode(String couponCode) |
| `UseCreditsAndPrepayments` | `Boolean` | Optional | If true is sent, Advanced Billing will use service credits and prepayments upon reactivation. If false is sent, the service credits and prepayments will be ignored. | Boolean getUseCreditsAndPrepayments() | setUseCreditsAndPrepayments(Boolean useCreditsAndPrepayments) |
| `Resume` | [`ReactivateSubscriptionRequestResume`](../../doc/models/containers/reactivate-subscription-request-resume.md) | Optional | This is a container for one-of cases. | ReactivateSubscriptionRequestResume getResume() | setResume(ReactivateSubscriptionRequestResume resume) |

## Example

```java
import com.maxio.advancedbilling.models.ReactivateSubscriptionRequest;
import com.maxio.advancedbilling.models.ReactivationBilling;
import com.maxio.advancedbilling.models.ReactivationCharge;

ReactivateSubscriptionRequest reactivateSubscriptionRequest = new ReactivateSubscriptionRequest.Builder()
    .calendarBilling(new ReactivationBilling.Builder()
        .reactivationCharge(ReactivationCharge.PRORATED)
        .build())
    .includeTrial(false)
    .preserveBalance(false)
    .couponCode("coupon_code2")
    .useCreditsAndPrepayments(false)
    .build();
```

