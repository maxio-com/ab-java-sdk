# Subscription Invoice Account

```java
SubscriptionInvoiceAccountController subscriptionInvoiceAccountController = client.getSubscriptionInvoiceAccountController();
```

## Class Name

`SubscriptionInvoiceAccountController`

## Methods

* [Read Account Balances](../../doc/controllers/subscription-invoice-account.md#read-account-balances)
* [Create Prepayment](../../doc/controllers/subscription-invoice-account.md#create-prepayment)
* [List Prepayments](../../doc/controllers/subscription-invoice-account.md#list-prepayments)
* [Issue Service Credit](../../doc/controllers/subscription-invoice-account.md#issue-service-credit)
* [Deduct Service Credit](../../doc/controllers/subscription-invoice-account.md#deduct-service-credit)
* [Refund Prepayment](../../doc/controllers/subscription-invoice-account.md#refund-prepayment)


# Read Account Balances

Returns the `balance_in_cents` of the Subscription's Pending Discount, Service Credit, and Prepayment accounts, as well as the sum of the Subscription's open, payable invoices.

```java
AccountBalances readAccountBalances(
    final String subscriptionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The Chargify id of the subscription |

## Response Type

[`AccountBalances`](../../doc/models/account-balances.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";

try {
    AccountBalances result = subscriptionInvoiceAccountController.readAccountBalances(subscriptionId);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Create Prepayment

## Create Prepayment

In order to specify a prepayment made against a subscription, specify the `amount, memo, details, method`.

When the `method` specified is `"credit_card_on_file"`, the prepayment amount will be collected using the default credit card payment profile and applied to the prepayment account balance.  This is especially useful for manual replenishment of prepaid subscriptions.

Please note that you **can't** pass `amount_in_cents`.

```java
CreatePrepaymentResponse createPrepayment(
    final String subscriptionId,
    final CreatePrepaymentRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The Chargify id of the subscription |
| `body` | [`CreatePrepaymentRequest`](../../doc/models/create-prepayment-request.md) | Body, Optional | - |

## Response Type

[`CreatePrepaymentResponse`](../../doc/models/create-prepayment-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
CreatePrepaymentRequest body = new CreatePrepaymentRequest.Builder(
    new CreatePrepayment.Builder(
        100D,
        "John Doe signup for $100",
        "Signup for $100",
        PrepaymentMethod.CHECK
    )
    .build()
)
.build();

try {
    CreatePrepaymentResponse result = subscriptionInvoiceAccountController.createPrepayment(subscriptionId, body);
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
  "prepayment": {
    "id": 1,
    "subscription_id": 1,
    "amount_in_cents": 10000,
    "memo": "John Doe - Prepayment",
    "created_at": "2020-07-31T05:52:32-04:00",
    "starting_balance_in_cents": 0,
    "ending_balance_in_cents": -10000
  }
}
```


# List Prepayments

This request will list a subscription's prepayments.

```java
PrepaymentsResponse listPrepayments(
    final ListPrepaymentsInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The Chargify id of the subscription |
| `page` | `Integer` | Query, Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br>**Default**: `1`<br>**Constraints**: `>= 1` |
| `perPage` | `Integer` | Query, Optional | This parameter indicates how many records to fetch in each request. Default value is 20. The maximum allowed values is 200; any per_page value over 200 will be changed to 200.<br>Use in query `per_page=200`.<br>**Default**: `20`<br>**Constraints**: `<= 200` |
| `filterDateField` | [`BasicDateField`](../../doc/models/basic-date-field.md) | Query, Optional | The type of filter you would like to apply to your search. created_at - Time when prepayment was created. application_at - Time when prepayment was applied to invoice. Use in query `filter[date_field]=created_at`. |
| `filterStartDate` | `String` | Query, Optional | The start date (format YYYY-MM-DD) with which to filter the date_field. Returns prepayments with a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date specified. Use in query `filter[start_date]=2011-12-15`. |
| `filterEndDate` | `String` | Query, Optional | The end date (format YYYY-MM-DD) with which to filter the date_field. Returns prepayments with a timestamp up to and including 11:59:59PM in your site’s time zone on the date specified. Use in query `filter[end_date]=2011-12-15`. |

## Response Type

[`PrepaymentsResponse`](../../doc/models/prepayments-response.md)

## Example Usage

```java
ListPrepaymentsInput listPrepaymentsInput = new ListPrepaymentsInput.Builder(
    "subscription_id0"
)
.page(2)
.perPage(50)
Liquid error: Value cannot be null. (Parameter 'key')Liquid error: Value cannot be null. (Parameter 'key')Liquid error: Value cannot be null. (Parameter 'key').build();

try {
    PrepaymentsResponse result = subscriptionInvoiceAccountController.listPrepayments(listPrepaymentsInput);
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
  "prepayments": [
    {
      "id": 17,
      "subscription_id": 3558750,
      "amount_in_cents": 2000,
      "remaining_amount_in_cents": 1100,
      "refunded_amount_in_cents": 0,
      "external": true,
      "memo": "test",
      "details": "test details",
      "payment_type": "cash",
      "created_at": "2022-01-18T22:45:41+11:00"
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized | `ApiException` |
| 403 | Forbidden | `ApiException` |
| 404 | Not Found | `ApiException` |


# Issue Service Credit

Credit will be added to the subscription in the amount specified in the request body. The credit is subsequently applied to the next generated invoice.

```java
ServiceCredit issueServiceCredit(
    final String subscriptionId,
    final IssueServiceCreditRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The Chargify id of the subscription |
| `body` | [`IssueServiceCreditRequest`](../../doc/models/issue-service-credit-request.md) | Body, Optional | - |

## Response Type

[`ServiceCredit`](../../doc/models/service-credit.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
IssueServiceCreditRequest body = new IssueServiceCreditRequest.Builder(
    new IssueServiceCredit.Builder(
        IssueServiceCreditAmount.fromMString(
            "1"
        ),
        "Courtesy credit"
    )
    .build()
)
.build();

try {
    ServiceCredit result = subscriptionInvoiceAccountController.issueServiceCredit(subscriptionId, body);
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
  "id": 101,
  "amount_in_cents": 1000,
  "ending_balance_in_cents": 2000,
  "entry_type": "Credit",
  "memo": "Credit to group account"
}
```


# Deduct Service Credit

Credit will be removed from the subscription in the amount specified in the request body. The credit amount being deducted must be equal to or less than the current credit balance.

```java
Void deductServiceCredit(
    final String subscriptionId,
    final DeductServiceCreditRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The Chargify id of the subscription |
| `body` | [`DeductServiceCreditRequest`](../../doc/models/deduct-service-credit-request.md) | Body, Optional | - |

## Response Type

`void`

## Example Usage

```java
String subscriptionId = "subscription_id0";
DeductServiceCreditRequest body = new DeductServiceCreditRequest.Builder(
    new DeductServiceCredit.Builder(
        DeductServiceCreditAmount.fromMString(
            "1"
        ),
        "Deduction"
    )
    .build()
)
.build();

try {
    subscriptionInvoiceAccountController.deductServiceCredit(subscriptionId, body);
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


# Refund Prepayment

This endpoint will refund, completely or partially, a particular prepayment applied to a subscription. The `prepayment_id` will be the account transaction ID of the original payment. The prepayment must have some amount remaining in order to be refunded.

The amount may be passed either as a decimal, with `amount`, or an integer in cents, with `amount_in_cents`.

```java
PrepaymentResponse refundPrepayment(
    final String subscriptionId,
    final String prepaymentId,
    final RefundPrepaymentRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The Chargify id of the subscription |
| `prepaymentId` | `String` | Template, Required | id of prepayment |
| `body` | [`RefundPrepaymentRequest`](../../doc/models/refund-prepayment-request.md) | Body, Optional | - |

## Response Type

[`PrepaymentResponse`](../../doc/models/prepayment-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
String prepaymentId = "prepayment_id8";
try {
    PrepaymentResponse result = subscriptionInvoiceAccountController.refundPrepayment(subscriptionId, prepaymentId, null);
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
| 400 | Bad Request | [`RefundPrepaymentBaseErrorsResponseException`](../../doc/models/refund-prepayment-base-errors-response-exception.md) |
| 404 | Not Found | `ApiException` |
| 422 | Unprocessable Entity | [`RefundPrepaymentAggregatedErrorsResponseException`](../../doc/models/refund-prepayment-aggregated-errors-response-exception.md) |

