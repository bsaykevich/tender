
package com.apiParser.pDeserializers;

import com.apiParser.pDeserializers.util.DeserializersUtil;
import com.apiParser.pModel.*;
import com.google.gson.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Type;
import java.util.List;

public class AwardDeserializer implements JsonDeserializer<Award> {

   /* @SerializedName("status")
    @Expose
    public String status;
    @SerializedName("documents")
    @Expose
    public List<Document> documents = null;
    @SerializedName("complaintPeriod")
    @Expose
    public ComplaintPeriod complaintPeriod;
    @SerializedName("suppliers")
    @Expose
    public List<Supplier> suppliers = null;
    @SerializedName("eligible")
    @Expose
    public Boolean eligible;
    @SerializedName("bid_id")
    @Expose
    public String bidId;
    @SerializedName("value")
    @Expose
    public Value value;
    @SerializedName("qualified")
    @Expose
    public Boolean qualified;
    @SerializedName("date")
    @Expose
    public String date;
    @SerializedName("id")
    @Expose
    public String id;
*/


    @Override
    public Award deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        Award award = new Award();

        JsonObject jsonObject = json.getAsJsonObject();

        JsonElement status = jsonObject.get("status");
        award.setStatus(DeserializersUtil.convertString(status));

        JsonElement documents = jsonObject.get("documents");
        award.setDocuments(DeserializersUtil.convertArray(documents, Document.class, context));

        JsonElement complaintPeriod = jsonObject.get("complaintPeriod");
        award.setComplaintPeriod(DeserializersUtil.convertObject(complaintPeriod, ComplaintPeriod.class, context));

        JsonElement suppliers = jsonObject.get("suppliers");
        award.setSuppliers(DeserializersUtil.convertArray(suppliers, Supplier.class, context));

        JsonElement eligible = jsonObject.get("eligible");
        award.setEligible(DeserializersUtil.convertBoolean(eligible));

        JsonElement bidId = jsonObject.get("bid_id");
        award.setBidId(DeserializersUtil.convertString(bidId));

        JsonElement value = jsonObject.get("value");
        award.setValue(DeserializersUtil.convertObject(value, Value.class, context));

        JsonElement qualified = jsonObject.get("qualified");
        award.setQualified(DeserializersUtil.convertBoolean(qualified));

        JsonElement date = jsonObject.get("date");
        award.setDate(DeserializersUtil.convertString(date));

        JsonElement id = jsonObject.get("id");
        award.setId(DeserializersUtil.convertString(id));



        return award;
    }
}
