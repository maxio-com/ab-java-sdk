/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;



/**
 * This is a model class for Resume type.
 */
public class Resume {

    /**
     * Default constructor.
     */
    public Resume() {
    }

    /**
     * Converts this Resume into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Resume [" + "]";
    }

    /**
     * Builds a new {@link Resume.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Resume.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        return builder;
    }

    /**
     * Class to build instances of {@link Resume}.
     */
    public static class Builder {






        /**
         * Builds a new {@link Resume} object using the set fields.
         * @return {@link Resume}
         */
        public Resume build() {
            return new Resume();
        }
    }
}
