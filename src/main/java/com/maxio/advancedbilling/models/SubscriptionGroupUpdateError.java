/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for SubscriptionGroupUpdateError type.
 */
public class SubscriptionGroupUpdateError
        extends BaseModel {
    private List<String> members;

    /**
     * Default constructor.
     */
    public SubscriptionGroupUpdateError() {
    }

    /**
     * Initialization constructor.
     * @param  members  List of String value for members.
     */
    public SubscriptionGroupUpdateError(
            List<String> members) {
        this.members = members;
    }

    /**
     * Getter for Members.
     * @return Returns the List of String
     */
    @JsonGetter("members")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Converts this SubscriptionGroupUpdateError into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionGroupUpdateError [" + "members=" + members + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link SubscriptionGroupUpdateError.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionGroupUpdateError.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .members(getMembers());
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionGroupUpdateError}.
     */
    public static class Builder {
        private List<String> members;



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
         * Builds a new {@link SubscriptionGroupUpdateError} object using the set fields.
         * @return {@link SubscriptionGroupUpdateError}
         */
        public SubscriptionGroupUpdateError build() {
            return new SubscriptionGroupUpdateError(members);
        }
    }
}
