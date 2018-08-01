
package com.apiParser.pModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DeliveryDate {

    @SerializedName("endDate")
    @Expose
    public String endDate;

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "DeliveryDate{" +
                "endDate='" + endDate + '\'' +
                '}';
    }
}
