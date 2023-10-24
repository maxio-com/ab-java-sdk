
# Payment Profile

## Structure

`PaymentProfile`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | The Chargify-assigned ID of the stored card. This value can be used as an input to payment_profile_id when creating a subscription, in order to re-use a stored payment profile for the same customer. | Integer getId() | setId(Integer id) |
| `FirstName` | `String` | Optional | The first name of the card holder. | String getFirstName() | setFirstName(String firstName) |
| `LastName` | `String` | Optional | The last name of the card holder. | String getLastName() | setLastName(String lastName) |
| `MaskedCardNumber` | `String` | Optional | A string representation of the credit card number with all but the last 4 digits masked with X’s (i.e. ‘XXXX-XXXX-XXXX-1234’). | String getMaskedCardNumber() | setMaskedCardNumber(String maskedCardNumber) |
| `CardType` | [`CardType`](../../doc/models/card-type.md) | Optional | The type of card used. | CardType getCardType() | setCardType(CardType cardType) |
| `ExpirationMonth` | `Integer` | Optional | An integer representing the expiration month of the card(1 – 12). | Integer getExpirationMonth() | setExpirationMonth(Integer expirationMonth) |
| `ExpirationYear` | `Integer` | Optional | An integer representing the 4-digit expiration year of the card(i.e. ‘2012’). | Integer getExpirationYear() | setExpirationYear(Integer expirationYear) |
| `CustomerId` | `Integer` | Optional | The Chargify-assigned id for the customer record to which the card belongs. | Integer getCustomerId() | setCustomerId(Integer customerId) |
| `CurrentVault` | [`CurrentVault`](../../doc/models/current-vault.md) | Optional | The vault that stores the payment profile with the provided `vault_token`. Use `bogus` for testing. | CurrentVault getCurrentVault() | setCurrentVault(CurrentVault currentVault) |
| `VaultToken` | `String` | Optional | The “token” provided by your vault storage for an already stored payment profile. | String getVaultToken() | setVaultToken(String vaultToken) |
| `BillingAddress` | `String` | Optional | The current billing street address for the card. | String getBillingAddress() | setBillingAddress(String billingAddress) |
| `BillingCity` | `String` | Optional | The current billing address city for the card. | String getBillingCity() | setBillingCity(String billingCity) |
| `BillingState` | `String` | Optional | The current billing address state for the card. | String getBillingState() | setBillingState(String billingState) |
| `BillingZip` | `String` | Optional | The current billing address zip code for the card. | String getBillingZip() | setBillingZip(String billingZip) |
| `BillingCountry` | `String` | Optional | The current billing address country for the card. | String getBillingCountry() | setBillingCountry(String billingCountry) |
| `CustomerVaultToken` | `String` | Optional | (only for Authorize.Net CIM storage): the customerProfileId for the owner of the customerPaymentProfileId provided as the vault_token. | String getCustomerVaultToken() | setCustomerVaultToken(String customerVaultToken) |
| `BillingAddress2` | `String` | Optional | The current billing street address, second line, for the card. | String getBillingAddress2() | setBillingAddress2(String billingAddress2) |
| `PaymentType` | [`PaymentType`](../../doc/models/payment-type.md) | Optional | **Default**: `PaymentType.CREDIT_CARD` | PaymentType getPaymentType() | setPaymentType(PaymentType paymentType) |
| `Disabled` | `Boolean` | Optional | - | Boolean getDisabled() | setDisabled(Boolean disabled) |
| `ChargifyToken` | `String` | Optional | Token received after sending billing informations using chargify.js. | String getChargifyToken() | setChargifyToken(String chargifyToken) |
| `SiteGatewaySettingId` | `Integer` | Optional | - | Integer getSiteGatewaySettingId() | setSiteGatewaySettingId(Integer siteGatewaySettingId) |
| `GatewayHandle` | `String` | Optional | An identifier of connected gateway. | String getGatewayHandle() | setGatewayHandle(String gatewayHandle) |

## Example (as JSON)

```json
{
  "id": 10088716,
  "first_name": "Test",
  "last_name": "Subscription",
  "masked_card_number": "XXXX-XXXX-XXXX-1",
  "card_type": "bogus",
  "expiration_month": 1,
  "expiration_year": 2022,
  "customer_id": 14543792,
  "current_vault": "bogus",
  "vault_token": "1",
  "billing_address": "123 Montana Way",
  "billing_city": "Billings",
  "billing_state": "MT",
  "billing_zip": "59101",
  "billing_country": "US",
  "customer_vault_token": null,
  "billing_address_2": "",
  "payment_type": "credit_card",
  "site_gateway_setting_id": 1,
  "gateway_handle": null
}
```

