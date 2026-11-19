
# Update Component

## Structure

`UpdateComponent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Handle` | `String` | Optional | - | String getHandle() | setHandle(String handle) |
| `Name` | `String` | Optional | The name of the Component, suitable for display on statements. e.g., Text Messages. | String getName() | setName(String name) |
| `Description` | `String` | Optional | The description of the component. | String getDescription() | setDescription(String description) |
| `AccountingCode` | `String` | Optional | - | String getAccountingCode() | setAccountingCode(String accountingCode) |
| `Taxable` | `Boolean` | Optional | Boolean flag describing whether a component is taxable or not. | Boolean getTaxable() | setTaxable(Boolean taxable) |
| `TaxCode` | `String` | Optional | A string representing the tax code related to the component type. This is especially important when using AvaTax to tax based on locale. This attribute has a max length of 25 characters. | String getTaxCode() | setTaxCode(String taxCode) |
| `ItemCategory` | [`ItemCategory`](../../doc/models/item-category.md) | Optional | One of the following: Business Software, Consumer Software, Digital Services, Physical Goods, Other | ItemCategory getItemCategory() | setItemCategory(ItemCategory itemCategory) |
| `DisplayOnHostedPage` | `Boolean` | Optional | - | Boolean getDisplayOnHostedPage() | setDisplayOnHostedPage(Boolean displayOnHostedPage) |
| `UpgradeCharge` | [`CreditType`](../../doc/models/credit-type.md) | Optional | The type of credit to be created when upgrading/downgrading. Defaults to the component and then site setting if one is not provided. | CreditType getUpgradeCharge() | setUpgradeCharge(CreditType upgradeCharge) |
| `EventBasedBillingMetricId` | `Integer` | Optional | For components using legacy Events Based Billing, changes the attached site-owned metric. An unchanged metric ID does not change the source. Sites using Maxio Metering ignore this input. This ID does not identify a Maxio Metering meter. | Integer getEventBasedBillingMetricId() | setEventBasedBillingMetricId(Integer eventBasedBillingMetricId) |
| `MeteringMeterId` | `Integer` | Optional | For components using Maxio Metering, changes the attached merchant-owned meter. Do not supply together with a non-blank metering_formula. Ignored for components using legacy Events Based Billing; not applicable to other component kinds. | Integer getMeteringMeterId() | setMeteringMeterId(Integer meteringMeterId) |
| `MeteringFormula` | `String` | Optional | For components using Maxio Metering, sets an Advanced Formula using meters available to the site. Supply a non-blank formula; do not supply together with metering_meter_id. Ignored for components using legacy Events Based Billing; not applicable to other component kinds. | String getMeteringFormula() | setMeteringFormula(String meteringFormula) |
| `UnspscCode` | `String` | Optional | (Optional) Custom UNSPSC commodity code for Level 3/CEDP payment data. When set, this value is sent as the commodity code on invoice line items for this component instead of the default derived from item_category. | String getUnspscCode() | setUnspscCode(String unspscCode) |

## Example

```java
import com.maxio.advancedbilling.models.ItemCategory;
import com.maxio.advancedbilling.models.UpdateComponent;

UpdateComponent updateComponent = new UpdateComponent.Builder()
    .handle("handle4")
    .name("name8")
    .description("description8")
    .accountingCode("accounting_code4")
    .taxable(false)
    .itemCategory(ItemCategory.ENUM_BUSINESS_SOFTWARE)
    .build();
```

