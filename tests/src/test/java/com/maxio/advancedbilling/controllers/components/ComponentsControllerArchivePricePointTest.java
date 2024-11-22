package com.maxio.advancedbilling.controllers.components;

import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.ComponentPricePoint;
import com.maxio.advancedbilling.models.containers.ArchiveComponentPricePointComponentId;
import com.maxio.advancedbilling.models.containers.ArchiveComponentPricePointPricePointId;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.ZonedDateTime;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class ComponentsControllerArchivePricePointTest extends ComponentsControllerTestBase {

    private static Component component;

    @BeforeAll
    static void setupComponent() throws IOException, ApiException {
        component = createQuantityBasedComponent();
    }

    @Test
    void shouldArchivePricePoint() throws IOException, ApiException {
        // given
        ZonedDateTime timestamp = ZonedDateTime.now().minusSeconds(5);
        ComponentPricePoint componentPricePoint = TEST_SETUP.createComponentPricePoint(component.getId());

        // when
        ComponentPricePoint archivedPricePoint = COMPONENTS__PRICE_POINT_CONTROLLER.archiveComponentPricePoint(
                ArchiveComponentPricePointComponentId.fromNumber(component.getId()),
                ArchiveComponentPricePointPricePointId.fromNumber(componentPricePoint.getId())
        ).getPricePoint();

        // then
        assertThat(archivedPricePoint.getArchivedAt()).isNotNull();
        assertThat(archivedPricePoint.getArchivedAt()).isAfter(timestamp);
        assertThat(archivedPricePoint.getHandle()).isNull();

        assertThat(archivedPricePoint).usingRecursiveComparison()
                .ignoringFields("archivedAt", "handle")
                .isEqualTo(componentPricePoint);
    }

    @Test
    void shouldNotArchiveSamePricePointTwice() throws IOException, ApiException {
        // given
        ComponentPricePoint componentPricePoint = TEST_SETUP.createComponentPricePoint(component.getId());
        COMPONENTS__PRICE_POINT_CONTROLLER.archiveComponentPricePoint(
                ArchiveComponentPricePointComponentId.fromNumber(component.getId()),
                ArchiveComponentPricePointPricePointId.fromNumber(componentPricePoint.getId())
        );

        // when-then
        CommonAssertions
                .assertThatErrorListResponse(() -> COMPONENTS__PRICE_POINT_CONTROLLER.archiveComponentPricePoint(
                        ArchiveComponentPricePointComponentId.fromNumber(component.getId()),
                        ArchiveComponentPricePointPricePointId.fromNumber(componentPricePoint.getId()))
                )
                .isUnprocessableEntity()
                .hasErrors("Price point is already archived.");
    }

    @Test
    void shouldNotArchivePricePointWhenProvidingInvalidCredentials() {
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient().getComponentPricePointsController()
                .archiveComponentPricePoint(
                        ArchiveComponentPricePointComponentId.fromNumber(component.getId()),
                        ArchiveComponentPricePointPricePointId.fromNumber(component.getDefaultPricePointId()))
        );
    }

}
