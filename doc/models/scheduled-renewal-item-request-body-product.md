
# Scheduled Renewal Item Request Body Product

## Structure

`ScheduledRenewalItemRequestBodyProduct`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ItemType` | `String` | Required, Constant | Item type to add. Either Product or Component.<br><br>**Value**: `"Product"` | String getItemType() | setItemType(String itemType) |
| `ItemId` | `int` | Required | Product or component identifier. | int getItemId() | setItemId(int itemId) |
| `PricePointId` | `Integer` | Optional | Price point identifier. | Integer getPricePointId() | setPricePointId(Integer pricePointId) |
| `Quantity` | `Integer` | Optional | (Optional) Quantity for the item. | Integer getQuantity() | setQuantity(Integer quantity) |
| `CustomPrice` | [`ScheduledRenewalProductPricePoint`](../../doc/models/scheduled-renewal-product-price-point.md) | Optional | Custom pricing for a product within a scheduled renewal. | ScheduledRenewalProductPricePoint getCustomPrice() | setCustomPrice(ScheduledRenewalProductPricePoint customPrice) |

## Example

```java
import com.maxio.advancedbilling.models.IntervalUnit;
import com.maxio.advancedbilling.models.ScheduledRenewalItemRequestBodyProduct;
import com.maxio.advancedbilling.models.ScheduledRenewalProductPricePoint;
import com.maxio.advancedbilling.models.containers.ScheduledRenewalProductPricePointInterval;
import com.maxio.advancedbilling.models.containers.ScheduledRenewalProductPricePointPriceInCents;

ScheduledRenewalItemRequestBodyProduct scheduledRenewalItemRequestBodyProduct = new ScheduledRenewalItemRequestBodyProduct.Builder(
    "Product",
    154
)
.pricePointId(168)
.quantity(166)
.customPrice(new ScheduledRenewalProductPricePoint.Builder(
        ScheduledRenewalProductPricePointPriceInCents.fromString(
            "String3"
        ),
        ScheduledRenewalProductPricePointInterval.fromString(
            "String3"
        ),
        IntervalUnit.DAY
    )
    .name("name4")
    .handle("handle0")
    .taxIncluded(false)
    .initialChargeInCents(30L)
    .expirationInterval(52)
    .build())
.build();
```

