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
import com.maxio.advancedbilling.models.CreateOrUpdateFlatAmountCoupon;
import com.maxio.advancedbilling.models.CreateOrUpdatePercentageCoupon;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = CreateOrUpdateCouponCoupon.CreateOrUpdateCouponCouponDeserializer.class)
public abstract class CreateOrUpdateCouponCoupon {
    
    /**
     * This is Create or Update Percentage Coupon case.
     * @param createOrUpdatePercentageCoupon CreateOrUpdatePercentageCoupon value for createOrUpdatePercentageCoupon.
     * @return The CreateOrUpdatePercentageCouponCase object.
     */
    public static CreateOrUpdateCouponCoupon fromCreateOrUpdatePercentageCoupon(
            CreateOrUpdatePercentageCoupon createOrUpdatePercentageCoupon) {
        return createOrUpdatePercentageCoupon == null ? null : new CreateOrUpdatePercentageCouponCase(createOrUpdatePercentageCoupon);
    }

    /**
     * This is Create or Update Flat Amount Coupon case.
     * @param createOrUpdateFlatAmountCoupon CreateOrUpdateFlatAmountCoupon value for createOrUpdateFlatAmountCoupon.
     * @return The CreateOrUpdateFlatAmountCouponCase object.
     */
    public static CreateOrUpdateCouponCoupon fromCreateOrUpdateFlatAmountCoupon(
            CreateOrUpdateFlatAmountCoupon createOrUpdateFlatAmountCoupon) {
        return createOrUpdateFlatAmountCoupon == null ? null : new CreateOrUpdateFlatAmountCouponCase(createOrUpdateFlatAmountCoupon);
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
        R createOrUpdatePercentageCoupon(CreateOrUpdatePercentageCoupon createOrUpdatePercentageCoupon);

        R createOrUpdateFlatAmountCoupon(CreateOrUpdateFlatAmountCoupon createOrUpdateFlatAmountCoupon);
    }

    /**
     * This is a implementation class for CreateOrUpdatePercentageCouponCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "CreateOrUpdatePercentageCoupon")
    private static class CreateOrUpdatePercentageCouponCase extends CreateOrUpdateCouponCoupon {

        @JsonValue
        private CreateOrUpdatePercentageCoupon createOrUpdatePercentageCoupon;

        CreateOrUpdatePercentageCouponCase(CreateOrUpdatePercentageCoupon createOrUpdatePercentageCoupon) {
            this.createOrUpdatePercentageCoupon = createOrUpdatePercentageCoupon;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.createOrUpdatePercentageCoupon(this.createOrUpdatePercentageCoupon);
        }

        @JsonCreator
        private CreateOrUpdatePercentageCouponCase(JsonNode jsonNode) throws IOException {
            this.createOrUpdatePercentageCoupon = ApiHelper.deserialize(jsonNode,
                CreateOrUpdatePercentageCoupon.class);
        }

        @Override
        public String toString() {
            return createOrUpdatePercentageCoupon.toString();
        }
    }

    /**
     * This is a implementation class for CreateOrUpdateFlatAmountCouponCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "CreateOrUpdateFlatAmountCoupon")
    private static class CreateOrUpdateFlatAmountCouponCase extends CreateOrUpdateCouponCoupon {

        @JsonValue
        private CreateOrUpdateFlatAmountCoupon createOrUpdateFlatAmountCoupon;

        CreateOrUpdateFlatAmountCouponCase(CreateOrUpdateFlatAmountCoupon createOrUpdateFlatAmountCoupon) {
            this.createOrUpdateFlatAmountCoupon = createOrUpdateFlatAmountCoupon;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.createOrUpdateFlatAmountCoupon(this.createOrUpdateFlatAmountCoupon);
        }

        @JsonCreator
        private CreateOrUpdateFlatAmountCouponCase(JsonNode jsonNode) throws IOException {
            this.createOrUpdateFlatAmountCoupon = ApiHelper.deserialize(jsonNode,
                CreateOrUpdateFlatAmountCoupon.class);
        }

        @Override
        public String toString() {
            return createOrUpdateFlatAmountCoupon.toString();
        }
    }

    /**
     * This is a custom deserializer class for CreateOrUpdateCouponCoupon.
     */
    protected static class CreateOrUpdateCouponCouponDeserializer
            extends JsonDeserializer<CreateOrUpdateCouponCoupon> {

        @Override
        public CreateOrUpdateCouponCoupon deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(
                    CreateOrUpdatePercentageCouponCase.class,
                    CreateOrUpdateFlatAmountCouponCase.class), true);
        }
    }

}
