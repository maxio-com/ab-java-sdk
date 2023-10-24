/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for ListMRRResponse type.
 */
public class ListMRRResponse {
    private ListMRRResponseResult mrr;

    /**
     * Default constructor.
     */
    public ListMRRResponse() {
    }

    /**
     * Initialization constructor.
     * @param  mrr  ListMRRResponseResult value for mrr.
     */
    public ListMRRResponse(
            ListMRRResponseResult mrr) {
        this.mrr = mrr;
    }

    /**
     * Getter for Mrr.
     * @return Returns the ListMRRResponseResult
     */
    @JsonGetter("mrr")
    public ListMRRResponseResult getMrr() {
        return mrr;
    }

    /**
     * Setter for Mrr.
     * @param mrr Value for ListMRRResponseResult
     */
    @JsonSetter("mrr")
    public void setMrr(ListMRRResponseResult mrr) {
        this.mrr = mrr;
    }

    /**
     * Converts this ListMRRResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListMRRResponse [" + "mrr=" + mrr + "]";
    }

    /**
     * Builds a new {@link ListMRRResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListMRRResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(mrr);
        return builder;
    }

    /**
     * Class to build instances of {@link ListMRRResponse}.
     */
    public static class Builder {
        private ListMRRResponseResult mrr;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  mrr  ListMRRResponseResult value for mrr.
         */
        public Builder(ListMRRResponseResult mrr) {
            this.mrr = mrr;
        }

        /**
         * Setter for mrr.
         * @param  mrr  ListMRRResponseResult value for mrr.
         * @return Builder
         */
        public Builder mrr(ListMRRResponseResult mrr) {
            this.mrr = mrr;
            return this;
        }

        /**
         * Builds a new {@link ListMRRResponse} object using the set fields.
         * @return {@link ListMRRResponse}
         */
        public ListMRRResponse build() {
            return new ListMRRResponse(mrr);
        }
    }
}
