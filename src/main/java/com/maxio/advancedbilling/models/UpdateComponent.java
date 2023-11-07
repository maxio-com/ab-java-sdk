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
 * This is a model class for UpdateComponent type.
 */
public class UpdateComponent {
    private String handle;
    private String name;
    private OptionalNullable<String> description;
    private String accountingCode;
    private Boolean taxable;
    private OptionalNullable<String> taxCode;
    private ItemCategory itemCategory;
    private Boolean displayOnHostedPage;
    private CreditType upgradeCharge;

    /**
     * Default constructor.
     */
    public UpdateComponent() {
    }

    /**
     * Initialization constructor.
     * @param  handle  String value for handle.
     * @param  name  String value for name.
     * @param  description  String value for description.
     * @param  accountingCode  String value for accountingCode.
     * @param  taxable  Boolean value for taxable.
     * @param  taxCode  String value for taxCode.
     * @param  itemCategory  ItemCategory value for itemCategory.
     * @param  displayOnHostedPage  Boolean value for displayOnHostedPage.
     * @param  upgradeCharge  CreditType value for upgradeCharge.
     */
    public UpdateComponent(
            String handle,
            String name,
            String description,
            String accountingCode,
            Boolean taxable,
            String taxCode,
            ItemCategory itemCategory,
            Boolean displayOnHostedPage,
            CreditType upgradeCharge) {
        this.handle = handle;
        this.name = name;
        this.description = OptionalNullable.of(description);
        this.accountingCode = accountingCode;
        this.taxable = taxable;
        this.taxCode = OptionalNullable.of(taxCode);
        this.itemCategory = itemCategory;
        this.displayOnHostedPage = displayOnHostedPage;
        this.upgradeCharge = upgradeCharge;
    }

    /**
     * Initialization constructor.
     * @param  handle  String value for handle.
     * @param  name  String value for name.
     * @param  description  String value for description.
     * @param  accountingCode  String value for accountingCode.
     * @param  taxable  Boolean value for taxable.
     * @param  taxCode  String value for taxCode.
     * @param  itemCategory  ItemCategory value for itemCategory.
     * @param  displayOnHostedPage  Boolean value for displayOnHostedPage.
     * @param  upgradeCharge  CreditType value for upgradeCharge.
     */

