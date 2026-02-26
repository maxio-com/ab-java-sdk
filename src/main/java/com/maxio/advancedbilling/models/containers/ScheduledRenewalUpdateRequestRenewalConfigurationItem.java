/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models.containers;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.maxio.advancedbilling.ApiHelper;
import com.maxio.advancedbilling.models.ScheduledRenewalItemRequestBodyComponent;
import com.maxio.advancedbilling.models.ScheduledRenewalItemRequestBodyProduct;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = ScheduledRenewalUpdateRequestRenewalConfigurationItem.ScheduledRenewalUpdateRequestRenewalConfigurationItemDeserializer.class)
public abstract class ScheduledRenewalUpdateRequestRenewalConfigurationItem {
    
    /**
     * This is Scheduled Renewal Item Request Body Component case.
     * @param scheduledRenewalItemRequestBodyComponent ScheduledRenewalItemRequestBodyComponent value for scheduledRenewalItemRequestBodyComponent.
     * @return The ScheduledRenewalItemRequestBodyComponentCase object.
     */
    public static ScheduledRenewalUpdateRequestRenewalConfigurationItem fromScheduledRenewalItemRequestBodyComponent(
            ScheduledRenewalItemRequestBodyComponent scheduledRenewalItemRequestBodyComponent) {
        return scheduledRenewalItemRequestBodyComponent == null ? null : new ScheduledRenewalItemRequestBodyComponentCase(scheduledRenewalItemRequestBodyComponent);
    }

    /**
     * This is Scheduled Renewal Item Request Body Product case.
     * @param scheduledRenewalItemRequestBodyProduct ScheduledRenewalItemRequestBodyProduct value for scheduledRenewalItemRequestBodyProduct.
     * @return The ScheduledRenewalItemRequestBodyProductCase object.
     */
    public static ScheduledRenewalUpdateRequestRenewalConfigurationItem fromScheduledRenewalItemRequestBodyProduct(
            ScheduledRenewalItemRequestBodyProduct scheduledRenewalItemRequestBodyProduct) {
        return scheduledRenewalItemRequestBodyProduct == null ? null : new ScheduledRenewalItemRequestBodyProductCase(scheduledRenewalItemRequestBodyProduct);
    }

    /**
     * Method to match from the provided one-of cases.
     * @param <R> The type to return after applying callback.
     * @param cases The one-of type cases callback.
     * @return The one-of matched case.
     */
    public abstract <R> R match(Cases<R> cases);

    /**
     * This is interface for one-of cases.
     * @param <R> The type to return after applying callback.
     */
    public interface Cases<R> {
        R scheduledRenewalItemRequestBodyComponent(ScheduledRenewalItemRequestBodyComponent scheduledRenewalItemRequestBodyComponent);

        R scheduledRenewalItemRequestBodyProduct(ScheduledRenewalItemRequestBodyProduct scheduledRenewalItemRequestBodyProduct);
    }

    /**
     * This is a implementation class for ScheduledRenewalItemRequestBodyComponentCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "ScheduledRenewalItemRequestBodyComponent")
    private static class ScheduledRenewalItemRequestBodyComponentCase extends ScheduledRenewalUpdateRequestRenewalConfigurationItem {

        @JsonValue
        private ScheduledRenewalItemRequestBodyComponent scheduledRenewalItemRequestBodyComponent;

        ScheduledRenewalItemRequestBodyComponentCase(ScheduledRenewalItemRequestBodyComponent scheduledRenewalItemRequestBodyComponent) {
            this.scheduledRenewalItemRequestBodyComponent = scheduledRenewalItemRequestBodyComponent;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.scheduledRenewalItemRequestBodyComponent(this.scheduledRenewalItemRequestBodyComponent);
        }

        @JsonCreator
        private ScheduledRenewalItemRequestBodyComponentCase(JsonNode jsonNode) throws IOException {
            this.scheduledRenewalItemRequestBodyComponent = ApiHelper.deserialize(jsonNode,
                ScheduledRenewalItemRequestBodyComponent.class);
        }

        @Override
        public String toString() {
            return scheduledRenewalItemRequestBodyComponent.toString();
        }
    }

    /**
     * This is a implementation class for ScheduledRenewalItemRequestBodyProductCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "ScheduledRenewalItemRequestBodyProduct")
    private static class ScheduledRenewalItemRequestBodyProductCase extends ScheduledRenewalUpdateRequestRenewalConfigurationItem {

        @JsonValue
        private ScheduledRenewalItemRequestBodyProduct scheduledRenewalItemRequestBodyProduct;

        ScheduledRenewalItemRequestBodyProductCase(ScheduledRenewalItemRequestBodyProduct scheduledRenewalItemRequestBodyProduct) {
            this.scheduledRenewalItemRequestBodyProduct = scheduledRenewalItemRequestBodyProduct;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.scheduledRenewalItemRequestBodyProduct(this.scheduledRenewalItemRequestBodyProduct);
        }

        @JsonCreator
        private ScheduledRenewalItemRequestBodyProductCase(JsonNode jsonNode) throws IOException {
            this.scheduledRenewalItemRequestBodyProduct = ApiHelper.deserialize(jsonNode,
                ScheduledRenewalItemRequestBodyProduct.class);
        }

        @Override
        public String toString() {
            return scheduledRenewalItemRequestBodyProduct.toString();
        }
    }

    /**
     * This is a custom deserializer class for ScheduledRenewalUpdateRequestRenewalConfigurationItem.
     */
    protected static class ScheduledRenewalUpdateRequestRenewalConfigurationItemDeserializer
            extends JsonDeserializer<ScheduledRenewalUpdateRequestRenewalConfigurationItem> {

        @Override
        public ScheduledRenewalUpdateRequestRenewalConfigurationItem deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(
                    ScheduledRenewalItemRequestBodyComponentCase.class,
                    ScheduledRenewalItemRequestBodyProductCase.class), true);
        }
    }

}
