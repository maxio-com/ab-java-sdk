/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for MRRResponse type.
 */
public class MRRResponse {
    private MRR mrr;

    /**
     * Default constructor.
     */
    public MRRResponse() {
    }

    /**
     * Initialization constructor.
     * @param  mrr  MRR value for mrr.
     */
    public MRRResponse(
            MRR mrr) {
        this.mrr = mrr;
    }

    /**
     * Getter for Mrr.
     * @return Returns the MRR
     */
    @JsonGetter("mrr")
    public MRR getMrr() {
        return mrr;
    }

    /**
     * Setter for Mrr.
     * @param mrr Value for MRR
     */
    @JsonSetter("mrr")
    public void setMrr(MRR mrr) {
        this.mrr = mrr;
    }

    /**
     * Converts this MRRResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MRRResponse [" + "mrr=" + mrr + "]";
    }

    /**
     * Builds a new {@link MRRResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MRRResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(mrr);
        return builder;
    }

    /**
     * Class to build instances of {@link MRRResponse}.
     */
    public static class Builder {
        private MRR mrr;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  mrr  MRR value for mrr.
         */
        public Builder(MRR mrr) {
            this.mrr = mrr;
        }

        /**
         * Setter for mrr.
         * @param  mrr  MRR value for mrr.
         * @return Builder
         */
        public Builder mrr(MRR mrr) {
            this.mrr = mrr;
            return this;
        }

        /**
         * Builds a new {@link MRRResponse} object using the set fields.
         * @return {@link MRRResponse}
         */
        public MRRResponse build() {
            return new MRRResponse(mrr);
        }
    }
}
