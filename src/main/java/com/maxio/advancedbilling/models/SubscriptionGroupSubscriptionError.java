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
 * This is a model class for SubscriptionGroupSubscriptionError type.
 */
public class SubscriptionGroupSubscriptionError {
    private List<String> product;
    private List<String> productPricePointId;
    private List<String> paymentProfile;
    private List<String> paymentProfileChargifyToken;

    /**
     * Default constructor.
     */
    public SubscriptionGroupSubscriptionError() {
    }

    /**
     * Initialization constructor.
     * @param  product  List of String value for product.
     * @param  productPricePointId  List of String value for productPricePointId.
     * @param  paymentProfile  List of String value for paymentProfile.
     * @param  paymentProfileChargifyToken  List of String value for paymentProfileChargifyToken.
     */
    public SubscriptionGroupSubscriptionError(
            List<String> product,
            List<String> productPricePointId,
            List<String> paymentProfile,
            List<String> paymentProfileChargifyToken) {
        this.product = product;
        this.productPricePointId = productPricePointId;
        this.paymentProfile = paymentProfile;
        this.paymentProfileChargifyToken = paymentProfileChargifyToken;
    }

    /**
     * Getter for Product.
     * @return Returns the List of String
     */
    @JsonGetter("product")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getProduct() {
        return product;
    }

    /**
     * Setter for Product.
     * @param product Value for List of String
     */
    @JsonSetter("product")
    public void setProduct(List<String> product) {
        this.product = product;
    }

    /**
     * Getter for ProductPricePointId.
     * @return Returns the List of String
     */
    @JsonGetter("product_price_point_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getProductPricePointId() {
        return productPricePointId;
    }

    /**
     * Setter for ProductPricePointId.
     * @param productPricePointId Value for List of String
     */
    @JsonSetter("product_price_point_id")
    public void setProductPricePointId(List<String> productPricePointId) {
        this.productPricePointId = productPricePointId;
    }

    /**
     * Getter for PaymentProfile.
     * @return Returns the List of String
     */
    @JsonGetter("payment_profile")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getPaymentProfile() {
        return paymentProfile;
    }

    /**
     * Setter for PaymentProfile.
     * @param paymentProfile Value for List of String
     */
    @JsonSetter("payment_profile")
    public void setPaymentProfile(List<String> paymentProfile) {
        this.paymentProfile = paymentProfile;
    }

    /**
     * Getter for PaymentProfileChargifyToken.
     * @return Returns the List of String
     */
    @JsonGetter("payment_profile.chargify_token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getPaymentProfileChargifyToken() {
        return paymentProfileChargifyToken;
    }

    /**
     * Setter for PaymentProfileChargifyToken.
     * @param paymentProfileChargifyToken Value for List of String
     */
    @JsonSetter("payment_profile.chargify_token")
    public void setPaymentProfileChargifyToken(List<String> paymentProfileChargifyToken) {
        this.paymentProfileChargifyToken = paymentProfileChargifyToken;
    }

    /**
     * Converts this SubscriptionGroupSubscriptionError into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionGroupSubscriptionError [" + "product=" + product
                + ", productPricePointId=" + productPricePointId + ", paymentProfile="
                + paymentProfile + ", paymentProfileChargifyToken=" + paymentProfileChargifyToken
                + "]";
    }

    /**
     * Builds a new {@link SubscriptionGroupSubscriptionError.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionGroupSubscriptionError.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .product(getProduct())
                .productPricePointId(getProductPricePointId())
                .paymentProfile(getPaymentProfile())
                .paymentProfileChargifyToken(getPaymentProfileChargifyToken());
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionGroupSubscriptionError}.
     */
    public static class Builder {
        private List<String> product;
        private List<String> productPricePointId;
        private List<String> paymentProfile;
        private List<String> paymentProfileChargifyToken;



        /**
         * Setter for product.
         * @param  product  List of String value for product.
         * @return Builder
         */
        public Builder product(List<String> product) {
            this.product = product;
            return this;
        }

        /**
         * Setter for productPricePointId.
         * @param  productPricePointId  List of String value for productPricePointId.
         * @return Builder
         */
        public Builder productPricePointId(List<String> productPricePointId) {
            this.productPricePointId = productPricePointId;
            return this;
        }

        /**
         * Setter for paymentProfile.
         * @param  paymentProfile  List of String value for paymentProfile.
         * @return Builder
         */
        public Builder paymentProfile(List<String> paymentProfile) {
            this.paymentProfile = paymentProfile;
            return this;
        }

        /**
         * Setter for paymentProfileChargifyToken.
         * @param  paymentProfileChargifyToken  List of String value for
         *         paymentProfileChargifyToken.
         * @return Builder
         */
        public Builder paymentProfileChargifyToken(List<String> paymentProfileChargifyToken) {
            this.paymentProfileChargifyToken = paymentProfileChargifyToken;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionGroupSubscriptionError} object using the set fields.
         * @return {@link SubscriptionGroupSubscriptionError}
         */
        public SubscriptionGroupSubscriptionError build() {
            return new SubscriptionGroupSubscriptionError(product, productPricePointId,
                    paymentProfile, paymentProfileChargifyToken);
        }
    }
}
