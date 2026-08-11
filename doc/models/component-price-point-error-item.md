
# Component Price Point Error Item

## Structure

`ComponentPricePointErrorItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ComponentId` | `Integer` | Optional | - | Integer getComponentId() | setComponentId(Integer componentId) |
| `Message` | `String` | Optional | - | String getMessage() | setMessage(String message) |
| `PricePoint` | `Integer` | Optional | - | Integer getPricePoint() | setPricePoint(Integer pricePoint) |

## Example

```java
import com.maxio.advancedbilling.models.ComponentPricePointErrorItem;

ComponentPricePointErrorItem componentPricePointErrorItem = new ComponentPricePointErrorItem.Builder()
    .componentId(174)
    .message("message2")
    .pricePoint(72)
    .build();
```

