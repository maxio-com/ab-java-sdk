
# Customer Change

## Structure

`CustomerChange`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Payer` | [`CustomerPayerChange`](../../doc/models/customer-payer-change.md) | Optional | - | CustomerPayerChange getPayer() | setPayer(CustomerPayerChange payer) |
| `ShippingAddress` | [`CustomerShippingAddressChange`](../../doc/models/customer-shipping-address-change.md) | Optional | - | CustomerShippingAddressChange getShippingAddress() | setShippingAddress(CustomerShippingAddressChange shippingAddress) |
| `BillingAddress` | [`CustomerBillingAddressChange`](../../doc/models/customer-billing-address-change.md) | Optional | - | CustomerBillingAddressChange getBillingAddress() | setBillingAddress(CustomerBillingAddressChange billingAddress) |
| `CustomFields` | [`CustomerCustomFieldsChange`](../../doc/models/customer-custom-fields-change.md) | Optional | - | CustomerCustomFieldsChange getCustomFields() | setCustomFields(CustomerCustomFieldsChange customFields) |

## Example (as JSON)

```json
{
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
```

