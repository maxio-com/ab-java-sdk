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
 * This is a model class for ComponentAllocationErrorItem type.
 */
public class ComponentAllocationErrorItem {
    private Double componentId;
    private String message;
    private String kind;
    private String on;

    /**
     * Default constructor.
     */
    public ComponentAllocationErrorItem() {
    }

    /**
     * Initialization constructor.
     * @param  componentId  Double value for componentId.
     * @param  message  String value for message.
     * @param  kind  String value for kind.
     * @param  on  String value for on.
     */
    public ComponentAllocationErrorItem(
            Double componentId,
            String message,
            String kind,
            String on) {
        this.componentId = componentId;
        this.message = message;
        this.kind = kind;
        this.on = on;
    }

    /**
     * Getter for ComponentId.
     * @return Returns the Double
     */
    @JsonGetter("component_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getComponentId() {
        return componentId;
    }

    /**
     * Setter for ComponentId.
     * @param componentId Value for Double
     */
    @JsonSetter("component_id")
    public void setComponentId(Double componentId) {
        this.componentId = componentId;
    }

    /**
     * Getter for Message.
     * @return Returns the String
     */
    @JsonGetter("message")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMessage() {
        return message;
    }

    /**
     * Setter for Message.
     * @param message Value for String
     */
    @JsonSetter("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Getter for Kind.
     * @return Returns the String
     */
    @JsonGetter("kind")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getKind() {
        return kind;
    }

    /**
     * Setter for Kind.
     * @param kind Value for String
     */
    @JsonSetter("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * Getter for On.
     * @return Returns the String
     */
    @JsonGetter("on")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOn() {
        return on;
    }

    /**
     * Setter for On.
     * @param on Value for String
     */
    @JsonSetter("on")
    public void setOn(String on) {
        this.on = on;
    }

    /**
     * Converts this ComponentAllocationErrorItem into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ComponentAllocationErrorItem [" + "componentId=" + componentId + ", message="
                + message + ", kind=" + kind + ", on=" + on + "]";
    }

    /**
     * Builds a new {@link ComponentAllocationErrorItem.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ComponentAllocationErrorItem.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .componentId(getComponentId())
                .message(getMessage())
                .kind(getKind())
                .on(getOn());
        return builder;
    }

    /**
     * Class to build instances of {@link ComponentAllocationErrorItem}.
     */
    public static class Builder {
        private Double componentId;
        private String message;
        private String kind;
        private String on;



        /**
         * Setter for componentId.
         * @param  componentId  Double value for componentId.
         * @return Builder
         */
        public Builder componentId(Double componentId) {
            this.componentId = componentId;
            return this;
        }

        /**
         * Setter for message.
         * @param  message  String value for message.
         * @return Builder
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Setter for kind.
         * @param  kind  String value for kind.
         * @return Builder
         */
        public Builder kind(String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Setter for on.
         * @param  on  String value for on.
         * @return Builder
         */
        public Builder on(String on) {
            this.on = on;
            return this;
        }

        /**
         * Builds a new {@link ComponentAllocationErrorItem} object using the set fields.
         * @return {@link ComponentAllocationErrorItem}
         */
        public ComponentAllocationErrorItem build() {
            return new ComponentAllocationErrorItem(componentId, message, kind, on);
        }
    }
}
