
# Service Credit 1

## Structure

`ServiceCredit1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `AmountInCents` | `Long` | Optional | The amount in cents of the entry | Long getAmountInCents() | setAmountInCents(Long amountInCents) |
| `EndingBalanceInCents` | `Long` | Optional | The new balance for the credit account | Long getEndingBalanceInCents() | setEndingBalanceInCents(Long endingBalanceInCents) |
| `EntryType` | [`ServiceCreditType`](../../doc/models/service-credit-type.md) | Optional | The type of entry | ServiceCreditType getEntryType() | setEntryType(ServiceCreditType entryType) |
| `Memo` | `String` | Optional | The memo attached to the entry | String getMemo() | setMemo(String memo) |
| `InvoiceUid` | `String` | Optional | The invoice uid associated with the entry. Only present for debit entries. | String getInvoiceUid() | setInvoiceUid(String invoiceUid) |
| `RemainingBalanceInCents` | `Long` | Optional | The remaining balance for the entry | Long getRemainingBalanceInCents() | setRemainingBalanceInCents(Long remainingBalanceInCents) |
| `CreatedAt` | `ZonedDateTime` | Optional | The date and time the entry was created | ZonedDateTime getCreatedAt() | setCreatedAt(ZonedDateTime createdAt) |

## Example

```java
import com.maxio.advancedbilling.models.ServiceCredit1;
import com.maxio.advancedbilling.models.ServiceCreditType;

ServiceCredit1 serviceCredit1 = new ServiceCredit1.Builder()
    .id(12)
    .amountInCents(158L)
    .endingBalanceInCents(138L)
    .entryType(ServiceCreditType.CREDIT)
    .memo("memo4")
    .build();
```

