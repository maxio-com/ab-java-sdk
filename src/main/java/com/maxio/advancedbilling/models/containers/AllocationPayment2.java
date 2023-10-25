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
import com.maxio.advancedbilling.models.AllocationPayment;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = AllocationPayment2.AllocationPayment2Deserializer.class)
public abstract class AllocationPayment2 {
    
    /**
     * This is Allocation Payment case.
     * @param allocationPayment AllocationPayment value for allocationPayment.
     * @return The AllocationPaymentCase object.
     */
    public static AllocationPayment2 fromAllocationPayment(AllocationPayment allocationPayment) {
        return allocationPayment == null ? null : new AllocationPaymentCase(allocationPayment);
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
        R allocationPayment(AllocationPayment allocationPayment);
    }

    /**
     * This is a implementation class for AllocationPaymentCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "AllocationPayment")
    private static class AllocationPaymentCase extends AllocationPayment2 {

        @JsonValue
        private AllocationPayment allocationPayment;

        AllocationPaymentCase(AllocationPayment allocationPayment) {
            this.allocationPayment = allocationPayment;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.allocationPayment(this.allocationPayment);
        }

        @JsonCreator
        private AllocationPaymentCase(JsonNode jsonNode) throws IOException {
            this.allocationPayment = ApiHelper.deserialize(jsonNode,
                AllocationPayment.class);
        }

        @Override
        public String toString() {
            return allocationPayment.toString();
        }
    }

    /**
     * This is a custom deserializer class for AllocationPayment2.
     */
    protected static class AllocationPayment2Deserializer
            extends JsonDeserializer<AllocationPayment2> {

        @Override
        public AllocationPayment2 deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(AllocationPaymentCase.class), true);
        }
    }

}
