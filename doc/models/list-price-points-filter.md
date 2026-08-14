
# List Price Points Filter

## Structure

`ListPricePointsFilter`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DateField` | [`BasicDateField`](../../doc/models/basic-date-field.md) | Optional | The type of filter you would like to apply to your search. Use in query: `filter[date_field]=created_at`. | BasicDateField getDateField() | setDateField(BasicDateField dateField) |
| `StartDate` | `LocalDate` | Optional | The start date (format YYYY-MM-DD) with which to filter the date_field. Returns price points with a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date specified. | LocalDate getStartDate() | setStartDate(LocalDate startDate) |
| `EndDate` | `LocalDate` | Optional | The end date (format YYYY-MM-DD) with which to filter the date_field. Returns price points with a timestamp up to and including 11:59:59PM in your site’s time zone on the date specified. | LocalDate getEndDate() | setEndDate(LocalDate endDate) |
| `StartDatetime` | `ZonedDateTime` | Optional | The start date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field. Returns price points with a timestamp at or after exact time provided in query. You can specify timezone in query - otherwise your site's time zone will be used. If provided, this parameter will be used instead of start_date. | ZonedDateTime getStartDatetime() | setStartDatetime(ZonedDateTime startDatetime) |
| `EndDatetime` | `ZonedDateTime` | Optional | The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field. Returns price points with a timestamp at or before exact time provided in query. You can specify timezone in query - otherwise your site's time zone will be used. If provided, this parameter will be used instead of end_date. | ZonedDateTime getEndDatetime() | setEndDatetime(ZonedDateTime endDatetime) |
| `Type` | [`List<PricePointType>`](../../doc/models/price-point-type.md) | Optional | Allows fetching price points with matching type. Use in query: `filter[type]=custom,catalog`. | List<PricePointType> getType() | setType(List<PricePointType> type) |
| `Ids` | `List<Integer>` | Optional | Allows fetching price points with matching id based on provided values. Use in query: `filter[ids]=1,2,3`. | List<Integer> getIds() | setIds(List<Integer> ids) |
| `ArchivedAt` | [`IncludeNullOrNotNull`](../../doc/models/include-null-or-not-null.md) | Optional | Allows fetching price points only if archived_at is present or not. Use in query: `filter[archived_at]=not_null`. | IncludeNullOrNotNull getArchivedAt() | setArchivedAt(IncludeNullOrNotNull archivedAt) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.BasicDateField;
import com.maxio.advancedbilling.models.ListPricePointsFilter;
import com.maxio.advancedbilling.models.PricePointType;
import java.util.Arrays;

ListPricePointsFilter listPricePointsFilter = new ListPricePointsFilter.Builder()
    .dateField(BasicDateField.UPDATED_AT)
    .startDate(DateTimeHelper.fromSimpleDate("2011-12-17"))
    .endDate(DateTimeHelper.fromSimpleDate("2011-12-15"))
    .startDatetime(DateTimeHelper.fromRfc8601DateTime("2011-12-19T09:15:30+00:00"))
    .endDatetime(DateTimeHelper.fromRfc8601DateTime("2019-06-07T17:20:06Z"))
    .type(Arrays.asList(
        PricePointType.CATALOG,
        PricePointType.ENUM_DEFAULT,
        PricePointType.CUSTOM
    ))
    .ids(Arrays.asList(
        1,
        2,
        3
    ))
    .build();
```

