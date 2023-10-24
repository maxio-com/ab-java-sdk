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
import com.maxio.advancedbilling.models.CreateEBBComponent;
import com.maxio.advancedbilling.models.CreateMeteredComponent;
import com.maxio.advancedbilling.models.CreateOnOffComponent;
import com.maxio.advancedbilling.models.CreatePrepaidComponent;
import com.maxio.advancedbilling.models.CreateQuantityBasedComponent;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = CreateComponentBody.CreateComponentBodyDeserializer.class)
public abstract class CreateComponentBody {
    
    /**
     * This is Create Metered Component case.
     * @param createMeteredComponent CreateMeteredComponent value for createMeteredComponent.
     * @return The CreateMeteredComponentCase object.
     */
    public static CreateComponentBody fromCreateMeteredComponent(
            CreateMeteredComponent createMeteredComponent) {
        return createMeteredComponent == null ? null : new CreateMeteredComponentCase(createMeteredComponent);
    }

    /**
     * This is Create Quantity Based Component case.
     * @param createQuantityBasedComponent CreateQuantityBasedComponent value for createQuantityBasedComponent.
     * @return The CreateQuantityBasedComponentCase object.
     */
    public static CreateComponentBody fromCreateQuantityBasedComponent(
            CreateQuantityBasedComponent createQuantityBasedComponent) {
        return createQuantityBasedComponent == null ? null : new CreateQuantityBasedComponentCase(createQuantityBasedComponent);
    }

    /**
     * This is Create On/Off Component case.
     * @param createOnOffComponent CreateOnOffComponent value for createOnOffComponent.
     * @return The CreateOnOffComponentCase object.
     */
    public static CreateComponentBody fromCreateOnOffComponent(
            CreateOnOffComponent createOnOffComponent) {
        return createOnOffComponent == null ? null : new CreateOnOffComponentCase(createOnOffComponent);
    }

    /**
     * This is Create Prepaid Component case.
     * @param createPrepaidComponent CreatePrepaidComponent value for createPrepaidComponent.
     * @return The CreatePrepaidComponentCase object.
     */
    public static CreateComponentBody fromCreatePrepaidComponent(
            CreatePrepaidComponent createPrepaidComponent) {
        return createPrepaidComponent == null ? null : new CreatePrepaidComponentCase(createPrepaidComponent);
    }

    /**
     * This is Create EBB Component case.
     * @param createEBBComponent CreateEBBComponent value for createEBBComponent.
     * @return The CreateEBBComponentCase object.
     */
    public static CreateComponentBody fromCreateEBBComponent(
            CreateEBBComponent createEBBComponent) {
        return createEBBComponent == null ? null : new CreateEBBComponentCase(createEBBComponent);
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
        R createMeteredComponent(CreateMeteredComponent createMeteredComponent);

        R createQuantityBasedComponent(CreateQuantityBasedComponent createQuantityBasedComponent);

        R createOnOffComponent(CreateOnOffComponent createOnOffComponent);

        R createPrepaidComponent(CreatePrepaidComponent createPrepaidComponent);

        R createEBBComponent(CreateEBBComponent createEBBComponent);
    }

    /**
     * This is a implementation class for CreateMeteredComponentCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "CreateMeteredComponent")
    private static class CreateMeteredComponentCase extends CreateComponentBody {

        @JsonValue
        private CreateMeteredComponent createMeteredComponent;

        CreateMeteredComponentCase(CreateMeteredComponent createMeteredComponent) {
            this.createMeteredComponent = createMeteredComponent;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.createMeteredComponent(this.createMeteredComponent);
        }

        @JsonCreator
        private CreateMeteredComponentCase(JsonNode jsonNode) throws IOException {
            this.createMeteredComponent = ApiHelper.deserialize(jsonNode,
                CreateMeteredComponent.class);
        }

        @Override
        public String toString() {
            return createMeteredComponent.toString();
        }
    }

    /**
     * This is a implementation class for CreateQuantityBasedComponentCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "CreateQuantityBasedComponent")
    private static class CreateQuantityBasedComponentCase extends CreateComponentBody {

        @JsonValue
        private CreateQuantityBasedComponent createQuantityBasedComponent;

        CreateQuantityBasedComponentCase(CreateQuantityBasedComponent createQuantityBasedComponent) {
            this.createQuantityBasedComponent = createQuantityBasedComponent;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.createQuantityBasedComponent(this.createQuantityBasedComponent);
        }

        @JsonCreator
        private CreateQuantityBasedComponentCase(JsonNode jsonNode) throws IOException {
            this.createQuantityBasedComponent = ApiHelper.deserialize(jsonNode,
                CreateQuantityBasedComponent.class);
        }

        @Override
        public String toString() {
            return createQuantityBasedComponent.toString();
        }
    }

    /**
     * This is a implementation class for CreateOnOffComponentCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "CreateOnOffComponent")
    private static class CreateOnOffComponentCase extends CreateComponentBody {

        @JsonValue
        private CreateOnOffComponent createOnOffComponent;

        CreateOnOffComponentCase(CreateOnOffComponent createOnOffComponent) {
            this.createOnOffComponent = createOnOffComponent;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.createOnOffComponent(this.createOnOffComponent);
        }

        @JsonCreator
        private CreateOnOffComponentCase(JsonNode jsonNode) throws IOException {
            this.createOnOffComponent = ApiHelper.deserialize(jsonNode,
                CreateOnOffComponent.class);
        }

        @Override
        public String toString() {
            return createOnOffComponent.toString();
        }
    }

    /**
     * This is a implementation class for CreatePrepaidComponentCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "CreatePrepaidComponent")
    private static class CreatePrepaidComponentCase extends CreateComponentBody {

        @JsonValue
        private CreatePrepaidComponent createPrepaidComponent;

        CreatePrepaidComponentCase(CreatePrepaidComponent createPrepaidComponent) {
            this.createPrepaidComponent = createPrepaidComponent;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.createPrepaidComponent(this.createPrepaidComponent);
        }

        @JsonCreator
        private CreatePrepaidComponentCase(JsonNode jsonNode) throws IOException {
            this.createPrepaidComponent = ApiHelper.deserialize(jsonNode,
                CreatePrepaidComponent.class);
        }

        @Override
        public String toString() {
            return createPrepaidComponent.toString();
        }
    }

    /**
     * This is a implementation class for CreateEBBComponentCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "CreateEBBComponent")
    private static class CreateEBBComponentCase extends CreateComponentBody {

        @JsonValue
        private CreateEBBComponent createEBBComponent;

        CreateEBBComponentCase(CreateEBBComponent createEBBComponent) {
            this.createEBBComponent = createEBBComponent;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.createEBBComponent(this.createEBBComponent);
        }

        @JsonCreator
        private CreateEBBComponentCase(JsonNode jsonNode) throws IOException {
            this.createEBBComponent = ApiHelper.deserialize(jsonNode,
                CreateEBBComponent.class);
        }

        @Override
        public String toString() {
            return createEBBComponent.toString();
        }
    }

    /**
     * This is a custom deserializer class for CreateComponentBody.
     */
    protected static class CreateComponentBodyDeserializer
            extends JsonDeserializer<CreateComponentBody> {

        @Override
        public CreateComponentBody deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(CreateMeteredComponentCase.class,
                    CreateQuantityBasedComponentCase.class, CreateOnOffComponentCase.class,
                    CreatePrepaidComponentCase.class, CreateEBBComponentCase.class), true);
        }
    }

}
