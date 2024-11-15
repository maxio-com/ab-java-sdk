
# Coupon Payload

## Structure

`CouponPayload`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Required when creating a new coupon. This name is not displayed to customers and is limited to 255 characters. | String getName() | setName(String name) |
| `Code` | `String` | Optional | Required when creating a new coupon. The code is limited to 255 characters. May contain uppercase alphanumeric characters and these special characters (which allow for email addresses to be used): “%”, “@”, “+”, “-”, “_”, and “.” | String getCode() | setCode(String code) |
| `Description` | `String` | Optional | Required when creating a new coupon. A description of the coupon that can be displayed to customers in transactions and on statements. The description is limited to 255 characters. | String getDescription() | setDescription(String description) |
| `Percentage` | [`CouponPayloadPercentage`](../../doc/models/containers/coupon-payload-percentage.md) | Optional | This is a container for one-of cases. | CouponPayloadPercentage getPercentage() | setPercentage(CouponPayloadPercentage percentage) |
| `AmountInCents` | `Long` | Optional | Required when creating a new flat amount coupon. Can't be used together with percentage. Flat USD discount | Long getAmountInCents() | setAmountInCents(Long amountInCents) |
| `AllowNegativeBalance` | `Boolean` | Optional | If set to true, discount is not limited (credits will carry forward to next billing). Can't be used together with restrictions. | Boolean getAllowNegativeBalance() | setAllowNegativeBalance(Boolean allowNegativeBalance) |
| `Recurring` | `Boolean` | Optional | - | Boolean getRecurring() | setRecurring(Boolean recurring) |
| `EndDate` | `LocalDate` | Optional | After the end of the given day, this coupon code will be invalid for new signups. Recurring discounts started before this date will continue to recur even after this date. | LocalDate getEndDate() | setEndDate(LocalDate endDate) |
| `ProductFamilyId` | `String` | Optional | - | String getProductFamilyId() | setProductFamilyId(String productFamilyId) |
| `Stackable` | `Boolean` | Optional | A stackable coupon can be combined with other coupons on a Subscription. | Boolean getStackable() | setStackable(Boolean stackable) |
| `CompoundingStrategy` | [`CompoundingStrategy`](../../doc/models/compounding-strategy.md) | Optional | Applicable only to stackable coupons. For `compound`, Percentage-based discounts will be calculated against the remaining price, after prior discounts have been calculated. For `full-price`, Percentage-based discounts will always be calculated against the original item price, before other discounts are applied. | CompoundingStrategy getCompoundingStrategy() | setCompoundingStrategy(CompoundingStrategy compoundingStrategy) |
| `ExcludeMidPeriodAllocations` | `Boolean` | Optional | - | Boolean getExcludeMidPeriodAllocations() | setExcludeMidPeriodAllocations(Boolean excludeMidPeriodAllocations) |
| `ApplyOnCancelAtEndOfPeriod` | `Boolean` | Optional | - | Boolean getApplyOnCancelAtEndOfPeriod() | setApplyOnCancelAtEndOfPeriod(Boolean applyOnCancelAtEndOfPeriod) |
| `ApplyOnSubscriptionExpiration` | `Boolean` | Optional | - | Boolean getApplyOnSubscriptionExpiration() | setApplyOnSubscriptionExpiration(Boolean applyOnSubscriptionExpiration) |

## Example (as JSON)

```json
{
  "name": "name8",
  "code": "code6",
  "description": "description8",
  "percentage": "String7",
  "amount_in_cents": 110
}
```

