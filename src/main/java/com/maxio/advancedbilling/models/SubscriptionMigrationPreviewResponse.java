/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for SubscriptionMigrationPreviewResponse type.
 */
public class SubscriptionMigrationPreviewResponse {
    private SubscriptionMigrationPreview migration;

    /**
     * Default constructor.
     */
    public SubscriptionMigrationPreviewResponse() {
    }

    /**
     * Initialization constructor.
     * @param  migration  SubscriptionMigrationPreview value for migration.
     */
    public SubscriptionMigrationPreviewResponse(
            SubscriptionMigrationPreview migration) {
        this.migration = migration;
    }

    /**
     * Getter for Migration.
     * @return Returns the SubscriptionMigrationPreview
     */
    @JsonGetter("migration")
    public SubscriptionMigrationPreview getMigration() {
        return migration;
    }

    /**
     * Setter for Migration.
     * @param migration Value for SubscriptionMigrationPreview
     */
    @JsonSetter("migration")
    public void setMigration(SubscriptionMigrationPreview migration) {
        this.migration = migration;
    }

    /**
     * Converts this SubscriptionMigrationPreviewResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionMigrationPreviewResponse [" + "migration=" + migration + "]";
    }

    /**
     * Builds a new {@link SubscriptionMigrationPreviewResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionMigrationPreviewResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(migration);
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionMigrationPreviewResponse}.
     */
    public static class Builder {
        private SubscriptionMigrationPreview migration;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  migration  SubscriptionMigrationPreview value for migration.
         */
        public Builder(SubscriptionMigrationPreview migration) {
            this.migration = migration;
        }

        /**
         * Setter for migration.
         * @param  migration  SubscriptionMigrationPreview value for migration.
         * @return Builder
         */
        public Builder migration(SubscriptionMigrationPreview migration) {
            this.migration = migration;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionMigrationPreviewResponse} object using the set fields.
         * @return {@link SubscriptionMigrationPreviewResponse}
         */
        public SubscriptionMigrationPreviewResponse build() {
            return new SubscriptionMigrationPreviewResponse(migration);
        }
    }
}
