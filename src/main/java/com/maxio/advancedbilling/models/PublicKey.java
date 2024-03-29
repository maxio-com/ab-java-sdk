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
 * This is a model class for PublicKey type.
 */
public class PublicKey
        extends BaseModel {
    private String publicKey;
    private Boolean requiresSecurityToken;
    private ZonedDateTime createdAt;

    /**
     * Default constructor.
     */
    public PublicKey() {
    }

    /**
     * Initialization constructor.
     * @param  publicKey  String value for publicKey.
     * @param  requiresSecurityToken  Boolean value for requiresSecurityToken.
     * @param  createdAt  ZonedDateTime value for createdAt.
     */
    public PublicKey(
            String publicKey,
            Boolean requiresSecurityToken,
            ZonedDateTime createdAt) {
        this.publicKey = publicKey;
        this.requiresSecurityToken = requiresSecurityToken;
        this.createdAt = createdAt;
    }

    /**
     * Getter for PublicKey.
     * @return Returns the String
     */
    @JsonGetter("public_key")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPublicKey() {
        return publicKey;
    }

    /**
     * Setter for PublicKey.
     * @param publicKey Value for String
     */
    @JsonSetter("public_key")
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    /**
     * Getter for RequiresSecurityToken.
     * @return Returns the Boolean
     */
    @JsonGetter("requires_security_token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRequiresSecurityToken() {
        return requiresSecurityToken;
    }

    /**
     * Setter for RequiresSecurityToken.
     * @param requiresSecurityToken Value for Boolean
     */
    @JsonSetter("requires_security_token")
    public void setRequiresSecurityToken(Boolean requiresSecurityToken) {
        this.requiresSecurityToken = requiresSecurityToken;
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
     * Converts this PublicKey into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PublicKey [" + "publicKey=" + publicKey + ", requiresSecurityToken="
                + requiresSecurityToken + ", createdAt=" + createdAt + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link PublicKey.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PublicKey.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .publicKey(getPublicKey())
                .requiresSecurityToken(getRequiresSecurityToken())
                .createdAt(getCreatedAt());
        return builder;
    }

    /**
     * Class to build instances of {@link PublicKey}.
     */
    public static class Builder {
        private String publicKey;
        private Boolean requiresSecurityToken;
        private ZonedDateTime createdAt;



        /**
         * Setter for publicKey.
         * @param  publicKey  String value for publicKey.
         * @return Builder
         */
        public Builder publicKey(String publicKey) {
            this.publicKey = publicKey;
            return this;
        }

        /**
         * Setter for requiresSecurityToken.
         * @param  requiresSecurityToken  Boolean value for requiresSecurityToken.
         * @return Builder
         */
        public Builder requiresSecurityToken(Boolean requiresSecurityToken) {
            this.requiresSecurityToken = requiresSecurityToken;
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
         * Builds a new {@link PublicKey} object using the set fields.
         * @return {@link PublicKey}
         */
        public PublicKey build() {
            return new PublicKey(publicKey, requiresSecurityToken, createdAt);
        }
    }
}
