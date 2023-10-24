
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
| `ItemCategory` | [`ItemCategory`](../../doc/models/item-category.md) | Optional | One of the following: Business Software, Consumer Software, Digital Services, Physical Goods, Other | ItemCategory getItemCategory() | setItemCategory(ItemCategory itemCategory) |
| `DisplayOnHostedPage` | `Boolean` | Optional | - | Boolean getDisplayOnHostedPage() | setDisplayOnHostedPage(Boolean displayOnHostedPage) |
| `UpgradeCharge` | [`CreditType`](../../doc/models/credit-type.md) | Optional | The type of charge to be applied when a component is upgraded. Valid values are: `prorated`, `full`, `none`. | CreditType getUpgradeCharge() | setUpgradeCharge(CreditType upgradeCharge) |

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

