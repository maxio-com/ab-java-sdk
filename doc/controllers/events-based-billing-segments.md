# Events-Based Billing Segments

```java
EventsBasedBillingSegmentsController eventsBasedBillingSegmentsController = client.getEventsBasedBillingSegmentsController();
```

## Class Name

`EventsBasedBillingSegmentsController`

## Methods

* [Create Segment](../../doc/controllers/events-based-billing-segments.md#create-segment)
* [List Segments for Price Point](../../doc/controllers/events-based-billing-segments.md#list-segments-for-price-point)
* [Update Segment](../../doc/controllers/events-based-billing-segments.md#update-segment)
* [Delete Segment](../../doc/controllers/events-based-billing-segments.md#delete-segment)
* [Create Segments](../../doc/controllers/events-based-billing-segments.md#create-segments)
* [Update Segments](../../doc/controllers/events-based-billing-segments.md#update-segments)


# Create Segment

This endpoint creates a new Segment for a Component with segmented Metric. It allows you to specify properties to bill upon and prices for each Segment. You can only pass as many "property_values" as the related Metric has segmenting properties defined.

You may specify component and/or price point by using either the numeric ID or the `handle:gold` syntax.

```java
SegmentResponse createSegment(
    final String componentId,
    final String pricePointId,
    final CreateSegmentRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `componentId` | `String` | Template, Required | ID or Handle for the Component |
| `pricePointId` | `String` | Template, Required | ID or Handle for the Price Point belonging to the Component |
| `body` | [`CreateSegmentRequest`](../../doc/models/create-segment-request.md) | Body, Optional | - |

## Response Type

[`SegmentResponse`](../../doc/models/segment-response.md)

## Example Usage

```java
String componentId = "component_id8";
String pricePointId = "price_point_id8";
CreateSegmentRequest body = new CreateSegmentRequest.Builder(
    new CreateSegment.Builder(
        "volume"
    )
    .segmentProperty1Value(CreateSegmentSegmentProperty1Value.fromMString(
            "France"
        ))
    .segmentProperty2Value(CreateSegmentSegmentProperty2Value.fromMString(
            "Spain"
        ))
    .prices(Arrays.asList(
            new CreateOrUpdateSegmentPrice.Builder(
                CreateOrUpdateSegmentPriceUnitPrice.fromPrecision(
                    0.19D
                )
            )
            .startingQuantity(1)
            .endingQuantity(10000)
            .build(),
            new CreateOrUpdateSegmentPrice.Builder(
                CreateOrUpdateSegmentPriceUnitPrice.fromPrecision(
                    0.09D
                )
            )
            .startingQuantity(10001)
            .build()
        ))
    .build()
)
.build();

try {
    SegmentResponse result = eventsBasedBillingSegmentsController.createSegment(componentId, pricePointId, body);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized | `ApiException` |
| 403 | Forbidden | `ApiException` |
| 404 | Not Found | `ApiException` |
| 422 | Unprocessable Entity (WebDAV) | [`EventBasedBillingSegmentErrorsException`](../../doc/models/event-based-billing-segment-errors-exception.md) |


# List Segments for Price Point

This endpoint allows you to fetch Segments created for a given Price Point. They will be returned in the order of creation.

You can pass `page` and `per_page` parameters in order to access all of the segments. By default it will return `30` records. You can set `per_page` to `200` at most.

You may specify component and/or price point by using either the numeric ID or the `handle:gold` syntax.

```java
ListSegmentsResponse listSegmentsForPricePoint(
    final ListSegmentsForPricePointInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `componentId` | `String` | Template, Required | ID or Handle for the Component |
| `pricePointId` | `String` | Template, Required | ID or Handle for the Price Point belonging to the Component |
| `page` | `Integer` | Query, Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br>**Default**: `1`<br>**Constraints**: `>= 1` |
| `perPage` | `Integer` | Query, Optional | This parameter indicates how many records to fetch in each request. Default value is 30. The maximum allowed values is 200; any per_page value over 200 will be changed to 200.<br>Use in query `per_page=200`.<br>**Default**: `30`<br>**Constraints**: `<= 200` |
| `filterSegmentProperty1Value` | `String` | Query, Optional | The value passed here would be used to filter segments. Pass a value related to `segment_property_1` on attached Metric. If empty string is passed, this filter would be rejected. Use in query `filter[segment_property_1_value]=EU`. |
| `filterSegmentProperty2Value` | `String` | Query, Optional | The value passed here would be used to filter segments. Pass a value related to `segment_property_2` on attached Metric. If empty string is passed, this filter would be rejected. |
| `filterSegmentProperty3Value` | `String` | Query, Optional | The value passed here would be used to filter segments. Pass a value related to `segment_property_3` on attached Metric. If empty string is passed, this filter would be rejected. |
| `filterSegmentProperty4Value` | `String` | Query, Optional | The value passed here would be used to filter segments. Pass a value related to `segment_property_4` on attached Metric. If empty string is passed, this filter would be rejected. |

## Response Type

[`ListSegmentsResponse`](../../doc/models/list-segments-response.md)

## Example Usage

```java
ListSegmentsForPricePointInput listSegmentsForPricePointInput = new ListSegmentsForPricePointInput.Builder(
    "component_id8",
    "price_point_id8"
)
.page(2)
.perPage(50)
Liquid error: Value cannot be null. (Parameter 'key')Liquid error: Value cannot be null. (Parameter 'key')Liquid error: Value cannot be null. (Parameter 'key')Liquid error: Value cannot be null. (Parameter 'key').build();

try {
    ListSegmentsResponse result = eventsBasedBillingSegmentsController.listSegmentsForPricePoint(listSegmentsForPricePointInput);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized | `ApiException` |
| 403 | Forbidden | `ApiException` |
| 404 | Not Found | `ApiException` |
| 422 | Unprocessable Entity (WebDAV) | [`EventBasedBillingListSegmentsErrorsException`](../../doc/models/event-based-billing-list-segments-errors-exception.md) |


# Update Segment

This endpoint updates a single Segment for a Component with a segmented Metric. It allows you to update the pricing for the segment.

You may specify component and/or price point by using either the numeric ID or the `handle:gold` syntax.

```java
SegmentResponse updateSegment(
    final String componentId,
    final String pricePointId,
    final double id,
    final UpdateSegmentRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `componentId` | `String` | Template, Required | ID or Handle of the Component |
| `pricePointId` | `String` | Template, Required | ID or Handle of the Price Point belonging to the Component |
| `id` | `double` | Template, Required | The ID of the Segment |
| `body` | [`UpdateSegmentRequest`](../../doc/models/update-segment-request.md) | Body, Optional | - |

## Response Type

[`SegmentResponse`](../../doc/models/segment-response.md)

## Example Usage

```java
String componentId = "component_id8";
String pricePointId = "price_point_id8";
double id = 60D;
try {
    SegmentResponse result = eventsBasedBillingSegmentsController.updateSegment(componentId, pricePointId, id, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized | `ApiException` |
| 403 | Forbidden | `ApiException` |
| 404 | Not Found | `ApiException` |
| 422 | Unprocessable Entity (WebDAV) | [`EventBasedBillingSegmentErrorsException`](../../doc/models/event-based-billing-segment-errors-exception.md) |


# Delete Segment

This endpoint allows you to delete a Segment with specified ID.

You may specify component and/or price point by using either the numeric ID or the `handle:gold` syntax.

```java
Void deleteSegment(
    final String componentId,
    final String pricePointId,
    final double id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `componentId` | `String` | Template, Required | ID or Handle of the Component |
| `pricePointId` | `String` | Template, Required | ID or Handle of the Price Point belonging to the Component |
| `id` | `double` | Template, Required | The ID of the Segment |

## Response Type

`void`

## Example Usage

```java
String componentId = "component_id8";
String pricePointId = "price_point_id8";
double id = 60D;

try {
    eventsBasedBillingSegmentsController.deleteSegment(componentId, pricePointId, id);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized | `ApiException` |
| 403 | Forbidden | `ApiException` |
| 404 | Not Found | `ApiException` |
| 422 | Unprocessable Entity (WebDAV) | `ApiException` |


# Create Segments

This endpoint allows you to create multiple segments in one request. The array of segments can contain up to `2000` records.

If any of the records contain an error the whole request would fail and none of the requested segments get created. The error response contains a message for only the one segment that failed validation, with the corresponding index in the array.

You may specify component and/or price point by using either the numeric ID or the `handle:gold` syntax.

```java
ListSegmentsResponse createSegments(
    final String componentId,
    final String pricePointId,
    final BulkCreateSegments body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `componentId` | `String` | Template, Required | ID or Handle for the Component |
| `pricePointId` | `String` | Template, Required | ID or Handle for the Price Point belonging to the Component |
| `body` | [`BulkCreateSegments`](../../doc/models/bulk-create-segments.md) | Body, Optional | - |

## Response Type

[`ListSegmentsResponse`](../../doc/models/list-segments-response.md)

## Example Usage

```java
String componentId = "component_id8";
String pricePointId = "price_point_id8";
try {
    ListSegmentsResponse result = eventsBasedBillingSegmentsController.createSegments(componentId, pricePointId, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized | `ApiException` |
| 403 | Forbidden | `ApiException` |
| 404 | Not Found | `ApiException` |
| 422 | Unprocessable Entity (WebDAV) | [`EventBasedBillingSegmentException`](../../doc/models/event-based-billing-segment-exception.md) |


# Update Segments

This endpoint allows you to update multiple segments in one request. The array of segments can contain up to `1000` records.

If any of the records contain an error the whole request would fail and none of the requested segments get updated. The error response contains a message for only the one segment that failed validation, with the corresponding index in the array.

You may specify component and/or price point by using either the numeric ID or the `handle:gold` syntax.

```java
ListSegmentsResponse updateSegments(
    final String componentId,
    final String pricePointId,
    final BulkUpdateSegments body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `componentId` | `String` | Template, Required | ID or Handle for the Component |
| `pricePointId` | `String` | Template, Required | ID or Handle for the Price Point belonging to the Component |
| `body` | [`BulkUpdateSegments`](../../doc/models/bulk-update-segments.md) | Body, Optional | - |

## Response Type

[`ListSegmentsResponse`](../../doc/models/list-segments-response.md)

## Example Usage

```java
String componentId = "component_id8";
String pricePointId = "price_point_id8";
try {
    ListSegmentsResponse result = eventsBasedBillingSegmentsController.updateSegments(componentId, pricePointId, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized | `ApiException` |
| 403 | Forbidden | `ApiException` |
| 404 | Not Found | `ApiException` |
| 422 | Unprocessable Entity (WebDAV) | [`EventBasedBillingSegmentException`](../../doc/models/event-based-billing-segment-exception.md) |

