
# Applied Credit Note Data

## Structure

`AppliedCreditNoteData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Optional | The UID of the credit note | String getUid() | setUid(String uid) |
| `Number` | `String` | Optional | The number of the credit note | String getNumber() | setNumber(String number) |

## Example

```java
import com.maxio.advancedbilling.models.AppliedCreditNoteData;

AppliedCreditNoteData appliedCreditNoteData = new AppliedCreditNoteData.Builder()
    .uid("uid4")
    .number("number2")
    .build();
```

