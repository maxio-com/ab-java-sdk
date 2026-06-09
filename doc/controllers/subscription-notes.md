# Subscription Notes

```java
SubscriptionNotesController subscriptionNotesController = client.getSubscriptionNotesController();
```

## Class Name

`SubscriptionNotesController`

## Methods

* [Create Subscription Note](../../doc/controllers/subscription-notes.md#create-subscription-note)
* [List Subscription Notes](../../doc/controllers/subscription-notes.md#list-subscription-notes)
* [Read Subscription Note](../../doc/controllers/subscription-notes.md#read-subscription-note)
* [Update Subscription Note](../../doc/controllers/subscription-notes.md#update-subscription-note)
* [Delete Subscription Note](../../doc/controllers/subscription-notes.md#delete-subscription-note)


# Create Subscription Note

Creates a note for a subscription.

## How to Use Subscription Notes

Notes allow you to record information about a particular Subscription in a free text format.

If you have structured data such as birth date, color, etc., consider using Metadata instead.

Full documentation on how to use Notes in the Advanced Billing UI can be located [here](https://maxio.zendesk.com/hc/en-us/articles/24251712214413-Subscription-Summary-Overview).

```java
SubscriptionNoteResponse createSubscriptionNote(
    final int subscriptionId,
    final UpdateSubscriptionNoteRequest body)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `int` | Template, Required | The Chargify id of the subscription. |
| `body` | [`UpdateSubscriptionNoteRequest`](../../doc/models/update-subscription-note-request.md) | Body, Optional | Updatable fields for Subscription Note |

## Response Type

**200**: OK

[`SubscriptionNoteResponse`](../../doc/models/subscription-note-response.md)

## Example Usage

```java
int subscriptionId = 222;
UpdateSubscriptionNoteRequest body = new UpdateSubscriptionNoteRequest.Builder(
    new UpdateSubscriptionNote.Builder(
        "New test note.",
        true
    )
    .build()
)
.build();

try {
    SubscriptionNoteResponse result = subscriptionNotesController.createSubscriptionNote(subscriptionId, body);
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


# List Subscription Notes

Retrieves a list of notes associated with a subscription. The response will be an array of Notes.

```java
List<SubscriptionNoteResponse> listSubscriptionNotes(
    final ListSubscriptionNotesInput input)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `input` | [`ListSubscriptionNotesInput`](../../doc/models/list-subscription-notes-input.md) | Required | Input structure for the method ListSubscriptionNotes |

## Response Type

**200**: OK

[`List<SubscriptionNoteResponse>`](../../doc/models/subscription-note-response.md)

## Example Usage

```java
ListSubscriptionNotesInput listSubscriptionNotesInput = new ListSubscriptionNotesInput.Builder(
    222
)
.page(1)
.perPage(50)
.build();

try {
    List<SubscriptionNoteResponse> result = subscriptionNotesController.listSubscriptionNotes(listSubscriptionNotesInput);
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
    "note": {
      "body": "Test note.",
      "created_at": "2015-06-15T13:26:47-04:00",
      "id": 5,
      "sticky": false,
      "subscription_id": 100046,
      "updated_at": "2015-06-15T13:28:12-04:00"
    }
  },
  {
    "note": {
      "body": "Another test note.",
      "created_at": "2015-06-15T12:04:46-04:00",
      "id": 4,
      "sticky": false,
      "subscription_id": 100046,
      "updated_at": "2015-06-15T13:26:33-04:00"
    }
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Unprocessable Entity (WebDAV) | [`ErrorListResponseException`](../../doc/models/error-list-response-exception.md) |


# Read Subscription Note

Retrieves a specific note attached to a subscription.

```java
SubscriptionNoteResponse readSubscriptionNote(
    final int subscriptionId,
    final int noteId)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `int` | Template, Required | The Chargify id of the subscription. |
| `noteId` | `int` | Template, Required | The Advanced Billing id of the note |

## Response Type

**200**: OK

[`SubscriptionNoteResponse`](../../doc/models/subscription-note-response.md)

## Example Usage

```java
int subscriptionId = 222;
int noteId = 66;

try {
    SubscriptionNoteResponse result = subscriptionNotesController.readSubscriptionNote(subscriptionId, noteId);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Example Response *(as JSON)*

```json
{
  "note": {
    "body": "Test note.",
    "created_at": "2015-06-15T13:26:47-04:00",
    "id": 5,
    "sticky": false,
    "subscription_id": 100046,
    "updated_at": "2015-06-15T13:28:12-04:00"
  }
}
```


# Update Subscription Note

Updates a note for a subscription.

```java
SubscriptionNoteResponse updateSubscriptionNote(
    final int subscriptionId,
    final int noteId,
    final UpdateSubscriptionNoteRequest body)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `int` | Template, Required | The Chargify id of the subscription. |
| `noteId` | `int` | Template, Required | The Advanced Billing id of the note |
| `body` | [`UpdateSubscriptionNoteRequest`](../../doc/models/update-subscription-note-request.md) | Body, Optional | Updatable fields for Subscription Note |

## Response Type

**200**: OK

[`SubscriptionNoteResponse`](../../doc/models/subscription-note-response.md)

## Example Usage

```java
int subscriptionId = 222;
int noteId = 66;
UpdateSubscriptionNoteRequest body = new UpdateSubscriptionNoteRequest.Builder(
    new UpdateSubscriptionNote.Builder(
        "Modified test note.",
        true
    )
    .build()
)
.build();

try {
    SubscriptionNoteResponse result = subscriptionNotesController.updateSubscriptionNote(subscriptionId, noteId, body);
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


# Delete Subscription Note

Deletes a note for a Subscription.

```java
Void deleteSubscriptionNote(
    final int subscriptionId,
    final int noteId)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `int` | Template, Required | The Chargify id of the subscription. |
| `noteId` | `int` | Template, Required | The Advanced Billing id of the note |

## Response Type

**200**: OK

`void`

## Example Usage

```java
int subscriptionId = 222;
int noteId = 66;

try {
    subscriptionNotesController.deleteSubscriptionNote(subscriptionId, noteId);
} catch (ApiException e) {
    e.printStackTrace();
}
```

