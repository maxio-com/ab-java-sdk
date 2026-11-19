
# Subscription Group Item

## Structure

`SubscriptionGroupItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `Reference` | `String` | Optional | - | String getReference() | setReference(String reference) |
| `CustomerId` | `Integer` | Optional | The ID of the customer the subscription belongs to. This is the payer unless the signup request named another customer for the subscription. | Integer getCustomerId() | setCustomerId(Integer customerId) |
| `ProductId` | `Integer` | Optional | - | Integer getProductId() | setProductId(Integer productId) |
| `ProductHandle` | `String` | Optional | - | String getProductHandle() | setProductHandle(String productHandle) |
| `ProductPricePointId` | `Integer` | Optional | - | Integer getProductPricePointId() | setProductPricePointId(Integer productPricePointId) |
| `ProductPricePointHandle` | `String` | Optional | - | String getProductPricePointHandle() | setProductPricePointHandle(String productPricePointHandle) |
| `Currency` | `String` | Optional | - | String getCurrency() | setCurrency(String currency) |
| `CouponCode` | `String` | Optional | - | String getCouponCode() | setCouponCode(String couponCode) |
| `TotalRevenueInCents` | `Long` | Optional | - | Long getTotalRevenueInCents() | setTotalRevenueInCents(Long totalRevenueInCents) |
| `BalanceInCents` | `Long` | Optional | - | Long getBalanceInCents() | setBalanceInCents(Long balanceInCents) |

## Example

```java
import com.maxio.advancedbilling.models.SubscriptionGroupItem;

SubscriptionGroupItem subscriptionGroupItem = new SubscriptionGroupItem.Builder()
    .id(26)
    .reference("reference4")
    .customerId(64)
    .productId(32)
    .productHandle("product_handle8")
    .build();
```

