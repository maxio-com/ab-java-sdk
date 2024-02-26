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
 * This is a model class for BulkComponentSPricePointAssignment type.
 */
public class BulkComponentSPricePointAssignment {
    private List<ComponentSPricePointAssignment> components;

    /**
     * Default constructor.
     */
    public BulkComponentSPricePointAssignment() {
    }

    /**
     * Initialization constructor.
     * @param  components  List of ComponentSPricePointAssignment value for components.
     */
    public BulkComponentSPricePointAssignment(
            List<ComponentSPricePointAssignment> components) {
        this.components = components;
    }

    /**
     * Getter for Components.
     * @return Returns the List of ComponentSPricePointAssignment
     */
    @JsonGetter("components")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ComponentSPricePointAssignment> getComponents() {
        return components;
    }

    /**
     * Setter for Components.
     * @param components Value for List of ComponentSPricePointAssignment
     */
    @JsonSetter("components")
    public void setComponents(List<ComponentSPricePointAssignment> components) {
        this.components = components;
    }

    /**
     * Converts this BulkComponentSPricePointAssignment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BulkComponentSPricePointAssignment [" + "components=" + components + "]";
    }

    /**
     * Builds a new {@link BulkComponentSPricePointAssignment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BulkComponentSPricePointAssignment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .components(getComponents());
        return builder;
    }

    /**
     * Class to build instances of {@link BulkComponentSPricePointAssignment}.
     */
    public static class Builder {
        private List<ComponentSPricePointAssignment> components;



        /**
         * Setter for components.
         * @param  components  List of ComponentSPricePointAssignment value for components.
         * @return Builder
         */
        public Builder components(List<ComponentSPricePointAssignment> components) {
            this.components = components;
            return this;
        }

        /**
         * Builds a new {@link BulkComponentSPricePointAssignment} object using the set fields.
         * @return {@link BulkComponentSPricePointAssignment}
         */
        public BulkComponentSPricePointAssignment build() {
            return new BulkComponentSPricePointAssignment(components);
        }
    }
}
