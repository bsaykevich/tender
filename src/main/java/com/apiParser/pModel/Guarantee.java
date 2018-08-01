
package com.apiParser.pModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Guarantee {

    @SerializedName("currency")
    @Expose
    public String currency;
    @SerializedName("amount")
    @Expose
    public Integer amount;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Guarantee{" +
                "currency='" + currency + '\'' +
                ", amount=" + amount +
                '}';
    }
}
