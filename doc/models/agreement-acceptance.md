
# Agreement Acceptance

Required when creating a subscription with Maxio Payments.

## Structure

`AgreementAcceptance`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `IpAddress` | `String` | Optional | Required when providing agreement acceptance params. | String getIpAddress() | setIpAddress(String ipAddress) |
| `TermsUrl` | `String` | Optional | Required when creating a subscription with Maxio Payments. Either terms_url or provacy_policy_url required when providing agreement_acceptance params. | String getTermsUrl() | setTermsUrl(String termsUrl) |
| `PrivacyPolicyUrl` | `String` | Optional | - | String getPrivacyPolicyUrl() | setPrivacyPolicyUrl(String privacyPolicyUrl) |
| `ReturnRefundPolicyUrl` | `String` | Optional | - | String getReturnRefundPolicyUrl() | setReturnRefundPolicyUrl(String returnRefundPolicyUrl) |
| `DeliveryPolicyUrl` | `String` | Optional | - | String getDeliveryPolicyUrl() | setDeliveryPolicyUrl(String deliveryPolicyUrl) |
| `SecureCheckoutPolicyUrl` | `String` | Optional | - | String getSecureCheckoutPolicyUrl() | setSecureCheckoutPolicyUrl(String secureCheckoutPolicyUrl) |

## Example (as JSON)

```json
{
  "ip_address": "ip_address2",
  "terms_url": "terms_url0",
  "privacy_policy_url": "privacy_policy_url0",
  "return_refund_policy_url": "return_refund_policy_url4",
  "delivery_policy_url": "delivery_policy_url8"
}
```

