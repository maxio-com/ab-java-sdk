/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for CreateOrUpdateProductRequest type.
 */
public class CreateOrUpdateProductRequest {
    private CreateOrUpdateProduct product;

    /**
     * Default constructor.
     */
    public CreateOrUpdateProductRequest() {
    }

    /**
     * Initialization constructor.
     * @param  product  CreateOrUpdateProduct value for product.
     */
    public CreateOrUpdateProductRequest(
            CreateOrUpdateProduct product) {
        this.product = product;
    }

    /**
     * Getter for Product.
     * @return Returns the CreateOrUpdateProduct
     */
    @JsonGetter("product")
    public CreateOrUpdateProduct getProduct() {
        return product;
    }

    /**
     * Setter for Product.
     * @param product Value for CreateOrUpdateProduct
     */
    @JsonSetter("product")
    public void setProduct(CreateOrUpdateProduct product) {
        this.product = product;
    }

    /**
     * Converts this CreateOrUpdateProductRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateOrUpdateProductRequest [" + "product=" + product + "]";
    }

    /**
     * Builds a new {@link CreateOrUpdateProductRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateOrUpdateProductRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(product);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateOrUpdateProductRequest}.
     */
    public static class Builder {
        private CreateOrUpdateProduct product;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  product  CreateOrUpdateProduct value for product.
         */
        public Builder(CreateOrUpdateProduct product) {
            this.product = product;
        }

        /**
         * Setter for product.
         * @param  product  CreateOrUpdateProduct value for product.
         * @return Builder
         */
        public Builder product(CreateOrUpdateProduct product) {
            this.product = product;
            return this;
        }

        /**
         * Builds a new {@link CreateOrUpdateProductRequest} object using the set fields.
         * @return {@link CreateOrUpdateProductRequest}
         */
        public CreateOrUpdateProductRequest build() {
            return new CreateOrUpdateProductRequest(product);
        }
    }
}
