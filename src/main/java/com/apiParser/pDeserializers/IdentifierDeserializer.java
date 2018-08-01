
package com.apiParser.pDeserializers;

import com.apiParser.pDeserializers.util.DeserializersUtil;
import com.apiParser.pModel.Identifier;
import com.google.gson.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Type;

public class IdentifierDeserializer implements JsonDeserializer<Identifier> {

   /* @SerializedName("scheme")
    @Expose
    public String scheme;
    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("uri")
    @Expose
    public String uri;
    @SerializedName("legalName")
    @Expose
    public String legalName;*/



    @Override
    public Identifier deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        Identifier identifier = new Identifier();

        JsonObject jsonObject = json.getAsJsonObject();

        JsonElement scheme = jsonObject.get("scheme");
        identifier.setScheme(DeserializersUtil.convertString(scheme));

        JsonElement id = jsonObject.get("id");
        identifier.setId(DeserializersUtil.convertString(id));

        JsonElement uri = jsonObject.get("uri");
        identifier.setUri(DeserializersUtil.convertString(uri));

        JsonElement legalName = jsonObject.get("legalName");
        identifier.setLegalName(DeserializersUtil.convertString(legalName));


        return identifier;
    }
}
