/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;



/**
 * This is a model class for AmountRefundPrepayment type.
 */
public class AmountRefundPrepayment {

    /**
     * Default constructor.
     */
    public AmountRefundPrepayment() {
    }

    /**
     * Converts this AmountRefundPrepayment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AmountRefundPrepayment [" + "]";
    }

    /**
     * Builds a new {@link AmountRefundPrepayment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AmountRefundPrepayment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        return builder;
    }

    /**
     * Class to build instances of {@link AmountRefundPrepayment}.
     */
    public static class Builder {






        /**
         * Builds a new {@link AmountRefundPrepayment} object using the set fields.
         * @return {@link AmountRefundPrepayment}
         */
        public AmountRefundPrepayment build() {
            return new AmountRefundPrepayment();
        }
    }
}
