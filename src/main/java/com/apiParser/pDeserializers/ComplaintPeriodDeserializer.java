
package com.apiParser.pDeserializers;

import com.apiParser.pDeserializers.util.DeserializersUtil;
import com.apiParser.pModel.ComplaintPeriod;
import com.google.gson.*;

import java.lang.reflect.Type;

public class ComplaintPeriodDeserializer implements JsonDeserializer<ComplaintPeriod> {

    /*@SerializedName("startDate")
    @Expose
    public String startDate;
    @SerializedName("endDate")
    @Expose
    public String endDate;
*/


    @Override
    public ComplaintPeriod deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        ComplaintPeriod complaintPeriod = new ComplaintPeriod();

        JsonObject jsonObject = json.getAsJsonObject();

        JsonElement startDate = jsonObject.get("startDate");
        complaintPeriod.setStartDate(DeserializersUtil.convertString(startDate));

        JsonElement endDate = jsonObject.get("endDate");
        complaintPeriod.setEndDate(DeserializersUtil.convertString(endDate));

        return complaintPeriod;
    }
}
