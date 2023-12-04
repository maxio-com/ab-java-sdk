package com.maxio.advancedbilling.controllers.components;

import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.ErrorListResponseException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.ComponentResponse;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.maxio.advancedbilling.utils.CommonAssertions.assertNotFound;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class ComponentsControllerArchiveTest extends ComponentsControllerTestBase {

    @Test
    void shouldArchiveComponent() throws IOException, ApiException {
        // given
        Component component = createComponent();

        // when
        ComponentResponse archivedComponent = componentsController
                        .archiveComponent(productFamilyId, String.valueOf(component.getId()));

        // then
        assertThat(archivedComponent.getComponent().getId()).isEqualTo(component.getId());
        assertThat(archivedComponent.getComponent().getArchived()).isTrue();
        assertThat(archivedComponent.getComponent().getArchivedAt()).isNotNull();
    }

    @Test
    void shouldNotArchiveAlreadyArchivedComponent() throws IOException, ApiException {
        // given
        Component component = createComponent();

        // when
        componentsController
                .archiveComponent(productFamilyId, String.valueOf(component.getId()));

        // then
        assertThatExceptionOfType(ErrorListResponseException.class)
                .isThrownBy(() -> componentsController
                        .archiveComponent(productFamilyId, String.valueOf(component.getId()))
                )
                .withMessage("Unprocessable Entity (WebDAV)")
                .satisfies(e -> {
                    assertThat(e.getResponseCode()).isEqualTo(422);
                    assertThat(e.getErrors())
                            .containsExactlyInAnyOrder("Component cannot be archived. " +
                                    "Please make sure it hasn't already been archived.");
                });
    }

    @Test
    void shouldNotArchiveNonExistentComponents() {
        // when-then
        assertNotFound(() -> componentsController.archiveComponent(productFamilyId, "999999"));
    }

}
