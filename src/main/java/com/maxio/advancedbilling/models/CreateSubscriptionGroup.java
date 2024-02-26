/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.CreateSubscriptionGroupSubscriptionId;
import java.util.List;

/**
 * This is a model class for CreateSubscriptionGroup type.
 */
public class CreateSubscriptionGroup {
    private CreateSubscriptionGroupSubscriptionId subscriptionId;
    private List<Integer> memberIds;

    /**
     * Default constructor.
     */
    public CreateSubscriptionGroup() {
    }

    /**
     * Initialization constructor.
     * @param  subscriptionId  CreateSubscriptionGroupSubscriptionId value for subscriptionId.
     * @param  memberIds  List of Integer value for memberIds.
     */
    public CreateSubscriptionGroup(
            CreateSubscriptionGroupSubscriptionId subscriptionId,
            List<Integer> memberIds) {
        this.subscriptionId = subscriptionId;
        this.memberIds = memberIds;
    }

    /**
     * Getter for SubscriptionId.
     * @return Returns the CreateSubscriptionGroupSubscriptionId
     */
    @JsonGetter("subscription_id")
    public CreateSubscriptionGroupSubscriptionId getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Setter for SubscriptionId.
     * @param subscriptionId Value for CreateSubscriptionGroupSubscriptionId
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId(CreateSubscriptionGroupSubscriptionId subscriptionId) {
        this.subscriptionId = subscriptionId;
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
     * Converts this CreateSubscriptionGroup into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateSubscriptionGroup [" + "subscriptionId=" + subscriptionId + ", memberIds="
                + memberIds + "]";
    }

    /**
     * Builds a new {@link CreateSubscriptionGroup.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateSubscriptionGroup.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(subscriptionId)
                .memberIds(getMemberIds());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateSubscriptionGroup}.
     */
    public static class Builder {
        private CreateSubscriptionGroupSubscriptionId subscriptionId;
        private List<Integer> memberIds;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  subscriptionId  CreateSubscriptionGroupSubscriptionId value for subscriptionId.
         */
        public Builder(CreateSubscriptionGroupSubscriptionId subscriptionId) {
            this.subscriptionId = subscriptionId;
        }

        /**
         * Setter for subscriptionId.
         * @param  subscriptionId  CreateSubscriptionGroupSubscriptionId value for subscriptionId.
         * @return Builder
         */
        public Builder subscriptionId(CreateSubscriptionGroupSubscriptionId subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

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
         * Builds a new {@link CreateSubscriptionGroup} object using the set fields.
         * @return {@link CreateSubscriptionGroup}
         */
        public CreateSubscriptionGroup build() {
            return new CreateSubscriptionGroup(subscriptionId, memberIds);
        }
    }
}
