package com.maxio.advancedbilling.controllers.components;

import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.maxio.advancedbilling.utils.CommonAssertions.assertNotFound;
import static org.assertj.core.api.Assertions.assertThat;

public class ComponentsControllerFindTest extends ComponentsControllerTestBase {

    @Test
    void shouldFindComponent() throws IOException, ApiException {
        // given
        Component component = createComponent();

        // when
        Component foundComponent = componentsController
                        .readComponentByHandle(component.getHandle())
                        .getComponent();

        // then
        assertThat(foundComponent).usingRecursiveComparison()
                .isEqualTo(component);
    }

    @Test
    void shouldNotFindNonExistentComponent() {
        assertNotFound(() -> componentsController.readComponentByHandle("non-existent-handle"));
    }

}
