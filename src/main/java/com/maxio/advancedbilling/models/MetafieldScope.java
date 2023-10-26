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
 * This is a model class for MetafieldScope type.
 */
public class MetafieldScope {
    private IncludeOption csv;
    private IncludeOption invoices;
    private IncludeOption statements;
    private IncludeOption portal;
    private IncludeOption publicShow;
    private IncludeOption publicEdit;
    private List<String> hosted;

    /**
     * Default constructor.
     */
    public MetafieldScope() {
    }

    /**
     * Initialization constructor.
     * @param  csv  IncludeOption value for csv.
     * @param  invoices  IncludeOption value for invoices.
     * @param  statements  IncludeOption value for statements.
     * @param  portal  IncludeOption value for portal.
     * @param  publicShow  IncludeOption value for publicShow.
     * @param  publicEdit  IncludeOption value for publicEdit.
     * @param  hosted  List of String value for hosted.
     */
    public MetafieldScope(
            IncludeOption csv,
            IncludeOption invoices,
            IncludeOption statements,
            IncludeOption portal,
            IncludeOption publicShow,
            IncludeOption publicEdit,
            List<String> hosted) {
        this.csv = csv;
        this.invoices = invoices;
        this.statements = statements;
        this.portal = portal;
        this.publicShow = publicShow;
        this.publicEdit = publicEdit;
        this.hosted = hosted;
    }

    /**
     * Getter for Csv.
     * Include (1) or exclude (0) metafields from the csv export.
     * @return Returns the IncludeOption
     */
    @JsonGetter("csv")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public IncludeOption getCsv() {
        return csv;
    }

    /**
     * Setter for Csv.
     * Include (1) or exclude (0) metafields from the csv export.
     * @param csv Value for IncludeOption
     */
    @JsonSetter("csv")
    public void setCsv(IncludeOption csv) {
        this.csv = csv;
    }

    /**
     * Getter for Invoices.
     * Include (1) or exclude (0) metafields from invoices.
     * @return Returns the IncludeOption
     */
    @JsonGetter("invoices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public IncludeOption getInvoices() {
        return invoices;
    }

    /**
     * Setter for Invoices.
     * Include (1) or exclude (0) metafields from invoices.
     * @param invoices Value for IncludeOption
     */
    @JsonSetter("invoices")
    public void setInvoices(IncludeOption invoices) {
        this.invoices = invoices;
    }

    /**
     * Getter for Statements.
     * Include (1) or exclude (0) metafields from statements.
     * @return Returns the IncludeOption
     */
    @JsonGetter("statements")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public IncludeOption getStatements() {
        return statements;
    }

    /**
     * Setter for Statements.
     * Include (1) or exclude (0) metafields from statements.
     * @param statements Value for IncludeOption
     */
    @JsonSetter("statements")
    public void setStatements(IncludeOption statements) {
        this.statements = statements;
    }

    /**
     * Getter for Portal.
     * Include (1) or exclude (0) metafields from the portal.
     * @return Returns the IncludeOption
     */
    @JsonGetter("portal")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public IncludeOption getPortal() {
        return portal;
    }

    /**
     * Setter for Portal.
     * Include (1) or exclude (0) metafields from the portal.
     * @param portal Value for IncludeOption
     */
    @JsonSetter("portal")
    public void setPortal(IncludeOption portal) {
        this.portal = portal;
    }

    /**
     * Getter for PublicShow.
     * Include (1) or exclude (0) metafields from being viewable by your ecosystem.
     * @return Returns the IncludeOption
     */
    @JsonGetter("public_show")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public IncludeOption getPublicShow() {
        return publicShow;
    }

    /**
     * Setter for PublicShow.
     * Include (1) or exclude (0) metafields from being viewable by your ecosystem.
     * @param publicShow Value for IncludeOption
     */
    @JsonSetter("public_show")
    public void setPublicShow(IncludeOption publicShow) {
        this.publicShow = publicShow;
    }

    /**
     * Getter for PublicEdit.
     * Include (1) or exclude (0) metafields from being edited by your ecosystem.
     * @return Returns the IncludeOption
     */
    @JsonGetter("public_edit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public IncludeOption getPublicEdit() {
        return publicEdit;
    }

    /**
     * Setter for PublicEdit.
     * Include (1) or exclude (0) metafields from being edited by your ecosystem.
     * @param publicEdit Value for IncludeOption
     */
    @JsonSetter("public_edit")
    public void setPublicEdit(IncludeOption publicEdit) {
        this.publicEdit = publicEdit;
    }

    /**
     * Getter for Hosted.
     * @return Returns the List of String
     */
    @JsonGetter("hosted")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getHosted() {
        return hosted;
    }

    /**
     * Setter for Hosted.
     * @param hosted Value for List of String
     */
    @JsonSetter("hosted")
    public void setHosted(List<String> hosted) {
        this.hosted = hosted;
    }

    /**
     * Converts this MetafieldScope into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MetafieldScope [" + "csv=" + csv + ", invoices=" + invoices + ", statements="
                + statements + ", portal=" + portal + ", publicShow=" + publicShow + ", publicEdit="
                + publicEdit + ", hosted=" + hosted + "]";
    }

    /**
     * Builds a new {@link MetafieldScope.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MetafieldScope.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .csv(getCsv())
                .invoices(getInvoices())
                .statements(getStatements())
                .portal(getPortal())
                .publicShow(getPublicShow())
                .publicEdit(getPublicEdit())
                .hosted(getHosted());
        return builder;
    }

    /**
     * Class to build instances of {@link MetafieldScope}.
     */
    public static class Builder {
        private IncludeOption csv;
        private IncludeOption invoices;
        private IncludeOption statements;
        private IncludeOption portal;
        private IncludeOption publicShow;
        private IncludeOption publicEdit;
        private List<String> hosted;



        /**
         * Setter for csv.
         * @param  csv  IncludeOption value for csv.
         * @return Builder
         */
        public Builder csv(IncludeOption csv) {
            this.csv = csv;
            return this;
        }

        /**
         * Setter for invoices.
         * @param  invoices  IncludeOption value for invoices.
         * @return Builder
         */
        public Builder invoices(IncludeOption invoices) {
            this.invoices = invoices;
            return this;
        }

        /**
         * Setter for statements.
         * @param  statements  IncludeOption value for statements.
         * @return Builder
         */
        public Builder statements(IncludeOption statements) {
            this.statements = statements;
            return this;
        }

        /**
         * Setter for portal.
         * @param  portal  IncludeOption value for portal.
         * @return Builder
         */
        public Builder portal(IncludeOption portal) {
            this.portal = portal;
            return this;
        }

        /**
         * Setter for publicShow.
         * @param  publicShow  IncludeOption value for publicShow.
         * @return Builder
         */
        public Builder publicShow(IncludeOption publicShow) {
            this.publicShow = publicShow;
            return this;
        }

        /**
         * Setter for publicEdit.
         * @param  publicEdit  IncludeOption value for publicEdit.
         * @return Builder
         */
        public Builder publicEdit(IncludeOption publicEdit) {
            this.publicEdit = publicEdit;
            return this;
        }

        /**
         * Setter for hosted.
         * @param  hosted  List of String value for hosted.
         * @return Builder
         */
        public Builder hosted(List<String> hosted) {
            this.hosted = hosted;
            return this;
        }

        /**
         * Builds a new {@link MetafieldScope} object using the set fields.
         * @return {@link MetafieldScope}
         */
        public MetafieldScope build() {
            return new MetafieldScope(csv, invoices, statements, portal, publicShow, publicEdit,
                    hosted);
        }
    }
}
