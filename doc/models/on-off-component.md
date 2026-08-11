
# On Off Component

## Structure

`OnOffComponent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | A name for this component that is suitable for showing customers and displaying on billing statements, e.g., "Minutes". | String getName() | setName(String name) |
| `Description` | `String` | Optional | A description for the component that will be displayed to the user on the hosted signup page. | String getDescription() | setDescription(String description) |
| `Handle` | `String` | Optional | A unique identifier for your use that can be used to retrieve this component in subsequent requests. Must start with a letter or number and may only contain lowercase letters, numbers, or the characters '.', ':', '-', or '_'.<br><br>**Constraints**: *Pattern*: `^[a-z0-9][a-z0-9\-_:.]*$` | String getHandle() | setHandle(String handle) |
| `Taxable` | `Boolean` | Optional | Boolean flag describing whether a component is taxable or not. | Boolean getTaxable() | setTaxable(Boolean taxable) |
| `UpgradeCharge` | [`CreditType`](../../doc/models/credit-type.md) | Optional | The type of credit to be created when upgrading/downgrading. Defaults to the component and then site setting if one is not provided. | CreditType getUpgradeCharge() | setUpgradeCharge(CreditType upgradeCharge) |
| `DowngradeCredit` | [`CreditType`](../../doc/models/credit-type.md) | Optional | The type of credit to be created when upgrading/downgrading. Defaults to the component and then site setting if one is not provided. | CreditType getDowngradeCredit() | setDowngradeCredit(CreditType downgradeCredit) |
| `PricePoints` | [`List<ComponentPricePointItem>`](../../doc/models/component-price-point-item.md) | Optional | - | List<ComponentPricePointItem> getPricePoints() | setPricePoints(List<ComponentPricePointItem> pricePoints) |
| `UnitPrice` | [`OnOffComponentUnitPrice`](../../doc/models/containers/on-off-component-unit-price.md) | Required | This is a container for one-of cases. | OnOffComponentUnitPrice getUnitPrice() | setUnitPrice(OnOffComponentUnitPrice unitPrice) |
| `TaxCode` | `String` | Optional | A string representing the tax code related to the component type. This is especially important when using AvaTax to tax based on locale. This attribute has a max length of 25 characters. | String getTaxCode() | setTaxCode(String taxCode) |
| `HideDateRangeOnInvoice` | `Boolean` | Optional | (Only available on Relationship Invoicing sites) Boolean flag describing if the service date range should show for the component on generated invoices. | Boolean getHideDateRangeOnInvoice() | setHideDateRangeOnInvoice(Boolean hideDateRangeOnInvoice) |
| `DisplayOnHostedPage` | `Boolean` | Optional | - | Boolean getDisplayOnHostedPage() | setDisplayOnHostedPage(Boolean displayOnHostedPage) |
| `AllowFractionalQuantities` | `Boolean` | Optional | - | Boolean getAllowFractionalQuantities() | setAllowFractionalQuantities(Boolean allowFractionalQuantities) |
| `PublicSignupPageIds` | `List<Integer>` | Optional | - | List<Integer> getPublicSignupPageIds() | setPublicSignupPageIds(List<Integer> publicSignupPageIds) |
| `Interval` | `Integer` | Optional | The numerical interval. e.g., an interval of ‘30’ coupled with an interval_unit of day would mean this component's default price point would renew every 30 days. This property is only available for sites with Multifrequency enabled. | Integer getInterval() | setInterval(Integer interval) |
| `IntervalUnit` | [`IntervalUnit`](../../doc/models/interval-unit.md) | Optional | A string representing the interval unit for this component's default price point, either month or day. This property is only available for sites with Multifrequency enabled. | IntervalUnit getIntervalUnit() | setIntervalUnit(IntervalUnit intervalUnit) |
| `UnspscCode` | `String` | Optional | (Optional) Custom UNSPSC commodity code for Level 3/CEDP payment data. When set, this value is sent as the commodity code on invoice line items for this component instead of the default derived from item_category. | String getUnspscCode() | setUnspscCode(String unspscCode) |

## Example

```java
import com.maxio.advancedbilling.models.CreditType;
import com.maxio.advancedbilling.models.OnOffComponent;
import com.maxio.advancedbilling.models.containers.OnOffComponentUnitPrice;

OnOffComponent onOffComponent = new OnOffComponent.Builder(
    "name0",
    OnOffComponentUnitPrice.fromString(
        "String9"
    )
)
.description("description0")
.handle("handle6")
.taxable(false)
.upgradeCharge(CreditType.FULL)
.downgradeCredit(CreditType.FULL)
.build();
```

