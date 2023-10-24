/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for ReasonCode type.
 */
public class ReasonCode {
    private Integer id;
    private Integer siteId;
    private String code;
    private String description;
    private Integer position;
    private String createdAt;
    private String updatedAt;

    /**
     * Default constructor.
     */
    public ReasonCode() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  siteId  Integer value for siteId.
     * @param  code  String value for code.
     * @param  description  String value for description.
     * @param  position  Integer value for position.
     * @param  createdAt  String value for createdAt.
     * @param  updatedAt  String value for updatedAt.
     */
    public ReasonCode(
            Integer id,
            Integer siteId,
            String code,
            String description,
            Integer position,
            String createdAt,
            String updatedAt) {
        this.id = id;
        this.siteId = siteId;
        this.code = code;
        this.description = description;
        this.position = position;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
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
     * Getter for SiteId.
     * @return Returns the Integer
     */
    @JsonGetter("site_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSiteId() {
        return siteId;
    }

    /**
     * Setter for SiteId.
     * @param siteId Value for Integer
     */
    @JsonSetter("site_id")
    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    /**
     * Getter for Code.
     * @return Returns the String
     */
    @JsonGetter("code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCode() {
        return code;
    }

    /**
     * Setter for Code.
     * @param code Value for String
     */
    @JsonSetter("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter for Description.
     * @return Returns the String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for Position.
     * @return Returns the Integer
     */
    @JsonGetter("position")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPosition() {
        return position;
    }

    /**
     * Setter for Position.
     * @param position Value for Integer
     */
    @JsonSetter("position")
    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the String
     */
    @JsonGetter("created_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for String
     */
    @JsonSetter("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for UpdatedAt.
     * @return Returns the String
     */
    @JsonGetter("updated_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * @param updatedAt Value for String
     */
    @JsonSetter("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Converts this ReasonCode into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReasonCode [" + "id=" + id + ", siteId=" + siteId + ", code=" + code
                + ", description=" + description + ", position=" + position + ", createdAt="
                + createdAt + ", updatedAt=" + updatedAt + "]";
    }

    /**
     * Builds a new {@link ReasonCode.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReasonCode.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .siteId(getSiteId())
                .code(getCode())
                .description(getDescription())
                .position(getPosition())
                .createdAt(getCreatedAt())
                .updatedAt(getUpdatedAt());
        return builder;
    }

    /**
     * Class to build instances of {@link ReasonCode}.
     */
    public static class Builder {
        private Integer id;
        private Integer siteId;
        private String code;
        private String description;
        private Integer position;
        private String createdAt;
        private String updatedAt;



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
         * Setter for siteId.
         * @param  siteId  Integer value for siteId.
         * @return Builder
         */
        public Builder siteId(Integer siteId) {
            this.siteId = siteId;
            return this;
        }

        /**
         * Setter for code.
         * @param  code  String value for code.
         * @return Builder
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for position.
         * @param  position  Integer value for position.
         * @return Builder
         */
        public Builder position(Integer position) {
            this.position = position;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  String value for createdAt.
         * @return Builder
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  String value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Builds a new {@link ReasonCode} object using the set fields.
         * @return {@link ReasonCode}
         */
        public ReasonCode build() {
            return new ReasonCode(id, siteId, code, description, position, createdAt, updatedAt);
        }
    }
}
