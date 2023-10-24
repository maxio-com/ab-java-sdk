
# Pause Request

Allows to pause a Subscription

## Structure

`PauseRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Hold` | [`AutoResume`](../../doc/models/auto-resume.md) | Optional | - | AutoResume getHold() | setHold(AutoResume hold) |

## Example (as JSON)

```json
{
  "hold": {
    "automatically_resume_at": "automatically_resume_at0"
  }
}
```

