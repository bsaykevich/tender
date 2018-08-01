
package com.apiParser.pDeserializers;

import com.apiParser.pDeserializers.util.DeserializersUtil;
import com.apiParser.pModel.*;
import com.google.gson.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Type;

public class ProcuringEntityDeserializer implements JsonDeserializer<ProcuringEntity> {

   /* @SerializedName("contactPoint")
    @Expose
    public ContactPoint contactPoint;
    @SerializedName("identifier")
    @Expose
    public Identifier identifier;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("kind")
    @Expose
    public String kind;
    @SerializedName("address")
    @Expose
    public Address address;
*/


    @Override
    public ProcuringEntity deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        ProcuringEntity procuringEntity = new ProcuringEntity();

        JsonObject jsonObject = json.getAsJsonObject();

        JsonElement contactPoint = jsonObject.get("contactPoint");
        procuringEntity.setContactPoint(DeserializersUtil.convertObject(contactPoint, ContactPoint.class, context));

        JsonElement identifier = jsonObject.get("identifier");
        procuringEntity.setIdentifier(DeserializersUtil.convertObject(identifier, Identifier.class, context));

        JsonElement name = jsonObject.get("name");
        procuringEntity.setName(DeserializersUtil.convertString(name));

        JsonElement kind = jsonObject.get("kind");
        procuringEntity.setKind(DeserializersUtil.convertString(kind));

        JsonElement address = jsonObject.get("address");
        procuringEntity.setAddress(DeserializersUtil.convertObject(address, Address.class, context));


        return procuringEntity;
    }
}
