
package com.apiParser.pDeserializers;

import com.apiParser.pDeserializers.util.DeserializersUtil;
import com.apiParser.pModel.Address;
import com.apiParser.pModel.ContactPoint;
import com.apiParser.pModel.Identifier;
import com.apiParser.pModel.Tenderer;
import com.google.gson.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Type;

public class TendererDeserializer implements JsonDeserializer<Tenderer> {

    /*@SerializedName("contactPoint")
    @Expose
    public ContactPoint contactPoint;
    @SerializedName("identifier")
    @Expose
    public Identifier identifier;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("address")
    @Expose
    public Address address;
*/


    @Override
    public Tenderer deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        Tenderer tenderer = new Tenderer();

        JsonObject jsonObject = json.getAsJsonObject();

        JsonElement contactPoint = jsonObject.get("contactPoint");
        tenderer.setContactPoint(DeserializersUtil.convertObject(contactPoint, ContactPoint.class, context));

        JsonElement identifier = jsonObject.get("identifier");
        tenderer.setIdentifier(DeserializersUtil.convertObject(identifier, Identifier.class, context));

        JsonElement name = jsonObject.get("name");
        tenderer.setName(DeserializersUtil.convertString(name));

        JsonElement address = jsonObject.get("address");
        tenderer.setAddress(DeserializersUtil.convertObject(address, Address.class, context));


        return tenderer;
    }
}
