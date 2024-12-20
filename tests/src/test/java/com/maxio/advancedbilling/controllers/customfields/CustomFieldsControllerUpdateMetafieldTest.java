package com.maxio.advancedbilling.controllers.customfields;

import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.CustomFieldsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CreateMetafield;
import com.maxio.advancedbilling.models.CreateMetafieldsRequest;
import com.maxio.advancedbilling.models.Metafield;
import com.maxio.advancedbilling.models.MetafieldInput;
import com.maxio.advancedbilling.models.MetafieldScope;
import com.maxio.advancedbilling.models.ResourceType;
import com.maxio.advancedbilling.models.UpdateMetafield;
import com.maxio.advancedbilling.models.UpdateMetafieldsRequest;
import com.maxio.advancedbilling.models.containers.CreateMetafieldsRequestMetafields;
import com.maxio.advancedbilling.models.containers.UpdateMetafieldsRequestMetafields;
import com.maxio.advancedbilling.utils.TestTeardown;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
import com.maxio.advancedbilling.utils.matchers.MetafieldEnumGetter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.io.IOException;
import java.util.List;

import static com.maxio.advancedbilling.controllers.customfields.CustomFieldsTestsUtils.randomScope;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.assertj.core.api.Assertions.assertThat;

public class CustomFieldsControllerUpdateMetafieldTest {

