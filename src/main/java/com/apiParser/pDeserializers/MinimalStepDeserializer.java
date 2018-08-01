
package com.apiParser.pDeserializers;

import com.apiParser.pDeserializers.util.DeserializersUtil;
import com.apiParser.pModel.MinimalStep;
import com.google.gson.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Type;

public class MinimalStepDeserializer implements JsonDeserializer<MinimalStep> {

    /*@SerializedName("currency")
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
    public MinimalStep deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        MinimalStep minimalStep = new MinimalStep();

        JsonObject jsonObject = json.getAsJsonObject();

        JsonElement currency = jsonObject.get("currency");
        minimalStep.setCurrency(DeserializersUtil.convertString(currency));

        JsonElement amount = jsonObject.get("amount");
        minimalStep.setAmount(DeserializersUtil.convertInteger(amount));

        JsonElement valueAddedTaxIncluded = jsonObject.get("valueAddedTaxIncluded");
        minimalStep.setValueAddedTaxIncluded(DeserializersUtil.convertBoolean(valueAddedTaxIncluded));



        return minimalStep;
    }
}
