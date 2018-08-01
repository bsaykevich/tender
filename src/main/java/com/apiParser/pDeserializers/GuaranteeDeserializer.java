
package com.apiParser.pDeserializers;

import com.apiParser.pDeserializers.util.DeserializersUtil;
import com.apiParser.pModel.Guarantee;
import com.google.gson.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Type;

public class GuaranteeDeserializer implements JsonDeserializer<Guarantee> {

    /*@SerializedName("currency")
    @Expose
    public String currency;
    @SerializedName("amount")
    @Expose
    public Integer amount;
*/

    @Override
    public Guarantee deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        Guarantee guarantee = new Guarantee();

        JsonObject jsonObject = json.getAsJsonObject();

        JsonElement currency = jsonObject.get("currency");
        guarantee.setCurrency(DeserializersUtil.convertString(currency));

        JsonElement amount = jsonObject.get("amount");
        guarantee.setAmount(DeserializersUtil.convertInteger(amount));


        return guarantee;
    }
}
