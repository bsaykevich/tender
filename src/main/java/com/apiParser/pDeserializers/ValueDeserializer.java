
package com.apiParser.pDeserializers;

import com.apiParser.pDeserializers.util.DeserializersUtil;
import com.apiParser.pModel.Value;
import com.google.gson.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Type;

public class ValueDeserializer implements JsonDeserializer<Value> {

 /*   @SerializedName("currency")
    @Expose
    public String currency;
    @SerializedName("amount")
    @Expose
    public Integer amount;
    @SerializedName("valueAddedTaxIncluded")
    @Expose
    public Boolean valueAddedTaxIncluded;
*/


    @Override
    public Value deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        Value value = new Value();

        JsonObject jsonObject = json.getAsJsonObject();

        JsonElement currency = jsonObject.get("currency");
        value.setCurrency(DeserializersUtil.convertString(currency));

        JsonElement amount = jsonObject.get("amount");
        value.setAmount(DeserializersUtil.convertInteger(amount));

        JsonElement valueAddedTaxIncluded = jsonObject.get("valueAddedTaxIncluded");
        value.setValueAddedTaxIncluded(DeserializersUtil.convertBoolean(valueAddedTaxIncluded));


        return value;
    }
}
