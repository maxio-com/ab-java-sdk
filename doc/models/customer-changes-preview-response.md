
# Customer Changes Preview Response

## Structure

`CustomerChangesPreviewResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Changes` | [`CustomerChange`](../../doc/models/customer-change.md) | Required | - | CustomerChange getChanges() | setChanges(CustomerChange changes) |

## Example (as JSON)

```json
{
  "changes": {
    "payer": {
      "before": {
        "key1": "val1",
        "key2": "val2"
      },
      "after": {
        "key1": "val1",
        "key2": "val2"
      }
    },
    "shipping_address": {
      "before": {
        "key1": "val1",
        "key2": "val2"
      },
      "after": {
        "key1": "val1",
        "key2": "val2"
      }
    },
    "billing_address": {
      "before": {
        "key1": "val1",
        "key2": "val2"
      },
      "after": {
        "key1": "val1",
        "key2": "val2"
      }
    },
    "custom_fields": {
      "before": [
        {
          "owner_id": 212.74,
          "owner_type": "owner_type2",
          "name": "name0",
          "value": "value2",
          "metadatum_id": 158.98
        },
        {
          "owner_id": 212.74,
          "owner_type": "owner_type2",
          "name": "name0",
          "value": "value2",
          "metadatum_id": 158.98
        }
      ],
      "after": [
        {
          "owner_id": 80.66,
          "owner_type": "owner_type4",
          "name": "name2",
          "value": "value4",
          "metadatum_id": 26.9
        },
        {
          "owner_id": 80.66,
          "owner_type": "owner_type4",
          "name": "name2",
          "value": "value4",
          "metadatum_id": 26.9
        },
        {
          "owner_id": 80.66,
          "owner_type": "owner_type4",
          "name": "name2",
          "value": "value4",
          "metadatum_id": 26.9
        }
      ]
    }
  }
}
```

