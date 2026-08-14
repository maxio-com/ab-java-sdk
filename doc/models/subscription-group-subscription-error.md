
# Subscription Group Subscription Error

Object which contains subscription errors.

## Structure

`SubscriptionGroupSubscriptionError`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Product` | `List<String>` | Optional | - | List<String> getProduct() | setProduct(List<String> product) |
| `ProductPricePointId` | `List<String>` | Optional | - | List<String> getProductPricePointId() | setProductPricePointId(List<String> productPricePointId) |
| `PaymentProfile` | `List<String>` | Optional | - | List<String> getPaymentProfile() | setPaymentProfile(List<String> paymentProfile) |
| `PaymentProfileChargifyToken` | `List<String>` | Optional | - | List<String> getPaymentProfileChargifyToken() | setPaymentProfileChargifyToken(List<String> paymentProfileChargifyToken) |
| `Base` | `List<String>` | Optional | - | List<String> getBase() | setBase(List<String> base) |
| `PaymentProfileExpirationMonth` | `List<String>` | Optional | - | List<String> getPaymentProfileExpirationMonth() | setPaymentProfileExpirationMonth(List<String> paymentProfileExpirationMonth) |
| `PaymentProfileExpirationYear` | `List<String>` | Optional | - | List<String> getPaymentProfileExpirationYear() | setPaymentProfileExpirationYear(List<String> paymentProfileExpirationYear) |
| `PaymentProfileFullNumber` | `List<String>` | Optional | - | List<String> getPaymentProfileFullNumber() | setPaymentProfileFullNumber(List<String> paymentProfileFullNumber) |

## Example

```java
import com.maxio.advancedbilling.models.SubscriptionGroupSubscriptionError;
import java.util.Arrays;

SubscriptionGroupSubscriptionError subscriptionGroupSubscriptionError = new SubscriptionGroupSubscriptionError.Builder()
    .product(Arrays.asList(
        "product7",
        "product8"
    ))
    .productPricePointId(Arrays.asList(
        "product_price_point_id3",
        "product_price_point_id4"
    ))
    .paymentProfile(Arrays.asList(
        "payment_profile8",
        "payment_profile9"
    ))
    .paymentProfileChargifyToken(Arrays.asList(
        "payment_profile.chargify_token2",
        "payment_profile.chargify_token3"
    ))
    .base(Arrays.asList(
        "base1",
        "base2",
        "base3"
    ))
    .build();
```

