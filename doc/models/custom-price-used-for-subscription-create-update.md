
# Custom Price Used for Subscription Create Update

(Optional) Used in place of `product_price_point_id` to define a custom price point unique to the subscription

## Structure

`CustomPriceUsedForSubscriptionCreateUpdate`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | (Optional) | String getName() | setName(String name) |
| `Handle` | `String` | Optional | (Optional) | String getHandle() | setHandle(String handle) |
| `PriceInCents` | [`CustomPriceUsedForSubscriptionCreateUpdatePriceInCents`](../../doc/models/containers/custom-price-used-for-subscription-create-update-price-in-cents.md) | Optional | This is a container for one-of cases. | CustomPriceUsedForSubscriptionCreateUpdatePriceInCents getPriceInCents() | setPriceInCents(CustomPriceUsedForSubscriptionCreateUpdatePriceInCents priceInCents) |
| `Interval` | [`CustomPriceUsedForSubscriptionCreateUpdateInterval`](../../doc/models/containers/custom-price-used-for-subscription-create-update-interval.md) | Optional | This is a container for one-of cases. | CustomPriceUsedForSubscriptionCreateUpdateInterval getInterval() | setInterval(CustomPriceUsedForSubscriptionCreateUpdateInterval interval) |
| `IntervalUnit` | [`CustomPriceUsedForSubscriptionCreateUpdateIntervalUnit`](../../doc/models/containers/custom-price-used-for-subscription-create-update-interval-unit.md) | Optional | This is a container for one-of cases. | CustomPriceUsedForSubscriptionCreateUpdateIntervalUnit getIntervalUnit() | setIntervalUnit(CustomPriceUsedForSubscriptionCreateUpdateIntervalUnit intervalUnit) |
| `TrialPriceInCents` | [`CustomPriceUsedForSubscriptionCreateUpdateTrialPriceInCents`](../../doc/models/containers/custom-price-used-for-subscription-create-update-trial-price-in-cents.md) | Optional | This is a container for one-of cases. | CustomPriceUsedForSubscriptionCreateUpdateTrialPriceInCents getTrialPriceInCents() | setTrialPriceInCents(CustomPriceUsedForSubscriptionCreateUpdateTrialPriceInCents trialPriceInCents) |
| `TrialInterval` | [`CustomPriceUsedForSubscriptionCreateUpdateTrialInterval`](../../doc/models/containers/custom-price-used-for-subscription-create-update-trial-interval.md) | Optional | This is a container for one-of cases. | CustomPriceUsedForSubscriptionCreateUpdateTrialInterval getTrialInterval() | setTrialInterval(CustomPriceUsedForSubscriptionCreateUpdateTrialInterval trialInterval) |
| `TrialIntervalUnit` | [`CustomPriceUsedForSubscriptionCreateUpdateTrialIntervalUnit`](../../doc/models/containers/custom-price-used-for-subscription-create-update-trial-interval-unit.md) | Optional | This is a container for one-of cases. | CustomPriceUsedForSubscriptionCreateUpdateTrialIntervalUnit getTrialIntervalUnit() | setTrialIntervalUnit(CustomPriceUsedForSubscriptionCreateUpdateTrialIntervalUnit trialIntervalUnit) |
| `InitialChargeInCents` | [`CustomPriceUsedForSubscriptionCreateUpdateInitialChargeInCents`](../../doc/models/containers/custom-price-used-for-subscription-create-update-initial-charge-in-cents.md) | Optional | This is a container for one-of cases. | CustomPriceUsedForSubscriptionCreateUpdateInitialChargeInCents getInitialChargeInCents() | setInitialChargeInCents(CustomPriceUsedForSubscriptionCreateUpdateInitialChargeInCents initialChargeInCents) |
| `InitialChargeAfterTrial` | `Boolean` | Optional | (Optional) | Boolean getInitialChargeAfterTrial() | setInitialChargeAfterTrial(Boolean initialChargeAfterTrial) |
| `ExpirationInterval` | [`CustomPriceUsedForSubscriptionCreateUpdateExpirationInterval`](../../doc/models/containers/custom-price-used-for-subscription-create-update-expiration-interval.md) | Optional | This is a container for one-of cases. | CustomPriceUsedForSubscriptionCreateUpdateExpirationInterval getExpirationInterval() | setExpirationInterval(CustomPriceUsedForSubscriptionCreateUpdateExpirationInterval expirationInterval) |
| `ExpirationIntervalUnit` | [`CustomPriceUsedForSubscriptionCreateUpdateExpirationIntervalUnit`](../../doc/models/containers/custom-price-used-for-subscription-create-update-expiration-interval-unit.md) | Optional | This is a container for one-of cases. | CustomPriceUsedForSubscriptionCreateUpdateExpirationIntervalUnit getExpirationIntervalUnit() | setExpirationIntervalUnit(CustomPriceUsedForSubscriptionCreateUpdateExpirationIntervalUnit expirationIntervalUnit) |
| `TaxIncluded` | `Boolean` | Optional | (Optional) | Boolean getTaxIncluded() | setTaxIncluded(Boolean taxIncluded) |

## Example (as JSON)

```json
{
  "name": "name4",
  "handle": "handle0",
  "price_in_cents": "String3",
  "interval": "String3",
  "interval_unit": "day"
}
```

