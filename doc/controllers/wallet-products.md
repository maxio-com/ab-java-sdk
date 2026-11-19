# Wallet Products

```java
WalletProductsController walletProductsController = client.getWalletProductsController();
```

## Class Name

`WalletProductsController`

## Methods

* [List Wallet Products](../../doc/controllers/wallet-products.md#list-wallet-products)
* [Create Wallet Product](../../doc/controllers/wallet-products.md#create-wallet-product)
* [Read Wallet Product](../../doc/controllers/wallet-products.md#read-wallet-product)
* [Update Wallet Product](../../doc/controllers/wallet-products.md#update-wallet-product)
* [Read Wallet Product Usage](../../doc/controllers/wallet-products.md#read-wallet-product-usage)
* [Archive Wallet Product](../../doc/controllers/wallet-products.md#archive-wallet-product)
* [Unarchive Wallet Product](../../doc/controllers/wallet-products.md#unarchive-wallet-product)


# List Wallet Products

Lists the Wallet Products on your site.

```java
WalletProductsListResponse listWalletProducts(
    final Boolean includeArchived,
    final Status1 status,
    final String q,
    final SortBy1 sortBy,
    final SortDirection sortDirection,
    final Integer page,
    final Integer perPage)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `includeArchived` | `Boolean` | Query, Optional | Includes archived Wallet Products in the result. Defaults to `false`. Ignored when `status` is also sent. |
| `status` | [`Status1`](../../doc/models/status-1.md) | Query, Optional | Restricts the result by status, and overrides `include_archived` when sent. An unrecognized value falls back to `active` rather than returning `422`. |
| `q` | `String` | Query, Optional | Restricts the result to Wallet Products whose name, handle, or unit name contains this substring (case-insensitive). |
| `sortBy` | [`SortBy1`](../../doc/models/sort-by-1.md) | Query, Optional | The field to sort results by. An unrecognized value falls back to `name`.<br><br>**Default**: `SortBy1.NAME` |
| `sortDirection` | [`SortDirection`](../../doc/models/sort-direction.md) | Query, Optional | The sort direction. Anything other than `desc` is treated as `asc`.<br><br>**Default**: `SortDirection.ASC` |
| `page` | `Integer` | Query, Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br><br>**Default**: `1`<br><br>**Constraints**: `>= 1` |
| `perPage` | `Integer` | Query, Optional | This parameter indicates how many records to fetch in each request. Default value is 20. The maximum allowed values is 200; any per_page value over 200 will be changed to 200.<br>Use in query `per_page=200`.<br><br>**Default**: `20`<br><br>**Constraints**: `<= 200` |

## Response Type

**200**: OK. Unlike most list endpoints, this one is unpaginated (returns the full matching set in one response) unless `page` or `per_page` is sent; sending either turns on pagination, defaulting to 20 per page with a maximum of 200.

[`WalletProductsListResponse`](../../doc/models/wallet-products-list-response.md)

## Example Usage

```java
SortBy1 sortBy = SortBy1.NAME;
SortDirection sortDirection = SortDirection.ASC;
Integer page = 1;
Integer perPage = 50;

try {
    WalletProductsListResponse result = walletProductsController.listWalletProducts(null, null, null, sortBy, sortDirection, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden. The response body is plain text (`403 Forbidden`), not JSON. Returned when the Wallets feature isn't enabled for the site. | `ApiException` |


# Create Wallet Product

Creates a Wallet Product: a billing product with no product family, meant to denominate wallets and to be purchased through [Create Wallet Purchase](../../doc/controllers/wallet-purchases.md#create-wallet-purchase). It's a Component under the hood, so it returns the full Component field set, and can optionally be priced with one or more price points in the same call.

```java
WalletProductResponse createWalletProduct(
    final CreateWalletProductRequest body)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`CreateWalletProductRequest`](../../doc/models/create-wallet-product-request.md) | Body, Optional | Does not accept `product_family_id`: a Wallet Product never belongs to a product family. The underlying endpoint accepts the param, but only to reject it; sending one returns `422` ("Product family cannot be set on a wallet product") rather than silently ignoring it. |

## Response Type

**201**: Wallet Product created.

[`WalletProductResponse`](../../doc/models/wallet-product-response.md)

## Example Usage

```java
CreateWalletProductRequest body = new CreateWalletProductRequest.Builder(
    new WalletProduct.Builder(
        "Token pack",
        "tokens"
    )
    .pricePoint(new WalletProductPricePointAttributes.Builder(
            "Standard"
        )
        .pricingScheme(PricingScheme.PER_UNIT)
        .unitPrice("0.05")
        .build())
    .build()
)
.build();

try {
    WalletProductResponse result = walletProductsController.createWalletProduct(body);
    System.out.println(result);
} catch (WalletErrorResponseException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden. The response body is plain text (`403 Forbidden`), not JSON. Returned when the Wallets feature isn't enabled for the site. | `ApiException` |
| 422 | Validation failure. Includes a `product_family_id` (rejected rather than ignored), and any failure validating a price point in `price_point`/`price_points`, which rolls back the whole call, including the Wallet Product itself. | [`WalletErrorResponseException`](../../doc/models/wallet-error-response-exception.md) |


# Read Wallet Product

Returns the Wallet Product.

```java
WalletProductResponse readWalletProduct(
    final String id)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | The Advanced Billing id of the Wallet Product, or its handle prefixed with `handle:` (for example `handle:token-pack`). A bare handle returns `404`. |

## Response Type

**200**: OK

[`WalletProductResponse`](../../doc/models/wallet-product-response.md)

## Example Usage

```java
String id = "id0";

try {
    WalletProductResponse result = walletProductsController.readWalletProduct(id);
    System.out.println(result);
} catch (WalletErrorResponseException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden. The response body is plain text (`403 Forbidden`), not JSON. Returned when the Wallets feature isn't enabled for the site. | `ApiException` |
| 404 | Not Found | [`WalletErrorResponseException`](../../doc/models/wallet-error-response-exception.md) |


# Update Wallet Product

Updates the Wallet Product's catalog-facing fields. Omitted fields are left unchanged. Unlike [Create Wallet Product](../../doc/controllers/wallet-products.md#create-wallet-product), this does not accept `unit_name`, `handle`, `price_point`, or `price_points`; see the request schema for which fields are actually mutable.

```java
WalletProductResponse updateWalletProduct(
    final String id,
    final UpdateWalletProductRequest body)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | The Advanced Billing id of the Wallet Product, or its handle prefixed with `handle:` (for example `handle:token-pack`). A bare handle returns `404`. |
| `body` | [`UpdateWalletProductRequest`](../../doc/models/update-wallet-product-request.md) | Body, Optional | Only `name`, `description`, `taxable`, `tax_code`, `accounting_code`, and `item_category` are mutable. `unit_name`, `handle`, `price_point`, and `price_points` are not accepted here: the request still returns `200`, but those fields are silently ignored and nothing about them changes. `handle` stays fixed because it's the Wallet Product's only stable identifier on a surface with no product family in the path; `unit_name` stays fixed because a wallet's behavior snapshots it into the wallet's own `unit` field and never re-derives it. |

## Response Type

**200**: Wallet Product updated.

[`WalletProductResponse`](../../doc/models/wallet-product-response.md)

## Example Usage

```java
String id = "id0";
UpdateWalletProductRequest body = new UpdateWalletProductRequest.Builder(
    new WalletProduct1.Builder()
        .itemCategory(ItemCategory.ENUM_BUSINESS_SOFTWARE)
        .build()
)
.build();

try {
    WalletProductResponse result = walletProductsController.updateWalletProduct(id, body);
    System.out.println(result);
} catch (WalletErrorResponseException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden. The response body is plain text (`403 Forbidden`), not JSON. Returned when the Wallets feature isn't enabled for the site. | `ApiException` |
| 404 | Not Found | [`WalletErrorResponseException`](../../doc/models/wallet-error-response-exception.md) |
| 422 | Validation failure. | [`WalletErrorResponseException`](../../doc/models/wallet-error-response-exception.md) |


# Read Wallet Product Usage

Returns everything drawing on this Wallet Product: the wallet templates billing through it, split into ones using its default price point and ones overriding it, plus a sample of up to 50 of the active wallets actually created from them. A wallet template can appear more than once in `wallet_templates`/`price_point_overrides`, once per Feature and owning plan/component sharing it, so these arrays aren't one row per template.

```java
WalletProductUsageResponse readWalletProductUsage(
    final String id)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | The Advanced Billing id of the Wallet Product, or its handle prefixed with `handle:` (for example `handle:token-pack`). A bare handle returns `404`. |

## Response Type

**200**: OK

[`WalletProductUsageResponse`](../../doc/models/wallet-product-usage-response.md)

## Example Usage

```java
String id = "id0";

try {
    WalletProductUsageResponse result = walletProductsController.readWalletProductUsage(id);
    System.out.println(result);
} catch (WalletErrorResponseException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden. The response body is plain text (`403 Forbidden`), not JSON. Returned when the Wallets feature isn't enabled for the site. | `ApiException` |
| 404 | Not Found | [`WalletErrorResponseException`](../../doc/models/wallet-error-response-exception.md) |


# Archive Wallet Product

Archives the Wallet Product. Refuses when an active Feature's `wallet_behavior` still points at it, or when it's used in a scheduled renewal. This protects Feature-provisioned wallets, but not a wallet created manually against this product: a manual wallet can be left denominated by an archived Wallet Product, and [Create Wallet Purchase](../../doc/controllers/wallet-purchases.md#create-wallet-purchase) doesn't check whether the billing product is archived before pricing and charging a purchase against it.

```java
WalletProductResponse archiveWalletProduct(
    final String id)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | The Advanced Billing id of the Wallet Product, or its handle prefixed with `handle:` (for example `handle:token-pack`). A bare handle returns `404`. |

## Response Type

**200**: Wallet Product archived.

[`WalletProductResponse`](../../doc/models/wallet-product-response.md)

## Example Usage

```java
String id = "id0";

try {
    WalletProductResponse result = walletProductsController.archiveWalletProduct(id);
    System.out.println(result);
} catch (WalletErrorResponseException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden. The response body is plain text (`403 Forbidden`), not JSON. Returned when the Wallets feature isn't enabled for the site. | `ApiException` |
| 404 | Not Found | [`WalletErrorResponseException`](../../doc/models/wallet-error-response-exception.md) |
| 422 | The Wallet Product is already archived, is in use by one or more Features, or is in use by a scheduled renewal. | [`WalletErrorResponseException`](../../doc/models/wallet-error-response-exception.md) |


# Unarchive Wallet Product

Restores an archived Wallet Product.

```java
WalletProductResponse unarchiveWalletProduct(
    final String id)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | The Advanced Billing id of the Wallet Product, or its handle prefixed with `handle:` (for example `handle:token-pack`). A bare handle returns `404`. |

## Response Type

**200**: Wallet Product unarchived.

[`WalletProductResponse`](../../doc/models/wallet-product-response.md)

## Example Usage

```java
String id = "id0";

try {
    WalletProductResponse result = walletProductsController.unarchiveWalletProduct(id);
    System.out.println(result);
} catch (WalletErrorResponseException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden. The response body is plain text (`403 Forbidden`), not JSON. Returned when the Wallets feature isn't enabled for the site. | `ApiException` |
| 404 | Not Found | [`WalletErrorResponseException`](../../doc/models/wallet-error-response-exception.md) |
| 422 | The Wallet Product is not archived. | [`WalletErrorResponseException`](../../doc/models/wallet-error-response-exception.md) |

