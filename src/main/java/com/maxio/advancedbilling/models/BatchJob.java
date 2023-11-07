/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for BatchJob type.
 */
public class BatchJob {
    private Integer id;
    private OptionalNullable<String> finishedAt;
    private OptionalNullable<Integer> rowCount;
    private OptionalNullable<String> createdAt;
    private String completed;

    /**
     * Default constructor.
     */
    public BatchJob() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  finishedAt  String value for finishedAt.
     * @param  rowCount  Integer value for rowCount.
     * @param  createdAt  String value for createdAt.
     * @param  completed  String value for completed.
     */
    public BatchJob(
            Integer id,
            String finishedAt,
            Integer rowCount,
            String createdAt,
            String completed) {
        this.id = id;
        this.finishedAt = OptionalNullable.of(finishedAt);
        this.rowCount = OptionalNullable.of(rowCount);
        this.createdAt = OptionalNullable.of(createdAt);
        this.completed = completed;
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  finishedAt  String value for finishedAt.
     * @param  rowCount  Integer value for rowCount.
     * @param  createdAt  String value for createdAt.
     * @param  completed  String value for completed.
     */

    protected BatchJob(Integer id, OptionalNullable<String> finishedAt,
            OptionalNullable<Integer> rowCount, OptionalNullable<String> createdAt,
            String completed) {
        this.id = id;
        this.finishedAt = finishedAt;
        this.rowCount = rowCount;
        this.createdAt = createdAt;
        this.completed = completed;
    }

    /**
     * Getter for Id.
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Internal Getter for FinishedAt.
     * @return Returns the Internal String
     */
    @JsonGetter("finished_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetFinishedAt() {
        return this.finishedAt;
    }

    /**
     * Getter for FinishedAt.
     * @return Returns the String
     */
    public String getFinishedAt() {
        return OptionalNullable.getFrom(finishedAt);
    }

    /**
     * Setter for FinishedAt.
     * @param finishedAt Value for String
     */
    @JsonSetter("finished_at")
    public void setFinishedAt(String finishedAt) {
        this.finishedAt = OptionalNullable.of(finishedAt);
    }

    /**
     * UnSetter for FinishedAt.
     */
    public void unsetFinishedAt() {
        finishedAt = null;
    }

    /**
     * Internal Getter for RowCount.
     * @return Returns the Internal Integer
     */
    @JsonGetter("row_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetRowCount() {
        return this.rowCount;
    }

    /**
     * Getter for RowCount.
     * @return Returns the Integer
     */
    public Integer getRowCount() {
        return OptionalNullable.getFrom(rowCount);
    }

    /**
     * Setter for RowCount.
     * @param rowCount Value for Integer
     */
    @JsonSetter("row_count")
    public void setRowCount(Integer rowCount) {
        this.rowCount = OptionalNullable.of(rowCount);
    }

    /**
     * UnSetter for RowCount.
     */
    public void unsetRowCount() {
        rowCount = null;
    }

    /**
     * Internal Getter for CreatedAt.
     * @return Returns the Internal String
     */
    @JsonGetter("created_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCreatedAt() {
        return this.createdAt;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the String
     */
    public String getCreatedAt() {
        return OptionalNullable.getFrom(createdAt);
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for String
     */
    @JsonSetter("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = OptionalNullable.of(createdAt);
    }

    /**
     * UnSetter for CreatedAt.
     */
    public void unsetCreatedAt() {
        createdAt = null;
    }

    /**
     * Getter for Completed.
     * @return Returns the String
     */
    @JsonGetter("completed")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCompleted() {
        return completed;
    }

    /**
     * Setter for Completed.
     * @param completed Value for String
     */
    @JsonSetter("completed")
    public void setCompleted(String completed) {
        this.completed = completed;
    }

    /**
     * Converts this BatchJob into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BatchJob [" + "id=" + id + ", finishedAt=" + finishedAt + ", rowCount=" + rowCount
                + ", createdAt=" + createdAt + ", completed=" + completed + "]";
    }

    /**
     * Builds a new {@link BatchJob.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BatchJob.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .completed(getCompleted());
        builder.finishedAt = internalGetFinishedAt();
        builder.rowCount = internalGetRowCount();
        builder.createdAt = internalGetCreatedAt();
        return builder;
    }

    /**
     * Class to build instances of {@link BatchJob}.
     */
    public static class Builder {
        private Integer id;
        private OptionalNullable<String> finishedAt;
        private OptionalNullable<Integer> rowCount;
        private OptionalNullable<String> createdAt;
        private String completed;



        /**
         * Setter for id.
         * @param  id  Integer value for id.
         * @return Builder
         */
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for finishedAt.
         * @param  finishedAt  String value for finishedAt.
         * @return Builder
         */
        public Builder finishedAt(String finishedAt) {
            this.finishedAt = OptionalNullable.of(finishedAt);
            return this;
        }

        /**
         * UnSetter for finishedAt.
         * @return Builder
         */
        public Builder unsetFinishedAt() {
            finishedAt = null;
            return this;
        }

        /**
         * Setter for rowCount.
         * @param  rowCount  Integer value for rowCount.
         * @return Builder
         */
        public Builder rowCount(Integer rowCount) {
            this.rowCount = OptionalNullable.of(rowCount);
            return this;
        }

        /**
         * UnSetter for rowCount.
         * @return Builder
         */
        public Builder unsetRowCount() {
            rowCount = null;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  String value for createdAt.
         * @return Builder
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = OptionalNullable.of(createdAt);
            return this;
        }

        /**
         * UnSetter for createdAt.
         * @return Builder
         */
        public Builder unsetCreatedAt() {
            createdAt = null;
            return this;
        }

        /**
         * Setter for completed.
         * @param  completed  String value for completed.
         * @return Builder
         */
        public Builder completed(String completed) {
            this.completed = completed;
            return this;
        }

        /**
         * Builds a new {@link BatchJob} object using the set fields.
         * @return {@link BatchJob}
         */
        public BatchJob build() {
            return new BatchJob(id, finishedAt, rowCount, createdAt, completed);
        }
    }
}
