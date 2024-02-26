/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for CreateProductFamilyRequest type.
 */
public class CreateProductFamilyRequest {
    private CreateProductFamily productFamily;

    /**
     * Default constructor.
     */
    public CreateProductFamilyRequest() {
    }

    /**
     * Initialization constructor.
     * @param  productFamily  CreateProductFamily value for productFamily.
     */
    public CreateProductFamilyRequest(
            CreateProductFamily productFamily) {
        this.productFamily = productFamily;
    }

    /**
     * Getter for ProductFamily.
     * @return Returns the CreateProductFamily
     */
    @JsonGetter("product_family")
    public CreateProductFamily getProductFamily() {
        return productFamily;
    }

    /**
     * Setter for ProductFamily.
     * @param productFamily Value for CreateProductFamily
     */
    @JsonSetter("product_family")
    public void setProductFamily(CreateProductFamily productFamily) {
        this.productFamily = productFamily;
    }

    /**
     * Converts this CreateProductFamilyRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateProductFamilyRequest [" + "productFamily=" + productFamily + "]";
    }

    /**
     * Builds a new {@link CreateProductFamilyRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateProductFamilyRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(productFamily);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateProductFamilyRequest}.
     */
    public static class Builder {
        private CreateProductFamily productFamily;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  productFamily  CreateProductFamily value for productFamily.
         */
        public Builder(CreateProductFamily productFamily) {
            this.productFamily = productFamily;
        }

        /**
         * Setter for productFamily.
         * @param  productFamily  CreateProductFamily value for productFamily.
         * @return Builder
         */
        public Builder productFamily(CreateProductFamily productFamily) {
            this.productFamily = productFamily;
            return this;
        }

        /**
         * Builds a new {@link CreateProductFamilyRequest} object using the set fields.
         * @return {@link CreateProductFamilyRequest}
         */
        public CreateProductFamilyRequest build() {
            return new CreateProductFamilyRequest(productFamily);
        }
    }
}
