
# List Proforma Invoices Input

Input structure for the method ListProformaInvoices

## Structure

`ListProformaInvoicesInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SubscriptionId` | `int` | Required | The Chargify id of the subscription. | int getSubscriptionId() | setSubscriptionId(int subscriptionId) |
| `StartDate` | `String` | Optional | The beginning date range for the invoice's Due Date, in the YYYY-MM-DD format. | String getStartDate() | setStartDate(String startDate) |
| `EndDate` | `String` | Optional | The ending date range for the invoice's Due Date, in the YYYY-MM-DD format. | String getEndDate() | setEndDate(String endDate) |
| `Status` | [`ProformaInvoiceStatus`](../../doc/models/proforma-invoice-status.md) | Optional | The current status of the invoice.  Allowed Values: draft, open, paid, pending, voided | ProformaInvoiceStatus getStatus() | setStatus(ProformaInvoiceStatus status) |
| `Page` | `Integer` | Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br><br>**Default**: `1`<br><br>**Constraints**: `>= 1` | Integer getPage() | setPage(Integer page) |
| `PerPage` | `Integer` | Optional | This parameter indicates how many records to fetch in each request. Default value is 20. The maximum allowed values is 200; any per_page value over 200 will be changed to 200.<br>Use in query `per_page=200`.<br><br>**Default**: `20`<br><br>**Constraints**: `<= 200` | Integer getPerPage() | setPerPage(Integer perPage) |
| `Direction` | [`Direction`](../../doc/models/direction.md) | Optional | The sort direction of the returned invoices.<br><br>**Default**: `Direction.DESC` | Direction getDirection() | setDirection(Direction direction) |
| `LineItems` | `Boolean` | Optional | Include line items data.<br><br>**Default**: `false` | Boolean getLineItems() | setLineItems(Boolean lineItems) |
| `Discounts` | `Boolean` | Optional | Include discounts data.<br><br>**Default**: `false` | Boolean getDiscounts() | setDiscounts(Boolean discounts) |
| `Taxes` | `Boolean` | Optional | Include taxes data.<br><br>**Default**: `false` | Boolean getTaxes() | setTaxes(Boolean taxes) |
| `Credits` | `Boolean` | Optional | Include credits data.<br><br>**Default**: `false` | Boolean getCredits() | setCredits(Boolean credits) |
| `Payments` | `Boolean` | Optional | Include payments data.<br><br>**Default**: `false` | Boolean getPayments() | setPayments(Boolean payments) |
| `CustomFields` | `Boolean` | Optional | Include custom fields data.<br><br>**Default**: `false` | Boolean getCustomFields() | setCustomFields(Boolean customFields) |

## Example

```java
import com.maxio.advancedbilling.models.Direction;
import com.maxio.advancedbilling.models.ListProformaInvoicesInput;
import com.maxio.advancedbilling.models.ProformaInvoiceStatus;

ListProformaInvoicesInput listProformaInvoicesInput = new ListProformaInvoicesInput.Builder(
    222
)
.startDate("start_date6")
.endDate("end_date0")
.status(ProformaInvoiceStatus.ARCHIVED)
.page(1)
.perPage(50)
.direction(Direction.DESC)
.lineItems(false)
.discounts(false)
.taxes(false)
.credits(false)
.payments(false)
.customFields(false)
.build();
```

