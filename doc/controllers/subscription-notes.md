# Subscription Notes

```java
SubscriptionNotesController subscriptionNotesController = client.getSubscriptionNotesController();
```

## Class Name

`SubscriptionNotesController`

## Methods

* [Create Subscription Note](../../doc/controllers/subscription-notes.md#create-subscription-note)
* [Delete Subscription Note](../../doc/controllers/subscription-notes.md#delete-subscription-note)
* [List Subscription Notes](../../doc/controllers/subscription-notes.md#list-subscription-notes)
* [Read Subscription Note](../../doc/controllers/subscription-notes.md#read-subscription-note)
* [Update Subscription Note](../../doc/controllers/subscription-notes.md#update-subscription-note)


# Create Subscription Note

Use the following method to create a note for a subscription.

## How to Use Subscription Notes

Notes allow you to record information about a particular Subscription in a free text format.

If you have structured data such as birth date, color, etc., consider using Metadata instead.

Full documentation on how to use Notes in the Chargify UI can be located [here](https://maxio-chargify.zendesk.com/hc/en-us/articles/5404434903181-Subscription-Summary#notes).

```java
SubscriptionNoteResponse createSubscriptionNote(
    final String subscriptionId,
    final UpdateSubscriptionNoteRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The Chargify id of the subscription |
| `body` | [`UpdateSubscriptionNoteRequest`](../../doc/models/update-subscription-note-request.md) | Body, Optional | Updatable fields for Subscription Note |

## Response Type

[`SubscriptionNoteResponse`](../../doc/models/subscription-note-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
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
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Delete Subscription Note

Use the following method to delete a note for a Subscription.

```java
Void deleteSubscriptionNote(
    final String subscriptionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The Chargify id of the subscription |

## Response Type

`void`

## Example Usage

```java
String subscriptionId = "subscription_id0";

try {
    subscriptionNotesController.deleteSubscriptionNote(subscriptionId);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Unprocessable Entity (WebDAV) | `ApiException` |


# List Subscription Notes

Use this method to retrieve a list of Notes associated with a Subscription. The response will be an array of Notes.

```java
List<SubscriptionNoteResponse> listSubscriptionNotes(
    final ListSubscriptionNotesInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The Chargify id of the subscription |
| `page` | `Integer` | Query, Optional | Result records are organized in pages. By default, the first page of results is displayed. The page parameter specifies a page number of results to fetch. You can start navigating through the pages to consume the results. You do this by passing in a page parameter. Retrieve the next page by adding ?page=2 to the query string. If there are no results to return, then an empty result set will be returned.<br>Use in query `page=1`.<br>**Default**: `1`<br>**Constraints**: `>= 1` |
| `perPage` | `Integer` | Query, Optional | This parameter indicates how many records to fetch in each request. Default value is 20. The maximum allowed values is 200; any per_page value over 200 will be changed to 200.<br>Use in query `per_page=200`.<br>**Default**: `20`<br>**Constraints**: `<= 200` |

## Response Type

[`List<SubscriptionNoteResponse>`](../../doc/models/subscription-note-response.md)

## Example Usage

```java
ListSubscriptionNotesInput listSubscriptionNotesInput = new ListSubscriptionNotesInput.Builder(
    "subscription_id0"
)
.page(2)
.perPage(50)
.build();

try {
    List<SubscriptionNoteResponse> result = subscriptionNotesController.listSubscriptionNotes(listSubscriptionNotesInput);
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


# Read Subscription Note

Once you have obtained the ID of the note you wish to read, use this method to show a particular note attached to a subscription.

```java
SubscriptionNoteResponse readSubscriptionNote(
    final String subscriptionId,
    final String noteId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The Chargify id of the subscription |
| `noteId` | `String` | Template, Required | The Chargify id of the note |

## Response Type

[`SubscriptionNoteResponse`](../../doc/models/subscription-note-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
String noteId = "note_id8";

try {
    SubscriptionNoteResponse result = subscriptionNotesController.readSubscriptionNote(subscriptionId, noteId);
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

Use the following method to update a note for a Subscription.

```java
SubscriptionNoteResponse updateSubscriptionNote(
    final String subscriptionId,
    final String noteId,
    final UpdateSubscriptionNoteRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The Chargify id of the subscription |
| `noteId` | `String` | Template, Required | The Chargify id of the note |
| `body` | [`UpdateSubscriptionNoteRequest`](../../doc/models/update-subscription-note-request.md) | Body, Optional | Updatable fields for Subscription Note |

## Response Type

[`SubscriptionNoteResponse`](../../doc/models/subscription-note-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
String noteId = "note_id8";
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
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

