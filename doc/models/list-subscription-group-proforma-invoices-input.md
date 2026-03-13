
# List Subscription Group Proforma Invoices Input

Input structure for the method ListSubscriptionGroupProformaInvoices

## Structure

`ListSubscriptionGroupProformaInvoicesInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Required | The uid of the subscription group | String getUid() | setUid(String uid) |
| `LineItems` | `Boolean` | Optional | Include line items data<br><br>**Default**: `false` | Boolean getLineItems() | setLineItems(Boolean lineItems) |
| `Discounts` | `Boolean` | Optional | Include discounts data<br><br>**Default**: `false` | Boolean getDiscounts() | setDiscounts(Boolean discounts) |
| `Taxes` | `Boolean` | Optional | Include taxes data<br><br>**Default**: `false` | Boolean getTaxes() | setTaxes(Boolean taxes) |
| `Credits` | `Boolean` | Optional | Include credits data<br><br>**Default**: `false` | Boolean getCredits() | setCredits(Boolean credits) |
| `Payments` | `Boolean` | Optional | Include payments data<br><br>**Default**: `false` | Boolean getPayments() | setPayments(Boolean payments) |
| `CustomFields` | `Boolean` | Optional | Include custom fields data<br><br>**Default**: `false` | Boolean getCustomFields() | setCustomFields(Boolean customFields) |

## Example

```java
import com.maxio.advancedbilling.models.ListSubscriptionGroupProformaInvoicesInput;

ListSubscriptionGroupProformaInvoicesInput listSubscriptionGroupProformaInvoicesInput = new ListSubscriptionGroupProformaInvoicesInput.Builder(
    "uid0"
)
.lineItems(false)
.discounts(false)
.taxes(false)
.credits(false)
.payments(false)
.customFields(false)
.build();
```

