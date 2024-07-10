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
 * This is a model class for ChangeChargebackStatusEventData type.
 */
public class ChangeChargebackStatusEventData
        extends BaseModel {
    private ChargebackStatus chargebackStatus;

    /**
     * Default constructor.
     */
    public ChangeChargebackStatusEventData() {
    }

    /**
     * Initialization constructor.
     * @param  chargebackStatus  ChargebackStatus value for chargebackStatus.
     */
    public ChangeChargebackStatusEventData(
            ChargebackStatus chargebackStatus) {
        this.chargebackStatus = chargebackStatus;
    }

    /**
     * Getter for ChargebackStatus.
     * @return Returns the ChargebackStatus
     */
    @JsonGetter("chargeback_status")
    public ChargebackStatus getChargebackStatus() {
        return chargebackStatus;
    }

    /**
     * Setter for ChargebackStatus.
     * @param chargebackStatus Value for ChargebackStatus
     */
    @JsonSetter("chargeback_status")
    public void setChargebackStatus(ChargebackStatus chargebackStatus) {
        this.chargebackStatus = chargebackStatus;
    }

    /**
     * Converts this ChangeChargebackStatusEventData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ChangeChargebackStatusEventData [" + "chargebackStatus=" + chargebackStatus
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(chargebackStatus);
        return builder;
    }

    /**
     * Class to build instances of {@link ChangeChargebackStatusEventData}.
     */
    public static class Builder {
        private ChargebackStatus chargebackStatus;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  chargebackStatus  ChargebackStatus value for chargebackStatus.
         */
        public Builder(ChargebackStatus chargebackStatus) {
            this.chargebackStatus = chargebackStatus;
        }

        /**
         * Setter for chargebackStatus.
         * @param  chargebackStatus  ChargebackStatus value for chargebackStatus.
         * @return Builder
         */
        public Builder chargebackStatus(ChargebackStatus chargebackStatus) {
            this.chargebackStatus = chargebackStatus;
            return this;
        }

        /**
         * Builds a new {@link ChangeChargebackStatusEventData} object using the set fields.
         * @return {@link ChangeChargebackStatusEventData}
         */
        public ChangeChargebackStatusEventData build() {
            return new ChangeChargebackStatusEventData(chargebackStatus);
        }
    }
}
