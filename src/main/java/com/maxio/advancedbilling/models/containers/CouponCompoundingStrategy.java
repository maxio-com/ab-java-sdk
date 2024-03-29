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
import com.maxio.advancedbilling.models.CompoundingStrategy;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for any-of types.
 */
@JsonDeserialize(using = CouponCompoundingStrategy.CouponCompoundingStrategyDeserializer.class)
public abstract class CouponCompoundingStrategy {
    
    /**
     * This is Compounding Strategy case.
     * @param compoundingStrategy CompoundingStrategy value for compoundingStrategy.
     * @return The CompoundingStrategyCase object.
     */
    public static CouponCompoundingStrategy fromCompoundingStrategy(
            CompoundingStrategy compoundingStrategy) {
        return compoundingStrategy == null ? null : new CompoundingStrategyCase(compoundingStrategy);
    }

    /**
     * Method to match from the provided any-of cases.
     * @param <R> The type to return after applying callback.
     * @param cases The any-of type cases callback.
     * @return The any-of matched case.
     */
    public abstract <R> R match(Cases<R> cases);

    /**
     * This is interface for any-of cases.
     * @param <R> The type to return after applying callback.
     */
    public interface Cases<R> {
        R compoundingStrategy(CompoundingStrategy compoundingStrategy);
    }

    /**
     * This is a implementation class for CompoundingStrategyCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "CompoundingStrategy")
    private static class CompoundingStrategyCase extends CouponCompoundingStrategy {

        @JsonValue
        private CompoundingStrategy compoundingStrategy;

        CompoundingStrategyCase(CompoundingStrategy compoundingStrategy) {
            this.compoundingStrategy = compoundingStrategy;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.compoundingStrategy(this.compoundingStrategy);
        }

        @JsonCreator
        private CompoundingStrategyCase(JsonNode jsonNode) throws IOException {
            this.compoundingStrategy = 
                CompoundingStrategy.fromString(ApiHelper.deserialize(jsonNode, String.class));
            if (this.compoundingStrategy == null) {
                throw new IllegalArgumentException();
            }
        }

        @Override
        public String toString() {
            return compoundingStrategy.toString();
        }
    }

    /**
     * This is a custom deserializer class for CouponCompoundingStrategy.
     */
    protected static class CouponCompoundingStrategyDeserializer
            extends JsonDeserializer<CouponCompoundingStrategy> {

        @Override
        public CouponCompoundingStrategy deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(CompoundingStrategyCase.class), false);
        }
    }

}
