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
 * This is a model class for InvoiceDisplaySettings type.
 */
public class InvoiceDisplaySettings {
    private Boolean hideZeroSubtotalLines;
    private Boolean includeDiscountsOnLines;

    /**
     * Default constructor.
     */
    public InvoiceDisplaySettings() {
    }

    /**
     * Initialization constructor.
     * @param  hideZeroSubtotalLines  Boolean value for hideZeroSubtotalLines.
     * @param  includeDiscountsOnLines  Boolean value for includeDiscountsOnLines.
     */
    public InvoiceDisplaySettings(
            Boolean hideZeroSubtotalLines,
            Boolean includeDiscountsOnLines) {
        this.hideZeroSubtotalLines = hideZeroSubtotalLines;
        this.includeDiscountsOnLines = includeDiscountsOnLines;
    }

    /**
     * Getter for HideZeroSubtotalLines.
     * @return Returns the Boolean
     */
    @JsonGetter("hide_zero_subtotal_lines")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getHideZeroSubtotalLines() {
        return hideZeroSubtotalLines;
    }

    /**
     * Setter for HideZeroSubtotalLines.
     * @param hideZeroSubtotalLines Value for Boolean
     */
    @JsonSetter("hide_zero_subtotal_lines")
    public void setHideZeroSubtotalLines(Boolean hideZeroSubtotalLines) {
        this.hideZeroSubtotalLines = hideZeroSubtotalLines;
    }

    /**
     * Getter for IncludeDiscountsOnLines.
     * @return Returns the Boolean
     */
    @JsonGetter("include_discounts_on_lines")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIncludeDiscountsOnLines() {
        return includeDiscountsOnLines;
    }

    /**
     * Setter for IncludeDiscountsOnLines.
     * @param includeDiscountsOnLines Value for Boolean
     */
    @JsonSetter("include_discounts_on_lines")
    public void setIncludeDiscountsOnLines(Boolean includeDiscountsOnLines) {
        this.includeDiscountsOnLines = includeDiscountsOnLines;
    }

    /**
     * Converts this InvoiceDisplaySettings into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InvoiceDisplaySettings [" + "hideZeroSubtotalLines=" + hideZeroSubtotalLines
                + ", includeDiscountsOnLines=" + includeDiscountsOnLines + "]";
    }

    /**
     * Builds a new {@link InvoiceDisplaySettings.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InvoiceDisplaySettings.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .hideZeroSubtotalLines(getHideZeroSubtotalLines())
                .includeDiscountsOnLines(getIncludeDiscountsOnLines());
        return builder;
    }

    /**
     * Class to build instances of {@link InvoiceDisplaySettings}.
     */
    public static class Builder {
        private Boolean hideZeroSubtotalLines;
        private Boolean includeDiscountsOnLines;



        /**
         * Setter for hideZeroSubtotalLines.
         * @param  hideZeroSubtotalLines  Boolean value for hideZeroSubtotalLines.
         * @return Builder
         */
        public Builder hideZeroSubtotalLines(Boolean hideZeroSubtotalLines) {
            this.hideZeroSubtotalLines = hideZeroSubtotalLines;
            return this;
        }

        /**
         * Setter for includeDiscountsOnLines.
         * @param  includeDiscountsOnLines  Boolean value for includeDiscountsOnLines.
         * @return Builder
         */
        public Builder includeDiscountsOnLines(Boolean includeDiscountsOnLines) {
            this.includeDiscountsOnLines = includeDiscountsOnLines;
            return this;
        }

        /**
         * Builds a new {@link InvoiceDisplaySettings} object using the set fields.
         * @return {@link InvoiceDisplaySettings}
         */
        public InvoiceDisplaySettings build() {
            return new InvoiceDisplaySettings(hideZeroSubtotalLines, includeDiscountsOnLines);
        }
    }
}
