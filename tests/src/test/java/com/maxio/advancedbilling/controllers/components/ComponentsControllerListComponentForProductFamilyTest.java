package com.maxio.advancedbilling.controllers.components;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.ComponentResponse;
import com.maxio.advancedbilling.models.ListComponentsForProductFamilyInput;
import com.maxio.advancedbilling.utils.TestTeardown;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class ComponentsControllerListComponentForProductFamilyTest extends ComponentsControllerTestBase {

    @BeforeAll
    static void removeActiveComponents() throws IOException, ApiException {
        new TestTeardown().deleteComponents();
    }

    @Test
    void shouldListComponentsForProductFamily() throws IOException, ApiException {
        // given
        ComponentResponse component1 = new ComponentResponse(createQuantityBasedComponent());
        ComponentResponse component2 = new ComponentResponse(TEST_SETUP.createMeteredComponent(productFamily, 2));

        // when
        List<ComponentResponse> componentResponseList = COMPONENTS_CONTROLLER.listComponentsForProductFamily(
                new ListComponentsForProductFamilyInput.Builder()
                        .productFamilyId(productFamilyId)
                        .includeArchived(false)
                        .build()
        );

        // then
        assertThat(componentResponseList)
                .usingRecursiveFieldByFieldElementComparator()
                .containsExactlyInAnyOrder(component1, component2);
    }

    @Test
    void shouldNotListComponentsForNonExistentProductFamily() {
        assertNotFound(() -> COMPONENTS_CONTROLLER
                .listComponentsForProductFamily(new ListComponentsForProductFamilyInput.Builder()
                        .productFamilyId(4)
                        .build()));
    }

    @Test
    void shouldNotListComponentsForProductFamilyProvidingInvalidCredentials() {
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getComponentsController()
                .listComponentsForProductFamily(new ListComponentsForProductFamilyInput.Builder()
                        .productFamilyId(4)
                        .build()));
    }

}
