/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for SubscriptionMigrationPreviewRequest type.
 */
public class SubscriptionMigrationPreviewRequest {
    private SubscriptionMigrationPreviewOptions migration;

    /**
     * Default constructor.
     */
    public SubscriptionMigrationPreviewRequest() {
    }

    /**
     * Initialization constructor.
     * @param  migration  SubscriptionMigrationPreviewOptions value for migration.
     */
    public SubscriptionMigrationPreviewRequest(
            SubscriptionMigrationPreviewOptions migration) {
        this.migration = migration;
    }

    /**
     * Getter for Migration.
     * @return Returns the SubscriptionMigrationPreviewOptions
     */
    @JsonGetter("migration")
    public SubscriptionMigrationPreviewOptions getMigration() {
        return migration;
    }

    /**
     * Setter for Migration.
     * @param migration Value for SubscriptionMigrationPreviewOptions
     */
    @JsonSetter("migration")
    public void setMigration(SubscriptionMigrationPreviewOptions migration) {
        this.migration = migration;
    }

    /**
     * Converts this SubscriptionMigrationPreviewRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionMigrationPreviewRequest [" + "migration=" + migration + "]";
    }

    /**
     * Builds a new {@link SubscriptionMigrationPreviewRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionMigrationPreviewRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(migration);
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionMigrationPreviewRequest}.
     */
    public static class Builder {
        private SubscriptionMigrationPreviewOptions migration;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  migration  SubscriptionMigrationPreviewOptions value for migration.
         */
        public Builder(SubscriptionMigrationPreviewOptions migration) {
            this.migration = migration;
        }

        /**
         * Setter for migration.
         * @param  migration  SubscriptionMigrationPreviewOptions value for migration.
         * @return Builder
         */
        public Builder migration(SubscriptionMigrationPreviewOptions migration) {
            this.migration = migration;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionMigrationPreviewRequest} object using the set fields.
         * @return {@link SubscriptionMigrationPreviewRequest}
         */
        public SubscriptionMigrationPreviewRequest build() {
            return new SubscriptionMigrationPreviewRequest(migration);
        }
    }
}
