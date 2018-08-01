
package com.apiParser.pDeserializers;

import com.apiParser.pDeserializers.util.DeserializersUtil;
import com.apiParser.pModel.Period;
import com.google.gson.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Type;

public class PeriodDeserializer implements JsonDeserializer<Period> {

    /*@SerializedName("startDate")
    @Expose
    public String startDate;
    @SerializedName("endDate")
    @Expose
    public String endDate;
*/


    @Override
    public Period deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        Period period = new Period();

        JsonObject jsonObject = json.getAsJsonObject();

        JsonElement startDate = jsonObject.get("startDate");
        period.setStartDate(DeserializersUtil.convertString(startDate));

        JsonElement endDate = jsonObject.get("endDate");
        period.setEndDate(DeserializersUtil.convertString(endDate));


        return period;
    }
}
