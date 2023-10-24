/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for ReplayWebhooksRequest type.
 */
public class ReplayWebhooksRequest {
    private List<Integer> ids;

    /**
     * Default constructor.
     */
    public ReplayWebhooksRequest() {
    }

    /**
     * Initialization constructor.
     * @param  ids  List of Integer value for ids.
     */
    public ReplayWebhooksRequest(
            List<Integer> ids) {
        this.ids = ids;
    }

    /**
     * Getter for Ids.
     * @return Returns the List of Integer
     */
    @JsonGetter("ids")
    public List<Integer> getIds() {
        return ids;
    }

    /**
     * Setter for Ids.
     * @param ids Value for List of Integer
     */
    @JsonSetter("ids")
    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    /**
     * Converts this ReplayWebhooksRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReplayWebhooksRequest [" + "ids=" + ids + "]";
    }

    /**
     * Builds a new {@link ReplayWebhooksRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReplayWebhooksRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(ids);
        return builder;
    }

    /**
     * Class to build instances of {@link ReplayWebhooksRequest}.
     */
    public static class Builder {
        private List<Integer> ids;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  ids  List of Integer value for ids.
         */
        public Builder(List<Integer> ids) {
            this.ids = ids;
        }

        /**
         * Setter for ids.
         * @param  ids  List of Integer value for ids.
         * @return Builder
         */
        public Builder ids(List<Integer> ids) {
            this.ids = ids;
            return this;
        }

        /**
         * Builds a new {@link ReplayWebhooksRequest} object using the set fields.
         * @return {@link ReplayWebhooksRequest}
         */
        public ReplayWebhooksRequest build() {
            return new ReplayWebhooksRequest(ids);
        }
    }
}
