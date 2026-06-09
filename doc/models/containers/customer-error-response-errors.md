
# Customer Error Response Errors

## Class Name

`CustomerErrorResponseErrors`

## Cases

| Type | Factory Method |
|  --- | --- |
| [`CustomerError`](../../../doc/models/customer-error.md) | CustomerErrorResponseErrors.fromCustomerError(CustomerError customerError) |
| `List<String>` | CustomerErrorResponseErrors.fromListOfString(List<String> listOfString) |

## CustomerError

### Initialization Code

#### Example

```java
CustomerErrorResponseErrors.fromCustomerError(
        new CustomerError.Builder()
            .build()
    )
```

## List<String>

### Initialization Code

#### Example

```java
CustomerErrorResponseErrors.fromListOfString(
        Arrays.asList(
            "String1"
        )
    )
```

