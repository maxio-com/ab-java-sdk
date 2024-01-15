package com.maxio.advancedbilling.controllers.components;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class ComponentsControllerReadTest extends ComponentsControllerTestBase {

    @Test
    void shouldReadComponentById() throws IOException, ApiException {
        // given
        Component component = createQuantityBasedComponent();

        // when
        Component foundComponent = COMPONENTS_CONTROLLER
                        .readComponentById(productFamilyId, String.valueOf(component.getId()))
                        .getComponent();

        // then
        assertThat(foundComponent).usingRecursiveComparison()
                .isEqualTo(component);
    }

    @Test
    void shouldReadComponentByHandle() throws IOException, ApiException {
        // given
        Component component = createQuantityBasedComponent();

        // when
        Component foundComponent = COMPONENTS_CONTROLLER
                .readComponentById(productFamilyId, "handle:" + component.getHandle())
                .getComponent();

        // then
        assertThat(foundComponent).usingRecursiveComparison()
                .isEqualTo(component);
    }

    @Test
    void shouldNotReadNonExistentComponentUsingId() {
        assertNotFound(() -> COMPONENTS_CONTROLLER.readComponentById(productFamilyId,
                "non-existent-id"));
    }

    @Test
    void shouldNotReadNonExistentComponentUsingHandle() {
        assertNotFound(() -> COMPONENTS_CONTROLLER.readComponentById(productFamilyId,
                "handle:non-existent-id"));
    }

    @Test
    void shouldNotReadComponentWhenProvidingInvalidCredentials() throws IOException, ApiException {
        // given
        Component component = createQuantityBasedComponent();

        // when - then
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getComponentsController()
                .readComponentById(productFamilyId, String.valueOf(component.getId())));
    }

}
