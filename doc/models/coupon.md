
# Coupon

## Structure

`Coupon`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Double` | Optional | - | Double getId() | setId(Double id) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Code` | `String` | Optional | - | String getCode() | setCode(String code) |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `Amount` | `Double` | Optional | - | Double getAmount() | setAmount(Double amount) |
| `AmountInCents` | `Integer` | Optional | - | Integer getAmountInCents() | setAmountInCents(Integer amountInCents) |
| `ProductFamilyId` | `Integer` | Optional | - | Integer getProductFamilyId() | setProductFamilyId(Integer productFamilyId) |
| `ProductFamilyName` | `String` | Optional | - | String getProductFamilyName() | setProductFamilyName(String productFamilyName) |
| `StartDate` | `String` | Optional | - | String getStartDate() | setStartDate(String startDate) |
| `EndDate` | `String` | Optional | - | String getEndDate() | setEndDate(String endDate) |
| `Percentage` | `Double` | Optional | - | Double getPercentage() | setPercentage(Double percentage) |
| `Recurring` | `Boolean` | Optional | - | Boolean getRecurring() | setRecurring(Boolean recurring) |
| `RecurringScheme` | [`RecurringScheme`](../../doc/models/recurring-scheme.md) | Optional | - | RecurringScheme getRecurringScheme() | setRecurringScheme(RecurringScheme recurringScheme) |
| `DurationPeriodCount` | `Integer` | Optional | - | Integer getDurationPeriodCount() | setDurationPeriodCount(Integer durationPeriodCount) |
| `DurationInterval` | `Integer` | Optional | - | Integer getDurationInterval() | setDurationInterval(Integer durationInterval) |
| `DurationIntervalUnit` | `String` | Optional | - | String getDurationIntervalUnit() | setDurationIntervalUnit(String durationIntervalUnit) |
| `DurationIntervalSpan` | `String` | Optional | - | String getDurationIntervalSpan() | setDurationIntervalSpan(String durationIntervalSpan) |
| `AllowNegativeBalance` | `Boolean` | Optional | - | Boolean getAllowNegativeBalance() | setAllowNegativeBalance(Boolean allowNegativeBalance) |
| `ArchivedAt` | `String` | Optional | - | String getArchivedAt() | setArchivedAt(String archivedAt) |
| `ConversionLimit` | `String` | Optional | - | String getConversionLimit() | setConversionLimit(String conversionLimit) |
| `Stackable` | `Boolean` | Optional | - | Boolean getStackable() | setStackable(Boolean stackable) |
| `CompoundingStrategy` | [`CouponCompoundingStrategy`](../../doc/models/containers/coupon-compounding-strategy.md) | Optional | This is a container for any-of cases. | CouponCompoundingStrategy getCompoundingStrategy() | setCompoundingStrategy(CouponCompoundingStrategy compoundingStrategy) |
| `UseSiteExchangeRate` | `Boolean` | Optional | - | Boolean getUseSiteExchangeRate() | setUseSiteExchangeRate(Boolean useSiteExchangeRate) |
| `CreatedAt` | `String` | Optional | - | String getCreatedAt() | setCreatedAt(String createdAt) |
| `UpdatedAt` | `String` | Optional | - | String getUpdatedAt() | setUpdatedAt(String updatedAt) |
| `DiscountType` | [`DiscountType`](../../doc/models/discount-type.md) | Optional | - | DiscountType getDiscountType() | setDiscountType(DiscountType discountType) |
| `ExcludeMidPeriodAllocations` | `Boolean` | Optional | - | Boolean getExcludeMidPeriodAllocations() | setExcludeMidPeriodAllocations(Boolean excludeMidPeriodAllocations) |
| `ApplyOnCancelAtEndOfPeriod` | `Boolean` | Optional | - | Boolean getApplyOnCancelAtEndOfPeriod() | setApplyOnCancelAtEndOfPeriod(Boolean applyOnCancelAtEndOfPeriod) |
| `CouponRestrictions` | [`List<CouponRestriction>`](../../doc/models/coupon-restriction.md) | Optional | - | List<CouponRestriction> getCouponRestrictions() | setCouponRestrictions(List<CouponRestriction> couponRestrictions) |

## Example (as JSON)

```json
{
  "id": 179.42,
  "name": "name2",
  "code": "code0",
  "description": "description2",
  "amount": 62.64
}
```

