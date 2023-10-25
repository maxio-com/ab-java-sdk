
# Credit Card Payment Profile

## Structure

`CreditCardPaymentProfile`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `FirstName` | `String` | Optional | - | String getFirstName() | setFirstName(String firstName) |
| `LastName` | `String` | Optional | - | String getLastName() | setLastName(String lastName) |
| `MaskedCardNumber` | `String` | Required | - | String getMaskedCardNumber() | setMaskedCardNumber(String maskedCardNumber) |
| `CardType` | [`CardType1`](../../doc/models/card-type-1.md) | Optional | - | CardType1 getCardType() | setCardType(CardType1 cardType) |
| `ExpirationMonth` | `Integer` | Optional | - | Integer getExpirationMonth() | setExpirationMonth(Integer expirationMonth) |
| `ExpirationYear` | `Integer` | Optional | - | Integer getExpirationYear() | setExpirationYear(Integer expirationYear) |
| `CustomerId` | `Integer` | Optional | - | Integer getCustomerId() | setCustomerId(Integer customerId) |
| `CurrentVault` | [`CurrentVault`](../../doc/models/current-vault.md) | Optional | The vault that stores the payment profile with the provided `vault_token`. Use `bogus` for testing. | CurrentVault getCurrentVault() | setCurrentVault(CurrentVault currentVault) |
| `VaultToken` | `String` | Optional | - | String getVaultToken() | setVaultToken(String vaultToken) |
| `BillingAddress` | `String` | Optional | - | String getBillingAddress() | setBillingAddress(String billingAddress) |
| `BillingCity` | `String` | Optional | - | String getBillingCity() | setBillingCity(String billingCity) |
| `BillingState` | `String` | Optional | - | String getBillingState() | setBillingState(String billingState) |
| `BillingZip` | `String` | Optional | - | String getBillingZip() | setBillingZip(String billingZip) |
| `BillingCountry` | `String` | Optional | - | String getBillingCountry() | setBillingCountry(String billingCountry) |
| `CustomerVaultToken` | `String` | Optional | - | String getCustomerVaultToken() | setCustomerVaultToken(String customerVaultToken) |
| `BillingAddress2` | `String` | Optional | - | String getBillingAddress2() | setBillingAddress2(String billingAddress2) |
| `PaymentType` | `String` | Optional | - | String getPaymentType() | setPaymentType(String paymentType) |
| `Disabled` | `Boolean` | Optional | - | Boolean getDisabled() | setDisabled(Boolean disabled) |
| `SiteGatewaySettingId` | `Integer` | Optional | - | Integer getSiteGatewaySettingId() | setSiteGatewaySettingId(Integer siteGatewaySettingId) |
| `GatewayHandle` | `String` | Optional | - | String getGatewayHandle() | setGatewayHandle(String gatewayHandle) |

## Example (as JSON)

```json
{
  "id": 252,
  "first_name": "first_name0",
  "last_name": "last_name8",
  "masked_card_number": "masked_card_number8",
  "card_type": "synchrony",
  "expiration_month": 170
}
```

