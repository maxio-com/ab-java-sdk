
# Component Allocation Error Exception

## Structure

`ComponentAllocationErrorException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Errors` | [`List<ComponentAllocationErrorItem>`](../../doc/models/component-allocation-error-item.md) | Optional | - | List<ComponentAllocationErrorItem> getErrors() | setErrors(List<ComponentAllocationErrorItem> errors) |

## Example

```java
try {
    // make the API call
} catch (ComponentAllocationErrorException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

