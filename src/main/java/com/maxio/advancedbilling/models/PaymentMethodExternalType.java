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
 * This is a model class for PaymentMethodExternalType type.
 */
public class PaymentMethodExternalType {
    private String details;
    private String kind;
    private String memo;
    private String type;

    /**
     * Default constructor.
     */
    public PaymentMethodExternalType() {
        type = "external";
    }

    /**
     * Initialization constructor.
     * @param  details  String value for details.
     * @param  kind  String value for kind.
     * @param  memo  String value for memo.
     * @param  type  String value for type.
     */
    public PaymentMethodExternalType(
            String details,
            String kind,
            String memo,
            String type) {
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
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * @return Returns the String
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Converts this PaymentMethodExternalType into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentMethodExternalType [" + "details=" + details + ", kind=" + kind + ", memo="
                + memo + ", type=" + type + "]";
    }

    /**
     * Builds a new {@link PaymentMethodExternalType.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaymentMethodExternalType.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .details(getDetails())
                .kind(getKind())
                .memo(getMemo())
                .type(getType());
        return builder;
    }

    /**
     * Class to build instances of {@link PaymentMethodExternalType}.
     */
    public static class Builder {
        private String details;
        private String kind;
        private String memo;
        private String type = "external";



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
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds a new {@link PaymentMethodExternalType} object using the set fields.
         * @return {@link PaymentMethodExternalType}
         */
        public PaymentMethodExternalType build() {
            return new PaymentMethodExternalType(details, kind, memo, type);
        }
    }
}
