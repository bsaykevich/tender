
package com.apiParser.pDeserializers;

import com.apiParser.pDeserializers.util.DeserializersUtil;
import com.apiParser.pModel.Address;
import com.apiParser.pModel.AwardPeriod;
import com.google.gson.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Type;

public class AwardPeriodDeserializer implements JsonDeserializer<AwardPeriod> {

    /*@SerializedName("startDate")
    @Expose
    public String startDate;
    @SerializedName("endDate")
    @Expose
    public String endDate;
*/

    @Override
    public AwardPeriod deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        AwardPeriod awardPeriod = new AwardPeriod();

        JsonObject jsonObject = json.getAsJsonObject();

        JsonElement startDate = jsonObject.get("startDate");
        awardPeriod.setStartDate(DeserializersUtil.convertString(startDate));

        JsonElement endDate = jsonObject.get("endDate");
        awardPeriod.setEndDate(DeserializersUtil.convertString(endDate));


        return awardPeriod;
    }
}
