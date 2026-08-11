
# Update Payment Profile

## Structure

`UpdatePaymentProfile`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FirstName` | `String` | Optional | The first name of the card holder. | String getFirstName() | setFirstName(String firstName) |
| `LastName` | `String` | Optional | The last name of the card holder. | String getLastName() | setLastName(String lastName) |
| `FullNumber` | `String` | Optional | The full credit card number | String getFullNumber() | setFullNumber(String fullNumber) |
| `CardType` | [`CardType`](../../doc/models/card-type.md) | Optional | The type of card used. | CardType getCardType() | setCardType(CardType cardType) |
| `ExpirationMonth` | `String` | Optional | (Optional when performing an Import via vault_token, required otherwise) The 1- or 2-digit credit card expiration month, as an integer or string, e.g., 5 | String getExpirationMonth() | setExpirationMonth(String expirationMonth) |
| `ExpirationYear` | `String` | Optional | (Optional when performing an Import via vault_token, required otherwise) The 4-digit credit card expiration year, as an integer or string, e.g., 2012 | String getExpirationYear() | setExpirationYear(String expirationYear) |
| `CurrentVault` | [`AllVaults`](../../doc/models/all-vaults.md) | Optional | The vault that stores the payment profile with the provided `vault_token`. Use `bogus` for testing. | AllVaults getCurrentVault() | setCurrentVault(AllVaults currentVault) |
| `BillingAddress` | `String` | Optional | The credit card or bank account billing street address (e.g., 123 Main St.). This value is merely passed through to the payment gateway. | String getBillingAddress() | setBillingAddress(String billingAddress) |
| `BillingCity` | `String` | Optional | The credit card or bank account billing address city (e.g., “Boston”). This value is merely passed through to the payment gateway. | String getBillingCity() | setBillingCity(String billingCity) |
| `BillingState` | `String` | Optional | The credit card or bank account billing address state (e.g., MA). This value is merely passed through to the payment gateway. This must conform to the [ISO_3166-1](https://en.wikipedia.org/wiki/ISO_3166-1#Current_codes) in order to be valid for tax locale purposes. | String getBillingState() | setBillingState(String billingState) |
| `BillingZip` | `String` | Optional | The credit card or bank account billing address zip code (e.g., 12345). This value is merely passed through to the payment gateway. | String getBillingZip() | setBillingZip(String billingZip) |
| `BillingCountry` | `String` | Optional | The credit card or bank account billing address country, required in [ISO_3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format (e.g., “US”). This value is merely passed through to the payment gateway. Some gateways require country codes in a specific format. Check your gateway’s documentation. If creating an ACH subscription, only US is supported at this time. | String getBillingCountry() | setBillingCountry(String billingCountry) |
| `BillingAddress2` | `String` | Optional | Second line of the customer’s billing address, e.g., Apt. 100 | String getBillingAddress2() | setBillingAddress2(String billingAddress2) |

## Example

```java
import com.maxio.advancedbilling.models.CardType;
import com.maxio.advancedbilling.models.UpdatePaymentProfile;

UpdatePaymentProfile updatePaymentProfile = new UpdatePaymentProfile.Builder()
    .firstName("first_name6")
    .lastName("last_name4")
    .fullNumber("5424000000000015")
    .cardType(CardType.AMERICAN_EXPRESS)
    .expirationMonth("expiration_month8")
    .build();
```

