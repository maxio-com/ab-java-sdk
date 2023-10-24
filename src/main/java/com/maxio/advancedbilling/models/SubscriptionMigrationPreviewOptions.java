/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for SubscriptionMigrationPreviewOptions type.
 */
public class SubscriptionMigrationPreviewOptions {
    private Integer productId;
    private Integer productPricePointId;
    private Boolean includeTrial;
    private Boolean includeInitialCharge;
    private Boolean includeCoupons;
    private Boolean preservePeriod;
    private String productHandle;
    private String productPricePointHandle;
    private Proration proration;
    private String prorationDate;

    /**
     * Default constructor.
     */
    public SubscriptionMigrationPreviewOptions() {
        includeTrial = false;
        includeInitialCharge = false;
        includeCoupons = true;
        preservePeriod = false;
    }

    /**
     * Initialization constructor.
     * @param  productId  Integer value for productId.
     * @param  productPricePointId  Integer value for productPricePointId.
     * @param  includeTrial  Boolean value for includeTrial.
     * @param  includeInitialCharge  Boolean value for includeInitialCharge.
     * @param  includeCoupons  Boolean value for includeCoupons.
     * @param  preservePeriod  Boolean value for preservePeriod.
     * @param  productHandle  String value for productHandle.
     * @param  productPricePointHandle  String value for productPricePointHandle.
     * @param  proration  Proration value for proration.
     * @param  prorationDate  String value for prorationDate.
     */
    public SubscriptionMigrationPreviewOptions(
            Integer productId,
            Integer productPricePointId,
            Boolean includeTrial,
            Boolean includeInitialCharge,
            Boolean includeCoupons,
            Boolean preservePeriod,
            String productHandle,
            String productPricePointHandle,
            Proration proration,
            String prorationDate) {
        this.productId = productId;
        this.productPricePointId = productPricePointId;
        this.includeTrial = includeTrial;
        this.includeInitialCharge = includeInitialCharge;
        this.includeCoupons = includeCoupons;
        this.preservePeriod = preservePeriod;
        this.productHandle = productHandle;
        this.productPricePointHandle = productPricePointHandle;
        this.proration = proration;
        this.prorationDate = prorationDate;
    }

    /**
     * Getter for ProductId.
     * The ID of the target Product. Either a product_id or product_handle must be present. A
     * Subscription can be migrated to another product for both the current Product Family and
     * another Product Family. Note: Going to another Product Family, components will not be
     * migrated as well.
     * @return Returns the Integer
     */
    @JsonGetter("product_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getProductId() {
        return productId;
    }

    /**
     * Setter for ProductId.
     * The ID of the target Product. Either a product_id or product_handle must be present. A
     * Subscription can be migrated to another product for both the current Product Family and
     * another Product Family. Note: Going to another Product Family, components will not be
     * migrated as well.
     * @param productId Value for Integer
     */
    @JsonSetter("product_id")
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * Getter for ProductPricePointId.
     * The ID of the specified product's price point. This can be passed to migrate to a non-default
     * price point.
     * @return Returns the Integer
     */
    @JsonGetter("product_price_point_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getProductPricePointId() {
        return productPricePointId;
    }

    /**
     * Setter for ProductPricePointId.
     * The ID of the specified product's price point. This can be passed to migrate to a non-default
     * price point.
     * @param productPricePointId Value for Integer
     */
    @JsonSetter("product_price_point_id")
    public void setProductPricePointId(Integer productPricePointId) {
        this.productPricePointId = productPricePointId;
    }

    /**
     * Getter for IncludeTrial.
     * Whether to include the trial period configured for the product price point when starting a
     * new billing period. Note that if preserve_period is set, then include_trial will be ignored.
     * @return Returns the Boolean
     */
    @JsonGetter("include_trial")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIncludeTrial() {
        return includeTrial;
    }

    /**
     * Setter for IncludeTrial.
     * Whether to include the trial period configured for the product price point when starting a
     * new billing period. Note that if preserve_period is set, then include_trial will be ignored.
     * @param includeTrial Value for Boolean
     */
    @JsonSetter("include_trial")
    public void setIncludeTrial(Boolean includeTrial) {
        this.includeTrial = includeTrial;
    }

