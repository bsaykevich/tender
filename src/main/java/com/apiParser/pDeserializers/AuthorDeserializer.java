
package com.apiParser.pDeserializers;

import com.apiParser.pDeserializers.util.DeserializersUtil;
import com.apiParser.pModel.*;
import com.google.gson.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Type;

public class AuthorDeserializer implements JsonDeserializer<Author> {

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
    public Address address;*/


    @Override
    public Author deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        Author author = new Author();

        JsonObject jsonObject = json.getAsJsonObject();

        JsonElement contactPoint = jsonObject.get("contactPoint");
        author.setContactPoint(DeserializersUtil.convertObject(contactPoint, ContactPoint.class, context));

        JsonElement identifier = jsonObject.get("identifier");
        author.setIdentifier(DeserializersUtil.convertObject(identifier, Identifier.class, context));

        JsonElement name = jsonObject.get("name");
        author.setName(DeserializersUtil.convertString(name));

        JsonElement address = jsonObject.get("address");
        author.setAddress(DeserializersUtil.convertObject(address, Address.class, context));


        return author;
    }
}
