package com.maxio.advancedbilling;

import com.maxio.advancedbilling.authentication.BasicAuthModel;

public class TestClient {
    private static final String SUBDOMAIN_ENV = "SUBDOMAIN";
    private static final String DOMAIN_ENV = "DOMAIN";
    private static final String API_KEY_ENV = "API_KEY";

    private static final String PASSWORD = "X";

    public static AdvancedBillingClient createClient() {
        return new AdvancedBillingClient.Builder()
                .httpClientConfig(configBuilder -> configBuilder.timeout(10))
                .basicAuthCredentials(
                        new BasicAuthModel.Builder(getEnvValue(API_KEY_ENV), PASSWORD)
                                .build())
                .environment(Environment.PRODUCTION)
                .subdomain(getEnvValue(SUBDOMAIN_ENV))
                .domain(getEnvValue(DOMAIN_ENV))
                .build();
    }

    public static AdvancedBillingClient createInvalidCredentialsClient() {
        return new AdvancedBillingClient.Builder()
                .httpClientConfig(configBuilder -> configBuilder.timeout(10))
                .basicAuthCredentials(new BasicAuthModel.Builder("123", "abc")
                        .build())
                .environment(Environment.PRODUCTION)
                .subdomain(getEnvValue(SUBDOMAIN_ENV))
                .domain(getEnvValue(DOMAIN_ENV))
                .build();
    }

    private static String getEnvValue(String key) {
        String envValue = System.getenv(key);
        if (envValue == null) {
            throw new RuntimeException(key + " environment variable is not defined!");
        }
        return envValue;
    }
}
