
# Update Customer Request

## Structure

`UpdateCustomerRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Customer` | [`UpdateCustomer`](../../doc/models/update-customer.md) | Required | - | UpdateCustomer getCustomer() | setCustomer(UpdateCustomer customer) |

## Example

```java
import com.maxio.advancedbilling.models.UpdateCustomer;
import com.maxio.advancedbilling.models.UpdateCustomerRequest;

UpdateCustomerRequest updateCustomerRequest = new UpdateCustomerRequest.Builder(
    new UpdateCustomer.Builder()
        .firstName("first_name0")
        .lastName("last_name8")
        .email("email6")
        .ccEmails("cc_emails0")
        .organization("organization6")
        .build()
)
.build();
```

