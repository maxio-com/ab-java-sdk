package com.maxio.advancedbilling.utils;

import com.maxio.advancedbilling.models.InvoiceAddress;
import com.maxio.advancedbilling.models.InvoiceSeller;

public class TestFixtures {
    private static final Integer DEFAULT_SITE_ID = 87346;
    public static final Integer SITE_ID = getIntOrDefault("SITE_ID", DEFAULT_SITE_ID);
    private static final Integer DEFAULT_SELLER_ID = 58665;
    public static final Integer SELLER_ID = getIntOrDefault("SELLER_ID", DEFAULT_SELLER_ID);

    public static final InvoiceSeller INVOICE_SELLER = new InvoiceSeller.Builder()
            .name("Maxio Developer Experience")
            .address(new InvoiceAddress.Builder()
                    .street("Asdf Street")
                    .line2("123/444")
                    .city("San Antonio")
                    .state("TX")
                    .zip("78015")
                    .country("US")
                    .build())
            .phone("555 111 222")
            .build();

    private static int getIntOrDefault(String envName, int defaultValue) {
        String envValue = System.getenv(envName);
        if (envValue == null) {
            System.out.printf("Using default value for %s = %s%n", envName, defaultValue);
            return defaultValue;
        }
        System.out.printf("Using overridden value for %s = %s%n", envName, envValue);
        return Integer.parseInt(envValue);
    }
}
