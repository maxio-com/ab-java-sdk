/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for InvoiceEventPayment type.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        defaultImpl = InvoiceEventPayment.class,
        visible = true)
@JsonInclude(Include.ALWAYS)
public class InvoiceEventPayment
        extends BaseModel {
    private String type;
    private String maskedAccountNumber;
    private String maskedRoutingNumber;
    private String cardBrand;
    private String cardExpiration;
    private OptionalNullable<String> lastFour;
    private String maskedCardNumber;
    private OptionalNullable<String> details;
    private String kind;
    private OptionalNullable<String> memo;
    private String email;

    /**
     * Default constructor.
     */
    public InvoiceEventPayment() {
        setType("Invoice Event Payment");
    }

    /**
     * Initialization constructor.
     * @param  type  String value for type.
     * @param  maskedAccountNumber  String value for maskedAccountNumber.
     * @param  maskedRoutingNumber  String value for maskedRoutingNumber.
     * @param  cardBrand  String value for cardBrand.
     * @param  cardExpiration  String value for cardExpiration.
     * @param  lastFour  String value for lastFour.
     * @param  maskedCardNumber  String value for maskedCardNumber.
     * @param  details  String value for details.
     * @param  kind  String value for kind.
     * @param  memo  String value for memo.
     * @param  email  String value for email.
     */
    public InvoiceEventPayment(
            String type,
            String maskedAccountNumber,
            String maskedRoutingNumber,
            String cardBrand,
            String cardExpiration,
            String lastFour,
            String maskedCardNumber,
            String details,
            String kind,
            String memo,
            String email) {
        this.type = type;
        this.maskedAccountNumber = maskedAccountNumber;
        this.maskedRoutingNumber = maskedRoutingNumber;
        this.cardBrand = cardBrand;
        this.cardExpiration = cardExpiration;
        this.lastFour = OptionalNullable.of(lastFour);
        this.maskedCardNumber = maskedCardNumber;
        this.details = OptionalNullable.of(details);
        this.kind = kind;
        this.memo = OptionalNullable.of(memo);
        this.email = email;
    }

    /**
     * Initialization constructor.
     * @param  type  String value for type.
     * @param  maskedAccountNumber  String value for maskedAccountNumber.
     * @param  maskedRoutingNumber  String value for maskedRoutingNumber.
     * @param  cardBrand  String value for cardBrand.
     * @param  cardExpiration  String value for cardExpiration.
     * @param  lastFour  String value for lastFour.
     * @param  maskedCardNumber  String value for maskedCardNumber.
     * @param  details  String value for details.
     * @param  kind  String value for kind.
     * @param  memo  String value for memo.
     * @param  email  String value for email.
     */

    protected InvoiceEventPayment(String type, String maskedAccountNumber,
            String maskedRoutingNumber, String cardBrand, String cardExpiration,
            OptionalNullable<String> lastFour, String maskedCardNumber,
            OptionalNullable<String> details, String kind, OptionalNullable<String> memo,
            String email) {
        this.type = type;
        this.maskedAccountNumber = maskedAccountNumber;
        this.maskedRoutingNumber = maskedRoutingNumber;
        this.cardBrand = cardBrand;
        this.cardExpiration = cardExpiration;
        this.lastFour = lastFour;
        this.maskedCardNumber = maskedCardNumber;
        this.details = details;
        this.kind = kind;
        this.memo = memo;
        this.email = email;
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
     * Getter for MaskedAccountNumber.
     * @return Returns the String
     */
    @JsonGetter("masked_account_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMaskedAccountNumber() {
        return maskedAccountNumber;
    }

    /**
     * Setter for MaskedAccountNumber.
     * @param maskedAccountNumber Value for String
     */
    @JsonSetter("masked_account_number")
    public void setMaskedAccountNumber(String maskedAccountNumber) {
        this.maskedAccountNumber = maskedAccountNumber;
    }

    /**
     * Getter for MaskedRoutingNumber.
     * @return Returns the String
     */
    @JsonGetter("masked_routing_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMaskedRoutingNumber() {
        return maskedRoutingNumber;
    }

    /**
     * Setter for MaskedRoutingNumber.
     * @param maskedRoutingNumber Value for String
     */
    @JsonSetter("masked_routing_number")
    public void setMaskedRoutingNumber(String maskedRoutingNumber) {
        this.maskedRoutingNumber = maskedRoutingNumber;
    }

    /**
     * Getter for CardBrand.
     * @return Returns the String
     */
    @JsonGetter("card_brand")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCardBrand() {
        return cardBrand;
    }

    /**
     * Setter for CardBrand.
     * @param cardBrand Value for String
     */
    @JsonSetter("card_brand")
    public void setCardBrand(String cardBrand) {
        this.cardBrand = cardBrand;
    }

    /**
     * Getter for CardExpiration.
     * @return Returns the String
     */
    @JsonGetter("card_expiration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCardExpiration() {
        return cardExpiration;
    }

    /**
     * Setter for CardExpiration.
     * @param cardExpiration Value for String
     */
    @JsonSetter("card_expiration")
    public void setCardExpiration(String cardExpiration) {
        this.cardExpiration = cardExpiration;
    }

    /**
     * Internal Getter for LastFour.
     * @return Returns the Internal String
     */
    @JsonGetter("last_four")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetLastFour() {
        return this.lastFour;
    }

    /**
     * Getter for LastFour.
     * @return Returns the String
     */
    public String getLastFour() {
        return OptionalNullable.getFrom(lastFour);
    }

    /**
     * Setter for LastFour.
     * @param lastFour Value for String
     */
    @JsonSetter("last_four")
    public void setLastFour(String lastFour) {
        this.lastFour = OptionalNullable.of(lastFour);
    }

    /**
     * UnSetter for LastFour.
     */
    public void unsetLastFour() {
        lastFour = null;
    }

    /**
     * Getter for MaskedCardNumber.
     * @return Returns the String
     */
    @JsonGetter("masked_card_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMaskedCardNumber() {
        return maskedCardNumber;
    }

    /**
     * Setter for MaskedCardNumber.
     * @param maskedCardNumber Value for String
     */
    @JsonSetter("masked_card_number")
    public void setMaskedCardNumber(String maskedCardNumber) {
        this.maskedCardNumber = maskedCardNumber;
    }

    /**
     * Internal Getter for Details.
     * @return Returns the Internal String
     */
    @JsonGetter("details")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDetails() {
        return this.details;
    }

    /**
     * Getter for Details.
     * @return Returns the String
     */
    public String getDetails() {
        return OptionalNullable.getFrom(details);
    }

    /**
     * Setter for Details.
     * @param details Value for String
     */
    @JsonSetter("details")
    public void setDetails(String details) {
        this.details = OptionalNullable.of(details);
    }

    /**
     * UnSetter for Details.
     */
    public void unsetDetails() {
        details = null;
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
     * Internal Getter for Memo.
     * @return Returns the Internal String
     */
    @JsonGetter("memo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetMemo() {
        return this.memo;
    }

    /**
     * Getter for Memo.
     * @return Returns the String
     */
    public String getMemo() {
        return OptionalNullable.getFrom(memo);
    }

    /**
     * Setter for Memo.
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = OptionalNullable.of(memo);
    }

    /**
     * UnSetter for Memo.
     */
    public void unsetMemo() {
        memo = null;
    }

    /**
     * Getter for Email.
     * @return Returns the String
     */
    @JsonGetter("email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEmail() {
        return email;
    }

    /**
     * Setter for Email.
     * @param email Value for String
     */
    @JsonSetter("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Converts this InvoiceEventPayment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InvoiceEventPayment [" + "type=" + type + ", maskedAccountNumber="
                + maskedAccountNumber + ", maskedRoutingNumber=" + maskedRoutingNumber
                + ", cardBrand=" + cardBrand + ", cardExpiration=" + cardExpiration + ", lastFour="
                + lastFour + ", maskedCardNumber=" + maskedCardNumber + ", details=" + details
                + ", kind=" + kind + ", memo=" + memo + ", email=" + email
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link InvoiceEventPayment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InvoiceEventPayment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .type(getType())
                .maskedAccountNumber(getMaskedAccountNumber())
                .maskedRoutingNumber(getMaskedRoutingNumber())
                .cardBrand(getCardBrand())
                .cardExpiration(getCardExpiration())
                .maskedCardNumber(getMaskedCardNumber())
                .kind(getKind())
                .email(getEmail());
        builder.lastFour = internalGetLastFour();
        builder.details = internalGetDetails();
        builder.memo = internalGetMemo();
        return builder;
    }

    /**
     * Class to build instances of {@link InvoiceEventPayment}.
     */
    public static class Builder {
        private String type = "Invoice Event Payment";
        private String maskedAccountNumber;
        private String maskedRoutingNumber;
        private String cardBrand;
        private String cardExpiration;
        private OptionalNullable<String> lastFour;
        private String maskedCardNumber;
        private OptionalNullable<String> details;
        private String kind;
        private OptionalNullable<String> memo;
        private String email;



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
         * Setter for maskedAccountNumber.
         * @param  maskedAccountNumber  String value for maskedAccountNumber.
         * @return Builder
         */
        public Builder maskedAccountNumber(String maskedAccountNumber) {
            this.maskedAccountNumber = maskedAccountNumber;
            return this;
        }

        /**
         * Setter for maskedRoutingNumber.
         * @param  maskedRoutingNumber  String value for maskedRoutingNumber.
         * @return Builder
         */
        public Builder maskedRoutingNumber(String maskedRoutingNumber) {
            this.maskedRoutingNumber = maskedRoutingNumber;
            return this;
        }

        /**
         * Setter for cardBrand.
         * @param  cardBrand  String value for cardBrand.
         * @return Builder
         */
        public Builder cardBrand(String cardBrand) {
            this.cardBrand = cardBrand;
            return this;
        }

        /**
         * Setter for cardExpiration.
         * @param  cardExpiration  String value for cardExpiration.
         * @return Builder
         */
        public Builder cardExpiration(String cardExpiration) {
            this.cardExpiration = cardExpiration;
            return this;
        }

        /**
         * Setter for lastFour.
         * @param  lastFour  String value for lastFour.
         * @return Builder
         */
        public Builder lastFour(String lastFour) {
            this.lastFour = OptionalNullable.of(lastFour);
            return this;
        }

        /**
         * UnSetter for lastFour.
         * @return Builder
         */
        public Builder unsetLastFour() {
            lastFour = null;
            return this;
        }

        /**
         * Setter for maskedCardNumber.
         * @param  maskedCardNumber  String value for maskedCardNumber.
         * @return Builder
         */
        public Builder maskedCardNumber(String maskedCardNumber) {
            this.maskedCardNumber = maskedCardNumber;
            return this;
        }

        /**
         * Setter for details.
         * @param  details  String value for details.
         * @return Builder
         */
        public Builder details(String details) {
            this.details = OptionalNullable.of(details);
            return this;
        }

        /**
         * UnSetter for details.
         * @return Builder
         */
        public Builder unsetDetails() {
            details = null;
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
            this.memo = OptionalNullable.of(memo);
            return this;
        }

        /**
         * UnSetter for memo.
         * @return Builder
         */
        public Builder unsetMemo() {
            memo = null;
            return this;
        }

        /**
         * Setter for email.
         * @param  email  String value for email.
         * @return Builder
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * Builds a new {@link InvoiceEventPayment} object using the set fields.
         * @return {@link InvoiceEventPayment}
         */
        public InvoiceEventPayment build() {
            return new InvoiceEventPayment(type, maskedAccountNumber, maskedRoutingNumber,
                    cardBrand, cardExpiration, lastFour, maskedCardNumber, details, kind, memo,
                    email);
        }
    }
}
