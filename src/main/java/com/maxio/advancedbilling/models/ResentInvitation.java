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
 * This is a model class for ResentInvitation type.
 */
public class ResentInvitation
        extends BaseModel {
    private String lastSentAt;
    private String lastAcceptedAt;
    private String sendInviteLinkText;
    private Integer uninvitedCount;
    private ZonedDateTime lastInviteSentAt;
    private ZonedDateTime lastInviteAcceptedAt;

    /**
     * Default constructor.
     */
    public ResentInvitation() {
    }

    /**
     * Initialization constructor.
     * @param  lastSentAt  String value for lastSentAt.
     * @param  lastAcceptedAt  String value for lastAcceptedAt.
     * @param  sendInviteLinkText  String value for sendInviteLinkText.
     * @param  uninvitedCount  Integer value for uninvitedCount.
     * @param  lastInviteSentAt  ZonedDateTime value for lastInviteSentAt.
     * @param  lastInviteAcceptedAt  ZonedDateTime value for lastInviteAcceptedAt.
     */
    public ResentInvitation(
            String lastSentAt,
            String lastAcceptedAt,
            String sendInviteLinkText,
            Integer uninvitedCount,
            ZonedDateTime lastInviteSentAt,
            ZonedDateTime lastInviteAcceptedAt) {
        this.lastSentAt = lastSentAt;
        this.lastAcceptedAt = lastAcceptedAt;
        this.sendInviteLinkText = sendInviteLinkText;
        this.uninvitedCount = uninvitedCount;
        this.lastInviteSentAt = lastInviteSentAt;
        this.lastInviteAcceptedAt = lastInviteAcceptedAt;
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
     * Getter for SendInviteLinkText.
     * @return Returns the String
     */
    @JsonGetter("send_invite_link_text")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSendInviteLinkText() {
        return sendInviteLinkText;
    }

    /**
     * Setter for SendInviteLinkText.
     * @param sendInviteLinkText Value for String
     */
    @JsonSetter("send_invite_link_text")
    public void setSendInviteLinkText(String sendInviteLinkText) {
        this.sendInviteLinkText = sendInviteLinkText;
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
     * Getter for LastInviteSentAt.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("last_invite_sent_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getLastInviteSentAt() {
        return lastInviteSentAt;
    }

    /**
     * Setter for LastInviteSentAt.
     * @param lastInviteSentAt Value for ZonedDateTime
     */
    @JsonSetter("last_invite_sent_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setLastInviteSentAt(ZonedDateTime lastInviteSentAt) {
        this.lastInviteSentAt = lastInviteSentAt;
    }

    /**
     * Getter for LastInviteAcceptedAt.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("last_invite_accepted_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getLastInviteAcceptedAt() {
        return lastInviteAcceptedAt;
    }

    /**
     * Setter for LastInviteAcceptedAt.
     * @param lastInviteAcceptedAt Value for ZonedDateTime
     */
    @JsonSetter("last_invite_accepted_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setLastInviteAcceptedAt(ZonedDateTime lastInviteAcceptedAt) {
        this.lastInviteAcceptedAt = lastInviteAcceptedAt;
    }

    /**
     * Converts this ResentInvitation into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ResentInvitation [" + "lastSentAt=" + lastSentAt + ", lastAcceptedAt="
                + lastAcceptedAt + ", sendInviteLinkText=" + sendInviteLinkText
                + ", uninvitedCount=" + uninvitedCount + ", lastInviteSentAt=" + lastInviteSentAt
                + ", lastInviteAcceptedAt=" + lastInviteAcceptedAt + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ResentInvitation.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ResentInvitation.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .lastSentAt(getLastSentAt())
                .lastAcceptedAt(getLastAcceptedAt())
                .sendInviteLinkText(getSendInviteLinkText())
                .uninvitedCount(getUninvitedCount())
                .lastInviteSentAt(getLastInviteSentAt())
                .lastInviteAcceptedAt(getLastInviteAcceptedAt());
        return builder;
    }

    /**
     * Class to build instances of {@link ResentInvitation}.
     */
    public static class Builder {
        private String lastSentAt;
        private String lastAcceptedAt;
        private String sendInviteLinkText;
        private Integer uninvitedCount;
        private ZonedDateTime lastInviteSentAt;
        private ZonedDateTime lastInviteAcceptedAt;



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
         * Setter for sendInviteLinkText.
         * @param  sendInviteLinkText  String value for sendInviteLinkText.
         * @return Builder
         */
        public Builder sendInviteLinkText(String sendInviteLinkText) {
            this.sendInviteLinkText = sendInviteLinkText;
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
         * Setter for lastInviteSentAt.
         * @param  lastInviteSentAt  ZonedDateTime value for lastInviteSentAt.
         * @return Builder
         */
        public Builder lastInviteSentAt(ZonedDateTime lastInviteSentAt) {
            this.lastInviteSentAt = lastInviteSentAt;
            return this;
        }

        /**
         * Setter for lastInviteAcceptedAt.
         * @param  lastInviteAcceptedAt  ZonedDateTime value for lastInviteAcceptedAt.
         * @return Builder
         */
        public Builder lastInviteAcceptedAt(ZonedDateTime lastInviteAcceptedAt) {
            this.lastInviteAcceptedAt = lastInviteAcceptedAt;
            return this;
        }

        /**
         * Builds a new {@link ResentInvitation} object using the set fields.
         * @return {@link ResentInvitation}
         */
        public ResentInvitation build() {
            return new ResentInvitation(lastSentAt, lastAcceptedAt, sendInviteLinkText,
                    uninvitedCount, lastInviteSentAt, lastInviteAcceptedAt);
        }
    }
}
