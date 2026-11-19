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
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for WalletProduct1 type.
 */
public class WalletProduct1
        extends BaseModel {
    private String name;
    private OptionalNullable<String> description;
    private Boolean taxable;
    private OptionalNullable<String> taxCode;
    private OptionalNullable<String> accountingCode;
    private OptionalNullable<ItemCategory> itemCategory;

    /**
     * Default constructor.
     */
    public WalletProduct1() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  description  String value for description.
     * @param  taxable  Boolean value for taxable.
     * @param  taxCode  String value for taxCode.
     * @param  accountingCode  String value for accountingCode.
     * @param  itemCategory  ItemCategory value for itemCategory.
     */
    public WalletProduct1(
            String name,
            String description,
            Boolean taxable,
            String taxCode,
            String accountingCode,
            ItemCategory itemCategory) {
        this.name = name;
        this.description = OptionalNullable.of(description);
        this.taxable = taxable;
        this.taxCode = OptionalNullable.of(taxCode);
        this.accountingCode = OptionalNullable.of(accountingCode);
        this.itemCategory = OptionalNullable.of(itemCategory);
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  description  String value for description.
     * @param  taxable  Boolean value for taxable.
     * @param  taxCode  String value for taxCode.
     * @param  accountingCode  String value for accountingCode.
     * @param  itemCategory  ItemCategory value for itemCategory.
     */

    protected WalletProduct1(String name, OptionalNullable<String> description, Boolean taxable,
            OptionalNullable<String> taxCode, OptionalNullable<String> accountingCode,
            OptionalNullable<ItemCategory> itemCategory) {
        this.name = name;
        this.description = description;
        this.taxable = taxable;
        this.taxCode = taxCode;
        this.accountingCode = accountingCode;
        this.itemCategory = itemCategory;
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
     * Getter for Taxable.
     * @return Returns the Boolean
     */
    @JsonGetter("taxable")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getTaxable() {
        return taxable;
    }

    /**
     * Setter for Taxable.
     * @param taxable Value for Boolean
     */
    @JsonSetter("taxable")
    public void setTaxable(Boolean taxable) {
        this.taxable = taxable;
    }

    /**
     * Internal Getter for TaxCode.
     * @return Returns the Internal String
     */
    @JsonGetter("tax_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetTaxCode() {
        return this.taxCode;
    }

    /**
     * Getter for TaxCode.
     * @return Returns the String
     */
    public String getTaxCode() {
        return OptionalNullable.getFrom(taxCode);
    }

    /**
     * Setter for TaxCode.
     * @param taxCode Value for String
     */
    @JsonSetter("tax_code")
    public void setTaxCode(String taxCode) {
        this.taxCode = OptionalNullable.of(taxCode);
    }

    /**
     * UnSetter for TaxCode.
     */
    public void unsetTaxCode() {
        taxCode = null;
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
     * Internal Getter for ItemCategory.
     * One of the following: Business Software, Consumer Software, Digital Services, Physical Goods,
     * Other
     * @return Returns the Internal ItemCategory
     */
    @JsonGetter("item_category")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<ItemCategory> internalGetItemCategory() {
        return this.itemCategory;
    }

    /**
     * Getter for ItemCategory.
     * One of the following: Business Software, Consumer Software, Digital Services, Physical Goods,
     * Other
     * @return Returns the ItemCategory
     */
    public ItemCategory getItemCategory() {
        return OptionalNullable.getFrom(itemCategory);
    }

    /**
     * Setter for ItemCategory.
     * One of the following: Business Software, Consumer Software, Digital Services, Physical Goods,
     * Other
     * @param itemCategory Value for ItemCategory
     */
    @JsonSetter("item_category")
    public void setItemCategory(ItemCategory itemCategory) {
        this.itemCategory = OptionalNullable.of(itemCategory);
    }

    /**
     * UnSetter for ItemCategory.
     * One of the following: Business Software, Consumer Software, Digital Services, Physical Goods,
     * Other
     */
    public void unsetItemCategory() {
        itemCategory = null;
    }

    /**
     * Converts this WalletProduct1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "WalletProduct1 [" + "name=" + name + ", description=" + description + ", taxable="
                + taxable + ", taxCode=" + taxCode + ", accountingCode=" + accountingCode
                + ", itemCategory=" + itemCategory + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link WalletProduct1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link WalletProduct1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .taxable(getTaxable());
        builder.description = internalGetDescription();
        builder.taxCode = internalGetTaxCode();
        builder.accountingCode = internalGetAccountingCode();
        builder.itemCategory = internalGetItemCategory();
        return builder;
    }

    /**
     * Class to build instances of {@link WalletProduct1}.
     */
    public static class Builder {
        private String name;
        private OptionalNullable<String> description;
        private Boolean taxable;
        private OptionalNullable<String> taxCode;
        private OptionalNullable<String> accountingCode;
        private OptionalNullable<ItemCategory> itemCategory;



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
         * Setter for taxable.
         * @param  taxable  Boolean value for taxable.
         * @return Builder
         */
        public Builder taxable(Boolean taxable) {
            this.taxable = taxable;
            return this;
        }

        /**
         * Setter for taxCode.
         * @param  taxCode  String value for taxCode.
         * @return Builder
         */
        public Builder taxCode(String taxCode) {
            this.taxCode = OptionalNullable.of(taxCode);
            return this;
        }

        /**
         * UnSetter for taxCode.
         * @return Builder
         */
        public Builder unsetTaxCode() {
            taxCode = null;
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
         * Setter for itemCategory.
         * @param  itemCategory  ItemCategory value for itemCategory.
         * @return Builder
         */
        public Builder itemCategory(ItemCategory itemCategory) {
            this.itemCategory = OptionalNullable.of(itemCategory);
            return this;
        }

        /**
         * UnSetter for itemCategory.
         * @return Builder
         */
        public Builder unsetItemCategory() {
            itemCategory = null;
            return this;
        }

        /**
         * Builds a new {@link WalletProduct1} object using the set fields.
         * @return {@link WalletProduct1}
         */
        public WalletProduct1 build() {
            return new WalletProduct1(name, description, taxable, taxCode, accountingCode,
                    itemCategory);
        }
    }
}
