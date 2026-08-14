
# Subscription Group Signup

## Structure

`SubscriptionGroupSignup`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PaymentProfileId` | `Integer` | Optional | - | Integer getPaymentProfileId() | setPaymentProfileId(Integer paymentProfileId) |
| `PayerId` | `Integer` | Optional | - | Integer getPayerId() | setPayerId(Integer payerId) |
| `PayerReference` | `String` | Optional | - | String getPayerReference() | setPayerReference(String payerReference) |
| `PaymentCollectionMethod` | [`CollectionMethod`](../../doc/models/collection-method.md) | Optional | The type of payment collection to be used in the subscription. For legacy Statements Architecture valid options are - `invoice`, `automatic`. For current Relationship Invoicing Architecture valid options are - `remittance`, `automatic`, `prepaid`. | CollectionMethod getPaymentCollectionMethod() | setPaymentCollectionMethod(CollectionMethod paymentCollectionMethod) |
| `PayerAttributes` | [`PayerAttributes`](../../doc/models/payer-attributes.md) | Optional | - | PayerAttributes getPayerAttributes() | setPayerAttributes(PayerAttributes payerAttributes) |
| `CreditCardAttributes` | [`SubscriptionGroupCreditCard`](../../doc/models/subscription-group-credit-card.md) | Optional | - | SubscriptionGroupCreditCard getCreditCardAttributes() | setCreditCardAttributes(SubscriptionGroupCreditCard creditCardAttributes) |
| `BankAccountAttributes` | [`SubscriptionGroupBankAccount`](../../doc/models/subscription-group-bank-account.md) | Optional | - | SubscriptionGroupBankAccount getBankAccountAttributes() | setBankAccountAttributes(SubscriptionGroupBankAccount bankAccountAttributes) |
| `Subscriptions` | [`List<SubscriptionGroupSignupItem>`](../../doc/models/subscription-group-signup-item.md) | Required | - | List<SubscriptionGroupSignupItem> getSubscriptions() | setSubscriptions(List<SubscriptionGroupSignupItem> subscriptions) |

## Example

```java
import com.maxio.advancedbilling.models.CollectionMethod;
import com.maxio.advancedbilling.models.PayerAttributes;
import com.maxio.advancedbilling.models.SubscriptionGroupSignup;
import com.maxio.advancedbilling.models.SubscriptionGroupSignupItem;
import java.util.Arrays;
import java.util.LinkedHashMap;

SubscriptionGroupSignup subscriptionGroupSignup = new SubscriptionGroupSignup.Builder(
    Arrays.asList(
        new SubscriptionGroupSignupItem.Builder()
            .productHandle("product_handle8")
            .productId(144)
            .productPricePointId(68)
            .productPricePointHandle("product_price_point_handle4")
            .offerId(40)
            .metafields(new LinkedHashMap<String, String>() {{
                put("custom_field_name_1", "custom_field_value_1");
                put("custom_field_name_2", "custom_field_value_2");
            }})
            .build()
    )
)
.paymentProfileId(124)
.payerId(146)
.payerReference("payer_reference0")
.paymentCollectionMethod(CollectionMethod.PREPAID)
.payerAttributes(new PayerAttributes.Builder()
        .firstName("first_name2")
        .lastName("last_name0")
        .email("email4")
        .ccEmails("cc_emails2")
        .organization("organization6")
        .build())
.build();
```

