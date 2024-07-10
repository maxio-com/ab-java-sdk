/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for SubscriptionGroupSubscriptionError type.
 */
public class SubscriptionGroupSubscriptionError
        extends BaseModel {
    private List<String> product;
    private List<String> productPricePointId;
    private List<String> paymentProfile;
    private List<String> paymentProfileChargifyToken;
    private List<String> base;
    private List<String> paymentProfileExpirationMonth;
    private List<String> paymentProfileExpirationYear;
    private List<String> paymentProfileFullNumber;

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
     * @param  base  List of String value for base.
     * @param  paymentProfileExpirationMonth  List of String value for
     *         paymentProfileExpirationMonth.
     * @param  paymentProfileExpirationYear  List of String value for paymentProfileExpirationYear.
     * @param  paymentProfileFullNumber  List of String value for paymentProfileFullNumber.
     */
    public SubscriptionGroupSubscriptionError(
            List<String> product,
            List<String> productPricePointId,
            List<String> paymentProfile,
            List<String> paymentProfileChargifyToken,
            List<String> base,
            List<String> paymentProfileExpirationMonth,
            List<String> paymentProfileExpirationYear,
            List<String> paymentProfileFullNumber) {
        this.product = product;
        this.productPricePointId = productPricePointId;
        this.paymentProfile = paymentProfile;
        this.paymentProfileChargifyToken = paymentProfileChargifyToken;
        this.base = base;
        this.paymentProfileExpirationMonth = paymentProfileExpirationMonth;
        this.paymentProfileExpirationYear = paymentProfileExpirationYear;
        this.paymentProfileFullNumber = paymentProfileFullNumber;
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
     * Getter for Base.
     * @return Returns the List of String
     */
    @JsonGetter("base")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getBase() {
        return base;
    }

    /**
     * Setter for Base.
     * @param base Value for List of String
     */
    @JsonSetter("base")
    public void setBase(List<String> base) {
        this.base = base;
    }

    /**
     * Getter for PaymentProfileExpirationMonth.
     * @return Returns the List of String
     */
    @JsonGetter("payment_profile.expiration_month")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getPaymentProfileExpirationMonth() {
        return paymentProfileExpirationMonth;
    }

    /**
     * Setter for PaymentProfileExpirationMonth.
     * @param paymentProfileExpirationMonth Value for List of String
     */
    @JsonSetter("payment_profile.expiration_month")
    public void setPaymentProfileExpirationMonth(List<String> paymentProfileExpirationMonth) {
        this.paymentProfileExpirationMonth = paymentProfileExpirationMonth;
    }

    /**
     * Getter for PaymentProfileExpirationYear.
     * @return Returns the List of String
     */
    @JsonGetter("payment_profile.expiration_year")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getPaymentProfileExpirationYear() {
        return paymentProfileExpirationYear;
    }

    /**
     * Setter for PaymentProfileExpirationYear.
     * @param paymentProfileExpirationYear Value for List of String
     */
    @JsonSetter("payment_profile.expiration_year")
    public void setPaymentProfileExpirationYear(List<String> paymentProfileExpirationYear) {
        this.paymentProfileExpirationYear = paymentProfileExpirationYear;
    }

    /**
     * Getter for PaymentProfileFullNumber.
     * @return Returns the List of String
     */
    @JsonGetter("payment_profile.full_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getPaymentProfileFullNumber() {
        return paymentProfileFullNumber;
    }

    /**
     * Setter for PaymentProfileFullNumber.
     * @param paymentProfileFullNumber Value for List of String
     */
    @JsonSetter("payment_profile.full_number")
    public void setPaymentProfileFullNumber(List<String> paymentProfileFullNumber) {
        this.paymentProfileFullNumber = paymentProfileFullNumber;
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
                + ", base=" + base + ", paymentProfileExpirationMonth="
                + paymentProfileExpirationMonth + ", paymentProfileExpirationYear="
                + paymentProfileExpirationYear + ", paymentProfileFullNumber="
                + paymentProfileFullNumber + ", additionalProperties=" + getAdditionalProperties()
                + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .product(getProduct())
                .productPricePointId(getProductPricePointId())
                .paymentProfile(getPaymentProfile())
                .paymentProfileChargifyToken(getPaymentProfileChargifyToken())
                .base(getBase())
                .paymentProfileExpirationMonth(getPaymentProfileExpirationMonth())
                .paymentProfileExpirationYear(getPaymentProfileExpirationYear())
                .paymentProfileFullNumber(getPaymentProfileFullNumber());
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
        private List<String> base;
        private List<String> paymentProfileExpirationMonth;
        private List<String> paymentProfileExpirationYear;
        private List<String> paymentProfileFullNumber;



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
         * Setter for base.
         * @param  base  List of String value for base.
         * @return Builder
         */
        public Builder base(List<String> base) {
            this.base = base;
            return this;
        }

        /**
         * Setter for paymentProfileExpirationMonth.
         * @param  paymentProfileExpirationMonth  List of String value for
         *         paymentProfileExpirationMonth.
         * @return Builder
         */
        public Builder paymentProfileExpirationMonth(List<String> paymentProfileExpirationMonth) {
            this.paymentProfileExpirationMonth = paymentProfileExpirationMonth;
            return this;
        }

        /**
         * Setter for paymentProfileExpirationYear.
         * @param  paymentProfileExpirationYear  List of String value for
         *         paymentProfileExpirationYear.
         * @return Builder
         */
        public Builder paymentProfileExpirationYear(List<String> paymentProfileExpirationYear) {
            this.paymentProfileExpirationYear = paymentProfileExpirationYear;
            return this;
        }

        /**
         * Setter for paymentProfileFullNumber.
         * @param  paymentProfileFullNumber  List of String value for paymentProfileFullNumber.
         * @return Builder
         */
        public Builder paymentProfileFullNumber(List<String> paymentProfileFullNumber) {
            this.paymentProfileFullNumber = paymentProfileFullNumber;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionGroupSubscriptionError} object using the set fields.
         * @return {@link SubscriptionGroupSubscriptionError}
         */
        public SubscriptionGroupSubscriptionError build() {
            return new SubscriptionGroupSubscriptionError(product, productPricePointId,
                    paymentProfile, paymentProfileChargifyToken, base,
                    paymentProfileExpirationMonth, paymentProfileExpirationYear,
                    paymentProfileFullNumber);
        }
    }
}
