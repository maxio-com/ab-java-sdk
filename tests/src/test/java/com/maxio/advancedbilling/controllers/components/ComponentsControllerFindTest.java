package com.maxio.advancedbilling.controllers.components;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.ListComponentsInput;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class ComponentsControllerFindTest extends ComponentsControllerTestBase {

    @Test
    void shouldFindComponent() throws IOException, ApiException {
        // given
        Component component = createQuantityBasedComponent();

        // when
        Component foundComponent = COMPONENTS_CONTROLLER
                        .readComponentByHandle(component.getHandle())
                        .getComponent();

        // then
        assertThat(foundComponent).usingRecursiveComparison()
                .isEqualTo(component);
    }

    @Test
    void shouldNotFindNonExistentComponent() {
        assertNotFound(() -> COMPONENTS_CONTROLLER.readComponentByHandle("non-existent-handle"));
    }

    @Test
    void shouldNotFindComponentWhenProvidingInvalidCredentials() throws IOException, ApiException {
        // given
        Component component = createQuantityBasedComponent();

        // when - then
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getComponentsController()
                .readComponentByHandle(component.getHandle()));
    }

}
