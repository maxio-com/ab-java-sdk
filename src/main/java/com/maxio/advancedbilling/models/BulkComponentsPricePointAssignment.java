/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for BulkComponentsPricePointAssignment type.
 */
public class BulkComponentsPricePointAssignment
        extends BaseModel {
    private List<ComponentPricePointAssignment> components;

    /**
     * Default constructor.
     */
    public BulkComponentsPricePointAssignment() {
    }

    /**
     * Initialization constructor.
     * @param  components  List of ComponentPricePointAssignment value for components.
     */
    public BulkComponentsPricePointAssignment(
            List<ComponentPricePointAssignment> components) {
        this.components = components;
    }

    /**
     * Getter for Components.
     * @return Returns the List of ComponentPricePointAssignment
     */
    @JsonGetter("components")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ComponentPricePointAssignment> getComponents() {
        return components;
    }

    /**
     * Setter for Components.
     * @param components Value for List of ComponentPricePointAssignment
     */
    @JsonSetter("components")
    public void setComponents(List<ComponentPricePointAssignment> components) {
        this.components = components;
    }

    /**
     * Converts this BulkComponentsPricePointAssignment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BulkComponentsPricePointAssignment [" + "components=" + components
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link BulkComponentsPricePointAssignment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BulkComponentsPricePointAssignment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .components(getComponents());
        return builder;
    }

    /**
     * Class to build instances of {@link BulkComponentsPricePointAssignment}.
     */
    public static class Builder {
        private List<ComponentPricePointAssignment> components;



        /**
         * Setter for components.
         * @param  components  List of ComponentPricePointAssignment value for components.
         * @return Builder
         */
        public Builder components(List<ComponentPricePointAssignment> components) {
            this.components = components;
            return this;
        }

        /**
         * Builds a new {@link BulkComponentsPricePointAssignment} object using the set fields.
         * @return {@link BulkComponentsPricePointAssignment}
         */
        public BulkComponentsPricePointAssignment build() {
            return new BulkComponentsPricePointAssignment(components);
        }
    }
}
