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
import com.maxio.advancedbilling.models.ErrorStringMapResponse1;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = PrepaidConfigurationErrorResponseErrors.PrepaidConfigurationErrorResponseErrorsDeserializer.class)
public abstract class PrepaidConfigurationErrorResponseErrors {
    
    /**
     * This is Error String Map Response1 case.
     * @param errorStringMapResponse1 ErrorStringMapResponse1 value for errorStringMapResponse1.
     * @return The ErrorStringMapResponse1Case object.
     */
    public static PrepaidConfigurationErrorResponseErrors fromErrorStringMapResponse1(
            ErrorStringMapResponse1 errorStringMapResponse1) {
        return errorStringMapResponse1 == null ? null : new ErrorStringMapResponse1Case(errorStringMapResponse1);
    }

    /**
     * This is List of String case.
     * @param listOfString List of String value for listOfString.
     * @return The ListOfStringCase object.
     */
    public static PrepaidConfigurationErrorResponseErrors fromListOfString(
            List<String> listOfString) {
        return listOfString == null ? null : new ListOfStringCase(listOfString);
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
        R errorStringMapResponse1(ErrorStringMapResponse1 errorStringMapResponse1);

        R listOfString(List<String> listOfString);
    }

    /**
     * This is a implementation class for ErrorStringMapResponse1Case.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "ErrorStringMapResponse1")
    private static class ErrorStringMapResponse1Case extends PrepaidConfigurationErrorResponseErrors {

        @JsonValue
        private ErrorStringMapResponse1 errorStringMapResponse1;

        ErrorStringMapResponse1Case(ErrorStringMapResponse1 errorStringMapResponse1) {
            this.errorStringMapResponse1 = errorStringMapResponse1;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.errorStringMapResponse1(this.errorStringMapResponse1);
        }

        @JsonCreator
        private ErrorStringMapResponse1Case(JsonNode jsonNode) throws IOException {
            this.errorStringMapResponse1 = ApiHelper.deserialize(jsonNode,
                ErrorStringMapResponse1.class);
        }

        @Override
        public String toString() {
            return errorStringMapResponse1.toString();
        }
    }

    /**
     * This is a implementation class for ListOfStringCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "List<String>")
    private static class ListOfStringCase extends PrepaidConfigurationErrorResponseErrors {

        @JsonValue
        private List<String> listOfString;

        ListOfStringCase(List<String> listOfString) {
            this.listOfString = listOfString;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.listOfString(this.listOfString);
        }

        @JsonCreator
        private ListOfStringCase(JsonNode jsonNode) throws IOException {
            this.listOfString = ApiHelper.deserializeArray(jsonNode,
                String[].class);
        }

        @Override
        public String toString() {
            return listOfString.toString();
        }
    }

    /**
     * This is a custom deserializer class for PrepaidConfigurationErrorResponseErrors.
     */
    protected static class PrepaidConfigurationErrorResponseErrorsDeserializer
            extends JsonDeserializer<PrepaidConfigurationErrorResponseErrors> {

        @Override
        public PrepaidConfigurationErrorResponseErrors deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(ErrorStringMapResponse1Case.class,
                    ListOfStringCase.class), true);
        }
    }

}
