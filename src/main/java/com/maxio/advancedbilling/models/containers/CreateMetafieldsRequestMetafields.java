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
import com.maxio.advancedbilling.models.CreateMetafield;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * This is a container class for any-of types.
 */
@JsonDeserialize(using = CreateMetafieldsRequestMetafields.CreateMetafieldsRequestMetafieldsDeserializer.class)
public abstract class CreateMetafieldsRequestMetafields {
    
    /**
     * This is Create Metafield case.
     * @param createMetafield CreateMetafield value for createMetafield.
     * @return The CreateMetafieldCase object.
     */
    public static CreateMetafieldsRequestMetafields fromCreateMetafield(
            CreateMetafield createMetafield) {
        return createMetafield == null ? null : new CreateMetafieldCase(createMetafield);
    }

    /**
     * This is List of Create Metafield case.
     * @param listOfCreateMetafield List of CreateMetafield value for listOfCreateMetafield.
     * @return The ListOfCreateMetafieldCase object.
     */
    public static CreateMetafieldsRequestMetafields fromListOfCreateMetafield(
            List<CreateMetafield> listOfCreateMetafield) {
        return listOfCreateMetafield == null ? null : new ListOfCreateMetafieldCase(listOfCreateMetafield);
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
        R createMetafield(CreateMetafield createMetafield);

        R listOfCreateMetafield(List<CreateMetafield> listOfCreateMetafield);
    }

    /**
     * This is a implementation class for CreateMetafieldCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "CreateMetafield")
    private static class CreateMetafieldCase extends CreateMetafieldsRequestMetafields {

        @JsonValue
        private CreateMetafield createMetafield;

        CreateMetafieldCase(CreateMetafield createMetafield) {
            this.createMetafield = createMetafield;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.createMetafield(this.createMetafield);
        }

        @JsonCreator
        private CreateMetafieldCase(JsonNode jsonNode) throws IOException {
            this.createMetafield = ApiHelper.deserialize(jsonNode,
                CreateMetafield.class);
        }

        @Override
        public String toString() {
            return createMetafield.toString();
        }
    }

    /**
     * This is a implementation class for ListOfCreateMetafieldCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "List<CreateMetafield>")
    private static class ListOfCreateMetafieldCase extends CreateMetafieldsRequestMetafields {

        @JsonValue
        private List<CreateMetafield> listOfCreateMetafield;

        ListOfCreateMetafieldCase(List<CreateMetafield> listOfCreateMetafield) {
            this.listOfCreateMetafield = listOfCreateMetafield;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.listOfCreateMetafield(this.listOfCreateMetafield);
        }

        @JsonCreator
        private ListOfCreateMetafieldCase(JsonNode jsonNode) throws IOException {
            this.listOfCreateMetafield = ApiHelper.deserializeArray(jsonNode,
                CreateMetafield[].class);
        }

        @Override
        public String toString() {
            return listOfCreateMetafield.toString();
        }
    }

    /**
     * This is a custom deserializer class for CreateMetafieldsRequestMetafields.
     */
    protected static class CreateMetafieldsRequestMetafieldsDeserializer
            extends JsonDeserializer<CreateMetafieldsRequestMetafields> {

        @Override
        public CreateMetafieldsRequestMetafields deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(CreateMetafieldCase.class,
                    ListOfCreateMetafieldCase.class), false);
        }
    }

}
