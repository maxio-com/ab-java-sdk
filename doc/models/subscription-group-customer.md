
# Subscription Group Customer

## Structure

`SubscriptionGroupCustomer`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FirstName` | `String` | Optional | - | String getFirstName() | setFirstName(String firstName) |
| `LastName` | `String` | Optional | - | String getLastName() | setLastName(String lastName) |
| `Organization` | `String` | Optional | - | String getOrganization() | setOrganization(String organization) |
| `Email` | `String` | Optional | - | String getEmail() | setEmail(String email) |
| `Reference` | `String` | Optional | - | String getReference() | setReference(String reference) |

## Example

```java
import com.maxio.advancedbilling.models.SubscriptionGroupCustomer;

SubscriptionGroupCustomer subscriptionGroupCustomer = new SubscriptionGroupCustomer.Builder()
    .firstName("first_name6")
    .lastName("last_name4")
    .organization("organization0")
    .email("email0")
    .reference("reference8")
    .build();
```

