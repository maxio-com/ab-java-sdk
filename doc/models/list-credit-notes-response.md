
# List Credit Notes Response

## Structure

`ListCreditNotesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CreditNotes` | [`List<CreditNote>`](../../doc/models/credit-note.md) | Required | - | List<CreditNote> getCreditNotes() | setCreditNotes(List<CreditNote> creditNotes) |

## Example

```java
import com.maxio.advancedbilling.models.CreditNote;
import com.maxio.advancedbilling.models.ListCreditNotesResponse;
import java.util.Arrays;

ListCreditNotesResponse listCreditNotesResponse = new ListCreditNotesResponse.Builder(
    Arrays.asList(
        new CreditNote.Builder()
            .uid("uid2")
            .siteId(112)
            .customerId(224)
            .subscriptionId(40)
            .number("number0")
            .build()
    )
)
.build();
```

