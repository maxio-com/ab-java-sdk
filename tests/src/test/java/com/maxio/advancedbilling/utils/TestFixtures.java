package com.maxio.advancedbilling.utils;

import com.maxio.advancedbilling.models.InvoiceAddress;
import com.maxio.advancedbilling.models.InvoiceSeller;

public class TestFixtures {
    private static final Integer DEFAULT_SITE_ID = 4512;
    public static final Integer SITE_ID = getSiteId();

    public static final InvoiceSeller INVOICE_SELLER = new InvoiceSeller.Builder()
            .name("Developer Experience")
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

    private static int getSiteId() {
        String siteId = System.getenv("SITE_ID");
        if (siteId == null) {
            System.out.println("Using default site id: " + SITE_ID);
            return DEFAULT_SITE_ID;
        }
        System.out.println("Using overridden site id: " + siteId);
        return Integer.parseInt(siteId);
    }
}
