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
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = SubscriptionComponentPricePointType.SubscriptionComponentPricePointTypeDeserializer.class)
public abstract class SubscriptionComponentPricePointType {
    
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
        R pricePointType(PricePointType pricePointType);
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
            return ApiHelper.deserialize(node, Arrays.asList(PricePointTypeCase.class), true);
        }
    }

}
