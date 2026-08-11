
# Tokenized Payment Profile

## Structure

`TokenizedPaymentProfile`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `VaultToken` | `String` | Optional | - | String getVaultToken() | setVaultToken(String vaultToken) |
| `GatewayHandle` | `String` | Optional | - | String getGatewayHandle() | setGatewayHandle(String gatewayHandle) |
| `CustomerVaultToken` | `String` | Optional | - | String getCustomerVaultToken() | setCustomerVaultToken(String customerVaultToken) |

## Example

```java
import com.maxio.advancedbilling.models.TokenizedPaymentProfile;

TokenizedPaymentProfile tokenizedPaymentProfile = new TokenizedPaymentProfile.Builder(
    116
)
.vaultToken("vault_token0")
.gatewayHandle("gateway_handle0")
.customerVaultToken("customer_vault_token6")
.build();
```

