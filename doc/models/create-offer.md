
# Create Offer

## Structure

`CreateOffer`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Handle` | `String` | Required | - | String getHandle() | setHandle(String handle) |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `ProductId` | `int` | Required | - | int getProductId() | setProductId(int productId) |
| `ProductPricePointId` | `Integer` | Optional | - | Integer getProductPricePointId() | setProductPricePointId(Integer productPricePointId) |
| `Components` | [`List<CreateOfferComponent>`](../../doc/models/create-offer-component.md) | Optional | - | List<CreateOfferComponent> getComponents() | setComponents(List<CreateOfferComponent> components) |
| `Coupons` | `List<String>` | Optional | - | List<String> getCoupons() | setCoupons(List<String> coupons) |

## Example

```java
import com.maxio.advancedbilling.models.CreateOffer;
import com.maxio.advancedbilling.models.CreateOfferComponent;
import java.util.Arrays;

CreateOffer createOffer = new CreateOffer.Builder(
    "name6",
    "handle2",
    66
)
.description("description6")
.productPricePointId(246)
.components(Arrays.asList(
        new CreateOfferComponent.Builder()
            .componentId(108)
            .pricePointId(124)
            .startingQuantity(84)
            .build(),
        new CreateOfferComponent.Builder()
            .componentId(108)
            .pricePointId(124)
            .startingQuantity(84)
            .build(),
        new CreateOfferComponent.Builder()
            .componentId(108)
            .pricePointId(124)
            .startingQuantity(84)
            .build()
    ))
.coupons(Arrays.asList(
        "coupons6",
        "coupons5",
        "coupons4"
    ))
.build();
```

