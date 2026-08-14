
# Create Offer Component

## Structure

`CreateOfferComponent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ComponentId` | `Integer` | Optional | - | Integer getComponentId() | setComponentId(Integer componentId) |
| `PricePointId` | `Integer` | Optional | - | Integer getPricePointId() | setPricePointId(Integer pricePointId) |
| `StartingQuantity` | `Integer` | Optional | - | Integer getStartingQuantity() | setStartingQuantity(Integer startingQuantity) |

## Example

```java
import com.maxio.advancedbilling.models.CreateOfferComponent;

CreateOfferComponent createOfferComponent = new CreateOfferComponent.Builder()
    .componentId(252)
    .pricePointId(20)
    .startingQuantity(196)
    .build();
```

