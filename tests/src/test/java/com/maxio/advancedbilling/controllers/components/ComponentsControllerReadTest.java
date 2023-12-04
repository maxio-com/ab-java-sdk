package com.maxio.advancedbilling.controllers.components;

import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.maxio.advancedbilling.utils.CommonAssertions.assertNotFound;
import static org.assertj.core.api.Assertions.assertThat;

public class ComponentsControllerReadTest extends ComponentsControllerTestBase {

    @Test
    void shouldReadComponentById() throws IOException, ApiException {
        // given
        Component component = createComponent();

        // when
        Component foundComponent = componentsController
                        .readComponentById(productFamilyId, String.valueOf(component.getId()))
                        .getComponent();

        // then
        assertThat(foundComponent).usingRecursiveComparison()
                .isEqualTo(component);
    }

    @Test
    void shouldReadComponentByHandle() throws IOException, ApiException {
        // given
        Component component = createComponent();

        // when
        Component foundComponent = componentsController
                .readComponentById(productFamilyId, "handle:" + component.getHandle())
                .getComponent();

        // then
        assertThat(foundComponent).usingRecursiveComparison()
                .isEqualTo(component);
    }

    @Test
    void shouldNotReadNonExistentComponentUsingId() {
        assertNotFound(() -> componentsController.readComponentById(productFamilyId,
                "non-existent-id"));
    }

    @Test
    void shouldNotReadNonExistentComponentUsingHandle() {
        assertNotFound(() -> componentsController.readComponentById(productFamilyId,
                "handle:non-existent-id"));
    }

}
