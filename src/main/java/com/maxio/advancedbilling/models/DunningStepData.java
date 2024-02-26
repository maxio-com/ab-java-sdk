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
 * This is a model class for DunningStepData type.
 */
public class DunningStepData {
    private int dayThreshold;
    private String action;
    private OptionalNullable<String> emailBody;
    private OptionalNullable<String> emailSubject;
    private boolean sendEmail;
    private boolean sendBccEmail;
    private boolean sendSms;
    private OptionalNullable<String> smsBody;

    /**
     * Default constructor.
     */
    public DunningStepData() {
    }

    /**
     * Initialization constructor.
     * @param  dayThreshold  int value for dayThreshold.
     * @param  action  String value for action.
     * @param  sendEmail  boolean value for sendEmail.
     * @param  sendBccEmail  boolean value for sendBccEmail.
     * @param  sendSms  boolean value for sendSms.
     * @param  emailBody  String value for emailBody.
     * @param  emailSubject  String value for emailSubject.
     * @param  smsBody  String value for smsBody.
     */
    public DunningStepData(
            int dayThreshold,
            String action,
            boolean sendEmail,
            boolean sendBccEmail,
            boolean sendSms,
            String emailBody,
            String emailSubject,
            String smsBody) {
        this.dayThreshold = dayThreshold;
        this.action = action;
        this.emailBody = OptionalNullable.of(emailBody);
        this.emailSubject = OptionalNullable.of(emailSubject);
        this.sendEmail = sendEmail;
        this.sendBccEmail = sendBccEmail;
        this.sendSms = sendSms;
        this.smsBody = OptionalNullable.of(smsBody);
    }

    /**
     * Initialization constructor.
     * @param  dayThreshold  int value for dayThreshold.
     * @param  action  String value for action.
     * @param  sendEmail  boolean value for sendEmail.
     * @param  sendBccEmail  boolean value for sendBccEmail.
     * @param  sendSms  boolean value for sendSms.
     * @param  emailBody  String value for emailBody.
     * @param  emailSubject  String value for emailSubject.
     * @param  smsBody  String value for smsBody.
     */

    protected DunningStepData(int dayThreshold, String action, boolean sendEmail,
            boolean sendBccEmail, boolean sendSms, OptionalNullable<String> emailBody,
            OptionalNullable<String> emailSubject, OptionalNullable<String> smsBody) {
        this.dayThreshold = dayThreshold;
        this.action = action;
        this.emailBody = emailBody;
        this.emailSubject = emailSubject;
        this.sendEmail = sendEmail;
        this.sendBccEmail = sendBccEmail;
        this.sendSms = sendSms;
        this.smsBody = smsBody;
    }

    /**
     * Getter for DayThreshold.
     * @return Returns the int
     */
    @JsonGetter("day_threshold")
    public int getDayThreshold() {
        return dayThreshold;
    }

    /**
     * Setter for DayThreshold.
     * @param dayThreshold Value for int
     */
    @JsonSetter("day_threshold")
    public void setDayThreshold(int dayThreshold) {
        this.dayThreshold = dayThreshold;
    }

    /**
     * Getter for Action.
     * @return Returns the String
     */
    @JsonGetter("action")
    public String getAction() {
        return action;
    }

    /**
     * Setter for Action.
     * @param action Value for String
     */
    @JsonSetter("action")
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * Internal Getter for EmailBody.
     * @return Returns the Internal String
     */
    @JsonGetter("email_body")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetEmailBody() {
        return this.emailBody;
    }

    /**
     * Getter for EmailBody.
     * @return Returns the String
     */
    public String getEmailBody() {
        return OptionalNullable.getFrom(emailBody);
    }

    /**
     * Setter for EmailBody.
     * @param emailBody Value for String
     */
    @JsonSetter("email_body")
    public void setEmailBody(String emailBody) {
        this.emailBody = OptionalNullable.of(emailBody);
    }

    /**
     * UnSetter for EmailBody.
     */
    public void unsetEmailBody() {
        emailBody = null;
    }

    /**
     * Internal Getter for EmailSubject.
     * @return Returns the Internal String
     */
    @JsonGetter("email_subject")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetEmailSubject() {
        return this.emailSubject;
    }

    /**
     * Getter for EmailSubject.
     * @return Returns the String
     */
    public String getEmailSubject() {
        return OptionalNullable.getFrom(emailSubject);
    }

    /**
     * Setter for EmailSubject.
     * @param emailSubject Value for String
     */
    @JsonSetter("email_subject")
    public void setEmailSubject(String emailSubject) {
        this.emailSubject = OptionalNullable.of(emailSubject);
    }

    /**
     * UnSetter for EmailSubject.
     */
    public void unsetEmailSubject() {
        emailSubject = null;
    }

    /**
     * Getter for SendEmail.
     * @return Returns the boolean
     */
    @JsonGetter("send_email")
    public boolean getSendEmail() {
        return sendEmail;
    }

    /**
     * Setter for SendEmail.
     * @param sendEmail Value for boolean
     */
    @JsonSetter("send_email")
    public void setSendEmail(boolean sendEmail) {
        this.sendEmail = sendEmail;
    }

    /**
     * Getter for SendBccEmail.
     * @return Returns the boolean
     */
    @JsonGetter("send_bcc_email")
    public boolean getSendBccEmail() {
        return sendBccEmail;
    }

    /**
     * Setter for SendBccEmail.
     * @param sendBccEmail Value for boolean
     */
    @JsonSetter("send_bcc_email")
    public void setSendBccEmail(boolean sendBccEmail) {
        this.sendBccEmail = sendBccEmail;
    }

