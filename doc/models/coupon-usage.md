
# Coupon Usage

## Structure

`CouponUsage`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | The Chargify id of the product | Integer getId() | setId(Integer id) |
| `Name` | `String` | Optional | Name of the product | String getName() | setName(String name) |
| `Signups` | `Integer` | Optional | Number of times the coupon has been applied | Integer getSignups() | setSignups(Integer signups) |
| `Savings` | `Integer` | Optional | Dollar amount of customer savings as a result of the coupon. | Integer getSavings() | setSavings(Integer savings) |
| `SavingsInCents` | `Long` | Optional | Dollar amount of customer savings as a result of the coupon. | Long getSavingsInCents() | setSavingsInCents(Long savingsInCents) |
| `Revenue` | `Integer` | Optional | Total revenue of all subscriptions that have received a discount from this coupon. | Integer getRevenue() | setRevenue(Integer revenue) |
| `RevenueInCents` | `Long` | Optional | Total revenue of all subscriptions that have received a discount from this coupon. | Long getRevenueInCents() | setRevenueInCents(Long revenueInCents) |

## Example

```java
import com.maxio.advancedbilling.models.CouponUsage;

CouponUsage couponUsage = new CouponUsage.Builder()
    .id(240)
    .name("name8")
    .signups(4)
    .savings(22)
    .savingsInCents(108L)
    .build();
```

