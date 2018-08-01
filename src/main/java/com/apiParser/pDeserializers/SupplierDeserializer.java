
package com.apiParser.pDeserializers;

import com.apiParser.pDeserializers.util.DeserializersUtil;
import com.apiParser.pModel.*;
import com.google.gson.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Type;

public class SupplierDeserializer implements JsonDeserializer<Supplier> {

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
    public Supplier deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        Supplier supplier = new Supplier();

        JsonObject jsonObject = json.getAsJsonObject();

        JsonElement contactPoint = jsonObject.get("contactPoint");
        supplier.setContactPoint(DeserializersUtil.convertObject(contactPoint, ContactPoint.class, context));

        JsonElement identifier = jsonObject.get("identifier");
        supplier.setIdentifier(DeserializersUtil.convertObject(identifier, Identifier.class, context));

        JsonElement name = jsonObject.get("name");
        supplier.setName(DeserializersUtil.convertString(name));

        JsonElement address = jsonObject.get("address");
        supplier.setAddress(DeserializersUtil.convertObject(address, Address.class, context));


        return supplier;
    }
}
