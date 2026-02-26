# Product Families

```java
ProductFamiliesController productFamiliesController = client.getProductFamiliesController();
```

## Class Name

`ProductFamiliesController`

## Methods

* [List Products for Product Family](../../doc/controllers/product-families.md#list-products-for-product-family)
* [Create Product Family](../../doc/controllers/product-families.md#create-product-family)
* [List Product Families](../../doc/controllers/product-families.md#list-product-families)
* [Read Product Family](../../doc/controllers/product-families.md#read-product-family)


# List Products for Product Family

Retrieves a list of Products belonging to a Product Family.

```java
List<ProductResponse> listProductsForProductFamily(
    final ListProductsForProductFamilyInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `input` | [`ListProductsForProductFamilyInput`](../../doc/models/list-products-for-product-family-input.md) | Required | Input structure for the method ListProductsForProductFamily |

## Response Type

[`List<ProductResponse>`](../../doc/models/product-response.md)

## Example Usage

```java
ListProductsForProductFamilyInput listProductsForProductFamilyInput = new ListProductsForProductFamilyInput.Builder(
    "product_family_id4"
)
.page(1)
.perPage(50)
.dateField(BasicDateField.UPDATED_AT)
.filter(new ListProductsFilter.Builder()
        .ids(Arrays.asList(
            1,
            2,
            3
        ))
        .build())
.include(ListProductsInclude.PREPAID_PRODUCT_PRICE_POINT)
.build();

try {
    List<ProductResponse> result = productFamiliesController.listProductsForProductFamily(listProductsForProductFamilyInput);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Example Response *(as JSON)*

```json
[
  {
    "product": {
      "id": 3801242,
      "name": "Free product",
      "handle": "zero-dollar-product",
      "description": "",
      "accounting_code": "",
      "request_credit_card": true,
      "expiration_interval": null,
      "expiration_interval_unit": "never",
      "created_at": "2016-04-21T16:08:39-04:00",
      "updated_at": "2016-08-03T11:27:53-04:00",
      "price_in_cents": 10000,
      "interval": 1,
      "interval_unit": "month",
      "initial_charge_in_cents": 0,
      "trial_price_in_cents": null,
      "trial_interval": null,
      "trial_interval_unit": "month",
      "archived_at": null,
      "require_credit_card": false,
      "return_params": "",
      "taxable": false,
      "update_return_url": "",
      "initial_charge_after_trial": false,
      "version_number": 4,
      "update_return_params": "",
      "product_family": {
        "id": 527890,
        "name": "Acme Projects",
        "description": "",
        "handle": "billing-plans",
        "accounting_code": null
      },
      "public_signup_pages": [
        {
          "id": 283460,
          "return_url": null,
          "return_params": "",
          "url": "https://general-goods.chargify.com/subscribe/smcc4j3d2w6h/zero-dollar-product"
        }
      ],
      "product_price_point_name": "Default",
      "use_site_exchange_rate": true
    }
  },
  {
    "product": {
      "id": 3858146,
      "name": "Calendar Billing Product",
      "handle": "calendar-billing-product",
      "description": "",
      "accounting_code": "",
      "request_credit_card": true,
      "expiration_interval": null,
      "expiration_interval_unit": "never",
      "created_at": "2016-07-05T13:07:38-04:00",
      "updated_at": "2016-07-05T13:07:38-04:00",
      "price_in_cents": 10000,
      "interval": 1,
      "interval_unit": "month",
      "initial_charge_in_cents": null,
      "trial_price_in_cents": null,
      "trial_interval": null,
      "trial_interval_unit": "month",
      "archived_at": null,
      "require_credit_card": true,
      "return_params": "",
      "taxable": false,
      "update_return_url": "",
      "initial_charge_after_trial": false,
      "version_number": 1,
      "update_return_params": "",
      "product_family": {
        "id": 527890,
        "name": "Acme Projects",
        "description": "",
        "handle": "billing-plans",
        "accounting_code": null
      },
      "public_signup_pages": [
        {
          "id": 289193,
          "return_url": "",
          "return_params": "",
          "url": "https://general-goods.chargify.com/subscribe/gxdbfxzxhcjq/calendar-billing-product"
        }
      ],
      "product_price_point_name": "Default",
      "use_site_exchange_rate": true
    }
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found | `ApiException` |


# Create Product Family

Creates a Product Family within your Advanced Billing site. Create a Product Family to act as a container for your products, components and coupons.

Full documentation on how Product Families operate within the Advanced Billing UI can be located [here](https://maxio.zendesk.com/hc/en-us/articles/24261098936205-Product-Families).

```java
ProductFamilyResponse createProductFamily(
    final CreateProductFamilyRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`CreateProductFamilyRequest`](../../doc/models/create-product-family-request.md) | Body, Optional | - |

## Response Type

[`ProductFamilyResponse`](../../doc/models/product-family-response.md)

## Example Usage

```java
CreateProductFamilyRequest body = new CreateProductFamilyRequest.Builder(
    new CreateProductFamily.Builder(
        "Acme Projects"
    )
    .description("Amazing project management tool")
    .build()
)
.build();

try {
    ProductFamilyResponse result = productFamiliesController.createProductFamily(body);
    System.out.println(result);
} catch (ErrorListResponseException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Example Response *(as JSON)*

```json
{
  "product_family": {
    "id": 933860,
    "name": "Acme Projects",
    "description": "Amazing project management tool",
    "handle": "acme-projects",
    "accounting_code": null
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Unprocessable Entity (WebDAV) | [`ErrorListResponseException`](../../doc/models/error-list-response-exception.md) |


# List Product Families

Retrieve a list of Product Families for a site.

```java
List<ProductFamilyResponse> listProductFamilies(
    final ListProductFamiliesInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `input` | [`ListProductFamiliesInput`](../../doc/models/list-product-families-input.md) | Required | Input structure for the method ListProductFamilies |

## Response Type

[`List<ProductFamilyResponse>`](../../doc/models/product-family-response.md)

## Example Usage

```java
ListProductFamiliesInput listProductFamiliesInput = new ListProductFamiliesInput.Builder()
    .dateField(BasicDateField.UPDATED_AT)
    .build();

try {
    List<ProductFamilyResponse> result = productFamiliesController.listProductFamilies(listProductFamiliesInput);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Example Response *(as JSON)*

```json
[
  {
    "product_family": {
      "id": 37,
      "name": "Acme Projects",
      "description": null,
      "handle": "acme-projects",
      "accounting_code": null,
      "created_at": "2013-02-20T15:05:51-07:00",
      "updated_at": "2013-02-20T15:05:51-07:00",
      "archived_at": null
    }
  },
  {
    "product_family": {
      "id": 155,
      "name": "Bat Family",
      "description": "Another family.",
      "handle": "bat-family",
      "accounting_code": null,
      "created_at": "2014-04-16T12:41:13-06:00",
      "updated_at": "2014-04-16T12:41:13-06:00",
      "archived_at": "2024-11-05T09:30:00-07:00"
    }
  }
]
```


# Read Product Family

Retrieves a Product Family via the `product_family_id`. The response will contain a Product Family object.

The product family can be specified either with the id number, or with the `handle:my-family` format.

```java
ProductFamilyResponse readProductFamily(
    final int id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `int` | Template, Required | The Advanced Billing id of the product family |

## Response Type

[`ProductFamilyResponse`](../../doc/models/product-family-response.md)

## Example Usage

```java
int id = 112;

try {
    ProductFamilyResponse result = productFamiliesController.readProductFamily(id);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Example Response *(as JSON)*

```json
{
  "product_family": {
    "id": 527890,
    "name": "Acme Projects",
    "description": "",
    "handle": "billing-plans",
    "accounting_code": null,
    "archived_at": null
  }
}
```

