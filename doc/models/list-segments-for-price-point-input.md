
# List Segments for Price Point Input

Input structure for the method ListSegmentsForPricePoint

## Structure

`ListSegmentsForPricePointInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ComponentId` | `String` | Required | ID or Handle for the Component | String getComponentId() | setComponentId(String componentId) |
| `PricePointId` | `String` | Required | ID or Handle for the Price Point belonging to the Component | String getPricePointId() | setPricePointId(String pricePointId) |
| `Page` | `Integer` | Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br><br>**Default**: `1`<br><br>**Constraints**: `>= 1` | Integer getPage() | setPage(Integer page) |
| `PerPage` | `Integer` | Optional | This parameter indicates how many records to fetch in each request. Default value is 30. The maximum allowed values is 200; any per_page value over 200 will be changed to 200.<br>Use in query `per_page=200`.<br><br>**Default**: `30`<br><br>**Constraints**: `<= 200` | Integer getPerPage() | setPerPage(Integer perPage) |
| `Filter` | [`ListSegmentsFilter`](../../doc/models/list-segments-filter.md) | Optional | Filter to use for List Segments for a Price Point operation | ListSegmentsFilter getFilter() | setFilter(ListSegmentsFilter filter) |

## Example

```java
import com.maxio.advancedbilling.models.ListSegmentsFilter;
import com.maxio.advancedbilling.models.ListSegmentsForPricePointInput;

ListSegmentsForPricePointInput listSegmentsForPricePointInput = new ListSegmentsForPricePointInput.Builder(
    "component_id8",
    "price_point_id8"
)
.page(1)
.perPage(50)
.filter(new ListSegmentsFilter.Builder()
        .segmentProperty1Value("EU")
        .segmentProperty2Value("segment_property_2_value2")
        .segmentProperty3Value("segment_property_3_value0")
        .segmentProperty4Value("segment_property_4_value4")
        .build())
.build();
```

