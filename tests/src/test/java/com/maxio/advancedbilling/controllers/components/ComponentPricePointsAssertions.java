package com.maxio.advancedbilling.controllers.components;

import com.maxio.advancedbilling.models.ComponentCurrencyPrice;

import static org.assertj.core.api.Assertions.assertThat;

public class ComponentPricePointsAssertions {

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
