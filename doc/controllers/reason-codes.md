# Reason Codes

```java
ReasonCodesController reasonCodesController = client.getReasonCodesController();
```

## Class Name

`ReasonCodesController`

## Methods

* [Create Reason Code](../../doc/controllers/reason-codes.md#create-reason-code)
* [List Reason Codes](../../doc/controllers/reason-codes.md#list-reason-codes)
* [Read Reason Code](../../doc/controllers/reason-codes.md#read-reason-code)
* [Update Reason Code](../../doc/controllers/reason-codes.md#update-reason-code)
* [Delete Reason Code](../../doc/controllers/reason-codes.md#delete-reason-code)


# Create Reason Code

Creates a reason code for a given site.

Reason Codes are a way to gain a high-level view of why your customers are cancelling the subscription to your product or service.

Add a set of churn reason codes to be displayed in-app and/or the Maxio Billing Portal. As your subscribers decide to cancel their subscription, learn why they decided to cancel.

For more information, see [Churn Reason Codes](https://maxio.zendesk.com/hc/en-us/articles/24286647554701-Churn-Reason-Codes).

```java
ReasonCodeResponse createReasonCode(
    final CreateReasonCodeRequest body)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`CreateReasonCodeRequest`](../../doc/models/create-reason-code-request.md) | Body, Optional | - |

## Response Type

**200**: OK

[`ReasonCodeResponse`](../../doc/models/reason-code-response.md)

## Example Usage

```java
CreateReasonCodeRequest body = new CreateReasonCodeRequest.Builder(
    new CreateReasonCode.Builder(
        "NOTHANKYOU",
        "No thank you!"
    )
    .position(5)
    .build()
)
.build();

try {
    ReasonCodeResponse result = reasonCodesController.createReasonCode(body);
    System.out.println(result);
} catch (ErrorListResponseException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Unprocessable Entity (WebDAV) | [`ErrorListResponseException`](../../doc/models/error-list-response-exception.md) |


# List Reason Codes

Lists all current churn codes for a given site.

```java
List<ReasonCodeResponse> listReasonCodes(
    final ListReasonCodesInput input)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `input` | [`ListReasonCodesInput`](../../doc/models/list-reason-codes-input.md) | Required | Input structure for the method ListReasonCodes |

## Response Type

**200**: OK

[`List<ReasonCodeResponse>`](../../doc/models/reason-code-response.md)

## Example Usage

```java
ListReasonCodesInput listReasonCodesInput = new ListReasonCodesInput.Builder()
    .page(1)
    .perPage(50)
    .build();

try {
    List<ReasonCodeResponse> result = reasonCodesController.listReasonCodes(listReasonCodesInput);
    System.out.println(result);
} catch (ErrorListResponseException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Example Response *(as JSON)*

```json
[
  {
    "reason_code": {
      "id": 2,
      "site_id": 2,
      "code": "LARGE",
      "description": "This is too complicated",
      "position": 1,
      "created_at": "2017-02-16T16:49:07-05:00",
      "updated_at": "2017-02-17T16:29:51-05:00"
    }
  },
  {
    "reason_code": {
      "id": 1,
      "site_id": 2,
      "code": "CH1",
      "description": "This does not meet my needs",
      "position": 2,
      "created_at": "2017-02-16T16:48:45-05:00",
      "updated_at": "2017-02-17T16:29:59-05:00"
    }
  },
  {
    "reason_code": {
      "id": 5,
      "site_id": 2,
      "code": "HAN99",
      "description": "Hard to setup",
      "position": 3,
      "created_at": "2017-02-17T16:29:42-05:00",
      "updated_at": "2017-02-17T16:29:59-05:00"
    }
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Unprocessable Entity (WebDAV) | [`ErrorListResponseException`](../../doc/models/error-list-response-exception.md) |


# Read Reason Code

Returns a particular churn reason code for a given site by its unique ID.

```java
ReasonCodeResponse readReasonCode(
    final int reasonCodeId)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `reasonCodeId` | `int` | Template, Required | The Advanced Billing id of the reason code |

## Response Type

**200**: OK

[`ReasonCodeResponse`](../../doc/models/reason-code-response.md)

## Example Usage

```java
int reasonCodeId = 32;

try {
    ReasonCodeResponse result = reasonCodesController.readReasonCode(reasonCodeId);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found | `ApiException` |


# Update Reason Code

Updates an existing reason code for a given site.

```java
ReasonCodeResponse updateReasonCode(
    final int reasonCodeId,
    final UpdateReasonCodeRequest body)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `reasonCodeId` | `int` | Template, Required | The Advanced Billing id of the reason code |
| `body` | [`UpdateReasonCodeRequest`](../../doc/models/update-reason-code-request.md) | Body, Optional | - |

## Response Type

**200**: OK

[`ReasonCodeResponse`](../../doc/models/reason-code-response.md)

## Example Usage

```java
int reasonCodeId = 32;
try {
    ReasonCodeResponse result = reasonCodesController.updateReasonCode(reasonCodeId, null);
    System.out.println(result);
} catch (ErrorListResponseException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found | `ApiException` |
| 422 | Unprocessable Entity (WebDAV) | [`ErrorListResponseException`](../../doc/models/error-list-response-exception.md) |


# Delete Reason Code

Deletes a reason code from the Churn Reason Codes. This code will be immediately removed. This action is not reversible.

```java
OkResponse deleteReasonCode(
    final int reasonCodeId)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `reasonCodeId` | `int` | Template, Required | The Advanced Billing id of the reason code |

## Response Type

**200**: OK

[`OkResponse`](../../doc/models/ok-response.md)

## Example Usage

```java
int reasonCodeId = 32;

try {
    OkResponse result = reasonCodesController.deleteReasonCode(reasonCodeId);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Example Response *(as JSON)*

```json
{
  "ok": "ok"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found | `ApiException` |

