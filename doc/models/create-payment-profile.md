
# Create Payment Profile

## Structure

`CreatePaymentProfile`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ChargifyToken` | `String` | Optional | Token received after sending billing informations using chargify.js. | String getChargifyToken() | setChargifyToken(String chargifyToken) |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `PaymentType` | [`PaymentType`](../../doc/models/payment-type.md) | Optional | **Default**: `PaymentType.CREDIT_CARD` | PaymentType getPaymentType() | setPaymentType(PaymentType paymentType) |
| `FirstName` | `String` | Optional | First name on card or bank account. If omitted, the first_name from customer attributes will be used. | String getFirstName() | setFirstName(String firstName) |
| `LastName` | `String` | Optional | Last name on card or bank account. If omitted, the last_name from customer attributes will be used. | String getLastName() | setLastName(String lastName) |
| `MaskedCardNumber` | `String` | Optional | - | String getMaskedCardNumber() | setMaskedCardNumber(String maskedCardNumber) |
| `FullNumber` | `String` | Optional | The full credit card number | String getFullNumber() | setFullNumber(String fullNumber) |
| `CardType` | [`CardType`](../../doc/models/card-type.md) | Optional | The type of card used. | CardType getCardType() | setCardType(CardType cardType) |
| `ExpirationMonth` | [`CreatePaymentProfileExpirationMonth`](../../doc/models/containers/create-payment-profile-expiration-month.md) | Optional | This is a container for one-of cases. | CreatePaymentProfileExpirationMonth getExpirationMonth() | setExpirationMonth(CreatePaymentProfileExpirationMonth expirationMonth) |
| `ExpirationYear` | [`CreatePaymentProfileExpirationYear`](../../doc/models/containers/create-payment-profile-expiration-year.md) | Optional | This is a container for one-of cases. | CreatePaymentProfileExpirationYear getExpirationYear() | setExpirationYear(CreatePaymentProfileExpirationYear expirationYear) |
| `BillingAddress` | `String` | Optional | The credit card or bank account billing street address (i.e. 123 Main St.). This value is merely passed through to the payment gateway. | String getBillingAddress() | setBillingAddress(String billingAddress) |
| `BillingAddress2` | `String` | Optional | Second line of the customer’s billing address i.e. Apt. 100 | String getBillingAddress2() | setBillingAddress2(String billingAddress2) |
| `BillingCity` | `String` | Optional | The credit card or bank account billing address city (i.e. “Boston”). This value is merely passed through to the payment gateway. | String getBillingCity() | setBillingCity(String billingCity) |
| `BillingState` | `String` | Optional | The credit card or bank account billing address state (i.e. MA). This value is merely passed through to the payment gateway. This must conform to the [ISO_3166-1](https://en.wikipedia.org/wiki/ISO_3166-1#Current_codes) in order to be valid for tax locale purposes. | String getBillingState() | setBillingState(String billingState) |
| `BillingCountry` | `String` | Optional | The credit card or bank account billing address country, required in [ISO_3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format (i.e. “US”). This value is merely passed through to the payment gateway. Some gateways require country codes in a specific format. Please check your gateway’s documentation. If creating an ACH subscription, only US is supported at this time. | String getBillingCountry() | setBillingCountry(String billingCountry) |
| `BillingZip` | `String` | Optional | The credit card or bank account billing address zip code (i.e. 12345). This value is merely passed through to the payment gateway. | String getBillingZip() | setBillingZip(String billingZip) |
| `CurrentVault` | [`CurrentVault`](../../doc/models/current-vault.md) | Optional | The vault that stores the payment profile with the provided `vault_token`. Use `bogus` for testing. | CurrentVault getCurrentVault() | setCurrentVault(CurrentVault currentVault) |
| `VaultToken` | `String` | Optional | The “token” provided by your vault storage for an already stored payment profile | String getVaultToken() | setVaultToken(String vaultToken) |
| `CustomerVaultToken` | `String` | Optional | (only for Authorize.Net CIM storage or Square) The customerProfileId for the owner of the customerPaymentProfileId provided as the vault_token | String getCustomerVaultToken() | setCustomerVaultToken(String customerVaultToken) |
| `CustomerId` | `Integer` | Optional | (Required when creating a new payment profile) The Chargify customer id. | Integer getCustomerId() | setCustomerId(Integer customerId) |
| `PaypalEmail` | `String` | Optional | used by merchants that implemented BraintreeBlue javaScript libraries on their own. We recommend using Chargify.js instead. | String getPaypalEmail() | setPaypalEmail(String paypalEmail) |
| `PaymentMethodNonce` | `String` | Optional | used by merchants that implemented BraintreeBlue javaScript libraries on their own. We recommend using Chargify.js instead. | String getPaymentMethodNonce() | setPaymentMethodNonce(String paymentMethodNonce) |
| `GatewayHandle` | `String` | Optional | This attribute is only available if MultiGateway feature is enabled for your Site. This feature is in the Private Beta currently. gateway_handle is used to directly select a gateway where a payment profile will be stored in. Every connected gateway must have a unique gateway handle specified. Read [Multigateway description](https://chargify.zendesk.com/hc/en-us/articles/4407761759643#connecting-with-multiple-gateways) to learn more about new concepts that MultiGateway introduces and the default behavior when this attribute is not passed. | String getGatewayHandle() | setGatewayHandle(String gatewayHandle) |
| `Cvv` | `String` | Optional | The 3- or 4-digit Card Verification Value. This value is merely passed through to the payment gateway. | String getCvv() | setCvv(String cvv) |
| `BankName` | `String` | Optional | (Required when creating with ACH or GoCardless, optional with Stripe Direct Debit). The name of the bank where the customerʼs account resides | String getBankName() | setBankName(String bankName) |
| `BankIban` | `String` | Optional | (Optional when creating with GoCardless, required with Stripe Direct Debit). International Bank Account Number. Alternatively, local bank details can be provided | String getBankIban() | setBankIban(String bankIban) |
| `BankRoutingNumber` | `String` | Optional | (Required when creating with ACH. Optional when creating a subscription with GoCardless). The routing number of the bank. It becomes bank_code while passing via GoCardless API | String getBankRoutingNumber() | setBankRoutingNumber(String bankRoutingNumber) |
| `BankAccountNumber` | `String` | Optional | (Required when creating with ACH, GoCardless, Stripe BECS Direct Debit and bank_iban is blank) The customerʼs bank account number | String getBankAccountNumber() | setBankAccountNumber(String bankAccountNumber) |
| `BankBranchCode` | `String` | Optional | (Optional when creating with GoCardless, required with Stripe BECS Direct Debit) Branch code. Alternatively, an IBAN can be provided | String getBankBranchCode() | setBankBranchCode(String bankBranchCode) |
| `BankAccountType` | `String` | Optional | - | String getBankAccountType() | setBankAccountType(String bankAccountType) |
| `BankAccountHolderType` | `String` | Optional | - | String getBankAccountHolderType() | setBankAccountHolderType(String bankAccountHolderType) |
| `LastFour` | `String` | Optional | (Optional) Used for creating subscription with payment profile imported using vault_token, for proper display in Advanced Billing UI | String getLastFour() | setLastFour(String lastFour) |

## Example (as JSON)

```json
{
  "chargify_token": "tok_9g6hw85pnpt6knmskpwp4ttt",
  "payment_type": "credit_card",
  "full_number": "5424000000000015",
  "id": 76,
  "first_name": "first_name8",
  "last_name": "last_name6"
}
```

