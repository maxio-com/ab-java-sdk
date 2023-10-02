# API Exports

```java
APIExportsController aPIExportsController = client.getAPIExportsController();
```

## Class Name

`APIExportsController`

## Methods

* [List Exported Proforma Invoices](../../doc/controllers/api-exports.md#list-exported-proforma-invoices)
* [List Exported Invoices](../../doc/controllers/api-exports.md#list-exported-invoices)
* [List Exported Subscriptions](../../doc/controllers/api-exports.md#list-exported-subscriptions)
* [Export Proforma Invoices](../../doc/controllers/api-exports.md#export-proforma-invoices)
* [Export Invoices](../../doc/controllers/api-exports.md#export-invoices)
* [Export Subscriptions](../../doc/controllers/api-exports.md#export-subscriptions)
* [Read Proforma Invoices Export](../../doc/controllers/api-exports.md#read-proforma-invoices-export)
* [Read Invoices Export](../../doc/controllers/api-exports.md#read-invoices-export)
* [Read Subscriptions Export](../../doc/controllers/api-exports.md#read-subscriptions-export)


# List Exported Proforma Invoices

This API returns an array of exported proforma invoices for a provided `batch_id`. Pay close attention to pagination in order to control responses from the server.

Example: `GET https://{subdomain}.chargify.com/api_exports/proforma_invoices/123/rows?per_page=10000&page=1`.

```java
CompletableFuture<List<ProformaInvoice>> listExportedProformaInvoicesAsync(
    final String batchId,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `batchId` | `String` | Template, Required | Id of a Batch Job. |
| `perPage` | `Integer` | Query, Optional | This parameter indicates how many records to fetch in each request.<br>Default value is 100.<br>The maximum allowed values is 10000; any per_page value over 10000 will be changed to 10000.<br>**Default**: `100`<br>**Constraints**: `>= 1`, `<= 10000` |
| `page` | `Integer` | Query, Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br>**Default**: `1`<br>**Constraints**: `>= 1` |

## Response Type

[`List<ProformaInvoice>`](../../doc/models/proforma-invoice.md)

## Example Usage

```java
String batchId = "batch_id8";
Integer perPage = 100;
Integer page = 2;

aPIExportsController.listExportedProformaInvoicesAsync(batchId, perPage, page).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found | `ApiException` |


# List Exported Invoices

This API returns an array of exported invoices for a provided `batch_id`. Pay close attention to pagination in order to control responses from the server.

Example: `GET https://{subdomain}.chargify.com/api_exports/invoices/123/rows?per_page=10000&page=1`.

```java
CompletableFuture<List<Invoice>> listExportedInvoicesAsync(
    final String batchId,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `batchId` | `String` | Template, Required | Id of a Batch Job. |
| `perPage` | `Integer` | Query, Optional | This parameter indicates how many records to fetch in each request.<br>Default value is 100.<br>The maximum allowed values is 10000; any per_page value over 10000 will be changed to 10000.<br>**Default**: `100`<br>**Constraints**: `>= 1`, `<= 10000` |
| `page` | `Integer` | Query, Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br>**Default**: `1`<br>**Constraints**: `>= 1` |

## Response Type

[`List<Invoice>`](../../doc/models/invoice.md)

## Example Usage

```java
String batchId = "batch_id8";
Integer perPage = 100;
Integer page = 2;

aPIExportsController.listExportedInvoicesAsync(batchId, perPage, page).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found | `ApiException` |


# List Exported Subscriptions

This API returns an array of exported subscriptions for a provided `batch_id`. Pay close attention to pagination in order to control responses from the server.

Example: `GET https://{subdomain}.chargify.com/api_exports/subscriptions/123/rows?per_page=200&page=1`.

```java
CompletableFuture<List<Subscription>> listExportedSubscriptionsAsync(
    final String batchId,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `batchId` | `String` | Template, Required | Id of a Batch Job. |
| `perPage` | `Integer` | Query, Optional | This parameter indicates how many records to fetch in each request.<br>Default value is 100.<br>The maximum allowed values is 10000; any per_page value over 10000 will be changed to 10000.<br>**Default**: `100`<br>**Constraints**: `>= 1`, `<= 10000` |
| `page` | `Integer` | Query, Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br>**Default**: `1`<br>**Constraints**: `>= 1` |

## Response Type

[`List<Subscription>`](../../doc/models/subscription.md)

## Example Usage

```java
String batchId = "batch_id8";
Integer perPage = 100;
Integer page = 2;

aPIExportsController.listExportedSubscriptionsAsync(batchId, perPage, page).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found | `ApiException` |


# Export Proforma Invoices

This API creates a proforma invoices export and returns a batchjob object.

It is only available for Relationship Invoicing architecture.

```java
CompletableFuture<BatchJobResponse> exportProformaInvoicesAsync()
```

## Response Type

[`BatchJobResponse`](../../doc/models/batch-job-response.md)

## Example Usage

```java
aPIExportsController.exportProformaInvoicesAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found | `ApiException` |
| 409 | Conflict | [`SingleErrorResponseException`](../../doc/models/single-error-response-exception.md) |


# Export Invoices

This API creates an invoices export and returns a batchjob object.

```java
CompletableFuture<BatchJobResponse> exportInvoicesAsync()
```

## Response Type

[`BatchJobResponse`](../../doc/models/batch-job-response.md)

## Example Usage

```java
aPIExportsController.exportInvoicesAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found | `ApiException` |
| 409 | Conflict | [`SingleErrorResponseException`](../../doc/models/single-error-response-exception.md) |


# Export Subscriptions

This API creates a subscriptions export and returns a batchjob object.

```java
CompletableFuture<BatchJobResponse> exportSubscriptionsAsync()
```

## Response Type

[`BatchJobResponse`](../../doc/models/batch-job-response.md)

## Example Usage

```java
aPIExportsController.exportSubscriptionsAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 409 | Conflict | [`SingleErrorResponseException`](../../doc/models/single-error-response-exception.md) |


# Read Proforma Invoices Export

This API returns a batchjob object for proforma invoices export.

```java
CompletableFuture<BatchJobResponse> readProformaInvoicesExportAsync(
    final String batchId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `batchId` | `String` | Template, Required | Id of a Batch Job. |

## Response Type

[`BatchJobResponse`](../../doc/models/batch-job-response.md)

## Example Usage

```java
String batchId = "batch_id8";

aPIExportsController.readProformaInvoicesExportAsync(batchId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found | `ApiException` |


# Read Invoices Export

This API returns a batchjob object for invoices export.

```java
CompletableFuture<BatchJobResponse> readInvoicesExportAsync(
    final String batchId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `batchId` | `String` | Template, Required | Id of a Batch Job. |

## Response Type

[`BatchJobResponse`](../../doc/models/batch-job-response.md)

## Example Usage

```java
String batchId = "batch_id8";

aPIExportsController.readInvoicesExportAsync(batchId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found | `ApiException` |


# Read Subscriptions Export

This API returns a batchjob object for subscriptions export.

```java
CompletableFuture<BatchJobResponse> readSubscriptionsExportAsync(
    final String batchId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `batchId` | `String` | Template, Required | Id of a Batch Job. |

## Response Type

[`BatchJobResponse`](../../doc/models/batch-job-response.md)

## Example Usage

```java
String batchId = "batch_id8";

aPIExportsController.readSubscriptionsExportAsync(batchId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found | `ApiException` |

