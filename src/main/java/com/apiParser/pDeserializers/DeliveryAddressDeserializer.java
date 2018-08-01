
package com.apiParser.pDeserializers;

import com.apiParser.pDeserializers.util.DeserializersUtil;
import com.apiParser.pModel.DeliveryAddress;
import com.google.gson.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Type;

public class DeliveryAddressDeserializer implements JsonDeserializer<DeliveryAddress> {

   /* @SerializedName("postalCode")
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
    public String locality;

*/

    @Override
    public DeliveryAddress deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        DeliveryAddress deliveryAddress = new DeliveryAddress();

        JsonObject jsonObject = json.getAsJsonObject();

        JsonElement postalCode = jsonObject.get("postalCode");
        deliveryAddress.setPostalCode(DeserializersUtil.convertString(postalCode));

        JsonElement countryName = jsonObject.get("countryName");
        deliveryAddress.setCountryName(DeserializersUtil.convertString(countryName));

        JsonElement streetAddress = jsonObject.get("streetAddress");
        deliveryAddress.setStreetAddress(DeserializersUtil.convertString(streetAddress));

        JsonElement region = jsonObject.get("region");
        deliveryAddress.setRegion(DeserializersUtil.convertString(region));

        JsonElement locality = jsonObject.get("locality");
        deliveryAddress.setLocality(DeserializersUtil.convertString(locality));


        return deliveryAddress;
    }
}
