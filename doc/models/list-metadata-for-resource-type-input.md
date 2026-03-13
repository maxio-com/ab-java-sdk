
# List Metadata for Resource Type Input

Input structure for the method ListMetadataForResourceType

## Structure

`ListMetadataForResourceTypeInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ResourceType` | [`ResourceType`](../../doc/models/resource-type.md) | Required | The resource type to which the metafields belong. | ResourceType getResourceType() | setResourceType(ResourceType resourceType) |
| `Page` | `Integer` | Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br><br>**Default**: `1`<br><br>**Constraints**: `>= 1` | Integer getPage() | setPage(Integer page) |
| `PerPage` | `Integer` | Optional | This parameter indicates how many records to fetch in each request. Default value is 20. The maximum allowed values is 200; any per_page value over 200 will be changed to 200.<br>Use in query `per_page=200`.<br><br>**Default**: `20`<br><br>**Constraints**: `<= 200` | Integer getPerPage() | setPerPage(Integer perPage) |
| `DateField` | [`BasicDateField`](../../doc/models/basic-date-field.md) | Optional | The type of filter you would like to apply to your search. | BasicDateField getDateField() | setDateField(BasicDateField dateField) |
| `StartDate` | `LocalDate` | Optional | The start date (format YYYY-MM-DD) with which to filter the date_field. Returns metadata with a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date specified. | LocalDate getStartDate() | setStartDate(LocalDate startDate) |
| `EndDate` | `LocalDate` | Optional | The end date (format YYYY-MM-DD) with which to filter the date_field. Returns metadata with a timestamp up to and including 11:59:59PM in your site’s time zone on the date specified. | LocalDate getEndDate() | setEndDate(LocalDate endDate) |
| `StartDatetime` | `ZonedDateTime` | Optional | The start date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field. Returns metadata with a timestamp at or after exact time provided in query. You can specify timezone in query - otherwise your site's time zone will be used. If provided, this parameter will be used instead of start_date. | ZonedDateTime getStartDatetime() | setStartDatetime(ZonedDateTime startDatetime) |
| `EndDatetime` | `ZonedDateTime` | Optional | The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field. Returns metadata with a timestamp at or before exact time provided in query. You can specify timezone in query - otherwise your site's time zone will be used. If provided, this parameter will be used instead of end_date. | ZonedDateTime getEndDatetime() | setEndDatetime(ZonedDateTime endDatetime) |
| `WithDeleted` | `Boolean` | Optional | Allow to fetch deleted metadata. | Boolean getWithDeleted() | setWithDeleted(Boolean withDeleted) |
| `ResourceIds` | `List<Integer>` | Optional | Allow to fetch metadata for multiple records based on provided ids. Use in query: `resource_ids[]=122&resource_ids[]=123&resource_ids[]=124`.<br><br>**Constraints**: *Maximum Items*: `50` | List<Integer> getResourceIds() | setResourceIds(List<Integer> resourceIds) |
| `Direction` | [`SortingDirection`](../../doc/models/sorting-direction.md) | Optional | Controls the order in which results are returned.<br>Use in query `direction=asc`. | SortingDirection getDirection() | setDirection(SortingDirection direction) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.BasicDateField;
import com.maxio.advancedbilling.models.ListMetadataForResourceTypeInput;
import com.maxio.advancedbilling.models.ResourceType;
import com.maxio.advancedbilling.models.SortingDirection;
import java.util.Arrays;

ListMetadataForResourceTypeInput listMetadataForResourceTypeInput = new ListMetadataForResourceTypeInput.Builder(
    ResourceType.SUBSCRIPTIONS
)
.page(1)
.perPage(50)
.dateField(BasicDateField.UPDATED_AT)
.startDate(DateTimeHelper.fromSimpleDate("2016-03-13"))
.endDate(DateTimeHelper.fromSimpleDate("2016-03-13"))
.startDatetime(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
.endDatetime(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
.withDeleted(false)
.resourceIds(Arrays.asList(
        198,
        199
    ))
.direction(SortingDirection.ASC)
.build();
```

