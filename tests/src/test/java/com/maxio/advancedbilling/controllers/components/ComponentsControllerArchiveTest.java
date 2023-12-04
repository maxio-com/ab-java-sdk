package com.maxio.advancedbilling.controllers.components;

import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.ErrorListResponseException;
import com.maxio.advancedbilling.models.Component;
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
        Component archivedComponent = componentsController
                        .archiveComponent(productFamilyId, String.valueOf(component.getId()));

        // then
        assertThat(archivedComponent.getId()).isEqualTo(component.getId());
        assertThat(archivedComponent.getArchived()).isTrue();
        assertThat(archivedComponent.getArchivedAt()).isNotNull();
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
