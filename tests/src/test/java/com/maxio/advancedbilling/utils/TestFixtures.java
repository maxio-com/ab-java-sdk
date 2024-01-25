package com.maxio.advancedbilling.utils;

import com.maxio.advancedbilling.models.InvoiceAddress;
import com.maxio.advancedbilling.models.InvoiceSeller;

public class TestFixtures {
    public static final Integer SITE_ID = 4512;

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
}
