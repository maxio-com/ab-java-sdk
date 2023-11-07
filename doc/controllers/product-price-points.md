# Product Price Points

```java
ProductPricePointsController productPricePointsController = client.getProductPricePointsController();
```

## Class Name

`ProductPricePointsController`

## Methods

* [Create Product Price Point](../../doc/controllers/product-price-points.md#create-product-price-point)
* [List Product Price Points](../../doc/controllers/product-price-points.md#list-product-price-points)
* [Update Product Price Point](../../doc/controllers/product-price-points.md#update-product-price-point)
* [Read Product Price Point](../../doc/controllers/product-price-points.md#read-product-price-point)
* [Archive Product Price Point](../../doc/controllers/product-price-points.md#archive-product-price-point)
* [Unarchive Product Price Point](../../doc/controllers/product-price-points.md#unarchive-product-price-point)
* [Set Default Price Point for Product](../../doc/controllers/product-price-points.md#set-default-price-point-for-product)
* [Create Product Price Points](../../doc/controllers/product-price-points.md#create-product-price-points)
* [Create Product Currency Prices](../../doc/controllers/product-price-points.md#create-product-currency-prices)
* [Update Product Currency Prices](../../doc/controllers/product-price-points.md#update-product-currency-prices)
* [List All Product Price Points](../../doc/controllers/product-price-points.md#list-all-product-price-points)


# Create Product Price Point

[Product Price Point Documentation](https://chargify.zendesk.com/hc/en-us/articles/4407755824155)

```java
ProductPricePointResponse createProductPricePoint(
    final int productId,
    final CreateProductPricePointRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `productId` | `int` | Template, Required | The id or handle of the product. When using the handle, it must be prefixed with `handle:` |
| `body` | [`CreateProductPricePointRequest`](../../doc/models/create-product-price-point-request.md) | Body, Optional | - |

## Response Type

[`ProductPricePointResponse`](../../doc/models/product-price-point-response.md)

## Example Usage

```java
int productId = 202;
CreateProductPricePointRequest body = new CreateProductPricePointRequest.Builder(
    new CreateProductPricePoint.Builder(
        "Educational",
        1000,
        1,
        "month"
    )
    .handle("educational")
    .trialPriceInCents(4900)
    .trialInterval(1)
    .trialIntervalUnit("month")
    .trialType("payment_expected")
    .initialChargeInCents(120000)
    .initialChargeAfterTrial(false)
    .expirationInterval(12)
    .expirationIntervalUnit("month")
    .build()
)
.build();

try {
    ProductPricePointResponse result = productPricePointsController.createProductPricePoint(productId, body);
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
    "id": 283,
    "name": "Educational",
    "handle": "educational",
    "price_in_cents": 1000,
    "interval": 1,
    "interval_unit": "month",
    "trial_price_in_cents": 4900,
    "trial_interval": 1,
    "trial_interval_unit": "month",
    "trial_type": "payment_expected",
    "initial_charge_in_cents": 120000,
    "initial_charge_after_trial": false,
    "expiration_interval": 12,
    "expiration_interval_unit": "month",
    "product_id": 901,
    "archived_at": "Tue, 30 Oct 2018 18:49:47 EDT -04:00",
    "created_at": "Tue, 23 Oct 2018 18:49:47 EDT -04:00",
    "updated_at": "Tue, 23 Oct 2018 18:49:47 EDT -04:00"
  }
}
```


# List Product Price Points

Use this endpoint to retrieve a list of product price points.

```java
ListProductPricePointsResponse listProductPricePoints(
    final ListProductPricePointsInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `productId` | `int` | Template, Required | The id or handle of the product. When using the handle, it must be prefixed with `handle:` |
| `page` | `Integer` | Query, Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br>**Default**: `1`<br>**Constraints**: `>= 1` |
| `perPage` | `Integer` | Query, Optional | This parameter indicates how many records to fetch in each request. Default value is 10. The maximum allowed values is 200; any per_page value over 200 will be changed to 200.<br>**Default**: `10`<br>**Constraints**: `<= 200` |
| `currencyPrices` | `Boolean` | Query, Optional | When fetching a product's price points, if you have defined multiple currencies at the site level, you can optionally pass the ?currency_prices=true query param to include an array of currency price data in the response. If the product price point is set to use_site_exchange_rate: true, it will return pricing based on the current exchange rate. If the flag is set to false, it will return all of the defined prices for each currency. |
| `filterType` | [`List<PricePointType>`](../../doc/models/price-point-type.md) | Query, Optional | Use in query: `filter[type]=catalog,default`. |

## Response Type

[`ListProductPricePointsResponse`](../../doc/models/list-product-price-points-response.md)

## Example Usage

```java
ListProductPricePointsInput listProductPricePointsInput = new ListProductPricePointsInput.Builder(
    202
)
.page(2)
.perPage(10)
Liquid error: Value cannot be null. (Parameter 'key').build();

try {
    ListProductPricePointsResponse result = productPricePointsController.listProductPricePoints(listProductPricePointsInput);
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
      "id": 283,
      "name": "Educational",
      "handle": "educational",
      "price_in_cents": 1000,
      "interval": 1,
      "interval_unit": "month",
      "trial_price_in_cents": 4900,
      "trial_interval": 1,
      "trial_interval_unit": "month",
      "trial_type": "payment_expected",
      "initial_charge_in_cents": 120000,
      "initial_charge_after_trial": false,
      "expiration_interval": 12,
      "expiration_interval_unit": "month",
      "product_id": 901,
      "archived_at": "Tue, 30 Oct 2018 18:49:47 EDT -04:00",
      "created_at": "Tue, 23 Oct 2018 18:49:47 EDT -04:00",
      "updated_at": "Tue, 23 Oct 2018 18:49:47 EDT -04:00"
    }
  ]
}
```


# Update Product Price Point

Use this endpoint to update a product price point.

Note: Custom product price points are not able to be updated.

```java
ProductPricePointResponse updateProductPricePoint(
    final int productId,
    final int pricePointId,
    final UpdateProductPricePointRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `productId` | `int` | Template, Required | The id or handle of the product. When using the handle, it must be prefixed with `handle:` |
| `pricePointId` | `int` | Template, Required | The id or handle of the price point. When using the handle, it must be prefixed with `handle:` |
| `body` | [`UpdateProductPricePointRequest`](../../doc/models/update-product-price-point-request.md) | Body, Optional | - |

## Response Type

[`ProductPricePointResponse`](../../doc/models/product-price-point-response.md)

## Example Usage

```java
int productId = 202;
int pricePointId = 10;
UpdateProductPricePointRequest body = new UpdateProductPricePointRequest.Builder(
    new UpdateProductPricePoint.Builder()
        .handle("educational")
        .priceInCents(1250)
        .build()
)
.build();

try {
    ProductPricePointResponse result = productPricePointsController.updateProductPricePoint(productId, pricePointId, body);
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
    "id": 283,
    "name": "Educational",
    "handle": "educational",
    "price_in_cents": 1000,
    "interval": 1,
    "interval_unit": "month",
    "trial_price_in_cents": 4900,
    "trial_interval": 1,
    "trial_interval_unit": "month",
    "trial_type": "payment_expected",
    "initial_charge_in_cents": 120000,
    "initial_charge_after_trial": false,
    "expiration_interval": 12,
    "expiration_interval_unit": "month",
    "product_id": 901,
    "archived_at": "Tue, 30 Oct 2018 18:49:47 EDT -04:00",
    "created_at": "Tue, 23 Oct 2018 18:49:47 EDT -04:00",
    "updated_at": "Tue, 23 Oct 2018 18:49:47 EDT -04:00"
  }
}
```


# Read Product Price Point

Use this endpoint to retrieve details for a specific product price point.

```java
ProductPricePointResponse readProductPricePoint(
    final int productId,
    final int pricePointId,
    final Boolean currencyPrices)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `productId` | `int` | Template, Required | The id or handle of the product. When using the handle, it must be prefixed with `handle:` |
| `pricePointId` | `int` | Template, Required | The id or handle of the price point. When using the handle, it must be prefixed with `handle:` |
| `currencyPrices` | `Boolean` | Query, Optional | When fetching a product's price points, if you have defined multiple currencies at the site level, you can optionally pass the ?currency_prices=true query param to include an array of currency price data in the response. If the product price point is set to use_site_exchange_rate: true, it will return pricing based on the current exchange rate. If the flag is set to false, it will return all of the defined prices for each currency. |

## Response Type

[`ProductPricePointResponse`](../../doc/models/product-price-point-response.md)

## Example Usage

```java
int productId = 202;
int pricePointId = 10;

try {
    ProductPricePointResponse result = productPricePointsController.readProductPricePoint(productId, pricePointId, null);
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
    "id": 283,
    "name": "Educational",
    "handle": "educational",
    "price_in_cents": 1000,
    "interval": 1,
    "interval_unit": "month",
    "trial_price_in_cents": 4900,
    "trial_interval": 1,
    "trial_interval_unit": "month",
    "trial_type": "payment_expected",
    "initial_charge_in_cents": 120000,
    "initial_charge_after_trial": false,
    "expiration_interval": 12,
    "expiration_interval_unit": "month",
    "product_id": 901,
    "archived_at": "Tue, 30 Oct 2018 18:49:47 EDT -04:00",
    "created_at": "Tue, 23 Oct 2018 18:49:47 EDT -04:00",
    "updated_at": "Tue, 23 Oct 2018 18:49:47 EDT -04:00"
  }
}
```


# Archive Product Price Point

Use this endpoint to archive a product price point.

```java
ProductPricePointResponse archiveProductPricePoint(
    final int productId,
    final int pricePointId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `productId` | `int` | Template, Required | The id or handle of the product. When using the handle, it must be prefixed with `handle:` |
| `pricePointId` | `int` | Template, Required | The id or handle of the price point. When using the handle, it must be prefixed with `handle:` |

## Response Type

[`ProductPricePointResponse`](../../doc/models/product-price-point-response.md)

## Example Usage

```java
int productId = 202;
int pricePointId = 10;

try {
    ProductPricePointResponse result = productPricePointsController.archiveProductPricePoint(productId, pricePointId);
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
    "id": 283,
    "name": "Educational",
    "handle": "educational",
    "price_in_cents": 1000,
    "interval": 1,
    "interval_unit": "month",
    "trial_price_in_cents": 4900,
    "trial_interval": 1,
    "trial_interval_unit": "month",
    "trial_type": "payment_expected",
    "initial_charge_in_cents": 120000,
    "initial_charge_after_trial": false,
    "expiration_interval": 12,
    "expiration_interval_unit": "month",
    "product_id": 901,
    "archived_at": "Tue, 30 Oct 2018 18:49:47 EDT -04:00",
    "created_at": "Tue, 23 Oct 2018 18:49:47 EDT -04:00",
    "updated_at": "Tue, 23 Oct 2018 18:49:47 EDT -04:00"
  }
}
```


# Unarchive Product Price Point

Use this endpoint to unarchive an archived product price point.

```java
ProductPricePointResponse unarchiveProductPricePoint(
    final int productId,
    final int pricePointId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `productId` | `int` | Template, Required | The Chargify id of the product to which the price point belongs |
| `pricePointId` | `int` | Template, Required | The Chargify id of the product price point |

## Response Type

[`ProductPricePointResponse`](../../doc/models/product-price-point-response.md)

## Example Usage

```java
int productId = 202;
int pricePointId = 10;

try {
    ProductPricePointResponse result = productPricePointsController.unarchiveProductPricePoint(productId, pricePointId);
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
    "id": 283,
    "name": "Educational",
    "handle": "educational",
    "price_in_cents": 1000,
    "interval": 1,
    "interval_unit": "month",
    "trial_price_in_cents": 4900,
    "trial_interval": 1,
    "trial_interval_unit": "month",
    "trial_type": "payment_expected",
    "initial_charge_in_cents": 120000,
    "initial_charge_after_trial": false,
    "expiration_interval": 12,
    "expiration_interval_unit": "month",
    "product_id": 901,
    "archived_at": "Tue, 30 Oct 2018 18:49:47 EDT -04:00",
    "created_at": "Tue, 23 Oct 2018 18:49:47 EDT -04:00",
    "updated_at": "Tue, 23 Oct 2018 18:49:47 EDT -04:00"
  }
}
```


# Set Default Price Point for Product

Use this endpoint to make a product price point the default for the product.

Note: Custom product price points are not able to be set as the default for a product.

```java
ProductPricePointResponse setDefaultPricePointForProduct(
    final int productId,
    final int pricePointId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `productId` | `int` | Template, Required | The Chargify id of the product to which the price point belongs |
| `pricePointId` | `int` | Template, Required | The Chargify id of the product price point |

## Response Type

[`ProductPricePointResponse`](../../doc/models/product-price-point-response.md)

## Example Usage

```java
int productId = 202;
int pricePointId = 10;

try {
    ProductPricePointResponse result = productPricePointsController.setDefaultPricePointForProduct(productId, pricePointId);
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
    "id": 283,
    "name": "Educational",
    "handle": "educational",
    "price_in_cents": 1000,
    "interval": 1,
    "interval_unit": "month",
    "trial_price_in_cents": 4900,
    "trial_interval": 1,
    "trial_interval_unit": "month",
    "trial_type": "payment_expected",
    "initial_charge_in_cents": 120000,
    "initial_charge_after_trial": false,
    "expiration_interval": 12,
    "expiration_interval_unit": "month",
    "product_id": 901,
    "archived_at": "Tue, 30 Oct 2018 18:49:47 EDT -04:00",
    "created_at": "Tue, 23 Oct 2018 18:49:47 EDT -04:00",
    "updated_at": "Tue, 23 Oct 2018 18:49:47 EDT -04:00"
  }
}
```


# Create Product Price Points

Use this endpoint to create multiple product price points in one request.

```java
BulkCreateProductPricePointsResponse createProductPricePoints(
    final int productId,
    final BulkCreateProductPricePointsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `productId` | `int` | Template, Required | The Chargify id of the product to which the price points belong |
| `body` | [`BulkCreateProductPricePointsRequest`](../../doc/models/bulk-create-product-price-points-request.md) | Body, Optional | - |

## Response Type

[`BulkCreateProductPricePointsResponse`](../../doc/models/bulk-create-product-price-points-response.md)

## Example Usage

```java
int productId = 202;
BulkCreateProductPricePointsRequest body = new BulkCreateProductPricePointsRequest.Builder(
    Arrays.asList(
        new CreateProductPricePoint.Builder(
            "Educational",
            1000,
            1,
            "month"
        )
        .handle("educational")
        .trialPriceInCents(4900)
        .trialInterval(1)
        .trialIntervalUnit("month")
        .trialType("payment_expected")
        .initialChargeInCents(120000)
        .initialChargeAfterTrial(false)
        .expirationInterval(12)
        .expirationIntervalUnit("month")
        .build(),
        new CreateProductPricePoint.Builder(
            "More Educational",
            2000,
            1,
            "month"
        )
        .handle("more-educational")
        .trialPriceInCents(4900)
        .trialInterval(1)
        .trialIntervalUnit("month")
        .trialType("payment_expected")
        .initialChargeInCents(120000)
        .initialChargeAfterTrial(false)
        .expirationInterval(12)
        .expirationIntervalUnit("month")
        .build()
    )
)
.build();

try {
    BulkCreateProductPricePointsResponse result = productPricePointsController.createProductPricePoints(productId, body);
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
      "id": 283,
      "name": "Educational",
      "handle": "educational",
      "price_in_cents": 1000,
      "interval": 1,
      "interval_unit": "month",
      "trial_price_in_cents": 4900,
      "trial_interval": 1,
      "trial_interval_unit": "month",
      "trial_type": "payment_expected",
      "initial_charge_in_cents": 120000,
      "initial_charge_after_trial": false,
      "expiration_interval": 12,
      "expiration_interval_unit": "month",
      "product_id": 901,
      "archived_at": "Tue, 30 Oct 2018 18:49:47 EDT -04:00",
      "created_at": "Tue, 23 Oct 2018 18:49:47 EDT -04:00",
      "updated_at": "Tue, 23 Oct 2018 18:49:47 EDT -04:00"
    }
  ]
}
```


# Create Product Currency Prices

This endpoint allows you to create currency prices for a given currency that has been defined on the site level in your settings.

When creating currency prices, they need to mirror the structure of your primary pricing. If the product price point defines a trial and/or setup fee, each currency must also define a trial and/or setup fee.

Note: Currency Prices are not able to be created for custom product price points.

```java
ProductPricePointCurrencyPrice createProductCurrencyPrices(
    final int productPricePointId,
    final CreateProductCurrencyPricesRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `productPricePointId` | `int` | Template, Required | The Chargify id of the product price point |
| `body` | [`CreateProductCurrencyPricesRequest`](../../doc/models/create-product-currency-prices-request.md) | Body, Optional | - |

## Response Type

[`ProductPricePointCurrencyPrice`](../../doc/models/product-price-point-currency-price.md)

## Example Usage

```java
int productPricePointId = 234;
CreateProductCurrencyPricesRequest body = new CreateProductCurrencyPricesRequest.Builder(
    Arrays.asList(
        new CreateProductCurrencyPrice.Builder(
            "EUR",
            60,
            CurrencyPriceRole.BASELINE
        )
        .build(),
        new CreateProductCurrencyPrice.Builder(
            "EUR",
            30,
            CurrencyPriceRole.TRIAL
        )
        .build(),
        new CreateProductCurrencyPrice.Builder(
            "EUR",
            100,
            CurrencyPriceRole.INITIAL
        )
        .build()
    )
)
.build();

try {
    ProductPricePointCurrencyPrice result = productPricePointsController.createProductCurrencyPrices(productPricePointId, body);
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
| 422 | Unprocessable Entity (WebDAV) | [`ErrorMapResponseException`](../../doc/models/error-map-response-exception.md) |


# Update Product Currency Prices

This endpoint allows you to update the `price`s of currency prices for a given currency that exists on the product price point.

When updating the pricing, it needs to mirror the structure of your primary pricing. If the product price point defines a trial and/or setup fee, each currency must also define a trial and/or setup fee.

Note: Currency Prices are not able to be updated for custom product price points.

```java
List<ProductPricePointCurrencyPrice> updateProductCurrencyPrices(
    final int productPricePointId,
    final UpdateCurrencyPricesRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `productPricePointId` | `int` | Template, Required | The Chargify id of the product price point |
| `body` | [`UpdateCurrencyPricesRequest`](../../doc/models/update-currency-prices-request.md) | Body, Optional | - |

## Response Type

[`List<ProductPricePointCurrencyPrice>`](../../doc/models/product-price-point-currency-price.md)

## Example Usage

```java
int productPricePointId = 234;
UpdateCurrencyPricesRequest body = new UpdateCurrencyPricesRequest.Builder(
    Arrays.asList(
        new UpdateCurrencyPrice.Builder(
            200,
            15
        )
        .build(),
        new UpdateCurrencyPrice.Builder(
            201,
            5
        )
        .build()
    )
)
.build();

try {
    List<ProductPricePointCurrencyPrice> result = productPricePointsController.updateProductCurrencyPrices(productPricePointId, body);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

## Example Response *(as JSON)*

```json
[
  {
    "id": 0,
    "currency": "string",
    "price": 0,
    "formatted_price": "string",
    "product_price_point_id": 0,
    "role": "baseline"
  }
]
```


# List All Product Price Points

This method allows retrieval of a list of Products Price Points belonging to a Site.

```java
ListProductPricePointsResponse listAllProductPricePoints(
    final ListAllProductPricePointsInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `direction` | [`ListAllProductPricePointsInputDirection`](../../doc/models/containers/list-all-product-price-points-input-direction.md) | Query, Optional | This is a container for one-of cases. |
| `filterArchivedAt` | [`IncludeNotNull`](../../doc/models/include-not-null.md) | Query, Optional | Allows fetching price points only if archived_at is present or not. Use in query: `filter[archived_at]=not_null`. |
| `filterDateField` | [`BasicDateField`](../../doc/models/basic-date-field.md) | Query, Optional | The type of filter you would like to apply to your search. Use in query: `filter[date_field]=created_at`. |
| `filterEndDate` | `String` | Query, Optional | The end date (format YYYY-MM-DD) with which to filter the date_field. Returns price points with a timestamp up to and including 11:59:59PM in your site’s time zone on the date specified. |
| `filterEndDatetime` | `String` | Query, Optional | The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field. Returns price points with a timestamp at or before exact time provided in query. You can specify timezone in query - otherwise your site's time zone will be used. If provided, this parameter will be used instead of end_date. |
| `filterIds` | `List<Integer>` | Query, Optional | Allows fetching price points with matching id based on provided values. Use in query: `filter[ids]=1,2,3`. |
| `filterStartDate` | `String` | Query, Optional | The start date (format YYYY-MM-DD) with which to filter the date_field. Returns price points with a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date specified. |
| `filterStartDatetime` | `String` | Query, Optional | The start date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field. Returns price points with a timestamp at or after exact time provided in query. You can specify timezone in query - otherwise your site's time zone will be used. If provided, this parameter will be used instead of start_date. |
| `filterType` | [`PricePointType`](../../doc/models/price-point-type.md) | Query, Optional | Allows fetching price points with matching type. Use in query: `filter[type]=catalog,custom`. |
| `include` | [`ListProductsPricePointsInclude`](../../doc/models/list-products-price-points-include.md) | Query, Optional | Allows including additional data in the response. Use in query: `include=currency_prices`. |
| `page` | `Integer` | Query, Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br>**Default**: `1`<br>**Constraints**: `>= 1` |
| `perPage` | `Integer` | Query, Optional | This parameter indicates how many records to fetch in each request. Default value is 20. The maximum allowed values is 200; any per_page value over 200 will be changed to 200.<br>Use in query `per_page=200`.<br>**Default**: `20`<br>**Constraints**: `<= 200` |

## Response Type

[`ListProductPricePointsResponse`](../../doc/models/list-product-price-points-response.md)

## Example Usage

```java
ListAllProductPricePointsInput listAllProductPricePointsInput = new ListAllProductPricePointsInput.Builder()
Liquid error: Value cannot be null. (Parameter 'key')Liquid error: Value cannot be null. (Parameter 'key')Liquid error: Value cannot be null. (Parameter 'key')Liquid error: Value cannot be null. (Parameter 'key')Liquid error: Value cannot be null. (Parameter 'key')Liquid error: Value cannot be null. (Parameter 'key')Liquid error: Value cannot be null. (Parameter 'key')Liquid error: Value cannot be null. (Parameter 'key')    .include(ListProductsPricePointsInclude.CURRENCY_PRICES)
    .page(2)
    .perPage(50)
    .build();

try {
    ListProductPricePointsResponse result = productPricePointsController.listAllProductPricePoints(listAllProductPricePointsInput);
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
      "id": 0,
      "name": "My pricepoint",
      "handle": "handle",
      "price_in_cents": 10,
      "interval": 5,
      "interval_unit": "month",
      "trial_price_in_cents": 10,
      "trial_interval": 1,
      "trial_interval_unit": "month",
      "trial_type": "payment_expected",
      "introductory_offer": true,
      "initial_charge_in_cents": 0,
      "initial_charge_after_trial": true,
      "expiration_interval": 0,
      "expiration_interval_unit": "month",
      "product_id": 1230,
      "created_at": "2021-04-02T17:52:09-04:00",
      "updated_at": "2021-04-02T17:52:09-04:00",
      "use_site_exchange_rate": true
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Unprocessable Entity (WebDAV) | [`ErrorListResponseException`](../../doc/models/error-list-response-exception.md) |

