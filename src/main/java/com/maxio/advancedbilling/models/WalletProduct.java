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
import java.util.List;

/**
 * This is a model class for WalletProduct type.
 */
public class WalletProduct
        extends BaseModel {
    private String name;
    private String unitName;
    private String handle;
    private OptionalNullable<String> description;
    private Boolean taxable;
    private OptionalNullable<String> taxCode;
    private OptionalNullable<String> accountingCode;
    private OptionalNullable<ItemCategory> itemCategory;
    private WalletProductPricePointAttributes pricePoint;
    private List<WalletProductPricePointAttributes> pricePoints;

    /**
     * Default constructor.
     */
    public WalletProduct() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  unitName  String value for unitName.
     * @param  handle  String value for handle.
     * @param  description  String value for description.
     * @param  taxable  Boolean value for taxable.
     * @param  taxCode  String value for taxCode.
     * @param  accountingCode  String value for accountingCode.
     * @param  itemCategory  ItemCategory value for itemCategory.
     * @param  pricePoint  WalletProductPricePointAttributes value for pricePoint.
     * @param  pricePoints  List of WalletProductPricePointAttributes value for pricePoints.
     */
    public WalletProduct(
            String name,
            String unitName,
            String handle,
            String description,
            Boolean taxable,
            String taxCode,
            String accountingCode,
            ItemCategory itemCategory,
            WalletProductPricePointAttributes pricePoint,
            List<WalletProductPricePointAttributes> pricePoints) {
        this.name = name;
        this.unitName = unitName;
        this.handle = handle;
        this.description = OptionalNullable.of(description);
        this.taxable = taxable;
        this.taxCode = OptionalNullable.of(taxCode);
        this.accountingCode = OptionalNullable.of(accountingCode);
        this.itemCategory = OptionalNullable.of(itemCategory);
        this.pricePoint = pricePoint;
        this.pricePoints = pricePoints;
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  unitName  String value for unitName.
     * @param  handle  String value for handle.
     * @param  description  String value for description.
     * @param  taxable  Boolean value for taxable.
     * @param  taxCode  String value for taxCode.
     * @param  accountingCode  String value for accountingCode.
     * @param  itemCategory  ItemCategory value for itemCategory.
     * @param  pricePoint  WalletProductPricePointAttributes value for pricePoint.
     * @param  pricePoints  List of WalletProductPricePointAttributes value for pricePoints.
     */

    protected WalletProduct(String name, String unitName, String handle,
            OptionalNullable<String> description, Boolean taxable, OptionalNullable<String> taxCode,
            OptionalNullable<String> accountingCode, OptionalNullable<ItemCategory> itemCategory,
            WalletProductPricePointAttributes pricePoint,
            List<WalletProductPricePointAttributes> pricePoints) {
        this.name = name;
        this.unitName = unitName;
        this.handle = handle;
        this.description = description;
        this.taxable = taxable;
        this.taxCode = taxCode;
        this.accountingCode = accountingCode;
        this.itemCategory = itemCategory;
        this.pricePoint = pricePoint;
        this.pricePoints = pricePoints;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
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
     * Getter for UnitName.
     * The name of the unit the Wallet Product's usage is measured in, for example `tokens`.
     * @return Returns the String
     */
    @JsonGetter("unit_name")
    public String getUnitName() {
        return unitName;
    }

    /**
     * Setter for UnitName.
     * The name of the unit the Wallet Product's usage is measured in, for example `tokens`.
     * @param unitName Value for String
     */
    @JsonSetter("unit_name")
    public void setUnitName(String unitName) {
        this.unitName = unitName;
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
     * Getter for PricePoint.
     * Creates one price point for the Wallet Product in the same call. Ignored if `price_points` is
     * also sent.
     * @return Returns the WalletProductPricePointAttributes
     */
    @JsonGetter("price_point")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public WalletProductPricePointAttributes getPricePoint() {
        return pricePoint;
    }

    /**
     * Setter for PricePoint.
     * Creates one price point for the Wallet Product in the same call. Ignored if `price_points` is
     * also sent.
     * @param pricePoint Value for WalletProductPricePointAttributes
     */
    @JsonSetter("price_point")
    public void setPricePoint(WalletProductPricePointAttributes pricePoint) {
        this.pricePoint = pricePoint;
    }

    /**
     * Getter for PricePoints.
     * Creates several price points for the Wallet Product in the same call, winning over
     * `price_point` if both are sent. The first price point created becomes the Wallet Product's
     * default. The whole call is one transaction: if any price point in the array fails validation,
     * nothing is created, including the Wallet Product itself.
     * @return Returns the List of WalletProductPricePointAttributes
     */
    @JsonGetter("price_points")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<WalletProductPricePointAttributes> getPricePoints() {
        return pricePoints;
    }

    /**
     * Setter for PricePoints.
     * Creates several price points for the Wallet Product in the same call, winning over
     * `price_point` if both are sent. The first price point created becomes the Wallet Product's
     * default. The whole call is one transaction: if any price point in the array fails validation,
     * nothing is created, including the Wallet Product itself.
     * @param pricePoints Value for List of WalletProductPricePointAttributes
     */
    @JsonSetter("price_points")
    public void setPricePoints(List<WalletProductPricePointAttributes> pricePoints) {
        this.pricePoints = pricePoints;
    }

    /**
     * Converts this WalletProduct into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "WalletProduct [" + "name=" + name + ", unitName=" + unitName + ", handle=" + handle
                + ", description=" + description + ", taxable=" + taxable + ", taxCode=" + taxCode
                + ", accountingCode=" + accountingCode + ", itemCategory=" + itemCategory
                + ", pricePoint=" + pricePoint + ", pricePoints=" + pricePoints
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link WalletProduct.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link WalletProduct.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, unitName)
                .handle(getHandle())
                .taxable(getTaxable())
                .pricePoint(getPricePoint())
                .pricePoints(getPricePoints());
        builder.description = internalGetDescription();
        builder.taxCode = internalGetTaxCode();
        builder.accountingCode = internalGetAccountingCode();
        builder.itemCategory = internalGetItemCategory();
        return builder;
    }

    /**
     * Class to build instances of {@link WalletProduct}.
     */
    public static class Builder {
        private String name;
        private String unitName;
        private String handle;
        private OptionalNullable<String> description;
        private Boolean taxable;
        private OptionalNullable<String> taxCode;
        private OptionalNullable<String> accountingCode;
        private OptionalNullable<ItemCategory> itemCategory;
        private WalletProductPricePointAttributes pricePoint;
        private List<WalletProductPricePointAttributes> pricePoints;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  unitName  String value for unitName.
         */
        public Builder(String name, String unitName) {
            this.name = name;
            this.unitName = unitName;
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
         * Setter for unitName.
         * @param  unitName  String value for unitName.
         * @return Builder
         */
        public Builder unitName(String unitName) {
            this.unitName = unitName;
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
         * Setter for pricePoint.
         * @param  pricePoint  WalletProductPricePointAttributes value for pricePoint.
         * @return Builder
         */
        public Builder pricePoint(WalletProductPricePointAttributes pricePoint) {
            this.pricePoint = pricePoint;
            return this;
        }

        /**
         * Setter for pricePoints.
         * @param  pricePoints  List of WalletProductPricePointAttributes value for pricePoints.
         * @return Builder
         */
        public Builder pricePoints(List<WalletProductPricePointAttributes> pricePoints) {
            this.pricePoints = pricePoints;
            return this;
        }

        /**
         * Builds a new {@link WalletProduct} object using the set fields.
         * @return {@link WalletProduct}
         */
        public WalletProduct build() {
            return new WalletProduct(name, unitName, handle, description, taxable, taxCode,
                    accountingCode, itemCategory, pricePoint, pricePoints);
        }
    }
}
