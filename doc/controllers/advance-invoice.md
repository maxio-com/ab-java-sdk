# Advance Invoice

```java
AdvanceInvoiceController advanceInvoiceController = client.getAdvanceInvoiceController();
```

## Class Name

`AdvanceInvoiceController`

## Methods

* [Issue Advance Invoice](../../doc/controllers/advance-invoice.md#issue-advance-invoice)
* [Read Advance Invoice](../../doc/controllers/advance-invoice.md#read-advance-invoice)
* [Void Advance Invoice](../../doc/controllers/advance-invoice.md#void-advance-invoice)


# Issue Advance Invoice

Generate an invoice in advance for a subscription's next renewal date. [Please see our docs](reference/Chargify-API.v1.yaml/components/schemas/Invoice) for more information on advance invoices, including eligibility on generating one; for the most part, they function like any other invoice, except they are issued early and have special behavior upon being voided.
A subscription may only have one advance invoice per billing period. Attempting to issue an advance invoice when one already exists will return an error.
That said, regeneration of the invoice may be forced with the params `force: true`, which will void an advance invoice if one exists and generate a new one. If no advance invoice exists, a new one will be generated.
We recommend using either the create or preview endpoints for proforma invoices to preview this advance invoice before using this endpoint to generate it.

```java
CompletableFuture<Invoice> issueAdvanceInvoiceAsync(
    final String subscriptionId,
    final IssueAdvanceInvoiceRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The Chargify id of the subscription |
| `body` | [`IssueAdvanceInvoiceRequest`](../../doc/models/issue-advance-invoice-request.md) | Body, Optional | - |

## Response Type

[`Invoice`](../../doc/models/invoice.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
IssueAdvanceInvoiceRequest body = new IssueAdvanceInvoiceRequest.Builder()
    .force(true)
    .build();

advanceInvoiceController.issueAdvanceInvoiceAsync(subscriptionId, body).thenAccept(result -> {
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
| 403 | Forbidden | `ApiException` |
| 404 | Not Found | `ApiException` |
| 422 | Unprocessable Entity (WebDAV) | [`ErrorListResponseException`](../../doc/models/error-list-response-exception.md) |


# Read Advance Invoice

Once an advance invoice has been generated for a subscription's upcoming renewal, it can be viewed through this endpoint. There can only be one advance invoice per subscription per billing cycle.

```java
CompletableFuture<Invoice> readAdvanceInvoiceAsync(
    final String subscriptionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The Chargify id of the subscription |

## Response Type

[`Invoice`](../../doc/models/invoice.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";

advanceInvoiceController.readAdvanceInvoiceAsync(subscriptionId).thenAccept(result -> {
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
| 403 | Forbidden | `ApiException` |
| 404 | Not Found | `ApiException` |


# Void Advance Invoice

Void a subscription's existing advance invoice. Once voided, it can later be regenerated if desired.
A `reason` is required in order to void, and the invoice must have an open status. Voiding will cause any prepayments and credits that were applied to the invoice to be returned to the subscription. For a full overview of the impact of voiding, please [see our help docs](reference/Chargify-API.v1.yaml/components/schemas/Invoice).

```java
CompletableFuture<Invoice> voidAdvanceInvoiceAsync(
    final String subscriptionId,
    final VoidInvoiceRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The Chargify id of the subscription |
| `body` | [`VoidInvoiceRequest`](../../doc/models/void-invoice-request.md) | Body, Optional | - |

## Response Type

[`Invoice`](../../doc/models/invoice.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
advanceInvoiceController.voidAdvanceInvoiceAsync(subscriptionId, null).thenAccept(result -> {
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
| 403 | Forbidden | `ApiException` |
| 404 | Not Found | `ApiException` |

