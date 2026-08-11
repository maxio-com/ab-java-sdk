
# Subscription Component Allocation Error Exception

## Structure

`SubscriptionComponentAllocationErrorException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Errors` | [`List<SubscriptionComponentAllocationErrorItem>`](../../doc/models/subscription-component-allocation-error-item.md) | Optional | - | List<SubscriptionComponentAllocationErrorItem> getErrors() | setErrors(List<SubscriptionComponentAllocationErrorItem> errors) |

## Example

```java
try {
    // make the API call
} catch (SubscriptionComponentAllocationErrorException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

