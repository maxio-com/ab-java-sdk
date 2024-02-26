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
 * This is a model class for CountResponse type.
 */
public class CountResponse {
    private Integer count;

    /**
     * Default constructor.
     */
    public CountResponse() {
    }

    /**
     * Initialization constructor.
     * @param  count  Integer value for count.
     */
    public CountResponse(
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
     * Converts this CountResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CountResponse [" + "count=" + count + "]";
    }

    /**
     * Builds a new {@link CountResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CountResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .count(getCount());
        return builder;
    }

    /**
     * Class to build instances of {@link CountResponse}.
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
         * Builds a new {@link CountResponse} object using the set fields.
         * @return {@link CountResponse}
         */
        public CountResponse build() {
            return new CountResponse(count);
        }
    }
}
