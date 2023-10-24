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
import com.maxio.advancedbilling.models.PricePointType;
import com.maxio.advancedbilling.models.PricePointTypeOneOf0;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = SubscriptionComponentPricePointType.SubscriptionComponentPricePointTypeDeserializer.class)
public abstract class SubscriptionComponentPricePointType {
    
    /**
     * This is PricePointType_OneOf0 case.
     * @param pricePointTypeOneOf0 PricePointTypeOneOf0 value for pricePointTypeOneOf0.
     * @return The PricePointTypeOneOf0Case object.
     */
    public static SubscriptionComponentPricePointType fromPricePointTypeOneOf0(
            PricePointTypeOneOf0 pricePointTypeOneOf0) {
        return pricePointTypeOneOf0 == null ? null : new PricePointTypeOneOf0Case(pricePointTypeOneOf0);
    }

    /**
     * This is Price Point Type case.
     * @param pricePointType PricePointType value for pricePointType.
     * @return The PricePointTypeCase object.
     */
    public static SubscriptionComponentPricePointType fromPricePointType(
            PricePointType pricePointType) {
        return pricePointType == null ? null : new PricePointTypeCase(pricePointType);
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
        R pricePointTypeOneOf0(PricePointTypeOneOf0 pricePointTypeOneOf0);

        R pricePointType(PricePointType pricePointType);
    }

    /**
     * This is a implementation class for PricePointTypeOneOf0Case.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "PricePointTypeOneOf0")
    private static class PricePointTypeOneOf0Case extends SubscriptionComponentPricePointType {

        @JsonValue
        private PricePointTypeOneOf0 pricePointTypeOneOf0;

        PricePointTypeOneOf0Case(PricePointTypeOneOf0 pricePointTypeOneOf0) {
            this.pricePointTypeOneOf0 = pricePointTypeOneOf0;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.pricePointTypeOneOf0(this.pricePointTypeOneOf0);
        }

        @JsonCreator
        private PricePointTypeOneOf0Case(JsonNode jsonNode) throws IOException {
            this.pricePointTypeOneOf0 = ApiHelper.deserialize(jsonNode,
                PricePointTypeOneOf0.class);
        }

        @Override
        public String toString() {
            return pricePointTypeOneOf0.toString();
        }
    }

    /**
     * This is a implementation class for PricePointTypeCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "PricePointType")
    private static class PricePointTypeCase extends SubscriptionComponentPricePointType {

        @JsonValue
        private PricePointType pricePointType;

        PricePointTypeCase(PricePointType pricePointType) {
            this.pricePointType = pricePointType;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.pricePointType(this.pricePointType);
        }

        @JsonCreator
        private PricePointTypeCase(JsonNode jsonNode) throws IOException {
            this.pricePointType = 
                PricePointType.fromString(ApiHelper.deserialize(jsonNode, String.class));
            if (this.pricePointType == null) {
                throw new IllegalArgumentException();
            }
        }

        @Override
        public String toString() {
            return pricePointType.toString();
        }
    }

    /**
     * This is a custom deserializer class for SubscriptionComponentPricePointType.
     */
    protected static class SubscriptionComponentPricePointTypeDeserializer
            extends JsonDeserializer<SubscriptionComponentPricePointType> {

        @Override
        public SubscriptionComponentPricePointType deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(PricePointTypeOneOf0Case.class,
                    PricePointTypeCase.class), true);
        }
    }

}
