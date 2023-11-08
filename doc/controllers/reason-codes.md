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

# Reason Codes Intro

ReasonCodes are a way to gain a high level view of why your customers are cancelling the subcription to your product or service.

Add a set of churn reason codes to be displayed in-app and/or the Chargify Billing Portal. As your subscribers decide to cancel their subscription, learn why they decided to cancel.

## Reason Code Documentation

Full documentation on how Reason Codes operate within Chargify can be located under the following links.

[Churn Reason Codes](https://chargify.zendesk.com/hc/en-us/articles/4407896775579#churn-reason-codes)

## Create Reason Code

This method gives a merchant the option to create a reason codes for a given Site.

```java
ReasonCodeResponse createReasonCode(
    final CreateReasonCodeRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`CreateReasonCodeRequest`](../../doc/models/create-reason-code-request.md) | Body, Optional | - |

## Response Type

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


# List Reason Codes

This method gives a merchant the option to retrieve a list of all of the current churn codes for a given site.

```java
List<ReasonCodeResponse> listReasonCodes(
    final ListReasonCodesInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `page` | `Integer` | Query, Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br>**Default**: `1`<br>**Constraints**: `>= 1` |
| `perPage` | `Integer` | Query, Optional | This parameter indicates how many records to fetch in each request. Default value is 20. The maximum allowed values is 200; any per_page value over 200 will be changed to 200.<br>Use in query `per_page=200`.<br>**Default**: `20`<br>**Constraints**: `<= 200` |

## Response Type

[`List<ReasonCodeResponse>`](../../doc/models/reason-code-response.md)

## Example Usage

```java
ListReasonCodesInput listReasonCodesInput = new ListReasonCodesInput.Builder()
    .page(2)
    .perPage(50)
    .build();

try {
    List<ReasonCodeResponse> result = reasonCodesController.listReasonCodes(listReasonCodesInput);
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
      "description": "This doesnt meet my needs",
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


# Read Reason Code

This method gives a merchant the option to retrieve a list of a particular code for a given Site by providing the unique numerical ID of the code.

```java
ReasonCodeResponse readReasonCode(
    final int reasonCodeId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `reasonCodeId` | `int` | Template, Required | The Chargify id of the reason code |

## Response Type

[`ReasonCodeResponse`](../../doc/models/reason-code-response.md)

## Example Usage

```java
int reasonCodeId = 32;

try {
    ReasonCodeResponse result = reasonCodesController.readReasonCode(reasonCodeId);
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
| 404 | Not Found | `ApiException` |


# Update Reason Code

This method gives a merchant the option to update an existing reason code for a given site.

```java
ReasonCodeResponse updateReasonCode(
    final int reasonCodeId,
    final UpdateReasonCodeRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `reasonCodeId` | `int` | Template, Required | The Chargify id of the reason code |
| `body` | [`UpdateReasonCodeRequest`](../../doc/models/update-reason-code-request.md) | Body, Optional | - |

## Response Type

[`ReasonCodeResponse`](../../doc/models/reason-code-response.md)

## Example Usage

```java
int reasonCodeId = 32;
try {
    ReasonCodeResponse result = reasonCodesController.updateReasonCode(reasonCodeId, null);
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
| 404 | Not Found | `ApiException` |


# Delete Reason Code

This method gives a merchant the option to delete one reason code from the Churn Reason Codes. This code will be immediately removed. This action is not reversable.

```java
ReasonCodesJsonResponse deleteReasonCode(
    final int reasonCodeId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `reasonCodeId` | `int` | Template, Required | The Chargify id of the reason code |

## Response Type

[`ReasonCodesJsonResponse`](../../doc/models/reason-codes-json-response.md)

## Example Usage

```java
int reasonCodeId = 32;

try {
    ReasonCodesJsonResponse result = reasonCodesController.deleteReasonCode(reasonCodeId);
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
  "ok": "ok"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found | `ApiException` |

