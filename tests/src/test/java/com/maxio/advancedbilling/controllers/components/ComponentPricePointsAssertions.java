package com.maxio.advancedbilling.controllers.components;

import com.maxio.advancedbilling.models.ComponentCurrencyPrice;
import com.maxio.advancedbilling.models.ComponentPrice;
import com.maxio.advancedbilling.models.ComponentPricePoint;
import com.maxio.advancedbilling.models.CreateComponentPricePoint;
import com.maxio.advancedbilling.models.CreatePrepaidUsageComponentPricePoint;
import com.maxio.advancedbilling.models.Price;
import com.maxio.advancedbilling.models.PricePointType;
import com.maxio.advancedbilling.utils.matchers.PriceEndingQuantityGetter;
import com.maxio.advancedbilling.utils.matchers.PriceStartingQuantityGetter;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ComponentPricePointsAssertions {

    static void assertPricePoint(ComponentPricePoint pricePoint, CreateComponentPricePoint createComponentPricePoint,
                                 int componentId) {
        assertPricePoint(pricePoint, createComponentPricePoint, componentId, false);
    }

    static void assertPricePoint(ComponentPricePoint pricePoint, CreateComponentPricePoint createComponentPricePoint,
                                 int componentId, boolean isBulk) {
        assertThat(pricePoint.getId()).isNotNull();
        assertThat(pricePoint.getType()).isEqualTo(PricePointType.CATALOG);
        assertThat(pricePoint.getDefault()).isFalse();
        assertThat(pricePoint.getName()).isEqualTo(createComponentPricePoint.getName());
        assertThat(pricePoint.getPricingScheme()).isEqualTo(createComponentPricePoint.getPricingScheme());
        assertThat(pricePoint.getComponentId()).isEqualTo(componentId);
        assertThat(pricePoint.getHandle()).isEqualTo(createComponentPricePoint.getHandle());

        assertThat(pricePoint.getArchivedAt()).isNull();
        assertThat(pricePoint.getCreatedAt()).isNotNull();
        assertThat(pricePoint.getUpdatedAt()).isEqualTo(pricePoint.getCreatedAt());

        assertThat(pricePoint.getSubscriptionId()).isNull();
        assertThat(pricePoint.getInterval()).isNull();
        assertThat(pricePoint.getIntervalUnit()).isNull();
        assertThat(pricePoint.getCurrencyPrices()).isNull();
        assertThat(pricePoint.getExpirationInterval()).isNull();
        assertThat(pricePoint.getExpirationIntervalUnit()).isNull();
        assertThat(pricePoint.getRolloverPrepaidRemainder()).isNull();
        assertThat(pricePoint.getRenewPrepaidAllocation()).isNull();
        assertThat(pricePoint.getOveragePrices()).isNull();
        assertThat(pricePoint.getOveragePricingScheme()).isNull();

        if (!isBulk) {
            assertThat(pricePoint.getUseSiteExchangeRate())
                    .isEqualTo(createComponentPricePoint.getUseSiteExchangeRate());
            assertThat(pricePoint.getTaxIncluded()).isEqualTo(createComponentPricePoint.getTaxIncluded());
        }
    }

    static void assertPrepaidPricePoint(ComponentPricePoint pricePoint, CreatePrepaidUsageComponentPricePoint createComponentPricePoint,
                                 int componentId) {
        assertPrepaidPricePoint(pricePoint, createComponentPricePoint, componentId, false);
    }

    static void assertPrepaidPricePoint(ComponentPricePoint pricePoint, CreatePrepaidUsageComponentPricePoint createComponentPricePoint,
                                 int componentId, boolean isBulk) {
        assertThat(pricePoint.getId()).isNotNull();
        assertThat(pricePoint.getType()).isEqualTo(PricePointType.CATALOG);
        assertThat(pricePoint.getDefault()).isFalse();
        assertThat(pricePoint.getName()).isEqualTo(createComponentPricePoint.getName());
        assertThat(pricePoint.getPricingScheme()).isEqualTo(createComponentPricePoint.getPricingScheme());
        assertThat(pricePoint.getComponentId()).isEqualTo(componentId);
        assertThat(pricePoint.getHandle()).isEqualTo(createComponentPricePoint.getHandle());

        assertThat(pricePoint.getArchivedAt()).isNull();
        assertThat(pricePoint.getCreatedAt()).isNotNull();
        assertThat(pricePoint.getUpdatedAt()).isEqualTo(pricePoint.getCreatedAt());
        assertThat(pricePoint.getUseSiteExchangeRate())
                .isEqualTo(createComponentPricePoint.getUseSiteExchangeRate());
        assertThat(pricePoint.getSubscriptionId()).isNull();
        assertThat(pricePoint.getTaxIncluded()).isFalse();
        assertThat(pricePoint.getInterval()).isNull();
        assertThat(pricePoint.getIntervalUnit()).isNull();
        assertThat(pricePoint.getCurrencyPrices()).isNull();
        Integer expectedExpirationInterval = createComponentPricePoint.getExpirationInterval() != null
                ? createComponentPricePoint.getExpirationInterval().intValue() : null;
        assertThat(pricePoint.getExpirationInterval()).isEqualTo(expectedExpirationInterval);
        assertThat(pricePoint.getExpirationIntervalUnit()).isEqualTo(createComponentPricePoint.getExpirationIntervalUnit());
        assertThat(pricePoint.getRolloverPrepaidRemainder()).isEqualTo(createComponentPricePoint.getRolloverPrepaidRemainder());
        assertThat(pricePoint.getRenewPrepaidAllocation()).isEqualTo(createComponentPricePoint.getRenewPrepaidAllocation());

        if (!isBulk) {
            assertThat(pricePoint.getUseSiteExchangeRate())
                    .isEqualTo(createComponentPricePoint.getUseSiteExchangeRate());
        }
    }

    public static void assertPrices(List<Price> requestPrices, List<ComponentPrice> responsePrices,
                      List<String> unitPrices, List<String> formattedPrices, int componentId, int pricePointId) {
        assertThat(responsePrices.size()).isEqualTo(requestPrices.size());
        for (int i = 0; i < responsePrices.size(); i++) {
            Price requestPrice = requestPrices.get(i);
            ComponentPrice responsePrice = responsePrices.get(i);

            assertThat(responsePrice.getId()).isNotNull();
            assertThat(responsePrice.getComponentId()).isEqualTo(componentId);
            assertThat(responsePrice.getStartingQuantity()).isEqualTo(requestPrice.getStartingQuantity()
                    .match(new PriceStartingQuantityGetter<>()));
            if (requestPrice.getEndingQuantity() == null) {
                assertThat(responsePrice.getEndingQuantity()).isNull();
            } else {
                assertThat(responsePrice.getEndingQuantity()).isEqualTo(requestPrice.getEndingQuantity()
                        .match(new PriceEndingQuantityGetter<>()));
            }
            assertThat(responsePrice.getUnitPrice()).isEqualTo(unitPrices.get(i));
            assertThat(responsePrice.getPricePointId()).isEqualTo(pricePointId);
            assertThat(responsePrice.getFormattedUnitPrice()).isEqualTo(formattedPrices.get(i));
            assertThat(responsePrice.getSegmentId()).isNull();
        }
    }

    static void assertSiteCurrencyPrice(ComponentCurrencyPrice componentCurrencyPriceResponse,
                                        int priceId, int pricePointId) {
        assertThat(componentCurrencyPriceResponse.getPriceId())
                .isEqualTo(priceId);
        assertThat(componentCurrencyPriceResponse.getPrice()).isNotNull();
        assertThat(componentCurrencyPriceResponse.getFormattedPrice()).startsWith("€");
        assertThat(componentCurrencyPriceResponse.getCurrency()).isEqualTo("EUR");
        assertThat(componentCurrencyPriceResponse.getPricePointId())
                .isEqualTo(pricePointId);
    }

}
