
# Chjs Tokenization Success

## Structure

`ChjsTokenizationSuccess`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PaymentProfile` | [`TokenizedPaymentProfile`](../../doc/models/tokenized-payment-profile.md) | Required | - | TokenizedPaymentProfile getPaymentProfile() | setPaymentProfile(TokenizedPaymentProfile paymentProfile) |
| `GatewayCustomerId` | `Integer` | Optional | - | Integer getGatewayCustomerId() | setGatewayCustomerId(Integer gatewayCustomerId) |

## Example

```java
import com.maxio.advancedbilling.models.ChjsTokenizationSuccess;
import com.maxio.advancedbilling.models.TokenizedPaymentProfile;

ChjsTokenizationSuccess chjsTokenizationSuccess = new ChjsTokenizationSuccess.Builder(
    new TokenizedPaymentProfile.Builder(
        44
    )
    .vaultToken("vault_token6")
    .gatewayHandle("gateway_handle4")
    .customerVaultToken("customer_vault_token2")
    .build()
)
.gatewayCustomerId(228)
.build();
```

