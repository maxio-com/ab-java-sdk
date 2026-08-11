
# Scheduled Renewal Product Price Point

Custom pricing for a product within a scheduled renewal.

## Structure

`ScheduledRenewalProductPricePoint`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | (Optional) | String getName() | setName(String name) |
| `Handle` | `String` | Optional | (Optional) | String getHandle() | setHandle(String handle) |
| `PriceInCents` | [`ScheduledRenewalProductPricePointPriceInCents`](../../doc/models/containers/scheduled-renewal-product-price-point-price-in-cents.md) | Required | This is a container for one-of cases. | ScheduledRenewalProductPricePointPriceInCents getPriceInCents() | setPriceInCents(ScheduledRenewalProductPricePointPriceInCents priceInCents) |
| `Interval` | [`ScheduledRenewalProductPricePointInterval`](../../doc/models/containers/scheduled-renewal-product-price-point-interval.md) | Required | This is a container for one-of cases. | ScheduledRenewalProductPricePointInterval getInterval() | setInterval(ScheduledRenewalProductPricePointInterval interval) |
| `IntervalUnit` | [`IntervalUnit`](../../doc/models/interval-unit.md) | Required | Required if using `custom_price` attribute. | IntervalUnit getIntervalUnit() | setIntervalUnit(IntervalUnit intervalUnit) |
| `TaxIncluded` | `Boolean` | Optional | (Optional) | Boolean getTaxIncluded() | setTaxIncluded(Boolean taxIncluded) |
| `InitialChargeInCents` | `Long` | Optional | The product price point initial charge, in integer cents. | Long getInitialChargeInCents() | setInitialChargeInCents(Long initialChargeInCents) |
| `ExpirationInterval` | `Integer` | Optional | The numerical expiration interval. e.g., an expiration_interval of ‘30’ coupled with an expiration_interval_unit of day would mean this product price point would expire after 30 days. | Integer getExpirationInterval() | setExpirationInterval(Integer expirationInterval) |
| `ExpirationIntervalUnit` | [`ExpirationIntervalUnit`](../../doc/models/expiration-interval-unit.md) | Optional | A string representing the expiration interval unit for this product price point, either month, day or never | ExpirationIntervalUnit getExpirationIntervalUnit() | setExpirationIntervalUnit(ExpirationIntervalUnit expirationIntervalUnit) |

## Example

```java
import com.maxio.advancedbilling.models.IntervalUnit;
import com.maxio.advancedbilling.models.ScheduledRenewalProductPricePoint;
import com.maxio.advancedbilling.models.containers.ScheduledRenewalProductPricePointInterval;
import com.maxio.advancedbilling.models.containers.ScheduledRenewalProductPricePointPriceInCents;

ScheduledRenewalProductPricePoint scheduledRenewalProductPricePoint = new ScheduledRenewalProductPricePoint.Builder(
    ScheduledRenewalProductPricePointPriceInCents.fromString(
        "String1"
    ),
    ScheduledRenewalProductPricePointInterval.fromString(
        "String7"
    ),
    IntervalUnit.DAY
)
.name("name6")
.handle("handle2")
.taxIncluded(false)
.initialChargeInCents(218L)
.expirationInterval(240)
.build();
```

