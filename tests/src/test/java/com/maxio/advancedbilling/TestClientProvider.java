package com.maxio.advancedbilling;

import com.maxio.advancedbilling.authentication.BasicAuthModel;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class TestClientProvider {

    private static final String SUBDOMAINS_ENV = "SUBDOMAINS";
    private static final String API_KEYS_ENV = "API_KEYS";
    private static final String PRECONFIGURED_SITE_SUBDOMAIN_ENV = "PRECONFIGURED_SUBDOMAIN";
    private static final String PRECONFIGURED_API_KEY_ENV = "PRECONFIGURED_API_KEY";
    private static final String PASSWORD = "X";
    private static final AtomicInteger nextIndex = new AtomicInteger(0);

    private static final ArrayList<AdvancedBillingClient> clients;
    static {
        String[] subdomains = getEnvValue(SUBDOMAINS_ENV).split(",");
        String[] apiKeys = getEnvValue(API_KEYS_ENV).split(",");
        if (subdomains.length != apiKeys.length) {
            throw new RuntimeException("Subdomains and API keys lengths do not match");
        }
        clients = new ArrayList<>(subdomains.length);
        for (int i = 0; i < subdomains.length; i++) {
            clients.add(createClient(subdomains[i], apiKeys[i]));
        }
    }

    public static AdvancedBillingClient getClient() {
        try {
            return clients.get(threadIndex.get());
        } catch (IndexOutOfBoundsException e) {
            throw new RuntimeException("No available client for thread.");
        }
    }

    public static AdvancedBillingClient getPreconfiguredSiteClient() {
        return createClient(getEnvValue(PRECONFIGURED_SITE_SUBDOMAIN_ENV), getEnvValue(PRECONFIGURED_API_KEY_ENV));
    }

    public static AdvancedBillingClient createInvalidCredentialsClient() {
        return createInvalidCredentialsClient(getClient().getSite());
    }

    public static AdvancedBillingClient createInvalidCredentialsClient(String subdomain) {
        return new AdvancedBillingClient.Builder()
                .httpClientConfig(configBuilder -> configBuilder.timeout(10))
                .basicAuthCredentials(new BasicAuthModel.Builder("123", "abc")
                        .build())
                .site(subdomain)
                .build();
    }

    public static List<AdvancedBillingClient> getAllClients() {
        return clients;
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
                .httpClientConfig(configBuilder -> configBuilder.timeout(45))
                .basicAuthCredentials(
                        new BasicAuthModel.Builder(apiKey, PASSWORD)
                                .build())
                .site(subdomain)
                .build();
    }

    private static final ThreadLocal<Integer> threadIndex = ThreadLocal.withInitial(nextIndex::getAndIncrement);

}
