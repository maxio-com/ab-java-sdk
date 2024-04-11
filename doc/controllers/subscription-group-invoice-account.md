# Subscription Group Invoice Account

```java
SubscriptionGroupInvoiceAccountController subscriptionGroupInvoiceAccountController = client.getSubscriptionGroupInvoiceAccountController();
```

## Class Name

`SubscriptionGroupInvoiceAccountController`

## Methods

* [Create Subscription Group Prepayment](../../doc/controllers/subscription-group-invoice-account.md#create-subscription-group-prepayment)
* [List Prepayments for Subscription Group](../../doc/controllers/subscription-group-invoice-account.md#list-prepayments-for-subscription-group)
* [Issue Subscription Group Service Credit](../../doc/controllers/subscription-group-invoice-account.md#issue-subscription-group-service-credit)
* [Deduct Subscription Group Service Credit](../../doc/controllers/subscription-group-invoice-account.md#deduct-subscription-group-service-credit)


# Create Subscription Group Prepayment

A prepayment can be added for a subscription group identified by the group's `uid`. This endpoint requires a `amount`, `details`, `method`, and `memo`. On success, the prepayment will be added to the group's prepayment balance.

```java
SubscriptionGroupPrepaymentResponse createSubscriptionGroupPrepayment(
    final String uid,
    final SubscriptionGroupPrepaymentRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `uid` | `String` | Template, Required | The uid of the subscription group |
| `body` | [`SubscriptionGroupPrepaymentRequest`](../../doc/models/subscription-group-prepayment-request.md) | Body, Optional | - |

## Response Type

[`SubscriptionGroupPrepaymentResponse`](../../doc/models/subscription-group-prepayment-response.md)

## Example Usage

```java
String uid = "uid0";
try {
    SubscriptionGroupPrepaymentResponse result = subscriptionGroupInvoiceAccountController.createSubscriptionGroupPrepayment(uid, null);
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
  "id": 6049554,
  "amount_in_cents": 10000,
  "ending_balance_in_cents": 5000,
  "entry_type": "Debit",
  "memo": "Debit from invoice account."
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Unprocessable Entity (WebDAV) | [`ErrorListResponseException`](../../doc/models/error-list-response-exception.md) |


# List Prepayments for Subscription Group

This request will list a subscription group's prepayments.

```java
ListSubscriptionGroupPrepaymentResponse listPrepaymentsForSubscriptionGroup(
    final ListPrepaymentsForSubscriptionGroupInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `uid` | `String` | Template, Required | The uid of the subscription group |
| `page` | `Integer` | Query, Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`. |
| `perPage` | `Integer` | Query, Optional | This parameter indicates how many records to fetch in each request. Default value is 20. The maximum allowed values is 200; any per_page value over 200 will be changed to 200.<br>Use in query `per_page=200`. |
| `filter` | [`ListPrepaymentsFilter`](../../doc/models/list-prepayments-filter.md) | Query, Optional | Filter to use for List Prepayments operations |

## Response Type

[`ListSubscriptionGroupPrepaymentResponse`](../../doc/models/list-subscription-group-prepayment-response.md)

## Example Usage

```java
ListPrepaymentsForSubscriptionGroupInput listPrepaymentsForSubscriptionGroupInput = new ListPrepaymentsForSubscriptionGroupInput.Builder(
    "uid0"
)
.page(2)
.perPage(50)
.filter(new ListPrepaymentsFilter.Builder()
        .dateField(ListPrepaymentDateField.CREATED_AT)
        .startDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
        .endDate(DateTimeHelper.fromSimpleDate("2024-01-31"))
        .build())
.build();

try {
    ListSubscriptionGroupPrepaymentResponse result = subscriptionGroupInvoiceAccountController.listPrepaymentsForSubscriptionGroup(listPrepaymentsForSubscriptionGroupInput);
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
      "prepayment": {
        "id": 142,
        "subscription_group_uid": "grp_b4qhx3bvx72t8",
        "amount_in_cents": 10000,
        "remaining_amount_in_cents": 10000,
        "details": "test",
        "external": true,
        "memo": "test",
        "payment_type": "cash",
        "created_at": "2023-06-21T04:37:02-04:00"
      }
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found | `ApiException` |


# Issue Subscription Group Service Credit

Credit can be issued for a subscription group identified by the group's `uid`. Credit will be added to the group in the amount specified in the request body. The credit will be applied to group member invoices as they are generated.

```java
ServiceCreditResponse issueSubscriptionGroupServiceCredit(
    final String uid,
    final IssueServiceCreditRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `uid` | `String` | Template, Required | The uid of the subscription group |
| `body` | [`IssueServiceCreditRequest`](../../doc/models/issue-service-credit-request.md) | Body, Optional | - |

## Response Type

[`ServiceCreditResponse`](../../doc/models/service-credit-response.md)

## Example Usage

```java
String uid = "uid0";
IssueServiceCreditRequest body = new IssueServiceCreditRequest.Builder(
    new IssueServiceCredit.Builder(
        IssueServiceCreditAmount.fromPrecision(
            10D
        )
    )
    .memo("Credit the group account")
    .build()
)
.build();

try {
    ServiceCreditResponse result = subscriptionGroupInvoiceAccountController.issueSubscriptionGroupServiceCredit(uid, body);
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
  "service_credit": {
    "id": 101,
    "amount_in_cents": 1000,
    "ending_balance_in_cents": 2000,
    "entry_type": "Credit",
    "memo": "Credit to group account"
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Unprocessable Entity (WebDAV) | [`ErrorListResponseException`](../../doc/models/error-list-response-exception.md) |


# Deduct Subscription Group Service Credit

Credit can be deducted for a subscription group identified by the group's `uid`. Credit will be deducted from the group in the amount specified in the request body.

```java
ServiceCredit deductSubscriptionGroupServiceCredit(
    final String uid,
    final DeductServiceCreditRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `uid` | `String` | Template, Required | The uid of the subscription group |
| `body` | [`DeductServiceCreditRequest`](../../doc/models/deduct-service-credit-request.md) | Body, Optional | - |

## Response Type

[`ServiceCredit`](../../doc/models/service-credit.md)

## Example Usage

```java
String uid = "uid0";
DeductServiceCreditRequest body = new DeductServiceCreditRequest.Builder(
    new DeductServiceCredit.Builder(
        DeductServiceCreditAmount.fromPrecision(
            10D
        )
    )
    .memo("Deduct from group account")
    .build()
)
.build();

try {
    ServiceCredit result = subscriptionGroupInvoiceAccountController.deductSubscriptionGroupServiceCredit(uid, body);
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
  "id": 100,
  "amount_in_cents": 1000,
  "ending_balance_in_cents": 0,
  "entry_type": "Debit",
  "memo": "Debit from group account"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Unprocessable Entity (WebDAV) | [`ErrorListResponseException`](../../doc/models/error-list-response-exception.md) |

