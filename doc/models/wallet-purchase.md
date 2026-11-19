
# Wallet Purchase

A completed unit purchase.

## Structure

`WalletPurchase`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | The id of the grant this purchase created. When the wallet was overdrawn by at least the purchased quantity, the units repay the debt and the grant is still created, with `remaining` of `0` and `original` equal to the purchased quantity. | int getId() | setId(int id) |
| `PricePointId` | `int` | Required | The price point the purchase was priced at. | int getPricePointId() | setPricePointId(int pricePointId) |
| `InvoiceUid` | `String` | Required | The uid of the invoice created to collect payment for this purchase. | String getInvoiceUid() | setInvoiceUid(String invoiceUid) |
| `Quantity` | `String` | Required | The number of units purchased, as a decimal string. | String getQuantity() | setQuantity(String quantity) |
| `ExpiresAt` | `ZonedDateTime` | Required | When the purchased units expire, following the funding entitlement's grant expiration policy. `null` when the wallet has no funding entitlement or its entitlements disagree on an expiration policy. | ZonedDateTime getExpiresAt() | setExpiresAt(ZonedDateTime expiresAt) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.WalletPurchase;

WalletPurchase walletPurchase = new WalletPurchase.Builder(
    218,
    96,
    "invoice_uid0",
    "quantity6",
    DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z")
)
.build();
```

