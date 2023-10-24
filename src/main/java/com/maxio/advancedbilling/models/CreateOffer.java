/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for CreateOffer type.
 */
public class CreateOffer {
    private String name;
    private String handle;
    private String description;
    private Integer productId;
    private Integer productPricePointId;
    private List<CreateOfferComponent> components;
    private List<String> coupons;

    /**
     * Default constructor.
     */
    public CreateOffer() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  handle  String value for handle.
     * @param  description  String value for description.
     * @param  productId  Integer value for productId.
     * @param  productPricePointId  Integer value for productPricePointId.
     * @param  components  List of CreateOfferComponent value for components.
     * @param  coupons  List of String value for coupons.
     */
    public CreateOffer(
            String name,
            String handle,
            String description,
            Integer productId,
            Integer productPricePointId,
            List<CreateOfferComponent> components,
            List<String> coupons) {
        this.name = name;
        this.handle = handle;
        this.description = description;
        this.productId = productId;
        this.productPricePointId = productPricePointId;
        this.components = components;
        this.coupons = coupons;
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
     * Getter for Components.
     * @return Returns the List of CreateOfferComponent
     */
    @JsonGetter("components")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CreateOfferComponent> getComponents() {
        return components;
    }

    /**
     * Setter for Components.
     * @param components Value for List of CreateOfferComponent
     */
    @JsonSetter("components")
    public void setComponents(List<CreateOfferComponent> components) {
        this.components = components;
    }

    /**
     * Getter for Coupons.
     * @return Returns the List of String
     */
    @JsonGetter("coupons")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getCoupons() {
        return coupons;
    }

    /**
     * Setter for Coupons.
     * @param coupons Value for List of String
     */
    @JsonSetter("coupons")
    public void setCoupons(List<String> coupons) {
        this.coupons = coupons;
    }

    /**
     * Converts this CreateOffer into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateOffer [" + "name=" + name + ", handle=" + handle + ", description="
                + description + ", productId=" + productId + ", productPricePointId="
                + productPricePointId + ", components=" + components + ", coupons=" + coupons + "]";
    }

    /**
     * Builds a new {@link CreateOffer.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateOffer.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .handle(getHandle())
                .description(getDescription())
                .productId(getProductId())
                .productPricePointId(getProductPricePointId())
                .components(getComponents())
                .coupons(getCoupons());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateOffer}.
     */
    public static class Builder {
        private String name;
        private String handle;
        private String description;
        private Integer productId;
        private Integer productPricePointId;
        private List<CreateOfferComponent> components;
        private List<String> coupons;



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
         * Setter for components.
         * @param  components  List of CreateOfferComponent value for components.
         * @return Builder
         */
        public Builder components(List<CreateOfferComponent> components) {
            this.components = components;
            return this;
        }

        /**
         * Setter for coupons.
         * @param  coupons  List of String value for coupons.
         * @return Builder
         */
        public Builder coupons(List<String> coupons) {
            this.coupons = coupons;
            return this;
        }

        /**
         * Builds a new {@link CreateOffer} object using the set fields.
         * @return {@link CreateOffer}
         */
        public CreateOffer build() {
            return new CreateOffer(name, handle, description, productId, productPricePointId,
                    components, coupons);
        }
    }
}
