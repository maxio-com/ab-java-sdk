/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for PrepaidProductPricePointFilter type.
 */
public class PrepaidProductPricePointFilter
        extends BaseModel {
    private String productPricePointId;

    /**
     * Default constructor.
     */
    public PrepaidProductPricePointFilter() {
        productPricePointId = "not_null";
    }

    /**
     * Initialization constructor.
     * @param  productPricePointId  String value for productPricePointId.
     */
    public PrepaidProductPricePointFilter(
            String productPricePointId) {
        this.productPricePointId = productPricePointId;
    }

    /**
     * Getter for ProductPricePointId.
     * Passed as a parameter to list methods to return only non null values.
     * @return Returns the String
     */
    @JsonGetter("product_price_point_id")
    public String getProductPricePointId() {
        return productPricePointId;
    }

    /**
     * Setter for ProductPricePointId.
     * Passed as a parameter to list methods to return only non null values.
     * @param productPricePointId Value for String
     */
    @JsonSetter("product_price_point_id")
    private void setProductPricePointId(String productPricePointId) {
        this.productPricePointId = productPricePointId;
    }

    /**
     * Converts this PrepaidProductPricePointFilter into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PrepaidProductPricePointFilter [" + "productPricePointId=" + productPricePointId
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(productPricePointId);
        return builder;
    }

    /**
     * Class to build instances of {@link PrepaidProductPricePointFilter}.
     */
    public static class Builder {
        private String productPricePointId = "not_null";

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  productPricePointId  String value for productPricePointId.
         */
        public Builder(String productPricePointId) {
            this.productPricePointId = productPricePointId;
        }

        /**
         * Setter for productPricePointId.
         * @param  productPricePointId  String value for productPricePointId.
         * @return Builder
         */
        public Builder productPricePointId(String productPricePointId) {
            this.productPricePointId = productPricePointId;
            return this;
        }

        /**
         * Builds a new {@link PrepaidProductPricePointFilter} object using the set fields.
         * @return {@link PrepaidProductPricePointFilter}
         */
        public PrepaidProductPricePointFilter build() {
            return new PrepaidProductPricePointFilter(productPricePointId);
        }
    }
}
