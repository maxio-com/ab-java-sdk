package com.maxio.advancedbilling.controllers.customfields;

import com.maxio.advancedbilling.models.IncludeOption;
import com.maxio.advancedbilling.models.MetafieldScope;

import java.util.Collections;
import java.util.Random;

public class CustomFieldsTestsUtils {
    private static final Random random = new Random();

    public static final MetafieldScope EMPTY_SCOPE = new MetafieldScope.Builder()
            .csv(IncludeOption.EXCLUDE)
            .invoices(IncludeOption.EXCLUDE)
            .statements(IncludeOption.EXCLUDE)
            .portal(IncludeOption.EXCLUDE)
            .publicShow(IncludeOption.EXCLUDE)
            .publicEdit(IncludeOption.EXCLUDE)
            .hosted(Collections.emptyList())
            .build();

    public static MetafieldScope randomScope() {
        return new MetafieldScope.Builder()
                .csv(randomIncludeOption())
                .invoices(randomIncludeOption())
                .statements(randomIncludeOption())
                .portal(randomIncludeOption())
                .publicShow(randomIncludeOption())
                .publicEdit(randomIncludeOption())
                .hosted(Collections.emptyList())
                .build();
    }

    private static IncludeOption randomIncludeOption() {
        return IncludeOption.values()[random.nextInt(2)];
    }

}
