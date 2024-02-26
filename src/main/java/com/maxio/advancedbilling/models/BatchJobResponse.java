/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for BatchJobResponse type.
 */
public class BatchJobResponse {
    private BatchJob batchjob;

    /**
     * Default constructor.
     */
    public BatchJobResponse() {
    }

    /**
     * Initialization constructor.
     * @param  batchjob  BatchJob value for batchjob.
     */
    public BatchJobResponse(
            BatchJob batchjob) {
        this.batchjob = batchjob;
    }

    /**
     * Getter for Batchjob.
     * @return Returns the BatchJob
     */
    @JsonGetter("batchjob")
    public BatchJob getBatchjob() {
        return batchjob;
    }

    /**
     * Setter for Batchjob.
     * @param batchjob Value for BatchJob
     */
    @JsonSetter("batchjob")
    public void setBatchjob(BatchJob batchjob) {
        this.batchjob = batchjob;
    }

    /**
     * Converts this BatchJobResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BatchJobResponse [" + "batchjob=" + batchjob + "]";
    }

    /**
     * Builds a new {@link BatchJobResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BatchJobResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(batchjob);
        return builder;
    }

    /**
     * Class to build instances of {@link BatchJobResponse}.
     */
    public static class Builder {
        private BatchJob batchjob;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  batchjob  BatchJob value for batchjob.
         */
        public Builder(BatchJob batchjob) {
            this.batchjob = batchjob;
        }

        /**
         * Setter for batchjob.
         * @param  batchjob  BatchJob value for batchjob.
         * @return Builder
         */
        public Builder batchjob(BatchJob batchjob) {
            this.batchjob = batchjob;
            return this;
        }

        /**
         * Builds a new {@link BatchJobResponse} object using the set fields.
         * @return {@link BatchJobResponse}
         */
        public BatchJobResponse build() {
            return new BatchJobResponse(batchjob);
        }
    }
}
