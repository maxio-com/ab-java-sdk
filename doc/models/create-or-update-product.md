
# Create or Update Product

## Structure

`CreateOrUpdateProduct`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | The product name | String getName() | setName(String name) |
| `Handle` | `String` | Optional | The product API handle | String getHandle() | setHandle(String handle) |
| `Description` | `String` | Required | The product description | String getDescription() | setDescription(String description) |
| `AccountingCode` | `String` | Optional | E.g. Internal ID or SKU Number | String getAccountingCode() | setAccountingCode(String accountingCode) |
| `RequireCreditCard` | `Boolean` | Optional | Deprecated value that can be ignored unless you have legacy hosted pages. For Public Signup Page users, read this attribute from under the signup page. | Boolean getRequireCreditCard() | setRequireCreditCard(Boolean requireCreditCard) |
| `PriceInCents` | `long` | Required | The product price, in integer cents | long getPriceInCents() | setPriceInCents(long priceInCents) |
| `Interval` | `int` | Required | The numerical interval. e.g., an interval of ‘30’ coupled with an interval_unit of day would mean this product would renew every 30 days. | int getInterval() | setInterval(int interval) |
| `IntervalUnit` | [`IntervalUnit`](../../doc/models/interval-unit.md) | Required | A string representing the interval unit for this product, either month or day | IntervalUnit getIntervalUnit() | setIntervalUnit(IntervalUnit intervalUnit) |
| `TrialPriceInCents` | `Long` | Optional | The product trial price, in integer cents | Long getTrialPriceInCents() | setTrialPriceInCents(Long trialPriceInCents) |
| `TrialInterval` | `Integer` | Optional | The numerical trial interval. e.g., an interval of ‘30’ coupled with a trial_interval_unit of day would mean this product trial would last 30 days. | Integer getTrialInterval() | setTrialInterval(Integer trialInterval) |
| `TrialIntervalUnit` | [`IntervalUnit`](../../doc/models/interval-unit.md) | Optional | A string representing the trial interval unit for this product, either month or day | IntervalUnit getTrialIntervalUnit() | setTrialIntervalUnit(IntervalUnit trialIntervalUnit) |
| `TrialType` | [`TrialType`](../../doc/models/trial-type.md) | Optional | Indicates how a trial is handled when the trial period ends and there is no credit card on file. For `no_obligation`, the subscription transitions to a Trial Ended state. Maxio will not send any emails or statements. For `payment_expected`, the subscription transitions to a Past Due state. Maxio will send normal dunning emails and statements according to your other settings. | TrialType getTrialType() | setTrialType(TrialType trialType) |
| `ExpirationInterval` | `Integer` | Optional | The numerical expiration interval. e.g., an expiration_interval of ‘30’ coupled with an expiration_interval_unit of day would mean this product would expire after 30 days. | Integer getExpirationInterval() | setExpirationInterval(Integer expirationInterval) |
| `ExpirationIntervalUnit` | [`ExpirationIntervalUnit`](../../doc/models/expiration-interval-unit.md) | Optional | A string representing the expiration interval unit for this product, either month, day or never | ExpirationIntervalUnit getExpirationIntervalUnit() | setExpirationIntervalUnit(ExpirationIntervalUnit expirationIntervalUnit) |
| `AutoCreateSignupPage` | `Boolean` | Optional | - | Boolean getAutoCreateSignupPage() | setAutoCreateSignupPage(Boolean autoCreateSignupPage) |
| `TaxCode` | `String` | Optional | A string representing the tax code related to the product type. This is especially important when using AvaTax to tax based on locale. This attribute has a max length of 25 characters. | String getTaxCode() | setTaxCode(String taxCode) |
| `UnspscCode` | `String` | Optional | (Optional) Custom UNSPSC commodity code for Level 3/CEDP payment data. When set, this value is sent as the commodity code on invoice line items for this product instead of the default derived from item_category. | String getUnspscCode() | setUnspscCode(String unspscCode) |

## Example

```java
import com.maxio.advancedbilling.models.CreateOrUpdateProduct;
import com.maxio.advancedbilling.models.IntervalUnit;

CreateOrUpdateProduct createOrUpdateProduct = new CreateOrUpdateProduct.Builder(
    "name6",
    "description4",
    138L,
    154,
    IntervalUnit.DAY
)
.handle("handle2")
.accountingCode("accounting_code2")
.requireCreditCard(false)
.trialPriceInCents(50L)
.trialInterval(252)
.build();
```

