
# Subscription Custom Price

(Optional) Used in place of `product_price_point_id` to define a custom price point unique to the subscription. A subscription can have up to 30 custom price points. Exceeding this limit will result in an API error.

## Structure

`SubscriptionCustomPrice`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | (Optional) | String getName() | setName(String name) |
| `Handle` | `String` | Optional | (Optional) | String getHandle() | setHandle(String handle) |
| `PriceInCents` | [`SubscriptionCustomPricePriceInCents`](../../doc/models/containers/subscription-custom-price-price-in-cents.md) | Required | This is a container for one-of cases. | SubscriptionCustomPricePriceInCents getPriceInCents() | setPriceInCents(SubscriptionCustomPricePriceInCents priceInCents) |
| `Interval` | [`SubscriptionCustomPriceInterval`](../../doc/models/containers/subscription-custom-price-interval.md) | Required | This is a container for one-of cases. | SubscriptionCustomPriceInterval getInterval() | setInterval(SubscriptionCustomPriceInterval interval) |
| `IntervalUnit` | [`IntervalUnit`](../../doc/models/interval-unit.md) | Required | Required if using `custom_price` attribute. | IntervalUnit getIntervalUnit() | setIntervalUnit(IntervalUnit intervalUnit) |
| `TrialPriceInCents` | [`SubscriptionCustomPriceTrialPriceInCents`](../../doc/models/containers/subscription-custom-price-trial-price-in-cents.md) | Optional | This is a container for one-of cases. | SubscriptionCustomPriceTrialPriceInCents getTrialPriceInCents() | setTrialPriceInCents(SubscriptionCustomPriceTrialPriceInCents trialPriceInCents) |
| `TrialInterval` | [`SubscriptionCustomPriceTrialInterval`](../../doc/models/containers/subscription-custom-price-trial-interval.md) | Optional | This is a container for one-of cases. | SubscriptionCustomPriceTrialInterval getTrialInterval() | setTrialInterval(SubscriptionCustomPriceTrialInterval trialInterval) |
| `TrialIntervalUnit` | [`IntervalUnit`](../../doc/models/interval-unit.md) | Optional | (Optional) | IntervalUnit getTrialIntervalUnit() | setTrialIntervalUnit(IntervalUnit trialIntervalUnit) |
| `TrialType` | [`TrialType`](../../doc/models/trial-type.md) | Optional | Indicates how a trial is handled when the trial period ends and there is no credit card on file. For `no_obligation`, the subscription transitions to a Trial Ended state. Maxio will not send any emails or statements. For `payment_expected`, the subscription transitions to a Past Due state. Maxio will send normal dunning emails and statements according to your other settings. | TrialType getTrialType() | setTrialType(TrialType trialType) |
| `InitialChargeInCents` | [`SubscriptionCustomPriceInitialChargeInCents`](../../doc/models/containers/subscription-custom-price-initial-charge-in-cents.md) | Optional | This is a container for one-of cases. | SubscriptionCustomPriceInitialChargeInCents getInitialChargeInCents() | setInitialChargeInCents(SubscriptionCustomPriceInitialChargeInCents initialChargeInCents) |
| `InitialChargeAfterTrial` | `Boolean` | Optional | (Optional) | Boolean getInitialChargeAfterTrial() | setInitialChargeAfterTrial(Boolean initialChargeAfterTrial) |
| `ExpirationInterval` | [`SubscriptionCustomPriceExpirationInterval`](../../doc/models/containers/subscription-custom-price-expiration-interval.md) | Optional | This is a container for one-of cases. | SubscriptionCustomPriceExpirationInterval getExpirationInterval() | setExpirationInterval(SubscriptionCustomPriceExpirationInterval expirationInterval) |
| `ExpirationIntervalUnit` | [`ExpirationIntervalUnit`](../../doc/models/expiration-interval-unit.md) | Optional | (Optional) | ExpirationIntervalUnit getExpirationIntervalUnit() | setExpirationIntervalUnit(ExpirationIntervalUnit expirationIntervalUnit) |
| `TaxIncluded` | `Boolean` | Optional | (Optional) | Boolean getTaxIncluded() | setTaxIncluded(Boolean taxIncluded) |

## Example

```java
import com.maxio.advancedbilling.models.IntervalUnit;
import com.maxio.advancedbilling.models.SubscriptionCustomPrice;
import com.maxio.advancedbilling.models.containers.SubscriptionCustomPriceInterval;
import com.maxio.advancedbilling.models.containers.SubscriptionCustomPricePriceInCents;
import com.maxio.advancedbilling.models.containers.SubscriptionCustomPriceTrialInterval;
import com.maxio.advancedbilling.models.containers.SubscriptionCustomPriceTrialPriceInCents;

SubscriptionCustomPrice subscriptionCustomPrice = new SubscriptionCustomPrice.Builder(
    SubscriptionCustomPricePriceInCents.fromString(
        "String5"
    ),
    SubscriptionCustomPriceInterval.fromString(
        "String1"
    ),
    IntervalUnit.DAY
)
.name("name2")
.handle("handle8")
.trialPriceInCents(SubscriptionCustomPriceTrialPriceInCents.fromString(
        "String5"
    ))
.trialInterval(SubscriptionCustomPriceTrialInterval.fromString(
        "String9"
    ))
.trialIntervalUnit(IntervalUnit.DAY)
.build();
```

