/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for SubscriptionProductMigrationRequest type.
 */
public class SubscriptionProductMigrationRequest {
    private SubscriptionProductMigration migration;

    /**
     * Default constructor.
     */
    public SubscriptionProductMigrationRequest() {
    }

    /**
     * Initialization constructor.
     * @param  migration  SubscriptionProductMigration value for migration.
     */
    public SubscriptionProductMigrationRequest(
            SubscriptionProductMigration migration) {
        this.migration = migration;
    }

    /**
     * Getter for Migration.
     * @return Returns the SubscriptionProductMigration
     */
    @JsonGetter("migration")
    public SubscriptionProductMigration getMigration() {
        return migration;
    }

    /**
     * Setter for Migration.
     * @param migration Value for SubscriptionProductMigration
     */
    @JsonSetter("migration")
    public void setMigration(SubscriptionProductMigration migration) {
        this.migration = migration;
    }

    /**
     * Converts this SubscriptionProductMigrationRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionProductMigrationRequest [" + "migration=" + migration + "]";
    }

    /**
     * Builds a new {@link SubscriptionProductMigrationRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionProductMigrationRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(migration);
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionProductMigrationRequest}.
     */
    public static class Builder {
        private SubscriptionProductMigration migration;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  migration  SubscriptionProductMigration value for migration.
         */
        public Builder(SubscriptionProductMigration migration) {
            this.migration = migration;
        }

        /**
         * Setter for migration.
         * @param  migration  SubscriptionProductMigration value for migration.
         * @return Builder
         */
        public Builder migration(SubscriptionProductMigration migration) {
            this.migration = migration;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionProductMigrationRequest} object using the set fields.
         * @return {@link SubscriptionProductMigrationRequest}
         */
        public SubscriptionProductMigrationRequest build() {
            return new SubscriptionProductMigrationRequest(migration);
        }
    }
}
