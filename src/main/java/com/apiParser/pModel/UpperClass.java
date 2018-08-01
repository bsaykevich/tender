
package com.apiParser.pModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UpperClass {

    @SerializedName("data")
    //@Expose
    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "UpperClass{" + '\n' +
                "data='" + data + '\'' + '\n' +
                '}';
    }
}
