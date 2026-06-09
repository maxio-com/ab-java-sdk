
# Create Component Price Points Request Price Points

## Class Name

`CreateComponentPricePointsRequestPricePoints`

## Cases

| Type | Factory Method |
|  --- | --- |
| [`CreateComponentPricePoint`](../../../doc/models/create-component-price-point.md) | CreateComponentPricePointsRequestPricePoints.fromCreateComponentPricePoint(CreateComponentPricePoint createComponentPricePoint) |
| [`CreatePrepaidUsageComponentPricePoint`](../../../doc/models/create-prepaid-usage-component-price-point.md) | CreateComponentPricePointsRequestPricePoints.fromCreatePrepaidUsageComponentPricePoint(CreatePrepaidUsageComponentPricePoint createPrepaidUsageComponentPricePoint) |

## CreateComponentPricePoint

### Initialization Code

#### Example

```java
CreateComponentPricePointsRequestPricePoints.fromCreateComponentPricePoint(
        new CreateComponentPricePoint.Builder(
            "name0",
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
                .build()
            )
        )
        .useSiteExchangeRate(true)
        .build()
    )
```

## CreatePrepaidUsageComponentPricePoint

### Initialization Code

#### Example

```java
CreateComponentPricePointsRequestPricePoints.fromCreatePrepaidUsageComponentPricePoint(
        new CreatePrepaidUsageComponentPricePoint.Builder(
            "name0",
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
                .build()
            ),
            new OveragePricing.Builder(
                PricingScheme.STAIRSTEP
            )
            .build()
        )
        .useSiteExchangeRate(true)
        .build()
    )
```

