
# Wallet Purchase Preview

A price quote for a purchase, without charging anything.

## Structure

`WalletPurchasePreview`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PricePointId` | `int` | Required | - | int getPricePointId() | setPricePointId(int pricePointId) |
| `Currency` | `String` | Required | The three-letter currency code the `amount` is denominated in, matching the subscription's currency. | String getCurrency() | setCurrency(String currency) |
| `Quantity` | `String` | Required | The number of units the quote is for, as a decimal string. | String getQuantity() | setQuantity(String quantity) |
| `Amount` | `String` | Required | The price for `quantity` units at this price point, as a decimal string. | String getAmount() | setAmount(String amount) |

## Example

```java
import com.maxio.advancedbilling.models.WalletPurchasePreview;

WalletPurchasePreview walletPurchasePreview = new WalletPurchasePreview.Builder(
    98,
    "USD",
    "quantity4",
    "amount0"
)
.build();
```

