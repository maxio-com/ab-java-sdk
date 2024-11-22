package com.maxio.advancedbilling;

import com.maxio.advancedbilling.authentication.BasicAuthModel;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;

public class TestClientProvider {

    private static final String DOMAIN_ENV = "DOMAIN";
    private static final String SUBDOMAINS_ENV = "SUBDOMAINS";
    private static final String API_KEYS_ENV = "API_KEYS";
    private static final String PRECONFIGURED_SITE_SUBDOMAIN_ENV = "PRECONFIGURED_SUBDOMAIN";
    private static final String PRECONFIGURED_API_KEY_ENV = "PRECONFIGURED_API_KEY";
    private static final String PASSWORD = "X";

    private static final ConcurrentHashMap<String, AdvancedBillingClient> clients = new ConcurrentHashMap<>();
    private static final ConcurrentLinkedDeque<AdvancedBillingClient> availableClients = new ConcurrentLinkedDeque<>();
    static {
        String[] subdomains = getEnvValue(SUBDOMAINS_ENV).split(",");
        String[] apiKeys = getEnvValue(API_KEYS_ENV).split(",");
        if (subdomains.length != apiKeys.length) {
            throw new RuntimeException("Subdomains and API keys lengths do not match");
        }
        for (int i = 0; i < subdomains.length; i++) {
            availableClients.add(createClient(subdomains[i], apiKeys[i]));
        }
    }

    public static AdvancedBillingClient getClient() {
        if (clients.containsKey(Thread.currentThread().getName())) {
            return clients.get(Thread.currentThread().getName());
        }
        AdvancedBillingClient testClient = availableClients.pollFirst();
        if (testClient == null) {
            throw new RuntimeException("No available client for thread.");
        }
        clients.put(Thread.currentThread().getName(), testClient);
        return testClient;
    }

    public static AdvancedBillingClient getPreconfiguredSiteClient() {
        return createClient(getEnvValue(PRECONFIGURED_SITE_SUBDOMAIN_ENV), getEnvValue(PRECONFIGURED_API_KEY_ENV));
    }

    public static AdvancedBillingClient createInvalidCredentialsClient() {
        String subdomain = getClient().getSubdomain();
        return new AdvancedBillingClient.Builder()
                .httpClientConfig(configBuilder -> configBuilder.timeout(10))
                .basicAuthCredentials(new BasicAuthModel.Builder("123", "abc")
                        .build())
                .environment(Environment.PRODUCTION)
                .subdomain(subdomain)
                .domain(getEnvValue(DOMAIN_ENV))
                .build();
    }

    public static List<AdvancedBillingClient> getAllClients() {
        return new ArrayList<>(clients.values());
    }

    public static String getEnvValue(String key) {
        String envValue = System.getenv(key);
        if (envValue == null) {
            throw new RuntimeException(key + " environment variable is not defined!");
        }
        return envValue;
    }

    private static AdvancedBillingClient createClient(String subdomain, String apiKey) {
        return new AdvancedBillingClient.Builder()
                .httpClientConfig(configBuilder -> configBuilder.timeout(30))
                .basicAuthCredentials(
                        new BasicAuthModel.Builder(apiKey, PASSWORD)
                                .build())
                .environment(Environment.PRODUCTION)
                .subdomain(subdomain)
                .domain(getEnvValue(DOMAIN_ENV))
                .build();
    }

}
