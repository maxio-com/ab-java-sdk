
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
| `RequireCreditCard` | `Boolean` | Optional | Deprecated value that can be ignored unless you have legacy hosted pages. For Public Signup Page users, please read this attribute from under the signup page. | Boolean getRequireCreditCard() | setRequireCreditCard(Boolean requireCreditCard) |
| `PriceInCents` | `long` | Required | The product price, in integer cents | long getPriceInCents() | setPriceInCents(long priceInCents) |
| `Interval` | `int` | Required | The numerical interval. i.e. an interval of ‘30’ coupled with an interval_unit of day would mean this product would renew every 30 days | int getInterval() | setInterval(int interval) |
| `IntervalUnit` | [`IntervalUnit`](../../doc/models/interval-unit.md) | Required | A string representing the interval unit for this product, either month or day | IntervalUnit getIntervalUnit() | setIntervalUnit(IntervalUnit intervalUnit) |
| `TrialPriceInCents` | `Long` | Optional | The product trial price, in integer cents | Long getTrialPriceInCents() | setTrialPriceInCents(Long trialPriceInCents) |
| `TrialInterval` | `Integer` | Optional | The numerical trial interval. i.e. an interval of ‘30’ coupled with a trial_interval_unit of day would mean this product trial would last 30 days. | Integer getTrialInterval() | setTrialInterval(Integer trialInterval) |
| `TrialIntervalUnit` | [`IntervalUnit`](../../doc/models/interval-unit.md) | Optional | A string representing the trial interval unit for this product, either month or day | IntervalUnit getTrialIntervalUnit() | setTrialIntervalUnit(IntervalUnit trialIntervalUnit) |
| `TrialType` | `String` | Optional | - | String getTrialType() | setTrialType(String trialType) |
| `ExpirationInterval` | `Integer` | Optional | The numerical expiration interval. i.e. an expiration_interval of ‘30’ coupled with an expiration_interval_unit of day would mean this product would expire after 30 days. | Integer getExpirationInterval() | setExpirationInterval(Integer expirationInterval) |
| `ExpirationIntervalUnit` | [`IntervalUnit`](../../doc/models/interval-unit.md) | Optional | A string representing the expiration interval unit for this product, either month or day | IntervalUnit getExpirationIntervalUnit() | setExpirationIntervalUnit(IntervalUnit expirationIntervalUnit) |
| `AutoCreateSignupPage` | `Boolean` | Optional | - | Boolean getAutoCreateSignupPage() | setAutoCreateSignupPage(Boolean autoCreateSignupPage) |
| `TaxCode` | `String` | Optional | A string representing the tax code related to the product type. This is especially important when using the Avalara service to tax based on locale. This attribute has a max length of 10 characters.<br>**Constraints**: *Maximum Length*: `10` | String getTaxCode() | setTaxCode(String taxCode) |

## Example (as JSON)

```json
{
  "name": "name8",
  "handle": "handle4",
  "description": "description8",
  "accounting_code": "accounting_code4",
  "require_credit_card": false,
  "price_in_cents": 190,
  "interval": 174,
  "interval_unit": "day",
  "trial_price_in_cents": 22,
  "trial_interval": 76
}
```

