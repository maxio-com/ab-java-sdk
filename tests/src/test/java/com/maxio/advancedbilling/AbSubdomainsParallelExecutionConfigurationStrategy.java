package com.maxio.advancedbilling;

import org.junit.platform.commons.JUnitException;
import org.junit.platform.engine.ConfigurationParameters;
import org.junit.platform.engine.support.hierarchical.ParallelExecutionConfiguration;
import org.junit.platform.engine.support.hierarchical.ParallelExecutionConfigurationStrategy;

import static com.maxio.advancedbilling.TestClientProvider.getEnvValue;

public class AbSubdomainsParallelExecutionConfigurationStrategy implements ParallelExecutionConfigurationStrategy {

    private static final String SUBDOMAINS_KEY = "SUBDOMAINS";

    @Override
    public ParallelExecutionConfiguration createConfiguration(ConfigurationParameters configurationParameters) {
        String subdomains = getEnvValue(SUBDOMAINS_KEY);
        int subdomainsCount = subdomains.split(",").length;
        if (subdomainsCount == 0) {
            throw new JUnitException("Subdomains not specified");
        }
        return new AbParallelExecutionConfiguration(subdomainsCount);
    }

    static class AbParallelExecutionConfiguration implements ParallelExecutionConfiguration {

        private final int parallelism;
        // it's the same default as in DefaultParallelExecutionConfigurationStrategy
        private static final int KEEP_ALIVE_SECONDS = 30;

        AbParallelExecutionConfiguration(int parallelism) {
            this.parallelism = parallelism;
        }

        @Override
        public int getParallelism() {
            return parallelism;
        }

        @Override
        public int getMinimumRunnable() {
            return parallelism;
        }

        @Override
        public int getMaxPoolSize() {
            return parallelism;
        }

        @Override
        public int getCorePoolSize() {
            return parallelism;
        }

        @Override
        public int getKeepAliveSeconds() {
            return KEEP_ALIVE_SECONDS;
        }
    }
}
