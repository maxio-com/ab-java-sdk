
# Offer

## Structure

`Offer`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `SiteId` | `Integer` | Optional | - | Integer getSiteId() | setSiteId(Integer siteId) |
| `ProductFamilyId` | `Integer` | Optional | - | Integer getProductFamilyId() | setProductFamilyId(Integer productFamilyId) |
| `ProductId` | `Integer` | Optional | - | Integer getProductId() | setProductId(Integer productId) |
| `ProductPricePointId` | `Integer` | Optional | - | Integer getProductPricePointId() | setProductPricePointId(Integer productPricePointId) |
| `ProductRevisableNumber` | `Integer` | Optional | - | Integer getProductRevisableNumber() | setProductRevisableNumber(Integer productRevisableNumber) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Handle` | `String` | Optional | - | String getHandle() | setHandle(String handle) |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `CreatedAt` | `String` | Optional | - | String getCreatedAt() | setCreatedAt(String createdAt) |
| `UpdatedAt` | `String` | Optional | - | String getUpdatedAt() | setUpdatedAt(String updatedAt) |
| `ArchivedAt` | `String` | Optional | - | String getArchivedAt() | setArchivedAt(String archivedAt) |
| `OfferItems` | [`List<OfferItem>`](../../doc/models/offer-item.md) | Optional | - | List<OfferItem> getOfferItems() | setOfferItems(List<OfferItem> offerItems) |
| `OfferDiscounts` | [`List<OfferDiscount>`](../../doc/models/offer-discount.md) | Optional | - | List<OfferDiscount> getOfferDiscounts() | setOfferDiscounts(List<OfferDiscount> offerDiscounts) |
| `ProductFamilyName` | `String` | Optional | - | String getProductFamilyName() | setProductFamilyName(String productFamilyName) |
| `ProductName` | `String` | Optional | - | String getProductName() | setProductName(String productName) |
| `ProductPricePointName` | `String` | Optional | - | String getProductPricePointName() | setProductPricePointName(String productPricePointName) |
| `ProductPriceInCents` | `Integer` | Optional | - | Integer getProductPriceInCents() | setProductPriceInCents(Integer productPriceInCents) |
| `OfferSignupPages` | [`List<OfferSignupPage>`](../../doc/models/offer-signup-page.md) | Optional | - | List<OfferSignupPage> getOfferSignupPages() | setOfferSignupPages(List<OfferSignupPage> offerSignupPages) |

## Example (as JSON)

```json
{
  "id": 154,
  "site_id": 80,
  "product_family_id": 158,
  "product_id": 96,
  "product_price_point_id": 20
}
```

