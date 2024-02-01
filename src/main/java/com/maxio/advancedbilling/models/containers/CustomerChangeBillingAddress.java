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
import com.maxio.advancedbilling.models.AddressChange;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = CustomerChangeBillingAddress.CustomerChangeBillingAddressDeserializer.class)
public abstract class CustomerChangeBillingAddress {
    
    /**
     * This is Address Change case.
     * @param addressChange AddressChange value for addressChange.
     * @return The AddressChangeCase object.
     */
    public static CustomerChangeBillingAddress fromAddressChange(AddressChange addressChange) {
        return addressChange == null ? null : new AddressChangeCase(addressChange);
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
        R addressChange(AddressChange addressChange);
    }

    /**
     * This is a implementation class for AddressChangeCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "AddressChange")
    private static class AddressChangeCase extends CustomerChangeBillingAddress {

        @JsonValue
        private AddressChange addressChange;

        AddressChangeCase(AddressChange addressChange) {
            this.addressChange = addressChange;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.addressChange(this.addressChange);
        }

        @JsonCreator
        private AddressChangeCase(JsonNode jsonNode) throws IOException {
            this.addressChange = ApiHelper.deserialize(jsonNode,
                AddressChange.class);
        }

        @Override
        public String toString() {
            return addressChange.toString();
        }
    }

    /**
     * This is a custom deserializer class for CustomerChangeBillingAddress.
     */
    protected static class CustomerChangeBillingAddressDeserializer
            extends JsonDeserializer<CustomerChangeBillingAddress> {

        @Override
        public CustomerChangeBillingAddress deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(AddressChangeCase.class), true);
        }
    }

}
