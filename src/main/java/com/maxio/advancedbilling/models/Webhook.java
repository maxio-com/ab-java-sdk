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
 * This is a model class for Webhook type.
 */
public class Webhook {
    private String event;
    private Integer id;
    private String createdAt;
    private String lastError;
    private String lastErrorAt;
    private OptionalNullable<String> acceptedAt;
    private String lastSentAt;
    private String lastSentUrl;
    private Boolean successful;
    private String body;
    private String signature;
    private String signatureHmacSha256;

    /**
     * Default constructor.
     */
    public Webhook() {
    }

    /**
     * Initialization constructor.
     * @param  event  String value for event.
     * @param  id  Integer value for id.
     * @param  createdAt  String value for createdAt.
     * @param  lastError  String value for lastError.
     * @param  lastErrorAt  String value for lastErrorAt.
     * @param  acceptedAt  String value for acceptedAt.
     * @param  lastSentAt  String value for lastSentAt.
     * @param  lastSentUrl  String value for lastSentUrl.
     * @param  successful  Boolean value for successful.
     * @param  body  String value for body.
     * @param  signature  String value for signature.
     * @param  signatureHmacSha256  String value for signatureHmacSha256.
     */
    public Webhook(
            String event,
            Integer id,
            String createdAt,
            String lastError,
            String lastErrorAt,
            String acceptedAt,
            String lastSentAt,
            String lastSentUrl,
            Boolean successful,
            String body,
            String signature,
            String signatureHmacSha256) {
        this.event = event;
        this.id = id;
        this.createdAt = createdAt;
        this.lastError = lastError;
        this.lastErrorAt = lastErrorAt;
        this.acceptedAt = OptionalNullable.of(acceptedAt);
        this.lastSentAt = lastSentAt;
        this.lastSentUrl = lastSentUrl;
        this.successful = successful;
        this.body = body;
        this.signature = signature;
        this.signatureHmacSha256 = signatureHmacSha256;
    }

    /**
     * Initialization constructor.
     * @param  event  String value for event.
     * @param  id  Integer value for id.
     * @param  createdAt  String value for createdAt.
     * @param  lastError  String value for lastError.
     * @param  lastErrorAt  String value for lastErrorAt.
     * @param  acceptedAt  String value for acceptedAt.
     * @param  lastSentAt  String value for lastSentAt.
     * @param  lastSentUrl  String value for lastSentUrl.
     * @param  successful  Boolean value for successful.
     * @param  body  String value for body.
     * @param  signature  String value for signature.
     * @param  signatureHmacSha256  String value for signatureHmacSha256.
     */

    protected Webhook(String event, Integer id, String createdAt, String lastError,
            String lastErrorAt, OptionalNullable<String> acceptedAt, String lastSentAt,
            String lastSentUrl, Boolean successful, String body, String signature,
            String signatureHmacSha256) {
        this.event = event;
        this.id = id;
        this.createdAt = createdAt;
        this.lastError = lastError;
        this.lastErrorAt = lastErrorAt;
        this.acceptedAt = acceptedAt;
        this.lastSentAt = lastSentAt;
        this.lastSentUrl = lastSentUrl;
        this.successful = successful;
        this.body = body;
        this.signature = signature;
        this.signatureHmacSha256 = signatureHmacSha256;
    }

    /**
     * Getter for Event.
     * A string describing which event type produced the given webhook
     * @return Returns the String
     */
    @JsonGetter("event")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEvent() {
        return event;
    }

    /**
     * Setter for Event.
     * A string describing which event type produced the given webhook
     * @param event Value for String
     */
    @JsonSetter("event")
    public void setEvent(String event) {
        this.event = event;
    }

