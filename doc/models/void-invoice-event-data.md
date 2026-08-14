
# Void Invoice Event Data

Example schema for an `void_invoice` event

## Structure

`VoidInvoiceEventData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CreditNoteAttributes` | [`CreditNote`](../../doc/models/credit-note.md) | Required | - | CreditNote getCreditNoteAttributes() | setCreditNoteAttributes(CreditNote creditNoteAttributes) |
| `Memo` | `String` | Required | The memo provided during invoice voiding. | String getMemo() | setMemo(String memo) |
| `AppliedAmount` | `String` | Required | The amount of the void. | String getAppliedAmount() | setAppliedAmount(String appliedAmount) |
| `TransactionTime` | `ZonedDateTime` | Required | The time the refund was applied, in ISO 8601 format, i.e. "2019-06-07T17:20:06Z" | ZonedDateTime getTransactionTime() | setTransactionTime(ZonedDateTime transactionTime) |
| `IsAdvanceInvoice` | `boolean` | Required | If true, the invoice is an advance invoice. | boolean getIsAdvanceInvoice() | setIsAdvanceInvoice(boolean isAdvanceInvoice) |
| `Reason` | `String` | Required | The reason for the void. | String getReason() | setReason(String reason) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.CreditNote;
import com.maxio.advancedbilling.models.VoidInvoiceEventData;

VoidInvoiceEventData voidInvoiceEventData = new VoidInvoiceEventData.Builder(
    new CreditNote.Builder()
        .uid("uid2")
        .siteId(72)
        .customerId(184)
        .subscriptionId(0)
        .number("number0")
        .build(),
    "memo6",
    "applied_amount6",
    DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
    false,
    "reason8"
)
.build();
```

