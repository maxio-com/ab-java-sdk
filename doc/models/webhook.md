
# Webhook

## Structure

`Webhook`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Event` | `String` | Optional | A string describing which event type produced the given webhook | String getEvent() | setEvent(String event) |
| `Id` | `Long` | Optional | The unique identifier for the webhooks (unique across all of Chargify). This is not changed on a retry/replay of the same webhook, so it may be used to avoid duplicate action for the same event. | Long getId() | setId(Long id) |
| `CreatedAt` | `ZonedDateTime` | Optional | Timestamp indicating when the webhook was created | ZonedDateTime getCreatedAt() | setCreatedAt(ZonedDateTime createdAt) |
| `LastError` | `String` | Optional | Text describing the status code and/or error from the last failed attempt to send the Webhook. When a webhook is retried and accepted, this field will be cleared. | String getLastError() | setLastError(String lastError) |
| `LastErrorAt` | `ZonedDateTime` | Optional | Timestamp indicating when the last non-acceptance occurred. If a webhook is later resent and accepted, this field will be cleared. | ZonedDateTime getLastErrorAt() | setLastErrorAt(ZonedDateTime lastErrorAt) |
| `AcceptedAt` | `ZonedDateTime` | Optional | Timestamp indicating when the webhook was accepted by the merchant endpoint. When a webhook is explicitly replayed by the merchant, this value will be cleared until it is accepted again. | ZonedDateTime getAcceptedAt() | setAcceptedAt(ZonedDateTime acceptedAt) |
| `LastSentAt` | `ZonedDateTime` | Optional | Timestamp indicating when the most recent attempt was made to send the webhook | ZonedDateTime getLastSentAt() | setLastSentAt(ZonedDateTime lastSentAt) |
| `LastSentUrl` | `String` | Optional | The url that the endpoint was last sent to. | String getLastSentUrl() | setLastSentUrl(String lastSentUrl) |
| `Successful` | `Boolean` | Optional | A boolean flag describing whether the webhook was accepted by the webhook endpoint for the most recent attempt. (Acceptance is defined by receiving a “200 OK” HTTP response within a reasonable timeframe, i.e. 15 seconds) | Boolean getSuccessful() | setSuccessful(Boolean successful) |
| `Body` | `String` | Optional | The data sent within the webhook post | String getBody() | setBody(String body) |
| `Signature` | `String` | Optional | The calculated webhook signature | String getSignature() | setSignature(String signature) |
| `SignatureHmacSha256` | `String` | Optional | The calculated HMAC-SHA-256 webhook signature | String getSignatureHmacSha256() | setSignatureHmacSha256(String signatureHmacSha256) |

## Example (as JSON)

```json
{
  "event": "event6",
  "id": 154,
  "created_at": "2016-03-13T12:52:32.123Z",
  "last_error": "last_error8",
  "last_error_at": "2016-03-13T12:52:32.123Z"
}
```

