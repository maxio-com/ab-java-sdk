package com.maxio.advancedbilling;

import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CleanupScope;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestPlan;

import java.io.IOException;
import java.util.List;

/**
 * To make this class registered within JUnit platform, it must have been added:
 * {@link /test/resources/META-INF/services/org.junit.platform.launcher.TestExecutionListener}
 */
public class PlanExecutionFinishedListener implements TestExecutionListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(PlanExecutionFinishedListener.class);

    @Override
    public void testPlanExecutionFinished(TestPlan testPlan) {
        List<AdvancedBillingClient> clients = TestClientProvider.getAllClients();
        for (AdvancedBillingClient client : clients) {
            try {
                client.getSitesController().clearSite(CleanupScope.ALL);
                LOGGER.info(() -> "testPlanExecutionFinished | Successfully cleared site data %s"
                        .formatted(client.getSite()));
            } catch (ApiException | IOException e) {
                LOGGER.error(e, () -> "testPlanExecutionFinished | Failed to clear site data %s"
                        .formatted(client.getSite()));
            }
        }
    }
}
