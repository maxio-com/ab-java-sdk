
# Get One Time Token Payment Profile

## Structure

`GetOneTimeTokenPaymentProfile`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `FirstName` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getFirstName() | setFirstName(String firstName) |
| `LastName` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getLastName() | setLastName(String lastName) |
| `MaskedCardNumber` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getMaskedCardNumber() | setMaskedCardNumber(String maskedCardNumber) |
| `CardType` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getCardType() | setCardType(String cardType) |
| `ExpirationMonth` | `double` | Required | - | double getExpirationMonth() | setExpirationMonth(double expirationMonth) |
| `ExpirationYear` | `double` | Required | - | double getExpirationYear() | setExpirationYear(double expirationYear) |
| `CustomerId` | `String` | Optional | - | String getCustomerId() | setCustomerId(String customerId) |
| `CurrentVault` | [`CurrentVault`](../../doc/models/current-vault.md) | Required | The vault that stores the payment profile with the provided `vault_token`. Use `bogus` for testing. | CurrentVault getCurrentVault() | setCurrentVault(CurrentVault currentVault) |
| `VaultToken` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getVaultToken() | setVaultToken(String vaultToken) |
| `BillingAddress` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getBillingAddress() | setBillingAddress(String billingAddress) |
| `BillingAddress2` | `String` | Optional | - | String getBillingAddress2() | setBillingAddress2(String billingAddress2) |
| `BillingCity` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getBillingCity() | setBillingCity(String billingCity) |
| `BillingCountry` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getBillingCountry() | setBillingCountry(String billingCountry) |
| `BillingState` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getBillingState() | setBillingState(String billingState) |
| `BillingZip` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getBillingZip() | setBillingZip(String billingZip) |
| `PaymentType` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getPaymentType() | setPaymentType(String paymentType) |
| `Disabled` | `boolean` | Required | - | boolean getDisabled() | setDisabled(boolean disabled) |
| `SiteGatewaySettingId` | `int` | Required | - | int getSiteGatewaySettingId() | setSiteGatewaySettingId(int siteGatewaySettingId) |
| `CustomerVaultToken` | `String` | Optional | - | String getCustomerVaultToken() | setCustomerVaultToken(String customerVaultToken) |
| `GatewayHandle` | `String` | Optional | - | String getGatewayHandle() | setGatewayHandle(String gatewayHandle) |

## Example (as JSON)

```json
{
  "id": "id2",
  "first_name": "first_name2",
  "last_name": "last_name0",
  "masked_card_number": "masked_card_number0",
  "card_type": "card_type8",
  "expiration_month": 187.78,
  "expiration_year": 164.44,
  "customer_id": "customer_id0",
  "current_vault": "firstdata",
  "vault_token": "vault_token4",
  "billing_address": "billing_address4",
  "billing_address_2": "billing_address_24",
  "billing_city": "billing_city0",
  "billing_country": "billing_country6",
  "billing_state": "billing_state6",
  "billing_zip": "billing_zip0",
  "payment_type": "payment_type2",
  "disabled": false,
  "site_gateway_setting_id": 232,
  "customer_vault_token": "customer_vault_token0",
  "gateway_handle": "gateway_handle4"
}
```