    /**
     * Getter for SendSms.
     * @return Returns the boolean
     */
    @JsonGetter("send_sms")
    public boolean getSendSms() {
        return sendSms;
    }

    /**
     * Setter for SendSms.
     * @param sendSms Value for boolean
     */
    @JsonSetter("send_sms")
    public void setSendSms(boolean sendSms) {
        this.sendSms = sendSms;
    }

    /**
     * Internal Getter for SmsBody.
     * @return Returns the Internal String
     */
    @JsonGetter("sms_body")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetSmsBody() {
        return this.smsBody;
    }

    /**
     * Getter for SmsBody.
     * @return Returns the String
     */
    public String getSmsBody() {
        return OptionalNullable.getFrom(smsBody);
    }

    /**
     * Setter for SmsBody.
     * @param smsBody Value for String
     */
    @JsonSetter("sms_body")
    public void setSmsBody(String smsBody) {
        this.smsBody = OptionalNullable.of(smsBody);
    }

    /**
     * UnSetter for SmsBody.
     */
    public void unsetSmsBody() {
        smsBody = null;
    }

    /**
     * Converts this DunningStepData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DunningStepData [" + "dayThreshold=" + dayThreshold + ", action=" + action
                + ", sendEmail=" + sendEmail + ", sendBccEmail=" + sendBccEmail + ", sendSms="
                + sendSms + ", emailBody=" + emailBody + ", emailSubject=" + emailSubject
                + ", smsBody=" + smsBody + "]";
    }

    /**
     * Builds a new {@link DunningStepData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DunningStepData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(dayThreshold, action, sendEmail, sendBccEmail, sendSms);
        builder.emailBody = internalGetEmailBody();
        builder.emailSubject = internalGetEmailSubject();
        builder.smsBody = internalGetSmsBody();
        return builder;
    }

    /**
     * Class to build instances of {@link DunningStepData}.
     */
    public static class Builder {
        private int dayThreshold;
        private String action;
        private boolean sendEmail;
        private boolean sendBccEmail;
        private boolean sendSms;
        private OptionalNullable<String> emailBody;
        private OptionalNullable<String> emailSubject;
        private OptionalNullable<String> smsBody;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  dayThreshold  int value for dayThreshold.
         * @param  action  String value for action.
         * @param  sendEmail  boolean value for sendEmail.
         * @param  sendBccEmail  boolean value for sendBccEmail.
         * @param  sendSms  boolean value for sendSms.
         */
        public Builder(int dayThreshold, String action, boolean sendEmail, boolean sendBccEmail,
                boolean sendSms) {
            this.dayThreshold = dayThreshold;
            this.action = action;
            this.sendEmail = sendEmail;
            this.sendBccEmail = sendBccEmail;
            this.sendSms = sendSms;
        }

        /**
         * Setter for dayThreshold.
         * @param  dayThreshold  int value for dayThreshold.
         * @return Builder
         */
        public Builder dayThreshold(int dayThreshold) {
            this.dayThreshold = dayThreshold;
            return this;
        }

        /**
         * Setter for action.
         * @param  action  String value for action.
         * @return Builder
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * Setter for sendEmail.
         * @param  sendEmail  boolean value for sendEmail.
         * @return Builder
         */
        public Builder sendEmail(boolean sendEmail) {
            this.sendEmail = sendEmail;
            return this;
        }

        /**
         * Setter for sendBccEmail.
         * @param  sendBccEmail  boolean value for sendBccEmail.
         * @return Builder
         */
        public Builder sendBccEmail(boolean sendBccEmail) {
            this.sendBccEmail = sendBccEmail;
            return this;
        }

        /**
         * Setter for sendSms.
         * @param  sendSms  boolean value for sendSms.
         * @return Builder
         */
        public Builder sendSms(boolean sendSms) {
            this.sendSms = sendSms;
            return this;
        }

        /**
         * Setter for emailBody.
         * @param  emailBody  String value for emailBody.
         * @return Builder
         */
        public Builder emailBody(String emailBody) {
            this.emailBody = OptionalNullable.of(emailBody);
            return this;
        }

        /**
         * UnSetter for emailBody.
         * @return Builder
         */
        public Builder unsetEmailBody() {
            emailBody = null;
            return this;
        }

        /**
         * Setter for emailSubject.
         * @param  emailSubject  String value for emailSubject.
         * @return Builder
         */
        public Builder emailSubject(String emailSubject) {
            this.emailSubject = OptionalNullable.of(emailSubject);
            return this;
        }

        /**
         * UnSetter for emailSubject.
         * @return Builder
         */
        public Builder unsetEmailSubject() {
            emailSubject = null;
            return this;
        }

        /**
         * Setter for smsBody.
         * @param  smsBody  String value for smsBody.
         * @return Builder
         */
        public Builder smsBody(String smsBody) {
            this.smsBody = OptionalNullable.of(smsBody);
            return this;
        }

        /**
         * UnSetter for smsBody.
         * @return Builder
         */
        public Builder unsetSmsBody() {
            smsBody = null;
            return this;
        }

        /**
         * Builds a new {@link DunningStepData} object using the set fields.
         * @return {@link DunningStepData}
         */
        public DunningStepData build() {
            return new DunningStepData(dayThreshold, action, sendEmail, sendBccEmail, sendSms,
                    emailBody, emailSubject, smsBody);
        }
    }
}
