
# List Prepayments for Subscription Group Input

Input structure for the method ListPrepaymentsForSubscriptionGroup

## Structure

`ListPrepaymentsForSubscriptionGroupInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Required | The uid of the subscription group | String getUid() | setUid(String uid) |
| `Page` | `Integer` | Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br><br>**Default**: `1`<br><br>**Constraints**: `>= 1` | Integer getPage() | setPage(Integer page) |
| `PerPage` | `Integer` | Optional | This parameter indicates how many records to fetch in each request. Default value is 20. The maximum allowed values is 200; any per_page value over 200 will be changed to 200.<br>Use in query `per_page=200`.<br><br>**Default**: `20`<br><br>**Constraints**: `<= 200` | Integer getPerPage() | setPerPage(Integer perPage) |
| `Filter` | [`ListPrepaymentsFilter`](../../doc/models/list-prepayments-filter.md) | Optional | Filter to use for List Prepayments operations | ListPrepaymentsFilter getFilter() | setFilter(ListPrepaymentsFilter filter) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.ListPrepaymentDateField;
import com.maxio.advancedbilling.models.ListPrepaymentsFilter;
import com.maxio.advancedbilling.models.ListPrepaymentsForSubscriptionGroupInput;

ListPrepaymentsForSubscriptionGroupInput listPrepaymentsForSubscriptionGroupInput = new ListPrepaymentsForSubscriptionGroupInput.Builder(
    "uid0"
)
.page(1)
.perPage(50)
.filter(new ListPrepaymentsFilter.Builder()
        .dateField(ListPrepaymentDateField.CREATED_AT)
        .startDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
        .endDate(DateTimeHelper.fromSimpleDate("2024-01-31"))
        .build())
.build();
```

