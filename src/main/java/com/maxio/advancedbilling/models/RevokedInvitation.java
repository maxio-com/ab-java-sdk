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
 * This is a model class for RevokedInvitation type.
 */
public class RevokedInvitation {
    private String lastSentAt;
    private String lastAcceptedAt;
    private Integer uninvitedCount;

    /**
     * Default constructor.
     */
    public RevokedInvitation() {
    }

    /**
     * Initialization constructor.
     * @param  lastSentAt  String value for lastSentAt.
     * @param  lastAcceptedAt  String value for lastAcceptedAt.
     * @param  uninvitedCount  Integer value for uninvitedCount.
     */
    public RevokedInvitation(
            String lastSentAt,
            String lastAcceptedAt,
            Integer uninvitedCount) {
        this.lastSentAt = lastSentAt;
        this.lastAcceptedAt = lastAcceptedAt;
        this.uninvitedCount = uninvitedCount;
    }

    /**
     * Getter for LastSentAt.
     * @return Returns the String
     */
    @JsonGetter("last_sent_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastSentAt() {
        return lastSentAt;
    }

    /**
     * Setter for LastSentAt.
     * @param lastSentAt Value for String
     */
    @JsonSetter("last_sent_at")
    public void setLastSentAt(String lastSentAt) {
        this.lastSentAt = lastSentAt;
    }

    /**
     * Getter for LastAcceptedAt.
     * @return Returns the String
     */
    @JsonGetter("last_accepted_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastAcceptedAt() {
        return lastAcceptedAt;
    }

    /**
     * Setter for LastAcceptedAt.
     * @param lastAcceptedAt Value for String
     */
    @JsonSetter("last_accepted_at")
    public void setLastAcceptedAt(String lastAcceptedAt) {
        this.lastAcceptedAt = lastAcceptedAt;
    }

    /**
     * Getter for UninvitedCount.
     * @return Returns the Integer
     */
    @JsonGetter("uninvited_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getUninvitedCount() {
        return uninvitedCount;
    }

    /**
     * Setter for UninvitedCount.
     * @param uninvitedCount Value for Integer
     */
    @JsonSetter("uninvited_count")
    public void setUninvitedCount(Integer uninvitedCount) {
        this.uninvitedCount = uninvitedCount;
    }

    /**
     * Converts this RevokedInvitation into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RevokedInvitation [" + "lastSentAt=" + lastSentAt + ", lastAcceptedAt="
                + lastAcceptedAt + ", uninvitedCount=" + uninvitedCount + "]";
    }

    /**
     * Builds a new {@link RevokedInvitation.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RevokedInvitation.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .lastSentAt(getLastSentAt())
                .lastAcceptedAt(getLastAcceptedAt())
                .uninvitedCount(getUninvitedCount());
        return builder;
    }

    /**
     * Class to build instances of {@link RevokedInvitation}.
     */
    public static class Builder {
        private String lastSentAt;
        private String lastAcceptedAt;
        private Integer uninvitedCount;



        /**
         * Setter for lastSentAt.
         * @param  lastSentAt  String value for lastSentAt.
         * @return Builder
         */
        public Builder lastSentAt(String lastSentAt) {
            this.lastSentAt = lastSentAt;
            return this;
        }

        /**
         * Setter for lastAcceptedAt.
         * @param  lastAcceptedAt  String value for lastAcceptedAt.
         * @return Builder
         */
        public Builder lastAcceptedAt(String lastAcceptedAt) {
            this.lastAcceptedAt = lastAcceptedAt;
            return this;
        }

        /**
         * Setter for uninvitedCount.
         * @param  uninvitedCount  Integer value for uninvitedCount.
         * @return Builder
         */
        public Builder uninvitedCount(Integer uninvitedCount) {
            this.uninvitedCount = uninvitedCount;
            return this;
        }

        /**
         * Builds a new {@link RevokedInvitation} object using the set fields.
         * @return {@link RevokedInvitation}
         */
        public RevokedInvitation build() {
            return new RevokedInvitation(lastSentAt, lastAcceptedAt, uninvitedCount);
        }
    }
}
