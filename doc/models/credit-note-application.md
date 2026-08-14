
# Credit Note Application

## Structure

`CreditNoteApplication`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Optional | - | String getUid() | setUid(String uid) |
| `TransactionTime` | `ZonedDateTime` | Optional | - | ZonedDateTime getTransactionTime() | setTransactionTime(ZonedDateTime transactionTime) |
| `InvoiceUid` | `String` | Optional | - | String getInvoiceUid() | setInvoiceUid(String invoiceUid) |
| `Memo` | `String` | Optional | - | String getMemo() | setMemo(String memo) |
| `AppliedAmount` | `String` | Optional | - | String getAppliedAmount() | setAppliedAmount(String appliedAmount) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.CreditNoteApplication;

CreditNoteApplication creditNoteApplication = new CreditNoteApplication.Builder()
    .uid("uid0")
    .transactionTime(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .invoiceUid("invoice_uid0")
    .memo("memo4")
    .appliedAmount("applied_amount8")
    .build();
```

