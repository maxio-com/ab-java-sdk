
# Product

## Structure

`Product`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `Name` | `String` | Optional | The product name | String getName() | setName(String name) |
| `Handle` | `String` | Optional | The product API handle | String getHandle() | setHandle(String handle) |
| `Description` | `String` | Optional | The product description | String getDescription() | setDescription(String description) |
| `AccountingCode` | `String` | Optional | E.g. Internal ID or SKU Number | String getAccountingCode() | setAccountingCode(String accountingCode) |
| `RequestCreditCard` | `Boolean` | Optional | Deprecated value that can be ignored unless you have legacy hosted pages. For Public Signup Page users, please read this attribute from under the signup page. | Boolean getRequestCreditCard() | setRequestCreditCard(Boolean requestCreditCard) |
| `ExpirationInterval` | `Integer` | Optional | A numerical interval for the length a subscription to this product will run before it expires. See the description of interval for a description of how this value is coupled with an interval unit to calculate the full interval | Integer getExpirationInterval() | setExpirationInterval(Integer expirationInterval) |
| `ExpirationIntervalUnit` | [`ExpirationIntervalUnit`](../../doc/models/expiration-interval-unit.md) | Optional | A string representing the expiration interval unit for this product, either month, day or never | ExpirationIntervalUnit getExpirationIntervalUnit() | setExpirationIntervalUnit(ExpirationIntervalUnit expirationIntervalUnit) |
| `CreatedAt` | `ZonedDateTime` | Optional | Timestamp indicating when this product was created | ZonedDateTime getCreatedAt() | setCreatedAt(ZonedDateTime createdAt) |
| `UpdatedAt` | `ZonedDateTime` | Optional | Timestamp indicating when this product was last updated | ZonedDateTime getUpdatedAt() | setUpdatedAt(ZonedDateTime updatedAt) |
| `PriceInCents` | `Long` | Optional | The product price, in integer cents | Long getPriceInCents() | setPriceInCents(Long priceInCents) |
| `Interval` | `Integer` | Optional | The numerical interval. i.e. an interval of ‘30’ coupled with an interval_unit of day would mean this product would renew every 30 days | Integer getInterval() | setInterval(Integer interval) |
| `IntervalUnit` | [`IntervalUnit`](../../doc/models/interval-unit.md) | Optional | A string representing the interval unit for this product, either month or day | IntervalUnit getIntervalUnit() | setIntervalUnit(IntervalUnit intervalUnit) |
| `InitialChargeInCents` | `Long` | Optional | The up front charge you have specified. | Long getInitialChargeInCents() | setInitialChargeInCents(Long initialChargeInCents) |
| `TrialPriceInCents` | `Long` | Optional | The price of the trial period for a subscription to this product, in integer cents. | Long getTrialPriceInCents() | setTrialPriceInCents(Long trialPriceInCents) |
| `TrialInterval` | `Integer` | Optional | A numerical interval for the length of the trial period of a subscription to this product. See the description of interval for a description of how this value is coupled with an interval unit to calculate the full interval | Integer getTrialInterval() | setTrialInterval(Integer trialInterval) |
| `TrialIntervalUnit` | [`IntervalUnit`](../../doc/models/interval-unit.md) | Optional | A string representing the trial interval unit for this product, either month or day | IntervalUnit getTrialIntervalUnit() | setTrialIntervalUnit(IntervalUnit trialIntervalUnit) |
| `ArchivedAt` | `ZonedDateTime` | Optional | Timestamp indicating when this product was archived | ZonedDateTime getArchivedAt() | setArchivedAt(ZonedDateTime archivedAt) |
| `RequireCreditCard` | `Boolean` | Optional | Boolean that controls whether a payment profile is required to be entered for customers wishing to sign up on this product. | Boolean getRequireCreditCard() | setRequireCreditCard(Boolean requireCreditCard) |
| `ReturnParams` | `String` | Optional | - | String getReturnParams() | setReturnParams(String returnParams) |
| `Taxable` | `Boolean` | Optional | - | Boolean getTaxable() | setTaxable(Boolean taxable) |
| `UpdateReturnUrl` | `String` | Optional | The url to which a customer will be returned after a successful account update | String getUpdateReturnUrl() | setUpdateReturnUrl(String updateReturnUrl) |
| `InitialChargeAfterTrial` | `Boolean` | Optional | - | Boolean getInitialChargeAfterTrial() | setInitialChargeAfterTrial(Boolean initialChargeAfterTrial) |
| `VersionNumber` | `Integer` | Optional | The version of the product | Integer getVersionNumber() | setVersionNumber(Integer versionNumber) |
| `UpdateReturnParams` | `String` | Optional | The parameters will append to the url after a successful account update. See [help documentation](https://help.chargify.com/products/product-editing.html#return-parameters-after-account-update) | String getUpdateReturnParams() | setUpdateReturnParams(String updateReturnParams) |
| `ProductFamily` | [`ProductFamily`](../../doc/models/product-family.md) | Optional | - | ProductFamily getProductFamily() | setProductFamily(ProductFamily productFamily) |
| `PublicSignupPages` | [`List<PublicSignupPage>`](../../doc/models/public-signup-page.md) | Optional | - | List<PublicSignupPage> getPublicSignupPages() | setPublicSignupPages(List<PublicSignupPage> publicSignupPages) |
| `ProductPricePointName` | `String` | Optional | - | String getProductPricePointName() | setProductPricePointName(String productPricePointName) |
| `RequestBillingAddress` | `Boolean` | Optional | A boolean indicating whether to request a billing address on any Self-Service Pages that are used by subscribers of this product. | Boolean getRequestBillingAddress() | setRequestBillingAddress(Boolean requestBillingAddress) |
| `RequireBillingAddress` | `Boolean` | Optional | A boolean indicating whether a billing address is required to add a payment profile, especially at signup. | Boolean getRequireBillingAddress() | setRequireBillingAddress(Boolean requireBillingAddress) |
| `RequireShippingAddress` | `Boolean` | Optional | A boolean indicating whether a shipping address is required for the customer, especially at signup. | Boolean getRequireShippingAddress() | setRequireShippingAddress(Boolean requireShippingAddress) |
| `TaxCode` | `String` | Optional | A string representing the tax code related to the product type. This is especially important when using the Avalara service to tax based on locale. This attribute has a max length of 10 characters. | String getTaxCode() | setTaxCode(String taxCode) |
| `DefaultProductPricePointId` | `Integer` | Optional | - | Integer getDefaultProductPricePointId() | setDefaultProductPricePointId(Integer defaultProductPricePointId) |
| `UseSiteExchangeRate` | `Boolean` | Optional | - | Boolean getUseSiteExchangeRate() | setUseSiteExchangeRate(Boolean useSiteExchangeRate) |
| `ItemCategory` | `String` | Optional | One of the following: Business Software, Consumer Software, Digital Services, Physical Goods, Other | String getItemCategory() | setItemCategory(String itemCategory) |
| `ProductPricePointId` | `Integer` | Optional | - | Integer getProductPricePointId() | setProductPricePointId(Integer productPricePointId) |
| `ProductPricePointHandle` | `String` | Optional | - | String getProductPricePointHandle() | setProductPricePointHandle(String productPricePointHandle) |

## Example (as JSON)

```json
{
  "id": 180,
  "name": "name4",
  "handle": "handle0",
  "description": "description4",
  "accounting_code": "accounting_code0"
}
```

