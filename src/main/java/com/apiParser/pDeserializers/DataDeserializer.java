
package com.apiParser.pDeserializers;

import com.apiParser.pDeserializers.util.DeserializersUtil;
import com.apiParser.pModel.*;
import com.google.gson.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Type;
import java.util.List;

public class DataDeserializer implements JsonDeserializer<Data> {

  /*  @SerializedName("procurementMethod")
    @Expose
    public String procurementMethod;
    @SerializedName("numberOfBids")
    @Expose
    public Integer numberOfBids;
    @SerializedName("awardPeriod")
    @Expose
    public AwardPeriod awardPeriod;
    @SerializedName("complaintPeriod")
    @Expose
    public ComplaintPeriod complaintPeriod;
    @SerializedName("auctionUrl")
    @Expose
    public String auctionUrl;
    @SerializedName("enquiryPeriod")
    @Expose
    public EnquiryPeriod enquiryPeriod;
    @SerializedName("submissionMethod")
    @Expose
    public String submissionMethod;
    @SerializedName("procuringEntity")
    @Expose
    public ProcuringEntity procuringEntity;
    @SerializedName("questions")
    @Expose
    public List<Question> questions = null;
    @SerializedName("owner")
    @Expose
    public String owner;
    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("documents")
    @Expose
    public List<Document> documents = null;
    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("tenderID")
    @Expose
    public String tenderID;
    @SerializedName("guarantee")
    @Expose
    public Guarantee guarantee;
    @SerializedName("dateModified")
    @Expose
    public String dateModified;
    @SerializedName("status")
    @Expose
    public String status;
    @SerializedName("tenderPeriod")
    @Expose
    public TenderPeriod tenderPeriod;
    @SerializedName("contracts")
    @Expose
    public List<Contract> contracts = null;
    @SerializedName("auctionPeriod")
    @Expose
    public AuctionPeriod auctionPeriod;
    @SerializedName("procurementMethodType")
    @Expose
    public String procurementMethodType;
    @SerializedName("awards")
    @Expose
    public List<Award> awards = null;
    @SerializedName("date")
    @Expose
    public String date;
    @SerializedName("minimalStep")
    @Expose
    public MinimalStep minimalStep;
    @SerializedName("items")
    @Expose
    public List<Item> items = null;
    @SerializedName("bids")
    @Expose
    public List<Bid> bids = null;
    @SerializedName("value")
    @Expose
    public Value value;
    @SerializedName("awardCriteria")
    @Expose
    public String awardCriteria;

*/
    @Override
    public Data deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        Data data = new Data();

        JsonObject jsonObject = json.getAsJsonObject();

        JsonElement procurementMethod = jsonObject.get("procurementMethod");
        data.setProcurementMethod(DeserializersUtil.convertString(procurementMethod));

        JsonElement numberOfBids = jsonObject.get("numberOfBids");
        data.setNumberOfBids(DeserializersUtil.convertInteger(numberOfBids));

        JsonElement awardPeriod = jsonObject.get("awardPeriod");
        data.setAwardPeriod(DeserializersUtil.convertObject(awardPeriod, AwardPeriod.class, context));

        JsonElement complaintPeriod = jsonObject.get("complaintPeriod");
        data.setComplaintPeriod(DeserializersUtil.convertObject(complaintPeriod, ComplaintPeriod.class, context));

        JsonElement auctionUrl = jsonObject.get("auctionUrl");
        data.setAuctionUrl(DeserializersUtil.convertString(auctionUrl));

        JsonElement enquiryPeriod = jsonObject.get("enquiryPeriod");
        data.setEnquiryPeriod(DeserializersUtil.convertObject(enquiryPeriod, EnquiryPeriod.class, context));

        JsonElement submissionMethod = jsonObject.get("submissionMethod");
        data.setSubmissionMethod(DeserializersUtil.convertString(submissionMethod));

        JsonElement procuringEntity = jsonObject.get("procuringEntity");
        data.setProcuringEntity(DeserializersUtil.convertObject(procuringEntity, ProcuringEntity.class, context));

        JsonElement questions = jsonObject.get("questions");
        data.setQuestions(DeserializersUtil.convertArray(questions, Question.class, context));

        JsonElement owner = jsonObject.get("owner");
        data.setOwner(DeserializersUtil.convertString(owner));

        JsonElement id = jsonObject.get("id");
        data.setId(DeserializersUtil.convertString(id));

        JsonElement description = jsonObject.get("description");
        data.setDescription(DeserializersUtil.convertString(description));

        JsonElement documents = jsonObject.get("documents");
        data.setDocuments(DeserializersUtil.convertArray(documents, Document.class, context));

        JsonElement title = jsonObject.get("title");
        data.setTitle(DeserializersUtil.convertString(title));

        JsonElement tenderID = jsonObject.get("tenderID");
        data.setTenderID(DeserializersUtil.convertString(tenderID));

        JsonElement guarantee = jsonObject.get("guarantee");
        data.setGuarantee(DeserializersUtil.convertObject(guarantee, Guarantee.class, context));

        JsonElement dateModified = jsonObject.get("dateModified");
        data.setDateModified(DeserializersUtil.convertString(dateModified));

        JsonElement status = jsonObject.get("status");
        data.setStatus(DeserializersUtil.convertString(status));

        JsonElement tenderPeriod = jsonObject.get("tenderPeriod");
        data.setTenderPeriod(DeserializersUtil.convertObject(tenderPeriod, TenderPeriod.class, context));

        JsonElement contracts = jsonObject.get("contracts");
        data.setContracts(DeserializersUtil.convertArray(contracts, Contract.class, context));

        JsonElement auctionPeriod = jsonObject.get("auctionPeriod");
        data.setAuctionPeriod(DeserializersUtil.convertObject(auctionPeriod, AuctionPeriod.class, context));

        JsonElement procurementMethodType = jsonObject.get("procurementMethodType");
        data.setProcurementMethodType(DeserializersUtil.convertString(procurementMethodType));

        JsonElement awards = jsonObject.get("awards");
        data.setAwards(DeserializersUtil.convertArray(awards, Award.class, context));

        JsonElement date = jsonObject.get("date");
        data.setDate(DeserializersUtil.convertString(date));

        JsonElement minimalStep = jsonObject.get("minimalStep");
        data.setMinimalStep(DeserializersUtil.convertObject(minimalStep, MinimalStep.class, context));

        JsonElement items = jsonObject.get("items");
        data.setItems(DeserializersUtil.convertArray(items, Item.class, context));

        JsonElement bids = jsonObject.get("bids");
        data.setBids(DeserializersUtil.convertArray(bids, Bid.class, context));

        JsonElement value = jsonObject.get("value");
        data.setValue(DeserializersUtil.convertObject(value, Value.class, context));

        JsonElement awardCriteria = jsonObject.get("awardCriteria");
        data.setAwardCriteria(DeserializersUtil.convertString(awardCriteria));

        return data;
    }
}
