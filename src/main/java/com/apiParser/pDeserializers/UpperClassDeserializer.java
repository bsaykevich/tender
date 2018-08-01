
package com.apiParser.pDeserializers;

import com.apiParser.pDeserializers.util.DeserializersUtil;
import com.apiParser.pModel.Data;
import com.apiParser.pModel.UpperClass;
import com.google.gson.*;

import java.lang.reflect.Type;

public class UpperClassDeserializer implements JsonDeserializer<UpperClass> {

   /* @SerializedName("data")
    private Data data;

*/
    @Override
    public UpperClass deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        UpperClass upperClass = new UpperClass();

        JsonObject jsonObject = json.getAsJsonObject();

        JsonElement data = jsonObject.get("data");
        upperClass.setData(DeserializersUtil.convertObject(data, Data.class, context));


        return upperClass;
    }
}
