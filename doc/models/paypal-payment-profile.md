
# Paypal Payment Profile

## Structure

`PaypalPaymentProfile`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | The Chargify-assigned ID of the stored PayPal payment profile. | Integer getId() | setId(Integer id) |
| `FirstName` | `String` | Optional | The first name of the PayPal account holder | String getFirstName() | setFirstName(String firstName) |
| `LastName` | `String` | Optional | The last name of the PayPal account holder | String getLastName() | setLastName(String lastName) |
| `CustomerId` | `Integer` | Optional | The Chargify-assigned id for the customer record to which the PayPal account belongs | Integer getCustomerId() | setCustomerId(Integer customerId) |
| `CurrentVault` | [`PayPalVault`](../../doc/models/pay-pal-vault.md) | Optional | The vault that stores the payment profile with the provided vault_token. | PayPalVault getCurrentVault() | setCurrentVault(PayPalVault currentVault) |
| `VaultToken` | `String` | Optional | The “token” provided by your vault storage for an already stored payment profile | String getVaultToken() | setVaultToken(String vaultToken) |
| `BillingAddress` | `String` | Optional | The current billing street address for the PayPal account | String getBillingAddress() | setBillingAddress(String billingAddress) |
| `BillingCity` | `String` | Optional | The current billing address city for the PayPal account | String getBillingCity() | setBillingCity(String billingCity) |
| `BillingState` | `String` | Optional | The current billing address state for the PayPal account | String getBillingState() | setBillingState(String billingState) |
| `BillingZip` | `String` | Optional | The current billing address zip code for the PayPal account | String getBillingZip() | setBillingZip(String billingZip) |
| `BillingCountry` | `String` | Optional | The current billing address country for the PayPal account | String getBillingCountry() | setBillingCountry(String billingCountry) |
| `CustomerVaultToken` | `String` | Optional | - | String getCustomerVaultToken() | setCustomerVaultToken(String customerVaultToken) |
| `BillingAddress2` | `String` | Optional | The current billing street address, second line, for the PayPal account | String getBillingAddress2() | setBillingAddress2(String billingAddress2) |
| `PaymentType` | [`PaymentType`](../../doc/models/payment-type.md) | Required | **Default**: `PaymentType.PAYPAL_ACCOUNT` | PaymentType getPaymentType() | setPaymentType(PaymentType paymentType) |
| `SiteGatewaySettingId` | `Integer` | Optional | - | Integer getSiteGatewaySettingId() | setSiteGatewaySettingId(Integer siteGatewaySettingId) |
| `GatewayHandle` | `String` | Optional | - | String getGatewayHandle() | setGatewayHandle(String gatewayHandle) |
| `PaypalEmail` | `String` | Optional | - | String getPaypalEmail() | setPaypalEmail(String paypalEmail) |

## Example (as JSON)

```json
{
  "payment_type": "paypal_account",
  "id": 10,
  "first_name": "first_name0",
  "last_name": "last_name8",
  "customer_id": 48,
  "current_vault": "moduslink"
}
```

