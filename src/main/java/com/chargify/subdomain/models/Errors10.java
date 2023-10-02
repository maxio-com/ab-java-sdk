/*
 * MaxioAdvancedBillingFormerlyChargifyAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.chargify.subdomain.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for Errors10 type.
 */
public class Errors10 {
    private List<String> perPage;
    private List<String> pricePoint;

    /**
     * Default constructor.
     */
    public Errors10() {
    }

    /**
     * Initialization constructor.
     * @param  perPage  List of String value for perPage.
     * @param  pricePoint  List of String value for pricePoint.
     */
    public Errors10(
            List<String> perPage,
            List<String> pricePoint) {
        this.perPage = perPage;
        this.pricePoint = pricePoint;
    }

    /**
     * Getter for PerPage.
     * @return Returns the List of String
     */
    @JsonGetter("per_page")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getPerPage() {
        return perPage;
    }

    /**
     * Setter for PerPage.
     * @param perPage Value for List of String
     */
    @JsonSetter("per_page")
    public void setPerPage(List<String> perPage) {
        this.perPage = perPage;
    }

    /**
     * Getter for PricePoint.
     * @return Returns the List of String
     */
    @JsonGetter("price_point")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getPricePoint() {
        return pricePoint;
    }

    /**
     * Setter for PricePoint.
     * @param pricePoint Value for List of String
     */
    @JsonSetter("price_point")
    public void setPricePoint(List<String> pricePoint) {
        this.pricePoint = pricePoint;
    }

    /**
     * Converts this Errors10 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Errors10 [" + "perPage=" + perPage + ", pricePoint=" + pricePoint + "]";
    }

    /**
     * Builds a new {@link Errors10.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Errors10.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .perPage(getPerPage())
                .pricePoint(getPricePoint());
        return builder;
    }

    /**
     * Class to build instances of {@link Errors10}.
     */
    public static class Builder {
        private List<String> perPage;
        private List<String> pricePoint;



        /**
         * Setter for perPage.
         * @param  perPage  List of String value for perPage.
         * @return Builder
         */
        public Builder perPage(List<String> perPage) {
            this.perPage = perPage;
            return this;
        }

        /**
         * Setter for pricePoint.
         * @param  pricePoint  List of String value for pricePoint.
         * @return Builder
         */
        public Builder pricePoint(List<String> pricePoint) {
            this.pricePoint = pricePoint;
            return this;
        }

        /**
         * Builds a new {@link Errors10} object using the set fields.
         * @return {@link Errors10}
         */
        public Errors10 build() {
            return new Errors10(perPage, pricePoint);
        }
    }
}
