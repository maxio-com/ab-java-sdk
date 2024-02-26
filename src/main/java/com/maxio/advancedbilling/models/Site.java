/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for Site type.
 */
public class Site {
    private Integer id;
    private String name;
    private String subdomain;
    private String currency;
    private Integer sellerId;
    private List<String> nonPrimaryCurrencies;
    private Boolean relationshipInvoicingEnabled;
    private Boolean customerHierarchyEnabled;
    private Boolean whopaysEnabled;
    private String whopaysDefaultPayer;
    private AllocationSettings allocationSettings;
    private String defaultPaymentCollectionMethod;
    private OrganizationAddress organizationAddress;
    private TaxConfiguration taxConfiguration;
    private NetTerms netTerms;
    private Boolean test;

    /**
     * Default constructor.
     */
    public Site() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  name  String value for name.
     * @param  subdomain  String value for subdomain.
     * @param  currency  String value for currency.
     * @param  sellerId  Integer value for sellerId.
     * @param  nonPrimaryCurrencies  List of String value for nonPrimaryCurrencies.
     * @param  relationshipInvoicingEnabled  Boolean value for relationshipInvoicingEnabled.
     * @param  customerHierarchyEnabled  Boolean value for customerHierarchyEnabled.
     * @param  whopaysEnabled  Boolean value for whopaysEnabled.
     * @param  whopaysDefaultPayer  String value for whopaysDefaultPayer.
     * @param  allocationSettings  AllocationSettings value for allocationSettings.
     * @param  defaultPaymentCollectionMethod  String value for defaultPaymentCollectionMethod.
     * @param  organizationAddress  OrganizationAddress value for organizationAddress.
     * @param  taxConfiguration  TaxConfiguration value for taxConfiguration.
     * @param  netTerms  NetTerms value for netTerms.
     * @param  test  Boolean value for test.
     */
    public Site(
            Integer id,
            String name,
            String subdomain,
            String currency,
            Integer sellerId,
            List<String> nonPrimaryCurrencies,
            Boolean relationshipInvoicingEnabled,
            Boolean customerHierarchyEnabled,
            Boolean whopaysEnabled,
            String whopaysDefaultPayer,
            AllocationSettings allocationSettings,
            String defaultPaymentCollectionMethod,
            OrganizationAddress organizationAddress,
            TaxConfiguration taxConfiguration,
            NetTerms netTerms,
            Boolean test) {
        this.id = id;
        this.name = name;
        this.subdomain = subdomain;
        this.currency = currency;
        this.sellerId = sellerId;
        this.nonPrimaryCurrencies = nonPrimaryCurrencies;
        this.relationshipInvoicingEnabled = relationshipInvoicingEnabled;
        this.customerHierarchyEnabled = customerHierarchyEnabled;
        this.whopaysEnabled = whopaysEnabled;
        this.whopaysDefaultPayer = whopaysDefaultPayer;
        this.allocationSettings = allocationSettings;
        this.defaultPaymentCollectionMethod = defaultPaymentCollectionMethod;
        this.organizationAddress = organizationAddress;
        this.taxConfiguration = taxConfiguration;
        this.netTerms = netTerms;
        this.test = test;
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
     * Getter for Subdomain.
     * @return Returns the String
     */
    @JsonGetter("subdomain")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSubdomain() {
        return subdomain;
    }

    /**
     * Setter for Subdomain.
     * @param subdomain Value for String
     */
    @JsonSetter("subdomain")
    public void setSubdomain(String subdomain) {
        this.subdomain = subdomain;
    }

    /**
     * Getter for Currency.
     * @return Returns the String
     */
    @JsonGetter("currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * @param currency Value for String
     */
    @JsonSetter("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Getter for SellerId.
     * @return Returns the Integer
     */
    @JsonGetter("seller_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSellerId() {
        return sellerId;
    }

    /**
     * Setter for SellerId.
     * @param sellerId Value for Integer
     */
    @JsonSetter("seller_id")
    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * Getter for NonPrimaryCurrencies.
     * @return Returns the List of String
     */
    @JsonGetter("non_primary_currencies")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getNonPrimaryCurrencies() {
        return nonPrimaryCurrencies;
    }

    /**
     * Setter for NonPrimaryCurrencies.
     * @param nonPrimaryCurrencies Value for List of String
     */
    @JsonSetter("non_primary_currencies")
    public void setNonPrimaryCurrencies(List<String> nonPrimaryCurrencies) {
        this.nonPrimaryCurrencies = nonPrimaryCurrencies;
    }

    /**
     * Getter for RelationshipInvoicingEnabled.
     * @return Returns the Boolean
     */
    @JsonGetter("relationship_invoicing_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRelationshipInvoicingEnabled() {
        return relationshipInvoicingEnabled;
    }

    /**
     * Setter for RelationshipInvoicingEnabled.
     * @param relationshipInvoicingEnabled Value for Boolean
     */
    @JsonSetter("relationship_invoicing_enabled")
    public void setRelationshipInvoicingEnabled(Boolean relationshipInvoicingEnabled) {
        this.relationshipInvoicingEnabled = relationshipInvoicingEnabled;
    }

    /**
     * Getter for CustomerHierarchyEnabled.
     * @return Returns the Boolean
     */
    @JsonGetter("customer_hierarchy_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getCustomerHierarchyEnabled() {
        return customerHierarchyEnabled;
    }

    /**
     * Setter for CustomerHierarchyEnabled.
     * @param customerHierarchyEnabled Value for Boolean
     */
    @JsonSetter("customer_hierarchy_enabled")
    public void setCustomerHierarchyEnabled(Boolean customerHierarchyEnabled) {
        this.customerHierarchyEnabled = customerHierarchyEnabled;
    }

    /**
     * Getter for WhopaysEnabled.
     * @return Returns the Boolean
     */
    @JsonGetter("whopays_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getWhopaysEnabled() {
        return whopaysEnabled;
    }

    /**
     * Setter for WhopaysEnabled.
     * @param whopaysEnabled Value for Boolean
     */
    @JsonSetter("whopays_enabled")
    public void setWhopaysEnabled(Boolean whopaysEnabled) {
        this.whopaysEnabled = whopaysEnabled;
    }

    /**
     * Getter for WhopaysDefaultPayer.
     * @return Returns the String
     */
    @JsonGetter("whopays_default_payer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getWhopaysDefaultPayer() {
        return whopaysDefaultPayer;
    }

    /**
     * Setter for WhopaysDefaultPayer.
     * @param whopaysDefaultPayer Value for String
     */
    @JsonSetter("whopays_default_payer")
    public void setWhopaysDefaultPayer(String whopaysDefaultPayer) {
        this.whopaysDefaultPayer = whopaysDefaultPayer;
    }

    /**
     * Getter for AllocationSettings.
     * @return Returns the AllocationSettings
     */
    @JsonGetter("allocation_settings")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AllocationSettings getAllocationSettings() {
        return allocationSettings;
    }

    /**
     * Setter for AllocationSettings.
     * @param allocationSettings Value for AllocationSettings
     */
    @JsonSetter("allocation_settings")
    public void setAllocationSettings(AllocationSettings allocationSettings) {
        this.allocationSettings = allocationSettings;
    }

    /**
     * Getter for DefaultPaymentCollectionMethod.
     * @return Returns the String
     */
    @JsonGetter("default_payment_collection_method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDefaultPaymentCollectionMethod() {
        return defaultPaymentCollectionMethod;
    }

    /**
     * Setter for DefaultPaymentCollectionMethod.
     * @param defaultPaymentCollectionMethod Value for String
     */
    @JsonSetter("default_payment_collection_method")
    public void setDefaultPaymentCollectionMethod(String defaultPaymentCollectionMethod) {
        this.defaultPaymentCollectionMethod = defaultPaymentCollectionMethod;
    }

    /**
     * Getter for OrganizationAddress.
     * @return Returns the OrganizationAddress
     */
    @JsonGetter("organization_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OrganizationAddress getOrganizationAddress() {
        return organizationAddress;
    }

    /**
     * Setter for OrganizationAddress.
     * @param organizationAddress Value for OrganizationAddress
     */
    @JsonSetter("organization_address")
    public void setOrganizationAddress(OrganizationAddress organizationAddress) {
        this.organizationAddress = organizationAddress;
    }

    /**
     * Getter for TaxConfiguration.
     * @return Returns the TaxConfiguration
     */
    @JsonGetter("tax_configuration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TaxConfiguration getTaxConfiguration() {
        return taxConfiguration;
    }

    /**
     * Setter for TaxConfiguration.
     * @param taxConfiguration Value for TaxConfiguration
     */
    @JsonSetter("tax_configuration")
    public void setTaxConfiguration(TaxConfiguration taxConfiguration) {
        this.taxConfiguration = taxConfiguration;
    }

    /**
     * Getter for NetTerms.
     * @return Returns the NetTerms
     */
    @JsonGetter("net_terms")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public NetTerms getNetTerms() {
        return netTerms;
    }

    /**
     * Setter for NetTerms.
     * @param netTerms Value for NetTerms
     */
    @JsonSetter("net_terms")
    public void setNetTerms(NetTerms netTerms) {
        this.netTerms = netTerms;
    }

    /**
     * Getter for Test.
     * @return Returns the Boolean
     */
    @JsonGetter("test")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getTest() {
        return test;
    }

    /**
     * Setter for Test.
     * @param test Value for Boolean
     */
    @JsonSetter("test")
    public void setTest(Boolean test) {
        this.test = test;
    }

    /**
     * Converts this Site into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Site [" + "id=" + id + ", name=" + name + ", subdomain=" + subdomain + ", currency="
                + currency + ", sellerId=" + sellerId + ", nonPrimaryCurrencies="
                + nonPrimaryCurrencies + ", relationshipInvoicingEnabled="
                + relationshipInvoicingEnabled + ", customerHierarchyEnabled="
                + customerHierarchyEnabled + ", whopaysEnabled=" + whopaysEnabled
                + ", whopaysDefaultPayer=" + whopaysDefaultPayer + ", allocationSettings="
                + allocationSettings + ", defaultPaymentCollectionMethod="
                + defaultPaymentCollectionMethod + ", organizationAddress=" + organizationAddress
                + ", taxConfiguration=" + taxConfiguration + ", netTerms=" + netTerms + ", test="
                + test + "]";
    }

    /**
     * Builds a new {@link Site.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Site.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .name(getName())
                .subdomain(getSubdomain())
                .currency(getCurrency())
                .sellerId(getSellerId())
                .nonPrimaryCurrencies(getNonPrimaryCurrencies())
                .relationshipInvoicingEnabled(getRelationshipInvoicingEnabled())
                .customerHierarchyEnabled(getCustomerHierarchyEnabled())
                .whopaysEnabled(getWhopaysEnabled())
                .whopaysDefaultPayer(getWhopaysDefaultPayer())
                .allocationSettings(getAllocationSettings())
                .defaultPaymentCollectionMethod(getDefaultPaymentCollectionMethod())
                .organizationAddress(getOrganizationAddress())
                .taxConfiguration(getTaxConfiguration())
                .netTerms(getNetTerms())
                .test(getTest());
        return builder;
    }

    /**
     * Class to build instances of {@link Site}.
     */
    public static class Builder {
        private Integer id;
        private String name;
        private String subdomain;
        private String currency;
        private Integer sellerId;
        private List<String> nonPrimaryCurrencies;
        private Boolean relationshipInvoicingEnabled;
        private Boolean customerHierarchyEnabled;
        private Boolean whopaysEnabled;
        private String whopaysDefaultPayer;
        private AllocationSettings allocationSettings;
        private String defaultPaymentCollectionMethod;
        private OrganizationAddress organizationAddress;
        private TaxConfiguration taxConfiguration;
        private NetTerms netTerms;
        private Boolean test;



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
         * Setter for subdomain.
         * @param  subdomain  String value for subdomain.
         * @return Builder
         */
        public Builder subdomain(String subdomain) {
            this.subdomain = subdomain;
            return this;
        }

        /**
         * Setter for currency.
         * @param  currency  String value for currency.
         * @return Builder
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Setter for sellerId.
         * @param  sellerId  Integer value for sellerId.
         * @return Builder
         */
        public Builder sellerId(Integer sellerId) {
            this.sellerId = sellerId;
            return this;
        }

        /**
         * Setter for nonPrimaryCurrencies.
         * @param  nonPrimaryCurrencies  List of String value for nonPrimaryCurrencies.
         * @return Builder
         */
        public Builder nonPrimaryCurrencies(List<String> nonPrimaryCurrencies) {
            this.nonPrimaryCurrencies = nonPrimaryCurrencies;
            return this;
        }

        /**
         * Setter for relationshipInvoicingEnabled.
         * @param  relationshipInvoicingEnabled  Boolean value for relationshipInvoicingEnabled.
         * @return Builder
         */
        public Builder relationshipInvoicingEnabled(Boolean relationshipInvoicingEnabled) {
            this.relationshipInvoicingEnabled = relationshipInvoicingEnabled;
            return this;
        }

        /**
         * Setter for customerHierarchyEnabled.
         * @param  customerHierarchyEnabled  Boolean value for customerHierarchyEnabled.
         * @return Builder
         */
        public Builder customerHierarchyEnabled(Boolean customerHierarchyEnabled) {
            this.customerHierarchyEnabled = customerHierarchyEnabled;
            return this;
        }

        /**
         * Setter for whopaysEnabled.
         * @param  whopaysEnabled  Boolean value for whopaysEnabled.
         * @return Builder
         */
        public Builder whopaysEnabled(Boolean whopaysEnabled) {
            this.whopaysEnabled = whopaysEnabled;
            return this;
        }

        /**
         * Setter for whopaysDefaultPayer.
         * @param  whopaysDefaultPayer  String value for whopaysDefaultPayer.
         * @return Builder
         */
        public Builder whopaysDefaultPayer(String whopaysDefaultPayer) {
            this.whopaysDefaultPayer = whopaysDefaultPayer;
            return this;
        }

        /**
         * Setter for allocationSettings.
         * @param  allocationSettings  AllocationSettings value for allocationSettings.
         * @return Builder
         */
        public Builder allocationSettings(AllocationSettings allocationSettings) {
            this.allocationSettings = allocationSettings;
            return this;
        }

        /**
         * Setter for defaultPaymentCollectionMethod.
         * @param  defaultPaymentCollectionMethod  String value for defaultPaymentCollectionMethod.
         * @return Builder
         */
        public Builder defaultPaymentCollectionMethod(String defaultPaymentCollectionMethod) {
            this.defaultPaymentCollectionMethod = defaultPaymentCollectionMethod;
            return this;
        }

        /**
         * Setter for organizationAddress.
         * @param  organizationAddress  OrganizationAddress value for organizationAddress.
         * @return Builder
         */
        public Builder organizationAddress(OrganizationAddress organizationAddress) {
            this.organizationAddress = organizationAddress;
            return this;
        }

        /**
         * Setter for taxConfiguration.
         * @param  taxConfiguration  TaxConfiguration value for taxConfiguration.
         * @return Builder
         */
        public Builder taxConfiguration(TaxConfiguration taxConfiguration) {
            this.taxConfiguration = taxConfiguration;
            return this;
        }

        /**
         * Setter for netTerms.
         * @param  netTerms  NetTerms value for netTerms.
         * @return Builder
         */
        public Builder netTerms(NetTerms netTerms) {
            this.netTerms = netTerms;
            return this;
        }

        /**
         * Setter for test.
         * @param  test  Boolean value for test.
         * @return Builder
         */
        public Builder test(Boolean test) {
            this.test = test;
            return this;
        }

        /**
         * Builds a new {@link Site} object using the set fields.
         * @return {@link Site}
         */
        public Site build() {
            return new Site(id, name, subdomain, currency, sellerId, nonPrimaryCurrencies,
                    relationshipInvoicingEnabled, customerHierarchyEnabled, whopaysEnabled,
                    whopaysDefaultPayer, allocationSettings, defaultPaymentCollectionMethod,
                    organizationAddress, taxConfiguration, netTerms, test);
        }
    }
}
