
# List Coupons Filter

## Structure

`ListCouponsFilter`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DateField` | [`BasicDateField`](../../doc/models/basic-date-field.md) | Optional | The type of filter you would like to apply to your search. Use in query `filter[date_field]=created_at`. | BasicDateField getDateField() | setDateField(BasicDateField dateField) |
| `StartDate` | `LocalDate` | Optional | The start date (format YYYY-MM-DD) with which to filter the date_field. Returns coupons with a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date specified. Use in query `filter[start_date]=2011-12-17`. | LocalDate getStartDate() | setStartDate(LocalDate startDate) |
| `EndDate` | `LocalDate` | Optional | The end date (format YYYY-MM-DD) with which to filter the date_field. Returns coupons with a timestamp up to and including 11:59:59PM in your site’s time zone on the date specified. Use in query `filter[end_date]=2011-12-15`. | LocalDate getEndDate() | setEndDate(LocalDate endDate) |
| `StartDatetime` | `ZonedDateTime` | Optional | The start date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field. Returns coupons with a timestamp at or after exact time provided in query. You can specify timezone in query - otherwise your site's time zone will be used. If provided, this parameter will be used instead of start_date. Use in query `filter[start_datetime]=2011-12-19T10:15:30+01:00`. | ZonedDateTime getStartDatetime() | setStartDatetime(ZonedDateTime startDatetime) |
| `EndDatetime` | `ZonedDateTime` | Optional | The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field. Returns coupons with a timestamp at or before exact time provided in query. You can specify timezone in query - otherwise your site's time zone will be used. If provided, this parameter will be used instead of end_date. Use in query `filter[end_datetime]=2011-12-1T10:15:30+01:00`. | ZonedDateTime getEndDatetime() | setEndDatetime(ZonedDateTime endDatetime) |
| `Ids` | `List<Integer>` | Optional | Allows fetching coupons with matching id based on provided values. Use in query `filter[ids]=1,2,3`.<br><br>**Constraints**: *Minimum Items*: `1` | List<Integer> getIds() | setIds(List<Integer> ids) |
| `Codes` | `List<String>` | Optional | Allows fetching coupons with matching codes based on provided values. Use in query `filter[codes]=free,free_trial`. | List<String> getCodes() | setCodes(List<String> codes) |
| `UseSiteExchangeRate` | `Boolean` | Optional | If true, restricts the list to coupons whose pricing is recalculated from the site’s current exchange rates, so their currency_prices array contains on-the-fly conversions rather than stored price records. If false, restricts the list to coupons that have manually defined amounts for each currency, ensuring the response includes the saved currency_prices entries instead of exchange-rate-derived values. Use in query `filter[use_site_exchange_rate]=true`. | Boolean getUseSiteExchangeRate() | setUseSiteExchangeRate(Boolean useSiteExchangeRate) |
| `IncludeArchived` | `Boolean` | Optional | Controls returning archived coupons. | Boolean getIncludeArchived() | setIncludeArchived(Boolean includeArchived) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.BasicDateField;
import com.maxio.advancedbilling.models.ListCouponsFilter;
import java.util.Arrays;

ListCouponsFilter listCouponsFilter = new ListCouponsFilter.Builder()
    .dateField(BasicDateField.UPDATED_AT)
    .startDate(DateTimeHelper.fromSimpleDate("2011-12-17"))
    .endDate(DateTimeHelper.fromSimpleDate("2011-12-15"))
    .startDatetime(DateTimeHelper.fromRfc8601DateTime("2011-12-19T09:15:30+00:00"))
    .endDatetime(DateTimeHelper.fromRfc8601DateTime("2019-06-07T17:20:06Z"))
    .ids(Arrays.asList(
        1,
        2,
        3
    ))
    .codes(Arrays.asList(
        "free",
        "free_trial"
    ))
    .build();
```

