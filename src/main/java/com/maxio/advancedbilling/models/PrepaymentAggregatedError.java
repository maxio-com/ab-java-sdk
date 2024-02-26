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
 * This is a model class for PrepaymentAggregatedError type.
 */
public class PrepaymentAggregatedError {
    private List<String> amountInCents;
    private List<String> base;
    private List<String> external;

    /**
     * Default constructor.
     */
    public PrepaymentAggregatedError() {
    }

    /**
     * Initialization constructor.
     * @param  amountInCents  List of String value for amountInCents.
     * @param  base  List of String value for base.
     * @param  external  List of String value for external.
     */
    public PrepaymentAggregatedError(
            List<String> amountInCents,
            List<String> base,
            List<String> external) {
        this.amountInCents = amountInCents;
        this.base = base;
        this.external = external;
    }

    /**
     * Getter for AmountInCents.
     * @return Returns the List of String
     */
    @JsonGetter("amount_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getAmountInCents() {
        return amountInCents;
    }

    /**
     * Setter for AmountInCents.
     * @param amountInCents Value for List of String
     */
    @JsonSetter("amount_in_cents")
    public void setAmountInCents(List<String> amountInCents) {
        this.amountInCents = amountInCents;
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
     * Getter for External.
     * @return Returns the List of String
     */
    @JsonGetter("external")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getExternal() {
        return external;
    }

    /**
     * Setter for External.
     * @param external Value for List of String
     */
    @JsonSetter("external")
    public void setExternal(List<String> external) {
        this.external = external;
    }

    /**
     * Converts this PrepaymentAggregatedError into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PrepaymentAggregatedError [" + "amountInCents=" + amountInCents + ", base=" + base
                + ", external=" + external + "]";
    }

    /**
     * Builds a new {@link PrepaymentAggregatedError.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PrepaymentAggregatedError.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .amountInCents(getAmountInCents())
                .base(getBase())
                .external(getExternal());
        return builder;
    }

    /**
     * Class to build instances of {@link PrepaymentAggregatedError}.
     */
    public static class Builder {
        private List<String> amountInCents;
        private List<String> base;
        private List<String> external;



        /**
         * Setter for amountInCents.
         * @param  amountInCents  List of String value for amountInCents.
         * @return Builder
         */
        public Builder amountInCents(List<String> amountInCents) {
            this.amountInCents = amountInCents;
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
         * Setter for external.
         * @param  external  List of String value for external.
         * @return Builder
         */
        public Builder external(List<String> external) {
            this.external = external;
            return this;
        }

        /**
         * Builds a new {@link PrepaymentAggregatedError} object using the set fields.
         * @return {@link PrepaymentAggregatedError}
         */
        public PrepaymentAggregatedError build() {
            return new PrepaymentAggregatedError(amountInCents, base, external);
        }
    }
}
