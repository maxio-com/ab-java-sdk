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
 * This is a model class for ProductPricePointErrors type.
 */
public class ProductPricePointErrors
        extends BaseModel {
    private String pricePoint;
    private List<String> interval;
    private List<String> intervalUnit;
    private List<String> name;
    private List<String> price;
    private List<String> priceInCents;

    /**
     * Default constructor.
     */
    public ProductPricePointErrors() {
    }

    /**
     * Initialization constructor.
     * @param  pricePoint  String value for pricePoint.
     * @param  interval  List of String value for interval.
     * @param  intervalUnit  List of String value for intervalUnit.
     * @param  name  List of String value for name.
     * @param  price  List of String value for price.
     * @param  priceInCents  List of String value for priceInCents.
     */
    public ProductPricePointErrors(
            String pricePoint,
            List<String> interval,
            List<String> intervalUnit,
            List<String> name,
            List<String> price,
            List<String> priceInCents) {
        this.pricePoint = pricePoint;
        this.interval = interval;
        this.intervalUnit = intervalUnit;
        this.name = name;
        this.price = price;
        this.priceInCents = priceInCents;
    }

    /**
     * Getter for PricePoint.
     * @return Returns the String
     */
    @JsonGetter("price_point")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPricePoint() {
        return pricePoint;
    }

    /**
     * Setter for PricePoint.
     * @param pricePoint Value for String
     */
    @JsonSetter("price_point")
    public void setPricePoint(String pricePoint) {
        this.pricePoint = pricePoint;
    }

    /**
     * Getter for Interval.
     * @return Returns the List of String
     */
    @JsonGetter("interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getInterval() {
        return interval;
    }

    /**
     * Setter for Interval.
     * @param interval Value for List of String
     */
    @JsonSetter("interval")
    public void setInterval(List<String> interval) {
        this.interval = interval;
    }

    /**
     * Getter for IntervalUnit.
     * @return Returns the List of String
     */
    @JsonGetter("interval_unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getIntervalUnit() {
        return intervalUnit;
    }

    /**
     * Setter for IntervalUnit.
     * @param intervalUnit Value for List of String
     */
    @JsonSetter("interval_unit")
    public void setIntervalUnit(List<String> intervalUnit) {
        this.intervalUnit = intervalUnit;
    }

    /**
     * Getter for Name.
     * @return Returns the List of String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for List of String
     */
    @JsonSetter("name")
    public void setName(List<String> name) {
        this.name = name;
    }

    /**
     * Getter for Price.
     * @return Returns the List of String
     */
    @JsonGetter("price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getPrice() {
        return price;
    }

    /**
     * Setter for Price.
     * @param price Value for List of String
     */
    @JsonSetter("price")
    public void setPrice(List<String> price) {
        this.price = price;
    }

    /**
     * Getter for PriceInCents.
     * @return Returns the List of String
     */
    @JsonGetter("price_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getPriceInCents() {
        return priceInCents;
    }

    /**
     * Setter for PriceInCents.
     * @param priceInCents Value for List of String
     */
    @JsonSetter("price_in_cents")
    public void setPriceInCents(List<String> priceInCents) {
        this.priceInCents = priceInCents;
    }

    /**
     * Converts this ProductPricePointErrors into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ProductPricePointErrors [" + "pricePoint=" + pricePoint + ", interval=" + interval
                + ", intervalUnit=" + intervalUnit + ", name=" + name + ", price=" + price
                + ", priceInCents=" + priceInCents + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ProductPricePointErrors.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ProductPricePointErrors.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .pricePoint(getPricePoint())
                .interval(getInterval())
                .intervalUnit(getIntervalUnit())
                .name(getName())
                .price(getPrice())
                .priceInCents(getPriceInCents());
        return builder;
    }

    /**
     * Class to build instances of {@link ProductPricePointErrors}.
     */
    public static class Builder {
        private String pricePoint;
        private List<String> interval;
        private List<String> intervalUnit;
        private List<String> name;
        private List<String> price;
        private List<String> priceInCents;



        /**
         * Setter for pricePoint.
         * @param  pricePoint  String value for pricePoint.
         * @return Builder
         */
        public Builder pricePoint(String pricePoint) {
            this.pricePoint = pricePoint;
            return this;
        }

        /**
         * Setter for interval.
         * @param  interval  List of String value for interval.
         * @return Builder
         */
        public Builder interval(List<String> interval) {
            this.interval = interval;
            return this;
        }

        /**
         * Setter for intervalUnit.
         * @param  intervalUnit  List of String value for intervalUnit.
         * @return Builder
         */
        public Builder intervalUnit(List<String> intervalUnit) {
            this.intervalUnit = intervalUnit;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  List of String value for name.
         * @return Builder
         */
        public Builder name(List<String> name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for price.
         * @param  price  List of String value for price.
         * @return Builder
         */
        public Builder price(List<String> price) {
            this.price = price;
            return this;
        }

        /**
         * Setter for priceInCents.
         * @param  priceInCents  List of String value for priceInCents.
         * @return Builder
         */
        public Builder priceInCents(List<String> priceInCents) {
            this.priceInCents = priceInCents;
            return this;
        }

        /**
         * Builds a new {@link ProductPricePointErrors} object using the set fields.
         * @return {@link ProductPricePointErrors}
         */
        public ProductPricePointErrors build() {
            return new ProductPricePointErrors(pricePoint, interval, intervalUnit, name, price,
                    priceInCents);
        }
    }
}
