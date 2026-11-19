
# Wallet Transaction 1

## Structure

`WalletTransaction1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Kind` | [`Kind1`](../../doc/models/kind-1.md) | Required | Determines the direction of the movement. The amount itself is always sent positive. | Kind1 getKind() | setKind(Kind1 kind) |
| `Amount` | [`WalletTransaction1Amount`](../../doc/models/containers/wallet-transaction-1-amount.md) | Required | This is a container for one-of cases. | WalletTransaction1Amount getAmount() | setAmount(WalletTransaction1Amount amount) |
| `Memo` | `String` | Optional | **Constraints**: *Maximum Length*: `255` | String getMemo() | setMemo(String memo) |
| `ExpiresAt` | `String` | Optional | An expiration for the grant this creates. Only accepted with `kind: grant`; sending it with `kind: debit` is rejected. Omit it for an evergreen grant. Accepts either a bare calendar date (`YYYY-MM-DD`), resolved to the end of that day in the site's time zone, or a full timestamp. A calendar day that doesn't exist, such as `2027-02-30`, is rejected with `422` rather than rolled into the next month. | String getExpiresAt() | setExpiresAt(String expiresAt) |

## Example

```java
import com.maxio.advancedbilling.models.Kind1;
import com.maxio.advancedbilling.models.WalletTransaction1;
import com.maxio.advancedbilling.models.containers.WalletTransaction1Amount;

WalletTransaction1 walletTransaction1 = new WalletTransaction1.Builder(
    Kind1.GRANT,
    WalletTransaction1Amount.fromString(
        "String5"
    )
)
.memo("memo6")
.expiresAt("expires_at4")
.build();
```

