
# Credit Card Payment Profile

## Structure

`CreditCardPaymentProfile`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | The Chargify-assigned ID of the stored card. This value can be used as an input to payment_profile_id when creating a subscription, in order to re-use a stored payment profile for the same customer. | Integer getId() | setId(Integer id) |
| `FirstName` | `String` | Optional | The first name of the card holder. | String getFirstName() | setFirstName(String firstName) |
| `LastName` | `String` | Optional | The last name of the card holder. | String getLastName() | setLastName(String lastName) |
| `MaskedCardNumber` | `String` | Optional | A string representation of the credit card number with all but the last 4 digits masked with X’s (e.g., ‘XXXX-XXXX-XXXX-1234’). | String getMaskedCardNumber() | setMaskedCardNumber(String maskedCardNumber) |
| `CardType` | [`CardType`](../../doc/models/card-type.md) | Optional | The type of card used. | CardType getCardType() | setCardType(CardType cardType) |
| `ExpirationMonth` | `Integer` | Optional | An integer representing the expiration month of the card(1 – 12). | Integer getExpirationMonth() | setExpirationMonth(Integer expirationMonth) |
| `ExpirationYear` | `Integer` | Optional | An integer representing the 4-digit expiration year of the card(e.g., ‘2012’). | Integer getExpirationYear() | setExpirationYear(Integer expirationYear) |
| `CustomerId` | `Integer` | Optional | The Chargify-assigned id for the customer record to which the card belongs. | Integer getCustomerId() | setCustomerId(Integer customerId) |
| `CurrentVault` | [`CreditCardVault`](../../doc/models/credit-card-vault.md) | Optional | The vault that stores the payment profile with the provided `vault_token`. Use `bogus` for testing. | CreditCardVault getCurrentVault() | setCurrentVault(CreditCardVault currentVault) |
| `VaultToken` | `String` | Optional | The “token” provided by your vault storage for an already stored payment profile. | String getVaultToken() | setVaultToken(String vaultToken) |
| `BillingAddress` | `String` | Optional | The current billing street address for the card. | String getBillingAddress() | setBillingAddress(String billingAddress) |
| `BillingCity` | `String` | Optional | The current billing address city for the card. | String getBillingCity() | setBillingCity(String billingCity) |
| `BillingState` | `String` | Optional | The current billing address state for the card. | String getBillingState() | setBillingState(String billingState) |
| `BillingZip` | `String` | Optional | The current billing address zip code for the card. | String getBillingZip() | setBillingZip(String billingZip) |
| `BillingCountry` | `String` | Optional | The current billing address country for the card. | String getBillingCountry() | setBillingCountry(String billingCountry) |
| `CustomerVaultToken` | `String` | Optional | (only for Authorize.Net CIM storage): the customerProfileId for the owner of the customerPaymentProfileId provided as the vault_token. | String getCustomerVaultToken() | setCustomerVaultToken(String customerVaultToken) |
| `BillingAddress2` | `String` | Optional | The current billing street address, second line, for the card. | String getBillingAddress2() | setBillingAddress2(String billingAddress2) |
| `PaymentType` | [`PaymentType`](../../doc/models/payment-type.md) | Required | **Default**: `PaymentType.CREDIT_CARD` | PaymentType getPaymentType() | setPaymentType(PaymentType paymentType) |
| `Disabled` | `Boolean` | Optional | - | Boolean getDisabled() | setDisabled(Boolean disabled) |
| `ChargifyToken` | `String` | Optional | Token received after sending billing information using Maxio.js (formerly Chargify.js). This token will only be received if passed as a sole attribute of credit_card_attributes (e.g., tok_9g6hw85pnpt6knmskpwp4ttt). | String getChargifyToken() | setChargifyToken(String chargifyToken) |
| `SiteGatewaySettingId` | `Integer` | Optional | - | Integer getSiteGatewaySettingId() | setSiteGatewaySettingId(Integer siteGatewaySettingId) |
| `GatewayHandle` | `String` | Optional | An identifier of connected gateway. | String getGatewayHandle() | setGatewayHandle(String gatewayHandle) |
| `CreatedAt` | `ZonedDateTime` | Optional | A timestamp indicating when this payment profile was created | ZonedDateTime getCreatedAt() | setCreatedAt(ZonedDateTime createdAt) |
| `UpdatedAt` | `ZonedDateTime` | Optional | A timestamp indicating when this payment profile was last updated | ZonedDateTime getUpdatedAt() | setUpdatedAt(ZonedDateTime updatedAt) |

## Example

```java
import com.maxio.advancedbilling.models.CardType;
import com.maxio.advancedbilling.models.CreditCardPaymentProfile;
import com.maxio.advancedbilling.models.CreditCardVault;
import com.maxio.advancedbilling.models.PaymentType;

CreditCardPaymentProfile creditCardPaymentProfile = new CreditCardPaymentProfile.Builder(
    PaymentType.CREDIT_CARD
)
.id(10088716)
.firstName("Test")
.lastName("Subscription")
.maskedCardNumber("XXXX-XXXX-XXXX-1")
.cardType(CardType.BOGUS)
.expirationMonth(1)
.expirationYear(2022)
.customerId(14543792)
.currentVault(CreditCardVault.BOGUS)
.vaultToken("1")
.billingAddress("123 Montana Way")
.billingCity("Billings")
.billingState("MT")
.billingZip("59101")
.billingCountry("US")
.customerVaultToken("customer_vault_token2")
.billingAddress2("")
.siteGatewaySettingId(1)
.gatewayHandle("gateway_handle8")
.build();
```

