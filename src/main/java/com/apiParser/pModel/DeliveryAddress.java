
package com.apiParser.pModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DeliveryAddress {

    @SerializedName("postalCode")
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

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    @Override
    public String toString() {
        return "DeliveryAddress{" +
                "postalCode='" + postalCode + '\'' +
                ", countryName='" + countryName + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", region='" + region + '\'' +
                ", locality='" + locality + '\'' +
                '}';
    }
}
