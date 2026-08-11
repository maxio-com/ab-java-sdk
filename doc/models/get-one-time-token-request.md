
# Get One Time Token Request

## Structure

`GetOneTimeTokenRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PaymentProfile` | [`GetOneTimeTokenRequestPaymentProfile`](../../doc/models/containers/get-one-time-token-request-payment-profile.md) | Required | This is a container for any-of cases. | GetOneTimeTokenRequestPaymentProfile getPaymentProfile() | setPaymentProfile(GetOneTimeTokenRequestPaymentProfile paymentProfile) |

## Example

```java
import com.maxio.advancedbilling.models.CardType;
import com.maxio.advancedbilling.models.CreditCardVault;
import com.maxio.advancedbilling.models.GetOneTimeTokenPaymentProfile;
import com.maxio.advancedbilling.models.GetOneTimeTokenRequest;
import com.maxio.advancedbilling.models.containers.GetOneTimeTokenRequestPaymentProfile;

GetOneTimeTokenRequest getOneTimeTokenRequest = new GetOneTimeTokenRequest.Builder(
    GetOneTimeTokenRequestPaymentProfile.fromGetOneTimeTokenPaymentProfile(
        new GetOneTimeTokenPaymentProfile.Builder(
            "first_name2",
            "last_name0",
            "masked_card_number0",
            CardType.ROUTEX,
            187.78D,
            164.44D,
            CreditCardVault.BRAINTREE_BLUE,
            "vault_token4",
            "billing_address4",
            "billing_city0",
            "billing_country6",
            "billing_state6",
            "billing_zip0",
            "payment_type2",
            false,
            232
        )
        .id("id2")
        .customerId("customer_id0")
        .billingAddress2("billing_address_24")
        .customerVaultToken("customer_vault_token0")
        .gatewayHandle("gateway_handle4")
        .build()
    )
)
.build();
```

