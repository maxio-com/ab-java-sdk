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
 * This is a model class for ComponentPricePointsResponse type.
 */
public class ComponentPricePointsResponse
        extends BaseModel {
    private List<ComponentPricePoint> pricePoints;
    private ListPublicKeysMeta meta;

    /**
     * Default constructor.
     */
    public ComponentPricePointsResponse() {
    }

    /**
     * Initialization constructor.
     * @param  pricePoints  List of ComponentPricePoint value for pricePoints.
     * @param  meta  ListPublicKeysMeta value for meta.
     */
    public ComponentPricePointsResponse(
            List<ComponentPricePoint> pricePoints,
            ListPublicKeysMeta meta) {
        this.pricePoints = pricePoints;
        this.meta = meta;
    }

    /**
     * Getter for PricePoints.
     * @return Returns the List of ComponentPricePoint
     */
    @JsonGetter("price_points")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ComponentPricePoint> getPricePoints() {
        return pricePoints;
    }

    /**
     * Setter for PricePoints.
     * @param pricePoints Value for List of ComponentPricePoint
     */
    @JsonSetter("price_points")
    public void setPricePoints(List<ComponentPricePoint> pricePoints) {
        this.pricePoints = pricePoints;
    }

    /**
     * Getter for Meta.
     * @return Returns the ListPublicKeysMeta
     */
    @JsonGetter("meta")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ListPublicKeysMeta getMeta() {
        return meta;
    }

    /**
     * Setter for Meta.
     * @param meta Value for ListPublicKeysMeta
     */
    @JsonSetter("meta")
    public void setMeta(ListPublicKeysMeta meta) {
        this.meta = meta;
    }

    /**
     * Converts this ComponentPricePointsResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ComponentPricePointsResponse [" + "pricePoints=" + pricePoints + ", meta=" + meta
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .pricePoints(getPricePoints())
                .meta(getMeta());
        return builder;
    }

    /**
     * Class to build instances of {@link ComponentPricePointsResponse}.
     */
    public static class Builder {
        private List<ComponentPricePoint> pricePoints;
        private ListPublicKeysMeta meta;



        /**
         * Setter for pricePoints.
         * @param  pricePoints  List of ComponentPricePoint value for pricePoints.
         * @return Builder
         */
        public Builder pricePoints(List<ComponentPricePoint> pricePoints) {
            this.pricePoints = pricePoints;
            return this;
        }

        /**
         * Setter for meta.
         * @param  meta  ListPublicKeysMeta value for meta.
         * @return Builder
         */
        public Builder meta(ListPublicKeysMeta meta) {
            this.meta = meta;
            return this;
        }

        /**
         * Builds a new {@link ComponentPricePointsResponse} object using the set fields.
         * @return {@link ComponentPricePointsResponse}
         */
        public ComponentPricePointsResponse build() {
            return new ComponentPricePointsResponse(pricePoints, meta);
        }
    }
}