    private static final CustomFieldsController CUSTOM_FIELDS_CONTROLLER =
            TestClientProvider.getClient().getCustomFieldsController();

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteMetafields();
    }

    @ParameterizedTest
    @EnumSource(ResourceType.class)
    void shouldUpdateMetafieldEnumAndScope(ResourceType resourceType) throws IOException, ApiException {
        // given
        String metafieldName = "test-metafield-" + randomNumeric(10);
        CreateMetafieldsRequest createMetafieldsRequest =
                new CreateMetafieldsRequest(
                        CreateMetafieldsRequestMetafields.fromCreateMetafield(
                                new CreateMetafield.Builder()
                                        .name(metafieldName)
                                        .inputType(MetafieldInput.DROPDOWN)
                                        .mEnum(List.of("option-1", "option-2"))
                                        .scope(randomScope())
                                        .build()
                        ));

        List<String> updatedEnum = List.of("new-option-1", "new-option-2");
        MetafieldScope updatedScope = randomScope();
        UpdateMetafieldsRequest updateMetafieldsRequest =
                new UpdateMetafieldsRequest(
                        UpdateMetafieldsRequestMetafields.fromUpdateMetafield(
                                new UpdateMetafield.Builder()
                                        .name(metafieldName)
                                        .mEnum(updatedEnum)
                                        .scope(updatedScope)
                                        .build()
                        ));
        // when
        Metafield createdMetafield = CUSTOM_FIELDS_CONTROLLER.createMetafields(resourceType, createMetafieldsRequest)
                .get(0);
        List<Metafield> updateMetafieldsResponse = CUSTOM_FIELDS_CONTROLLER.updateMetafield(resourceType, updateMetafieldsRequest);

        // then
        assertThat(updateMetafieldsResponse.size()).isEqualTo(1);
        Metafield updatedMetafield = updateMetafieldsResponse.get(0);
        assertThat(updatedMetafield.getId()).isEqualTo(createdMetafield.getId());
        assertThat(updatedMetafield.getName()).isEqualTo(metafieldName);
        assertThat(updatedMetafield.getDataCount()).isEqualTo(0);
        assertThat(updatedMetafield.getInputType()).isEqualTo(createdMetafield.getInputType());
        assertThat(updatedMetafield.getEnum()
                .match(new MetafieldEnumGetter<List<String>>()))
                .isEqualTo(updatedEnum);
        assertThat(updatedMetafield.getScope()).usingRecursiveComparison().isEqualTo(updatedScope);
    }

    @ParameterizedTest
    @EnumSource(ResourceType.class)
    void shouldUpdateMultipleMetafields(ResourceType resourceType) throws IOException, ApiException {
        // given
        String metafieldName1 = "test-metafield-" + randomNumeric(10);
        String metafieldName2 = "test-metafield-" + randomNumeric(10);
        List<String> menum = List.of("radio-option-1", "radio-option-2");
        MetafieldScope scope = randomScope();

        CreateMetafieldsRequest createMetafieldsRequest =
                new CreateMetafieldsRequest(
                        CreateMetafieldsRequestMetafields.fromListOfCreateMetafield(
                                List.of(
                                        new CreateMetafield.Builder()
                                                .name(metafieldName1)
                                                .inputType(MetafieldInput.RADIO)
                                                .mEnum(menum)
                                                .scope(scope)
                                                .build(),
                                        new CreateMetafield.Builder()
                                                .name(metafieldName2)
                                                .inputType(MetafieldInput.DROPDOWN)
                                                .mEnum(menum)
                                                .scope(scope)
                                                .build()
                                )
                        ));

        String updatedName1 = "updated-metafield-name-" + randomNumeric(10);
        String updatedName2 = "updated-metafield-name-" + randomNumeric(10);

        UpdateMetafieldsRequest updateMetafieldsRequest =
                new UpdateMetafieldsRequest(
                        UpdateMetafieldsRequestMetafields.fromListOfUpdateMetafield(
                                List.of(
                                        new UpdateMetafield.Builder()
                                                .currentName(metafieldName1)
                                                .name(updatedName1)
                                                .build(),
                                        new UpdateMetafield.Builder()
                                                .currentName(metafieldName2)
                                                .name(updatedName2)
                                                .build()
                                )
                        ));
        // when
        List<Metafield> createdMetafields = CUSTOM_FIELDS_CONTROLLER.createMetafields(resourceType, createMetafieldsRequest);
        List<Metafield> updatedMetafields = CUSTOM_FIELDS_CONTROLLER.updateMetafield(resourceType, updateMetafieldsRequest);


        // then
        assertThat(updatedMetafields.size()).isEqualTo(2);
        assertThat(updatedMetafields.get(0)).usingRecursiveComparison()
                .ignoringFields("name").isEqualTo(createdMetafields.get(0));
        assertThat(updatedMetafields.get(0).getName()).isEqualTo(updatedName1);
        assertThat(updatedMetafields.get(1)).usingRecursiveComparison()
                .ignoringFields("name").isEqualTo(createdMetafields.get(1));
        assertThat(updatedMetafields.get(1).getName()).isEqualTo(updatedName2);
    }

    @ParameterizedTest
    @EnumSource(ResourceType.class)
    void shouldUpdateMetafieldInputTypeToText(ResourceType resourceType) throws IOException, ApiException {
        // given
        String metafieldName = "test-metafield-" + randomNumeric(10);
        CreateMetafieldsRequest createMetafieldsRequest =
                new CreateMetafieldsRequest(
                        CreateMetafieldsRequestMetafields.fromCreateMetafield(
                                new CreateMetafield.Builder()
                                        .name(metafieldName)
                                        .inputType(MetafieldInput.DROPDOWN)
                                        .mEnum(List.of("option-1", "option-2"))
                                        .scope(randomScope())
                                        .build()
                        ));

        UpdateMetafieldsRequest updateMetafieldsRequest =
                new UpdateMetafieldsRequest(
                        UpdateMetafieldsRequestMetafields.fromUpdateMetafield(
                                new UpdateMetafield.Builder()
                                        .name(metafieldName)
                                        .inputType(MetafieldInput.TEXT)
                                        .build()
                        ));
        // when
        Metafield createdMetafield = CUSTOM_FIELDS_CONTROLLER.createMetafields(resourceType, createMetafieldsRequest)
                .get(0);
        List<Metafield> updateMetafieldsResponse = CUSTOM_FIELDS_CONTROLLER.updateMetafield(resourceType, updateMetafieldsRequest);

        // then
        assertThat(updateMetafieldsResponse.size()).isEqualTo(1);
        Metafield updatedMetafield = updateMetafieldsResponse.get(0);
        assertThat(updatedMetafield).usingRecursiveComparison().ignoringFields("inputType")
                .isEqualTo(createdMetafield);
        assertThat(updatedMetafield.getInputType()).isEqualTo(MetafieldInput.TEXT);
    }

    @ParameterizedTest
    @EnumSource(ResourceType.class)
    void shouldUpdateMetafieldInputTypeToDropdown(ResourceType resourceType) throws IOException, ApiException {
        // given
        String metafieldName = "test-metafield-" + randomNumeric(5);
        CreateMetafieldsRequest createMetafieldsRequest =
                new CreateMetafieldsRequest(
                        CreateMetafieldsRequestMetafields.fromCreateMetafield(
                                new CreateMetafield.Builder()
                                        .name(metafieldName)
                                        .inputType(MetafieldInput.TEXT)
                                        .scope(randomScope())
                                        .build()
                        ));
        List<String> mEnum = List.of("dropdown-option-1", "dropdown-option-2");
        UpdateMetafieldsRequest updateMetafieldsRequest =
                new UpdateMetafieldsRequest(
                        UpdateMetafieldsRequestMetafields.fromUpdateMetafield(
                                new UpdateMetafield.Builder()
                                        .name(metafieldName)
                                        .inputType(MetafieldInput.DROPDOWN)
                                        .mEnum(mEnum)
                                        .build()
                        ));
        // when
        Metafield createdMetafield = CUSTOM_FIELDS_CONTROLLER.createMetafields(resourceType, createMetafieldsRequest)
                .get(0);
        List<Metafield> updateMetafieldsResponse = CUSTOM_FIELDS_CONTROLLER.updateMetafield(resourceType, updateMetafieldsRequest);

        // then
        assertThat(updateMetafieldsResponse.size()).isEqualTo(1);
        Metafield updatedMetafield = updateMetafieldsResponse.get(0);
        assertThat(updatedMetafield).usingRecursiveComparison().ignoringFields("inputType", "mEnum")
                .isEqualTo(createdMetafield);
        assertThat(updatedMetafield.getInputType()).isEqualTo(MetafieldInput.DROPDOWN);
        assertThat(updatedMetafield.getEnum()
                .match(new MetafieldEnumGetter<List<String>>()))
                .isEqualTo(mEnum);
    }

    @Test
    void shouldReturn422WhenUpdatingMetafieldNameToExistingName() throws IOException, ApiException {
        // given
        CUSTOM_FIELDS_CONTROLLER.createMetafields(ResourceType.SUBSCRIPTIONS, new CreateMetafieldsRequest(
                CreateMetafieldsRequestMetafields.fromCreateMetafield(
                        new CreateMetafield.Builder()
                                .name("abc1")
                                .build()
                )));
        CUSTOM_FIELDS_CONTROLLER.createMetafields(ResourceType.SUBSCRIPTIONS, new CreateMetafieldsRequest(
                CreateMetafieldsRequestMetafields.fromCreateMetafield(
                        new CreateMetafield.Builder()
                                .name("abc2")
                                .build()
                )));

        // when - then
        CommonAssertions.assertThatSingleErrorResponse(
                () -> CUSTOM_FIELDS_CONTROLLER.updateMetafield(ResourceType.SUBSCRIPTIONS, new UpdateMetafieldsRequest(
                        UpdateMetafieldsRequestMetafields.fromUpdateMetafield(
                                new UpdateMetafield.Builder()
                                        .currentName("abc1")
                                        .name("abc2")
                                        .build()
                        )))
                )
                .isUnprocessableEntity()
                .hasErrorMessage("Metafield name must be unique for the Attachment Type");
    }

    @Test
    void shouldNotUpdateMetafieldsWhenProvidingInvalidCredentials() {
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient().getCustomFieldsController()
                .updateMetafield(ResourceType.SUBSCRIPTIONS, null));
    }

}
