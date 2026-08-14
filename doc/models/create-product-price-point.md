
# Create Product Price Point

## Structure

`CreateProductPricePoint`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | The product price point name | String getName() | setName(String name) |
| `Handle` | `String` | Optional | The product price point API handle | String getHandle() | setHandle(String handle) |
| `PriceInCents` | `long` | Required | The product price point price, in integer cents | long getPriceInCents() | setPriceInCents(long priceInCents) |
| `Interval` | `int` | Required | The numerical interval. e.g., an interval of ‘30’ coupled with an interval_unit of day would mean this product price point would renew every 30 days. | int getInterval() | setInterval(int interval) |
| `IntervalUnit` | [`IntervalUnit`](../../doc/models/interval-unit.md) | Required | A string representing the interval unit for this product price point, either month or day | IntervalUnit getIntervalUnit() | setIntervalUnit(IntervalUnit intervalUnit) |
| `TrialPriceInCents` | `Long` | Optional | The product price point trial price, in integer cents | Long getTrialPriceInCents() | setTrialPriceInCents(Long trialPriceInCents) |
| `TrialInterval` | `Integer` | Optional | The numerical trial interval. e.g., an interval of ‘30’ coupled with a trial_interval_unit of day would mean this product price point trial would last 30 days. | Integer getTrialInterval() | setTrialInterval(Integer trialInterval) |
| `TrialIntervalUnit` | [`IntervalUnit`](../../doc/models/interval-unit.md) | Optional | A string representing the trial interval unit for this product price point, either month or day | IntervalUnit getTrialIntervalUnit() | setTrialIntervalUnit(IntervalUnit trialIntervalUnit) |
| `TrialType` | [`TrialType`](../../doc/models/trial-type.md) | Optional | Indicates how a trial is handled when the trial period ends and there is no credit card on file. For `no_obligation`, the subscription transitions to a Trial Ended state. Maxio will not send any emails or statements. For `payment_expected`, the subscription transitions to a Past Due state. Maxio will send normal dunning emails and statements according to your other settings. | TrialType getTrialType() | setTrialType(TrialType trialType) |
| `InitialChargeInCents` | `Long` | Optional | The product price point initial charge, in integer cents | Long getInitialChargeInCents() | setInitialChargeInCents(Long initialChargeInCents) |
| `InitialChargeAfterTrial` | `Boolean` | Optional | - | Boolean getInitialChargeAfterTrial() | setInitialChargeAfterTrial(Boolean initialChargeAfterTrial) |
| `ExpirationInterval` | `Integer` | Optional | The numerical expiration interval. e.g., an expiration_interval of ‘30’ coupled with an expiration_interval_unit of day would mean this product price point would expire after 30 days. | Integer getExpirationInterval() | setExpirationInterval(Integer expirationInterval) |
| `ExpirationIntervalUnit` | [`ExpirationIntervalUnit`](../../doc/models/expiration-interval-unit.md) | Optional | A string representing the expiration interval unit for this product price point, either month, day or never | ExpirationIntervalUnit getExpirationIntervalUnit() | setExpirationIntervalUnit(ExpirationIntervalUnit expirationIntervalUnit) |
| `UseSiteExchangeRate` | `Boolean` | Optional | Whether or not to use the site's exchange rate or define your own pricing when your site has multiple currencies defined.<br><br>**Default**: `true` | Boolean getUseSiteExchangeRate() | setUseSiteExchangeRate(Boolean useSiteExchangeRate) |

## Example

```java
import com.maxio.advancedbilling.models.CreateProductPricePoint;
import com.maxio.advancedbilling.models.IntervalUnit;
import com.maxio.advancedbilling.models.TrialType;

CreateProductPricePoint createProductPricePoint = new CreateProductPricePoint.Builder(
    "name6",
    180L,
    60,
    IntervalUnit.DAY
)
.handle("handle2")
.trialPriceInCents(92L)
.trialInterval(218)
.trialIntervalUnit(IntervalUnit.DAY)
.trialType(TrialType.NO_OBLIGATION)
.useSiteExchangeRate(true)
.build();
```

