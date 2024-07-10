/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for PaymentMethodExternal type.
 */
public class PaymentMethodExternal
        extends BaseModel {
    private String details;
    private String kind;
    private String memo;
    private InvoiceEventPaymentMethod type;

    /**
     * Default constructor.
     */
    public PaymentMethodExternal() {
    }

    /**
     * Initialization constructor.
     * @param  details  String value for details.
     * @param  kind  String value for kind.
     * @param  memo  String value for memo.
     * @param  type  InvoiceEventPaymentMethod value for type.
     */
    @JsonCreator
    public PaymentMethodExternal(
            @JsonProperty("details") String details,
            @JsonProperty("kind") String kind,
            @JsonProperty("memo") String memo,
            @JsonProperty("type") InvoiceEventPaymentMethod type) {
        this.details = details;
        this.kind = kind;
        this.memo = memo;
        this.type = type;
    }

    /**
     * Getter for Details.
     * @return Returns the String
     */
    @JsonGetter("details")
    public String getDetails() {
        return details;
    }

    /**
     * Setter for Details.
     * @param details Value for String
     */
    @JsonSetter("details")
    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * Getter for Kind.
     * @return Returns the String
     */
    @JsonGetter("kind")
    public String getKind() {
        return kind;
    }

    /**
     * Setter for Kind.
     * @param kind Value for String
     */
    @JsonSetter("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * Getter for Memo.
     * @return Returns the String
     */
    @JsonGetter("memo")
    public String getMemo() {
        return memo;
    }

    /**
     * Setter for Memo.
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * Getter for Type.
     * @return Returns the InvoiceEventPaymentMethod
     */
    @JsonGetter("type")
    public InvoiceEventPaymentMethod getType() {
        return type;
    }

    /**
     * Setter for Type.
     * @param type Value for InvoiceEventPaymentMethod
     */
    @JsonSetter("type")
    public void setType(InvoiceEventPaymentMethod type) {
        this.type = type;
    }

    /**
     * Converts this PaymentMethodExternal into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentMethodExternal [" + "details=" + details + ", kind=" + kind + ", memo="
                + memo + ", type=" + type + ", additionalProperties=" + getAdditionalProperties()
                + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(details, kind, memo, type);
        return builder;
    }

    /**
     * Class to build instances of {@link PaymentMethodExternal}.
     */
    public static class Builder {
        private String details;
        private String kind;
        private String memo;
        private InvoiceEventPaymentMethod type;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  details  String value for details.
         * @param  kind  String value for kind.
         * @param  memo  String value for memo.
         * @param  type  InvoiceEventPaymentMethod value for type.
         */
        public Builder(String details, String kind, String memo, InvoiceEventPaymentMethod type) {
            this.details = details;
            this.kind = kind;
            this.memo = memo;
            this.type = type;
        }

        /**
         * Setter for details.
         * @param  details  String value for details.
         * @return Builder
         */
        public Builder details(String details) {
            this.details = details;
            return this;
        }

        /**
         * Setter for kind.
         * @param  kind  String value for kind.
         * @return Builder
         */
        public Builder kind(String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Setter for memo.
         * @param  memo  String value for memo.
         * @return Builder
         */
        public Builder memo(String memo) {
            this.memo = memo;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  InvoiceEventPaymentMethod value for type.
         * @return Builder
         */
        public Builder type(InvoiceEventPaymentMethod type) {
            this.type = type;
            return this;
        }

        /**
         * Builds a new {@link PaymentMethodExternal} object using the set fields.
         * @return {@link PaymentMethodExternal}
         */
        public PaymentMethodExternal build() {
            return new PaymentMethodExternal(details, kind, memo, type);
        }
    }
}
