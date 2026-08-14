
# Invoice Issued

## Structure

`InvoiceIssued`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Required | - | String getUid() | setUid(String uid) |
| `Number` | `String` | Required | - | String getNumber() | setNumber(String number) |
| `Role` | `String` | Required | - | String getRole() | setRole(String role) |
| `DueDate` | `LocalDate` | Required | - | LocalDate getDueDate() | setDueDate(LocalDate dueDate) |
| `IssueDate` | `String` | Required | Invoice issue date. Can be an empty string if value is missing. | String getIssueDate() | setIssueDate(String issueDate) |
| `PaidDate` | `String` | Required | Paid date. Can be an empty string if value is missing. | String getPaidDate() | setPaidDate(String paidDate) |
| `DueAmount` | `String` | Required | - | String getDueAmount() | setDueAmount(String dueAmount) |
| `PaidAmount` | `String` | Required | - | String getPaidAmount() | setPaidAmount(String paidAmount) |
| `TaxAmount` | `String` | Required | - | String getTaxAmount() | setTaxAmount(String taxAmount) |
| `RefundAmount` | `String` | Required | - | String getRefundAmount() | setRefundAmount(String refundAmount) |
| `TotalAmount` | `String` | Required | - | String getTotalAmount() | setTotalAmount(String totalAmount) |
| `StatusAmount` | `String` | Required | - | String getStatusAmount() | setStatusAmount(String statusAmount) |
| `ProductName` | `String` | Required | - | String getProductName() | setProductName(String productName) |
| `ConsolidationLevel` | `String` | Required | - | String getConsolidationLevel() | setConsolidationLevel(String consolidationLevel) |
| `LineItems` | [`List<InvoiceLineItemEventData>`](../../doc/models/invoice-line-item-event-data.md) | Required | - | List<InvoiceLineItemEventData> getLineItems() | setLineItems(List<InvoiceLineItemEventData> lineItems) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.InvoiceIssued;
import com.maxio.advancedbilling.models.InvoiceLineItemEventData;
import java.util.Arrays;

InvoiceIssued invoiceIssued = new InvoiceIssued.Builder(
    "uid8",
    "number4",
    "role8",
    DateTimeHelper.fromSimpleDate("2016-03-13"),
    "issue_date4",
    "paid_date8",
    "due_amount0",
    "paid_amount0",
    "tax_amount8",
    "refund_amount6",
    "total_amount4",
    "status_amount8",
    "product_name4",
    "consolidation_level0",
    Arrays.asList(
        new InvoiceLineItemEventData.Builder()
            .uid("uid8")
            .title("title4")
            .description("description8")
            .quantity(102)
            .quantityDelta(204)
            .build()
    )
)
.build();
```

