
package com.apiParser.pDeserializers;

import com.apiParser.pDeserializers.util.DeserializersUtil;
import com.apiParser.pModel.Address;
import com.google.gson.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Type;
import java.util.Map;

public class AddressDeserializer implements JsonDeserializer<Address> {

    /*@SerializedName("postalCode")
    @Expose
    public String postalCode;
    @SerializedName("countryName")
    @Expose
    public String countryName;
    @SerializedName("streetAddress")
    @Expose
    public String streetAddress;
    @SerializedName("region")
    @Expose
    public String region;
    @SerializedName("locality")
    @Expose
    public String locality;*/


    @Override
    public Address deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        Address address = new Address();

        JsonObject jsonObject = json.getAsJsonObject();

        JsonElement postalCode = jsonObject.get("postalCode");
        address.setPostalCode(DeserializersUtil.convertString(postalCode));

        JsonElement countryName = jsonObject.get("countryName");
        address.setCountryName(DeserializersUtil.convertString(countryName));

        JsonElement streetAddress = jsonObject.get("streetAddress");
        address.setStreetAddress(DeserializersUtil.convertString(streetAddress));

        JsonElement region = jsonObject.get("region");
        address.setRegion(DeserializersUtil.convertString(region));

        JsonElement locality = jsonObject.get("locality");
        address.setLocality(DeserializersUtil.convertString(locality));


        return address;
    }
}
