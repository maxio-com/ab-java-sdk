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

/**
 * This is a model class for ScheduledRenewalConfigurationRequestBody type.
 */
public class ScheduledRenewalConfigurationRequestBody
        extends BaseModel {
    private ZonedDateTime startsAt;
    private ZonedDateTime endsAt;
    private ZonedDateTime lockInAt;
    private Integer contractId;
    private Boolean createNewContract;

    /**
     * Default constructor.
     */
    public ScheduledRenewalConfigurationRequestBody() {
    }

    /**
     * Initialization constructor.
     * @param  startsAt  ZonedDateTime value for startsAt.
     * @param  endsAt  ZonedDateTime value for endsAt.
     * @param  lockInAt  ZonedDateTime value for lockInAt.
     * @param  contractId  Integer value for contractId.
     * @param  createNewContract  Boolean value for createNewContract.
     */
    public ScheduledRenewalConfigurationRequestBody(
            ZonedDateTime startsAt,
            ZonedDateTime endsAt,
            ZonedDateTime lockInAt,
            Integer contractId,
            Boolean createNewContract) {
        this.startsAt = startsAt;
        this.endsAt = endsAt;
        this.lockInAt = lockInAt;
        this.contractId = contractId;
        this.createNewContract = createNewContract;
    }

    /**
     * Getter for StartsAt.
     * (Optional) Start of the renewal term.
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
     * (Optional) Start of the renewal term.
     * @param startsAt Value for ZonedDateTime
     */
    @JsonSetter("starts_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setStartsAt(ZonedDateTime startsAt) {
        this.startsAt = startsAt;
    }

    /**
     * Getter for EndsAt.
     * (Optional) End of the renewal term.
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
     * (Optional) End of the renewal term.
     * @param endsAt Value for ZonedDateTime
     */
    @JsonSetter("ends_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setEndsAt(ZonedDateTime endsAt) {
        this.endsAt = endsAt;
    }

    /**
     * Getter for LockInAt.
     * (Optional) Lock-in date for the renewal.
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
     * (Optional) Lock-in date for the renewal.
     * @param lockInAt Value for ZonedDateTime
     */
    @JsonSetter("lock_in_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setLockInAt(ZonedDateTime lockInAt) {
        this.lockInAt = lockInAt;
    }

    /**
     * Getter for ContractId.
     * (Optional) Existing contract to associate with the scheduled renewal. Contracts must be
     * enabled for your site.
     * @return Returns the Integer
     */
    @JsonGetter("contract_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getContractId() {
        return contractId;
    }

    /**
     * Setter for ContractId.
     * (Optional) Existing contract to associate with the scheduled renewal. Contracts must be
     * enabled for your site.
     * @param contractId Value for Integer
     */
    @JsonSetter("contract_id")
    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    /**
     * Getter for CreateNewContract.
     * (Optional) Set to true to create a new contract when contracts are enabled. Contracts must be
     * enabled for your site.
     * @return Returns the Boolean
     */
    @JsonGetter("create_new_contract")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getCreateNewContract() {
        return createNewContract;
    }

    /**
     * Setter for CreateNewContract.
     * (Optional) Set to true to create a new contract when contracts are enabled. Contracts must be
     * enabled for your site.
     * @param createNewContract Value for Boolean
     */
    @JsonSetter("create_new_contract")
    public void setCreateNewContract(Boolean createNewContract) {
        this.createNewContract = createNewContract;
    }

    /**
     * Converts this ScheduledRenewalConfigurationRequestBody into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ScheduledRenewalConfigurationRequestBody [" + "startsAt=" + startsAt + ", endsAt="
                + endsAt + ", lockInAt=" + lockInAt + ", contractId=" + contractId
                + ", createNewContract=" + createNewContract + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ScheduledRenewalConfigurationRequestBody.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ScheduledRenewalConfigurationRequestBody.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .startsAt(getStartsAt())
                .endsAt(getEndsAt())
                .lockInAt(getLockInAt())
                .contractId(getContractId())
                .createNewContract(getCreateNewContract());
        return builder;
    }

    /**
     * Class to build instances of {@link ScheduledRenewalConfigurationRequestBody}.
     */
    public static class Builder {
        private ZonedDateTime startsAt;
        private ZonedDateTime endsAt;
        private ZonedDateTime lockInAt;
        private Integer contractId;
        private Boolean createNewContract;



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
         * Setter for contractId.
         * @param  contractId  Integer value for contractId.
         * @return Builder
         */
        public Builder contractId(Integer contractId) {
            this.contractId = contractId;
            return this;
        }

        /**
         * Setter for createNewContract.
         * @param  createNewContract  Boolean value for createNewContract.
         * @return Builder
         */
        public Builder createNewContract(Boolean createNewContract) {
            this.createNewContract = createNewContract;
            return this;
        }

        /**
         * Builds a new {@link ScheduledRenewalConfigurationRequestBody} object using the set
         * fields.
         * @return {@link ScheduledRenewalConfigurationRequestBody}
         */
        public ScheduledRenewalConfigurationRequestBody build() {
            return new ScheduledRenewalConfigurationRequestBody(startsAt, endsAt, lockInAt,
                    contractId, createNewContract);
        }
    }
}
