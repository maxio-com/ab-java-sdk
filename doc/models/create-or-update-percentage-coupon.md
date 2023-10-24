
# Create or Update Percentage Coupon

## Structure

`CreateOrUpdatePercentageCoupon`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | the name of the coupon | String getName() | setName(String name) |
| `Code` | `String` | Required | may contain uppercase alphanumeric characters and these special characters (which allow for email addresses to be used): “%”, “@”, “+”, “-”, “_”, and “.” | String getCode() | setCode(String code) |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `Percentage` | [`CreateOrUpdatePercentageCouponPercentage`](../../doc/models/containers/create-or-update-percentage-coupon-percentage.md) | Required | This is a container for one-of cases. | CreateOrUpdatePercentageCouponPercentage getPercentage() | setPercentage(CreateOrUpdatePercentageCouponPercentage percentage) |
| `AllowNegativeBalance` | `String` | Optional | - | String getAllowNegativeBalance() | setAllowNegativeBalance(String allowNegativeBalance) |
| `Recurring` | `String` | Optional | - | String getRecurring() | setRecurring(String recurring) |
| `EndDate` | `String` | Optional | - | String getEndDate() | setEndDate(String endDate) |
| `ProductFamilyId` | `String` | Optional | - | String getProductFamilyId() | setProductFamilyId(String productFamilyId) |
| `Stackable` | `String` | Optional | - | String getStackable() | setStackable(String stackable) |
| `CompoundingStrategy` | [`CreateOrUpdatePercentageCouponCompoundingStrategy`](../../doc/models/containers/create-or-update-percentage-coupon-compounding-strategy.md) | Optional | This is a container for one-of cases. | CreateOrUpdatePercentageCouponCompoundingStrategy getCompoundingStrategy() | setCompoundingStrategy(CreateOrUpdatePercentageCouponCompoundingStrategy compoundingStrategy) |
| `ExcludeMidPeriodAllocations` | `Boolean` | Optional | - | Boolean getExcludeMidPeriodAllocations() | setExcludeMidPeriodAllocations(Boolean excludeMidPeriodAllocations) |
| `ApplyOnCancelAtEndOfPeriod` | `Boolean` | Optional | - | Boolean getApplyOnCancelAtEndOfPeriod() | setApplyOnCancelAtEndOfPeriod(Boolean applyOnCancelAtEndOfPeriod) |

## Example (as JSON)

```json
{
  "name": "name0",
  "code": "code8",
  "description": "description0",
  "percentage": 11.02,
  "allow_negative_balance": "allow_negative_balance8",
  "recurring": "recurring4",
  "end_date": "end_date0",
  "product_family_id": "product_family_id6"
}
```