    /**
     * Getter for Id.
     * The unique identifier for the webhooks (unique across all of Chargify). This is not changed
     * on a retry/replay of the same webhook, so it may be used to avoid duplicate action for the
     * same event.
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The unique identifier for the webhooks (unique across all of Chargify). This is not changed
     * on a retry/replay of the same webhook, so it may be used to avoid duplicate action for the
     * same event.
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for CreatedAt.
     * Timestamp indicating when the webhook was created
     * @return Returns the String
     */
    @JsonGetter("created_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * Timestamp indicating when the webhook was created
     * @param createdAt Value for String
     */
    @JsonSetter("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for LastError.
     * Text describing the status code and/or error from the last failed attempt to send the
     * Webhook. When a webhook is retried and accepted, this field will be cleared.
     * @return Returns the String
     */
    @JsonGetter("last_error")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastError() {
        return lastError;
    }

    /**
     * Setter for LastError.
     * Text describing the status code and/or error from the last failed attempt to send the
     * Webhook. When a webhook is retried and accepted, this field will be cleared.
     * @param lastError Value for String
     */
    @JsonSetter("last_error")
    public void setLastError(String lastError) {
        this.lastError = lastError;
    }

    /**
     * Getter for LastErrorAt.
     * Timestamp indicating when the last non-acceptance occurred. If a webhook is later resent and
     * accepted, this field will be cleared.
     * @return Returns the String
     */
    @JsonGetter("last_error_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastErrorAt() {
        return lastErrorAt;
    }

    /**
     * Setter for LastErrorAt.
     * Timestamp indicating when the last non-acceptance occurred. If a webhook is later resent and
     * accepted, this field will be cleared.
     * @param lastErrorAt Value for String
     */
    @JsonSetter("last_error_at")
    public void setLastErrorAt(String lastErrorAt) {
        this.lastErrorAt = lastErrorAt;
    }

    /**
     * Internal Getter for AcceptedAt.
     * Timestamp indicating when the webhook was accepted by the merchant endpoint. When a webhook
     * is explicitly replayed by the merchant, this value will be cleared until it is accepted
     * again.
     * @return Returns the Internal String
     */
    @JsonGetter("accepted_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetAcceptedAt() {
        return this.acceptedAt;
    }

    /**
     * Getter for AcceptedAt.
     * Timestamp indicating when the webhook was accepted by the merchant endpoint. When a webhook
     * is explicitly replayed by the merchant, this value will be cleared until it is accepted
     * again.
     * @return Returns the String
     */
    public String getAcceptedAt() {
        return OptionalNullable.getFrom(acceptedAt);
    }

    /**
     * Setter for AcceptedAt.
     * Timestamp indicating when the webhook was accepted by the merchant endpoint. When a webhook
     * is explicitly replayed by the merchant, this value will be cleared until it is accepted
     * again.
     * @param acceptedAt Value for String
     */
    @JsonSetter("accepted_at")
    public void setAcceptedAt(String acceptedAt) {
        this.acceptedAt = OptionalNullable.of(acceptedAt);
    }

    /**
     * UnSetter for AcceptedAt.
     * Timestamp indicating when the webhook was accepted by the merchant endpoint. When a webhook
     * is explicitly replayed by the merchant, this value will be cleared until it is accepted
     * again.
     */
    public void unsetAcceptedAt() {
        acceptedAt = null;
    }

    /**
     * Getter for LastSentAt.
     * Timestamp indicating when the most recent attempt was made to send the webhook
     * @return Returns the String
     */
    @JsonGetter("last_sent_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastSentAt() {
        return lastSentAt;
    }

    /**
     * Setter for LastSentAt.
     * Timestamp indicating when the most recent attempt was made to send the webhook
     * @param lastSentAt Value for String
     */
    @JsonSetter("last_sent_at")
    public void setLastSentAt(String lastSentAt) {
        this.lastSentAt = lastSentAt;
    }

    /**
     * Getter for LastSentUrl.
     * The url that the endpoint was last sent to.
     * @return Returns the String
     */
    @JsonGetter("last_sent_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastSentUrl() {
        return lastSentUrl;
    }

    /**
     * Setter for LastSentUrl.
     * The url that the endpoint was last sent to.
     * @param lastSentUrl Value for String
     */
    @JsonSetter("last_sent_url")
    public void setLastSentUrl(String lastSentUrl) {
        this.lastSentUrl = lastSentUrl;
    }

    /**
     * Getter for Successful.
     * A boolean flag describing whether the webhook was accepted by the webhook endpoint for the
     * most recent attempt. (Acceptance is defined by receiving a “200 OK” HTTP response within a
     * reasonable timeframe, i.e. 15 seconds)
     * @return Returns the Boolean
     */
    @JsonGetter("successful")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getSuccessful() {
        return successful;
    }

    /**
     * Setter for Successful.
     * A boolean flag describing whether the webhook was accepted by the webhook endpoint for the
     * most recent attempt. (Acceptance is defined by receiving a “200 OK” HTTP response within a
     * reasonable timeframe, i.e. 15 seconds)
     * @param successful Value for Boolean
     */
    @JsonSetter("successful")
    public void setSuccessful(Boolean successful) {
        this.successful = successful;
    }

    /**
     * Getter for Body.
     * The data sent within the webhook post
     * @return Returns the String
     */
    @JsonGetter("body")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBody() {
        return body;
    }

    /**
     * Setter for Body.
     * The data sent within the webhook post
     * @param body Value for String
     */
    @JsonSetter("body")
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * Getter for Signature.
     * The calculated webhook signature
     * @return Returns the String
     */
    @JsonGetter("signature")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSignature() {
        return signature;
    }

    /**
     * Setter for Signature.
     * The calculated webhook signature
     * @param signature Value for String
     */
    @JsonSetter("signature")
    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * Getter for SignatureHmacSha256.
     * The calculated HMAC-SHA-256 webhook signature
     * @return Returns the String
     */
    @JsonGetter("signature_hmac_sha_256")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSignatureHmacSha256() {
        return signatureHmacSha256;
    }

    /**
     * Setter for SignatureHmacSha256.
     * The calculated HMAC-SHA-256 webhook signature
     * @param signatureHmacSha256 Value for String
     */
    @JsonSetter("signature_hmac_sha_256")
    public void setSignatureHmacSha256(String signatureHmacSha256) {
        this.signatureHmacSha256 = signatureHmacSha256;
    }

    /**
     * Converts this Webhook into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Webhook [" + "event=" + event + ", id=" + id + ", createdAt=" + createdAt
                + ", lastError=" + lastError + ", lastErrorAt=" + lastErrorAt + ", acceptedAt="
                + acceptedAt + ", lastSentAt=" + lastSentAt + ", lastSentUrl=" + lastSentUrl
                + ", successful=" + successful + ", body=" + body + ", signature=" + signature
                + ", signatureHmacSha256=" + signatureHmacSha256 + "]";
    }

    /**
     * Builds a new {@link Webhook.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Webhook.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .event(getEvent())
                .id(getId())
                .createdAt(getCreatedAt())
                .lastError(getLastError())
                .lastErrorAt(getLastErrorAt())
                .lastSentAt(getLastSentAt())
                .lastSentUrl(getLastSentUrl())
                .successful(getSuccessful())
                .body(getBody())
                .signature(getSignature())
                .signatureHmacSha256(getSignatureHmacSha256());
        builder.acceptedAt = internalGetAcceptedAt();
        return builder;
    }

    /**
     * Class to build instances of {@link Webhook}.
     */
    public static class Builder {
        private String event;
        private Integer id;
        private String createdAt;
        private String lastError;
        private String lastErrorAt;
        private OptionalNullable<String> acceptedAt;
        private String lastSentAt;
        private String lastSentUrl;
        private Boolean successful;
        private String body;
        private String signature;
        private String signatureHmacSha256;



        /**
         * Setter for event.
         * @param  event  String value for event.
         * @return Builder
         */
        public Builder event(String event) {
            this.event = event;
            return this;
        }

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
         * Setter for createdAt.
         * @param  createdAt  String value for createdAt.
         * @return Builder
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for lastError.
         * @param  lastError  String value for lastError.
         * @return Builder
         */
        public Builder lastError(String lastError) {
            this.lastError = lastError;
            return this;
        }

        /**
         * Setter for lastErrorAt.
         * @param  lastErrorAt  String value for lastErrorAt.
         * @return Builder
         */
        public Builder lastErrorAt(String lastErrorAt) {
            this.lastErrorAt = lastErrorAt;
            return this;
        }

        /**
         * Setter for acceptedAt.
         * @param  acceptedAt  String value for acceptedAt.
         * @return Builder
         */
        public Builder acceptedAt(String acceptedAt) {
            this.acceptedAt = OptionalNullable.of(acceptedAt);
            return this;
        }

        /**
         * UnSetter for acceptedAt.
         * @return Builder
         */
        public Builder unsetAcceptedAt() {
            acceptedAt = null;
            return this;
        }

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
         * Setter for lastSentUrl.
         * @param  lastSentUrl  String value for lastSentUrl.
         * @return Builder
         */
        public Builder lastSentUrl(String lastSentUrl) {
            this.lastSentUrl = lastSentUrl;
            return this;
        }

        /**
         * Setter for successful.
         * @param  successful  Boolean value for successful.
         * @return Builder
         */
        public Builder successful(Boolean successful) {
            this.successful = successful;
            return this;
        }

        /**
         * Setter for body.
         * @param  body  String value for body.
         * @return Builder
         */
        public Builder body(String body) {
            this.body = body;
            return this;
        }

        /**
         * Setter for signature.
         * @param  signature  String value for signature.
         * @return Builder
         */
        public Builder signature(String signature) {
            this.signature = signature;
            return this;
        }

        /**
         * Setter for signatureHmacSha256.
         * @param  signatureHmacSha256  String value for signatureHmacSha256.
         * @return Builder
         */
        public Builder signatureHmacSha256(String signatureHmacSha256) {
            this.signatureHmacSha256 = signatureHmacSha256;
            return this;
        }

        /**
         * Builds a new {@link Webhook} object using the set fields.
         * @return {@link Webhook}
         */
        public Webhook build() {
            return new Webhook(event, id, createdAt, lastError, lastErrorAt, acceptedAt, lastSentAt,
                    lastSentUrl, successful, body, signature, signatureHmacSha256);
        }
    }
}
