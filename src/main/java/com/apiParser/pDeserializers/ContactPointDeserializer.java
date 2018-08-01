
package com.apiParser.pDeserializers;

import com.apiParser.pDeserializers.util.DeserializersUtil;
import com.apiParser.pModel.ContactPoint;
import com.google.gson.*;

import java.lang.reflect.Type;

public class ContactPointDeserializer implements JsonDeserializer<ContactPoint> {

   /* @SerializedName("telephone")
    @Expose
    public String telephone;
    @SerializedName("url")
    @Expose
    public String url;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("email")
    @Expose
    public String email;*/



    @Override
    public ContactPoint deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        ContactPoint contactPoint = new ContactPoint();

        JsonObject jsonObject = json.getAsJsonObject();

        JsonElement telephone = jsonObject.get("telephone");
        contactPoint.setTelephone(DeserializersUtil.convertString(telephone));

        JsonElement url = jsonObject.get("url");
        contactPoint.setUrl(DeserializersUtil.convertString(url));

        JsonElement name = jsonObject.get("name");
        contactPoint.setName(DeserializersUtil.convertString(name));

        JsonElement email = jsonObject.get("email");
        contactPoint.setEmail(DeserializersUtil.convertString(email));

        return contactPoint;
    }
}
