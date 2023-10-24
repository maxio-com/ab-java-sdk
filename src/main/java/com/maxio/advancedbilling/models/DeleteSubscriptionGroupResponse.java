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
 * This is a model class for DeleteSubscriptionGroupResponse type.
 */
public class DeleteSubscriptionGroupResponse {
    private String uid;
    private Boolean deleted;

    /**
     * Default constructor.
     */
    public DeleteSubscriptionGroupResponse() {
    }

    /**
     * Initialization constructor.
     * @param  uid  String value for uid.
     * @param  deleted  Boolean value for deleted.
     */
    public DeleteSubscriptionGroupResponse(
            String uid,
            Boolean deleted) {
        this.uid = uid;
        this.deleted = deleted;
    }

    /**
     * Getter for Uid.
     * @return Returns the String
     */
    @JsonGetter("uid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUid() {
        return uid;
    }

    /**
     * Setter for Uid.
     * @param uid Value for String
     */
    @JsonSetter("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * Getter for Deleted.
     * @return Returns the Boolean
     */
    @JsonGetter("deleted")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * Setter for Deleted.
     * @param deleted Value for Boolean
     */
    @JsonSetter("deleted")
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * Converts this DeleteSubscriptionGroupResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DeleteSubscriptionGroupResponse [" + "uid=" + uid + ", deleted=" + deleted + "]";
    }

    /**
     * Builds a new {@link DeleteSubscriptionGroupResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DeleteSubscriptionGroupResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .uid(getUid())
                .deleted(getDeleted());
        return builder;
    }

    /**
     * Class to build instances of {@link DeleteSubscriptionGroupResponse}.
     */
    public static class Builder {
        private String uid;
        private Boolean deleted;



        /**
         * Setter for uid.
         * @param  uid  String value for uid.
         * @return Builder
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        /**
         * Setter for deleted.
         * @param  deleted  Boolean value for deleted.
         * @return Builder
         */
        public Builder deleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }

        /**
         * Builds a new {@link DeleteSubscriptionGroupResponse} object using the set fields.
         * @return {@link DeleteSubscriptionGroupResponse}
         */
        public DeleteSubscriptionGroupResponse build() {
            return new DeleteSubscriptionGroupResponse(uid, deleted);
        }
    }
}
