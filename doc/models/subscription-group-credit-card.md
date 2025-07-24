
# Subscription Group Credit Card

## Structure

`SubscriptionGroupCreditCard`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ChargifyToken` | `String` | Optional | - | String getChargifyToken() | setChargifyToken(String chargifyToken) |
| `VaultToken` | `String` | Optional | - | String getVaultToken() | setVaultToken(String vaultToken) |
| `CurrentVault` | [`CreditCardVault`](../../doc/models/credit-card-vault.md) | Optional | The vault that stores the payment profile with the provided `vault_token`. Use `bogus` for testing. | CreditCardVault getCurrentVault() | setCurrentVault(CreditCardVault currentVault) |
| `GatewayHandle` | `String` | Optional | - | String getGatewayHandle() | setGatewayHandle(String gatewayHandle) |
| `FirstName` | `String` | Optional | - | String getFirstName() | setFirstName(String firstName) |
| `LastName` | `String` | Optional | - | String getLastName() | setLastName(String lastName) |
| `BillingAddress` | `String` | Optional | - | String getBillingAddress() | setBillingAddress(String billingAddress) |
| `BillingAddress2` | `String` | Optional | - | String getBillingAddress2() | setBillingAddress2(String billingAddress2) |
| `BillingCity` | `String` | Optional | - | String getBillingCity() | setBillingCity(String billingCity) |
| `BillingState` | `String` | Optional | - | String getBillingState() | setBillingState(String billingState) |
| `BillingZip` | `String` | Optional | - | String getBillingZip() | setBillingZip(String billingZip) |
| `BillingCountry` | `String` | Optional | - | String getBillingCountry() | setBillingCountry(String billingCountry) |
| `FullNumber` | [`SubscriptionGroupCreditCardFullNumber`](../../doc/models/containers/subscription-group-credit-card-full-number.md) | Optional | This is a container for one-of cases. | SubscriptionGroupCreditCardFullNumber getFullNumber() | setFullNumber(SubscriptionGroupCreditCardFullNumber fullNumber) |
| `ExpirationMonth` | [`SubscriptionGroupCreditCardExpirationMonth`](../../doc/models/containers/subscription-group-credit-card-expiration-month.md) | Optional | This is a container for one-of cases. | SubscriptionGroupCreditCardExpirationMonth getExpirationMonth() | setExpirationMonth(SubscriptionGroupCreditCardExpirationMonth expirationMonth) |
| `ExpirationYear` | [`SubscriptionGroupCreditCardExpirationYear`](../../doc/models/containers/subscription-group-credit-card-expiration-year.md) | Optional | This is a container for one-of cases. | SubscriptionGroupCreditCardExpirationYear getExpirationYear() | setExpirationYear(SubscriptionGroupCreditCardExpirationYear expirationYear) |
| `LastFour` | `String` | Optional | - | String getLastFour() | setLastFour(String lastFour) |
| `CardType` | [`CardType`](../../doc/models/card-type.md) | Optional | The type of card used. | CardType getCardType() | setCardType(CardType cardType) |
| `CustomerVaultToken` | `String` | Optional | - | String getCustomerVaultToken() | setCustomerVaultToken(String customerVaultToken) |
| `Cvv` | `String` | Optional | - | String getCvv() | setCvv(String cvv) |
| `PaymentType` | `String` | Optional | - | String getPaymentType() | setPaymentType(String paymentType) |

## Example (as JSON)

```json
{
  "chargify_token": "tok_592nf92ng0sjd4300p",
  "full_number": 4111111111111111,
  "vault_token": "vault_token6",
  "current_vault": "braintree_blue",
  "gateway_handle": "gateway_handle6",
  "first_name": "first_name4"
}
```

