
# Create Wallet Product Request

Does not accept `product_family_id`: a Wallet Product never belongs to a product family. The underlying endpoint accepts the param, but only to reject it; sending one returns `422` ("Product family cannot be set on a wallet product") rather than silently ignoring it.

## Structure

`CreateWalletProductRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `WalletProduct` | [`WalletProduct`](../../doc/models/wallet-product.md) | Required | - | WalletProduct getWalletProduct() | setWalletProduct(WalletProduct walletProduct) |

## Example

```java
import com.maxio.advancedbilling.models.CreateWalletProductRequest;
import com.maxio.advancedbilling.models.ItemCategory;
import com.maxio.advancedbilling.models.WalletProduct;

CreateWalletProductRequest createWalletProductRequest = new CreateWalletProductRequest.Builder(
    new WalletProduct.Builder(
        "name0",
        "unit_name2"
    )
    .handle("handle6")
    .description("description0")
    .taxable(false)
    .taxCode("tax_code8")
    .accountingCode("accounting_code6")
    .itemCategory(ItemCategory.ENUM_BUSINESS_SOFTWARE)
    .build()
)
.build();
```

