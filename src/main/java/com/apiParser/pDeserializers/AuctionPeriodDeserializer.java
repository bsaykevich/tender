
package com.apiParser.pDeserializers;

import com.apiParser.pDeserializers.util.DeserializersUtil;
import com.apiParser.pModel.Address;
import com.apiParser.pModel.AuctionPeriod;
import com.google.gson.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Type;

public class AuctionPeriodDeserializer implements JsonDeserializer<AuctionPeriod> {

    /*@SerializedName("startDate")
    @Expose
    public String startDate;
    @SerializedName("endDate")
    @Expose
    public String endDate;*/


    public AuctionPeriod deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        AuctionPeriod auctionPeriod = new AuctionPeriod();

        JsonObject jsonObject = json.getAsJsonObject();

        JsonElement startDate = jsonObject.get("startDate");
        auctionPeriod.setStartDate(DeserializersUtil.convertString(startDate));

        JsonElement endDate = jsonObject.get("endDate");
        auctionPeriod.setEndDate(DeserializersUtil.convertString(endDate));


        return auctionPeriod;
    }
}
