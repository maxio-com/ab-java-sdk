
# Create Customer Request

## Structure

`CreateCustomerRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Customer` | [`CreateCustomer`](../../doc/models/create-customer.md) | Required | - | CreateCustomer getCustomer() | setCustomer(CreateCustomer customer) |

## Example

```java
import com.maxio.advancedbilling.models.CreateCustomer;
import com.maxio.advancedbilling.models.CreateCustomerRequest;

CreateCustomerRequest createCustomerRequest = new CreateCustomerRequest.Builder(
    new CreateCustomer.Builder(
        "first_name0",
        "last_name8",
        "email6"
    )
    .ccEmails("cc_emails0")
    .organization("organization6")
    .reference("reference4")
    .address("address6")
    .address2("address_24")
    .build()
)
.build();
```

