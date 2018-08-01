
package com.apiParser.pModel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Contract {

    @SerializedName("status")
    @Expose
    public String status;
    @SerializedName("documents")
    @Expose
    public List<Document> documents = null;
    @SerializedName("items")
    @Expose
    public List<Item> items = null;
    @SerializedName("suppliers")
    @Expose
    public List<Supplier> suppliers = null;
    @SerializedName("contractNumber")
    @Expose
    public String contractNumber;
    @SerializedName("period")
    @Expose
    public Period period;
    @SerializedName("dateSigned")
    @Expose
    public String dateSigned;
    @SerializedName("value")
    @Expose
    public Value value;
    @SerializedName("date")
    @Expose
    public String date;
    @SerializedName("awardID")
    @Expose
    public String awardID;
    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("contractID")
    @Expose
    public String contractID;

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

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Supplier> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(List<Supplier> suppliers) {
        this.suppliers = suppliers;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    public String getDateSigned() {
        return dateSigned;
    }

    public void setDateSigned(String dateSigned) {
        this.dateSigned = dateSigned;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAwardID() {
        return awardID;
    }

    public void setAwardID(String awardID) {
        this.awardID = awardID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContractID() {
        return contractID;
    }

    public void setContractID(String contractID) {
        this.contractID = contractID;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "status='" + status + '\'' +
                ", documents=" + documents +
                ", items=" + items +
                ", suppliers=" + suppliers +
                ", contractNumber='" + contractNumber + '\'' +
                ", period=" + period +
                ", dateSigned='" + dateSigned + '\'' +
                ", value=" + value +
                ", date='" + date + '\'' +
                ", awardID='" + awardID + '\'' +
                ", id='" + id + '\'' +
                ", contractID='" + contractID + '\'' +
                '}';
    }
}
