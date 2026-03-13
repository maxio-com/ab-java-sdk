/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.maxio.advancedbilling.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * This is a model class for ScheduledRenewalConfiguration type.
 */
public class ScheduledRenewalConfiguration
        extends BaseModel {
    private Integer id;
    private Integer siteId;
    private Integer subscriptionId;
    private ZonedDateTime startsAt;
    private ZonedDateTime endsAt;
    private ZonedDateTime lockInAt;
    private ZonedDateTime createdAt;
    private String status;
    private List<ScheduledRenewalConfigurationItem> scheduledRenewalConfigurationItems;
    private Contract contract;

    /**
     * Default constructor.
     */
    public ScheduledRenewalConfiguration() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  siteId  Integer value for siteId.
     * @param  subscriptionId  Integer value for subscriptionId.
     * @param  startsAt  ZonedDateTime value for startsAt.
     * @param  endsAt  ZonedDateTime value for endsAt.
     * @param  lockInAt  ZonedDateTime value for lockInAt.
     * @param  createdAt  ZonedDateTime value for createdAt.
     * @param  status  String value for status.
     * @param  scheduledRenewalConfigurationItems  List of ScheduledRenewalConfigurationItem value
     *         for scheduledRenewalConfigurationItems.
     * @param  contract  Contract value for contract.
     */
    public ScheduledRenewalConfiguration(
            Integer id,
            Integer siteId,
            Integer subscriptionId,
            ZonedDateTime startsAt,
            ZonedDateTime endsAt,
            ZonedDateTime lockInAt,
            ZonedDateTime createdAt,
            String status,
            List<ScheduledRenewalConfigurationItem> scheduledRenewalConfigurationItems,
            Contract contract) {
        this.id = id;
        this.siteId = siteId;
        this.subscriptionId = subscriptionId;
        this.startsAt = startsAt;
        this.endsAt = endsAt;
        this.lockInAt = lockInAt;
        this.createdAt = createdAt;
        this.status = status;
        this.scheduledRenewalConfigurationItems = scheduledRenewalConfigurationItems;
        this.contract = contract;
    }

    /**
     * Getter for Id.
     * ID of the renewal.
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * ID of the renewal.
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for SiteId.
     * ID of the site to which the renewal belongs.
     * @return Returns the Integer
     */
    @JsonGetter("site_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSiteId() {
        return siteId;
    }

    /**
     * Setter for SiteId.
     * ID of the site to which the renewal belongs.
     * @param siteId Value for Integer
     */
    @JsonSetter("site_id")
    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    /**
     * Getter for SubscriptionId.
     * The id of the subscription.
     * @return Returns the Integer
     */
    @JsonGetter("subscription_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Setter for SubscriptionId.
     * The id of the subscription.
     * @param subscriptionId Value for Integer
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId(Integer subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * Getter for StartsAt.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("starts_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getStartsAt() {
        return startsAt;
    }

    /**
     * Setter for StartsAt.
     * @param startsAt Value for ZonedDateTime
     */
    @JsonSetter("starts_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setStartsAt(ZonedDateTime startsAt) {
        this.startsAt = startsAt;
    }

    /**
     * Getter for EndsAt.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("ends_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getEndsAt() {
        return endsAt;
    }

    /**
     * Setter for EndsAt.
     * @param endsAt Value for ZonedDateTime
     */
    @JsonSetter("ends_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setEndsAt(ZonedDateTime endsAt) {
        this.endsAt = endsAt;
    }

    /**
     * Getter for LockInAt.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("lock_in_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getLockInAt() {
        return lockInAt;
    }

    /**
     * Setter for LockInAt.
     * @param lockInAt Value for ZonedDateTime
     */
    @JsonSetter("lock_in_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setLockInAt(ZonedDateTime lockInAt) {
        this.lockInAt = lockInAt;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("created_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for ZonedDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for Status.
     * @return Returns the String
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter for ScheduledRenewalConfigurationItems.
     * @return Returns the List of ScheduledRenewalConfigurationItem
     */
    @JsonGetter("scheduled_renewal_configuration_items")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ScheduledRenewalConfigurationItem> getScheduledRenewalConfigurationItems() {
        return scheduledRenewalConfigurationItems;
    }

    /**
     * Setter for ScheduledRenewalConfigurationItems.
     * @param scheduledRenewalConfigurationItems Value for List of ScheduledRenewalConfigurationItem
     */
    @JsonSetter("scheduled_renewal_configuration_items")
    public void setScheduledRenewalConfigurationItems(List<ScheduledRenewalConfigurationItem> scheduledRenewalConfigurationItems) {
        this.scheduledRenewalConfigurationItems = scheduledRenewalConfigurationItems;
    }

    /**
     * Getter for Contract.
     * Contract linked to the scheduled renewal configuration.
     * @return Returns the Contract
     */
    @JsonGetter("contract")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Contract getContract() {
        return contract;
    }

    /**
     * Setter for Contract.
     * Contract linked to the scheduled renewal configuration.
     * @param contract Value for Contract
     */
    @JsonSetter("contract")
    public void setContract(Contract contract) {
        this.contract = contract;
    }

    /**
     * Converts this ScheduledRenewalConfiguration into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ScheduledRenewalConfiguration [" + "id=" + id + ", siteId=" + siteId
                + ", subscriptionId=" + subscriptionId + ", startsAt=" + startsAt + ", endsAt="
                + endsAt + ", lockInAt=" + lockInAt + ", createdAt=" + createdAt + ", status="
                + status + ", scheduledRenewalConfigurationItems="
                + scheduledRenewalConfigurationItems + ", contract=" + contract
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ScheduledRenewalConfiguration.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ScheduledRenewalConfiguration.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .siteId(getSiteId())
                .subscriptionId(getSubscriptionId())
                .startsAt(getStartsAt())
                .endsAt(getEndsAt())
                .lockInAt(getLockInAt())
                .createdAt(getCreatedAt())
                .status(getStatus())
                .scheduledRenewalConfigurationItems(getScheduledRenewalConfigurationItems())
                .contract(getContract());
        return builder;
    }

    /**
     * Class to build instances of {@link ScheduledRenewalConfiguration}.
     */
    public static class Builder {
        private Integer id;
        private Integer siteId;
        private Integer subscriptionId;
        private ZonedDateTime startsAt;
        private ZonedDateTime endsAt;
        private ZonedDateTime lockInAt;
        private ZonedDateTime createdAt;
        private String status;
        private List<ScheduledRenewalConfigurationItem> scheduledRenewalConfigurationItems;
        private Contract contract;



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
         * Setter for startsAt.
         * @param  startsAt  ZonedDateTime value for startsAt.
         * @return Builder
         */
        public Builder startsAt(ZonedDateTime startsAt) {
            this.startsAt = startsAt;
            return this;
        }

        /**
         * Setter for endsAt.
         * @param  endsAt  ZonedDateTime value for endsAt.
         * @return Builder
         */
        public Builder endsAt(ZonedDateTime endsAt) {
            this.endsAt = endsAt;
            return this;
        }

        /**
         * Setter for lockInAt.
         * @param  lockInAt  ZonedDateTime value for lockInAt.
         * @return Builder
         */
        public Builder lockInAt(ZonedDateTime lockInAt) {
            this.lockInAt = lockInAt;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  ZonedDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(ZonedDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for scheduledRenewalConfigurationItems.
         * @param  scheduledRenewalConfigurationItems  List of ScheduledRenewalConfigurationItem
         *         value for scheduledRenewalConfigurationItems.
         * @return Builder
         */
        public Builder scheduledRenewalConfigurationItems(
                List<ScheduledRenewalConfigurationItem> scheduledRenewalConfigurationItems) {
            this.scheduledRenewalConfigurationItems = scheduledRenewalConfigurationItems;
            return this;
        }

        /**
         * Setter for contract.
         * @param  contract  Contract value for contract.
         * @return Builder
         */
        public Builder contract(Contract contract) {
            this.contract = contract;
            return this;
        }

        /**
         * Builds a new {@link ScheduledRenewalConfiguration} object using the set fields.
         * @return {@link ScheduledRenewalConfiguration}
         */
        public ScheduledRenewalConfiguration build() {
            return new ScheduledRenewalConfiguration(id, siteId, subscriptionId, startsAt, endsAt,
                    lockInAt, createdAt, status, scheduledRenewalConfigurationItems, contract);
        }
    }
}
