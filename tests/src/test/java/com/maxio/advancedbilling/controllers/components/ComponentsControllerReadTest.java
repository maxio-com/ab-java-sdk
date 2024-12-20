package com.maxio.advancedbilling.controllers.components;

import com.maxio.advancedbilling.TestClientProvider;
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
                        .readComponent(productFamilyId, String.valueOf(component.getId()))
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
                .readComponent(productFamilyId, "handle:" + component.getHandle())
                .getComponent();

        // then
        assertThat(foundComponent).usingRecursiveComparison()
                .isEqualTo(component);
    }

    @Test
    void shouldNotReadNonExistentComponentUsingId() {
        assertNotFound(() -> COMPONENTS_CONTROLLER.readComponent(productFamilyId,
                "non-existent-id"));
    }

    @Test
    void shouldNotReadNonExistentComponentUsingHandle() {
        assertNotFound(() -> COMPONENTS_CONTROLLER.readComponent(productFamilyId,
                "handle:non-existent-id"));
    }

    @Test
    void shouldNotReadComponentWhenProvidingInvalidCredentials() throws IOException, ApiException {
        // given
        Component component = createQuantityBasedComponent();

        // when - then
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient().getComponentsController()
                .readComponent(productFamilyId, String.valueOf(component.getId())));
    }

}
