package com.maxio.advancedbilling.controllers.components;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.ComponentResponse;
import com.maxio.advancedbilling.models.ListComponentsInput;
import com.maxio.advancedbilling.utils.TestTeardown;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class ComponentsControllerListTest extends ComponentsControllerTestBase {

    @BeforeAll
    static void removeActiveComponents() throws IOException, ApiException {
        new TestTeardown().archiveComponents();
    }

    @Test
    void shouldListComponents() throws IOException, ApiException {
        // given
        ComponentResponse component1 = new ComponentResponse(createQuantityBasedComponent());
        ComponentResponse component2 = new ComponentResponse(createMeteredComponent(2));

        // when
        List<ComponentResponse> componentResponseList = COMPONENTS_CONTROLLER.listComponents(
                new ListComponentsInput.Builder()
                        .includeArchived(false)
                        .build()
        );

        // then
        assertThat(componentResponseList)
                .usingRecursiveFieldByFieldElementComparator()
                .containsExactlyInAnyOrder(component1, component2);
    }

    @Test
    void shouldNotListComponentsWhenProvidingInvalidCredentials() {
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getComponentsController()
                .listComponents(new ListComponentsInput()));
    }

}
