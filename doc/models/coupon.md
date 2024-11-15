
# Coupon

## Structure

`Coupon`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Code` | `String` | Optional | - | String getCode() | setCode(String code) |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `Amount` | `Double` | Optional | - | Double getAmount() | setAmount(Double amount) |
| `AmountInCents` | `Integer` | Optional | - | Integer getAmountInCents() | setAmountInCents(Integer amountInCents) |
| `ProductFamilyId` | `Integer` | Optional | - | Integer getProductFamilyId() | setProductFamilyId(Integer productFamilyId) |
| `ProductFamilyName` | `String` | Optional | - | String getProductFamilyName() | setProductFamilyName(String productFamilyName) |
| `StartDate` | `ZonedDateTime` | Optional | - | ZonedDateTime getStartDate() | setStartDate(ZonedDateTime startDate) |
| `EndDate` | `ZonedDateTime` | Optional | After the given time, this coupon code will be invalid for new signups. Recurring discounts started before this date will continue to recur even after this date. | ZonedDateTime getEndDate() | setEndDate(ZonedDateTime endDate) |
| `Percentage` | `String` | Optional | - | String getPercentage() | setPercentage(String percentage) |
| `Recurring` | `Boolean` | Optional | - | Boolean getRecurring() | setRecurring(Boolean recurring) |
| `RecurringScheme` | [`RecurringScheme`](../../doc/models/recurring-scheme.md) | Optional | - | RecurringScheme getRecurringScheme() | setRecurringScheme(RecurringScheme recurringScheme) |
| `DurationPeriodCount` | `Integer` | Optional | - | Integer getDurationPeriodCount() | setDurationPeriodCount(Integer durationPeriodCount) |
| `DurationInterval` | `Integer` | Optional | - | Integer getDurationInterval() | setDurationInterval(Integer durationInterval) |
| `DurationIntervalUnit` | `String` | Optional | - | String getDurationIntervalUnit() | setDurationIntervalUnit(String durationIntervalUnit) |
| `DurationIntervalSpan` | `String` | Optional | - | String getDurationIntervalSpan() | setDurationIntervalSpan(String durationIntervalSpan) |
| `AllowNegativeBalance` | `Boolean` | Optional | If set to true, discount is not limited (credits will carry forward to next billing). | Boolean getAllowNegativeBalance() | setAllowNegativeBalance(Boolean allowNegativeBalance) |
| `ArchivedAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getArchivedAt() | setArchivedAt(ZonedDateTime archivedAt) |
| `ConversionLimit` | `String` | Optional | - | String getConversionLimit() | setConversionLimit(String conversionLimit) |
| `Stackable` | `Boolean` | Optional | A stackable coupon can be combined with other coupons on a Subscription. | Boolean getStackable() | setStackable(Boolean stackable) |
| `CompoundingStrategy` | [`CompoundingStrategy1`](../../doc/models/compounding-strategy-1.md) | Optional | Applicable only to stackable coupons. For `compound`, Percentage-based discounts will be calculated against the remaining price, after prior discounts have been calculated. For `full-price`, Percentage-based discounts will always be calculated against the original item price, before other discounts are applied. | CompoundingStrategy1 getCompoundingStrategy() | setCompoundingStrategy(CompoundingStrategy1 compoundingStrategy) |
| `UseSiteExchangeRate` | `Boolean` | Optional | - | Boolean getUseSiteExchangeRate() | setUseSiteExchangeRate(Boolean useSiteExchangeRate) |
| `CreatedAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getCreatedAt() | setCreatedAt(ZonedDateTime createdAt) |
| `UpdatedAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getUpdatedAt() | setUpdatedAt(ZonedDateTime updatedAt) |
| `DiscountType` | [`DiscountType`](../../doc/models/discount-type.md) | Optional | - | DiscountType getDiscountType() | setDiscountType(DiscountType discountType) |
| `ExcludeMidPeriodAllocations` | `Boolean` | Optional | - | Boolean getExcludeMidPeriodAllocations() | setExcludeMidPeriodAllocations(Boolean excludeMidPeriodAllocations) |
| `ApplyOnCancelAtEndOfPeriod` | `Boolean` | Optional | - | Boolean getApplyOnCancelAtEndOfPeriod() | setApplyOnCancelAtEndOfPeriod(Boolean applyOnCancelAtEndOfPeriod) |
| `ApplyOnSubscriptionExpiration` | `Boolean` | Optional | - | Boolean getApplyOnSubscriptionExpiration() | setApplyOnSubscriptionExpiration(Boolean applyOnSubscriptionExpiration) |
| `CouponRestrictions` | [`List<CouponRestriction>`](../../doc/models/coupon-restriction.md) | Optional | - | List<CouponRestriction> getCouponRestrictions() | setCouponRestrictions(List<CouponRestriction> couponRestrictions) |
| `CurrencyPrices` | [`List<CouponCurrency>`](../../doc/models/coupon-currency.md) | Optional | Returned in read, find, and list endpoints if the query parameter is provided. | List<CouponCurrency> getCurrencyPrices() | setCurrencyPrices(List<CouponCurrency> currencyPrices) |

## Example (as JSON)

```json
{
  "id": 22,
  "name": "name2",
  "code": "code0",
  "description": "description2",
  "amount": 62.64
}
```

