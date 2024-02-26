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
 * This is a model class for ResentInvitation type.
 */
public class ResentInvitation {
    private String lastSentAt;
    private String lastAcceptedAt;
    private String sendInviteLinkText;
    private Integer uninvitedCount;

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
     */
    public ResentInvitation(
            String lastSentAt,
            String lastAcceptedAt,
            String sendInviteLinkText,
            Integer uninvitedCount) {
        this.lastSentAt = lastSentAt;
        this.lastAcceptedAt = lastAcceptedAt;
        this.sendInviteLinkText = sendInviteLinkText;
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
     * Converts this ResentInvitation into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ResentInvitation [" + "lastSentAt=" + lastSentAt + ", lastAcceptedAt="
                + lastAcceptedAt + ", sendInviteLinkText=" + sendInviteLinkText
                + ", uninvitedCount=" + uninvitedCount + "]";
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
                .uninvitedCount(getUninvitedCount());
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
         * Builds a new {@link ResentInvitation} object using the set fields.
         * @return {@link ResentInvitation}
         */
        public ResentInvitation build() {
            return new ResentInvitation(lastSentAt, lastAcceptedAt, sendInviteLinkText,
                    uninvitedCount);
        }
    }
}
