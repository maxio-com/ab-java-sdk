
# List Offers Response

## Structure

`ListOffersResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Offers` | [`List<Offer>`](../../doc/models/offer.md) | Optional | - | List<Offer> getOffers() | setOffers(List<Offer> offers) |

## Example

```java
import com.maxio.advancedbilling.models.ListOffersResponse;
import com.maxio.advancedbilling.models.Offer;
import java.util.Arrays;

ListOffersResponse listOffersResponse = new ListOffersResponse.Builder()
    .offers(Arrays.asList(
        new Offer.Builder()
            .id(12)
            .siteId(194)
            .productFamilyId(16)
            .productId(210)
            .productPricePointId(134)
            .build()
    ))
    .build();
```

