
# List Customers Input

Input structure for the method ListCustomers

## Structure

`ListCustomersInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Direction` | [`SortingDirection`](../../doc/models/sorting-direction.md) | Optional | Direction to sort customers by time of creation | SortingDirection getDirection() | setDirection(SortingDirection direction) |
| `Page` | `Integer` | Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br><br>**Default**: `1`<br><br>**Constraints**: `>= 1` | Integer getPage() | setPage(Integer page) |
| `PerPage` | `Integer` | Optional | This parameter indicates how many records to fetch in each request. Default value is 50. The maximum allowed values is 200; any per_page value over 200 will be changed to 200.<br>Use in query `per_page=200`.<br><br>**Default**: `50`<br><br>**Constraints**: `<= 200` | Integer getPerPage() | setPerPage(Integer perPage) |
| `DateField` | [`BasicDateField`](../../doc/models/basic-date-field.md) | Optional | The type of filter you would like to apply to your search.<br>Use in query: `date_field=created_at`. | BasicDateField getDateField() | setDateField(BasicDateField dateField) |
| `StartDate` | `String` | Optional | The start date (format YYYY-MM-DD) with which to filter the date_field. Returns subscriptions with a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date specified. | String getStartDate() | setStartDate(String startDate) |
| `EndDate` | `String` | Optional | The end date (format YYYY-MM-DD) with which to filter the date_field. Returns subscriptions with a timestamp up to and including 11:59:59PM in your site’s time zone on the date specified. | String getEndDate() | setEndDate(String endDate) |
| `StartDatetime` | `String` | Optional | The start date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field. Returns subscriptions with a timestamp at or after exact time provided in query. You can specify timezone in query - otherwise your site's time zone will be used. If provided, this parameter will be used instead of start_date. | String getStartDatetime() | setStartDatetime(String startDatetime) |
| `EndDatetime` | `String` | Optional | The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field. Returns subscriptions with a timestamp at or before exact time provided in query. You can specify timezone in query - otherwise your site's time zone will be used. If provided, this parameter will be used instead of end_date. | String getEndDatetime() | setEndDatetime(String endDatetime) |
| `Q` | `String` | Optional | A search query by which to filter customers (can be an email, an ID, a reference, organization) | String getQ() | setQ(String q) |

## Example

```java
import com.maxio.advancedbilling.models.BasicDateField;
import com.maxio.advancedbilling.models.ListCustomersInput;
import com.maxio.advancedbilling.models.SortingDirection;

ListCustomersInput listCustomersInput = new ListCustomersInput.Builder()
    .direction(SortingDirection.ASC)
    .page(1)
    .perPage(30)
    .dateField(BasicDateField.UPDATED_AT)
    .startDate("start_date6")
    .endDate("end_date0")
    .startDatetime("start_datetime0")
    .endDatetime("end_datetime8")
    .q("q0")
    .build();
```

