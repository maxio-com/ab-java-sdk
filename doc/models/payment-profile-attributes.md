
# Payment Profile Attributes

alias to credit_card_attributes

## Structure

`PaymentProfileAttributes`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ChargifyToken` | `String` | Optional | (Optional) Token received after sending billing information using Maxio.js (formerly Chargify.js). This token must be passed as a sole attribute of `payment_profile_attributes` (e.g., tok_9g6hw85pnpt6knmskpwp4ttt). | String getChargifyToken() | setChargifyToken(String chargifyToken) |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `PaymentType` | [`PaymentType`](../../doc/models/payment-type.md) | Optional | - | PaymentType getPaymentType() | setPaymentType(PaymentType paymentType) |
| `FirstName` | `String` | Optional | (Optional) First name on card or bank account. If omitted, the first_name from customer attributes will be used. | String getFirstName() | setFirstName(String firstName) |
| `LastName` | `String` | Optional | (Optional) Last name on card or bank account. If omitted, the last_name from customer attributes will be used. | String getLastName() | setLastName(String lastName) |
| `MaskedCardNumber` | `String` | Optional | - | String getMaskedCardNumber() | setMaskedCardNumber(String maskedCardNumber) |
| `FullNumber` | `String` | Optional | The full credit card number (string representation, e.g., 5424000000000015) | String getFullNumber() | setFullNumber(String fullNumber) |
| `CardType` | [`CardType`](../../doc/models/card-type.md) | Optional | (Optional, used only for Subscription Import) If you know the card type (e.g., Visa, MC, etc.) you may supply it here so that we may display the card type in the UI. | CardType getCardType() | setCardType(CardType cardType) |
| `ExpirationMonth` | [`PaymentProfileAttributesExpirationMonth`](../../doc/models/containers/payment-profile-attributes-expiration-month.md) | Optional | This is a container for one-of cases. | PaymentProfileAttributesExpirationMonth getExpirationMonth() | setExpirationMonth(PaymentProfileAttributesExpirationMonth expirationMonth) |
| `ExpirationYear` | [`PaymentProfileAttributesExpirationYear`](../../doc/models/containers/payment-profile-attributes-expiration-year.md) | Optional | This is a container for one-of cases. | PaymentProfileAttributesExpirationYear getExpirationYear() | setExpirationYear(PaymentProfileAttributesExpirationYear expirationYear) |
| `BillingAddress` | `String` | Optional | (Optional, may be required by your product configuration or gateway settings) The credit card or bank account billing street address (e.g., 123 Main St.). This value is merely passed through to the payment gateway. | String getBillingAddress() | setBillingAddress(String billingAddress) |
| `BillingAddress2` | `String` | Optional | (Optional) Second line of the customer’s billing address, e.g., Apt. 100 | String getBillingAddress2() | setBillingAddress2(String billingAddress2) |
| `BillingCity` | `String` | Optional | (Optional, may be required by your product configuration or gateway settings) The credit card or bank account billing address city (e.g., “Boston”). This value is merely passed through to the payment gateway. | String getBillingCity() | setBillingCity(String billingCity) |
| `BillingState` | `String` | Optional | (Optional, may be required by your product configuration or gateway settings) The credit card or bank account billing address state (e.g., MA). This value is merely passed through to the payment gateway. This must conform to the [ISO_3166-1](https://en.wikipedia.org/wiki/ISO_3166-1#Current_codes) in order to be valid for tax locale purposes. | String getBillingState() | setBillingState(String billingState) |
| `BillingCountry` | `String` | Optional | (Optional, may be required by your product configuration or gateway settings) The credit card or bank account billing address country, required in [ISO_3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format (e.g., “US”). This value is merely passed through to the payment gateway. Some gateways require country codes in a specific format. Check your gateway’s documentation. If creating an ACH subscription, only US is supported at this time. | String getBillingCountry() | setBillingCountry(String billingCountry) |
| `BillingZip` | `String` | Optional | (Optional, may be required by your product configuration or gateway settings) The credit card or bank account billing address zip code (e.g., 12345). This value is merely passed through to the payment gateway. | String getBillingZip() | setBillingZip(String billingZip) |
| `CurrentVault` | [`AllVaults`](../../doc/models/all-vaults.md) | Optional | (Optional, used only for Subscription Import) The vault that stores the payment profile with the provided vault_token. | AllVaults getCurrentVault() | setCurrentVault(AllVaults currentVault) |
| `VaultToken` | `String` | Optional | (Optional, used only for Subscription Import) The “token” provided by your vault storage for an already stored payment profile | String getVaultToken() | setVaultToken(String vaultToken) |
| `CustomerVaultToken` | `String` | Optional | (Optional, used only for Subscription Import) (only for Authorize.Net CIM storage or Square) The customerProfileId for the owner of the customerPaymentProfileId provided as the vault_token | String getCustomerVaultToken() | setCustomerVaultToken(String customerVaultToken) |
| `CustomerId` | `Integer` | Optional | - | Integer getCustomerId() | setCustomerId(Integer customerId) |
| `PaypalEmail` | `String` | Optional | - | String getPaypalEmail() | setPaypalEmail(String paypalEmail) |
| `PaymentMethodNonce` | `String` | Optional | (Required for Square unless importing with vault_token and customer_vault_token) The nonce generated by the Square Javascript library (SqPaymentForm) | String getPaymentMethodNonce() | setPaymentMethodNonce(String paymentMethodNonce) |
| `GatewayHandle` | `String` | Optional | (Optional) This attribute is only available if MultiGateway feature is enabled for your Site. This feature is in the Private Beta currently. gateway_handle is used to directly select a gateway where a payment profile will be stored in. Every connected gateway must have a unique gateway handle specified. Read [Multigateway description](https://chargify.zendesk.com/hc/en-us/articles/4407761759643#connecting-with-multiple-gateways) to learn more about new concepts that MultiGateway introduces and the default behavior when this attribute is not passed. | String getGatewayHandle() | setGatewayHandle(String gatewayHandle) |
| `Cvv` | `String` | Optional | (Optional, may be required by your gateway settings) The 3- or 4-digit Card Verification Value. This value is merely passed through to the payment gateway. | String getCvv() | setCvv(String cvv) |
| `LastFour` | `String` | Optional | (Optional, used only for Subscription Import) If you have the last 4 digits of the credit card number, you may supply them here so that we may create a masked card number (e.g., XXXX-XXXX-XXXX-1234) for display in the UI. Last 4 digits are required for refunds in Auth.Net. | String getLastFour() | setLastFour(String lastFour) |

## Example

```java
import com.maxio.advancedbilling.models.PaymentProfileAttributes;
import com.maxio.advancedbilling.models.PaymentType;

PaymentProfileAttributes paymentProfileAttributes = new PaymentProfileAttributes.Builder()
    .chargifyToken("chargify_token8")
    .id(14)
    .paymentType(PaymentType.PAYPAL_ACCOUNT)
    .firstName("first_name0")
    .lastName("last_name8")
    .build();
```

