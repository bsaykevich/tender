
package com.apiParser.pModel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Award {

    @SerializedName("status")
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    public ComplaintPeriod getComplaintPeriod() {
        return complaintPeriod;
    }

    public void setComplaintPeriod(ComplaintPeriod complaintPeriod) {
        this.complaintPeriod = complaintPeriod;
    }

    public List<Supplier> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(List<Supplier> suppliers) {
        this.suppliers = suppliers;
    }

    public Boolean getEligible() {
        return eligible;
    }

    public void setEligible(Boolean eligible) {
        this.eligible = eligible;
    }

    public String getBidId() {
        return bidId;
    }

    public void setBidId(String bidId) {
        this.bidId = bidId;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public Boolean getQualified() {
        return qualified;
    }

    public void setQualified(Boolean qualified) {
        this.qualified = qualified;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Award{" +
                "status='" + status + '\'' +
                ", documents=" + documents +
                ", complaintPeriod=" + complaintPeriod +
                ", suppliers=" + suppliers +
                ", eligible=" + eligible +
                ", bidId='" + bidId + '\'' +
                ", value=" + value +
                ", qualified=" + qualified +
                ", date='" + date + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
