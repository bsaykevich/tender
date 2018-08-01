
package com.apiParser.pModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Value {

    @SerializedName("currency")
    @Expose
    public String currency;
    @SerializedName("amount")
    @Expose
    public Integer amount;
    @SerializedName("valueAddedTaxIncluded")
    @Expose
    public Boolean valueAddedTaxIncluded;

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

    public Boolean getValueAddedTaxIncluded() {
        return valueAddedTaxIncluded;
    }

    public void setValueAddedTaxIncluded(Boolean valueAddedTaxIncluded) {
        this.valueAddedTaxIncluded = valueAddedTaxIncluded;
    }

    @Override
    public String toString() {
        return "Value{" +
                "currency='" + currency + '\'' +
                ", amount=" + amount +
                ", valueAddedTaxIncluded=" + valueAddedTaxIncluded +
                '}';
    }
}
