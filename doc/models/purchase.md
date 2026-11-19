
# Purchase

## Structure

`Purchase`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Quantity` | [`PurchaseQuantity`](../../doc/models/containers/purchase-quantity.md) | Required | This is a container for one-of cases. | PurchaseQuantity getQuantity() | setQuantity(PurchaseQuantity quantity) |
| `PricePointId` | `Integer` | Optional | The price point to purchase at. Must belong to the wallet's billing product. Defaults to the `price_point_id` set on the wallet. | Integer getPricePointId() | setPricePointId(Integer pricePointId) |
| `Memo` | `String` | Optional | (Optional) A note recorded on the resulting grant's ledger row.<br><br>**Constraints**: *Maximum Length*: `255` | String getMemo() | setMemo(String memo) |

## Example

```java
import com.maxio.advancedbilling.models.Purchase;
import com.maxio.advancedbilling.models.containers.PurchaseQuantity;

Purchase purchase = new Purchase.Builder(
    PurchaseQuantity.fromString(
        "String5"
    )
)
.pricePointId(20)
.memo("memo2")
.build();
```

