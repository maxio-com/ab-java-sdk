/*
 * MaxioAdvancedBillingFormerlyChargifyAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.chargify.subdomain.models.containers;

import com.chargify.subdomain.ApiHelper;
import com.chargify.subdomain.models.CompoundingStrategyEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = CreateOrUpdateFlatAmountCouponCompoundingStrategy.CreateOrUpdateFlatAmountCouponCompoundingStrategyDeserializer.class)
public abstract class CreateOrUpdateFlatAmountCouponCompoundingStrategy {
    
    /**
     * This is Compounding Strategy case.
     * @param compoundingStrategy CompoundingStrategyEnum value for compoundingStrategy.
     * @return The CompoundingStrategyCase object.
     */
    public static CreateOrUpdateFlatAmountCouponCompoundingStrategy fromCompoundingStrategy(
            CompoundingStrategyEnum compoundingStrategy) {
        return compoundingStrategy == null ? null : new CompoundingStrategyCase(compoundingStrategy);
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
        R compoundingStrategy(CompoundingStrategyEnum compoundingStrategy);
    }

    /**
     * This is a implementation class for CompoundingStrategyCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "CompoundingStrategyEnum")
    private static class CompoundingStrategyCase extends CreateOrUpdateFlatAmountCouponCompoundingStrategy {

        @JsonValue
        private CompoundingStrategyEnum compoundingStrategy;

        CompoundingStrategyCase(CompoundingStrategyEnum compoundingStrategy) {
            this.compoundingStrategy = compoundingStrategy;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.compoundingStrategy(this.compoundingStrategy);
        }

        @JsonCreator
        private CompoundingStrategyCase(JsonNode jsonNode) throws IOException {
            this.compoundingStrategy = 
                CompoundingStrategyEnum.fromString(ApiHelper.deserialize(jsonNode, String.class));
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
     * This is a custom deserializer class for CreateOrUpdateFlatAmountCouponCompoundingStrategy.
     */
    protected static class CreateOrUpdateFlatAmountCouponCompoundingStrategyDeserializer
            extends JsonDeserializer<CreateOrUpdateFlatAmountCouponCompoundingStrategy> {

        @Override
        public CreateOrUpdateFlatAmountCouponCompoundingStrategy deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(CompoundingStrategyCase.class), true);
        }
    }

}
