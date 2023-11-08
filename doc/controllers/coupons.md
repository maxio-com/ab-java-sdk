# Coupons

```java
CouponsController couponsController = client.getCouponsController();
```

## Class Name

`CouponsController`

## Methods

* [Create Coupon](../../doc/controllers/coupons.md#create-coupon)
* [List Coupons for Product Family](../../doc/controllers/coupons.md#list-coupons-for-product-family)
* [Read Coupon by Code](../../doc/controllers/coupons.md#read-coupon-by-code)
* [Read Coupon](../../doc/controllers/coupons.md#read-coupon)
* [Update Coupon](../../doc/controllers/coupons.md#update-coupon)
* [Archive Coupon](../../doc/controllers/coupons.md#archive-coupon)
* [List Coupons](../../doc/controllers/coupons.md#list-coupons)
* [Read Coupon Usage](../../doc/controllers/coupons.md#read-coupon-usage)
* [Validate Coupon](../../doc/controllers/coupons.md#validate-coupon)
* [Update Coupon Currency Prices](../../doc/controllers/coupons.md#update-coupon-currency-prices)
* [Create Coupon Subcodes](../../doc/controllers/coupons.md#create-coupon-subcodes)
* [List Coupon Subcodes](../../doc/controllers/coupons.md#list-coupon-subcodes)
* [Update Coupon Subcodes](../../doc/controllers/coupons.md#update-coupon-subcodes)
* [Delete Coupon Subcode](../../doc/controllers/coupons.md#delete-coupon-subcode)


# Create Coupon

## Coupons Documentation

Coupons can be administered in the Chargify application or created via API. Please view our section on [creating coupons](https://maxio-chargify.zendesk.com/hc/en-us/articles/5404742830733) for more information.

Additionally, for documentation on how to apply a coupon to a subscription within the Chargify UI, please see our documentation [here](https://maxio-chargify.zendesk.com/hc/en-us/articles/5404761012877).

## Create Coupon

This request will create a coupon, based on the provided information.

When creating a coupon, you must specify a product family using the `product_family_id`. If no `product_family_id` is passed, the first product family available is used. You will also need to formulate your URL to cite the Product Family ID in your request.

You can restrict a coupon to only apply to specific products / components by optionally passing in hashes of `restricted_products` and/or `restricted_components` in the format:
`{ "<product/component_id>": boolean_value }`

```java
CouponResponse createCoupon(
    final int productFamilyId,
    final CreateCouponBody body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `productFamilyId` | `int` | Template, Required | The Chargify id of the product family to which the coupon belongs |
| `body` | [`CreateCouponBody`](../../doc/models/containers/create-coupon-body.md) | Body, Optional | This is a container for one-of cases. |

## Response Type

[`CouponResponse`](../../doc/models/coupon-response.md)

## Example Usage

```java
int productFamilyId = 140;
CreateCouponBody body = CreateCouponBody.fromCreateOrUpdateCoupon(
    new CreateOrUpdateCoupon.Builder()
        .coupon(CreateOrUpdateCouponCoupon.fromCreateOrUpdatePercentageCoupon(
            new CreateOrUpdatePercentageCoupon.Builder(
                "15% off",
                "15OFF",
                CreateOrUpdatePercentageCouponPercentage.fromMString(
                    "15"
                )
            )
            .description("15% off for life")
            .allowNegativeBalance("false")
            .recurring("false")
            .endDate("2012-08-29T12:00:00-04:00")
            .productFamilyId("2")
            .stackable("true")
            .compoundingStrategy(CreateOrUpdatePercentageCouponCompoundingStrategy.fromCompoundingStrategy(
                    CompoundingStrategy.COMPOUND
                ))
            .excludeMidPeriodAllocations(true)
            .applyOnCancelAtEndOfPeriod(true)
            .build()
        ))
        .restrictedProducts(new LinkedHashMap<String, Boolean>() {{
            put("1", true);
        }})
        .restrictedComponents(new LinkedHashMap<String, Boolean>() {{
            put("1", true);
            put("2", false);
        }})
        .build()
);
try {
    CouponResponse result = couponsController.createCoupon(productFamilyId, body);
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
| 422 | Unprocessable Entity (WebDAV) | [`ErrorListResponseException`](../../doc/models/error-list-response-exception.md) |


# List Coupons for Product Family

List coupons for a specific Product Family in a Site.

If the coupon is set to `use_site_exchange_rate: true`, it will return pricing based on the current exchange rate. If the flag is set to false, it will return all of the defined prices for each currency.

```java
List<CouponResponse> listCouponsForProductFamily(
    final ListCouponsForProductFamilyInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `productFamilyId` | `int` | Template, Required | The Chargify id of the product family to which the coupon belongs |
| `page` | `Integer` | Query, Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br>**Default**: `1`<br>**Constraints**: `>= 1` |
| `perPage` | `Integer` | Query, Optional | This parameter indicates how many records to fetch in each request. Default value is 30. The maximum allowed values is 200; any per_page value over 200 will be changed to 200.<br>Use in query `per_page=200`.<br>**Default**: `30`<br>**Constraints**: `<= 200` |
| `filterDateField` | [`BasicDateField`](../../doc/models/basic-date-field.md) | Query, Optional | The type of filter you would like to apply to your search. Use in query `filter[date_field]=created_at`. |
| `filterEndDate` | `String` | Query, Optional | The end date (format YYYY-MM-DD) with which to filter the date_field. Returns coupons with a timestamp up to and including 11:59:59PM in your site’s time zone on the date specified. Use in query `filter[date_field]=2011-12-15`. |
| `filterEndDatetime` | `String` | Query, Optional | The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field. Returns coupons with a timestamp at or before exact time provided in query. You can specify timezone in query - otherwise your site's time zone will be used. If provided, this parameter will be used instead of end_date. Use in query `?filter[end_datetime]=2011-12-1T10:15:30+01:00`. |
| `filterStartDate` | `String` | Query, Optional | The start date (format YYYY-MM-DD) with which to filter the date_field. Returns coupons with a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date specified. Use in query `filter[start_date]=2011-12-17`. |
| `filterStartDatetime` | `String` | Query, Optional | The start date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field. Returns coupons with a timestamp at or after exact time provided in query. You can specify timezone in query - otherwise your site's time zone will be used. If provided, this parameter will be used instead of start_date. Use in query `filter[start_datetime]=2011-12-19T10:15:30+01:00`. |
| `filterIds` | `List<Integer>` | Query, Optional | Allows fetching coupons with matching id based on provided values. Use in query `filter[ids]=1,2,3`.<br>**Constraints**: *Minimum Items*: `1` |
| `filterCodes` | `List<String>` | Query, Optional | Allows fetching coupons with matching codes based on provided values. Use in query `filter[codes]=free,free_trial`. |
| `currencyPrices` | `Boolean` | Query, Optional | When fetching coupons, if you have defined multiple currencies at the site level, you can optionally pass the `?currency_prices=true` query param to include an array of currency price data in the response. Use in query `currency_prices=true`. |
| `filterUseSiteExchangeRate` | `Boolean` | Query, Optional | Allows fetching coupons with matching use_site_exchange_rate based on provided value. Use in query `filter[use_site_exchange_rate]=true`. |

## Response Type

[`List<CouponResponse>`](../../doc/models/coupon-response.md)

## Example Usage

```java
ListCouponsForProductFamilyInput listCouponsForProductFamilyInput = new ListCouponsForProductFamilyInput.Builder(
    140
)
.page(2)
.perPage(50)
Liquid error: Value cannot be null. (Parameter 'key')Liquid error: Value cannot be null. (Parameter 'key')Liquid error: Value cannot be null. (Parameter 'key')Liquid error: Value cannot be null. (Parameter 'key')Liquid error: Value cannot be null. (Parameter 'key')Liquid error: Value cannot be null. (Parameter 'key')Liquid error: Value cannot be null. (Parameter 'key').currencyPrices(true)
Liquid error: Value cannot be null. (Parameter 'key').build();

try {
    List<CouponResponse> result = couponsController.listCouponsForProductFamily(listCouponsForProductFamilyInput);
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
    "coupon": {
      "id": 999999,
      "name": "50% coupon",
      "code": "50PERCENT",
      "description": "50 PERCENT OFF",
      "amount_in_cents": null,
      "product_family_id": 527890,
      "created_at": "2016-10-21T17:02:08-04:00",
      "updated_at": "2016-10-21T17:06:11-04:00",
      "start_date": "2016-10-21T17:02:08-04:00",
      "end_date": null,
      "percentage": 50,
      "recurring": true,
      "duration_period_count": null,
      "duration_interval": 1,
      "duration_interval_unit": "day",
      "allow_negative_balance": true,
      "archived_at": null,
      "conversion_limit": "100",
      "stackable": false,
      "compounding_strategy": "compound",
      "coupon_restrictions": [],
      "use_site_exchange_rate": true
    }
  },
  {
    "coupon": {
      "id": 123456,
      "name": "100% coupon",
      "code": "100PERCENT",
      "description": "100 PERCENT OFF",
      "amount_in_cents": null,
      "product_family_id": 527890,
      "created_at": "2016-10-21T17:02:08-04:00",
      "updated_at": "2016-10-21T17:06:11-04:00",
      "start_date": "2016-10-21T17:02:08-04:00",
      "end_date": null,
      "percentage": 50,
      "recurring": true,
      "duration_period_count": null,
      "duration_interval": 1,
      "duration_interval_unit": "day",
      "allow_negative_balance": true,
      "archived_at": null,
      "conversion_limit": "100",
      "stackable": false,
      "compounding_strategy": "compound",
      "coupon_restrictions": [],
      "use_site_exchange_rate": true
    }
  },
  {
    "coupon": {
      "id": 888888,
      "name": "25% coupon",
      "code": "25PERCENT",
      "description": "25 PERCENT OFF",
      "amount_in_cents": null,
      "product_family_id": 527890,
      "created_at": "2016-10-21T17:02:08-04:00",
      "updated_at": "2016-10-21T17:06:11-04:00",
      "start_date": "2016-10-21T17:02:08-04:00",
      "end_date": null,
      "percentage": 25,
      "recurring": true,
      "duration_period_count": null,
      "duration_interval": 1,
      "duration_interval_unit": "day",
      "allow_negative_balance": true,
      "archived_at": null,
      "conversion_limit": "100",
      "stackable": false,
      "compounding_strategy": "compound",
      "coupon_restrictions": [
        {
          "id": 37,
          "item_type": "Component",
          "item_id": 519,
          "name": "test",
          "handle": null
        }
      ],
      "use_site_exchange_rate": true
    }
  }
]
```


# Read Coupon by Code

You can search for a coupon via the API with the find method. By passing a code parameter, the find will attempt to locate a coupon that matches that code. If no coupon is found, a 404 is returned.

If you have more than one product family and if the coupon you are trying to find does not belong to the default product family in your site, then you will need to specify (either in the url or as a query string param) the product family id.

```java
CouponResponse readCouponByCode(
    final Integer productFamilyId,
    final String code)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `productFamilyId` | `Integer` | Query, Optional | The Chargify id of the product family to which the coupon belongs |
| `code` | `String` | Query, Optional | The code of the coupon |

## Response Type

[`CouponResponse`](../../doc/models/coupon-response.md)

## Example Usage

```java
try {
    CouponResponse result = couponsController.readCouponByCode(null, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Read Coupon

You can retrieve the Coupon via the API with the Show method. You must identify the Coupon in this call by the ID parameter that Chargify assigns.
If instead you would like to find a Coupon using a Coupon code, see the Coupon Find method.

When fetching a coupon, if you have defined multiple currencies at the site level, you can optionally pass the `?currency_prices=true` query param to include an array of currency price data in the response.

If the coupon is set to `use_site_exchange_rate: true`, it will return pricing based on the current exchange rate. If the flag is set to false, it will return all of the defined prices for each currency.

```java
CouponResponse readCoupon(
    final int productFamilyId,
    final int couponId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `productFamilyId` | `int` | Template, Required | The Chargify id of the product family to which the coupon belongs |
| `couponId` | `int` | Template, Required | The Chargify id of the coupon |

## Response Type

[`CouponResponse`](../../doc/models/coupon-response.md)

## Example Usage

```java
int productFamilyId = 140;
int couponId = 162;

try {
    CouponResponse result = couponsController.readCoupon(productFamilyId, couponId);
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
  "coupon": {
    "id": 67,
    "name": "Foo Bar",
    "code": "YEPPER99934",
    "description": "my cool coupon",
    "amount_in_cents": null,
    "product_family_id": 4,
    "product_family_name": "Billing Plans",
    "created_at": "2017-11-08T10:01:15-05:00",
    "updated_at": "2017-11-08T10:01:15-05:00",
    "start_date": "2017-11-08T10:01:15-05:00",
    "end_date": null,
    "percentage": 33.3333,
    "duration_period_count": null,
    "duration_interval": null,
    "duration_interval_unit": null,
    "allow_negative_balance": false,
    "archived_at": null,
    "conversion_limit": null,
    "stackable": true,
    "compounding_strategy": "compound",
    "coupon_restrictions": []
  }
}
```


# Update Coupon

## Update Coupon

You can update a Coupon via the API with a PUT request to the resource endpoint.

You can restrict a coupon to only apply to specific products / components by optionally passing in hashes of `restricted_products` and/or `restricted_components` in the format:
`{ "<product/component_id>": boolean_value }`

```java
CouponResponse updateCoupon(
    final int productFamilyId,
    final int couponId,
    final UpdateCouponBody body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `productFamilyId` | `int` | Template, Required | The Chargify id of the product family to which the coupon belongs |
| `couponId` | `int` | Template, Required | The Chargify id of the coupon |
| `body` | [`UpdateCouponBody`](../../doc/models/containers/update-coupon-body.md) | Body, Optional | This is a container for one-of cases. |

## Response Type

[`CouponResponse`](../../doc/models/coupon-response.md)

## Example Usage

```java
int productFamilyId = 140;
int couponId = 162;
UpdateCouponBody body = UpdateCouponBody.fromCreateOrUpdateCoupon(
    new CreateOrUpdateCoupon.Builder()
        .coupon(CreateOrUpdateCouponCoupon.fromCreateOrUpdatePercentageCoupon(
            new CreateOrUpdatePercentageCoupon.Builder(
                "15% off",
                "15OFF",
                CreateOrUpdatePercentageCouponPercentage.fromMString(
                    "15"
                )
            )
            .description("15% off for life")
            .allowNegativeBalance("false")
            .recurring("false")
            .endDate("2012-08-29T12:00:00-04:00")
            .productFamilyId("2")
            .stackable("true")
            .compoundingStrategy(CreateOrUpdatePercentageCouponCompoundingStrategy.fromCompoundingStrategy(
                    CompoundingStrategy.COMPOUND
                ))
            .build()
        ))
        .restrictedProducts(new LinkedHashMap<String, Boolean>() {{
            put("1", true);
        }})
        .restrictedComponents(new LinkedHashMap<String, Boolean>() {{
            put("1", true);
            put("2", false);
        }})
        .build()
);
try {
    CouponResponse result = couponsController.updateCoupon(productFamilyId, couponId, body);
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
  "coupon": {
    "id": 67,
    "name": "Foo Bar",
    "code": "YEPPER99934",
    "description": "my cool coupon",
    "amount_in_cents": 10000,
    "product_family_id": 4,
    "created_at": "2017-11-08T10:01:15-05:00",
    "updated_at": "2017-11-08T10:01:15-05:00",
    "start_date": "2017-11-08T10:01:15-05:00",
    "end_date": null,
    "percentage": null,
    "recurring": false,
    "duration_period_count": null,
    "duration_interval": null,
    "duration_interval_unit": null,
    "allow_negative_balance": false,
    "archived_at": null,
    "conversion_limit": null,
    "stackable": true,
    "compounding_strategy": "compound",
    "coupon_restrictions": []
  }
}
```


# Archive Coupon

You can archive a Coupon via the API with the archive method.
Archiving makes that Coupon unavailable for future use, but allows it to remain attached and functional on existing Subscriptions that are using it.
The `archived_at` date and time will be assigned.

```java
CouponResponse archiveCoupon(
    final int productFamilyId,
    final int couponId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `productFamilyId` | `int` | Template, Required | The Chargify id of the product family to which the coupon belongs |
| `couponId` | `int` | Template, Required | The Chargify id of the coupon |

## Response Type

[`CouponResponse`](../../doc/models/coupon-response.md)

## Example Usage

```java
int productFamilyId = 140;
int couponId = 162;

try {
    CouponResponse result = couponsController.archiveCoupon(productFamilyId, couponId);
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
  "coupon": {
    "id": 67,
    "name": "Foo Bar",
    "code": "YEPPER99934",
    "description": "my cool coupon",
    "amount_in_cents": 10000,
    "product_family_id": 4,
    "created_at": "2017-11-08T10:01:15-05:00",
    "updated_at": "2017-11-08T10:01:15-05:00",
    "start_date": "2017-11-08T10:01:15-05:00",
    "end_date": null,
    "percentage": null,
    "recurring": false,
    "duration_period_count": null,
    "duration_interval": null,
    "duration_interval_unit": null,
    "allow_negative_balance": false,
    "archived_at": "2016-12-02T13:09:33-05:00",
    "conversion_limit": null,
    "stackable": true,
    "compounding_strategy": "compound",
    "coupon_restrictions": []
  }
}
```


# List Coupons

You can retrieve a list of coupons.

If the coupon is set to `use_site_exchange_rate: true`, it will return pricing based on the current exchange rate. If the flag is set to false, it will return all of the defined prices for each currency.

```java
List<CouponResponse> listCoupons(
    final ListCouponsInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `page` | `Integer` | Query, Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br>**Default**: `1`<br>**Constraints**: `>= 1` |
| `perPage` | `Integer` | Query, Optional | This parameter indicates how many records to fetch in each request. Default value is 30. The maximum allowed values is 200; any per_page value over 200 will be changed to 200.<br>Use in query `per_page=200`.<br>**Default**: `30`<br>**Constraints**: `<= 200` |
| `dateField` | [`BasicDateField`](../../doc/models/basic-date-field.md) | Query, Optional | The field was deprecated: on January 20, 2022. We recommend using filter[date_field] instead to achieve the same result. The type of filter you would like to apply to your search. |
| `startDate` | `String` | Query, Optional | The field was deprecated: on January 20, 2022. We recommend using filter[start_date] instead to achieve the same result. The start date (format YYYY-MM-DD) with which to filter the date_field. Returns coupons with a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date specified. |
| `endDate` | `String` | Query, Optional | The field was deprecated: on January 20, 2022. We recommend using filter[end_date] instead to achieve the same result. The end date (format YYYY-MM-DD) with which to filter the date_field. Returns coupons with a timestamp up to and including 11:59:59PM in your site’s time zone on the date specified. |
| `startDatetime` | `String` | Query, Optional | The field was deprecated: on January 20, 2022. We recommend using filter[start_datetime] instead to achieve the same result. The start date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field. Returns coupons with a timestamp at or after exact time provided in query. You can specify timezone in query - otherwise your site's time zone will be used. If provided, this parameter will be used instead of start_date. |
| `endDatetime` | `String` | Query, Optional | The field was deprecated: on January 20, 2022. We recommend using filter[end_datetime] instead to achieve the same result. The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field. Returns coupons with a timestamp at or before exact time provided in query. You can specify timezone in query - otherwise your site's time zone will be used. If provided, this parameter will be used instead of end_date. |
| `filterIds` | `List<Integer>` | Query, Optional | Allows fetching coupons with matching id based on provided values. Use in query `filter[ids]=1,2,3`.<br>**Constraints**: *Minimum Items*: `1` |
| `filterCodes` | `List<String>` | Query, Optional | Allows fetching coupons with matching code based on provided values. Use in query `filter[ids]=1,2,3`.<br>**Constraints**: *Minimum Items*: `1` |
| `currencyPrices` | `Boolean` | Query, Optional | When fetching coupons, if you have defined multiple currencies at the site level, you can optionally pass the `?currency_prices=true` query param to include an array of currency price data in the response. Use in query `currency_prices=true`. |
| `filterEndDate` | `String` | Query, Optional | The end date (format YYYY-MM-DD) with which to filter the date_field. Returns coupons with a timestamp up to and including 11:59:59PM in your site’s time zone on the date specified. Use in query `filter[end_date]=2011-12-17`. |
| `filterEndDatetime` | `String` | Query, Optional | The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field. Returns coupons with a timestamp at or before exact time provided in query. You can specify timezone in query - otherwise your site's time zone will be used. If provided, this parameter will be used instead of end_date. Use in query `filter[end_datetime]=2011-12-19T10:15:30+01:00`. |
| `filterStartDate` | `String` | Query, Optional | The start date (format YYYY-MM-DD) with which to filter the date_field. Returns coupons with a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date specified. Use in query `filter[start_date]=2011-12-19`. |
| `filterStartDatetime` | `String` | Query, Optional | The start date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field. Returns coupons with a timestamp at or after exact time provided in query. You can specify timezone in query - otherwise your site's time zone will be used. If provided, this parameter will be used instead of start_date. Use in query `filter[start_datetime]=2011-12-19T10:15:30+01:00`. |
| `filterDateField` | [`BasicDateField`](../../doc/models/basic-date-field.md) | Query, Optional | The type of filter you would like to apply to your search. Use in query `filter[date_field]=updated_at`. |
| `filterUseSiteExchangeRate` | `Boolean` | Query, Optional | Allows fetching coupons with matching use_site_exchange_rate based on provided value. Use in query `filter[use_site_exchange_rate]=true`. |

## Response Type

[`List<CouponResponse>`](../../doc/models/coupon-response.md)

## Example Usage

```java
ListCouponsInput listCouponsInput = new ListCouponsInput.Builder()
    .page(2)
    .perPage(50)
    .dateField(BasicDateField.UPDATED_AT)
Liquid error: Value cannot be null. (Parameter 'key')Liquid error: Value cannot be null. (Parameter 'key')    .currencyPrices(true)
Liquid error: Value cannot be null. (Parameter 'key')Liquid error: Value cannot be null. (Parameter 'key')Liquid error: Value cannot be null. (Parameter 'key')Liquid error: Value cannot be null. (Parameter 'key')Liquid error: Value cannot be null. (Parameter 'key')Liquid error: Value cannot be null. (Parameter 'key')    .build();

try {
    List<CouponResponse> result = couponsController.listCoupons(listCouponsInput);
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
    "coupon": {
      "id": 0,
      "name": "string",
      "code": "string",
      "description": "string",
      "amount": 0,
      "amount_in_cents": 0,
      "product_family_id": 0,
      "product_family_name": "string",
      "start_date": "string",
      "end_date": "string",
      "percentage": 0,
      "recurring": true,
      "recurring_scheme": "do_not_recur",
      "duration_period_count": 0,
      "duration_interval": 0,
      "duration_interval_unit": "string",
      "duration_interval_span": "string",
      "allow_negative_balance": true,
      "archived_at": "string",
      "conversion_limit": "string",
      "stackable": true,
      "compounding_strategy": "compound",
      "use_site_exchange_rate": true,
      "created_at": "string",
      "updated_at": "string",
      "discount_type": "amount",
      "exclude_mid_period_allocations": true,
      "apply_on_cancel_at_end_of_period": true,
      "coupon_restrictions": [
        {
          "id": 0,
          "item_type": "Component",
          "item_id": 0,
          "name": "string",
          "handle": "string"
        }
      ]
    }
  }
]
```


# Read Coupon Usage

This request will provide details about the coupon usage as an array of data hashes, one per product.

```java
List<CouponUsage> readCouponUsage(
    final int productFamilyId,
    final int couponId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `productFamilyId` | `int` | Template, Required | The Chargify id of the product family to which the coupon belongs |
| `couponId` | `int` | Template, Required | The Chargify id of the coupon |

## Response Type

[`List<CouponUsage>`](../../doc/models/coupon-usage.md)

## Example Usage

```java
int productFamilyId = 140;
int couponId = 162;

try {
    List<CouponUsage> result = couponsController.readCouponUsage(productFamilyId, couponId);
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
    "name": "No cost product",
    "id": 3903594,
    "signups": 0,
    "savings": 0,
    "savings_in_cents": 0,
    "revenue": 0,
    "revenue_in_cents": 0
  },
  {
    "name": "Product that expires",
    "id": 3853680,
    "signups": 0,
    "savings": 0,
    "savings_in_cents": 0,
    "revenue": 0,
    "revenue_in_cents": 0
  },
  {
    "name": "Trial Product",
    "id": 3861800,
    "signups": 1,
    "savings": 30,
    "savings_in_cents": 3000,
    "revenue": 20,
    "revenue_in_cents": 2000
  }
]
```


# Validate Coupon

You can verify if a specific coupon code is valid using the `validate` method. This method is useful for validating coupon codes that are entered by a customer. If the coupon is found and is valid, the coupon will be returned with a 200 status code.

If the coupon is invalid, the status code will be 404 and the response will say why it is invalid. If the coupon is valid, the status code will be 200 and the coupon will be returned. The following reasons for invalidity are supported:

+ Coupon not found
+ Coupon is invalid
+ Coupon expired

If you have more than one product family and if the coupon you are validating does not belong to the first product family in your site, then you will need to specify the product family, either in the url or as a query string param. This can be done by supplying the id or the handle in the `handle:my-family` format.

Eg.

```
https://<subdomain>.chargify.com/product_families/handle:<product_family_handle>/coupons/validate.<format>?code=<coupon_code>
```

Or:

```
https://<subdomain>.chargify.com/coupons/validate.<format>?code=<coupon_code>&product_family_id=<id>
```

```java
CouponResponse validateCoupon(
    final String code,
    final Integer productFamilyId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `code` | `String` | Query, Required | The code of the coupon |
| `productFamilyId` | `Integer` | Query, Optional | The Chargify id of the product family to which the coupon belongs |

## Response Type

[`CouponResponse`](../../doc/models/coupon-response.md)

## Example Usage

```java
String code = "code8";

try {
    CouponResponse result = couponsController.validateCoupon(code, null);
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
  "coupon": {
    "id": 66,
    "name": "Foo Bar",
    "code": "YEPPER9993",
    "description": "my cool coupon",
    "amount_in_cents": 10000,
    "product_family_id": 4,
    "created_at": "2017-11-07T14:51:52-05:00",
    "updated_at": "2017-11-07T15:14:24-05:00",
    "start_date": "2017-11-07T14:51:52-05:00",
    "end_date": null,
    "percentage": null,
    "recurring": false,
    "duration_period_count": null,
    "duration_interval": null,
    "duration_interval_unit": null,
    "allow_negative_balance": false,
    "archived_at": null,
    "conversion_limit": null,
    "stackable": true,
    "compounding_strategy": "full-price",
    "coupon_restrictions": []
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found | [`SingleStringErrorResponseException`](../../doc/models/single-string-error-response-exception.md) |


# Update Coupon Currency Prices

This endpoint allows you to create and/or update currency prices for an existing coupon. Multiple prices can be created or updated in a single request but each of the currencies must be defined on the site level already and the coupon must be an amount-based coupon, not percentage.

Currency pricing for coupons must mirror the setup of the primary coupon pricing - if the primary coupon is percentage based, you will not be able to define pricing in non-primary currencies.

```java
List<CouponCurrency> updateCouponCurrencyPrices(
    final int couponId,
    final CouponCurrencyRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `couponId` | `int` | Template, Required | The Chargify id of the coupon |
| `body` | [`CouponCurrencyRequest`](../../doc/models/coupon-currency-request.md) | Body, Optional | - |

## Response Type

[`List<CouponCurrency>`](../../doc/models/coupon-currency.md)

## Example Usage

```java
int couponId = 162;
CouponCurrencyRequest body = new CouponCurrencyRequest.Builder(
    Arrays.asList(
        new UpdateCouponCurrency.Builder(
            "EUR",
            10
        )
        .build(),
        new UpdateCouponCurrency.Builder(
            "GBP",
            9
        )
        .build()
    )
)
.build();

try {
    List<CouponCurrency> result = couponsController.updateCouponCurrencyPrices(couponId, body);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Create Coupon Subcodes

## Coupon Subcodes Intro

Coupon Subcodes allow you to create a set of unique codes that allow you to expand the use of one coupon.

For example:

Master Coupon Code:

+ SPRING2020

Coupon Subcodes:

+ SPRING90210
+ DP80302
+ SPRINGBALTIMORE

Coupon subcodes can be administered in the Admin Interface or via the API.

When creating a coupon subcode, you must specify a coupon to attach it to using the coupon_id. Valid coupon subcodes are all capital letters, contain only letters and numbers, and do not have any spaces. Lowercase letters will be capitalized before the subcode is created.

## Coupon Subcodes Documentation

Full documentation on how to create coupon subcodes in the Chargify UI can be located [here](https://chargify.zendesk.com/hc/en-us/articles/4407755909531#coupon-codes).

Additionally, for documentation on how to apply a coupon to a Subscription within the Chargify UI, please see our documentation [here](https://chargify.zendesk.com/hc/en-us/articles/4407884887835#coupon).

## Create Coupon Subcode

This request allows you to create specific subcodes underneath an existing coupon code.

*Note*: If you are using any of the allowed special characters ("%", "@", "+", "-", "_", and "."), you must encode them for use in the URL.

    % to %25
    @ to %40
    + to %2B
    - to %2D
    _ to %5F
    . to %2E

So, if the coupon subcode is `20%OFF`, the URL to delete this coupon subcode would be: `https://<subdomain>.chargify.com/coupons/567/codes/20%25OFF.<format>`

```java
CouponSubcodesResponse createCouponSubcodes(
    final int couponId,
    final CouponSubcodes body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `couponId` | `int` | Template, Required | The Chargify id of the coupon |
| `body` | [`CouponSubcodes`](../../doc/models/coupon-subcodes.md) | Body, Optional | - |

## Response Type

[`CouponSubcodesResponse`](../../doc/models/coupon-subcodes-response.md)

## Example Usage

```java
int couponId = 162;
CouponSubcodes body = new CouponSubcodes.Builder()
    .codes(Arrays.asList(
        "BALTIMOREFALL",
        "ORLANDOFALL",
        "DETROITFALL"
    ))
    .build();

try {
    CouponSubcodesResponse result = couponsController.createCouponSubcodes(couponId, body);
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
  "created_codes": [
    "BALTIMOREFALL",
    "ORLANDOFALL",
    "DETROITFALL"
  ],
  "duplicate_codes": [],
  "invalid_codes": []
}
```


# List Coupon Subcodes

This request allows you to request the subcodes that are attached to a coupon.

```java
CouponSubcodes listCouponSubcodes(
    final ListCouponSubcodesInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `couponId` | `int` | Template, Required | The Chargify id of the coupon |
| `page` | `Integer` | Query, Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br>**Default**: `1`<br>**Constraints**: `>= 1` |
| `perPage` | `Integer` | Query, Optional | This parameter indicates how many records to fetch in each request. Default value is 20. The maximum allowed values is 200; any per_page value over 200 will be changed to 200.<br>Use in query `per_page=200`.<br>**Default**: `20`<br>**Constraints**: `<= 200` |

## Response Type

[`CouponSubcodes`](../../doc/models/coupon-subcodes.md)

## Example Usage

```java
ListCouponSubcodesInput listCouponSubcodesInput = new ListCouponSubcodesInput.Builder(
    162
)
.page(2)
.perPage(50)
.build();

try {
    CouponSubcodes result = couponsController.listCouponSubcodes(listCouponSubcodesInput);
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
  "codes": [
    "3JU6PR",
    "9RO6MP",
    "8OG1VV",
    "5FL7VV",
    "2SV8XK",
    "4LW8LH",
    "3VL4GZ",
    "9UI9XO",
    "0LZ0CC",
    "8XI9JV",
    "9UV5YE",
    "3UI4GX",
    "6SL5ST",
    "9WC8IJ",
    "2KA3PZ",
    "7WR1VR",
    "3VY7MN",
    "6KC3KB",
    "7DF7YT",
    "9FH1ED"
  ]
}
```


# Update Coupon Subcodes

You can update the subcodes for the given Coupon via the API with a PUT request to the resource endpoint.
Send an array of new coupon subcodes.

**Note**: All current subcodes for that Coupon will be deleted first, and replaced with the list of subcodes sent to this endpoint.
The response will contain:

+ The created subcodes,

+ Subcodes that were not created because they already exist,

+ Any subcodes not created because they are invalid.

```java
CouponSubcodesResponse updateCouponSubcodes(
    final int couponId,
    final CouponSubcodes body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `couponId` | `int` | Template, Required | The Chargify id of the coupon |
| `body` | [`CouponSubcodes`](../../doc/models/coupon-subcodes.md) | Body, Optional | - |

## Response Type

[`CouponSubcodesResponse`](../../doc/models/coupon-subcodes-response.md)

## Example Usage

```java
int couponId = 162;
CouponSubcodes body = new CouponSubcodes.Builder()
    .codes(Arrays.asList(
        "AAAA",
        "BBBB",
        "CCCC"
    ))
    .build();

try {
    CouponSubcodesResponse result = couponsController.updateCouponSubcodes(couponId, body);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Delete Coupon Subcode

## Example

Given a coupon with an ID of 567, and a coupon subcode of 20OFF, the URL to `DELETE` this coupon subcode would be:

```
http://subdomain.chargify.com/coupons/567/codes/20OFF.<format>
```

Note: If you are using any of the allowed special characters (“%”, “@”, “+”, “-”, “_”, and “.”), you must encode them for use in the URL.

| Special character | Encoding |
|-------------------|----------|
| %                 | %25      |
| @                 | %40      |
| +                 | %2B      |
| –                 | %2D      |
| _                 | %5F      |
| .                 | %2E      |

## Percent Encoding Example

Or if the coupon subcode is 20%OFF, the URL to delete this coupon subcode would be: @https://<subdomain>.chargify.com/coupons/567/codes/20%25OFF.<format>

```java
Void deleteCouponSubcode(
    final int couponId,
    final String subcode)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `couponId` | `int` | Template, Required | The Chargify id of the coupon to which the subcode belongs |
| `subcode` | `String` | Template, Required | The subcode of the coupon |

## Response Type

`void`

## Example Usage

```java
int couponId = 162;
String subcode = "subcode4";

try {
    couponsController.deleteCouponSubcode(couponId, subcode);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found | `ApiException` |

