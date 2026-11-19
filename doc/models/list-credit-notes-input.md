
# List Credit Notes Input

Input structure for the method ListCreditNotes

## Structure

`ListCreditNotesInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SubscriptionId` | `Integer` | Optional | The subscription's Advanced Billing id | Integer getSubscriptionId() | setSubscriptionId(Integer subscriptionId) |
| `DateField` | [`CreditNoteDateField`](../../doc/models/credit-note-date-field.md) | Optional | The type of filter you would like to apply to your search. Use in query `date_field=issue_date`. If a date range is provided without an explicit `date_field`, it defaults to `issue_date`. If only `start_datetime`/`end_datetime` are provided without an explicit `date_field`, it defaults to `created_at` instead. An unrecognized `date_field` is ignored rather than raising an error.<br><br>**Default**: `CreditNoteDateField.ISSUE_DATE` | CreditNoteDateField getDateField() | setDateField(CreditNoteDateField dateField) |
| `StartDate` | `String` | Optional | The start date (format YYYY-MM-DD) with which to filter the date_field. Returns credit notes with a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date specified. | String getStartDate() | setStartDate(String startDate) |
| `EndDate` | `String` | Optional | The end date (format YYYY-MM-DD) with which to filter the date_field. Returns credit notes with a timestamp up to and including 11:59:59PM in your site’s time zone on the date specified. | String getEndDate() | setEndDate(String endDate) |
| `StartDatetime` | `String` | Optional | The start date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field. Returns credit notes with a timestamp at or after exact time provided in query. If provided, this parameter will be used instead of start_date. If no timezone offset is included in the value, it is interpreted as UTC. Allowed to be used only along with date_field set to created_at or updated_at. | String getStartDatetime() | setStartDatetime(String startDatetime) |
| `EndDatetime` | `String` | Optional | The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field. Returns credit notes with a timestamp at or before exact time provided in query. If provided, this parameter will be used instead of end_date. If no timezone offset is included in the value, it is interpreted as UTC. Allowed to be used only along with date_field set to created_at or updated_at. | String getEndDatetime() | setEndDatetime(String endDatetime) |
| `Page` | `Integer` | Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br><br>**Default**: `1`<br><br>**Constraints**: `>= 1` | Integer getPage() | setPage(Integer page) |
| `PerPage` | `Integer` | Optional | This parameter indicates how many records to fetch in each request. Default value is 20. The maximum allowed values is 200; any per_page value over 200 will be changed to 200.<br>Use in query `per_page=200`.<br><br>**Default**: `20`<br><br>**Constraints**: `<= 200` | Integer getPerPage() | setPerPage(Integer perPage) |
| `Direction` | [`Direction`](../../doc/models/direction.md) | Optional | The sort direction of the returned credit notes, sorted by sequence_number.<br><br>**Default**: `Direction.DESC` | Direction getDirection() | setDirection(Direction direction) |
| `LineItems` | `Boolean` | Optional | Include line items data.<br><br>**Default**: `false` | Boolean getLineItems() | setLineItems(Boolean lineItems) |
| `Discounts` | `Boolean` | Optional | Include discounts data.<br><br>**Default**: `false` | Boolean getDiscounts() | setDiscounts(Boolean discounts) |
| `Taxes` | `Boolean` | Optional | Include taxes data.<br><br>**Default**: `false` | Boolean getTaxes() | setTaxes(Boolean taxes) |
| `Refunds` | `Boolean` | Optional | Include refunds data.<br><br>**Default**: `false` | Boolean getRefunds() | setRefunds(Boolean refunds) |
| `Applications` | `Boolean` | Optional | Include applications data.<br><br>**Default**: `false` | Boolean getApplications() | setApplications(Boolean applications) |

## Example

```java
import com.maxio.advancedbilling.models.CreditNoteDateField;
import com.maxio.advancedbilling.models.Direction;
import com.maxio.advancedbilling.models.ListCreditNotesInput;

ListCreditNotesInput listCreditNotesInput = new ListCreditNotesInput.Builder()
    .subscriptionId(222)
    .dateField(CreditNoteDateField.ISSUE_DATE)
    .startDate("start_date6")
    .endDate("end_date0")
    .startDatetime("start_datetime0")
    .endDatetime("end_datetime8")
    .page(1)
    .perPage(50)
    .direction(Direction.DESC)
    .lineItems(false)
    .discounts(false)
    .taxes(false)
    .refunds(false)
    .applications(false)
    .build();
```

