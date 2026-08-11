
# Invoice Credit

## Structure

`InvoiceCredit`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Optional | - | String getUid() | setUid(String uid) |
| `CreditNoteNumber` | `String` | Optional | - | String getCreditNoteNumber() | setCreditNoteNumber(String creditNoteNumber) |
| `CreditNoteUid` | `String` | Optional | - | String getCreditNoteUid() | setCreditNoteUid(String creditNoteUid) |
| `TransactionTime` | `ZonedDateTime` | Optional | - | ZonedDateTime getTransactionTime() | setTransactionTime(ZonedDateTime transactionTime) |
| `Memo` | `String` | Optional | - | String getMemo() | setMemo(String memo) |
| `OriginalAmount` | `String` | Optional | - | String getOriginalAmount() | setOriginalAmount(String originalAmount) |
| `AppliedAmount` | `String` | Optional | - | String getAppliedAmount() | setAppliedAmount(String appliedAmount) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.InvoiceCredit;

InvoiceCredit invoiceCredit = new InvoiceCredit.Builder()
    .uid("uid8")
    .creditNoteNumber("credit_note_number2")
    .creditNoteUid("credit_note_uid2")
    .transactionTime(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .memo("memo2")
    .build();
```

