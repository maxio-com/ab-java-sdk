
# Segment

## Structure

`Segment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `ComponentId` | `Integer` | Optional | - | Integer getComponentId() | setComponentId(Integer componentId) |
| `PricePointId` | `Integer` | Optional | - | Integer getPricePointId() | setPricePointId(Integer pricePointId) |
| `EventBasedBillingMetricId` | `Integer` | Optional | - | Integer getEventBasedBillingMetricId() | setEventBasedBillingMetricId(Integer eventBasedBillingMetricId) |
| `PricingScheme` | `String` | Optional | - | String getPricingScheme() | setPricingScheme(String pricingScheme) |
| `SegmentProperty1Value` | [`SegmentSegmentProperty1Value`](../../doc/models/containers/segment-segment-property-1-value.md) | Optional | This is a container for one-of cases. | SegmentSegmentProperty1Value getSegmentProperty1Value() | setSegmentProperty1Value(SegmentSegmentProperty1Value segmentProperty1Value) |
| `SegmentProperty2Value` | [`SegmentSegmentProperty2Value`](../../doc/models/containers/segment-segment-property-2-value.md) | Optional | This is a container for one-of cases. | SegmentSegmentProperty2Value getSegmentProperty2Value() | setSegmentProperty2Value(SegmentSegmentProperty2Value segmentProperty2Value) |
| `SegmentProperty3Value` | [`SegmentSegmentProperty3Value`](../../doc/models/containers/segment-segment-property-3-value.md) | Optional | This is a container for one-of cases. | SegmentSegmentProperty3Value getSegmentProperty3Value() | setSegmentProperty3Value(SegmentSegmentProperty3Value segmentProperty3Value) |
| `SegmentProperty4Value` | [`SegmentSegmentProperty4Value`](../../doc/models/containers/segment-segment-property-4-value.md) | Optional | This is a container for one-of cases. | SegmentSegmentProperty4Value getSegmentProperty4Value() | setSegmentProperty4Value(SegmentSegmentProperty4Value segmentProperty4Value) |
| `CreatedAt` | `String` | Optional | - | String getCreatedAt() | setCreatedAt(String createdAt) |
| `UpdatedAt` | `String` | Optional | - | String getUpdatedAt() | setUpdatedAt(String updatedAt) |
| `Prices` | [`List<SegmentPrice>`](../../doc/models/segment-price.md) | Optional | **Constraints**: *Minimum Items*: `1` | List<SegmentPrice> getPrices() | setPrices(List<SegmentPrice> prices) |

## Example (as JSON)

```json
{
  "id": 6,
  "component_id": 116,
  "price_point_id": 140,
  "event_based_billing_metric_id": 200,
  "pricing_scheme": "pricing_scheme0"
}
```

