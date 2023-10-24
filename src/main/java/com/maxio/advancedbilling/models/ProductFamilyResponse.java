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
 * This is a model class for ProductFamilyResponse type.
 */
public class ProductFamilyResponse {
    private ProductFamily productFamily;

    /**
     * Default constructor.
     */
    public ProductFamilyResponse() {
    }

    /**
     * Initialization constructor.
     * @param  productFamily  ProductFamily value for productFamily.
     */
    public ProductFamilyResponse(
            ProductFamily productFamily) {
        this.productFamily = productFamily;
    }

    /**
     * Getter for ProductFamily.
     * @return Returns the ProductFamily
     */
    @JsonGetter("product_family")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ProductFamily getProductFamily() {
        return productFamily;
    }

    /**
     * Setter for ProductFamily.
     * @param productFamily Value for ProductFamily
     */
    @JsonSetter("product_family")
    public void setProductFamily(ProductFamily productFamily) {
        this.productFamily = productFamily;
    }

    /**
     * Converts this ProductFamilyResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ProductFamilyResponse [" + "productFamily=" + productFamily + "]";
    }

    /**
     * Builds a new {@link ProductFamilyResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ProductFamilyResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .productFamily(getProductFamily());
        return builder;
    }

    /**
     * Class to build instances of {@link ProductFamilyResponse}.
     */
    public static class Builder {
        private ProductFamily productFamily;



        /**
         * Setter for productFamily.
         * @param  productFamily  ProductFamily value for productFamily.
         * @return Builder
         */
        public Builder productFamily(ProductFamily productFamily) {
            this.productFamily = productFamily;
            return this;
        }

        /**
         * Builds a new {@link ProductFamilyResponse} object using the set fields.
         * @return {@link ProductFamilyResponse}
         */
        public ProductFamilyResponse build() {
            return new ProductFamilyResponse(productFamily);
        }
    }
}
