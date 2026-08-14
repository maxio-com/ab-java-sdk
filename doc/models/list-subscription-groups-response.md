
# List Subscription Groups Response

## Structure

`ListSubscriptionGroupsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SubscriptionGroups` | [`List<ListSubscriptionGroupsItem>`](../../doc/models/list-subscription-groups-item.md) | Optional | - | List<ListSubscriptionGroupsItem> getSubscriptionGroups() | setSubscriptionGroups(List<ListSubscriptionGroupsItem> subscriptionGroups) |
| `Meta` | [`ListSubscriptionGroupsMeta`](../../doc/models/list-subscription-groups-meta.md) | Optional | - | ListSubscriptionGroupsMeta getMeta() | setMeta(ListSubscriptionGroupsMeta meta) |

## Example

```java
import com.maxio.advancedbilling.models.ListSubscriptionGroupsItem;
import com.maxio.advancedbilling.models.ListSubscriptionGroupsMeta;
import com.maxio.advancedbilling.models.ListSubscriptionGroupsResponse;
import java.util.Arrays;

ListSubscriptionGroupsResponse listSubscriptionGroupsResponse = new ListSubscriptionGroupsResponse.Builder()
    .subscriptionGroups(Arrays.asList(
        new ListSubscriptionGroupsItem.Builder()
            .uid("uid2")
            .scheme(166)
            .customerId(186)
            .paymentProfileId(162)
            .subscriptionIds(Arrays.asList(
                40
            ))
            .build()
    ))
    .meta(new ListSubscriptionGroupsMeta.Builder()
        .currentPage(126)
        .totalCount(150)
        .build())
    .build();
```

