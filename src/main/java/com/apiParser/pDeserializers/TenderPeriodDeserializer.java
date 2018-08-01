
package com.apiParser.pDeserializers;

import com.apiParser.pDeserializers.util.DeserializersUtil;
import com.apiParser.pModel.TenderPeriod;
import com.google.gson.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Type;

public class TenderPeriodDeserializer implements JsonDeserializer<TenderPeriod> {

   /* @SerializedName("startDate")
    @Expose
    public String startDate;
    @SerializedName("endDate")
    @Expose
    public String endDate;
*/


    @Override
    public TenderPeriod deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        TenderPeriod tenderPeriod = new TenderPeriod();

        JsonObject jsonObject = json.getAsJsonObject();

        JsonElement startDate = jsonObject.get("startDate");
        tenderPeriod.setStartDate(DeserializersUtil.convertString(startDate));

        JsonElement endDate = jsonObject.get("endDate");
        tenderPeriod.setEndDate(DeserializersUtil.convertString(endDate));



        return tenderPeriod;
    }
}
