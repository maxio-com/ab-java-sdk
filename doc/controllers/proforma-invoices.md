# Proforma Invoices

```java
ProformaInvoicesController proformaInvoicesController = client.getProformaInvoicesController();
```

## Class Name

`ProformaInvoicesController`

## Methods

* [Create Consolidated Proforma Invoice](../../doc/controllers/proforma-invoices.md#create-consolidated-proforma-invoice)
* [List Subscription Group Proforma Invoices](../../doc/controllers/proforma-invoices.md#list-subscription-group-proforma-invoices)
* [Read Proforma Invoice](../../doc/controllers/proforma-invoices.md#read-proforma-invoice)
* [Create Proforma Invoice](../../doc/controllers/proforma-invoices.md#create-proforma-invoice)
* [List Proforma Invoices](../../doc/controllers/proforma-invoices.md#list-proforma-invoices)
* [Void Proforma Invoice](../../doc/controllers/proforma-invoices.md#void-proforma-invoice)
* [Preview Proforma Invoice](../../doc/controllers/proforma-invoices.md#preview-proforma-invoice)
* [Create Signup Proforma Invoice](../../doc/controllers/proforma-invoices.md#create-signup-proforma-invoice)
* [Preview Signup Proforma Invoice](../../doc/controllers/proforma-invoices.md#preview-signup-proforma-invoice)


# Create Consolidated Proforma Invoice

This endpoint will trigger the creation of a consolidated proforma invoice asynchronously. It will return a 201 with no message, or a 422 with any errors. To find and view the new consolidated proforma invoice, you may poll the subscription group listing for proforma invoices; only one consolidated proforma invoice may be created per group at a time.

If the information becomes outdated, simply void the old consolidated proforma invoice and generate a new one.

## Restrictions

Proforma invoices are only available on Relationship Invoicing sites. To create a proforma invoice, the subscription must not be prepaid, and must be in a live state.

```java
Void createConsolidatedProformaInvoice(
    final String uid)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `uid` | `String` | Template, Required | The uid of the subscription group |

## Response Type

`void`

## Example Usage

```java
String uid = "uid0";

try {
    proformaInvoicesController.createConsolidatedProformaInvoice(uid);
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


# List Subscription Group Proforma Invoices

Only proforma invoices with a `consolidation_level` of parent are returned.

By default, proforma invoices returned on the index will only include totals, not detailed breakdowns for `line_items`, `discounts`, `taxes`, `credits`, `payments`, `custom_fields`. To include breakdowns, pass the specific field as a key in the query with a value set to true.

```java
ProformaInvoice listSubscriptionGroupProformaInvoices(
    final String uid)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `uid` | `String` | Template, Required | The uid of the subscription group |

## Response Type

[`ProformaInvoice`](../../doc/models/proforma-invoice.md)

## Example Usage

```java
String uid = "uid0";

try {
    ProformaInvoice result = proformaInvoicesController.listSubscriptionGroupProformaInvoices(uid);
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
| 403 | Forbidden | `ApiException` |
| 404 | Not Found | `ApiException` |


# Read Proforma Invoice

Use this endpoint to read the details of an existing proforma invoice.

## Restrictions

Proforma invoices are only available on Relationship Invoicing sites.

```java
ProformaInvoice readProformaInvoice(
    final int proformaInvoiceUid)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `proformaInvoiceUid` | `int` | Template, Required | The uid of the proforma invoice |

## Response Type

[`ProformaInvoice`](../../doc/models/proforma-invoice.md)

## Example Usage

```java
int proformaInvoiceUid = 242;

try {
    ProformaInvoice result = proformaInvoicesController.readProformaInvoice(proformaInvoiceUid);
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
| 403 | Forbidden | `ApiException` |
| 404 | Not Found | `ApiException` |


# Create Proforma Invoice

This endpoint will create a proforma invoice and return it as a response. If the information becomes outdated, simply void the old proforma invoice and generate a new one.

If you would like to preview the next billing amounts without generating a full proforma invoice, please use the renewal preview endpoint.

## Restrictions

Proforma invoices are only available on Relationship Invoicing sites. To create a proforma invoice, the subscription must not be in a group, must not be prepaid, and must be in a live state.

```java
ProformaInvoice createProformaInvoice(
    final String subscriptionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The Chargify id of the subscription |

## Response Type

[`ProformaInvoice`](../../doc/models/proforma-invoice.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";

try {
    ProformaInvoice result = proformaInvoicesController.createProformaInvoice(subscriptionId);
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
| 403 | Forbidden | `ApiException` |
| 422 | Unprocessable Entity (WebDAV) | [`ErrorListResponseException`](../../doc/models/error-list-response-exception.md) |


# List Proforma Invoices

By default, proforma invoices returned on the index will only include totals, not detailed breakdowns for `line_items`, `discounts`, `taxes`, `credits`, `payments`, or `custom_fields`. To include breakdowns, pass the specific field as a key in the query with a value set to `true`.

```java
List<ProformaInvoice> listProformaInvoices(
    final ListProformaInvoicesInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The Chargify id of the subscription |
| `startDate` | `String` | Query, Optional | The beginning date range for the invoice's Due Date, in the YYYY-MM-DD format. |
| `endDate` | `String` | Query, Optional | The ending date range for the invoice's Due Date, in the YYYY-MM-DD format. |
| `status` | [`Status`](../../doc/models/status.md) | Query, Optional | The current status of the invoice.  Allowed Values: draft, open, paid, pending, voided |
| `page` | `Integer` | Query, Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br>**Default**: `1`<br>**Constraints**: `>= 1` |
| `perPage` | `Integer` | Query, Optional | This parameter indicates how many records to fetch in each request. Default value is 20. The maximum allowed values is 200; any per_page value over 200 will be changed to 200.<br>Use in query `per_page=200`.<br>**Default**: `20`<br>**Constraints**: `<= 200` |
| `direction` | [`Direction`](../../doc/models/direction.md) | Query, Optional | The sort direction of the returned invoices.<br>**Default**: `Direction.DESC` |
| `lineItems` | `Boolean` | Query, Optional | Include line items data<br>**Default**: `false` |
| `discounts` | `Boolean` | Query, Optional | Include discounts data<br>**Default**: `false` |
| `taxes` | `Boolean` | Query, Optional | Include taxes data<br>**Default**: `false` |
| `credits` | `Boolean` | Query, Optional | Include credits data<br>**Default**: `false` |
| `payments` | `Boolean` | Query, Optional | Include payments data<br>**Default**: `false` |
| `customFields` | `Boolean` | Query, Optional | Include custom fields data<br>**Default**: `false` |

## Response Type

[`List<ProformaInvoice>`](../../doc/models/proforma-invoice.md)

## Example Usage

```java
ListProformaInvoicesInput listProformaInvoicesInput = new ListProformaInvoicesInput.Builder(
    "subscription_id0"
)
.page(2)
.perPage(50)
.direction(Direction.DESC)
.lineItems(false)
.discounts(false)
.taxes(false)
.credits(false)
.payments(false)
.customFields(false)
.build();

try {
    List<ProformaInvoice> result = proformaInvoicesController.listProformaInvoices(listProformaInvoicesInput);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Void Proforma Invoice

This endpoint will void a proforma invoice that has the status "draft".

## Restrictions

Proforma invoices are only available on Relationship Invoicing sites.

Only proforma invoices that have the appropriate status may be reopened. If the invoice identified by {uid} does not have the appropriate status, the response will have HTTP status code 422 and an error message.

A reason for the void operation is required to be included in the request body. If one is not provided, the response will have HTTP status code 422 and an error message.

```java
ProformaInvoice voidProformaInvoice(
    final String proformaInvoiceUid,
    final VoidInvoiceRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `proformaInvoiceUid` | `String` | Template, Required | The uid of the proforma invoice |
| `body` | [`VoidInvoiceRequest`](../../doc/models/void-invoice-request.md) | Body, Optional | - |

## Response Type

[`ProformaInvoice`](../../doc/models/proforma-invoice.md)

## Example Usage

```java
String proformaInvoiceUid = "proforma_invoice_uid4";
try {
    ProformaInvoice result = proformaInvoicesController.voidProformaInvoice(proformaInvoiceUid, null);
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
| 403 | Forbidden | `ApiException` |
| 404 | Not Found | `ApiException` |
| 422 | Unprocessable Entity (WebDAV) | [`ErrorListResponseException`](../../doc/models/error-list-response-exception.md) |


# Preview Proforma Invoice

Return a preview of the data that will be included on a given subscription's proforma invoice if one were to be generated. It will have similar line items and totals as a renewal preview, but the response will be presented in the format of a proforma invoice. Consequently it will include additional information such as the name and addresses that will appear on the proforma invoice.

The preview endpoint is subject to all the same conditions as the proforma invoice endpoint. For example, previews are only available on the Relationship Invoicing architecture, and previews cannot be made for end-of-life subscriptions.

If all the data returned in the preview is as expected, you may then create a static proforma invoice and send it to your customer. The data within a preview will not be saved and will not be accessible after the call is made.

Alternatively, if you have some proforma invoices already, you may make a preview call to determine whether any billing information for the subscription's upcoming renewal has changed.

```java
ProformaInvoicePreview previewProformaInvoice(
    final String subscriptionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The Chargify id of the subscription |

## Response Type

[`ProformaInvoicePreview`](../../doc/models/proforma-invoice-preview.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";

try {
    ProformaInvoicePreview result = proformaInvoicesController.previewProformaInvoice(subscriptionId);
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
| 403 | Forbidden | `ApiException` |
| 404 | Not Found | `ApiException` |
| 422 | Unprocessable Entity (WebDAV) | [`ErrorListResponseException`](../../doc/models/error-list-response-exception.md) |


# Create Signup Proforma Invoice

This endpoint is only available for Relationship Invoicing sites. It cannot be used to create consolidated proforma invoices or preview prepaid subscriptions.

Create a proforma invoice to preview costs before a subscription's signup. Like other proforma invoices, it can be emailed to the customer, voided, and publicly viewed on the chargifypay domain.

Pass a payload that resembles a subscription create or signup preview request. For example, you can specify components, coupons/a referral, offers, custom pricing, and an existing customer or payment profile to populate a shipping or billing address.

A product and customer first name, last name, and email are the minimum requirements. We recommend associating the proforma invoice with a customer_id to easily find their proforma invoices, since the subscription_id will always be blank.

```java
ProformaInvoice createSignupProformaInvoice(
    final CreateSubscriptionRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`CreateSubscriptionRequest`](../../doc/models/create-subscription-request.md) | Body, Optional | - |

## Response Type

[`ProformaInvoice`](../../doc/models/proforma-invoice.md)

## Example Usage

```java
CreateSubscriptionRequest body = new CreateSubscriptionRequest.Builder(
    new CreateSubscription.Builder()
        .productHandle("gold-product")
        .customerAttributes(new CustomerAttributes.Builder()
            .firstName("Myra")
            .lastName("Maisel")
            .email("mmaisel@example.com")
            .build())
        .build()
)
.build();

try {
    ProformaInvoice result = proformaInvoicesController.createSignupProformaInvoice(body);
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
| 400 | Bad Request | [`ProformaBadRequestErrorResponseException`](../../doc/models/proforma-bad-request-error-response-exception.md) |
| 403 | Forbidden | `ApiException` |
| 422 | Unprocessable Entity (WebDAV) | [`ErrorMapResponseException`](../../doc/models/error-map-response-exception.md) |


# Preview Signup Proforma Invoice

This endpoint is only available for Relationship Invoicing sites. It cannot be used to create consolidated proforma invoice previews or preview prepaid subscriptions.

Create a signup preview in the format of a proforma invoice to preview costs before a subscription's signup. You have the option of optionally previewing the first renewal's costs as well. The proforma invoice preview will not be persisted.

Pass a payload that resembles a subscription create or signup preview request. For example, you can specify components, coupons/a referral, offers, custom pricing, and an existing customer or payment profile to populate a shipping or billing address.

A product and customer first name, last name, and email are the minimum requirements.

```java
SignupProformaPreviewResponse previewSignupProformaInvoice(
    final String includeNextProformaInvoice,
    final CreateSubscriptionRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `includeNextProformaInvoice` | `String` | Query, Optional | Choose to include a proforma invoice preview for the first renewal |
| `body` | [`CreateSubscriptionRequest`](../../doc/models/create-subscription-request.md) | Body, Optional | - |

## Response Type

[`SignupProformaPreviewResponse`](../../doc/models/signup-proforma-preview-response.md)

## Example Usage

```java
CreateSubscriptionRequest body = new CreateSubscriptionRequest.Builder(
    new CreateSubscription.Builder()
        .productHandle("gold-plan")
        .customerAttributes(new CustomerAttributes.Builder()
            .firstName("first")
            .lastName("last")
            .email("flast@example.com")
            .build())
        .build()
)
.build();

try {
    SignupProformaPreviewResponse result = proformaInvoicesController.previewSignupProformaInvoice(null, body);
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
| 400 | Bad Request | [`ProformaBadRequestErrorResponseException`](../../doc/models/proforma-bad-request-error-response-exception.md) |
| 403 | Forbidden | `ApiException` |
| 422 | Unprocessable Entity (WebDAV) | [`ErrorMapResponseException`](../../doc/models/error-map-response-exception.md) |

