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
import java.util.List;

/**
 * This is a model class for InvoiceDiscount type.
 */
public class InvoiceDiscount {
    private String uid;
    private String title;
    private OptionalNullable<String> description;
    private String code;
    private String sourceType;
    private Integer sourceId;
    private String discountType;
    private String percentage;
    private String eligibleAmount;
    private String discountAmount;
    private Integer transactionId;
    private List<InvoiceDiscountBreakout> lineItemBreakouts;

    /**
     * Default constructor.
     */
    public InvoiceDiscount() {
    }

    /**
     * Initialization constructor.
     * @param  uid  String value for uid.
     * @param  title  String value for title.
     * @param  description  String value for description.
     * @param  code  String value for code.
     * @param  sourceType  String value for sourceType.
     * @param  sourceId  Integer value for sourceId.
     * @param  discountType  String value for discountType.
     * @param  percentage  String value for percentage.
     * @param  eligibleAmount  String value for eligibleAmount.
     * @param  discountAmount  String value for discountAmount.
     * @param  transactionId  Integer value for transactionId.
     * @param  lineItemBreakouts  List of InvoiceDiscountBreakout value for lineItemBreakouts.
     */
    public InvoiceDiscount(
            String uid,
            String title,
            String description,
            String code,
            String sourceType,
            Integer sourceId,
            String discountType,
            String percentage,
            String eligibleAmount,
            String discountAmount,
            Integer transactionId,
            List<InvoiceDiscountBreakout> lineItemBreakouts) {
        this.uid = uid;
        this.title = title;
        this.description = OptionalNullable.of(description);
        this.code = code;
        this.sourceType = sourceType;
        this.sourceId = sourceId;
        this.discountType = discountType;
        this.percentage = percentage;
        this.eligibleAmount = eligibleAmount;
        this.discountAmount = discountAmount;
        this.transactionId = transactionId;
        this.lineItemBreakouts = lineItemBreakouts;
    }

    /**
     * Initialization constructor.
     * @param  uid  String value for uid.
     * @param  title  String value for title.
     * @param  description  String value for description.
     * @param  code  String value for code.
     * @param  sourceType  String value for sourceType.
     * @param  sourceId  Integer value for sourceId.
     * @param  discountType  String value for discountType.
     * @param  percentage  String value for percentage.
     * @param  eligibleAmount  String value for eligibleAmount.
     * @param  discountAmount  String value for discountAmount.
     * @param  transactionId  Integer value for transactionId.
     * @param  lineItemBreakouts  List of InvoiceDiscountBreakout value for lineItemBreakouts.
     */

    protected InvoiceDiscount(String uid, String title, OptionalNullable<String> description,
            String code, String sourceType, Integer sourceId, String discountType,
            String percentage, String eligibleAmount, String discountAmount, Integer transactionId,
            List<InvoiceDiscountBreakout> lineItemBreakouts) {
        this.uid = uid;
        this.title = title;
        this.description = description;
        this.code = code;
        this.sourceType = sourceType;
        this.sourceId = sourceId;
        this.discountType = discountType;
        this.percentage = percentage;
        this.eligibleAmount = eligibleAmount;
        this.discountAmount = discountAmount;
        this.transactionId = transactionId;
        this.lineItemBreakouts = lineItemBreakouts;
    }

    /**
     * Getter for Uid.
     * @return Returns the String
     */
    @JsonGetter("uid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUid() {
        return uid;
    }

