
# Wallet Product Response

A Wallet Product is a Component created with no product family, so it returns the full Component field set under a `wallet_product` root instead of `component`.

## Structure

`WalletProductResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `WalletProduct` | [`Component`](../../doc/models/component.md) | Required | - | Component getWalletProduct() | setWalletProduct(Component walletProduct) |

## Example

```java
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.ItemCategory;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.WalletProductResponse;

WalletProductResponse walletProductResponse = new WalletProductResponse.Builder(
    new Component.Builder()
        .id(224)
        .name("name0")
        .handle("handle6")
        .pricingScheme(PricingScheme.PER_UNIT)
        .unitName("unit_name2")
        .itemCategory(ItemCategory.ENUM_BUSINESS_SOFTWARE)
        .build()
)
.build();
```

