
# List Credit Notes Input

Input structure for the method ListCreditNotes

## Structure

`ListCreditNotesInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SubscriptionId` | `Integer` | Optional | The subscription's Advanced Billing id | Integer getSubscriptionId() | setSubscriptionId(Integer subscriptionId) |
| `Page` | `Integer` | Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br><br>**Default**: `1`<br><br>**Constraints**: `>= 1` | Integer getPage() | setPage(Integer page) |
| `PerPage` | `Integer` | Optional | This parameter indicates how many records to fetch in each request. Default value is 20. The maximum allowed values is 200; any per_page value over 200 will be changed to 200.<br>Use in query `per_page=200`.<br><br>**Default**: `20`<br><br>**Constraints**: `<= 200` | Integer getPerPage() | setPerPage(Integer perPage) |
| `LineItems` | `Boolean` | Optional | Include line items data<br><br>**Default**: `false` | Boolean getLineItems() | setLineItems(Boolean lineItems) |
| `Discounts` | `Boolean` | Optional | Include discounts data<br><br>**Default**: `false` | Boolean getDiscounts() | setDiscounts(Boolean discounts) |
| `Taxes` | `Boolean` | Optional | Include taxes data<br><br>**Default**: `false` | Boolean getTaxes() | setTaxes(Boolean taxes) |
| `Refunds` | `Boolean` | Optional | Include refunds data<br><br>**Default**: `false` | Boolean getRefunds() | setRefunds(Boolean refunds) |
| `Applications` | `Boolean` | Optional | Include applications data<br><br>**Default**: `false` | Boolean getApplications() | setApplications(Boolean applications) |

## Example

```java
import com.maxio.advancedbilling.models.ListCreditNotesInput;

ListCreditNotesInput listCreditNotesInput = new ListCreditNotesInput.Builder()
    .subscriptionId(222)
    .page(1)
    .perPage(50)
    .lineItems(false)
    .discounts(false)
    .taxes(false)
    .refunds(false)
    .applications(false)
    .build();
```

