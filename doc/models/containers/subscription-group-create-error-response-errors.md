
# Subscription Group Create Error Response Errors

## Class Name

`SubscriptionGroupCreateErrorResponseErrors`

## Cases

| Type | Factory Method |
|  --- | --- |
| [`SubscriptionGroupMembersArrayError`](../../../doc/models/subscription-group-members-array-error.md) | SubscriptionGroupCreateErrorResponseErrors.fromSubscriptionGroupMembersArrayError(SubscriptionGroupMembersArrayError subscriptionGroupMembersArrayError) |
| [`SubscriptionGroupSingleError`](../../../doc/models/subscription-group-single-error.md) | SubscriptionGroupCreateErrorResponseErrors.fromSubscriptionGroupSingleError(SubscriptionGroupSingleError subscriptionGroupSingleError) |
| `String` | SubscriptionGroupCreateErrorResponseErrors.fromString(String string) |

## SubscriptionGroupMembersArrayError

### Initialization Code

#### Example

```java
SubscriptionGroupCreateErrorResponseErrors.fromSubscriptionGroupMembersArrayError(
        new SubscriptionGroupMembersArrayError.Builder(
            Arrays.asList(
                "members6"
            )
        )
        .build()
    )
```

## SubscriptionGroupSingleError

### Initialization Code

#### Example

```java
SubscriptionGroupCreateErrorResponseErrors.fromSubscriptionGroupSingleError(
        new SubscriptionGroupSingleError.Builder(
            "subscription_group2"
        )
        .build()
    )
```

## String

### Initialization Code

#### Example

```java
SubscriptionGroupCreateErrorResponseErrors.fromString(
        "String0"
    )
```

