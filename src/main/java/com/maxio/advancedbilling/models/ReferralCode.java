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
 * This is a model class for ReferralCode type.
 */
public class ReferralCode {
    private Integer id;
    private Integer siteId;
    private Integer subscriptionId;
    private String code;

    /**
     * Default constructor.
     */
    public ReferralCode() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  siteId  Integer value for siteId.
     * @param  subscriptionId  Integer value for subscriptionId.
     * @param  code  String value for code.
     */
    public ReferralCode(
            Integer id,
            Integer siteId,
            Integer subscriptionId,
            String code) {
        this.id = id;
        this.siteId = siteId;
        this.subscriptionId = subscriptionId;
        this.code = code;
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
     * Getter for SiteId.
     * @return Returns the Integer
     */
    @JsonGetter("site_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSiteId() {
        return siteId;
    }

    /**
     * Setter for SiteId.
     * @param siteId Value for Integer
     */
    @JsonSetter("site_id")
    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    /**
     * Getter for SubscriptionId.
     * @return Returns the Integer
     */
    @JsonGetter("subscription_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Setter for SubscriptionId.
     * @param subscriptionId Value for Integer
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId(Integer subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * Getter for Code.
     * @return Returns the String
     */
    @JsonGetter("code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCode() {
        return code;
    }

    /**
     * Setter for Code.
     * @param code Value for String
     */
    @JsonSetter("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Converts this ReferralCode into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReferralCode [" + "id=" + id + ", siteId=" + siteId + ", subscriptionId="
                + subscriptionId + ", code=" + code + "]";
    }

    /**
     * Builds a new {@link ReferralCode.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReferralCode.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .siteId(getSiteId())
                .subscriptionId(getSubscriptionId())
                .code(getCode());
        return builder;
    }

    /**
     * Class to build instances of {@link ReferralCode}.
     */
    public static class Builder {
        private Integer id;
        private Integer siteId;
        private Integer subscriptionId;
        private String code;



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
         * Setter for siteId.
         * @param  siteId  Integer value for siteId.
         * @return Builder
         */
        public Builder siteId(Integer siteId) {
            this.siteId = siteId;
            return this;
        }

        /**
         * Setter for subscriptionId.
         * @param  subscriptionId  Integer value for subscriptionId.
         * @return Builder
         */
        public Builder subscriptionId(Integer subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * Setter for code.
         * @param  code  String value for code.
         * @return Builder
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Builds a new {@link ReferralCode} object using the set fields.
         * @return {@link ReferralCode}
         */
        public ReferralCode build() {
            return new ReferralCode(id, siteId, subscriptionId, code);
        }
    }
}
