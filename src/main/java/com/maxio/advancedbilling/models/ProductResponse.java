/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for ProductResponse type.
 */
public class ProductResponse {
    private Product product;

    /**
     * Default constructor.
     */
    public ProductResponse() {
    }

    /**
     * Initialization constructor.
     * @param  product  Product value for product.
     */
    public ProductResponse(
            Product product) {
        this.product = product;
    }

    /**
     * Getter for Product.
     * @return Returns the Product
     */
    @JsonGetter("product")
    public Product getProduct() {
        return product;
    }

    /**
     * Setter for Product.
     * @param product Value for Product
     */
    @JsonSetter("product")
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * Converts this ProductResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ProductResponse [" + "product=" + product + "]";
    }

    /**
     * Builds a new {@link ProductResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ProductResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(product);
        return builder;
    }

    /**
     * Class to build instances of {@link ProductResponse}.
     */
    public static class Builder {
        private Product product;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  product  Product value for product.
         */
        public Builder(Product product) {
            this.product = product;
        }

        /**
         * Setter for product.
         * @param  product  Product value for product.
         * @return Builder
         */
        public Builder product(Product product) {
            this.product = product;
            return this;
        }

        /**
         * Builds a new {@link ProductResponse} object using the set fields.
         * @return {@link ProductResponse}
         */
        public ProductResponse build() {
            return new ProductResponse(product);
        }
    }
}
