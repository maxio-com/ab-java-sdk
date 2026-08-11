
# Product Price Point Errors

## Structure

`ProductPricePointErrors`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PricePoint` | `String` | Optional | - | String getPricePoint() | setPricePoint(String pricePoint) |
| `Interval` | `List<String>` | Optional | - | List<String> getInterval() | setInterval(List<String> interval) |
| `IntervalUnit` | `List<String>` | Optional | - | List<String> getIntervalUnit() | setIntervalUnit(List<String> intervalUnit) |
| `Name` | `List<String>` | Optional | - | List<String> getName() | setName(List<String> name) |
| `Price` | `List<String>` | Optional | - | List<String> getPrice() | setPrice(List<String> price) |
| `PriceInCents` | `List<String>` | Optional | - | List<String> getPriceInCents() | setPriceInCents(List<String> priceInCents) |

## Example

```java
import com.maxio.advancedbilling.models.ProductPricePointErrors;
import java.util.Arrays;

ProductPricePointErrors productPricePointErrors = new ProductPricePointErrors.Builder()
    .pricePoint("can't be blank")
    .interval(Arrays.asList(
        "Recurring Interval: cannot be blank.",
        "Recurring Interval: must be greater than or equal to 1."
    ))
    .intervalUnit(Arrays.asList(
        "Interval unit: cannot be blank.",
        "Interval unit: must be 'month' or 'day'."
    ))
    .name(Arrays.asList(
        "Name: cannot be blank."
    ))
    .price(Arrays.asList(
        "Price: is not a number.",
        "Price: must be greater than or equal to 0."
    ))
    .priceInCents(Arrays.asList(
        "Price in cents: cannot be blank."
    ))
    .build();
```

