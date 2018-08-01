
package com.apiParser.pDeserializers;

import com.apiParser.pDeserializers.util.DeserializersUtil;
import com.apiParser.pModel.EnquiryPeriod;
import com.google.gson.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Type;

public class EnquiryPeriodDeserializer implements JsonDeserializer<EnquiryPeriod> {

   /* @SerializedName("startDate")
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
*/


    @Override
    public EnquiryPeriod deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        EnquiryPeriod enquiryPeriod = new EnquiryPeriod();

        JsonObject jsonObject = json.getAsJsonObject();

        JsonElement startDate = jsonObject.get("startDate");
        enquiryPeriod.setStartDate(DeserializersUtil.convertString(startDate));

        JsonElement clarificationsUntil = jsonObject.get("clarificationsUntil");
        enquiryPeriod.setClarificationsUntil(DeserializersUtil.convertString(clarificationsUntil));

        JsonElement endDate = jsonObject.get("endDate");
        enquiryPeriod.setEndDate(DeserializersUtil.convertString(endDate));

        JsonElement invalidationDate = jsonObject.get("invalidationDate");
        enquiryPeriod.setInvalidationDate(DeserializersUtil.convertString(invalidationDate));


        return enquiryPeriod;
    }
}
