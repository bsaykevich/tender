
package com.apiParser.pDeserializers;

import com.apiParser.pDeserializers.util.DeserializersUtil;
import com.apiParser.pModel.*;
import com.google.gson.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Type;
import java.util.List;

public class BidDeserializer implements JsonDeserializer<Bid> {

    @SerializedName("status")
    @Expose
    public String status;
    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("documents")
    @Expose
    public List<Document> documents = null;
    @SerializedName("selfEligible")
    @Expose
    public Boolean selfEligible;
    @SerializedName("value")
    @Expose
    public Value value;
    @SerializedName("selfQualified")
    @Expose
    public Boolean selfQualified;
    @SerializedName("tenderers")
    @Expose
    public List<Tenderer> tenderers = null;
    @SerializedName("date")
    @Expose
    public String date;
    @SerializedName("participationUrl")
    @Expose
    public String participationUrl;
    @SerializedName("subcontractingDetails")
    @Expose
    public String subcontractingDetails;



    @Override
    public Bid deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        Bid bid = new Bid();

        JsonObject jsonObject = json.getAsJsonObject();

        JsonElement status = jsonObject.get("status");
        bid.setStatus(DeserializersUtil.convertString(status));

        JsonElement id = jsonObject.get("id");
        bid.setId(DeserializersUtil.convertString(id));

        JsonElement documents = jsonObject.get("documents");
        bid.setDocuments(DeserializersUtil.convertArray(documents, Document.class, context));

        JsonElement selfEligible = jsonObject.get("selfEligible");
        bid.setSelfEligible(DeserializersUtil.convertBoolean(selfEligible));

        JsonElement value = jsonObject.get("value");
        bid.setValue(DeserializersUtil.convertObject(value, Value.class, context));

        JsonElement selfQualified = jsonObject.get("selfQualified");
        bid.setSelfQualified(DeserializersUtil.convertBoolean(selfQualified));


        JsonElement tenderers = jsonObject.get("tenderers");
        bid.setTenderers(DeserializersUtil.convertArray(tenderers, Tenderer.class, context));


        JsonElement date = jsonObject.get("date");
        bid.setDate(DeserializersUtil.convertString(date));


        JsonElement participationUrl = jsonObject.get("participationUrl");
        bid.setDate(DeserializersUtil.convertString(participationUrl));


        JsonElement subcontractingDetails = jsonObject.get("subcontractingDetails");
        bid.setDate(DeserializersUtil.convertString(subcontractingDetails));

        return bid;
    }
}
