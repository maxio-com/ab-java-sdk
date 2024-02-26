/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for ActivateSubscriptionRequest type.
 */
public class ActivateSubscriptionRequest {
    private OptionalNullable<Boolean> revertOnFailure;

    /**
     * Default constructor.
     */
    public ActivateSubscriptionRequest() {
    }

    /**
     * Initialization constructor.
     * @param  revertOnFailure  Boolean value for revertOnFailure.
     */
    public ActivateSubscriptionRequest(
            Boolean revertOnFailure) {
        this.revertOnFailure = OptionalNullable.of(revertOnFailure);
    }

    /**
     * Initialization constructor.
     * @param  revertOnFailure  Boolean value for revertOnFailure.
     */

    protected ActivateSubscriptionRequest(OptionalNullable<Boolean> revertOnFailure) {
        this.revertOnFailure = revertOnFailure;
    }

    /**
     * Internal Getter for RevertOnFailure.
     * You may choose how to handle the activation failure. `true` means do not change the
     * subscription’s state and billing period. `false` means to continue through with the
     * activation and enter an end of life state. If this parameter is omitted or `null` is passed
     * it will default to value set in the site settings (default: `true`)
     * @return Returns the Internal Boolean
     */
    @JsonGetter("revert_on_failure")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetRevertOnFailure() {
        return this.revertOnFailure;
    }

    /**
     * Getter for RevertOnFailure.
     * You may choose how to handle the activation failure. `true` means do not change the
     * subscription’s state and billing period. `false` means to continue through with the
     * activation and enter an end of life state. If this parameter is omitted or `null` is passed
     * it will default to value set in the site settings (default: `true`)
     * @return Returns the Boolean
     */
    public Boolean getRevertOnFailure() {
        return OptionalNullable.getFrom(revertOnFailure);
    }

    /**
     * Setter for RevertOnFailure.
     * You may choose how to handle the activation failure. `true` means do not change the
     * subscription’s state and billing period. `false` means to continue through with the
     * activation and enter an end of life state. If this parameter is omitted or `null` is passed
     * it will default to value set in the site settings (default: `true`)
     * @param revertOnFailure Value for Boolean
     */
    @JsonSetter("revert_on_failure")
    public void setRevertOnFailure(Boolean revertOnFailure) {
        this.revertOnFailure = OptionalNullable.of(revertOnFailure);
    }

    /**
     * UnSetter for RevertOnFailure.
     * You may choose how to handle the activation failure. `true` means do not change the
     * subscription’s state and billing period. `false` means to continue through with the
     * activation and enter an end of life state. If this parameter is omitted or `null` is passed
     * it will default to value set in the site settings (default: `true`)
     */
    public void unsetRevertOnFailure() {
        revertOnFailure = null;
    }

    /**
     * Converts this ActivateSubscriptionRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ActivateSubscriptionRequest [" + "revertOnFailure=" + revertOnFailure + "]";
    }

    /**
     * Builds a new {@link ActivateSubscriptionRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ActivateSubscriptionRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.revertOnFailure = internalGetRevertOnFailure();
        return builder;
    }

    /**
     * Class to build instances of {@link ActivateSubscriptionRequest}.
     */
    public static class Builder {
        private OptionalNullable<Boolean> revertOnFailure;



        /**
         * Setter for revertOnFailure.
         * @param  revertOnFailure  Boolean value for revertOnFailure.
         * @return Builder
         */
        public Builder revertOnFailure(Boolean revertOnFailure) {
            this.revertOnFailure = OptionalNullable.of(revertOnFailure);
            return this;
        }

        /**
         * UnSetter for revertOnFailure.
         * @return Builder
         */
        public Builder unsetRevertOnFailure() {
            revertOnFailure = null;
            return this;
        }

        /**
         * Builds a new {@link ActivateSubscriptionRequest} object using the set fields.
         * @return {@link ActivateSubscriptionRequest}
         */
        public ActivateSubscriptionRequest build() {
            return new ActivateSubscriptionRequest(revertOnFailure);
        }
    }
}
