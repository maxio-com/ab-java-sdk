
# Bank Account Attributes

## Structure

`BankAccountAttributes`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ChargifyToken` | `String` | Optional | - | String getChargifyToken() | setChargifyToken(String chargifyToken) |
| `BankName` | `String` | Optional | (Required when creating a subscription with ACH or GoCardless) The name of the bank where the customer’s account resides | String getBankName() | setBankName(String bankName) |
| `BankRoutingNumber` | `String` | Optional | (Required when creating a subscription with ACH. Optional when creating a subscription with GoCardless). The routing number of the bank. It becomes bank_code while passing via GoCardless API | String getBankRoutingNumber() | setBankRoutingNumber(String bankRoutingNumber) |
| `BankAccountNumber` | `String` | Optional | (Required when creating a subscription with ACH. Required when creating a subscription with GoCardless and bank_iban is blank) The customerʼs bank account number | String getBankAccountNumber() | setBankAccountNumber(String bankAccountNumber) |
| `BankAccountType` | `String` | Optional | - | String getBankAccountType() | setBankAccountType(String bankAccountType) |
| `BankBranchCode` | `String` | Optional | (Optional when creating a subscription with GoCardless) Branch code. Alternatively, an IBAN can be provided | String getBankBranchCode() | setBankBranchCode(String bankBranchCode) |
| `BankIban` | `String` | Optional | (Optional when creating a subscription with GoCardless). International Bank Account Number. Alternatively, local bank details can be provided | String getBankIban() | setBankIban(String bankIban) |
| `BankAccountHolderType` | `String` | Optional | - | String getBankAccountHolderType() | setBankAccountHolderType(String bankAccountHolderType) |
| `PaymentType` | `String` | Optional | - | String getPaymentType() | setPaymentType(String paymentType) |

## Example (as JSON)

```json
{
  "chargify_token": "chargify_token0",
  "bank_name": "bank_name2",
  "bank_routing_number": "bank_routing_number8",
  "bank_account_number": "bank_account_number4",
  "bank_account_type": "bank_account_type0"
}
```

