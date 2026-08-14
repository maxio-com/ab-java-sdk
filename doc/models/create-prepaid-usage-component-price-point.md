
# Create Prepaid Usage Component Price Point

## Structure

`CreatePrepaidUsageComponentPricePoint`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Handle` | `String` | Optional | - | String getHandle() | setHandle(String handle) |
| `PricingScheme` | [`PricingScheme`](../../doc/models/pricing-scheme.md) | Required | The identifier for the pricing scheme. See [Product Components](https://help.chargify.com/products/product-components.html) for an overview of pricing schemes. | PricingScheme getPricingScheme() | setPricingScheme(PricingScheme pricingScheme) |
| `Prices` | [`List<Price>`](../../doc/models/price.md) | Required | - | List<Price> getPrices() | setPrices(List<Price> prices) |
| `OveragePricing` | [`OveragePricing`](../../doc/models/overage-pricing.md) | Required | - | OveragePricing getOveragePricing() | setOveragePricing(OveragePricing overagePricing) |
| `UseSiteExchangeRate` | `Boolean` | Optional | Whether to use the site level exchange rate or define your own prices for each currency if you have multiple currencies defined on the site.<br><br>**Default**: `true` | Boolean getUseSiteExchangeRate() | setUseSiteExchangeRate(Boolean useSiteExchangeRate) |
| `RolloverPrepaidRemainder` | `Boolean` | Optional | (only for prepaid usage components) Boolean which controls whether or not remaining units should be rolled over to the next period. | Boolean getRolloverPrepaidRemainder() | setRolloverPrepaidRemainder(Boolean rolloverPrepaidRemainder) |
| `RenewPrepaidAllocation` | `Boolean` | Optional | (only for prepaid usage components) Boolean which controls whether or not the allocated quantity should be renewed at the beginning of each period. | Boolean getRenewPrepaidAllocation() | setRenewPrepaidAllocation(Boolean renewPrepaidAllocation) |
| `ExpirationInterval` | `Double` | Optional | (only for prepaid usage components where rollover_prepaid_remainder is true) The number of `expiration_interval_unit`s after which rollover amounts should expire. | Double getExpirationInterval() | setExpirationInterval(Double expirationInterval) |
| `ExpirationIntervalUnit` | [`ExpirationIntervalUnit`](../../doc/models/expiration-interval-unit.md) | Optional | (only for prepaid usage components where rollover_prepaid_remainder is true) A string representing the expiration interval unit for this component, either month or day. | ExpirationIntervalUnit getExpirationIntervalUnit() | setExpirationIntervalUnit(ExpirationIntervalUnit expirationIntervalUnit) |

## Example

```java
import com.maxio.advancedbilling.models.CreatePrepaidUsageComponentPricePoint;
import com.maxio.advancedbilling.models.OveragePricing;
import com.maxio.advancedbilling.models.Price;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.containers.PriceEndingQuantity;
import com.maxio.advancedbilling.models.containers.PriceStartingQuantity;
import com.maxio.advancedbilling.models.containers.PriceUnitPrice;
import java.util.Arrays;

CreatePrepaidUsageComponentPricePoint createPrepaidUsageComponentPricePoint = new CreatePrepaidUsageComponentPricePoint.Builder(
    "name2",
    PricingScheme.PER_UNIT,
    Arrays.asList(
        new Price.Builder(
            PriceStartingQuantity.fromNumber(
                242
            ),
            PriceUnitPrice.fromPrecision(
                23.26D
            )
        )
        .endingQuantity(PriceEndingQuantity.fromNumber(
                40
            ))
        .build()
    ),
    new OveragePricing.Builder(
        PricingScheme.STAIRSTEP
    )
    .prices(Arrays.asList(
            new Price.Builder(
                PriceStartingQuantity.fromNumber(
                    242
                ),
                PriceUnitPrice.fromPrecision(
                    23.26D
                )
            )
            .endingQuantity(PriceEndingQuantity.fromNumber(
                    40
                ))
            .build()
        ))
    .build()
)
.handle("handle8")
.useSiteExchangeRate(true)
.rolloverPrepaidRemainder(false)
.renewPrepaidAllocation(false)
.expirationInterval(165.7D)
.build();
```

