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
import com.maxio.advancedbilling.models.UpdateMetafield;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * This is a container class for any-of types.
 */
@JsonDeserialize(using = UpdateMetafieldsRequestMetafields.UpdateMetafieldsRequestMetafieldsDeserializer.class)
public abstract class UpdateMetafieldsRequestMetafields {
    
    /**
     * This is Update Metafield case.
     * @param updateMetafield UpdateMetafield value for updateMetafield.
     * @return The UpdateMetafieldCase object.
     */
    public static UpdateMetafieldsRequestMetafields fromUpdateMetafield(
            UpdateMetafield updateMetafield) {
        return updateMetafield == null ? null : new UpdateMetafieldCase(updateMetafield);
    }

    /**
     * This is List of Update Metafield case.
     * @param listOfUpdateMetafield List of UpdateMetafield value for listOfUpdateMetafield.
     * @return The ListOfUpdateMetafieldCase object.
     */
    public static UpdateMetafieldsRequestMetafields fromListOfUpdateMetafield(
            List<UpdateMetafield> listOfUpdateMetafield) {
        return listOfUpdateMetafield == null ? null : new ListOfUpdateMetafieldCase(listOfUpdateMetafield);
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
        R updateMetafield(UpdateMetafield updateMetafield);

        R listOfUpdateMetafield(List<UpdateMetafield> listOfUpdateMetafield);
    }

    /**
     * This is a implementation class for UpdateMetafieldCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "UpdateMetafield")
    private static class UpdateMetafieldCase extends UpdateMetafieldsRequestMetafields {

        @JsonValue
        private UpdateMetafield updateMetafield;

        UpdateMetafieldCase(UpdateMetafield updateMetafield) {
            this.updateMetafield = updateMetafield;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.updateMetafield(this.updateMetafield);
        }

        @JsonCreator
        private UpdateMetafieldCase(JsonNode jsonNode) throws IOException {
            this.updateMetafield = ApiHelper.deserialize(jsonNode,
                UpdateMetafield.class);
        }

        @Override
        public String toString() {
            return updateMetafield.toString();
        }
    }

    /**
     * This is a implementation class for ListOfUpdateMetafieldCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "List<UpdateMetafield>")
    private static class ListOfUpdateMetafieldCase extends UpdateMetafieldsRequestMetafields {

        @JsonValue
        private List<UpdateMetafield> listOfUpdateMetafield;

        ListOfUpdateMetafieldCase(List<UpdateMetafield> listOfUpdateMetafield) {
            this.listOfUpdateMetafield = listOfUpdateMetafield;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.listOfUpdateMetafield(this.listOfUpdateMetafield);
        }

        @JsonCreator
        private ListOfUpdateMetafieldCase(JsonNode jsonNode) throws IOException {
            this.listOfUpdateMetafield = ApiHelper.deserializeArray(jsonNode,
                UpdateMetafield[].class);
        }

        @Override
        public String toString() {
            return listOfUpdateMetafield.toString();
        }
    }

    /**
     * This is a custom deserializer class for UpdateMetafieldsRequestMetafields.
     */
    protected static class UpdateMetafieldsRequestMetafieldsDeserializer
            extends JsonDeserializer<UpdateMetafieldsRequestMetafields> {

        @Override
        public UpdateMetafieldsRequestMetafields deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(UpdateMetafieldCase.class,
                    ListOfUpdateMetafieldCase.class), false);
        }
    }

}
