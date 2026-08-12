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

Lists exported proforma invoices for a provided `batch_id`. Use pagination to control responses returned from the server.

Example: `GET https://{subdomain}.chargify.com/api_exports/proforma_invoices/123/rows?per_page=10000&page=1`.

```java
List<ProformaInvoice> listExportedProformaInvoices(
    final ListExportedProformaInvoicesInput input)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `input` | [`ListExportedProformaInvoicesInput`](../../doc/models/list-exported-proforma-invoices-input.md) | Required | Input structure for the method ListExportedProformaInvoices |

## Response Type

**200**: OK

[`List<ProformaInvoice>`](../../doc/models/proforma-invoice.md)

## Example Usage

```java
ListExportedProformaInvoicesInput listExportedProformaInvoicesInput = new ListExportedProformaInvoicesInput.Builder(
    "batch_id8"
)
.perPage(100)
.page(1)
.build();

try {
    List<ProformaInvoice> result = aPIExportsController.listExportedProformaInvoices(listExportedProformaInvoicesInput);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found | `ApiException` |


# List Exported Invoices

Lists exported invoices for a provided `batch_id`. Use pagination to control responses returned from the server.

Example: `GET https://{subdomain}.chargify.com/api_exports/invoices/123/rows?per_page=10000&page=1`.

```java
List<Invoice> listExportedInvoices(
    final ListExportedInvoicesInput input)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `input` | [`ListExportedInvoicesInput`](../../doc/models/list-exported-invoices-input.md) | Required | Input structure for the method ListExportedInvoices |

## Response Type

**200**: OK

[`List<Invoice>`](../../doc/models/invoice.md)

## Example Usage

```java
ListExportedInvoicesInput listExportedInvoicesInput = new ListExportedInvoicesInput.Builder(
    "batch_id8"
)
.perPage(100)
.page(1)
.build();

try {
    List<Invoice> result = aPIExportsController.listExportedInvoices(listExportedInvoicesInput);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found | `ApiException` |


# List Exported Subscriptions

Lists exported subscriptions for a provided `batch_id`. Use pagination to control responses returned from the server.

Example: `GET https://{subdomain}.chargify.com/api_exports/subscriptions/123/rows?per_page=200&page=1`.

```java
List<Subscription> listExportedSubscriptions(
    final ListExportedSubscriptionsInput input)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `input` | [`ListExportedSubscriptionsInput`](../../doc/models/list-exported-subscriptions-input.md) | Required | Input structure for the method ListExportedSubscriptions |

## Response Type

**200**: OK

[`List<Subscription>`](../../doc/models/subscription.md)

## Example Usage

```java
ListExportedSubscriptionsInput listExportedSubscriptionsInput = new ListExportedSubscriptionsInput.Builder(
    "batch_id8"
)
.perPage(100)
.page(1)
.build();

try {
    List<Subscription> result = aPIExportsController.listExportedSubscriptions(listExportedSubscriptionsInput);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found | `ApiException` |


# Export Proforma Invoices

Creates a proforma invoices export and returns a batch job object. Proforma invoices are only available on Relationship Invoicing sites.

```java
BatchJobResponse exportProformaInvoices()
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Response Type

**201**: Created

[`BatchJobResponse`](../../doc/models/batch-job-response.md)

## Example Usage

```java
try {
    BatchJobResponse result = aPIExportsController.exportProformaInvoices();
    System.out.println(result);
} catch (SingleErrorResponseException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found | `ApiException` |
| 409 | Conflict | [`SingleErrorResponseException`](../../doc/models/single-error-response-exception.md) |


# Export Invoices

Creates an invoices export and returns a batch job object.

```java
BatchJobResponse exportInvoices()
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Response Type

**201**: Created

[`BatchJobResponse`](../../doc/models/batch-job-response.md)

## Example Usage

```java
try {
    BatchJobResponse result = aPIExportsController.exportInvoices();
    System.out.println(result);
} catch (SingleErrorResponseException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found | `ApiException` |
| 409 | Conflict | [`SingleErrorResponseException`](../../doc/models/single-error-response-exception.md) |


# Export Subscriptions

Creates a subscriptions export and returns a batch job object.

```java
BatchJobResponse exportSubscriptions()
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Response Type

**201**: Created

[`BatchJobResponse`](../../doc/models/batch-job-response.md)

## Example Usage

```java
try {
    BatchJobResponse result = aPIExportsController.exportSubscriptions();
    System.out.println(result);
} catch (SingleErrorResponseException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 409 | Conflict | [`SingleErrorResponseException`](../../doc/models/single-error-response-exception.md) |


# Read Proforma Invoices Export

Returns a batch job object for a proforma invoices export. Proforma invoices are only available on Relationship Invoicing sites.

```java
BatchJobResponse readProformaInvoicesExport(
    final String batchId)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `batchId` | `String` | Template, Required | Id of a Batch Job. |

## Response Type

**200**: OK

[`BatchJobResponse`](../../doc/models/batch-job-response.md)

## Example Usage

```java
String batchId = "batch_id8";

try {
    BatchJobResponse result = aPIExportsController.readProformaInvoicesExport(batchId);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found | `ApiException` |


# Read Invoices Export

Returns a batch job object for an invoices export.

```java
BatchJobResponse readInvoicesExport(
    final String batchId)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `batchId` | `String` | Template, Required | Id of a Batch Job. |

## Response Type

**200**: OK

[`BatchJobResponse`](../../doc/models/batch-job-response.md)

## Example Usage

```java
String batchId = "batch_id8";

try {
    BatchJobResponse result = aPIExportsController.readInvoicesExport(batchId);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found | `ApiException` |


# Read Subscriptions Export

Returns a batch job object for a subscriptions export.

```java
BatchJobResponse readSubscriptionsExport(
    final String batchId)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `batchId` | `String` | Template, Required | Id of a Batch Job. |

## Response Type

**200**: OK

[`BatchJobResponse`](../../doc/models/batch-job-response.md)

## Example Usage

```java
String batchId = "batch_id8";

try {
    BatchJobResponse result = aPIExportsController.readSubscriptionsExport(batchId);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found | `ApiException` |

