/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.AddSubscriptionToAGroupGroup;

/**
 * This is a model class for AddSubscriptionToAGroup type.
 */
public class AddSubscriptionToAGroup {
    private AddSubscriptionToAGroupGroup group;

    /**
     * Default constructor.
     */
    public AddSubscriptionToAGroup() {
    }

    /**
     * Initialization constructor.
     * @param  group  AddSubscriptionToAGroupGroup value for group.
     */
    public AddSubscriptionToAGroup(
            AddSubscriptionToAGroupGroup group) {
        this.group = group;
    }

    /**
     * Getter for Group.
     * @return Returns the AddSubscriptionToAGroupGroup
     */
    @JsonGetter("group")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AddSubscriptionToAGroupGroup getGroup() {
        return group;
    }

    /**
     * Setter for Group.
     * @param group Value for AddSubscriptionToAGroupGroup
     */
    @JsonSetter("group")
    public void setGroup(AddSubscriptionToAGroupGroup group) {
        this.group = group;
    }

    /**
     * Converts this AddSubscriptionToAGroup into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AddSubscriptionToAGroup [" + "group=" + group + "]";
    }

    /**
     * Builds a new {@link AddSubscriptionToAGroup.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AddSubscriptionToAGroup.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .group(getGroup());
        return builder;
    }

    /**
     * Class to build instances of {@link AddSubscriptionToAGroup}.
     */
    public static class Builder {
        private AddSubscriptionToAGroupGroup group;



        /**
         * Setter for group.
         * @param  group  AddSubscriptionToAGroupGroup value for group.
         * @return Builder
         */
        public Builder group(AddSubscriptionToAGroupGroup group) {
            this.group = group;
            return this;
        }

        /**
         * Builds a new {@link AddSubscriptionToAGroup} object using the set fields.
         * @return {@link AddSubscriptionToAGroup}
         */
        public AddSubscriptionToAGroup build() {
            return new AddSubscriptionToAGroup(group);
        }
    }
}
