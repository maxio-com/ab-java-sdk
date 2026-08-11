
# Proforma Invoice Issued

## Structure

`ProformaInvoiceIssued`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Required | - | String getUid() | setUid(String uid) |
| `Number` | `String` | Required | - | String getNumber() | setNumber(String number) |
| `Role` | `String` | Required | - | String getRole() | setRole(String role) |
| `DeliveryDate` | `LocalDate` | Required | - | LocalDate getDeliveryDate() | setDeliveryDate(LocalDate deliveryDate) |
| `CreatedAt` | `ZonedDateTime` | Required | - | ZonedDateTime getCreatedAt() | setCreatedAt(ZonedDateTime createdAt) |
| `DueAmount` | `String` | Required | - | String getDueAmount() | setDueAmount(String dueAmount) |
| `PaidAmount` | `String` | Required | - | String getPaidAmount() | setPaidAmount(String paidAmount) |
| `TaxAmount` | `String` | Required | - | String getTaxAmount() | setTaxAmount(String taxAmount) |
| `TotalAmount` | `String` | Required | - | String getTotalAmount() | setTotalAmount(String totalAmount) |
| `ProductName` | `String` | Required | - | String getProductName() | setProductName(String productName) |
| `LineItems` | [`List<InvoiceLineItemEventData>`](../../doc/models/invoice-line-item-event-data.md) | Required | - | List<InvoiceLineItemEventData> getLineItems() | setLineItems(List<InvoiceLineItemEventData> lineItems) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.InvoiceLineItemEventData;
import com.maxio.advancedbilling.models.ProformaInvoiceIssued;
import java.util.Arrays;

ProformaInvoiceIssued proformaInvoiceIssued = new ProformaInvoiceIssued.Builder(
    "uid6",
    "number4",
    "role0",
    DateTimeHelper.fromSimpleDate("2016-03-13"),
    DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
    "due_amount8",
    "paid_amount8",
    "tax_amount0",
    "total_amount2",
    "product_name2",
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

