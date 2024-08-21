
# Subscription Custom Price

(Optional) Used in place of `product_price_point_id` to define a custom price point unique to the subscription

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
| `InitialChargeInCents` | [`SubscriptionCustomPriceInitialChargeInCents`](../../doc/models/containers/subscription-custom-price-initial-charge-in-cents.md) | Optional | This is a container for one-of cases. | SubscriptionCustomPriceInitialChargeInCents getInitialChargeInCents() | setInitialChargeInCents(SubscriptionCustomPriceInitialChargeInCents initialChargeInCents) |
| `InitialChargeAfterTrial` | `Boolean` | Optional | (Optional) | Boolean getInitialChargeAfterTrial() | setInitialChargeAfterTrial(Boolean initialChargeAfterTrial) |
| `ExpirationInterval` | [`SubscriptionCustomPriceExpirationInterval`](../../doc/models/containers/subscription-custom-price-expiration-interval.md) | Optional | This is a container for one-of cases. | SubscriptionCustomPriceExpirationInterval getExpirationInterval() | setExpirationInterval(SubscriptionCustomPriceExpirationInterval expirationInterval) |
| `ExpirationIntervalUnit` | [`ExpirationIntervalUnit`](../../doc/models/expiration-interval-unit.md) | Optional | (Optional) | ExpirationIntervalUnit getExpirationIntervalUnit() | setExpirationIntervalUnit(ExpirationIntervalUnit expirationIntervalUnit) |
| `TaxIncluded` | `Boolean` | Optional | (Optional) | Boolean getTaxIncluded() | setTaxIncluded(Boolean taxIncluded) |

## Example (as JSON)

```json
{
  "name": "name4",
  "handle": "handle0",
  "price_in_cents": "String3",
  "interval": "String3",
  "interval_unit": "day",
  "trial_price_in_cents": "String3",
  "trial_interval": "String5",
  "trial_interval_unit": "day"
}
```

