
package com.apiParser.pDeserializers;

import com.apiParser.pDeserializers.util.DeserializersUtil;
import com.apiParser.pModel.Classification;
import com.google.gson.*;

import java.lang.reflect.Type;

public class ClassificationDeserializer implements JsonDeserializer<Classification> {

   /* @SerializedName("scheme")
    @Expose
    public String scheme;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("id")
    @Expose
    public String id;*/



    @Override
    public Classification deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        Classification classification = new Classification();

        JsonObject jsonObject = json.getAsJsonObject();

        JsonElement scheme = jsonObject.get("scheme");
        classification.setScheme(DeserializersUtil.convertString(scheme));

        JsonElement description = jsonObject.get("description");
        classification.setDescription(DeserializersUtil.convertString(description));

        JsonElement id = jsonObject.get("id");
        classification.setId(DeserializersUtil.convertString(id));


        return classification;
    }
}
