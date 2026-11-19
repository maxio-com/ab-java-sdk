
# Create Wallet Purchase Request

Purchases prepaid units for the wallet at a price point, charging the subscription's payment method.

## Structure

`CreateWalletPurchaseRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Purchase` | [`Purchase`](../../doc/models/purchase.md) | Required | - | Purchase getPurchase() | setPurchase(Purchase purchase) |

## Example

```java
import com.maxio.advancedbilling.models.CreateWalletPurchaseRequest;
import com.maxio.advancedbilling.models.Purchase;
import com.maxio.advancedbilling.models.containers.PurchaseQuantity;

CreateWalletPurchaseRequest createWalletPurchaseRequest = new CreateWalletPurchaseRequest.Builder(
    new Purchase.Builder(
        PurchaseQuantity.fromString(
            "String5"
        )
    )
    .pricePointId(20)
    .memo("memo2")
    .build()
)
.build();
```

