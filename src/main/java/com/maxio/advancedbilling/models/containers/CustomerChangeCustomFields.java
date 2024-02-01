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
import com.maxio.advancedbilling.models.CustomerCustomFieldsChange;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = CustomerChangeCustomFields.CustomerChangeCustomFieldsDeserializer.class)
public abstract class CustomerChangeCustomFields {
    
    /**
     * This is Customer Custom Fields Change case.
     * @param customerCustomFieldsChange CustomerCustomFieldsChange value for customerCustomFieldsChange.
     * @return The CustomerCustomFieldsChangeCase object.
     */
    public static CustomerChangeCustomFields fromCustomerCustomFieldsChange(
            CustomerCustomFieldsChange customerCustomFieldsChange) {
        return customerCustomFieldsChange == null ? null : new CustomerCustomFieldsChangeCase(customerCustomFieldsChange);
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
        R customerCustomFieldsChange(CustomerCustomFieldsChange customerCustomFieldsChange);
    }

    /**
     * This is a implementation class for CustomerCustomFieldsChangeCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "CustomerCustomFieldsChange")
    private static class CustomerCustomFieldsChangeCase extends CustomerChangeCustomFields {

        @JsonValue
        private CustomerCustomFieldsChange customerCustomFieldsChange;

        CustomerCustomFieldsChangeCase(CustomerCustomFieldsChange customerCustomFieldsChange) {
            this.customerCustomFieldsChange = customerCustomFieldsChange;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.customerCustomFieldsChange(this.customerCustomFieldsChange);
        }

        @JsonCreator
        private CustomerCustomFieldsChangeCase(JsonNode jsonNode) throws IOException {
            this.customerCustomFieldsChange = ApiHelper.deserialize(jsonNode,
                CustomerCustomFieldsChange.class);
        }

        @Override
        public String toString() {
            return customerCustomFieldsChange.toString();
        }
    }

    /**
     * This is a custom deserializer class for CustomerChangeCustomFields.
     */
    protected static class CustomerChangeCustomFieldsDeserializer
            extends JsonDeserializer<CustomerChangeCustomFields> {

        @Override
        public CustomerChangeCustomFields deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(
                    CustomerCustomFieldsChangeCase.class), true);
        }
    }

}
