
# Bank Account Payment Profile

## Structure

`BankAccountPaymentProfile`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | The Chargify-assigned ID of the stored bank account. This value can be used as an input to payment_profile_id when creating a subscription, in order to re-use a stored payment profile for the same customer. | Integer getId() | setId(Integer id) |
| `FirstName` | `String` | Optional | The first name of the bank account holder | String getFirstName() | setFirstName(String firstName) |
| `LastName` | `String` | Optional | The last name of the bank account holder | String getLastName() | setLastName(String lastName) |
| `CustomerId` | `Integer` | Optional | The Chargify-assigned ID for the customer record to which the bank account belongs | Integer getCustomerId() | setCustomerId(Integer customerId) |
| `CurrentVault` | [`BankAccountVault`](../../doc/models/bank-account-vault.md) | Optional | The vault that stores the payment profile with the provided vault_token. Use `bogus` for testing. | BankAccountVault getCurrentVault() | setCurrentVault(BankAccountVault currentVault) |
| `VaultToken` | `String` | Optional | The "token" provided by your vault storage for an already stored payment profile | String getVaultToken() | setVaultToken(String vaultToken) |
| `BillingAddress` | `String` | Optional | The current billing street address for the bank account | String getBillingAddress() | setBillingAddress(String billingAddress) |
| `BillingCity` | `String` | Optional | The current billing address city for the bank account | String getBillingCity() | setBillingCity(String billingCity) |
| `BillingState` | `String` | Optional | The current billing address state for the bank account | String getBillingState() | setBillingState(String billingState) |
| `BillingZip` | `String` | Optional | The current billing address zip code for the bank account | String getBillingZip() | setBillingZip(String billingZip) |
| `BillingCountry` | `String` | Optional | The current billing address country for the bank account | String getBillingCountry() | setBillingCountry(String billingCountry) |
| `CustomerVaultToken` | `String` | Optional | (only for Authorize.Net CIM storage): the customerProfileId for the owner of the customerPaymentProfileId provided as the vault_token. | String getCustomerVaultToken() | setCustomerVaultToken(String customerVaultToken) |
| `BillingAddress2` | `String` | Optional | The current billing street address, second line, for the bank account | String getBillingAddress2() | setBillingAddress2(String billingAddress2) |
| `BankName` | `String` | Optional | The bank where the account resides | String getBankName() | setBankName(String bankName) |
| `MaskedBankRoutingNumber` | `String` | Optional | A string representation of the stored bank routing number with all but the last 4 digits marked with X's (i.e. 'XXXXXXX1111'). payment_type will be bank_account. | String getMaskedBankRoutingNumber() | setMaskedBankRoutingNumber(String maskedBankRoutingNumber) |
| `BankAccountType` | [`BankAccountType`](../../doc/models/bank-account-type.md) | Optional | Defaults to checking | BankAccountType getBankAccountType() | setBankAccountType(BankAccountType bankAccountType) |
| `BankAccountHolderType` | [`BankAccountHolderType`](../../doc/models/bank-account-holder-type.md) | Optional | Defaults to personal | BankAccountHolderType getBankAccountHolderType() | setBankAccountHolderType(BankAccountHolderType bankAccountHolderType) |
| `PaymentType` | [`PaymentType`](../../doc/models/payment-type.md) | Required | **Default**: `PaymentType.BANK_ACCOUNT` | PaymentType getPaymentType() | setPaymentType(PaymentType paymentType) |
| `Verified` | `Boolean` | Optional | Denotes whether a bank account has been verified by providing the amounts of two small deposits made into the account.<br><br>**Default**: `false` | Boolean getVerified() | setVerified(Boolean verified) |
| `SiteGatewaySettingId` | `Integer` | Optional | - | Integer getSiteGatewaySettingId() | setSiteGatewaySettingId(Integer siteGatewaySettingId) |
| `GatewayHandle` | `String` | Optional | - | String getGatewayHandle() | setGatewayHandle(String gatewayHandle) |
| `CreatedAt` | `ZonedDateTime` | Optional | A timestamp indicating when this payment profile was created | ZonedDateTime getCreatedAt() | setCreatedAt(ZonedDateTime createdAt) |
| `UpdatedAt` | `ZonedDateTime` | Optional | A timestamp indicating when this payment profile was last updated | ZonedDateTime getUpdatedAt() | setUpdatedAt(ZonedDateTime updatedAt) |

## Example

```java
import com.maxio.advancedbilling.models.BankAccountPaymentProfile;
import com.maxio.advancedbilling.models.BankAccountVault;
import com.maxio.advancedbilling.models.PaymentType;

BankAccountPaymentProfile bankAccountPaymentProfile = new BankAccountPaymentProfile.Builder(
    PaymentType.BANK_ACCOUNT
)
.id(16)
.firstName("first_name0")
.lastName("last_name8")
.customerId(54)
.currentVault(BankAccountVault.GOCARDLESS)
.verified(false)
.build();
```

