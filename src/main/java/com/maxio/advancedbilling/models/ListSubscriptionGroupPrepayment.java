/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for ListSubscriptionGroupPrepayment type.
 */
public class ListSubscriptionGroupPrepayment {
    private ListSubcriptionGroupPrepaymentItem prepayment;

    /**
     * Default constructor.
     */
    public ListSubscriptionGroupPrepayment() {
    }

    /**
     * Initialization constructor.
     * @param  prepayment  ListSubcriptionGroupPrepaymentItem value for prepayment.
     */
    public ListSubscriptionGroupPrepayment(
            ListSubcriptionGroupPrepaymentItem prepayment) {
        this.prepayment = prepayment;
    }

    /**
     * Getter for Prepayment.
     * @return Returns the ListSubcriptionGroupPrepaymentItem
     */
    @JsonGetter("prepayment")
    public ListSubcriptionGroupPrepaymentItem getPrepayment() {
        return prepayment;
    }

    /**
     * Setter for Prepayment.
     * @param prepayment Value for ListSubcriptionGroupPrepaymentItem
     */
    @JsonSetter("prepayment")
    public void setPrepayment(ListSubcriptionGroupPrepaymentItem prepayment) {
        this.prepayment = prepayment;
    }

    /**
     * Converts this ListSubscriptionGroupPrepayment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListSubscriptionGroupPrepayment [" + "prepayment=" + prepayment + "]";
    }

    /**
     * Builds a new {@link ListSubscriptionGroupPrepayment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListSubscriptionGroupPrepayment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(prepayment);
        return builder;
    }

    /**
     * Class to build instances of {@link ListSubscriptionGroupPrepayment}.
     */
    public static class Builder {
        private ListSubcriptionGroupPrepaymentItem prepayment;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  prepayment  ListSubcriptionGroupPrepaymentItem value for prepayment.
         */
        public Builder(ListSubcriptionGroupPrepaymentItem prepayment) {
            this.prepayment = prepayment;
        }

        /**
         * Setter for prepayment.
         * @param  prepayment  ListSubcriptionGroupPrepaymentItem value for prepayment.
         * @return Builder
         */
        public Builder prepayment(ListSubcriptionGroupPrepaymentItem prepayment) {
            this.prepayment = prepayment;
            return this;
        }

        /**
         * Builds a new {@link ListSubscriptionGroupPrepayment} object using the set fields.
         * @return {@link ListSubscriptionGroupPrepayment}
         */
        public ListSubscriptionGroupPrepayment build() {
            return new ListSubscriptionGroupPrepayment(prepayment);
        }
    }
}
