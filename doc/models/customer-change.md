
# Customer Change

## Structure

`CustomerChange`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Payer` | [`CustomerPayerChange`](../../doc/models/customer-payer-change.md) | Optional | - | CustomerPayerChange getPayer() | setPayer(CustomerPayerChange payer) |
| `ShippingAddress` | [`AddressChange`](../../doc/models/address-change.md) | Optional | - | AddressChange getShippingAddress() | setShippingAddress(AddressChange shippingAddress) |
| `BillingAddress` | [`AddressChange`](../../doc/models/address-change.md) | Optional | - | AddressChange getBillingAddress() | setBillingAddress(AddressChange billingAddress) |
| `CustomFields` | [`CustomerCustomFieldsChange`](../../doc/models/customer-custom-fields-change.md) | Optional | - | CustomerCustomFieldsChange getCustomFields() | setCustomFields(CustomerCustomFieldsChange customFields) |

## Example

```java
import com.maxio.advancedbilling.models.AddressChange;
import com.maxio.advancedbilling.models.CustomFieldOwner;
import com.maxio.advancedbilling.models.CustomerChange;
import com.maxio.advancedbilling.models.CustomerCustomFieldsChange;
import com.maxio.advancedbilling.models.CustomerPayerChange;
import com.maxio.advancedbilling.models.InvoiceAddress;
import com.maxio.advancedbilling.models.InvoiceCustomField;
import com.maxio.advancedbilling.models.InvoicePayerChange;
import java.util.Arrays;

CustomerChange customerChange = new CustomerChange.Builder()
    .payer(new CustomerPayerChange.Builder(
        new InvoicePayerChange.Builder()
            .firstName("first_name0")
            .lastName("last_name8")
            .organization("organization4")
            .email("email6")
            .build(),
        new InvoicePayerChange.Builder()
            .firstName("first_name2")
            .lastName("last_name0")
            .organization("organization4")
            .email("email4")
            .build()
    )
    .build())
    .shippingAddress(new AddressChange.Builder(
        new InvoiceAddress.Builder()
            .street("street0")
            .line2("line24")
            .city("city0")
            .state("state6")
            .zip("zip4")
            .build(),
        new InvoiceAddress.Builder()
            .street("street2")
            .line2("line26")
            .city("city8")
            .state("state2")
            .zip("zip4")
            .build()
    )
    .build())
    .billingAddress(new AddressChange.Builder(
        new InvoiceAddress.Builder()
            .street("street0")
            .line2("line24")
            .city("city0")
            .state("state6")
            .zip("zip4")
            .build(),
        new InvoiceAddress.Builder()
            .street("street2")
            .line2("line26")
            .city("city8")
            .state("state2")
            .zip("zip4")
            .build()
    )
    .build())
    .customFields(new CustomerCustomFieldsChange.Builder(
        Arrays.asList(
            new InvoiceCustomField.Builder()
                .ownerId(26)
                .ownerType(CustomFieldOwner.CUSTOMER)
                .name("name0")
                .value("value2")
                .metadatumId(26)
                .build(),
            new InvoiceCustomField.Builder()
                .ownerId(26)
                .ownerType(CustomFieldOwner.CUSTOMER)
                .name("name0")
                .value("value2")
                .metadatumId(26)
                .build()
        ),
        Arrays.asList(
            new InvoiceCustomField.Builder()
                .ownerId(130)
                .ownerType(CustomFieldOwner.CUSTOMER)
                .name("name2")
                .value("value4")
                .metadatumId(130)
                .build(),
            new InvoiceCustomField.Builder()
                .ownerId(130)
                .ownerType(CustomFieldOwner.CUSTOMER)
                .name("name2")
                .value("value4")
                .metadatumId(130)
                .build(),
            new InvoiceCustomField.Builder()
                .ownerId(130)
                .ownerType(CustomFieldOwner.CUSTOMER)
                .name("name2")
                .value("value4")
                .metadatumId(130)
                .build()
        )
    )
    .build())
    .build();
```

