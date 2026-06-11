
# Payment Profile

## Structure

`PaymentProfile`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `VaultToken` | `String` | Optional | - | String getVaultToken() | setVaultToken(String vaultToken) |
| `GatewayHandle` | `String` | Optional | - | String getGatewayHandle() | setGatewayHandle(String gatewayHandle) |
| `CustomerVaultToken` | `String` | Optional | - | String getCustomerVaultToken() | setCustomerVaultToken(String customerVaultToken) |

## Example (as JSON)

```json
{
  "id": 56,
  "vault_token": "vault_token0",
  "gateway_handle": "gateway_handle0",
  "customer_vault_token": "customer_vault_token6"
}
```

