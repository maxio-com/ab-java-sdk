/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for UpdateSubscriptionGroup type.
 */
public class UpdateSubscriptionGroup {
    private List<Integer> memberIds;

    /**
     * Default constructor.
     */
    public UpdateSubscriptionGroup() {
    }

    /**
     * Initialization constructor.
     * @param  memberIds  List of Integer value for memberIds.
     */
    public UpdateSubscriptionGroup(
            List<Integer> memberIds) {
        this.memberIds = memberIds;
    }

    /**
     * Getter for MemberIds.
     * @return Returns the List of Integer
     */
    @JsonGetter("member_ids")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Integer> getMemberIds() {
        return memberIds;
    }

    /**
     * Setter for MemberIds.
     * @param memberIds Value for List of Integer
     */
    @JsonSetter("member_ids")
    public void setMemberIds(List<Integer> memberIds) {
        this.memberIds = memberIds;
    }

    /**
     * Converts this UpdateSubscriptionGroup into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateSubscriptionGroup [" + "memberIds=" + memberIds + "]";
    }

    /**
     * Builds a new {@link UpdateSubscriptionGroup.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateSubscriptionGroup.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .memberIds(getMemberIds());
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateSubscriptionGroup}.
     */
    public static class Builder {
        private List<Integer> memberIds;



        /**
         * Setter for memberIds.
         * @param  memberIds  List of Integer value for memberIds.
         * @return Builder
         */
        public Builder memberIds(List<Integer> memberIds) {
            this.memberIds = memberIds;
            return this;
        }

        /**
         * Builds a new {@link UpdateSubscriptionGroup} object using the set fields.
         * @return {@link UpdateSubscriptionGroup}
         */
        public UpdateSubscriptionGroup build() {
            return new UpdateSubscriptionGroup(memberIds);
        }
    }
}
