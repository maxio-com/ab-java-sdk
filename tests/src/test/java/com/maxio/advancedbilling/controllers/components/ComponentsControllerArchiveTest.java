package com.maxio.advancedbilling.controllers.components;

import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.ErrorListResponseException;
import com.maxio.advancedbilling.models.Component;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnprocessableEntity;
import static org.assertj.core.api.Assertions.assertThat;

public class ComponentsControllerArchiveTest extends ComponentsControllerTestBase {

    @Test
    void shouldArchiveComponent() throws IOException, ApiException {
        // given
        Component component = createQuantityBasedComponent();

        // when
        Component archivedComponent = COMPONENTS_CONTROLLER
                        .archiveComponent(productFamilyId, String.valueOf(component.getId()));

        // then
        assertThat(archivedComponent.getId()).isEqualTo(component.getId());
        assertThat(archivedComponent.getArchived()).isTrue();
        assertThat(archivedComponent.getArchivedAt()).isNotNull();
    }

    @Test
    void shouldNotArchiveAlreadyArchivedComponent() throws IOException, ApiException {
        // given
        Component component = createQuantityBasedComponent();

        // when
        COMPONENTS_CONTROLLER
                .archiveComponent(productFamilyId, String.valueOf(component.getId()));

        // then
        assertUnprocessableEntity(
                ErrorListResponseException.class,
                () -> COMPONENTS_CONTROLLER
                        .archiveComponent(productFamilyId, String.valueOf(component.getId())),
                e -> assertThat(e.getErrors())
                        .containsExactlyInAnyOrder("Component cannot be archived. " +
                                "Please make sure it hasn't already been archived.")

        );
    }

    @Test
    void shouldNotArchiveNonExistentComponents() {
        // when-then
        assertNotFound(() -> COMPONENTS_CONTROLLER.archiveComponent(productFamilyId, "999999"));
    }

}
