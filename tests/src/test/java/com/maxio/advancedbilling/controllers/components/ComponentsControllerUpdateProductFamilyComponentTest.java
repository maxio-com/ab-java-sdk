package com.maxio.advancedbilling.controllers.components;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.ErrorListResponseException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.CreditType;
import com.maxio.advancedbilling.models.ItemCategory;
import com.maxio.advancedbilling.models.UpdateComponent;
import com.maxio.advancedbilling.models.UpdateComponentRequest;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnprocessableEntity;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

public class ComponentsControllerUpdateProductFamilyComponentTest extends ComponentsControllerTestBase {

    @Test
    void shouldUpdateProductFamilyComponent() throws IOException, ApiException {
        // given
        Component component = createQuantityBasedComponent();
        UpdateComponent updateComponent = new UpdateComponent.Builder()
                .name("updatedName")
                .handle("updated-handle-" + RandomStringUtils.randomAlphanumeric(5).toLowerCase())
                .description("updatedDescription")
                .accountingCode("updatedAccountingCode")
                .taxCode("taxCode")
                .taxable(true)
                .itemCategory(ItemCategory.ENUM_DIGITAL_SERVICES)
                .displayOnHostedPage(false)
                .upgradeCharge(CreditType.FULL)
                .build();

        // when
        Component updatedComponent = COMPONENTS_CONTROLLER
                        .updateProductFamilyComponent(productFamilyId,
                                String.valueOf(component.getId()),
                                new UpdateComponentRequest(updateComponent)
                                )
                        .getComponent();

        // then
        assertAll(
                () -> assertThat(updatedComponent.getId()).isEqualTo(component.getId()),
                () -> assertThat(updatedComponent.getName()).isEqualTo("updatedName"),
                () -> assertThat(updatedComponent.getHandle()).isEqualTo(updateComponent.getHandle()),
                () -> assertThat(updatedComponent.getAccountingCode()).isEqualTo("updatedAccountingCode"),
                () -> assertThat(updatedComponent.getTaxCode()).isEqualTo("taxCode"),
                () -> assertThat(updatedComponent.getTaxable()).isTrue(),
                () -> assertThat(updatedComponent.getItemCategory()).isEqualTo(ItemCategory.ENUM_DIGITAL_SERVICES),
                () -> assertThat(updatedComponent.getUpgradeCharge()).isEqualTo(CreditType.FULL),
                () -> assertThat(updatedComponent.getUpdatedAt()).isNotNull()
                );
    }

    @Test
    void shouldUpdateProductFamilyComponentSettingValuesToNulls() throws IOException, ApiException {
        // given
        Component component = createQuantityBasedComponent();
        UpdateComponent updateComponent = new UpdateComponent.Builder()
                .description(null)
                .accountingCode(null)
                .taxCode(null)
                .itemCategory(null)
                .upgradeCharge(null)
                .build();

        // when
        Component updatedComponent = COMPONENTS_CONTROLLER
                .updateProductFamilyComponent(productFamilyId,
                        String.valueOf(component.getId()),
                        new UpdateComponentRequest(updateComponent)
                )
                .getComponent();

        // then
        assertAll(
                () -> assertThat(updatedComponent.getId()).isEqualTo(component.getId()),
                () -> assertThat(updatedComponent.getName()).isEqualTo(component.getName()),
                () -> assertThat(updatedComponent.getHandle()).isEqualTo(component.getHandle()),
                () -> assertThat(updatedComponent.getAccountingCode()).isNull(),
                () -> assertThat(updatedComponent.getTaxCode()).isNull(),
                () -> assertThat(updatedComponent.getItemCategory()).isNull(),
                () -> assertThat(updatedComponent.getUpgradeCharge()).isNull(),
                () -> assertThat(updatedComponent.getUpdatedAt()).isNotNull()
        );
    }

    @Test
    void shouldReturn422WhenHandleIsIncorrect() throws IOException, ApiException {
        // given
        Component component = createQuantityBasedComponent();
        UpdateComponent updateComponent = new UpdateComponent.Builder()
                .handle("updatedHandle")
                .build();

        // when-then
        assertUnprocessableEntity(
                ErrorListResponseException.class,
                () -> COMPONENTS_CONTROLLER.updateProductFamilyComponent(productFamilyId,
                        String.valueOf(component.getId()), new UpdateComponentRequest(updateComponent)),
                e -> assertThat(e.getErrors()).containsExactlyInAnyOrder("Handle must start with a letter " +
                        "or number and may only contain lowercase letters, numbers, or the characters ':', '-', or '_'.")
        );
    }

    @Test
    void shouldReturn422WhenHandleIsAlreadyTaken() throws IOException, ApiException {
        // given
        Component component = createQuantityBasedComponent();
        Component component2 = createQuantityBasedComponent();
        UpdateComponent updateComponent = new UpdateComponent.Builder()
                .handle(component2.getHandle())
                .build();

        // when-then
        assertUnprocessableEntity(
                ErrorListResponseException.class,
                () -> COMPONENTS_CONTROLLER.updateProductFamilyComponent(productFamilyId,
                        String.valueOf(component.getId()), new UpdateComponentRequest(updateComponent)),
                e -> assertThat(e.getErrors()).containsExactlyInAnyOrder("Handle must be unique within a Site.")
        );
    }

    @Test
    void shouldNotUpdateNonExistentComponent() {
        assertNotFound(() -> COMPONENTS_CONTROLLER
                .updateProductFamilyComponent(productFamilyId, "99999", null));
    }

    @Test
    void shouldNotUpdateComponentWhenProvidingInvalidCredentials() throws IOException, ApiException {
        // given
        Component component = createQuantityBasedComponent();

        // when-then
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getComponentsController()
                .updateProductFamilyComponent(productFamilyId, String.valueOf(component.getId()),
                        new UpdateComponentRequest()));
    }

}