    /**
     * Setter for Uid.
     * @param uid Value for String
     */
    @JsonSetter("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * Getter for Title.
     * @return Returns the String
     */
    @JsonGetter("title")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTitle() {
        return title;
    }

    /**
     * Setter for Title.
     * @param title Value for String
     */
    @JsonSetter("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Internal Getter for Description.
     * @return Returns the Internal String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDescription() {
        return this.description;
    }

    /**
     * Getter for Description.
     * @return Returns the String
     */
    public String getDescription() {
        return OptionalNullable.getFrom(description);
    }

    /**
     * Setter for Description.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = OptionalNullable.of(description);
    }

    /**
     * UnSetter for Description.
     */
    public void unsetDescription() {
        description = null;
    }

    /**
     * Getter for Code.
     * @return Returns the String
     */
    @JsonGetter("code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCode() {
        return code;
    }

    /**
     * Setter for Code.
     * @param code Value for String
     */
    @JsonSetter("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter for SourceType.
     * @return Returns the String
     */
    @JsonGetter("source_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSourceType() {
        return sourceType;
    }

    /**
     * Setter for SourceType.
     * @param sourceType Value for String
     */
    @JsonSetter("source_type")
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * Getter for SourceId.
     * @return Returns the Integer
     */
    @JsonGetter("source_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSourceId() {
        return sourceId;
    }

    /**
     * Setter for SourceId.
     * @param sourceId Value for Integer
     */
    @JsonSetter("source_id")
    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * Getter for DiscountType.
     * @return Returns the String
     */
    @JsonGetter("discount_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDiscountType() {
        return discountType;
    }

    /**
     * Setter for DiscountType.
     * @param discountType Value for String
     */
    @JsonSetter("discount_type")
    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    /**
     * Getter for Percentage.
     * @return Returns the String
     */
    @JsonGetter("percentage")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPercentage() {
        return percentage;
    }

    /**
     * Setter for Percentage.
     * @param percentage Value for String
     */
    @JsonSetter("percentage")
    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    /**
     * Getter for EligibleAmount.
     * @return Returns the String
     */
    @JsonGetter("eligible_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEligibleAmount() {
        return eligibleAmount;
    }

    /**
     * Setter for EligibleAmount.
     * @param eligibleAmount Value for String
     */
    @JsonSetter("eligible_amount")
    public void setEligibleAmount(String eligibleAmount) {
        this.eligibleAmount = eligibleAmount;
    }

    /**
     * Getter for DiscountAmount.
     * @return Returns the String
     */
    @JsonGetter("discount_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Setter for DiscountAmount.
     * @param discountAmount Value for String
     */
    @JsonSetter("discount_amount")
    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }

    /**
     * Getter for TransactionId.
     * @return Returns the Integer
     */
    @JsonGetter("transaction_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTransactionId() {
        return transactionId;
    }

    /**
     * Setter for TransactionId.
     * @param transactionId Value for Integer
     */
    @JsonSetter("transaction_id")
    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * Getter for LineItemBreakouts.
     * @return Returns the List of InvoiceDiscountBreakout
     */
    @JsonGetter("line_item_breakouts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<InvoiceDiscountBreakout> getLineItemBreakouts() {
        return lineItemBreakouts;
    }

    /**
     * Setter for LineItemBreakouts.
     * @param lineItemBreakouts Value for List of InvoiceDiscountBreakout
     */
    @JsonSetter("line_item_breakouts")
    public void setLineItemBreakouts(List<InvoiceDiscountBreakout> lineItemBreakouts) {
        this.lineItemBreakouts = lineItemBreakouts;
    }

    /**
     * Converts this InvoiceDiscount into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InvoiceDiscount [" + "uid=" + uid + ", title=" + title + ", description="
                + description + ", code=" + code + ", sourceType=" + sourceType + ", sourceId="
                + sourceId + ", discountType=" + discountType + ", percentage=" + percentage
                + ", eligibleAmount=" + eligibleAmount + ", discountAmount=" + discountAmount
                + ", transactionId=" + transactionId + ", lineItemBreakouts=" + lineItemBreakouts
                + "]";
    }

    /**
     * Builds a new {@link InvoiceDiscount.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InvoiceDiscount.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .uid(getUid())
                .title(getTitle())
                .code(getCode())
                .sourceType(getSourceType())
                .sourceId(getSourceId())
                .discountType(getDiscountType())
                .percentage(getPercentage())
                .eligibleAmount(getEligibleAmount())
                .discountAmount(getDiscountAmount())
                .transactionId(getTransactionId())
                .lineItemBreakouts(getLineItemBreakouts());
        builder.description = internalGetDescription();
        return builder;
    }

    /**
     * Class to build instances of {@link InvoiceDiscount}.
     */
    public static class Builder {
        private String uid;
        private String title;
        private OptionalNullable<String> description;
        private String code;
        private String sourceType;
        private Integer sourceId;
        private String discountType;
        private String percentage;
        private String eligibleAmount;
        private String discountAmount;
        private Integer transactionId;
        private List<InvoiceDiscountBreakout> lineItemBreakouts;



        /**
         * Setter for uid.
         * @param  uid  String value for uid.
         * @return Builder
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        /**
         * Setter for title.
         * @param  title  String value for title.
         * @return Builder
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = OptionalNullable.of(description);
            return this;
        }

        /**
         * UnSetter for description.
         * @return Builder
         */
        public Builder unsetDescription() {
            description = null;
            return this;
        }

        /**
         * Setter for code.
         * @param  code  String value for code.
         * @return Builder
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Setter for sourceType.
         * @param  sourceType  String value for sourceType.
         * @return Builder
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * Setter for sourceId.
         * @param  sourceId  Integer value for sourceId.
         * @return Builder
         */
        public Builder sourceId(Integer sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        /**
         * Setter for discountType.
         * @param  discountType  String value for discountType.
         * @return Builder
         */
        public Builder discountType(String discountType) {
            this.discountType = discountType;
            return this;
        }

        /**
         * Setter for percentage.
         * @param  percentage  String value for percentage.
         * @return Builder
         */
        public Builder percentage(String percentage) {
            this.percentage = percentage;
            return this;
        }

        /**
         * Setter for eligibleAmount.
         * @param  eligibleAmount  String value for eligibleAmount.
         * @return Builder
         */
        public Builder eligibleAmount(String eligibleAmount) {
            this.eligibleAmount = eligibleAmount;
            return this;
        }

        /**
         * Setter for discountAmount.
         * @param  discountAmount  String value for discountAmount.
         * @return Builder
         */
        public Builder discountAmount(String discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }

        /**
         * Setter for transactionId.
         * @param  transactionId  Integer value for transactionId.
         * @return Builder
         */
        public Builder transactionId(Integer transactionId) {
            this.transactionId = transactionId;
            return this;
        }

        /**
         * Setter for lineItemBreakouts.
         * @param  lineItemBreakouts  List of InvoiceDiscountBreakout value for lineItemBreakouts.
         * @return Builder
         */
        public Builder lineItemBreakouts(List<InvoiceDiscountBreakout> lineItemBreakouts) {
            this.lineItemBreakouts = lineItemBreakouts;
            return this;
        }

        /**
         * Builds a new {@link InvoiceDiscount} object using the set fields.
         * @return {@link InvoiceDiscount}
         */
        public InvoiceDiscount build() {
            return new InvoiceDiscount(uid, title, description, code, sourceType, sourceId,
                    discountType, percentage, eligibleAmount, discountAmount, transactionId,
                    lineItemBreakouts);
        }
    }
}