    protected UpdateComponent(String handle, String name, OptionalNullable<String> description,
            String accountingCode, Boolean taxable, OptionalNullable<String> taxCode,
            ItemCategory itemCategory, Boolean displayOnHostedPage, CreditType upgradeCharge) {
        this.handle = handle;
        this.name = name;
        this.description = description;
        this.accountingCode = accountingCode;
        this.taxable = taxable;
        this.taxCode = taxCode;
        this.itemCategory = itemCategory;
        this.displayOnHostedPage = displayOnHostedPage;
        this.upgradeCharge = upgradeCharge;
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
     * Getter for Name.
     * The name of the Component, suitable for display on statements. i.e. Text Messages.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of the Component, suitable for display on statements. i.e. Text Messages.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Internal Getter for Description.
     * The description of the component.
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
     * The description of the component.
     * @return Returns the String
     */
    public String getDescription() {
        return OptionalNullable.getFrom(description);
    }

    /**
     * Setter for Description.
     * The description of the component.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = OptionalNullable.of(description);
    }

    /**
     * UnSetter for Description.
     * The description of the component.
     */
    public void unsetDescription() {
        description = null;
    }

    /**
     * Getter for AccountingCode.
     * @return Returns the String
     */
    @JsonGetter("accounting_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAccountingCode() {
        return accountingCode;
    }

    /**
     * Setter for AccountingCode.
     * @param accountingCode Value for String
     */
    @JsonSetter("accounting_code")
    public void setAccountingCode(String accountingCode) {
        this.accountingCode = accountingCode;
    }

    /**
     * Getter for Taxable.
     * Boolean flag describing whether a component is taxable or not.
     * @return Returns the Boolean
     */
    @JsonGetter("taxable")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getTaxable() {
        return taxable;
    }

    /**
     * Setter for Taxable.
     * Boolean flag describing whether a component is taxable or not.
     * @param taxable Value for Boolean
     */
    @JsonSetter("taxable")
    public void setTaxable(Boolean taxable) {
        this.taxable = taxable;
    }

    /**
     * Internal Getter for TaxCode.
     * A string representing the tax code related to the component type. This is especially
     * important when using the Avalara service to tax based on locale. This attribute has a max
     * length of 10 characters.
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
     * A string representing the tax code related to the component type. This is especially
     * important when using the Avalara service to tax based on locale. This attribute has a max
     * length of 10 characters.
     * @return Returns the String
     */
    public String getTaxCode() {
        return OptionalNullable.getFrom(taxCode);
    }

    /**
     * Setter for TaxCode.
     * A string representing the tax code related to the component type. This is especially
     * important when using the Avalara service to tax based on locale. This attribute has a max
     * length of 10 characters.
     * @param taxCode Value for String
     */
    @JsonSetter("tax_code")
    public void setTaxCode(String taxCode) {
        this.taxCode = OptionalNullable.of(taxCode);
    }

    /**
     * UnSetter for TaxCode.
     * A string representing the tax code related to the component type. This is especially
     * important when using the Avalara service to tax based on locale. This attribute has a max
     * length of 10 characters.
     */
    public void unsetTaxCode() {
        taxCode = null;
    }

    /**
     * Getter for ItemCategory.
     * One of the following: Business Software, Consumer Software, Digital Services, Physical Goods,
     * Other
     * @return Returns the ItemCategory
     */
    @JsonGetter("item_category")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ItemCategory getItemCategory() {
        return itemCategory;
    }

    /**
     * Setter for ItemCategory.
     * One of the following: Business Software, Consumer Software, Digital Services, Physical Goods,
     * Other
     * @param itemCategory Value for ItemCategory
     */
    @JsonSetter("item_category")
    public void setItemCategory(ItemCategory itemCategory) {
        this.itemCategory = itemCategory;
    }

    /**
     * Getter for DisplayOnHostedPage.
     * @return Returns the Boolean
     */
    @JsonGetter("display_on_hosted_page")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDisplayOnHostedPage() {
        return displayOnHostedPage;
    }

    /**
     * Setter for DisplayOnHostedPage.
     * @param displayOnHostedPage Value for Boolean
     */
    @JsonSetter("display_on_hosted_page")
    public void setDisplayOnHostedPage(Boolean displayOnHostedPage) {
        this.displayOnHostedPage = displayOnHostedPage;
    }

    /**
     * Getter for UpgradeCharge.
     * The type of charge to be applied when a component is upgraded. Valid values are: `prorated`,
     * `full`, `none`.
     * @return Returns the CreditType
     */
    @JsonGetter("upgrade_charge")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreditType getUpgradeCharge() {
        return upgradeCharge;
    }

    /**
     * Setter for UpgradeCharge.
     * The type of charge to be applied when a component is upgraded. Valid values are: `prorated`,
     * `full`, `none`.
     * @param upgradeCharge Value for CreditType
     */
    @JsonSetter("upgrade_charge")
    public void setUpgradeCharge(CreditType upgradeCharge) {
        this.upgradeCharge = upgradeCharge;
    }

    /**
     * Converts this UpdateComponent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateComponent [" + "handle=" + handle + ", name=" + name + ", description="
                + description + ", accountingCode=" + accountingCode + ", taxable=" + taxable
                + ", taxCode=" + taxCode + ", itemCategory=" + itemCategory
                + ", displayOnHostedPage=" + displayOnHostedPage + ", upgradeCharge="
                + upgradeCharge + "]";
    }

    /**
     * Builds a new {@link UpdateComponent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateComponent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .handle(getHandle())
                .name(getName())
                .accountingCode(getAccountingCode())
                .taxable(getTaxable())
                .itemCategory(getItemCategory())
                .displayOnHostedPage(getDisplayOnHostedPage())
                .upgradeCharge(getUpgradeCharge());
        builder.description = internalGetDescription();
        builder.taxCode = internalGetTaxCode();
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateComponent}.
     */
    public static class Builder {
        private String handle;
        private String name;
        private OptionalNullable<String> description;
        private String accountingCode;
        private Boolean taxable;
        private OptionalNullable<String> taxCode;
        private ItemCategory itemCategory;
        private Boolean displayOnHostedPage;
        private CreditType upgradeCharge;



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
         * Setter for accountingCode.
         * @param  accountingCode  String value for accountingCode.
         * @return Builder
         */
        public Builder accountingCode(String accountingCode) {
            this.accountingCode = accountingCode;
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
         * Setter for itemCategory.
         * @param  itemCategory  ItemCategory value for itemCategory.
         * @return Builder
         */
        public Builder itemCategory(ItemCategory itemCategory) {
            this.itemCategory = itemCategory;
            return this;
        }

        /**
         * Setter for displayOnHostedPage.
         * @param  displayOnHostedPage  Boolean value for displayOnHostedPage.
         * @return Builder
         */
        public Builder displayOnHostedPage(Boolean displayOnHostedPage) {
            this.displayOnHostedPage = displayOnHostedPage;
            return this;
        }

        /**
         * Setter for upgradeCharge.
         * @param  upgradeCharge  CreditType value for upgradeCharge.
         * @return Builder
         */
        public Builder upgradeCharge(CreditType upgradeCharge) {
            this.upgradeCharge = upgradeCharge;
            return this;
        }

        /**
         * Builds a new {@link UpdateComponent} object using the set fields.
         * @return {@link UpdateComponent}
         */
        public UpdateComponent build() {
            return new UpdateComponent(handle, name, description, accountingCode, taxable, taxCode,
                    itemCategory, displayOnHostedPage, upgradeCharge);
        }
    }
}
