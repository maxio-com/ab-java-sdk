
# Create or Update Flat Amount Coupon

## Structure

`CreateOrUpdateFlatAmountCoupon`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | the name of the coupon | String getName() | setName(String name) |
| `Code` | `String` | Required | may contain uppercase alphanumeric characters and these special characters (which allow for email addresses to be used): “%”, “@”, “+”, “-”, “_”, and “.” | String getCode() | setCode(String code) |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `AmountInCents` | `long` | Required | - | long getAmountInCents() | setAmountInCents(long amountInCents) |
| `AllowNegativeBalance` | `Boolean` | Optional | - | Boolean getAllowNegativeBalance() | setAllowNegativeBalance(Boolean allowNegativeBalance) |
| `Recurring` | `Boolean` | Optional | - | Boolean getRecurring() | setRecurring(Boolean recurring) |
| `EndDate` | `ZonedDateTime` | Optional | - | ZonedDateTime getEndDate() | setEndDate(ZonedDateTime endDate) |
| `ProductFamilyId` | `String` | Optional | - | String getProductFamilyId() | setProductFamilyId(String productFamilyId) |
| `Stackable` | `Boolean` | Optional | - | Boolean getStackable() | setStackable(Boolean stackable) |
| `CompoundingStrategy` | [`CompoundingStrategy`](../../doc/models/compounding-strategy.md) | Optional | - | CompoundingStrategy getCompoundingStrategy() | setCompoundingStrategy(CompoundingStrategy compoundingStrategy) |
| `ExcludeMidPeriodAllocations` | `Boolean` | Optional | - | Boolean getExcludeMidPeriodAllocations() | setExcludeMidPeriodAllocations(Boolean excludeMidPeriodAllocations) |
| `ApplyOnCancelAtEndOfPeriod` | `Boolean` | Optional | - | Boolean getApplyOnCancelAtEndOfPeriod() | setApplyOnCancelAtEndOfPeriod(Boolean applyOnCancelAtEndOfPeriod) |
| `ApplyOnSubscriptionExpiration` | `Boolean` | Optional | - | Boolean getApplyOnSubscriptionExpiration() | setApplyOnSubscriptionExpiration(Boolean applyOnSubscriptionExpiration) |

## Example (as JSON)

```json
{
  "name": "name0",
  "code": "code8",
  "description": "description0",
  "amount_in_cents": 120,
  "allow_negative_balance": false,
  "recurring": false,
  "end_date": "2016-03-13T12:52:32.123Z",
  "product_family_id": "product_family_id4"
}
```

