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
import com.maxio.advancedbilling.models.CreateSubscriptionComponent;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = CreateSubscriptionComponents.CreateSubscriptionComponentsDeserializer.class)
public abstract class CreateSubscriptionComponents {
    
    /**
     * This is Create Subscription Component case.
     * @param createSubscriptionComponent CreateSubscriptionComponent value for createSubscriptionComponent.
     * @return The CreateSubscriptionComponentCase object.
     */
    public static CreateSubscriptionComponents fromCreateSubscriptionComponent(
            CreateSubscriptionComponent createSubscriptionComponent) {
        return createSubscriptionComponent == null ? null : new CreateSubscriptionComponentCase(createSubscriptionComponent);
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
        R createSubscriptionComponent(CreateSubscriptionComponent createSubscriptionComponent);
    }

    /**
     * This is a implementation class for CreateSubscriptionComponentCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "CreateSubscriptionComponent")
    private static class CreateSubscriptionComponentCase extends CreateSubscriptionComponents {

        @JsonValue
        private CreateSubscriptionComponent createSubscriptionComponent;

        CreateSubscriptionComponentCase(CreateSubscriptionComponent createSubscriptionComponent) {
            this.createSubscriptionComponent = createSubscriptionComponent;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.createSubscriptionComponent(this.createSubscriptionComponent);
        }

        @JsonCreator
        private CreateSubscriptionComponentCase(JsonNode jsonNode) throws IOException {
            this.createSubscriptionComponent = ApiHelper.deserialize(jsonNode,
                CreateSubscriptionComponent.class);
        }

        @Override
        public String toString() {
            return createSubscriptionComponent.toString();
        }
    }

    /**
     * This is a custom deserializer class for CreateSubscriptionComponents.
     */
    protected static class CreateSubscriptionComponentsDeserializer
            extends JsonDeserializer<CreateSubscriptionComponents> {

        @Override
        public CreateSubscriptionComponents deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(
                    CreateSubscriptionComponentCase.class), true);
        }
    }

}
