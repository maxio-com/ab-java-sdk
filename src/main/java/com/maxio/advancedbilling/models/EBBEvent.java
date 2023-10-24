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
 * This is a model class for EBBEvent type.
 */
public class EBBEvent {
    private ChargifyEBB chargify;

    /**
     * Default constructor.
     */
    public EBBEvent() {
    }

    /**
     * Initialization constructor.
     * @param  chargify  ChargifyEBB value for chargify.
     */
    public EBBEvent(
            ChargifyEBB chargify) {
        this.chargify = chargify;
    }

    /**
     * Getter for Chargify.
     * @return Returns the ChargifyEBB
     */
    @JsonGetter("chargify")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ChargifyEBB getChargify() {
        return chargify;
    }

    /**
     * Setter for Chargify.
     * @param chargify Value for ChargifyEBB
     */
    @JsonSetter("chargify")
    public void setChargify(ChargifyEBB chargify) {
        this.chargify = chargify;
    }

    /**
     * Converts this EBBEvent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EBBEvent [" + "chargify=" + chargify + "]";
    }

    /**
     * Builds a new {@link EBBEvent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link EBBEvent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .chargify(getChargify());
        return builder;
    }

    /**
     * Class to build instances of {@link EBBEvent}.
     */
    public static class Builder {
        private ChargifyEBB chargify;



        /**
         * Setter for chargify.
         * @param  chargify  ChargifyEBB value for chargify.
         * @return Builder
         */
        public Builder chargify(ChargifyEBB chargify) {
            this.chargify = chargify;
            return this;
        }

        /**
         * Builds a new {@link EBBEvent} object using the set fields.
         * @return {@link EBBEvent}
         */
        public EBBEvent build() {
            return new EBBEvent(chargify);
        }
    }
}
