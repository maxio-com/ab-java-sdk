/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for SubscriptionGroupMembersArrayError type.
 */
public class SubscriptionGroupMembersArrayError
        extends BaseModel {
    private List<String> members;

    /**
     * Default constructor.
     */
    public SubscriptionGroupMembersArrayError() {
    }

    /**
     * Initialization constructor.
     * @param  members  List of String value for members.
     */
    @JsonCreator
    public SubscriptionGroupMembersArrayError(
            @JsonProperty("members") List<String> members) {
        this.members = members;
    }

    /**
     * Getter for Members.
     * @return Returns the List of String
     */
    @JsonGetter("members")
    public List<String> getMembers() {
        return members;
    }

    /**
     * Setter for Members.
     * @param members Value for List of String
     */
    @JsonSetter("members")
    public void setMembers(List<String> members) {
        this.members = members;
    }

    /**
     * Converts this SubscriptionGroupMembersArrayError into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionGroupMembersArrayError [" + "members=" + members
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link SubscriptionGroupMembersArrayError.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionGroupMembersArrayError.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(members);
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionGroupMembersArrayError}.
     */
    public static class Builder {
        private List<String> members;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  members  List of String value for members.
         */
        public Builder(List<String> members) {
            this.members = members;
        }

        /**
         * Setter for members.
         * @param  members  List of String value for members.
         * @return Builder
         */
        public Builder members(List<String> members) {
            this.members = members;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionGroupMembersArrayError} object using the set fields.
         * @return {@link SubscriptionGroupMembersArrayError}
         */
        public SubscriptionGroupMembersArrayError build() {
            return new SubscriptionGroupMembersArrayError(members);
        }
    }
}
