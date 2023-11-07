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
 * This is a model class for ProductFamily type.
 */
public class ProductFamily {
    private Integer id;
    private String name;
    private String handle;
    private OptionalNullable<String> accountingCode;
    private OptionalNullable<String> description;
    private String createdAt;
    private String updatedAt;

    /**
     * Default constructor.
     */
    public ProductFamily() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  name  String value for name.
     * @param  handle  String value for handle.
     * @param  accountingCode  String value for accountingCode.
     * @param  description  String value for description.
     * @param  createdAt  String value for createdAt.
     * @param  updatedAt  String value for updatedAt.
     */
    public ProductFamily(
            Integer id,
            String name,
            String handle,
            String accountingCode,
            String description,
            String createdAt,
            String updatedAt) {
        this.id = id;
        this.name = name;
        this.handle = handle;
        this.accountingCode = OptionalNullable.of(accountingCode);
        this.description = OptionalNullable.of(description);
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  name  String value for name.
     * @param  handle  String value for handle.
     * @param  accountingCode  String value for accountingCode.
     * @param  description  String value for description.
     * @param  createdAt  String value for createdAt.
     * @param  updatedAt  String value for updatedAt.
     */

    protected ProductFamily(Integer id, String name, String handle,
            OptionalNullable<String> accountingCode, OptionalNullable<String> description,
            String createdAt, String updatedAt) {
        this.id = id;
        this.name = name;
        this.handle = handle;
        this.accountingCode = accountingCode;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for Id.
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Handle.
     * @return Returns the String
     */
    @JsonGetter("handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getHandle() {
        return handle;
    }

    /**
     * Setter for Handle.
     * @param handle Value for String
     */
    @JsonSetter("handle")
    public void setHandle(String handle) {
        this.handle = handle;
    }

    /**
     * Internal Getter for AccountingCode.
     * @return Returns the Internal String
     */
    @JsonGetter("accounting_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetAccountingCode() {
        return this.accountingCode;
    }

    /**
     * Getter for AccountingCode.
     * @return Returns the String
     */
    public String getAccountingCode() {
        return OptionalNullable.getFrom(accountingCode);
    }

    /**
     * Setter for AccountingCode.
     * @param accountingCode Value for String
     */
    @JsonSetter("accounting_code")
    public void setAccountingCode(String accountingCode) {
        this.accountingCode = OptionalNullable.of(accountingCode);
    }

    /**
     * UnSetter for AccountingCode.
     */
    public void unsetAccountingCode() {
        accountingCode = null;
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
     * Getter for UpdatedAt.
     * @return Returns the String
     */
    @JsonGetter("updated_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * @param updatedAt Value for String
     */
    @JsonSetter("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Converts this ProductFamily into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ProductFamily [" + "id=" + id + ", name=" + name + ", handle=" + handle
                + ", accountingCode=" + accountingCode + ", description=" + description
                + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
    }

    /**
     * Builds a new {@link ProductFamily.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ProductFamily.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .name(getName())
                .handle(getHandle())
                .createdAt(getCreatedAt())
                .updatedAt(getUpdatedAt());
        builder.accountingCode = internalGetAccountingCode();
        builder.description = internalGetDescription();
        return builder;
    }

    /**
     * Class to build instances of {@link ProductFamily}.
     */
    public static class Builder {
        private Integer id;
        private String name;
        private String handle;
        private OptionalNullable<String> accountingCode;
        private OptionalNullable<String> description;
        private String createdAt;
        private String updatedAt;



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
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for handle.
         * @param  handle  String value for handle.
         * @return Builder
         */
        public Builder handle(String handle) {
            this.handle = handle;
            return this;
        }

        /**
         * Setter for accountingCode.
         * @param  accountingCode  String value for accountingCode.
         * @return Builder
         */
        public Builder accountingCode(String accountingCode) {
            this.accountingCode = OptionalNullable.of(accountingCode);
            return this;
        }

        /**
         * UnSetter for accountingCode.
         * @return Builder
         */
        public Builder unsetAccountingCode() {
            accountingCode = null;
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
         * Setter for createdAt.
         * @param  createdAt  String value for createdAt.
         * @return Builder
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  String value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Builds a new {@link ProductFamily} object using the set fields.
         * @return {@link ProductFamily}
         */
        public ProductFamily build() {
            return new ProductFamily(id, name, handle, accountingCode, description, createdAt,
                    updatedAt);
        }
    }
}
