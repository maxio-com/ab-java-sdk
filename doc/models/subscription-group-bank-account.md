
# Subscription Group Bank Account

## Structure

`SubscriptionGroupBankAccount`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BankName` | `String` | Optional | (Required when creating a subscription with ACH or GoCardless) The name of the bank where the customer’s account resides | String getBankName() | setBankName(String bankName) |
| `BankAccountNumber` | `String` | Optional | (Required when creating a subscription with ACH. Required when creating a subscription with GoCardless and bank_iban is blank) The customerʼs bank account number | String getBankAccountNumber() | setBankAccountNumber(String bankAccountNumber) |
| `BankRoutingNumber` | `String` | Optional | (Required when creating a subscription with ACH. Optional when creating a subscription with GoCardless). The routing number of the bank. It becomes bank_code while passing via GoCardless API | String getBankRoutingNumber() | setBankRoutingNumber(String bankRoutingNumber) |
| `BankIban` | `String` | Optional | (Optional when creating a subscription with GoCardless). International Bank Account Number. Alternatively, local bank details can be provided | String getBankIban() | setBankIban(String bankIban) |
| `BankBranchCode` | `String` | Optional | (Optional when creating a subscription with GoCardless) Branch code. Alternatively, an IBAN can be provided | String getBankBranchCode() | setBankBranchCode(String bankBranchCode) |
| `BankAccountType` | [`BankAccountType`](../../doc/models/bank-account-type.md) | Optional | **Default**: `BankAccountType.CHECKING` | BankAccountType getBankAccountType() | setBankAccountType(BankAccountType bankAccountType) |
| `BankAccountHolderType` | [`HolderType`](../../doc/models/holder-type.md) | Optional | - | HolderType getBankAccountHolderType() | setBankAccountHolderType(HolderType bankAccountHolderType) |
| `PaymentType` | `String` | Optional | - | String getPaymentType() | setPaymentType(String paymentType) |
| `BillingAddress` | `String` | Optional | - | String getBillingAddress() | setBillingAddress(String billingAddress) |
| `BillingCity` | `String` | Optional | - | String getBillingCity() | setBillingCity(String billingCity) |
| `BillingState` | `String` | Optional | - | String getBillingState() | setBillingState(String billingState) |
| `BillingZip` | `String` | Optional | - | String getBillingZip() | setBillingZip(String billingZip) |
| `BillingCountry` | `String` | Optional | - | String getBillingCountry() | setBillingCountry(String billingCountry) |
| `ChargifyToken` | `String` | Optional | - | String getChargifyToken() | setChargifyToken(String chargifyToken) |
| `CurrentVault` | [`BankAccountVault`](../../doc/models/bank-account-vault.md) | Optional | The vault that stores the payment profile with the provided vault_token. | BankAccountVault getCurrentVault() | setCurrentVault(BankAccountVault currentVault) |
| `GatewayHandle` | `String` | Optional | - | String getGatewayHandle() | setGatewayHandle(String gatewayHandle) |

## Example (as JSON)

```json
{
  "bank_account_type": "checking",
  "bank_name": "bank_name2",
  "bank_account_number": "bank_account_number4",
  "bank_routing_number": "bank_routing_number8",
  "bank_iban": "bank_iban6",
  "bank_branch_code": "bank_branch_code6"
}
```

