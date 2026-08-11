
# List Invoice Events Response

## Structure

`ListInvoiceEventsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Events` | [`List<InvoiceEvent>`](../../doc/models/containers/invoice-event.md) | Optional | - | List<InvoiceEvent> getEvents() | setEvents(List<InvoiceEvent> events) |
| `Page` | `Integer` | Optional | - | Integer getPage() | setPage(Integer page) |
| `PerPage` | `Integer` | Optional | - | Integer getPerPage() | setPerPage(Integer perPage) |
| `TotalPages` | `Integer` | Optional | - | Integer getTotalPages() | setTotalPages(Integer totalPages) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.AppliedCreditNoteData;
import com.maxio.advancedbilling.models.ApplyCreditNoteEvent;
import com.maxio.advancedbilling.models.ApplyCreditNoteEventData;
import com.maxio.advancedbilling.models.Invoice;
import com.maxio.advancedbilling.models.InvoiceEventType;
import com.maxio.advancedbilling.models.ListInvoiceEventsResponse;
import com.maxio.advancedbilling.models.containers.InvoiceEvent;
import java.util.Arrays;

ListInvoiceEventsResponse listInvoiceEventsResponse = new ListInvoiceEventsResponse.Builder()
    .events(Arrays.asList(
        InvoiceEvent.fromApplyCreditNoteEvent(
            new ApplyCreditNoteEvent.Builder(
                214L,
                DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
                new Invoice.Builder()
                    .id(166L)
                    .uid("uid6")
                    .siteId(92)
                    .customerId(204)
                    .subscriptionId(20)
                    .build(),
                InvoiceEventType.APPLY_CREDIT_NOTE,
                new ApplyCreditNoteEventData.Builder(
                    "uid6",
                    "credit_note_number0",
                    "credit_note_uid0",
                    "original_amount0",
                    "applied_amount2"
                )
                .transactionTime(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
                .memo("memo0")
                .role("role0")
                .consolidatedInvoice(false)
                .appliedCreditNotes(Arrays.asList(
                        new AppliedCreditNoteData.Builder()
                            .uid("uid4")
                            .number("number8")
                            .build(),
                        new AppliedCreditNoteData.Builder()
                            .uid("uid4")
                            .number("number8")
                            .build(),
                        new AppliedCreditNoteData.Builder()
                            .uid("uid4")
                            .number("number8")
                            .build()
                    ))
                .build()
            )
            .build()
        ),
        InvoiceEvent.fromApplyCreditNoteEvent(
            new ApplyCreditNoteEvent.Builder(
                214L,
                DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
                new Invoice.Builder()
                    .id(166L)
                    .uid("uid6")
                    .siteId(92)
                    .customerId(204)
                    .subscriptionId(20)
                    .build(),
                InvoiceEventType.APPLY_CREDIT_NOTE,
                new ApplyCreditNoteEventData.Builder(
                    "uid6",
                    "credit_note_number0",
                    "credit_note_uid0",
                    "original_amount0",
                    "applied_amount2"
                )
                .transactionTime(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
                .memo("memo0")
                .role("role0")
                .consolidatedInvoice(false)
                .appliedCreditNotes(Arrays.asList(
                        new AppliedCreditNoteData.Builder()
                            .uid("uid4")
                            .number("number8")
                            .build(),
                        new AppliedCreditNoteData.Builder()
                            .uid("uid4")
                            .number("number8")
                            .build(),
                        new AppliedCreditNoteData.Builder()
                            .uid("uid4")
                            .number("number8")
                            .build()
                    ))
                .build()
            )
            .build()
        ),
        InvoiceEvent.fromApplyCreditNoteEvent(
            new ApplyCreditNoteEvent.Builder(
                214L,
                DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
                new Invoice.Builder()
                    .id(166L)
                    .uid("uid6")
                    .siteId(92)
                    .customerId(204)
                    .subscriptionId(20)
                    .build(),
                InvoiceEventType.APPLY_CREDIT_NOTE,
                new ApplyCreditNoteEventData.Builder(
                    "uid6",
                    "credit_note_number0",
                    "credit_note_uid0",
                    "original_amount0",
                    "applied_amount2"
                )
                .transactionTime(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
                .memo("memo0")
                .role("role0")
                .consolidatedInvoice(false)
                .appliedCreditNotes(Arrays.asList(
                        new AppliedCreditNoteData.Builder()
                            .uid("uid4")
                            .number("number8")
                            .build(),
                        new AppliedCreditNoteData.Builder()
                            .uid("uid4")
                            .number("number8")
                            .build(),
                        new AppliedCreditNoteData.Builder()
                            .uid("uid4")
                            .number("number8")
                            .build()
                    ))
                .build()
            )
            .build()
        )
    ))
    .page(28)
    .perPage(196)
    .totalPages(94)
    .build();
```

