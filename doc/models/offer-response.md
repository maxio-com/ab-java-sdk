
# Offer Response

## Structure

`OfferResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Offer` | [`Offer`](../../doc/models/offer.md) | Optional | - | Offer getOffer() | setOffer(Offer offer) |

## Example

```java
import com.maxio.advancedbilling.models.Offer;
import com.maxio.advancedbilling.models.OfferResponse;

OfferResponse offerResponse = new OfferResponse.Builder()
    .offer(new Offer.Builder()
        .id(28)
        .siteId(210)
        .productFamilyId(224)
        .productId(30)
        .productPricePointId(150)
        .build())
    .build();
```

