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
* [Bulk Create Segments](../../doc/controllers/events-based-billing-segments.md#bulk-create-segments)
* [Bulk Update Segments](../../doc/controllers/events-based-billing-segments.md#bulk-update-segments)


# Create Segment

Creates a new segment for a component with a segmented metric. It allows you to specify properties to bill upon and prices for each Segment. You can only pass as many "property_values" as the related Metric has segmenting properties defined.

You may specify component and/or price point by using either the numeric ID or the `handle:gold` syntax.

## Custom Price Points

This endpoint changes segments on catalog price points only. If the price point is a subscription's custom price point, the request returns `422 Unprocessable Entity` with a `price_point` error such as "Segments on a subscription's custom price point can't be changed here. Set them with custom_price on the subscription or component endpoints.", and nothing is saved. To change a subscription's segment rates, send `custom_price.segments` to [Update Subscription](../../doc/controllers/subscriptions.md#update-subscription).

```java
SegmentResponse createSegment(
    final String componentId,
    final String pricePointId,
    final CreateSegmentRequest body)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `componentId` | `String` | Template, Required | ID or Handle for the Component |
| `pricePointId` | `String` | Template, Required | ID or Handle for the Price Point belonging to the Component |
| `body` | [`CreateSegmentRequest`](../../doc/models/create-segment-request.md) | Body, Optional | - |

## Response Type

**201**: Created

[`SegmentResponse`](../../doc/models/segment-response.md)

## Example Usage

```java
String componentId = "component_id8";
String pricePointId = "price_point_id8";
CreateSegmentRequest body = new CreateSegmentRequest.Builder(
    new CreateSegment.Builder(
        PricingScheme.VOLUME
    )
    .segmentProperty1Value(CreateSegmentSegmentProperty1Value.fromString(
            "France"
        ))
    .segmentProperty2Value(CreateSegmentSegmentProperty2Value.fromString(
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
} catch (EventBasedBillingSegmentWriteErrorResponseException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found | `ApiException` |
| 422 | Unprocessable Entity (WebDAV) | [`EventBasedBillingSegmentWriteErrorResponseException`](../../doc/models/event-based-billing-segment-write-error-response-exception.md) |


# List Segments for Price Point

Lists segments created for a given price point, in order of creation.

You can pass `page` and `per_page` parameters in order to access all of the segments. By default it will return `30` records. You can set `per_page` to `200` at most.

You may specify component and/or price point by using either the numeric ID or the `handle:gold` syntax.

## Subscription Segment Rates

This endpoint also returns the segments of a subscription's custom price point, including segment rates set through `custom_price.segments` on [Create Subscription](../../doc/controllers/subscriptions.md#create-subscription) or [Update Subscription](../../doc/controllers/subscriptions.md#update-subscription). Use the subscription component's `price_point_id`, available from [Read Subscription Component](../../doc/controllers/subscription-components.md#read-subscription-component).

```java
ListSegmentsResponse listSegmentsForPricePoint(
    final ListSegmentsForPricePointInput input)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `input` | [`ListSegmentsForPricePointInput`](../../doc/models/list-segments-for-price-point-input.md) | Required | Input structure for the method ListSegmentsForPricePoint |

## Response Type

**200**: OK

[`ListSegmentsResponse`](../../doc/models/list-segments-response.md)

## Example Usage

```java
ListSegmentsForPricePointInput listSegmentsForPricePointInput = new ListSegmentsForPricePointInput.Builder(
    "component_id8",
    "price_point_id8"
)
.page(1)
.perPage(50)
.filter(new ListSegmentsFilter.Builder()
        .segmentProperty1Value("EU")
        .build())
.currencyPrices(true)
.build();

try {
    ListSegmentsResponse result = eventsBasedBillingSegmentsController.listSegmentsForPricePoint(listSegmentsForPricePointInput);
    System.out.println(result);
} catch (EventBasedBillingListSegmentsErrorsException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found | `ApiException` |
| 422 | Unprocessable Entity (WebDAV) | [`EventBasedBillingListSegmentsErrorsException`](../../doc/models/event-based-billing-list-segments-errors-exception.md) |


# Update Segment

Updates a single segment for a component with a segmented metric. You can also update the pricing for the segment.

You can specify component and/or price point by using either the numeric ID or the `handle:gold` syntax.

## Custom Price Points

This endpoint changes segments on catalog price points only. If the segment belongs to a subscription's custom price point, or the `price_point_id` in the URL names one, the request returns `422 Unprocessable Entity` with a `price_point` error such as "Segments on a subscription's custom price point can't be changed here. Set them with custom_price on the subscription or component endpoints.", and nothing is saved. To change a subscription's segment rates, send `custom_price.segments` to [Update Subscription](../../doc/controllers/subscriptions.md#update-subscription).

```java
SegmentResponse updateSegment(
    final String componentId,
    final String pricePointId,
    final double id,
    final UpdateSegmentRequest body)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `componentId` | `String` | Template, Required | ID or Handle of the Component |
| `pricePointId` | `String` | Template, Required | ID or Handle of the Price Point belonging to the Component |
| `id` | `double` | Template, Required | The ID of the Segment |
| `body` | [`UpdateSegmentRequest`](../../doc/models/update-segment-request.md) | Body, Optional | - |

## Response Type

**200**: OK

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
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found | `ApiException` |
| 422 | Unprocessable Entity (WebDAV) | `ApiException` |


# Delete Segment

Deletes a segment with the specified ID.

You may specify component and/or price point by using either the numeric ID or the `handle:gold` syntax.

## Custom Price Points

This endpoint changes segments on catalog price points only. If the segment belongs to a subscription's custom price point, the request returns `422 Unprocessable Entity` with a `price_point` error such as "Segments on a subscription's custom price point can't be changed here. Set them with custom_price on the subscription or component endpoints.", and nothing is saved. The check uses the segment's own price point, whichever `price_point_id` the URL names. To change a subscription's segment rates, send `custom_price.segments` to [Update Subscription](../../doc/controllers/subscriptions.md#update-subscription).

```java
Void deleteSegment(
    final String componentId,
    final String pricePointId,
    final double id)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `componentId` | `String` | Template, Required | ID or Handle of the Component |
| `pricePointId` | `String` | Template, Required | ID or Handle of the Price Point belonging to the Component |
| `id` | `double` | Template, Required | The ID of the Segment |

## Response Type

**204**: No Content

`void`

## Example Usage

```java
String componentId = "component_id8";
String pricePointId = "price_point_id8";
double id = 60D;

try {
    eventsBasedBillingSegmentsController.deleteSegment(componentId, pricePointId, id);
} catch (SegmentPricePointErrorsErrorException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found | `ApiException` |
| 422 | Unprocessable Entity (WebDAV) | [`SegmentPricePointErrorsErrorException`](../../doc/models/segment-price-point-errors-error-exception.md) |


# Bulk Create Segments

Creates multiple segments in one request. The array of segments can contain up to `2000` records.

If any of the records contain an error the whole request would fail and none of the requested segments get created. The error response contains a message for only the one segment that failed validation, with the corresponding index in the array.

You may specify component and/or price point by using either the numeric ID or the `handle:gold` syntax.

## Custom Price Points

This endpoint changes segments on catalog price points only. If the price point is a subscription's custom price point, the request returns `422 Unprocessable Entity` with a `price_point` error such as "Segments on a subscription's custom price point can't be changed here. Set them with custom_price on the subscription or component endpoints.", and nothing is saved. To change a subscription's segment rates, send `custom_price.segments` to [Update Subscription](../../doc/controllers/subscriptions.md#update-subscription).

```java
ListSegmentsResponse bulkCreateSegments(
    final String componentId,
    final String pricePointId,
    final BulkCreateSegments body)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `componentId` | `String` | Template, Required | ID or Handle for the Component |
| `pricePointId` | `String` | Template, Required | ID or Handle for the Price Point belonging to the Component |
| `body` | [`BulkCreateSegments`](../../doc/models/bulk-create-segments.md) | Body, Optional | - |

## Response Type

**201**: Created

[`ListSegmentsResponse`](../../doc/models/list-segments-response.md)

## Example Usage

```java
String componentId = "component_id8";
String pricePointId = "price_point_id8";
try {
    ListSegmentsResponse result = eventsBasedBillingSegmentsController.bulkCreateSegments(componentId, pricePointId, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found | `ApiException` |
| 422 | Unprocessable Entity (WebDAV) | `ApiException` |


# Bulk Update Segments

Updates multiple segments in one request. The array of segments can contain up to `1000` records.

If any of the records contain an error the whole request would fail and none of the requested segments get updated. The error response contains a message for only the one segment that failed validation, with the corresponding index in the array.

You may specify component and/or price point by using either the numeric ID or the `handle:gold` syntax.

## Custom Price Points

This endpoint changes segments on catalog price points only. If the price point is a subscription's custom price point, the request returns `422 Unprocessable Entity` with a `price_point` error such as "Segments on a subscription's custom price point can't be changed here. Set them with custom_price on the subscription or component endpoints.", and nothing is saved. To change a subscription's segment rates, send `custom_price.segments` to [Update Subscription](../../doc/controllers/subscriptions.md#update-subscription).

```java
ListSegmentsResponse bulkUpdateSegments(
    final String componentId,
    final String pricePointId,
    final BulkUpdateSegments body)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `componentId` | `String` | Template, Required | ID or Handle for the Component |
| `pricePointId` | `String` | Template, Required | ID or Handle for the Price Point belonging to the Component |
| `body` | [`BulkUpdateSegments`](../../doc/models/bulk-update-segments.md) | Body, Optional | - |

## Response Type

**200**: OK

[`ListSegmentsResponse`](../../doc/models/list-segments-response.md)

## Example Usage

```java
String componentId = "component_id8";
String pricePointId = "price_point_id8";
try {
    ListSegmentsResponse result = eventsBasedBillingSegmentsController.bulkUpdateSegments(componentId, pricePointId, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found | `ApiException` |
| 422 | Unprocessable Entity (WebDAV) | `ApiException` |

