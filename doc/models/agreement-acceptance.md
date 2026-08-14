
# Agreement Acceptance

Required when creating a subscription with Maxio Payments.

## Structure

`AgreementAcceptance`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `IpAddress` | `String` | Optional | Required when providing agreement acceptance params. | String getIpAddress() | setIpAddress(String ipAddress) |
| `TermsUrl` | `String` | Optional | Required when creating a subscription with Maxio Payments. Either terms_url or privacy_policy_url is required when providing agreement_acceptance params. | String getTermsUrl() | setTermsUrl(String termsUrl) |
| `PrivacyPolicyUrl` | `String` | Optional | - | String getPrivacyPolicyUrl() | setPrivacyPolicyUrl(String privacyPolicyUrl) |
| `ReturnRefundPolicyUrl` | `String` | Optional | - | String getReturnRefundPolicyUrl() | setReturnRefundPolicyUrl(String returnRefundPolicyUrl) |
| `DeliveryPolicyUrl` | `String` | Optional | - | String getDeliveryPolicyUrl() | setDeliveryPolicyUrl(String deliveryPolicyUrl) |
| `SecureCheckoutPolicyUrl` | `String` | Optional | - | String getSecureCheckoutPolicyUrl() | setSecureCheckoutPolicyUrl(String secureCheckoutPolicyUrl) |

## Example

```java
import com.maxio.advancedbilling.models.AgreementAcceptance;

AgreementAcceptance agreementAcceptance = new AgreementAcceptance.Builder()
    .ipAddress("ip_address8")
    .termsUrl("terms_url6")
    .privacyPolicyUrl("privacy_policy_url4")
    .returnRefundPolicyUrl("return_refund_policy_url0")
    .deliveryPolicyUrl("delivery_policy_url4")
    .build();
```

