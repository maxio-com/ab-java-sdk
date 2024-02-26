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
 * This is a model class for NestedSubscriptionGroup type.
 */
public class NestedSubscriptionGroup {
    private String uid;
    private Integer scheme;
    private Integer primarySubscriptionId;
    private Boolean primary;

    /**
     * Default constructor.
     */
    public NestedSubscriptionGroup() {
    }

    /**
     * Initialization constructor.
     * @param  uid  String value for uid.
     * @param  scheme  Integer value for scheme.
     * @param  primarySubscriptionId  Integer value for primarySubscriptionId.
     * @param  primary  Boolean value for primary.
     */
    public NestedSubscriptionGroup(
            String uid,
            Integer scheme,
            Integer primarySubscriptionId,
            Boolean primary) {
        this.uid = uid;
        this.scheme = scheme;
        this.primarySubscriptionId = primarySubscriptionId;
        this.primary = primary;
    }

    /**
     * Getter for Uid.
     * The UID for the group
     * @return Returns the String
     */
    @JsonGetter("uid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUid() {
        return uid;
    }

    /**
     * Setter for Uid.
     * The UID for the group
     * @param uid Value for String
     */
    @JsonSetter("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * Getter for Scheme.
     * Whether the group is configured to rely on a primary subscription for billing. At this time,
     * it will always be 1.
     * @return Returns the Integer
     */
    @JsonGetter("scheme")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getScheme() {
        return scheme;
    }

    /**
     * Setter for Scheme.
     * Whether the group is configured to rely on a primary subscription for billing. At this time,
     * it will always be 1.
     * @param scheme Value for Integer
     */
    @JsonSetter("scheme")
    public void setScheme(Integer scheme) {
        this.scheme = scheme;
    }

    /**
     * Getter for PrimarySubscriptionId.
     * The subscription ID of the primary within the group. Applicable to scheme 1.
     * @return Returns the Integer
     */
    @JsonGetter("primary_subscription_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPrimarySubscriptionId() {
        return primarySubscriptionId;
    }

    /**
     * Setter for PrimarySubscriptionId.
     * The subscription ID of the primary within the group. Applicable to scheme 1.
     * @param primarySubscriptionId Value for Integer
     */
    @JsonSetter("primary_subscription_id")
    public void setPrimarySubscriptionId(Integer primarySubscriptionId) {
        this.primarySubscriptionId = primarySubscriptionId;
    }

    /**
     * Getter for Primary.
     * A boolean indicating whether the subscription is the primary in the group. Applicable to
     * scheme 1.
     * @return Returns the Boolean
     */
    @JsonGetter("primary")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getPrimary() {
        return primary;
    }

    /**
     * Setter for Primary.
     * A boolean indicating whether the subscription is the primary in the group. Applicable to
     * scheme 1.
     * @param primary Value for Boolean
     */
    @JsonSetter("primary")
    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    /**
     * Converts this NestedSubscriptionGroup into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "NestedSubscriptionGroup [" + "uid=" + uid + ", scheme=" + scheme
                + ", primarySubscriptionId=" + primarySubscriptionId + ", primary=" + primary + "]";
    }

    /**
     * Builds a new {@link NestedSubscriptionGroup.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link NestedSubscriptionGroup.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .uid(getUid())
                .scheme(getScheme())
                .primarySubscriptionId(getPrimarySubscriptionId())
                .primary(getPrimary());
        return builder;
    }

    /**
     * Class to build instances of {@link NestedSubscriptionGroup}.
     */
    public static class Builder {
        private String uid;
        private Integer scheme;
        private Integer primarySubscriptionId;
        private Boolean primary;



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
         * Setter for scheme.
         * @param  scheme  Integer value for scheme.
         * @return Builder
         */
        public Builder scheme(Integer scheme) {
            this.scheme = scheme;
            return this;
        }

        /**
         * Setter for primarySubscriptionId.
         * @param  primarySubscriptionId  Integer value for primarySubscriptionId.
         * @return Builder
         */
        public Builder primarySubscriptionId(Integer primarySubscriptionId) {
            this.primarySubscriptionId = primarySubscriptionId;
            return this;
        }

        /**
         * Setter for primary.
         * @param  primary  Boolean value for primary.
         * @return Builder
         */
        public Builder primary(Boolean primary) {
            this.primary = primary;
            return this;
        }

        /**
         * Builds a new {@link NestedSubscriptionGroup} object using the set fields.
         * @return {@link NestedSubscriptionGroup}
         */
        public NestedSubscriptionGroup build() {
            return new NestedSubscriptionGroup(uid, scheme, primarySubscriptionId, primary);
        }
    }
}
