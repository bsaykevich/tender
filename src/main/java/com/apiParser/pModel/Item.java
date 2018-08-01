
package com.apiParser.pModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("description")
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Classification getClassification() {
        return classification;
    }

    public void setClassification(Classification classification) {
        this.classification = classification;
    }

    public DeliveryAddress getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(DeliveryAddress deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public DeliveryDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(DeliveryDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "description='" + description + '\'' +
                ", classification=" + classification +
                ", deliveryAddress=" + deliveryAddress +
                ", deliveryDate=" + deliveryDate +
                ", id='" + id + '\'' +
                ", unit=" + unit +
                ", quantity=" + quantity +
                '}';
    }
}
