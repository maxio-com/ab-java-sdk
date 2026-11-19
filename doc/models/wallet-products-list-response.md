
# Wallet Products List Response

## Structure

`WalletProductsListResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `WalletProducts` | [`List<WalletProductListItem>`](../../doc/models/wallet-product-list-item.md) | Required | - | List<WalletProductListItem> getWalletProducts() | setWalletProducts(List<WalletProductListItem> walletProducts) |
| `TotalCount` | `int` | Required | Total number of Wallet Products matching the filters, across all pages. | int getTotalCount() | setTotalCount(int totalCount) |
| `ArchivedCount` | `int` | Required | Not a simple count of archived products matching the filters. With `status=archived`, equals `total_count` (there's nothing else to report). With any other `status`, it's `0` whenever `total_count` is non-zero, and only when `total_count` is `0` does it become the number of archived Wallet Products matching the same `q` search term (ignoring `status`): an empty-state hint, not a running total. | int getArchivedCount() | setArchivedCount(int archivedCount) |

## Example

```java
import com.maxio.advancedbilling.models.ItemCategory;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.WalletProductListItem;
import com.maxio.advancedbilling.models.WalletProductsListResponse;
import java.util.Arrays;

WalletProductsListResponse walletProductsListResponse = new WalletProductsListResponse.Builder(
    Arrays.asList(
        new WalletProductListItem.Builder()
            .id(70)
            .name("name4")
            .handle("handle0")
            .pricingScheme(PricingScheme.STAIRSTEP)
            .unitName("unit_name6")
            .itemCategory(ItemCategory.ENUM_BUSINESS_SOFTWARE)
            .build()
    ),
    214,
    238
)
.build();
```

