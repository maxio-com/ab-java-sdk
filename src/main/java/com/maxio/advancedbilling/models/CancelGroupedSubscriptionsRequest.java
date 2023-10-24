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
 * This is a model class for CancelGroupedSubscriptionsRequest type.
 */
public class CancelGroupedSubscriptionsRequest {
    private Boolean chargeUnbilledUsage;

    /**
     * Default constructor.
     */
    public CancelGroupedSubscriptionsRequest() {
    }

    /**
     * Initialization constructor.
     * @param  chargeUnbilledUsage  Boolean value for chargeUnbilledUsage.
     */
    public CancelGroupedSubscriptionsRequest(
            Boolean chargeUnbilledUsage) {
        this.chargeUnbilledUsage = chargeUnbilledUsage;
    }

    /**
     * Getter for ChargeUnbilledUsage.
     * @return Returns the Boolean
     */
    @JsonGetter("charge_unbilled_usage")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getChargeUnbilledUsage() {
        return chargeUnbilledUsage;
    }

    /**
     * Setter for ChargeUnbilledUsage.
     * @param chargeUnbilledUsage Value for Boolean
     */
    @JsonSetter("charge_unbilled_usage")
    public void setChargeUnbilledUsage(Boolean chargeUnbilledUsage) {
        this.chargeUnbilledUsage = chargeUnbilledUsage;
    }

    /**
     * Converts this CancelGroupedSubscriptionsRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CancelGroupedSubscriptionsRequest [" + "chargeUnbilledUsage=" + chargeUnbilledUsage
                + "]";
    }

    /**
     * Builds a new {@link CancelGroupedSubscriptionsRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CancelGroupedSubscriptionsRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .chargeUnbilledUsage(getChargeUnbilledUsage());
        return builder;
    }

    /**
     * Class to build instances of {@link CancelGroupedSubscriptionsRequest}.
     */
    public static class Builder {
        private Boolean chargeUnbilledUsage;



        /**
         * Setter for chargeUnbilledUsage.
         * @param  chargeUnbilledUsage  Boolean value for chargeUnbilledUsage.
         * @return Builder
         */
        public Builder chargeUnbilledUsage(Boolean chargeUnbilledUsage) {
            this.chargeUnbilledUsage = chargeUnbilledUsage;
            return this;
        }

        /**
         * Builds a new {@link CancelGroupedSubscriptionsRequest} object using the set fields.
         * @return {@link CancelGroupedSubscriptionsRequest}
         */
        public CancelGroupedSubscriptionsRequest build() {
            return new CancelGroupedSubscriptionsRequest(chargeUnbilledUsage);
        }
    }
}
