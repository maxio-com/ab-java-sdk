
# Payment Related Events

## Structure

`PaymentRelatedEvents`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ProductId` | `int` | Required | - | int getProductId() | setProductId(int productId) |
| `AccountTransactionId` | `int` | Required | - | int getAccountTransactionId() | setAccountTransactionId(int accountTransactionId) |

## Example

```java
import com.maxio.advancedbilling.models.PaymentRelatedEvents;

PaymentRelatedEvents paymentRelatedEvents = new PaymentRelatedEvents.Builder(
    186,
    170
)
.build();
```

