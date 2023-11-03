package com.maxio.advancedbilling;

public class TestClient {
    private static final String SUBDOMAIN_ENV = "SUBDOMAIN";
    private static final String DOMAIN_ENV = "DOMAIN";
    private static final String API_KEY_ENV = "API_KEY";

    private static final String USER_NAME = "X";

    public static AdvancedBillingClient createClient() {
        return new AdvancedBillingClient.Builder()
                .httpClientConfig(configBuilder -> configBuilder
                        .timeout(10))
                .basicAuthCredentials(getEnvValue(API_KEY_ENV), USER_NAME)
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
