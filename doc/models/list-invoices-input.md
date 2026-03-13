
# List Invoices Input

Input structure for the method ListInvoices

## Structure

`ListInvoicesInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StartDate` | `String` | Optional | The start date (format YYYY-MM-DD) with which to filter the date_field. Returns invoices with a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date specified. | String getStartDate() | setStartDate(String startDate) |
| `EndDate` | `String` | Optional | The end date (format YYYY-MM-DD) with which to filter the date_field. Returns invoices with a timestamp up to and including 11:59:59PM in your site’s time zone on the date specified. | String getEndDate() | setEndDate(String endDate) |
| `Status` | [`InvoiceStatus`](../../doc/models/invoice-status.md) | Optional | The current status of the invoice.  Allowed Values: draft, open, paid, pending, voided | InvoiceStatus getStatus() | setStatus(InvoiceStatus status) |
| `SubscriptionId` | `Integer` | Optional | The subscription's ID. | Integer getSubscriptionId() | setSubscriptionId(Integer subscriptionId) |
| `SubscriptionGroupUid` | `String` | Optional | The UID of the subscription group you want to fetch consolidated invoices for. This will return a paginated list of consolidated invoices for the specified group. | String getSubscriptionGroupUid() | setSubscriptionGroupUid(String subscriptionGroupUid) |
| `ConsolidationLevel` | `String` | Optional | The consolidation level of the invoice. Allowed Values: none, parent, child or comma-separated lists of thereof, e.g. none,parent. | String getConsolidationLevel() | setConsolidationLevel(String consolidationLevel) |
| `Page` | `Integer` | Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br><br>**Default**: `1`<br><br>**Constraints**: `>= 1` | Integer getPage() | setPage(Integer page) |
| `PerPage` | `Integer` | Optional | This parameter indicates how many records to fetch in each request. Default value is 20. The maximum allowed values is 200; any per_page value over 200 will be changed to 200.<br>Use in query `per_page=200`.<br><br>**Default**: `20`<br><br>**Constraints**: `<= 200` | Integer getPerPage() | setPerPage(Integer perPage) |
| `Direction` | [`Direction`](../../doc/models/direction.md) | Optional | The sort direction of the returned invoices.<br><br>**Default**: `Direction.DESC` | Direction getDirection() | setDirection(Direction direction) |
| `LineItems` | `Boolean` | Optional | Include line items data<br><br>**Default**: `false` | Boolean getLineItems() | setLineItems(Boolean lineItems) |
| `Discounts` | `Boolean` | Optional | Include discounts data<br><br>**Default**: `false` | Boolean getDiscounts() | setDiscounts(Boolean discounts) |
| `Taxes` | `Boolean` | Optional | Include taxes data<br><br>**Default**: `false` | Boolean getTaxes() | setTaxes(Boolean taxes) |
| `Credits` | `Boolean` | Optional | Include credits data<br><br>**Default**: `false` | Boolean getCredits() | setCredits(Boolean credits) |
| `Payments` | `Boolean` | Optional | Include payments data<br><br>**Default**: `false` | Boolean getPayments() | setPayments(Boolean payments) |
| `CustomFields` | `Boolean` | Optional | Include custom fields data<br><br>**Default**: `false` | Boolean getCustomFields() | setCustomFields(Boolean customFields) |
| `Refunds` | `Boolean` | Optional | Include refunds data<br><br>**Default**: `false` | Boolean getRefunds() | setRefunds(Boolean refunds) |
| `DateField` | [`InvoiceDateField`](../../doc/models/invoice-date-field.md) | Optional | The type of filter you would like to apply to your search. Use in query `date_field=issue_date`.<br><br>**Default**: `InvoiceDateField.DUE_DATE` | InvoiceDateField getDateField() | setDateField(InvoiceDateField dateField) |
| `StartDatetime` | `String` | Optional | The start date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field. Returns invoices with a timestamp at or after exact time provided in query. You can specify timezone in query - otherwise your site's time zone will be used. If provided, this parameter will be used instead of start_date. Allowed to be used only along with date_field set to created_at or updated_at. | String getStartDatetime() | setStartDatetime(String startDatetime) |
| `EndDatetime` | `String` | Optional | The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field. Returns invoices with a timestamp at or before exact time provided in query. You can specify timezone in query - otherwise your site's time zone will be used. If provided, this parameter will be used instead of end_date. Allowed to be used only along with date_field set to created_at or updated_at. | String getEndDatetime() | setEndDatetime(String endDatetime) |
| `CustomerIds` | `List<Integer>` | Optional | Allows fetching invoices with matching customer id based on provided values. Use in query `customer_ids=1,2,3`. | List<Integer> getCustomerIds() | setCustomerIds(List<Integer> customerIds) |
| `Number` | `List<String>` | Optional | Allows fetching invoices with matching invoice number based on provided values. Use in query `number=1234,1235`. | List<String> getNumber() | setNumber(List<String> number) |
| `ProductIds` | `List<Integer>` | Optional | Allows fetching invoices with matching line items product ids based on provided values. Use in query `product_ids=23,34`. | List<Integer> getProductIds() | setProductIds(List<Integer> productIds) |
| `Sort` | [`InvoiceSortField`](../../doc/models/invoice-sort-field.md) | Optional | Allows specification of the order of the returned list. Use in query `sort=total_amount`.<br><br>**Default**: `InvoiceSortField.NUMBER` | InvoiceSortField getSort() | setSort(InvoiceSortField sort) |

## Example

```java
import com.maxio.advancedbilling.models.Direction;
import com.maxio.advancedbilling.models.InvoiceDateField;
import com.maxio.advancedbilling.models.InvoiceSortField;
import com.maxio.advancedbilling.models.InvoiceStatus;
import com.maxio.advancedbilling.models.ListInvoicesInput;
import java.util.Arrays;

ListInvoicesInput listInvoicesInput = new ListInvoicesInput.Builder()
    .startDate("start_date6")
    .endDate("end_date0")
    .status(InvoiceStatus.VOIDED)
    .subscriptionId(222)
    .subscriptionGroupUid("subscription_group_uid6")
    .consolidationLevel("consolidation_level8")
    .page(1)
    .perPage(50)
    .direction(Direction.DESC)
    .lineItems(false)
    .discounts(false)
    .taxes(false)
    .credits(false)
    .payments(false)
    .customFields(false)
    .refunds(false)
    .dateField(InvoiceDateField.ISSUE_DATE)
    .startDatetime("start_datetime0")
    .endDatetime("end_datetime8")
    .customerIds(Arrays.asList(
        1,
        2,
        3
    ))
    .number(Arrays.asList(
        "1234",
        "1235"
    ))
    .productIds(Arrays.asList(
        23,
        34
    ))
    .sort(InvoiceSortField.TOTAL_AMOUNT)
    .build();
```