    /**
     * Getter for IncludeInitialCharge.
     * If `true` is sent initial charges will be assessed.
     * @return Returns the Boolean
     */
    @JsonGetter("include_initial_charge")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIncludeInitialCharge() {
        return includeInitialCharge;
    }

    /**
     * Setter for IncludeInitialCharge.
     * If `true` is sent initial charges will be assessed.
     * @param includeInitialCharge Value for Boolean
     */
    @JsonSetter("include_initial_charge")
    public void setIncludeInitialCharge(Boolean includeInitialCharge) {
        this.includeInitialCharge = includeInitialCharge;
    }

    /**
     * Getter for IncludeCoupons.
     * If `true` is sent, any coupons associated with the subscription will be applied to the
     * migration. If `false` is sent, coupons will not be applied. Note: When migrating to a new
     * product family, the coupon cannot migrate.
     * @return Returns the Boolean
     */
    @JsonGetter("include_coupons")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIncludeCoupons() {
        return includeCoupons;
    }

    /**
     * Setter for IncludeCoupons.
     * If `true` is sent, any coupons associated with the subscription will be applied to the
     * migration. If `false` is sent, coupons will not be applied. Note: When migrating to a new
     * product family, the coupon cannot migrate.
     * @param includeCoupons Value for Boolean
     */
    @JsonSetter("include_coupons")
    public void setIncludeCoupons(Boolean includeCoupons) {
        this.includeCoupons = includeCoupons;
    }

    /**
     * Getter for PreservePeriod.
     * If `false` is sent, the subscription's billing period will be reset to today and the full
     * price of the new product will be charged. If `true` is sent, the billing period will not
     * change and a prorated charge will be issued for the new product.
     * @return Returns the Boolean
     */
    @JsonGetter("preserve_period")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getPreservePeriod() {
        return preservePeriod;
    }

    /**
     * Setter for PreservePeriod.
     * If `false` is sent, the subscription's billing period will be reset to today and the full
     * price of the new product will be charged. If `true` is sent, the billing period will not
     * change and a prorated charge will be issued for the new product.
     * @param preservePeriod Value for Boolean
     */
    @JsonSetter("preserve_period")
    public void setPreservePeriod(Boolean preservePeriod) {
        this.preservePeriod = preservePeriod;
    }

    /**
     * Getter for ProductHandle.
     * The handle of the target Product. Either a product_id or product_handle must be present. A
     * Subscription can be migrated to another product for both the current Product Family and
     * another Product Family. Note: Going to another Product Family, components will not be
     * migrated as well.
     * @return Returns the String
     */
    @JsonGetter("product_handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductHandle() {
        return productHandle;
    }

    /**
     * Setter for ProductHandle.
     * The handle of the target Product. Either a product_id or product_handle must be present. A
     * Subscription can be migrated to another product for both the current Product Family and
     * another Product Family. Note: Going to another Product Family, components will not be
     * migrated as well.
     * @param productHandle Value for String
     */
    @JsonSetter("product_handle")
    public void setProductHandle(String productHandle) {
        this.productHandle = productHandle;
    }

    /**
     * Getter for ProductPricePointHandle.
     * The ID or handle of the specified product's price point. This can be passed to migrate to a
     * non-default price point.
     * @return Returns the String
     */
    @JsonGetter("product_price_point_handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductPricePointHandle() {
        return productPricePointHandle;
    }

    /**
     * Setter for ProductPricePointHandle.
     * The ID or handle of the specified product's price point. This can be passed to migrate to a
     * non-default price point.
     * @param productPricePointHandle Value for String
     */
    @JsonSetter("product_price_point_handle")
    public void setProductPricePointHandle(String productPricePointHandle) {
        this.productPricePointHandle = productPricePointHandle;
    }

    /**
     * Getter for Proration.
     * @return Returns the Proration
     */
    @JsonGetter("proration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Proration getProration() {
        return proration;
    }

    /**
     * Setter for Proration.
     * @param proration Value for Proration
     */
    @JsonSetter("proration")
    public void setProration(Proration proration) {
        this.proration = proration;
    }

    /**
     * Getter for ProrationDate.
     * The date that the proration is calculated from for the preview
     * @return Returns the String
     */
    @JsonGetter("proration_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProrationDate() {
        return prorationDate;
    }

