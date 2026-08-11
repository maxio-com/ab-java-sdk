
# Customer Response

## Structure

`CustomerResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Customer` | [`Customer`](../../doc/models/customer.md) | Required | - | Customer getCustomer() | setCustomer(Customer customer) |

## Example

```java
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.CustomerResponse;

CustomerResponse customerResponse = new CustomerResponse.Builder(
    new Customer.Builder()
        .firstName("first_name0")
        .lastName("last_name8")
        .email("email6")
        .ccEmails("cc_emails0")
        .organization("organization6")
        .build()
)
.build();
```

