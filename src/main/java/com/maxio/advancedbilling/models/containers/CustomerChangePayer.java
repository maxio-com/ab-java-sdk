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
import com.maxio.advancedbilling.models.CustomerPayerChange;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = CustomerChangePayer.CustomerChangePayerDeserializer.class)
public abstract class CustomerChangePayer {
    
    /**
     * This is Customer Payer Change case.
     * @param customerPayerChange CustomerPayerChange value for customerPayerChange.
     * @return The CustomerPayerChangeCase object.
     */
    public static CustomerChangePayer fromCustomerPayerChange(
            CustomerPayerChange customerPayerChange) {
        return customerPayerChange == null ? null : new CustomerPayerChangeCase(customerPayerChange);
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
        R customerPayerChange(CustomerPayerChange customerPayerChange);
    }

    /**
     * This is a implementation class for CustomerPayerChangeCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "CustomerPayerChange")
    private static class CustomerPayerChangeCase extends CustomerChangePayer {

        @JsonValue
        private CustomerPayerChange customerPayerChange;

        CustomerPayerChangeCase(CustomerPayerChange customerPayerChange) {
            this.customerPayerChange = customerPayerChange;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.customerPayerChange(this.customerPayerChange);
        }

        @JsonCreator
        private CustomerPayerChangeCase(JsonNode jsonNode) throws IOException {
            this.customerPayerChange = ApiHelper.deserialize(jsonNode,
                CustomerPayerChange.class);
        }

        @Override
        public String toString() {
            return customerPayerChange.toString();
        }
    }

    /**
     * This is a custom deserializer class for CustomerChangePayer.
     */
    protected static class CustomerChangePayerDeserializer
            extends JsonDeserializer<CustomerChangePayer> {

        @Override
        public CustomerChangePayer deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(CustomerPayerChangeCase.class), true);
        }
    }

}
