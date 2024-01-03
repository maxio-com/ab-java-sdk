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
import com.maxio.advancedbilling.models.PaymentForAllocation;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = AllocationPayment.AllocationPaymentDeserializer.class)
public abstract class AllocationPayment {
    
    /**
     * This is Payment for Allocation case.
     * @param paymentForAllocation PaymentForAllocation value for paymentForAllocation.
     * @return The PaymentForAllocationCase object.
     */
    public static AllocationPayment fromPaymentForAllocation(
            PaymentForAllocation paymentForAllocation) {
        return paymentForAllocation == null ? null : new PaymentForAllocationCase(paymentForAllocation);
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
        R paymentForAllocation(PaymentForAllocation paymentForAllocation);
    }

    /**
     * This is a implementation class for PaymentForAllocationCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "PaymentForAllocation")
    private static class PaymentForAllocationCase extends AllocationPayment {

        @JsonValue
        private PaymentForAllocation paymentForAllocation;

        PaymentForAllocationCase(PaymentForAllocation paymentForAllocation) {
            this.paymentForAllocation = paymentForAllocation;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.paymentForAllocation(this.paymentForAllocation);
        }

        @JsonCreator
        private PaymentForAllocationCase(JsonNode jsonNode) throws IOException {
            this.paymentForAllocation = ApiHelper.deserialize(jsonNode,
                PaymentForAllocation.class);
        }

        @Override
        public String toString() {
            return paymentForAllocation.toString();
        }
    }

    /**
     * This is a custom deserializer class for AllocationPayment.
     */
    protected static class AllocationPaymentDeserializer
            extends JsonDeserializer<AllocationPayment> {

        @Override
        public AllocationPayment deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(PaymentForAllocationCase.class), true);
        }
    }

}
