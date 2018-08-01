
package com.apiParser.pModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EnquiryPeriod {

    @SerializedName("startDate")
    @Expose
    public String startDate;
    @SerializedName("clarificationsUntil")
    @Expose
    public String clarificationsUntil;
    @SerializedName("endDate")
    @Expose
    public String endDate;
    @SerializedName("invalidationDate")
    @Expose
    public String invalidationDate;

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getClarificationsUntil() {
        return clarificationsUntil;
    }

    public void setClarificationsUntil(String clarificationsUntil) {
        this.clarificationsUntil = clarificationsUntil;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getInvalidationDate() {
        return invalidationDate;
    }

    public void setInvalidationDate(String invalidationDate) {
        this.invalidationDate = invalidationDate;
    }

    @Override
    public String toString() {
        return "EnquiryPeriod{" +
                "startDate='" + startDate + '\'' +
                ", clarificationsUntil='" + clarificationsUntil + '\'' +
                ", endDate='" + endDate + '\'' +
                ", invalidationDate='" + invalidationDate + '\'' +
                '}';
    }
}
