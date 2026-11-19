/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for CreateWalletAdjustmentRequest type.
 */
public class CreateWalletAdjustmentRequest
        extends BaseModel {
    private Adjustment adjustment;

    /**
     * Default constructor.
     */
    public CreateWalletAdjustmentRequest() {
    }

    /**
     * Initialization constructor.
     * @param  adjustment  Adjustment value for adjustment.
     */
    public CreateWalletAdjustmentRequest(
            Adjustment adjustment) {
        this.adjustment = adjustment;
    }

    /**
     * Getter for Adjustment.
     * @return Returns the Adjustment
     */
    @JsonGetter("adjustment")
    public Adjustment getAdjustment() {
        return adjustment;
    }

    /**
     * Setter for Adjustment.
     * @param adjustment Value for Adjustment
     */
    @JsonSetter("adjustment")
    public void setAdjustment(Adjustment adjustment) {
        this.adjustment = adjustment;
    }

    /**
     * Converts this CreateWalletAdjustmentRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateWalletAdjustmentRequest [" + "adjustment=" + adjustment
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link CreateWalletAdjustmentRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateWalletAdjustmentRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(adjustment);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateWalletAdjustmentRequest}.
     */
    public static class Builder {
        private Adjustment adjustment;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  adjustment  Adjustment value for adjustment.
         */
        public Builder(Adjustment adjustment) {
            this.adjustment = adjustment;
        }

        /**
         * Setter for adjustment.
         * @param  adjustment  Adjustment value for adjustment.
         * @return Builder
         */
        public Builder adjustment(Adjustment adjustment) {
            this.adjustment = adjustment;
            return this;
        }

        /**
         * Builds a new {@link CreateWalletAdjustmentRequest} object using the set fields.
         * @return {@link CreateWalletAdjustmentRequest}
         */
        public CreateWalletAdjustmentRequest build() {
            return new CreateWalletAdjustmentRequest(adjustment);
        }
    }
}
