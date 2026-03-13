/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.maxio.advancedbilling.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDate;

/**
 * This is a model class for ScheduledRenewalLockInRequest type.
 */
public class ScheduledRenewalLockInRequest
        extends BaseModel {
    private LocalDate lockInAt;

    /**
     * Default constructor.
     */
    public ScheduledRenewalLockInRequest() {
    }

    /**
     * Initialization constructor.
     * @param  lockInAt  LocalDate value for lockInAt.
     */
    public ScheduledRenewalLockInRequest(
            LocalDate lockInAt) {
        this.lockInAt = lockInAt;
    }

    /**
     * Getter for LockInAt.
     * Date to lock in the renewal.
     * @return Returns the LocalDate
     */
    @JsonGetter("lock_in_at")
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getLockInAt() {
        return lockInAt;
    }

    /**
     * Setter for LockInAt.
     * Date to lock in the renewal.
     * @param lockInAt Value for LocalDate
     */
    @JsonSetter("lock_in_at")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setLockInAt(LocalDate lockInAt) {
        this.lockInAt = lockInAt;
    }

    /**
     * Converts this ScheduledRenewalLockInRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ScheduledRenewalLockInRequest [" + "lockInAt=" + lockInAt
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ScheduledRenewalLockInRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ScheduledRenewalLockInRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(lockInAt);
        return builder;
    }

    /**
     * Class to build instances of {@link ScheduledRenewalLockInRequest}.
     */
    public static class Builder {
        private LocalDate lockInAt;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  lockInAt  LocalDate value for lockInAt.
         */
        public Builder(LocalDate lockInAt) {
            this.lockInAt = lockInAt;
        }

        /**
         * Setter for lockInAt.
         * @param  lockInAt  LocalDate value for lockInAt.
         * @return Builder
         */
        public Builder lockInAt(LocalDate lockInAt) {
            this.lockInAt = lockInAt;
            return this;
        }

        /**
         * Builds a new {@link ScheduledRenewalLockInRequest} object using the set fields.
         * @return {@link ScheduledRenewalLockInRequest}
         */
        public ScheduledRenewalLockInRequest build() {
            return new ScheduledRenewalLockInRequest(lockInAt);
        }
    }
}
