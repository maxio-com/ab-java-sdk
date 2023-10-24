
# List Payment Profile Item

## Structure

`ListPaymentProfileItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `FirstName` | `String` | Optional | - | String getFirstName() | setFirstName(String firstName) |
| `LastName` | `String` | Optional | - | String getLastName() | setLastName(String lastName) |
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
| `BankName` | `String` | Optional | - | String getBankName() | setBankName(String bankName) |
| `MaskedBankRoutingNumber` | `String` | Optional | - | String getMaskedBankRoutingNumber() | setMaskedBankRoutingNumber(String maskedBankRoutingNumber) |
| `MaskedBankAccountNumber` | `String` | Optional | - | String getMaskedBankAccountNumber() | setMaskedBankAccountNumber(String maskedBankAccountNumber) |
| `BankAccountType` | `String` | Optional | - | String getBankAccountType() | setBankAccountType(String bankAccountType) |
| `BankAccountHolderType` | `String` | Optional | - | String getBankAccountHolderType() | setBankAccountHolderType(String bankAccountHolderType) |
| `PaymentType` | `String` | Optional | - | String getPaymentType() | setPaymentType(String paymentType) |
| `SiteGatewaySettingId` | `Integer` | Optional | - | Integer getSiteGatewaySettingId() | setSiteGatewaySettingId(Integer siteGatewaySettingId) |
| `GatewayHandle` | `String` | Optional | - | String getGatewayHandle() | setGatewayHandle(String gatewayHandle) |

## Example (as JSON)

```json
{
  "id": 56,
  "first_name": "first_name6",
  "last_name": "last_name4",
  "customer_id": 94,
  "current_vault": "bogus"
}
```

