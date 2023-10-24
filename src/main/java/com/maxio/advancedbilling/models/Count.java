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
 * This is a model class for Count type.
 */
public class Count {
    private Integer count;

    /**
     * Default constructor.
     */
    public Count() {
    }

    /**
     * Initialization constructor.
     * @param  count  Integer value for count.
     */
    public Count(
            Integer count) {
        this.count = count;
    }

    /**
     * Getter for Count.
     * @return Returns the Integer
     */
    @JsonGetter("count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCount() {
        return count;
    }

    /**
     * Setter for Count.
     * @param count Value for Integer
     */
    @JsonSetter("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * Converts this Count into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Count [" + "count=" + count + "]";
    }

    /**
     * Builds a new {@link Count.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Count.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .count(getCount());
        return builder;
    }

    /**
     * Class to build instances of {@link Count}.
     */
    public static class Builder {
        private Integer count;



        /**
         * Setter for count.
         * @param  count  Integer value for count.
         * @return Builder
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * Builds a new {@link Count} object using the set fields.
         * @return {@link Count}
         */
        public Count build() {
            return new Count(count);
        }
    }
}
