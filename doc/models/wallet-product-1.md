
# Wallet Product 1

## Structure

`WalletProduct1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `Taxable` | `Boolean` | Optional | - | Boolean getTaxable() | setTaxable(Boolean taxable) |
| `TaxCode` | `String` | Optional | - | String getTaxCode() | setTaxCode(String taxCode) |
| `AccountingCode` | `String` | Optional | - | String getAccountingCode() | setAccountingCode(String accountingCode) |
| `ItemCategory` | [`ItemCategory`](../../doc/models/item-category.md) | Optional | One of the following: Business Software, Consumer Software, Digital Services, Physical Goods, Other | ItemCategory getItemCategory() | setItemCategory(ItemCategory itemCategory) |

## Example

```java
import com.maxio.advancedbilling.models.ItemCategory;
import com.maxio.advancedbilling.models.WalletProduct1;

WalletProduct1 walletProduct1 = new WalletProduct1.Builder()
    .name("name8")
    .description("description8")
    .taxable(false)
    .taxCode("tax_code6")
    .accountingCode("accounting_code4")
    .itemCategory(ItemCategory.ENUM_BUSINESS_SOFTWARE)
    .build();
```