    /**
     * Setter for ProrationDate.
     * The date that the proration is calculated from for the preview
     * @param prorationDate Value for String
     */
    @JsonSetter("proration_date")
    public void setProrationDate(String prorationDate) {
        this.prorationDate = prorationDate;
    }

    /**
     * Converts this SubscriptionMigrationPreviewOptions into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionMigrationPreviewOptions [" + "productId=" + productId
                + ", productPricePointId=" + productPricePointId + ", includeTrial=" + includeTrial
                + ", includeInitialCharge=" + includeInitialCharge + ", includeCoupons="
                + includeCoupons + ", preservePeriod=" + preservePeriod + ", productHandle="
                + productHandle + ", productPricePointHandle=" + productPricePointHandle
                + ", proration=" + proration + ", prorationDate=" + prorationDate + "]";
    }

    /**
     * Builds a new {@link SubscriptionMigrationPreviewOptions.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionMigrationPreviewOptions.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .productId(getProductId())
                .productPricePointId(getProductPricePointId())
                .includeTrial(getIncludeTrial())
                .includeInitialCharge(getIncludeInitialCharge())
                .includeCoupons(getIncludeCoupons())
                .preservePeriod(getPreservePeriod())
                .productHandle(getProductHandle())
                .productPricePointHandle(getProductPricePointHandle())
                .proration(getProration())
                .prorationDate(getProrationDate());
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionMigrationPreviewOptions}.
     */
    public static class Builder {
        private Integer productId;
        private Integer productPricePointId;
        private Boolean includeTrial = false;
        private Boolean includeInitialCharge = false;
        private Boolean includeCoupons = true;
        private Boolean preservePeriod = false;
        private String productHandle;
        private String productPricePointHandle;
        private Proration proration;
        private String prorationDate;



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
         * Setter for includeTrial.
         * @param  includeTrial  Boolean value for includeTrial.
         * @return Builder
         */
        public Builder includeTrial(Boolean includeTrial) {
            this.includeTrial = includeTrial;
            return this;
        }

        /**
         * Setter for includeInitialCharge.
         * @param  includeInitialCharge  Boolean value for includeInitialCharge.
         * @return Builder
         */
        public Builder includeInitialCharge(Boolean includeInitialCharge) {
            this.includeInitialCharge = includeInitialCharge;
            return this;
        }

        /**
         * Setter for includeCoupons.
         * @param  includeCoupons  Boolean value for includeCoupons.
         * @return Builder
         */
        public Builder includeCoupons(Boolean includeCoupons) {
            this.includeCoupons = includeCoupons;
            return this;
        }

        /**
         * Setter for preservePeriod.
         * @param  preservePeriod  Boolean value for preservePeriod.
         * @return Builder
         */
        public Builder preservePeriod(Boolean preservePeriod) {
            this.preservePeriod = preservePeriod;
            return this;
        }

        /**
         * Setter for productHandle.
         * @param  productHandle  String value for productHandle.
         * @return Builder
         */
        public Builder productHandle(String productHandle) {
            this.productHandle = productHandle;
            return this;
        }

        /**
         * Setter for productPricePointHandle.
         * @param  productPricePointHandle  String value for productPricePointHandle.
         * @return Builder
         */
        public Builder productPricePointHandle(String productPricePointHandle) {
            this.productPricePointHandle = productPricePointHandle;
            return this;
        }

        /**
         * Setter for proration.
         * @param  proration  Proration value for proration.
         * @return Builder
         */
        public Builder proration(Proration proration) {
            this.proration = proration;
            return this;
        }

        /**
         * Setter for prorationDate.
         * @param  prorationDate  String value for prorationDate.
         * @return Builder
         */
        public Builder prorationDate(String prorationDate) {
            this.prorationDate = prorationDate;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionMigrationPreviewOptions} object using the set fields.
         * @return {@link SubscriptionMigrationPreviewOptions}
         */
        public SubscriptionMigrationPreviewOptions build() {
            return new SubscriptionMigrationPreviewOptions(productId, productPricePointId,
                    includeTrial, includeInitialCharge, includeCoupons, preservePeriod,
                    productHandle, productPricePointHandle, proration, prorationDate);
        }
    }
}
