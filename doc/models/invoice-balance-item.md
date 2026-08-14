
# Invoice Balance Item

## Structure

`InvoiceBalanceItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Optional | - | String getUid() | setUid(String uid) |
| `Number` | `String` | Optional | - | String getNumber() | setNumber(String number) |
| `OutstandingAmount` | `String` | Optional | - | String getOutstandingAmount() | setOutstandingAmount(String outstandingAmount) |

## Example

```java
import com.maxio.advancedbilling.models.InvoiceBalanceItem;

InvoiceBalanceItem invoiceBalanceItem = new InvoiceBalanceItem.Builder()
    .uid("uid8")
    .number("number6")
    .outstandingAmount("outstanding_amount6")
    .build();
```

