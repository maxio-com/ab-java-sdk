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
import com.maxio.advancedbilling.models.PricingScheme;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = SubscriptionGroupComponentCustomPricePricingScheme.SubscriptionGroupComponentCustomPricePricingSchemeDeserializer.class)
public abstract class SubscriptionGroupComponentCustomPricePricingScheme {
    
    /**
     * This is Pricing Scheme case.
     * @param pricingScheme PricingScheme value for pricingScheme.
     * @return The PricingSchemeCase object.
     */
    public static SubscriptionGroupComponentCustomPricePricingScheme fromPricingScheme(
            PricingScheme pricingScheme) {
        return pricingScheme == null ? null : new PricingSchemeCase(pricingScheme);
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
        R pricingScheme(PricingScheme pricingScheme);
    }

    /**
     * This is a implementation class for PricingSchemeCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "PricingScheme")
    private static class PricingSchemeCase extends SubscriptionGroupComponentCustomPricePricingScheme {

        @JsonValue
        private PricingScheme pricingScheme;

        PricingSchemeCase(PricingScheme pricingScheme) {
            this.pricingScheme = pricingScheme;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.pricingScheme(this.pricingScheme);
        }

        @JsonCreator
        private PricingSchemeCase(JsonNode jsonNode) throws IOException {
            this.pricingScheme = 
                PricingScheme.fromString(ApiHelper.deserialize(jsonNode, String.class));
            if (this.pricingScheme == null) {
                throw new IllegalArgumentException();
            }
        }

        @Override
        public String toString() {
            return pricingScheme.toString();
        }
    }

    /**
     * This is a custom deserializer class for SubscriptionGroupComponentCustomPricePricingScheme.
     */
    protected static class SubscriptionGroupComponentCustomPricePricingSchemeDeserializer
            extends JsonDeserializer<SubscriptionGroupComponentCustomPricePricingScheme> {

        @Override
        public SubscriptionGroupComponentCustomPricePricingScheme deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(PricingSchemeCase.class), true);
        }
    }

}
