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
 * This is a model class for SubscriptionGroupMemberError type.
 */
public class SubscriptionGroupMemberError {
    private Integer id;
    private String type;
    private String message;

    /**
     * Default constructor.
     */
    public SubscriptionGroupMemberError() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  type  String value for type.
     * @param  message  String value for message.
     */
    public SubscriptionGroupMemberError(
            Integer id,
            String type,
            String message) {
        this.id = id;
        this.type = type;
        this.message = message;
    }

    /**
     * Getter for Id.
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for Type.
     * @return Returns the String
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter for Message.
     * @return Returns the String
     */
    @JsonGetter("message")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMessage() {
        return message;
    }

    /**
     * Setter for Message.
     * @param message Value for String
     */
    @JsonSetter("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Converts this SubscriptionGroupMemberError into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionGroupMemberError [" + "id=" + id + ", type=" + type + ", message="
                + message + "]";
    }

    /**
     * Builds a new {@link SubscriptionGroupMemberError.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionGroupMemberError.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .type(getType())
                .message(getMessage());
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionGroupMemberError}.
     */
    public static class Builder {
        private Integer id;
        private String type;
        private String message;



        /**
         * Setter for id.
         * @param  id  Integer value for id.
         * @return Builder
         */
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for message.
         * @param  message  String value for message.
         * @return Builder
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionGroupMemberError} object using the set fields.
         * @return {@link SubscriptionGroupMemberError}
         */
        public SubscriptionGroupMemberError build() {
            return new SubscriptionGroupMemberError(id, type, message);
        }
    }
}
