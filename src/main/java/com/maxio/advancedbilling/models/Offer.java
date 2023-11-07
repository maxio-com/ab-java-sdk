/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.OptionalNullable;
import java.util.List;

/**
 * This is a model class for Offer type.
 */
public class Offer {
    private Integer id;
    private Integer siteId;
    private Integer productFamilyId;
    private Integer productId;
    private Integer productPricePointId;
    private Integer productRevisableNumber;
    private String name;
    private String handle;
    private String description;
    private String createdAt;
    private String updatedAt;
    private OptionalNullable<String> archivedAt;
    private List<OfferItem> offerItems;
    private List<OfferDiscount> offerDiscounts;
    private String productFamilyName;
    private String productName;
    private String productPricePointName;
    private Integer productPriceInCents;
    private List<OfferSignupPage> offerSignupPages;

    /**
     * Default constructor.
     */
    public Offer() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  siteId  Integer value for siteId.
     * @param  productFamilyId  Integer value for productFamilyId.
     * @param  productId  Integer value for productId.
     * @param  productPricePointId  Integer value for productPricePointId.
     * @param  productRevisableNumber  Integer value for productRevisableNumber.
     * @param  name  String value for name.
     * @param  handle  String value for handle.
     * @param  description  String value for description.
     * @param  createdAt  String value for createdAt.
     * @param  updatedAt  String value for updatedAt.
     * @param  archivedAt  String value for archivedAt.
     * @param  offerItems  List of OfferItem value for offerItems.
     * @param  offerDiscounts  List of OfferDiscount value for offerDiscounts.
     * @param  productFamilyName  String value for productFamilyName.
     * @param  productName  String value for productName.
     * @param  productPricePointName  String value for productPricePointName.
     * @param  productPriceInCents  Integer value for productPriceInCents.
     * @param  offerSignupPages  List of OfferSignupPage value for offerSignupPages.
     */
    public Offer(
            Integer id,
            Integer siteId,
            Integer productFamilyId,
            Integer productId,
            Integer productPricePointId,
            Integer productRevisableNumber,
            String name,
            String handle,
            String description,
            String createdAt,
            String updatedAt,
            String archivedAt,
            List<OfferItem> offerItems,
            List<OfferDiscount> offerDiscounts,
            String productFamilyName,
            String productName,
            String productPricePointName,
            Integer productPriceInCents,
            List<OfferSignupPage> offerSignupPages) {
        this.id = id;
        this.siteId = siteId;
        this.productFamilyId = productFamilyId;
        this.productId = productId;
        this.productPricePointId = productPricePointId;
        this.productRevisableNumber = productRevisableNumber;
        this.name = name;
        this.handle = handle;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.archivedAt = OptionalNullable.of(archivedAt);
        this.offerItems = offerItems;
        this.offerDiscounts = offerDiscounts;
        this.productFamilyName = productFamilyName;
        this.productName = productName;
        this.productPricePointName = productPricePointName;
        this.productPriceInCents = productPriceInCents;
        this.offerSignupPages = offerSignupPages;
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  siteId  Integer value for siteId.
     * @param  productFamilyId  Integer value for productFamilyId.
     * @param  productId  Integer value for productId.
     * @param  productPricePointId  Integer value for productPricePointId.
     * @param  productRevisableNumber  Integer value for productRevisableNumber.
     * @param  name  String value for name.
     * @param  handle  String value for handle.
     * @param  description  String value for description.
     * @param  createdAt  String value for createdAt.
     * @param  updatedAt  String value for updatedAt.
     * @param  archivedAt  String value for archivedAt.
     * @param  offerItems  List of OfferItem value for offerItems.
     * @param  offerDiscounts  List of OfferDiscount value for offerDiscounts.
     * @param  productFamilyName  String value for productFamilyName.
     * @param  productName  String value for productName.
     * @param  productPricePointName  String value for productPricePointName.
     * @param  productPriceInCents  Integer value for productPriceInCents.
     * @param  offerSignupPages  List of OfferSignupPage value for offerSignupPages.
     */

    protected Offer(Integer id, Integer siteId, Integer productFamilyId, Integer productId,
            Integer productPricePointId, Integer productRevisableNumber, String name, String handle,
            String description, String createdAt, String updatedAt,
            OptionalNullable<String> archivedAt, List<OfferItem> offerItems,
            List<OfferDiscount> offerDiscounts, String productFamilyName, String productName,
            String productPricePointName, Integer productPriceInCents,
            List<OfferSignupPage> offerSignupPages) {
        this.id = id;
        this.siteId = siteId;
        this.productFamilyId = productFamilyId;
        this.productId = productId;
        this.productPricePointId = productPricePointId;
        this.productRevisableNumber = productRevisableNumber;
        this.name = name;
        this.handle = handle;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.archivedAt = archivedAt;
        this.offerItems = offerItems;
        this.offerDiscounts = offerDiscounts;
        this.productFamilyName = productFamilyName;
        this.productName = productName;
        this.productPricePointName = productPricePointName;
        this.productPriceInCents = productPriceInCents;
        this.offerSignupPages = offerSignupPages;
    }

    /**
     * Getter for Id.
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for SiteId.
     * @return Returns the Integer
     */
    @JsonGetter("site_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSiteId() {
        return siteId;
    }

    /**
     * Setter for SiteId.
     * @param siteId Value for Integer
     */
    @JsonSetter("site_id")
    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    /**
     * Getter for ProductFamilyId.
     * @return Returns the Integer
     */
    @JsonGetter("product_family_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getProductFamilyId() {
        return productFamilyId;
    }

    /**
     * Setter for ProductFamilyId.
     * @param productFamilyId Value for Integer
     */
    @JsonSetter("product_family_id")
    public void setProductFamilyId(Integer productFamilyId) {
        this.productFamilyId = productFamilyId;
    }

    /**
     * Getter for ProductId.
     * @return Returns the Integer
     */
    @JsonGetter("product_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getProductId() {
        return productId;
    }

    /**
     * Setter for ProductId.
     * @param productId Value for Integer
     */
    @JsonSetter("product_id")
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * Getter for ProductPricePointId.
     * @return Returns the Integer
     */
    @JsonGetter("product_price_point_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getProductPricePointId() {
        return productPricePointId;
    }

    /**
     * Setter for ProductPricePointId.
     * @param productPricePointId Value for Integer
     */
    @JsonSetter("product_price_point_id")
    public void setProductPricePointId(Integer productPricePointId) {
        this.productPricePointId = productPricePointId;
    }

    /**
     * Getter for ProductRevisableNumber.
     * @return Returns the Integer
     */
    @JsonGetter("product_revisable_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getProductRevisableNumber() {
        return productRevisableNumber;
    }

    /**
     * Setter for ProductRevisableNumber.
     * @param productRevisableNumber Value for Integer
     */
    @JsonSetter("product_revisable_number")
    public void setProductRevisableNumber(Integer productRevisableNumber) {
        this.productRevisableNumber = productRevisableNumber;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Handle.
     * @return Returns the String
     */
    @JsonGetter("handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getHandle() {
        return handle;
    }

    /**
     * Setter for Handle.
     * @param handle Value for String
     */
    @JsonSetter("handle")
    public void setHandle(String handle) {
        this.handle = handle;
    }

    /**
     * Getter for Description.
     * @return Returns the String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the String
     */
    @JsonGetter("created_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for String
     */
    @JsonSetter("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for UpdatedAt.
     * @return Returns the String
     */
    @JsonGetter("updated_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * @param updatedAt Value for String
     */
    @JsonSetter("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Internal Getter for ArchivedAt.
     * @return Returns the Internal String
     */
    @JsonGetter("archived_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetArchivedAt() {
        return this.archivedAt;
    }

    /**
     * Getter for ArchivedAt.
     * @return Returns the String
     */
    public String getArchivedAt() {
        return OptionalNullable.getFrom(archivedAt);
    }

    /**
     * Setter for ArchivedAt.
     * @param archivedAt Value for String
     */
    @JsonSetter("archived_at")
    public void setArchivedAt(String archivedAt) {
        this.archivedAt = OptionalNullable.of(archivedAt);
    }

    /**
     * UnSetter for ArchivedAt.
     */
    public void unsetArchivedAt() {
        archivedAt = null;
    }

    /**
     * Getter for OfferItems.
     * @return Returns the List of OfferItem
     */
    @JsonGetter("offer_items")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<OfferItem> getOfferItems() {
        return offerItems;
    }

    /**
     * Setter for OfferItems.
     * @param offerItems Value for List of OfferItem
     */
    @JsonSetter("offer_items")
    public void setOfferItems(List<OfferItem> offerItems) {
        this.offerItems = offerItems;
    }

    /**
     * Getter for OfferDiscounts.
     * @return Returns the List of OfferDiscount
     */
    @JsonGetter("offer_discounts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<OfferDiscount> getOfferDiscounts() {
        return offerDiscounts;
    }

    /**
     * Setter for OfferDiscounts.
     * @param offerDiscounts Value for List of OfferDiscount
     */
    @JsonSetter("offer_discounts")
    public void setOfferDiscounts(List<OfferDiscount> offerDiscounts) {
        this.offerDiscounts = offerDiscounts;
    }

    /**
     * Getter for ProductFamilyName.
     * @return Returns the String
     */
    @JsonGetter("product_family_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductFamilyName() {
        return productFamilyName;
    }

    /**
     * Setter for ProductFamilyName.
     * @param productFamilyName Value for String
     */
    @JsonSetter("product_family_name")
    public void setProductFamilyName(String productFamilyName) {
        this.productFamilyName = productFamilyName;
    }

    /**
     * Getter for ProductName.
     * @return Returns the String
     */
    @JsonGetter("product_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductName() {
        return productName;
    }

    /**
     * Setter for ProductName.
     * @param productName Value for String
     */
    @JsonSetter("product_name")
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * Getter for ProductPricePointName.
     * @return Returns the String
     */
    @JsonGetter("product_price_point_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductPricePointName() {
        return productPricePointName;
    }

    /**
     * Setter for ProductPricePointName.
     * @param productPricePointName Value for String
     */
    @JsonSetter("product_price_point_name")
    public void setProductPricePointName(String productPricePointName) {
        this.productPricePointName = productPricePointName;
    }

    /**
     * Getter for ProductPriceInCents.
     * @return Returns the Integer
     */
    @JsonGetter("product_price_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getProductPriceInCents() {
        return productPriceInCents;
    }

    /**
     * Setter for ProductPriceInCents.
     * @param productPriceInCents Value for Integer
     */
    @JsonSetter("product_price_in_cents")
    public void setProductPriceInCents(Integer productPriceInCents) {
        this.productPriceInCents = productPriceInCents;
    }

    /**
     * Getter for OfferSignupPages.
     * @return Returns the List of OfferSignupPage
     */
    @JsonGetter("offer_signup_pages")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<OfferSignupPage> getOfferSignupPages() {
        return offerSignupPages;
    }

    /**
     * Setter for OfferSignupPages.
     * @param offerSignupPages Value for List of OfferSignupPage
     */
    @JsonSetter("offer_signup_pages")
    public void setOfferSignupPages(List<OfferSignupPage> offerSignupPages) {
        this.offerSignupPages = offerSignupPages;
    }

    /**
     * Converts this Offer into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Offer [" + "id=" + id + ", siteId=" + siteId + ", productFamilyId="
                + productFamilyId + ", productId=" + productId + ", productPricePointId="
                + productPricePointId + ", productRevisableNumber=" + productRevisableNumber
                + ", name=" + name + ", handle=" + handle + ", description=" + description
                + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", archivedAt="
                + archivedAt + ", offerItems=" + offerItems + ", offerDiscounts=" + offerDiscounts
                + ", productFamilyName=" + productFamilyName + ", productName=" + productName
                + ", productPricePointName=" + productPricePointName + ", productPriceInCents="
                + productPriceInCents + ", offerSignupPages=" + offerSignupPages + "]";
    }

    /**
     * Builds a new {@link Offer.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Offer.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .siteId(getSiteId())
                .productFamilyId(getProductFamilyId())
                .productId(getProductId())
                .productPricePointId(getProductPricePointId())
                .productRevisableNumber(getProductRevisableNumber())
                .name(getName())
                .handle(getHandle())
                .description(getDescription())
                .createdAt(getCreatedAt())
                .updatedAt(getUpdatedAt())
                .offerItems(getOfferItems())
                .offerDiscounts(getOfferDiscounts())
                .productFamilyName(getProductFamilyName())
                .productName(getProductName())
                .productPricePointName(getProductPricePointName())
                .productPriceInCents(getProductPriceInCents())
                .offerSignupPages(getOfferSignupPages());
        builder.archivedAt = internalGetArchivedAt();
        return builder;
    }

    /**
     * Class to build instances of {@link Offer}.
     */
    public static class Builder {
        private Integer id;
        private Integer siteId;
        private Integer productFamilyId;
        private Integer productId;
        private Integer productPricePointId;
        private Integer productRevisableNumber;
        private String name;
        private String handle;
        private String description;
        private String createdAt;
        private String updatedAt;
        private OptionalNullable<String> archivedAt;
        private List<OfferItem> offerItems;
        private List<OfferDiscount> offerDiscounts;
        private String productFamilyName;
        private String productName;
        private String productPricePointName;
        private Integer productPriceInCents;
        private List<OfferSignupPage> offerSignupPages;



        /**
         * Setter for id.
         * @param  id  Integer value for id.
         * @return Builder
         */
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for siteId.
         * @param  siteId  Integer value for siteId.
         * @return Builder
         */
        public Builder siteId(Integer siteId) {
            this.siteId = siteId;
            return this;
        }

        /**
         * Setter for productFamilyId.
         * @param  productFamilyId  Integer value for productFamilyId.
         * @return Builder
         */
        public Builder productFamilyId(Integer productFamilyId) {
            this.productFamilyId = productFamilyId;
            return this;
        }

        /**
         * Setter for productId.
         * @param  productId  Integer value for productId.
         * @return Builder
         */
        public Builder productId(Integer productId) {
            this.productId = productId;
            return this;
        }

        /**
         * Setter for productPricePointId.
         * @param  productPricePointId  Integer value for productPricePointId.
         * @return Builder
         */
        public Builder productPricePointId(Integer productPricePointId) {
            this.productPricePointId = productPricePointId;
            return this;
        }

        /**
         * Setter for productRevisableNumber.
         * @param  productRevisableNumber  Integer value for productRevisableNumber.
         * @return Builder
         */
        public Builder productRevisableNumber(Integer productRevisableNumber) {
            this.productRevisableNumber = productRevisableNumber;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for handle.
         * @param  handle  String value for handle.
         * @return Builder
         */
        public Builder handle(String handle) {
            this.handle = handle;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  String value for createdAt.
         * @return Builder
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  String value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Setter for archivedAt.
         * @param  archivedAt  String value for archivedAt.
         * @return Builder
         */
        public Builder archivedAt(String archivedAt) {
            this.archivedAt = OptionalNullable.of(archivedAt);
            return this;
        }

        /**
         * UnSetter for archivedAt.
         * @return Builder
         */
        public Builder unsetArchivedAt() {
            archivedAt = null;
            return this;
        }

        /**
         * Setter for offerItems.
         * @param  offerItems  List of OfferItem value for offerItems.
         * @return Builder
         */
        public Builder offerItems(List<OfferItem> offerItems) {
            this.offerItems = offerItems;
            return this;
        }

        /**
         * Setter for offerDiscounts.
         * @param  offerDiscounts  List of OfferDiscount value for offerDiscounts.
         * @return Builder
         */
        public Builder offerDiscounts(List<OfferDiscount> offerDiscounts) {
            this.offerDiscounts = offerDiscounts;
            return this;
        }

        /**
         * Setter for productFamilyName.
         * @param  productFamilyName  String value for productFamilyName.
         * @return Builder
         */
        public Builder productFamilyName(String productFamilyName) {
            this.productFamilyName = productFamilyName;
            return this;
        }

        /**
         * Setter for productName.
         * @param  productName  String value for productName.
         * @return Builder
         */
        public Builder productName(String productName) {
            this.productName = productName;
            return this;
        }

        /**
         * Setter for productPricePointName.
         * @param  productPricePointName  String value for productPricePointName.
         * @return Builder
         */
        public Builder productPricePointName(String productPricePointName) {
            this.productPricePointName = productPricePointName;
            return this;
        }

        /**
         * Setter for productPriceInCents.
         * @param  productPriceInCents  Integer value for productPriceInCents.
         * @return Builder
         */
        public Builder productPriceInCents(Integer productPriceInCents) {
            this.productPriceInCents = productPriceInCents;
            return this;
        }

        /**
         * Setter for offerSignupPages.
         * @param  offerSignupPages  List of OfferSignupPage value for offerSignupPages.
         * @return Builder
         */
        public Builder offerSignupPages(List<OfferSignupPage> offerSignupPages) {
            this.offerSignupPages = offerSignupPages;
            return this;
        }

        /**
         * Builds a new {@link Offer} object using the set fields.
         * @return {@link Offer}
         */
        public Offer build() {
            return new Offer(id, siteId, productFamilyId, productId, productPricePointId,
                    productRevisableNumber, name, handle, description, createdAt, updatedAt,
                    archivedAt, offerItems, offerDiscounts, productFamilyName, productName,
                    productPricePointName, productPriceInCents, offerSignupPages);
        }
    }
}
