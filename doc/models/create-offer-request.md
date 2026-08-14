
# Create Offer Request

## Structure

`CreateOfferRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Offer` | [`CreateOffer`](../../doc/models/create-offer.md) | Required | - | CreateOffer getOffer() | setOffer(CreateOffer offer) |

## Example

```java
import com.maxio.advancedbilling.models.CreateOffer;
import com.maxio.advancedbilling.models.CreateOfferComponent;
import com.maxio.advancedbilling.models.CreateOfferRequest;
import java.util.Arrays;

CreateOfferRequest createOfferRequest = new CreateOfferRequest.Builder(
    new CreateOffer.Builder(
        "name4",
        "handle0",
        30
    )
    .description("description6")
    .productPricePointId(150)
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
                .build()
        ))
    .coupons(Arrays.asList(
            "coupons6"
        ))
    .build()
)
.build();
```

