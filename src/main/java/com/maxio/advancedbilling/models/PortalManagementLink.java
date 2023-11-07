/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for PortalManagementLink type.
 */
public class PortalManagementLink {
    private String url;
    private Integer fetchCount;
    private String createdAt;
    private String newLinkAvailableAt;
    private String expiresAt;
    private OptionalNullable<String> lastInviteSentAt;

    /**
     * Default constructor.
     */
    public PortalManagementLink() {
    }

    /**
     * Initialization constructor.
     * @param  url  String value for url.
     * @param  fetchCount  Integer value for fetchCount.
     * @param  createdAt  String value for createdAt.
     * @param  newLinkAvailableAt  String value for newLinkAvailableAt.
     * @param  expiresAt  String value for expiresAt.
     * @param  lastInviteSentAt  String value for lastInviteSentAt.
     */
    public PortalManagementLink(
            String url,
            Integer fetchCount,
            String createdAt,
            String newLinkAvailableAt,
            String expiresAt,
            String lastInviteSentAt) {
        this.url = url;
        this.fetchCount = fetchCount;
        this.createdAt = createdAt;
        this.newLinkAvailableAt = newLinkAvailableAt;
        this.expiresAt = expiresAt;
        this.lastInviteSentAt = OptionalNullable.of(lastInviteSentAt);
    }

    /**
     * Initialization constructor.
     * @param  url  String value for url.
     * @param  fetchCount  Integer value for fetchCount.
     * @param  createdAt  String value for createdAt.
     * @param  newLinkAvailableAt  String value for newLinkAvailableAt.
     * @param  expiresAt  String value for expiresAt.
     * @param  lastInviteSentAt  String value for lastInviteSentAt.
     */

    protected PortalManagementLink(String url, Integer fetchCount, String createdAt,
            String newLinkAvailableAt, String expiresAt,
            OptionalNullable<String> lastInviteSentAt) {
        this.url = url;
        this.fetchCount = fetchCount;
        this.createdAt = createdAt;
        this.newLinkAvailableAt = newLinkAvailableAt;
        this.expiresAt = expiresAt;
        this.lastInviteSentAt = lastInviteSentAt;
    }

    /**
     * Getter for Url.
     * @return Returns the String
     */
    @JsonGetter("url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Getter for FetchCount.
     * @return Returns the Integer
     */
    @JsonGetter("fetch_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getFetchCount() {
        return fetchCount;
    }

    /**
     * Setter for FetchCount.
     * @param fetchCount Value for Integer
     */
    @JsonSetter("fetch_count")
    public void setFetchCount(Integer fetchCount) {
        this.fetchCount = fetchCount;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the String
     */
    @JsonGetter("created_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for String
     */
    @JsonSetter("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for NewLinkAvailableAt.
     * @return Returns the String
     */
    @JsonGetter("new_link_available_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNewLinkAvailableAt() {
        return newLinkAvailableAt;
    }

    /**
     * Setter for NewLinkAvailableAt.
     * @param newLinkAvailableAt Value for String
     */
    @JsonSetter("new_link_available_at")
    public void setNewLinkAvailableAt(String newLinkAvailableAt) {
        this.newLinkAvailableAt = newLinkAvailableAt;
    }

    /**
     * Getter for ExpiresAt.
     * @return Returns the String
     */
    @JsonGetter("expires_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getExpiresAt() {
        return expiresAt;
    }

    /**
     * Setter for ExpiresAt.
     * @param expiresAt Value for String
     */
    @JsonSetter("expires_at")
    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }

    /**
     * Internal Getter for LastInviteSentAt.
     * @return Returns the Internal String
     */
    @JsonGetter("last_invite_sent_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetLastInviteSentAt() {
        return this.lastInviteSentAt;
    }

    /**
     * Getter for LastInviteSentAt.
     * @return Returns the String
     */
    public String getLastInviteSentAt() {
        return OptionalNullable.getFrom(lastInviteSentAt);
    }

    /**
     * Setter for LastInviteSentAt.
     * @param lastInviteSentAt Value for String
     */
    @JsonSetter("last_invite_sent_at")
    public void setLastInviteSentAt(String lastInviteSentAt) {
        this.lastInviteSentAt = OptionalNullable.of(lastInviteSentAt);
    }

    /**
     * UnSetter for LastInviteSentAt.
     */
    public void unsetLastInviteSentAt() {
        lastInviteSentAt = null;
    }

    /**
     * Converts this PortalManagementLink into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PortalManagementLink [" + "url=" + url + ", fetchCount=" + fetchCount
                + ", createdAt=" + createdAt + ", newLinkAvailableAt=" + newLinkAvailableAt
                + ", expiresAt=" + expiresAt + ", lastInviteSentAt=" + lastInviteSentAt + "]";
    }

    /**
     * Builds a new {@link PortalManagementLink.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PortalManagementLink.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .url(getUrl())
                .fetchCount(getFetchCount())
                .createdAt(getCreatedAt())
                .newLinkAvailableAt(getNewLinkAvailableAt())
                .expiresAt(getExpiresAt());
        builder.lastInviteSentAt = internalGetLastInviteSentAt();
        return builder;
    }

    /**
     * Class to build instances of {@link PortalManagementLink}.
     */
    public static class Builder {
        private String url;
        private Integer fetchCount;
        private String createdAt;
        private String newLinkAvailableAt;
        private String expiresAt;
        private OptionalNullable<String> lastInviteSentAt;



        /**
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Setter for fetchCount.
         * @param  fetchCount  Integer value for fetchCount.
         * @return Builder
         */
        public Builder fetchCount(Integer fetchCount) {
            this.fetchCount = fetchCount;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  String value for createdAt.
         * @return Builder
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for newLinkAvailableAt.
         * @param  newLinkAvailableAt  String value for newLinkAvailableAt.
         * @return Builder
         */
        public Builder newLinkAvailableAt(String newLinkAvailableAt) {
            this.newLinkAvailableAt = newLinkAvailableAt;
            return this;
        }

        /**
         * Setter for expiresAt.
         * @param  expiresAt  String value for expiresAt.
         * @return Builder
         */
        public Builder expiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * Setter for lastInviteSentAt.
         * @param  lastInviteSentAt  String value for lastInviteSentAt.
         * @return Builder
         */
        public Builder lastInviteSentAt(String lastInviteSentAt) {
            this.lastInviteSentAt = OptionalNullable.of(lastInviteSentAt);
            return this;
        }

        /**
         * UnSetter for lastInviteSentAt.
         * @return Builder
         */
        public Builder unsetLastInviteSentAt() {
            lastInviteSentAt = null;
            return this;
        }

        /**
         * Builds a new {@link PortalManagementLink} object using the set fields.
         * @return {@link PortalManagementLink}
         */
        public PortalManagementLink build() {
            return new PortalManagementLink(url, fetchCount, createdAt, newLinkAvailableAt,
                    expiresAt, lastInviteSentAt);
        }
    }
}
