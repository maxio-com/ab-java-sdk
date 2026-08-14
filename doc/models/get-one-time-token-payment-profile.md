
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
| `CardType` | [`CardType`](../../doc/models/card-type.md) | Required | The type of card used. | CardType getCardType() | setCardType(CardType cardType) |
| `ExpirationMonth` | `double` | Required | - | double getExpirationMonth() | setExpirationMonth(double expirationMonth) |
| `ExpirationYear` | `double` | Required | - | double getExpirationYear() | setExpirationYear(double expirationYear) |
| `CustomerId` | `String` | Optional | - | String getCustomerId() | setCustomerId(String customerId) |
| `CurrentVault` | [`CreditCardVault`](../../doc/models/credit-card-vault.md) | Required | The vault that stores the payment profile with the provided `vault_token`. Use `bogus` for testing. | CreditCardVault getCurrentVault() | setCurrentVault(CreditCardVault currentVault) |
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

## Example

```java
import com.maxio.advancedbilling.models.CardType;
import com.maxio.advancedbilling.models.CreditCardVault;
import com.maxio.advancedbilling.models.GetOneTimeTokenPaymentProfile;

GetOneTimeTokenPaymentProfile getOneTimeTokenPaymentProfile = new GetOneTimeTokenPaymentProfile.Builder(
    "first_name4",
    "last_name2",
    "masked_card_number2",
    CardType.MAESTRO_NO_LUHN,
    28.3D,
    4.96D,
    CreditCardVault.TRUST_COMMERCE,
    "vault_token6",
    "billing_address6",
    "billing_city2",
    "billing_country8",
    "billing_state2",
    "billing_zip2",
    "payment_type6",
    false,
    156
)
.id("id4")
.customerId("customer_id2")
.billingAddress2("billing_address_26")
.customerVaultToken("customer_vault_token2")
.gatewayHandle("gateway_handle6")
.build();
```

