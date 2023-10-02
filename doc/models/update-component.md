
# Update Component

## Structure

`UpdateComponent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Handle` | `String` | Optional | - | String getHandle() | setHandle(String handle) |
| `Name` | `String` | Optional | The name of the Component, suitable for display on statements. i.e. Text Messages. | String getName() | setName(String name) |
| `Description` | `String` | Optional | The description of the component. | String getDescription() | setDescription(String description) |
| `AccountingCode` | `String` | Optional | - | String getAccountingCode() | setAccountingCode(String accountingCode) |
| `Taxable` | `Boolean` | Optional | Boolean flag describing whether a component is taxable or not. | Boolean getTaxable() | setTaxable(Boolean taxable) |
| `TaxCode` | `String` | Optional | A string representing the tax code related to the component type. This is especially important when using the Avalara service to tax based on locale. This attribute has a max length of 10 characters. | String getTaxCode() | setTaxCode(String taxCode) |
| `ItemCategory` | [`ItemCategoryEnum`](../../doc/models/item-category-enum.md) | Optional | One of the following: Business Software, Consumer Software, Digital Services, Physical Goods, Other | ItemCategoryEnum getItemCategory() | setItemCategory(ItemCategoryEnum itemCategory) |
| `DisplayOnHostedPage` | `Boolean` | Optional | - | Boolean getDisplayOnHostedPage() | setDisplayOnHostedPage(Boolean displayOnHostedPage) |
| `UpgradeCharge` | [`CreditTypeEnum`](../../doc/models/credit-type-enum.md) | Optional | The type of charge to be applied when a component is upgraded. Valid values are: `prorated`, `full`, `none`. | CreditTypeEnum getUpgradeCharge() | setUpgradeCharge(CreditTypeEnum upgradeCharge) |

## Example (as JSON)

```json
{
  "item_category": "Business Software",
  "handle": "handle6",
  "name": "name0",
  "description": "description0",
  "accounting_code": "accounting_code6",
  "taxable": false
}
```

