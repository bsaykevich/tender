
package com.apiParser.pModel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("procurementMethod")
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

    public String getProcurementMethod() {
        return procurementMethod;
    }

    public void setProcurementMethod(String procurementMethod) {
        this.procurementMethod = procurementMethod;
    }

    public Integer getNumberOfBids() {
        return numberOfBids;
    }

    public void setNumberOfBids(Integer numberOfBids) {
        this.numberOfBids = numberOfBids;
    }

    public AwardPeriod getAwardPeriod() {
        return awardPeriod;
    }

    public void setAwardPeriod(AwardPeriod awardPeriod) {
        this.awardPeriod = awardPeriod;
    }

    public ComplaintPeriod getComplaintPeriod() {
        return complaintPeriod;
    }

    public void setComplaintPeriod(ComplaintPeriod complaintPeriod) {
        this.complaintPeriod = complaintPeriod;
    }

    public String getAuctionUrl() {
        return auctionUrl;
    }

    public void setAuctionUrl(String auctionUrl) {
        this.auctionUrl = auctionUrl;
    }

    public EnquiryPeriod getEnquiryPeriod() {
        return enquiryPeriod;
    }

    public void setEnquiryPeriod(EnquiryPeriod enquiryPeriod) {
        this.enquiryPeriod = enquiryPeriod;
    }

    public String getSubmissionMethod() {
        return submissionMethod;
    }

    public void setSubmissionMethod(String submissionMethod) {
        this.submissionMethod = submissionMethod;
    }

    public ProcuringEntity getProcuringEntity() {
        return procuringEntity;
    }

    public void setProcuringEntity(ProcuringEntity procuringEntity) {
        this.procuringEntity = procuringEntity;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTenderID() {
        return tenderID;
    }

    public void setTenderID(String tenderID) {
        this.tenderID = tenderID;
    }

    public Guarantee getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(Guarantee guarantee) {
        this.guarantee = guarantee;
    }

    public String getDateModified() {
        return dateModified;
    }

    public void setDateModified(String dateModified) {
        this.dateModified = dateModified;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TenderPeriod getTenderPeriod() {
        return tenderPeriod;
    }

    public void setTenderPeriod(TenderPeriod tenderPeriod) {
        this.tenderPeriod = tenderPeriod;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }

    public AuctionPeriod getAuctionPeriod() {
        return auctionPeriod;
    }

    public void setAuctionPeriod(AuctionPeriod auctionPeriod) {
        this.auctionPeriod = auctionPeriod;
    }

    public String getProcurementMethodType() {
        return procurementMethodType;
    }

    public void setProcurementMethodType(String procurementMethodType) {
        this.procurementMethodType = procurementMethodType;
    }

    public List<Award> getAwards() {
        return awards;
    }

    public void setAwards(List<Award> awards) {
        this.awards = awards;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public MinimalStep getMinimalStep() {
        return minimalStep;
    }

    public void setMinimalStep(MinimalStep minimalStep) {
        this.minimalStep = minimalStep;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Bid> getBids() {
        return bids;
    }

    public void setBids(List<Bid> bids) {
        this.bids = bids;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public String getAwardCriteria() {
        return awardCriteria;
    }

    public void setAwardCriteria(String awardCriteria) {
        this.awardCriteria = awardCriteria;
    }

    @Override
    public String toString() {
        return "Data{" + '\n' +
                "procurementMethod='" + procurementMethod + '\'' + ", " + '\n' +
                "numberOfBids=" + numberOfBids +                ", " + '\n' +
                "awardPeriod=" + awardPeriod +                ", " + '\n' +
                "complaintPeriod=" + complaintPeriod +                ", " + '\n' +
                "auctionUrl='" + auctionUrl + '\'' +                ", " + '\n' +
                "enquiryPeriod=" + enquiryPeriod +                ", " + '\n' +
                "submissionMethod='" + submissionMethod + '\'' +                ", " + '\n' +
                "procuringEntity=" + procuringEntity +                ", " + '\n' +
                "questions=" + questions +                ", " + '\n' +
                "owner='" + owner + '\'' +                ", " + '\n' +
                "id='" + id + '\'' +                ", " + '\n' +
                "description='" + description + '\'' +                ", " + '\n' +
                "documents=" + documents +                ", " + '\n' +
                "title='" + title + '\'' +                ", " + '\n' +
                "tenderID='" + tenderID + '\'' +                 ", " + '\n' +
                "guarantee=" + guarantee +                 ", " + '\n' +
                "dateModified='" + dateModified + '\'' +                ", " + '\n' +
                "status='" + status + '\'' +                ", " + '\n' +
                "tenderPeriod=" + tenderPeriod +                ", " + '\n' +
                "contracts=" + contracts +                ", " + '\n' +
                "auctionPeriod=" + auctionPeriod +                ", " + '\n' +
                "procurementMethodType='" + procurementMethodType + '\'' +                ", " + '\n' +
                "awards=" + awards +                ", " + '\n' +
                "date='" + date + '\'' +                ", " + '\n' +
                "minimalStep=" + minimalStep +                ", " + '\n' +
                "items=" + items +                ", " + '\n' +
                "bids=" + bids +                "," + '\n' +
                " value=" + value +                ", " + '\n' +
                "awardCriteria='" + awardCriteria + '\'' + '\n' +
                '}';
    }

    /*@Override
    public String toString() {
        return "Data{" + '\n' +
                "procurementMethod='" + procurementMethod + '\'' + '\n' +
                '}';
    }*/
}
