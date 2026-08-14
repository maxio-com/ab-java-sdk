
# Prepaid Product Price Point Filter

## Structure

`PrepaidProductPricePointFilter`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ProductPricePointId` | `String` | Required, Constant | Passed as a parameter to list methods to return only non null values.<br><br>**Value**: `"not_null"` | String getProductPricePointId() | setProductPricePointId(String productPricePointId) |

## Example

```java
import com.maxio.advancedbilling.models.PrepaidProductPricePointFilter;

PrepaidProductPricePointFilter prepaidProductPricePointFilter = new PrepaidProductPricePointFilter.Builder(
    "not_null"
)
.build();
```

