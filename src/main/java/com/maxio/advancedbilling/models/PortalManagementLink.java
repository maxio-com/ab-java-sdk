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
import io.apimatic.core.types.OptionalNullable;
import java.time.ZonedDateTime;

/**
 * This is a model class for PortalManagementLink type.
 */
public class PortalManagementLink
        extends BaseModel {
    private String url;
    private Integer fetchCount;
    private ZonedDateTime createdAt;
    private ZonedDateTime newLinkAvailableAt;
    private ZonedDateTime expiresAt;
    private OptionalNullable<ZonedDateTime> lastInviteSentAt;

    /**
     * Default constructor.
     */
    public PortalManagementLink() {
    }

    /**
     * Initialization constructor.
     * @param  url  String value for url.
     * @param  fetchCount  Integer value for fetchCount.
     * @param  createdAt  ZonedDateTime value for createdAt.
     * @param  newLinkAvailableAt  ZonedDateTime value for newLinkAvailableAt.
     * @param  expiresAt  ZonedDateTime value for expiresAt.
     * @param  lastInviteSentAt  ZonedDateTime value for lastInviteSentAt.
     */
    public PortalManagementLink(
            String url,
            Integer fetchCount,
            ZonedDateTime createdAt,
            ZonedDateTime newLinkAvailableAt,
            ZonedDateTime expiresAt,
            ZonedDateTime lastInviteSentAt) {
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
     * @param  createdAt  ZonedDateTime value for createdAt.
     * @param  newLinkAvailableAt  ZonedDateTime value for newLinkAvailableAt.
     * @param  expiresAt  ZonedDateTime value for expiresAt.
     * @param  lastInviteSentAt  ZonedDateTime value for lastInviteSentAt.
     */

    protected PortalManagementLink(String url, Integer fetchCount, ZonedDateTime createdAt,
            ZonedDateTime newLinkAvailableAt, ZonedDateTime expiresAt,
            OptionalNullable<ZonedDateTime> lastInviteSentAt) {
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
     * Getter for NewLinkAvailableAt.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("new_link_available_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getNewLinkAvailableAt() {
        return newLinkAvailableAt;
    }

    /**
     * Setter for NewLinkAvailableAt.
     * @param newLinkAvailableAt Value for ZonedDateTime
     */
    @JsonSetter("new_link_available_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setNewLinkAvailableAt(ZonedDateTime newLinkAvailableAt) {
        this.newLinkAvailableAt = newLinkAvailableAt;
    }

    /**
     * Getter for ExpiresAt.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("expires_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getExpiresAt() {
        return expiresAt;
    }

    /**
     * Setter for ExpiresAt.
     * @param expiresAt Value for ZonedDateTime
     */
    @JsonSetter("expires_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setExpiresAt(ZonedDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }

    /**
     * Internal Getter for LastInviteSentAt.
     * @return Returns the Internal ZonedDateTime
     */
    @JsonGetter("last_invite_sent_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.ZonedRfc8601DateTimeSerializer.class)
    protected OptionalNullable<ZonedDateTime> internalGetLastInviteSentAt() {
        return this.lastInviteSentAt;
    }

    /**
     * Getter for LastInviteSentAt.
     * @return Returns the ZonedDateTime
     */
    public ZonedDateTime getLastInviteSentAt() {
        return OptionalNullable.getFrom(lastInviteSentAt);
    }

    /**
     * Setter for LastInviteSentAt.
     * @param lastInviteSentAt Value for ZonedDateTime
     */
    @JsonSetter("last_invite_sent_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setLastInviteSentAt(ZonedDateTime lastInviteSentAt) {
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
                + ", expiresAt=" + expiresAt + ", lastInviteSentAt=" + lastInviteSentAt
                + ", additionalProperties=" + getAdditionalProperties() + "]";
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
        private ZonedDateTime createdAt;
        private ZonedDateTime newLinkAvailableAt;
        private ZonedDateTime expiresAt;
        private OptionalNullable<ZonedDateTime> lastInviteSentAt;



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
         * @param  createdAt  ZonedDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(ZonedDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for newLinkAvailableAt.
         * @param  newLinkAvailableAt  ZonedDateTime value for newLinkAvailableAt.
         * @return Builder
         */
        public Builder newLinkAvailableAt(ZonedDateTime newLinkAvailableAt) {
            this.newLinkAvailableAt = newLinkAvailableAt;
            return this;
        }

        /**
         * Setter for expiresAt.
         * @param  expiresAt  ZonedDateTime value for expiresAt.
         * @return Builder
         */
        public Builder expiresAt(ZonedDateTime expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * Setter for lastInviteSentAt.
         * @param  lastInviteSentAt  ZonedDateTime value for lastInviteSentAt.
         * @return Builder
         */
        public Builder lastInviteSentAt(ZonedDateTime lastInviteSentAt) {
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
