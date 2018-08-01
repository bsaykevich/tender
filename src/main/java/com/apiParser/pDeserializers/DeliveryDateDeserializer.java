
package com.apiParser.pDeserializers;

import com.apiParser.pDeserializers.util.DeserializersUtil;
import com.apiParser.pModel.DeliveryDate;
import com.google.gson.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Type;

public class DeliveryDateDeserializer implements JsonDeserializer<DeliveryDate> {

    /*@SerializedName("endDate")
    @Expose
    public String endDate;
*/

    @Override
    public DeliveryDate deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        DeliveryDate deliveryDate = new DeliveryDate();

        JsonObject jsonObject = json.getAsJsonObject();

        JsonElement endDate = jsonObject.get("endDate");
        deliveryDate.setEndDate(DeserializersUtil.convertString(endDate));

        return deliveryDate;
    }
}
