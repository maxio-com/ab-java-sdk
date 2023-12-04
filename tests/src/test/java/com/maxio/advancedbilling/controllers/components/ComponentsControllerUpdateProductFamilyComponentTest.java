package com.maxio.advancedbilling.controllers.components;

import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.CreditType;
import com.maxio.advancedbilling.models.ItemCategory;
import com.maxio.advancedbilling.models.UpdateComponent;
import com.maxio.advancedbilling.models.UpdateComponentRequest;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

import static com.maxio.advancedbilling.utils.CommonAssertions.assertNotFound;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

public class ComponentsControllerUpdateProductFamilyComponentTest extends ComponentsControllerTestBase {

    @Test
    void shouldUpdateProductFamilyComponent() throws IOException, ApiException {
        // given
        Component component = createComponent();
        UpdateComponent updateComponent = new UpdateComponent.Builder()
                .name("updatedName")
                .handle("updatedHandle")
                .description("updatedDescription")
                .accountingCode("updatedAccountingCode")
                .taxable(true)
                .itemCategory(ItemCategory.ENUM_DIGITAL_SERVICES)
                .displayOnHostedPage(false)
                .upgradeCharge(CreditType.FULL)
                .build();

        // when
        Component updatedComponent = componentsController
                        .updateProductFamilyComponent(productFamilyId,
                                String.valueOf(component.getId()),
                                new UpdateComponentRequest(updateComponent)
                                )
                        .getComponent();

        // then
        assertAll(
                () -> assertThat(updatedComponent.getId()).isEqualTo(component.getId()),
                () -> assertThat(updatedComponent.getName()).isEqualTo("updatedName"),
                () -> assertThat(updatedComponent.getHandle()).isEqualTo("updatedHandle"),
                () -> assertThat(updatedComponent.getAccountingCode()).isEqualTo("updatedAccountingCode"),
                () -> assertThat(updatedComponent.getTaxable()).isTrue(),
                () -> assertThat(updatedComponent.getItemCategory()).isEqualTo(ItemCategory.ENUM_DIGITAL_SERVICES),
                () -> assertThat(updatedComponent.getUpgradeCharge()).isEqualTo(CreditType.FULL.value()),
                () -> assertThat(updatedComponent.getUpdatedAt()).isNotNull()
                );
        assertThat(updatedComponent).usingRecursiveComparison()
                .isEqualTo(component);
    }

    @Test
    void shouldNotUpdateNonExistentComponent() {
        assertNotFound(() -> componentsController
                .updateProductFamilyComponent(productFamilyId, 99999));
    }

}
