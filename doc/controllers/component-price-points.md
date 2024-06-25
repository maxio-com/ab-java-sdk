# Component Price Points

```java
ComponentPricePointsController componentPricePointsController = client.getComponentPricePointsController();
```

## Class Name

`ComponentPricePointsController`

## Methods

* [Promote Component Price Point to Default](../../doc/controllers/component-price-points.md#promote-component-price-point-to-default)
* [Create Component Price Point](../../doc/controllers/component-price-points.md#create-component-price-point)
* [List Component Price Points](../../doc/controllers/component-price-points.md#list-component-price-points)
* [Bulk Create Component Price Points](../../doc/controllers/component-price-points.md#bulk-create-component-price-points)
* [Update Component Price Point](../../doc/controllers/component-price-points.md#update-component-price-point)
* [Read Component Price Point](../../doc/controllers/component-price-points.md#read-component-price-point)
* [Archive Component Price Point](../../doc/controllers/component-price-points.md#archive-component-price-point)
* [Unarchive Component Price Point](../../doc/controllers/component-price-points.md#unarchive-component-price-point)
* [Create Currency Prices](../../doc/controllers/component-price-points.md#create-currency-prices)
* [Update Currency Prices](../../doc/controllers/component-price-points.md#update-currency-prices)
* [List All Component Price Points](../../doc/controllers/component-price-points.md#list-all-component-price-points)


# Promote Component Price Point to Default

Sets a new default price point for the component. This new default will apply to all new subscriptions going forward - existing subscriptions will remain on their current price point.

See [Price Points Documentation](https://chargify.zendesk.com/hc/en-us/articles/4407755865883#price-points) for more information on price points and moving subscriptions between price points.

Note: Custom price points are not able to be set as the default for a component.

```java
ComponentResponse promoteComponentPricePointToDefault(
    final int componentId,
    final int pricePointId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `componentId` | `int` | Template, Required | The Chargify id of the component to which the price point belongs |
| `pricePointId` | `int` | Template, Required | The Chargify id of the price point |

## Response Type

[`ComponentResponse`](../../doc/models/component-response.md)

## Example Usage

```java
int componentId = 222;
int pricePointId = 10;

try {
    ComponentResponse result = componentPricePointsController.promoteComponentPricePointToDefault(componentId, pricePointId);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

## Example Response *(as JSON)*

```json
{
  "component": {
    "id": 292609,
    "name": "Text messages",
    "pricing_scheme": "stairstep",
    "unit_name": "text message",
    "unit_price": null,
    "product_family_id": 528484,
    "price_per_unit_in_cents": null,
    "kind": "metered_component",
    "archived": false,
    "taxable": false,
    "description": null,
    "created_at": "2019-08-02T05:54:53-04:00",
    "prices": [
      {
        "id": 47,
        "component_id": 292609,
        "starting_quantity": 1,
        "ending_quantity": null,
        "unit_price": "1.0",
        "price_point_id": 173,
        "formatted_unit_price": "$1.00"
      }
    ],
    "default_price_point_name": "Original"
  }
}
```


# Create Component Price Point

This endpoint can be used to create a new price point for an existing component.

```java
ComponentPricePointResponse createComponentPricePoint(
    final int componentId,
    final CreateComponentPricePointRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `componentId` | `int` | Template, Required | The Chargify id of the component |
| `body` | [`CreateComponentPricePointRequest`](../../doc/models/create-component-price-point-request.md) | Body, Optional | - |

## Response Type

[`ComponentPricePointResponse`](../../doc/models/component-price-point-response.md)

## Example Usage

```java
int componentId = 222;
CreateComponentPricePointRequest body = new CreateComponentPricePointRequest.Builder(
    CreateComponentPricePointRequestPricePoint.fromCreateComponentPricePoint(
        new CreateComponentPricePoint.Builder(
            "Wholesale",
            PricingScheme.STAIRSTEP,
            Arrays.asList(
                new Price.Builder(
                    PriceStartingQuantity.fromString(
                        "1"
                    ),
                    PriceUnitPrice.fromString(
                        "5.00"
                    )
                )
                .endingQuantity(PriceEndingQuantity.fromString(
                        "100"
                    ))
                .build(),
                new Price.Builder(
                    PriceStartingQuantity.fromString(
                        "101"
                    ),
                    PriceUnitPrice.fromString(
                        "4.00"
                    )
                )
                .build()
            )
        )
        .handle("wholesale-handle")
        .useSiteExchangeRate(false)
        .build()
    )
)
.build();

try {
    ComponentPricePointResponse result = componentPricePointsController.createComponentPricePoint(componentId, body);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# List Component Price Points

Use this endpoint to read current price points that are associated with a component.

You may specify the component by using either the numeric id or the `handle:gold` syntax.

When fetching a component's price points, if you have defined multiple currencies at the site level, you can optionally pass the `?currency_prices=true` query param to include an array of currency price data in the response.

If the price point is set to `use_site_exchange_rate: true`, it will return pricing based on the current exchange rate. If the flag is set to false, it will return all of the defined prices for each currency.

```java
ComponentPricePointsResponse listComponentPricePoints(
    final ListComponentPricePointsInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `componentId` | `int` | Template, Required | The Chargify id of the component |
| `currencyPrices` | `Boolean` | Query, Optional | Include an array of currency price data |
| `page` | `Integer` | Query, Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`. |
| `perPage` | `Integer` | Query, Optional | This parameter indicates how many records to fetch in each request. Default value is 20. The maximum allowed values is 200; any per_page value over 200 will be changed to 200.<br>Use in query `per_page=200`. |
| `filterType` | [`List<PricePointType>`](../../doc/models/price-point-type.md) | Query, Optional | Use in query: `filter[type]=catalog,default`. |

## Response Type

[`ComponentPricePointsResponse`](../../doc/models/component-price-points-response.md)

## Example Usage

```java
ListComponentPricePointsInput listComponentPricePointsInput = new ListComponentPricePointsInput.Builder(
    222
)
.page(2)
.perPage(50)
Liquid error: Value cannot be null. (Parameter 'key').build();

try {
    ComponentPricePointsResponse result = componentPricePointsController.listComponentPricePoints(listComponentPricePointsInput);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

## Example Response *(as JSON)*

```json
{
  "price_points": [
    {
      "id": 80,
      "default": false,
      "name": "Wholesale Two",
      "pricing_scheme": "per_unit",
      "component_id": 74,
      "handle": "wholesale-two",
      "archived_at": null,
      "created_at": "2017-07-05T13:55:40-04:00",
      "updated_at": "2017-07-05T13:55:40-04:00",
      "prices": [
        {
          "id": 121,
          "component_id": 74,
          "starting_quantity": 1,
          "ending_quantity": null,
          "unit_price": "5.0"
        }
      ]
    },
    {
      "id": 81,
      "default": false,
      "name": "MSRP",
      "pricing_scheme": "per_unit",
      "component_id": 74,
      "handle": "msrp",
      "archived_at": null,
      "created_at": "2017-07-05T13:55:40-04:00",
      "updated_at": "2017-07-05T13:55:40-04:00",
      "prices": [
        {
          "id": 122,
          "component_id": 74,
          "starting_quantity": 1,
          "ending_quantity": null,
          "unit_price": "4.0"
        }
      ]
    }
  ]
}
```


# Bulk Create Component Price Points

Use this endpoint to create multiple component price points in one request.

```java
ComponentPricePointsResponse bulkCreateComponentPricePoints(
    final String componentId,
    final CreateComponentPricePointsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `componentId` | `String` | Template, Required | The Chargify id of the component for which you want to fetch price points. |
| `body` | [`CreateComponentPricePointsRequest`](../../doc/models/create-component-price-points-request.md) | Body, Optional | - |

## Response Type

[`ComponentPricePointsResponse`](../../doc/models/component-price-points-response.md)

## Example Usage

```java
String componentId = "component_id8";
CreateComponentPricePointsRequest body = new CreateComponentPricePointsRequest.Builder(
    Arrays.asList(
        CreateComponentPricePointsRequestPricePoints.fromCreateComponentPricePoint(
            new CreateComponentPricePoint.Builder(
                "Wholesale",
                PricingScheme.PER_UNIT,
                Arrays.asList(
                    new Price.Builder(
                        PriceStartingQuantity.fromNumber(
                            1
                        ),
                        PriceUnitPrice.fromPrecision(
                            5D
                        )
                    )
                    .build()
                )
            )
            .handle("wholesale")
            .build()
        ),
        CreateComponentPricePointsRequestPricePoints.fromCreateComponentPricePoint(
            new CreateComponentPricePoint.Builder(
                "MSRP",
                PricingScheme.PER_UNIT,
                Arrays.asList(
                    new Price.Builder(
                        PriceStartingQuantity.fromNumber(
                            1
                        ),
                        PriceUnitPrice.fromPrecision(
                            4D
                        )
                    )
                    .build()
                )
            )
            .handle("msrp")
            .build()
        ),
        CreateComponentPricePointsRequestPricePoints.fromCreateComponentPricePoint(
            new CreateComponentPricePoint.Builder(
                "Special Pricing",
                PricingScheme.PER_UNIT,
                Arrays.asList(
                    new Price.Builder(
                        PriceStartingQuantity.fromNumber(
                            1
                        ),
                        PriceUnitPrice.fromPrecision(
                            5D
                        )
                    )
                    .build()
                )
            )
            .handle("special")
            .build()
        )
    )
)
.build();

try {
    ComponentPricePointsResponse result = componentPricePointsController.bulkCreateComponentPricePoints(componentId, body);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

## Example Response *(as JSON)*

```json
{
  "price_points": [
    {
      "id": 80,
      "default": false,
      "name": "Wholesale Two",
      "pricing_scheme": "per_unit",
      "component_id": 74,
      "handle": "wholesale-two",
      "archived_at": null,
      "created_at": "2017-07-05T13:55:40-04:00",
      "updated_at": "2017-07-05T13:55:40-04:00",
      "prices": [
        {
          "id": 121,
          "component_id": 74,
          "starting_quantity": 1,
          "ending_quantity": null,
          "unit_price": "5.0"
        }
      ]
    },
    {
      "id": 81,
      "default": false,
      "name": "MSRP",
      "pricing_scheme": "per_unit",
      "component_id": 74,
      "handle": "msrp",
      "archived_at": null,
      "created_at": "2017-07-05T13:55:40-04:00",
      "updated_at": "2017-07-05T13:55:40-04:00",
      "prices": [
        {
          "id": 122,
          "component_id": 74,
          "starting_quantity": 1,
          "ending_quantity": null,
          "unit_price": "4.0"
        }
      ]
    }
  ]
}
```


# Update Component Price Point

When updating a price point, it's prices can be updated as well by creating new prices or editing / removing existing ones.

Passing in a price bracket without an `id` will attempt to create a new price.

Including an `id` will update the corresponding price, and including the `_destroy` flag set to true along with the `id` will remove that price.

Note: Custom price points cannot be updated directly. They must be edited through the Subscription.

```java
ComponentPricePointResponse updateComponentPricePoint(
    final UpdateComponentPricePointComponentId componentId,
    final UpdateComponentPricePointPricePointId pricePointId,
    final UpdateComponentPricePointRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `componentId` | [`UpdateComponentPricePointComponentId`](../../doc/models/containers/update-component-price-point-component-id.md) | Template, Required | This is a container for one-of cases. |
| `pricePointId` | [`UpdateComponentPricePointPricePointId`](../../doc/models/containers/update-component-price-point-price-point-id.md) | Template, Required | This is a container for one-of cases. |
| `body` | [`UpdateComponentPricePointRequest`](../../doc/models/update-component-price-point-request.md) | Body, Optional | - |

## Response Type

[`ComponentPricePointResponse`](../../doc/models/component-price-point-response.md)

## Example Usage

```java
UpdateComponentPricePointComponentId componentId = UpdateComponentPricePointComponentId.fromNumber(
    144
);
UpdateComponentPricePointPricePointId pricePointId = UpdateComponentPricePointPricePointId.fromNumber(
    188
);
UpdateComponentPricePointRequest body = new UpdateComponentPricePointRequest.Builder()
    .pricePoint(new UpdateComponentPricePoint.Builder()
        .name("Default")
        .prices(Arrays.asList(
            new UpdatePrice.Builder()
                .id(1)
                .endingQuantity(UpdatePriceEndingQuantity.fromNumber(
                    100
                ))
                .unitPrice(UpdatePriceUnitPrice.fromPrecision(
                    5D
                ))
                .build(),
            new UpdatePrice.Builder()
                .id(2)
                .destroy(true)
                .build(),
            new UpdatePrice.Builder()
                .unitPrice(UpdatePriceUnitPrice.fromPrecision(
                    4D
                ))
                .startingQuantity(UpdatePriceStartingQuantity.fromNumber(
                    101
                ))
                .build()
        ))
        .build())
    .build();

try {
    ComponentPricePointResponse result = componentPricePointsController.updateComponentPricePoint(componentId, pricePointId, body);
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
| 422 | Unprocessable Entity (WebDAV) | [`ErrorArrayMapResponseException`](../../doc/models/error-array-map-response-exception.md) |


# Read Component Price Point

Use this endpoint to retrieve details for a specific component price point. You can achieve this by using either the component price point ID or handle.

```java
ComponentPricePointResponse readComponentPricePoint(
    final ReadComponentPricePointComponentId componentId,
    final ReadComponentPricePointPricePointId pricePointId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `componentId` | [`ReadComponentPricePointComponentId`](../../doc/models/containers/read-component-price-point-component-id.md) | Template, Required | This is a container for one-of cases. |
| `pricePointId` | [`ReadComponentPricePointPricePointId`](../../doc/models/containers/read-component-price-point-price-point-id.md) | Template, Required | This is a container for one-of cases. |

## Response Type

[`ComponentPricePointResponse`](../../doc/models/component-price-point-response.md)

## Example Usage

```java
ReadComponentPricePointComponentId componentId = ReadComponentPricePointComponentId.fromNumber(
    144
);
ReadComponentPricePointPricePointId pricePointId = ReadComponentPricePointPricePointId.fromNumber(
    188
);

try {
    ComponentPricePointResponse result = componentPricePointsController.readComponentPricePoint(componentId, pricePointId);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Archive Component Price Point

A price point can be archived at any time. Subscriptions using a price point that has been archived will continue using it until they're moved to another price point.

```java
ComponentPricePointResponse archiveComponentPricePoint(
    final ArchiveComponentPricePointComponentId componentId,
    final ArchiveComponentPricePointPricePointId pricePointId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `componentId` | [`ArchiveComponentPricePointComponentId`](../../doc/models/containers/archive-component-price-point-component-id.md) | Template, Required | This is a container for one-of cases. |
| `pricePointId` | [`ArchiveComponentPricePointPricePointId`](../../doc/models/containers/archive-component-price-point-price-point-id.md) | Template, Required | This is a container for one-of cases. |

## Response Type

[`ComponentPricePointResponse`](../../doc/models/component-price-point-response.md)

## Example Usage

```java
ArchiveComponentPricePointComponentId componentId = ArchiveComponentPricePointComponentId.fromNumber(
    144
);
ArchiveComponentPricePointPricePointId pricePointId = ArchiveComponentPricePointPricePointId.fromNumber(
    188
);

try {
    ComponentPricePointResponse result = componentPricePointsController.archiveComponentPricePoint(componentId, pricePointId);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

## Example Response *(as JSON)*

```json
{
  "price_point": {
    "id": 79,
    "default": false,
    "name": "Wholesale",
    "pricing_scheme": "stairstep",
    "component_id": 74,
    "handle": "wholesale-handle",
    "archived_at": "2017-07-06T15:04:00-04:00",
    "created_at": "2017-07-05T13:44:30-04:00",
    "updated_at": "2017-07-05T13:44:30-04:00",
    "prices": [
      {
        "id": 119,
        "component_id": 74,
        "starting_quantity": 1,
        "ending_quantity": 100,
        "unit_price": "5.0"
      },
      {
        "id": 120,
        "component_id": 74,
        "starting_quantity": 101,
        "ending_quantity": null,
        "unit_price": "4.0"
      }
    ]
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Unprocessable Entity (WebDAV) | [`ErrorListResponseException`](../../doc/models/error-list-response-exception.md) |


# Unarchive Component Price Point

Use this endpoint to unarchive a component price point.

```java
ComponentPricePointResponse unarchiveComponentPricePoint(
    final int componentId,
    final int pricePointId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `componentId` | `int` | Template, Required | The Chargify id of the component to which the price point belongs |
| `pricePointId` | `int` | Template, Required | The Chargify id of the price point |

## Response Type

[`ComponentPricePointResponse`](../../doc/models/component-price-point-response.md)

## Example Usage

```java
int componentId = 222;
int pricePointId = 10;

try {
    ComponentPricePointResponse result = componentPricePointsController.unarchiveComponentPricePoint(componentId, pricePointId);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

## Example Response *(as JSON)*

```json
{
  "price_point": {
    "id": 79,
    "default": false,
    "name": "Wholesale",
    "pricing_scheme": "stairstep",
    "component_id": 74,
    "handle": "wholesale-handle",
    "archived_at": null,
    "created_at": "2017-07-05T13:44:30-04:00",
    "updated_at": "2017-07-05T13:44:30-04:00",
    "prices": [
      {
        "id": 119,
        "component_id": 74,
        "starting_quantity": 1,
        "ending_quantity": 100,
        "unit_price": "5.0"
      },
      {
        "id": 120,
        "component_id": 74,
        "starting_quantity": 101,
        "ending_quantity": null,
        "unit_price": "4.0"
      }
    ]
  }
}
```


# Create Currency Prices

This endpoint allows you to create currency prices for a given currency that has been defined on the site level in your settings.

When creating currency prices, they need to mirror the structure of your primary pricing. For each price level defined on the component price point, there should be a matching price level created in the given currency.

Note: Currency Prices are not able to be created for custom price points.

```java
ComponentCurrencyPricesResponse createCurrencyPrices(
    final int pricePointId,
    final CreateCurrencyPricesRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `pricePointId` | `int` | Template, Required | The Chargify id of the price point |
| `body` | [`CreateCurrencyPricesRequest`](../../doc/models/create-currency-prices-request.md) | Body, Optional | - |

## Response Type

[`ComponentCurrencyPricesResponse`](../../doc/models/component-currency-prices-response.md)

## Example Usage

```java
int pricePointId = 10;
CreateCurrencyPricesRequest body = new CreateCurrencyPricesRequest.Builder(
    Arrays.asList(
        new CreateCurrencyPrice.Builder()
            .currency("EUR")
            .price(50D)
            .priceId(20)
            .build(),
        new CreateCurrencyPrice.Builder()
            .currency("EUR")
            .price(40D)
            .priceId(21)
            .build()
    )
)
.build();

try {
    ComponentCurrencyPricesResponse result = componentPricePointsController.createCurrencyPrices(pricePointId, body);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

## Example Response *(as JSON)*

```json
{
  "currency_prices": [
    {
      "id": 100,
      "currency": "EUR",
      "price": "123",
      "formatted_price": "€123,00",
      "price_id": 32669,
      "price_point_id": 25554
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Unprocessable Entity (WebDAV) | [`ErrorArrayMapResponseException`](../../doc/models/error-array-map-response-exception.md) |


# Update Currency Prices

This endpoint allows you to update currency prices for a given currency that has been defined on the site level in your settings.

Note: Currency Prices are not able to be updated for custom price points.

```java
ComponentCurrencyPricesResponse updateCurrencyPrices(
    final int pricePointId,
    final UpdateCurrencyPricesRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `pricePointId` | `int` | Template, Required | The Chargify id of the price point |
| `body` | [`UpdateCurrencyPricesRequest`](../../doc/models/update-currency-prices-request.md) | Body, Optional | - |

## Response Type

[`ComponentCurrencyPricesResponse`](../../doc/models/component-currency-prices-response.md)

## Example Usage

```java
int pricePointId = 10;
UpdateCurrencyPricesRequest body = new UpdateCurrencyPricesRequest.Builder(
    Arrays.asList(
        new UpdateCurrencyPrice.Builder(
            100,
            51
        )
        .build(),
        new UpdateCurrencyPrice.Builder(
            101,
            41
        )
        .build()
    )
)
.build();

try {
    ComponentCurrencyPricesResponse result = componentPricePointsController.updateCurrencyPrices(pricePointId, body);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

## Example Response *(as JSON)*

```json
{
  "currency_prices": [
    {
      "id": 100,
      "currency": "EUR",
      "price": "123",
      "formatted_price": "€123,00",
      "price_id": 32669,
      "price_point_id": 25554
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Unprocessable Entity (WebDAV) | [`ErrorArrayMapResponseException`](../../doc/models/error-array-map-response-exception.md) |


# List All Component Price Points

This method allows to retrieve a list of Components Price Points belonging to a Site.

```java
ListComponentsPricePointsResponse listAllComponentPricePoints(
    final ListAllComponentPricePointsInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `include` | [`ListComponentsPricePointsInclude`](../../doc/models/list-components-price-points-include.md) | Query, Optional | Allows including additional data in the response. Use in query: `include=currency_prices`. |
| `page` | `Integer` | Query, Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`. |
| `perPage` | `Integer` | Query, Optional | This parameter indicates how many records to fetch in each request. Default value is 20. The maximum allowed values is 200; any per_page value over 200 will be changed to 200.<br>Use in query `per_page=200`. |
| `direction` | [`SortingDirection`](../../doc/models/sorting-direction.md) | Query, Optional | Controls the order in which results are returned.<br>Use in query `direction=asc`. |
| `filter` | [`ListPricePointsFilter`](../../doc/models/list-price-points-filter.md) | Query, Optional | Filter to use for List PricePoints operations |

## Response Type

[`ListComponentsPricePointsResponse`](../../doc/models/list-components-price-points-response.md)

## Example Usage

```java
ListAllComponentPricePointsInput listAllComponentPricePointsInput = new ListAllComponentPricePointsInput.Builder()
    .include(ListComponentsPricePointsInclude.CURRENCY_PRICES)
    .page(2)
    .perPage(50)
    .filter(new ListPricePointsFilter.Builder()
        .startDate(DateTimeHelper.fromSimpleDate("2011-12-17"))
        .endDate(DateTimeHelper.fromSimpleDate("2011-12-15"))
        .startDatetime(DateTimeHelper.fromRfc8601DateTime("12/19/2011 09:15:30"))
        .endDatetime(DateTimeHelper.fromRfc8601DateTime("06/07/2019 17:20:06"))
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
        .build())
    .build();

try {
    ListComponentsPricePointsResponse result = componentPricePointsController.listAllComponentPricePoints(listAllComponentPricePointsInput);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

## Example Response *(as JSON)*

```json
{
  "price_points": [
    {
      "id": 1,
      "name": "Auto-created",
      "type": "default",
      "pricing_scheme": "per_unit",
      "component_id": 2,
      "handle": "auto-created",
      "archived_at": null,
      "created_at": "2021-02-21T11:05:57-05:00",
      "updated_at": "2021-02-21T11:05:57-05:00",
      "prices": [
        {
          "id": 3,
          "component_id": 2,
          "starting_quantity": 0,
          "ending_quantity": null,
          "unit_price": "1.0",
          "price_point_id": 1,
          "formatted_unit_price": "$1.00",
          "segment_id": null
        }
      ],
      "tax_included": false
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Unprocessable Entity (WebDAV) | [`ErrorListResponseException`](../../doc/models/error-list-response-exception.md) |

