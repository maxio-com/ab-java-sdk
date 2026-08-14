
# Get One Time Token Bank Account Payment Profile

## Structure

`GetOneTimeTokenBankAccountPaymentProfile`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `FirstName` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getFirstName() | setFirstName(String firstName) |
| `LastName` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getLastName() | setLastName(String lastName) |
| `CustomerId` | `String` | Optional | - | String getCustomerId() | setCustomerId(String customerId) |
| `CurrentVault` | [`BankAccountVault`](../../doc/models/bank-account-vault.md) | Required | The vault that stores the payment profile with the provided vault_token. Use `bogus` for testing. | BankAccountVault getCurrentVault() | setCurrentVault(BankAccountVault currentVault) |
| `VaultToken` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getVaultToken() | setVaultToken(String vaultToken) |
| `BillingAddress` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getBillingAddress() | setBillingAddress(String billingAddress) |
| `BillingAddress2` | `String` | Optional | - | String getBillingAddress2() | setBillingAddress2(String billingAddress2) |
| `BillingCity` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getBillingCity() | setBillingCity(String billingCity) |
| `BillingCountry` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getBillingCountry() | setBillingCountry(String billingCountry) |
| `BillingState` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getBillingState() | setBillingState(String billingState) |
| `BillingZip` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getBillingZip() | setBillingZip(String billingZip) |
| `BankName` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getBankName() | setBankName(String bankName) |
| `MaskedBankRoutingNumber` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getMaskedBankRoutingNumber() | setMaskedBankRoutingNumber(String maskedBankRoutingNumber) |
| `MaskedBankAccountNumber` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getMaskedBankAccountNumber() | setMaskedBankAccountNumber(String maskedBankAccountNumber) |
| `BankAccountType` | [`BankAccountType`](../../doc/models/bank-account-type.md) | Required | Defaults to checking | BankAccountType getBankAccountType() | setBankAccountType(BankAccountType bankAccountType) |
| `BankAccountHolderType` | [`BankAccountHolderType`](../../doc/models/bank-account-holder-type.md) | Required | Defaults to personal | BankAccountHolderType getBankAccountHolderType() | setBankAccountHolderType(BankAccountHolderType bankAccountHolderType) |
| `PaymentType` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getPaymentType() | setPaymentType(String paymentType) |
| `Disabled` | `boolean` | Required | - | boolean getDisabled() | setDisabled(boolean disabled) |
| `SiteGatewaySettingId` | `int` | Required | - | int getSiteGatewaySettingId() | setSiteGatewaySettingId(int siteGatewaySettingId) |
| `CustomerVaultToken` | `String` | Optional | - | String getCustomerVaultToken() | setCustomerVaultToken(String customerVaultToken) |
| `GatewayHandle` | `String` | Optional | - | String getGatewayHandle() | setGatewayHandle(String gatewayHandle) |
| `Verified` | `Boolean` | Optional | - | Boolean getVerified() | setVerified(Boolean verified) |

## Example

```java
import com.maxio.advancedbilling.models.BankAccountHolderType;
import com.maxio.advancedbilling.models.BankAccountType;
import com.maxio.advancedbilling.models.BankAccountVault;
import com.maxio.advancedbilling.models.GetOneTimeTokenBankAccountPaymentProfile;

GetOneTimeTokenBankAccountPaymentProfile getOneTimeTokenBankAccountPaymentProfile = new GetOneTimeTokenBankAccountPaymentProfile.Builder(
    "first_name0",
    "last_name8",
    BankAccountVault.MAXP,
    "vault_token2",
    "billing_address2",
    "billing_city8",
    "billing_country4",
    "billing_state6",
    "billing_zip8",
    "bank_name4",
    "masked_bank_routing_number4",
    "masked_bank_account_number2",
    BankAccountType.CHECKING,
    BankAccountHolderType.PERSONAL,
    "payment_type0",
    false,
    246
)
.id("id0")
.customerId("customer_id8")
.billingAddress2("billing_address_22")
.customerVaultToken("customer_vault_token8")
.gatewayHandle("gateway_handle2")
.build();
```

