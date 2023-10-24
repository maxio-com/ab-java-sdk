
# Subscription Bank Account

## Structure

`SubscriptionBankAccount`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BankAccountHolderType` | `String` | Optional | Defaults to personal | String getBankAccountHolderType() | setBankAccountHolderType(String bankAccountHolderType) |
| `BankAccountType` | `String` | Optional | Defaults to checking | String getBankAccountType() | setBankAccountType(String bankAccountType) |
| `BankName` | `String` | Optional | The bank where the account resides | String getBankName() | setBankName(String bankName) |
| `BillingAddress` | `String` | Optional | The current billing street address for the bank account | String getBillingAddress() | setBillingAddress(String billingAddress) |
| `BillingAddress2` | `String` | Optional | The current billing street address, second line, for the bank account | String getBillingAddress2() | setBillingAddress2(String billingAddress2) |
| `BillingCity` | `String` | Optional | The current billing address city for the bank account | String getBillingCity() | setBillingCity(String billingCity) |
| `BillingState` | `String` | Optional | The current billing address state for the bank account | String getBillingState() | setBillingState(String billingState) |
| `BillingZip` | `String` | Optional | The current billing address zip code for the bank account | String getBillingZip() | setBillingZip(String billingZip) |
| `BillingCountry` | `String` | Optional | The current billing address country for the bank account | String getBillingCountry() | setBillingCountry(String billingCountry) |
| `CurrentVault` | [`BankAccountVault`](../../doc/models/bank-account-vault.md) | Optional | The vault that stores the payment profile with the provided vault_token. | BankAccountVault getCurrentVault() | setCurrentVault(BankAccountVault currentVault) |
| `CustomerId` | `Integer` | Optional | The Chargify-assigned id for the customer record to which the bank account belongs | Integer getCustomerId() | setCustomerId(Integer customerId) |
| `CustomerVaultToken` | `String` | Optional | (only for Authorize.Net CIM storage): the customerProfileId for the owner of the customerPaymentProfileId provided as the vault_token | String getCustomerVaultToken() | setCustomerVaultToken(String customerVaultToken) |
| `FirstName` | `String` | Optional | The first name of the bank account holder | String getFirstName() | setFirstName(String firstName) |
| `LastName` | `String` | Optional | The last name of the bank account holder | String getLastName() | setLastName(String lastName) |
| `Id` | `Integer` | Optional | The Chargify-assigned ID of the stored bank account. This value can be used as an input to payment_profile_id when creating a subscription, in order to re-use a stored payment profile for the same customer | Integer getId() | setId(Integer id) |
| `MaskedBankAccountNumber` | `String` | Optional | A string representation of the stored bank account number with all but the last 4 digits marked with X’s (i.e. ‘XXXXXXX1111’) | String getMaskedBankAccountNumber() | setMaskedBankAccountNumber(String maskedBankAccountNumber) |
| `MaskedBankRoutingNumber` | `String` | Optional | A string representation of the stored bank routing number with all but the last 4 digits marked with X’s (i.e. ‘XXXXXXX1111’). payment_type will be bank_account | String getMaskedBankRoutingNumber() | setMaskedBankRoutingNumber(String maskedBankRoutingNumber) |
| `VaultToken` | `String` | Optional | The “token” provided by your vault storage for an already stored payment profile | String getVaultToken() | setVaultToken(String vaultToken) |
| `ChargifyToken` | `String` | Optional | Token received after sending billing informations using chargify.js. This token will only be received if passed as a sole attribute of credit_card_attributes (i.e. tok_9g6hw85pnpt6knmskpwp4ttt) | String getChargifyToken() | setChargifyToken(String chargifyToken) |
| `SiteGatewaySettingId` | `Integer` | Optional | - | Integer getSiteGatewaySettingId() | setSiteGatewaySettingId(Integer siteGatewaySettingId) |
| `GatewayHandle` | `String` | Optional | - | String getGatewayHandle() | setGatewayHandle(String gatewayHandle) |

## Example (as JSON)

```json
{
  "bank_account_holder_type": "bank_account_holder_type4",
  "bank_account_type": "bank_account_type4",
  "bank_name": "bank_name8",
  "billing_address": "billing_address8",
  "billing_address_2": "billing_address_28"
}
```

