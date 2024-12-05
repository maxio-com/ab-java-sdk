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
 * This is a model class for InvoiceAvataxDetails type.
 */
public class InvoiceAvataxDetails
        extends BaseModel {
    private OptionalNullable<Long> id;
    private OptionalNullable<String> status;
    private OptionalNullable<String> documentCode;
    private OptionalNullable<ZonedDateTime> commitDate;
    private OptionalNullable<ZonedDateTime> modifyDate;

    /**
     * Default constructor.
     */
    public InvoiceAvataxDetails() {
    }

    /**
     * Initialization constructor.
     * @param  id  Long value for id.
     * @param  status  String value for status.
     * @param  documentCode  String value for documentCode.
     * @param  commitDate  ZonedDateTime value for commitDate.
     * @param  modifyDate  ZonedDateTime value for modifyDate.
     */
    public InvoiceAvataxDetails(
            Long id,
            String status,
            String documentCode,
            ZonedDateTime commitDate,
            ZonedDateTime modifyDate) {
        this.id = OptionalNullable.of(id);
        this.status = OptionalNullable.of(status);
        this.documentCode = OptionalNullable.of(documentCode);
        this.commitDate = OptionalNullable.of(commitDate);
        this.modifyDate = OptionalNullable.of(modifyDate);
    }

    /**
     * Initialization constructor.
     * @param  id  Long value for id.
     * @param  status  String value for status.
     * @param  documentCode  String value for documentCode.
     * @param  commitDate  ZonedDateTime value for commitDate.
     * @param  modifyDate  ZonedDateTime value for modifyDate.
     */

    protected InvoiceAvataxDetails(OptionalNullable<Long> id, OptionalNullable<String> status,
            OptionalNullable<String> documentCode, OptionalNullable<ZonedDateTime> commitDate,
            OptionalNullable<ZonedDateTime> modifyDate) {
        this.id = id;
        this.status = status;
        this.documentCode = documentCode;
        this.commitDate = commitDate;
        this.modifyDate = modifyDate;
    }

    /**
     * Internal Getter for Id.
     * @return Returns the Internal Long
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Long> internalGetId() {
        return this.id;
    }

    /**
     * Getter for Id.
     * @return Returns the Long
     */
    public Long getId() {
        return OptionalNullable.getFrom(id);
    }

    /**
     * Setter for Id.
     * @param id Value for Long
     */
    @JsonSetter("id")
    public void setId(Long id) {
        this.id = OptionalNullable.of(id);
    }

    /**
     * UnSetter for Id.
     */
    public void unsetId() {
        id = null;
    }

    /**
     * Internal Getter for Status.
     * @return Returns the Internal String
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetStatus() {
        return this.status;
    }

    /**
     * Getter for Status.
     * @return Returns the String
     */
    public String getStatus() {
        return OptionalNullable.getFrom(status);
    }

    /**
     * Setter for Status.
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = OptionalNullable.of(status);
    }

    /**
     * UnSetter for Status.
     */
    public void unsetStatus() {
        status = null;
    }

    /**
     * Internal Getter for DocumentCode.
     * @return Returns the Internal String
     */
    @JsonGetter("document_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDocumentCode() {
        return this.documentCode;
    }

    /**
     * Getter for DocumentCode.
     * @return Returns the String
     */
    public String getDocumentCode() {
        return OptionalNullable.getFrom(documentCode);
    }

    /**
     * Setter for DocumentCode.
     * @param documentCode Value for String
     */
    @JsonSetter("document_code")
    public void setDocumentCode(String documentCode) {
        this.documentCode = OptionalNullable.of(documentCode);
    }

    /**
     * UnSetter for DocumentCode.
     */
    public void unsetDocumentCode() {
        documentCode = null;
    }

    /**
     * Internal Getter for CommitDate.
     * @return Returns the Internal ZonedDateTime
     */
    @JsonGetter("commit_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.ZonedRfc8601DateTimeSerializer.class)
    protected OptionalNullable<ZonedDateTime> internalGetCommitDate() {
        return this.commitDate;
    }

    /**
     * Getter for CommitDate.
     * @return Returns the ZonedDateTime
     */
    public ZonedDateTime getCommitDate() {
        return OptionalNullable.getFrom(commitDate);
    }

    /**
     * Setter for CommitDate.
     * @param commitDate Value for ZonedDateTime
     */
    @JsonSetter("commit_date")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCommitDate(ZonedDateTime commitDate) {
        this.commitDate = OptionalNullable.of(commitDate);
    }

    /**
     * UnSetter for CommitDate.
     */
    public void unsetCommitDate() {
        commitDate = null;
    }

    /**
     * Internal Getter for ModifyDate.
     * @return Returns the Internal ZonedDateTime
     */
    @JsonGetter("modify_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.ZonedRfc8601DateTimeSerializer.class)
    protected OptionalNullable<ZonedDateTime> internalGetModifyDate() {
        return this.modifyDate;
    }

    /**
     * Getter for ModifyDate.
     * @return Returns the ZonedDateTime
     */
    public ZonedDateTime getModifyDate() {
        return OptionalNullable.getFrom(modifyDate);
    }

    /**
     * Setter for ModifyDate.
     * @param modifyDate Value for ZonedDateTime
     */
    @JsonSetter("modify_date")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setModifyDate(ZonedDateTime modifyDate) {
        this.modifyDate = OptionalNullable.of(modifyDate);
    }

    /**
     * UnSetter for ModifyDate.
     */
    public void unsetModifyDate() {
        modifyDate = null;
    }

    /**
     * Converts this InvoiceAvataxDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InvoiceAvataxDetails [" + "id=" + id + ", status=" + status + ", documentCode="
                + documentCode + ", commitDate=" + commitDate + ", modifyDate=" + modifyDate
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link InvoiceAvataxDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InvoiceAvataxDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.id = internalGetId();
        builder.status = internalGetStatus();
        builder.documentCode = internalGetDocumentCode();
        builder.commitDate = internalGetCommitDate();
        builder.modifyDate = internalGetModifyDate();
        return builder;
    }

    /**
     * Class to build instances of {@link InvoiceAvataxDetails}.
     */
    public static class Builder {
        private OptionalNullable<Long> id;
        private OptionalNullable<String> status;
        private OptionalNullable<String> documentCode;
        private OptionalNullable<ZonedDateTime> commitDate;
        private OptionalNullable<ZonedDateTime> modifyDate;



        /**
         * Setter for id.
         * @param  id  Long value for id.
         * @return Builder
         */
        public Builder id(Long id) {
            this.id = OptionalNullable.of(id);
            return this;
        }

        /**
         * UnSetter for id.
         * @return Builder
         */
        public Builder unsetId() {
            id = null;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = OptionalNullable.of(status);
            return this;
        }

        /**
         * UnSetter for status.
         * @return Builder
         */
        public Builder unsetStatus() {
            status = null;
            return this;
        }

        /**
         * Setter for documentCode.
         * @param  documentCode  String value for documentCode.
         * @return Builder
         */
        public Builder documentCode(String documentCode) {
            this.documentCode = OptionalNullable.of(documentCode);
            return this;
        }

        /**
         * UnSetter for documentCode.
         * @return Builder
         */
        public Builder unsetDocumentCode() {
            documentCode = null;
            return this;
        }

        /**
         * Setter for commitDate.
         * @param  commitDate  ZonedDateTime value for commitDate.
         * @return Builder
         */
        public Builder commitDate(ZonedDateTime commitDate) {
            this.commitDate = OptionalNullable.of(commitDate);
            return this;
        }

        /**
         * UnSetter for commitDate.
         * @return Builder
         */
        public Builder unsetCommitDate() {
            commitDate = null;
            return this;
        }

        /**
         * Setter for modifyDate.
         * @param  modifyDate  ZonedDateTime value for modifyDate.
         * @return Builder
         */
        public Builder modifyDate(ZonedDateTime modifyDate) {
            this.modifyDate = OptionalNullable.of(modifyDate);
            return this;
        }

        /**
         * UnSetter for modifyDate.
         * @return Builder
         */
        public Builder unsetModifyDate() {
            modifyDate = null;
            return this;
        }

        /**
         * Builds a new {@link InvoiceAvataxDetails} object using the set fields.
         * @return {@link InvoiceAvataxDetails}
         */
        public InvoiceAvataxDetails build() {
            return new InvoiceAvataxDetails(id, status, documentCode, commitDate, modifyDate);
        }
    }
}
