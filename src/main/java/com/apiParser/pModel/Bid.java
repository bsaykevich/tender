
package com.apiParser.pModel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Bid {

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    public Boolean getSelfEligible() {
        return selfEligible;
    }

    public void setSelfEligible(Boolean selfEligible) {
        this.selfEligible = selfEligible;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public Boolean getSelfQualified() {
        return selfQualified;
    }

    public void setSelfQualified(Boolean selfQualified) {
        this.selfQualified = selfQualified;
    }

    public List<Tenderer> getTenderers() {
        return tenderers;
    }

    public void setTenderers(List<Tenderer> tenderers) {
        this.tenderers = tenderers;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getParticipationUrl() {
        return participationUrl;
    }

    public void setParticipationUrl(String participationUrl) {
        this.participationUrl = participationUrl;
    }

    public String getSubcontractingDetails() {
        return subcontractingDetails;
    }

    public void setSubcontractingDetails(String subcontractingDetails) {
        this.subcontractingDetails = subcontractingDetails;
    }

    @Override
    public String toString() {
        return "Bid{" +
                "status='" + status + '\'' +
                ", id='" + id + '\'' +
                ", documents=" + documents +
                ", selfEligible=" + selfEligible +
                ", value=" + value +
                ", selfQualified=" + selfQualified +
                ", tenderers=" + tenderers +
                ", date='" + date + '\'' +
                ", participationUrl='" + participationUrl + '\'' +
                ", subcontractingDetails='" + subcontractingDetails + '\'' +
                '}';
    }
}
