
# Wallet Product

## Structure

`WalletProduct`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `UnitName` | `String` | Required | The name of the unit the Wallet Product's usage is measured in, for example `tokens`. | String getUnitName() | setUnitName(String unitName) |
| `Handle` | `String` | Optional | - | String getHandle() | setHandle(String handle) |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `Taxable` | `Boolean` | Optional | - | Boolean getTaxable() | setTaxable(Boolean taxable) |
| `TaxCode` | `String` | Optional | - | String getTaxCode() | setTaxCode(String taxCode) |
| `AccountingCode` | `String` | Optional | - | String getAccountingCode() | setAccountingCode(String accountingCode) |
| `ItemCategory` | [`ItemCategory`](../../doc/models/item-category.md) | Optional | One of the following: Business Software, Consumer Software, Digital Services, Physical Goods, Other | ItemCategory getItemCategory() | setItemCategory(ItemCategory itemCategory) |
| `PricePoint` | [`WalletProductPricePointAttributes`](../../doc/models/wallet-product-price-point-attributes.md) | Optional | Creates one price point for the Wallet Product in the same call. Ignored if `price_points` is also sent. | WalletProductPricePointAttributes getPricePoint() | setPricePoint(WalletProductPricePointAttributes pricePoint) |
| `PricePoints` | [`List<WalletProductPricePointAttributes>`](../../doc/models/wallet-product-price-point-attributes.md) | Optional | Creates several price points for the Wallet Product in the same call, winning over `price_point` if both are sent. The first price point created becomes the Wallet Product's default. The whole call is one transaction: if any price point in the array fails validation, nothing is created, including the Wallet Product itself. | List<WalletProductPricePointAttributes> getPricePoints() | setPricePoints(List<WalletProductPricePointAttributes> pricePoints) |

## Example

```java
import com.maxio.advancedbilling.models.ItemCategory;
import com.maxio.advancedbilling.models.WalletProduct;

WalletProduct walletProduct = new WalletProduct.Builder(
    "name4",
    "unit_name6"
)
.handle("handle0")
.description("description4")
.taxable(false)
.taxCode("tax_code2")
.accountingCode("accounting_code0")
.itemCategory(ItemCategory.ENUM_BUSINESS_SOFTWARE)
.build();
```

