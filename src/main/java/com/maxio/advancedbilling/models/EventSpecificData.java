/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;



/**
 * This is a model class for EventSpecificData type.
 */
public class EventSpecificData {

    /**
     * Default constructor.
     */
    public EventSpecificData() {
    }

    /**
     * Converts this EventSpecificData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EventSpecificData [" + "]";
    }

    /**
     * Builds a new {@link EventSpecificData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link EventSpecificData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        return builder;
    }

    /**
     * Class to build instances of {@link EventSpecificData}.
     */
    public static class Builder {






        /**
         * Builds a new {@link EventSpecificData} object using the set fields.
         * @return {@link EventSpecificData}
         */
        public EventSpecificData build() {
            return new EventSpecificData();
        }
    }
}
