
package com.apiParser.pDeserializers;

import com.apiParser.pDeserializers.util.DeserializersUtil;
import com.apiParser.pModel.*;
import com.google.gson.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Type;

public class ItemDeserializer implements JsonDeserializer<Item> {

   /* @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("classification")
    @Expose
    public Classification classification;
    @SerializedName("deliveryAddress")
    @Expose
    public DeliveryAddress deliveryAddress;
    @SerializedName("deliveryDate")
    @Expose
    public DeliveryDate deliveryDate;
    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("unit")
    @Expose
    public Unit unit;
    @SerializedName("quantity")
    @Expose
    public Integer quantity;
*/


    @Override
    public Item deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        Item item = new Item();

        JsonObject jsonObject = json.getAsJsonObject();

        JsonElement description = jsonObject.get("description");
        item.setDescription(DeserializersUtil.convertString(description));

        JsonElement classification = jsonObject.get("classification");
        item.setClassification(DeserializersUtil.convertObject(classification, Classification.class, context));

        JsonElement deliveryAddress = jsonObject.get("deliveryAddress");
        item.setDeliveryAddress(DeserializersUtil.convertObject(deliveryAddress, DeliveryAddress.class, context));

        JsonElement deliveryDate = jsonObject.get("deliveryDate");
        item.setDeliveryDate(DeserializersUtil.convertObject(deliveryDate, DeliveryDate.class, context));

        JsonElement id = jsonObject.get("id");
        item.setId(DeserializersUtil.convertString(id));

        JsonElement unit = jsonObject.get("unit");
        item.setUnit(DeserializersUtil.convertObject(unit, Unit.class, context));

        JsonElement quantity = jsonObject.get("quantity");
        item.setQuantity(DeserializersUtil.convertInteger(quantity));


        return item;
    }
}
