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
import com.maxio.advancedbilling.models.CreateComponentPricePoint;
import com.maxio.advancedbilling.models.CreatePrepaidUsageComponentPricePoint;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for any-of types.
 */
@JsonDeserialize(using = CreateComponentPricePointsRequestPricePoints.CreateComponentPricePointsRequestPricePointsDeserializer.class)
public abstract class CreateComponentPricePointsRequestPricePoints {
    
    /**
     * This is Create Component Price Point case.
     * @param createComponentPricePoint CreateComponentPricePoint value for createComponentPricePoint.
     * @return The CreateComponentPricePointCase object.
     */
    public static CreateComponentPricePointsRequestPricePoints fromCreateComponentPricePoint(
            CreateComponentPricePoint createComponentPricePoint) {
        return createComponentPricePoint == null ? null : new CreateComponentPricePointCase(createComponentPricePoint);
    }

    /**
     * This is Create Prepaid Usage Component Price Point case.
     * @param createPrepaidUsageComponentPricePoint CreatePrepaidUsageComponentPricePoint value for createPrepaidUsageComponentPricePoint.
     * @return The CreatePrepaidUsageComponentPricePointCase object.
     */
    public static CreateComponentPricePointsRequestPricePoints fromCreatePrepaidUsageComponentPricePoint(
            CreatePrepaidUsageComponentPricePoint createPrepaidUsageComponentPricePoint) {
        return createPrepaidUsageComponentPricePoint == null ? null : new CreatePrepaidUsageComponentPricePointCase(createPrepaidUsageComponentPricePoint);
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
        R createComponentPricePoint(CreateComponentPricePoint createComponentPricePoint);

        R createPrepaidUsageComponentPricePoint(CreatePrepaidUsageComponentPricePoint createPrepaidUsageComponentPricePoint);
    }

    /**
     * This is a implementation class for CreateComponentPricePointCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "CreateComponentPricePoint")
    private static class CreateComponentPricePointCase extends CreateComponentPricePointsRequestPricePoints {

        @JsonValue
        private CreateComponentPricePoint createComponentPricePoint;

        CreateComponentPricePointCase(CreateComponentPricePoint createComponentPricePoint) {
            this.createComponentPricePoint = createComponentPricePoint;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.createComponentPricePoint(this.createComponentPricePoint);
        }

        @JsonCreator
        private CreateComponentPricePointCase(JsonNode jsonNode) throws IOException {
            this.createComponentPricePoint = ApiHelper.deserialize(jsonNode,
                CreateComponentPricePoint.class);
        }

        @Override
        public String toString() {
            return createComponentPricePoint.toString();
        }
    }

    /**
     * This is a implementation class for CreatePrepaidUsageComponentPricePointCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "CreatePrepaidUsageComponentPricePoint")
    private static class CreatePrepaidUsageComponentPricePointCase extends CreateComponentPricePointsRequestPricePoints {

        @JsonValue
        private CreatePrepaidUsageComponentPricePoint createPrepaidUsageComponentPricePoint;

        CreatePrepaidUsageComponentPricePointCase(CreatePrepaidUsageComponentPricePoint createPrepaidUsageComponentPricePoint) {
            this.createPrepaidUsageComponentPricePoint = createPrepaidUsageComponentPricePoint;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.createPrepaidUsageComponentPricePoint(this.createPrepaidUsageComponentPricePoint);
        }

        @JsonCreator
        private CreatePrepaidUsageComponentPricePointCase(JsonNode jsonNode) throws IOException {
            this.createPrepaidUsageComponentPricePoint = ApiHelper.deserialize(jsonNode,
                CreatePrepaidUsageComponentPricePoint.class);
        }

        @Override
        public String toString() {
            return createPrepaidUsageComponentPricePoint.toString();
        }
    }

    /**
     * This is a custom deserializer class for CreateComponentPricePointsRequestPricePoints.
     */
    protected static class CreateComponentPricePointsRequestPricePointsDeserializer
            extends JsonDeserializer<CreateComponentPricePointsRequestPricePoints> {

        @Override
        public CreateComponentPricePointsRequestPricePoints deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(CreateComponentPricePointCase.class,
                    CreatePrepaidUsageComponentPricePointCase.class), false);
        }
    }

}
