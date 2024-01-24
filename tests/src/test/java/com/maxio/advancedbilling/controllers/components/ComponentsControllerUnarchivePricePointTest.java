package com.maxio.advancedbilling.controllers.components;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.ComponentPricePoint;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class ComponentsControllerUnarchivePricePointTest extends ComponentsControllerTestBase {

    private static Component component;

    @BeforeAll
    static void setupComponent() throws IOException, ApiException {
        component = createQuantityBasedComponent();
    }

    @Test
    void shouldUnarchivePricePoint() throws IOException, ApiException {
        // given
        ComponentPricePoint componentPricePoint = TEST_SETUP.createComponentPricePoint(component.getId());

        // when
        COMPONENTS_CONTROLLER
                .archiveComponentPricePoint(component.getId(), componentPricePoint.getId());
        ComponentPricePoint unarchivedPricePoint = COMPONENTS_CONTROLLER
                .unarchiveComponentPricePoint(component.getId(), componentPricePoint.getId())
                .getPricePoint();

        // then
        assertThat(unarchivedPricePoint.getArchivedAt()).isNull();
        assertThat(unarchivedPricePoint.getHandle()).isNotNull();

        assertThat(unarchivedPricePoint).usingRecursiveComparison()
                .ignoringFields("updatedAt", "handle")
                .isEqualTo(componentPricePoint);
    }

    @Test
    void shouldNotUnarchiveNonArchivedPricePoint() throws IOException, ApiException {
        // given
        ComponentPricePoint componentPricePoint = TEST_SETUP.createComponentPricePoint(component.getId());

        // when-then
        CommonAssertions
                .assertUnprocessableEntity(ApiException.class,
                        () -> COMPONENTS_CONTROLLER.unarchiveComponentPricePoint(component.getId(),
                                componentPricePoint.getId()));
    }

    @Test
    void shouldNotUnarchivePricePointWhenComponentDoesNotExist() {
        // when - then
        assertNotFound(() -> COMPONENTS_CONTROLLER
                .unarchiveComponentPricePoint(123, component.getDefaultPricePointId()));
    }

    @Test
    void shouldNotUnarchiveNonExistentPricePoints() {
        // when - then
        assertNotFound(() -> COMPONENTS_CONTROLLER.unarchiveComponentPricePoint(component.getId(), 123));
    }

    @Test
    void shouldNotArchivePricePointWhenProvidingInvalidCredentials() {
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getComponentsController()
                .unarchiveComponentPricePoint(component.getId(), component.getDefaultPricePointId()));
    }

}
