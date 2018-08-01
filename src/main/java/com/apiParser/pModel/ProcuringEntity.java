
package com.apiParser.pModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProcuringEntity {

    @SerializedName("contactPoint")
    @Expose
    public ContactPoint contactPoint;
    @SerializedName("identifier")
    @Expose
    public Identifier identifier;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("kind")
    @Expose
    public String kind;
    @SerializedName("address")
    @Expose
    public Address address;

    public ContactPoint getContactPoint() {
        return contactPoint;
    }

    public void setContactPoint(ContactPoint contactPoint) {
        this.contactPoint = contactPoint;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ProcuringEntity{" +
                "contactPoint=" + contactPoint +
                ", identifier=" + identifier +
                ", name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                ", address=" + address +
                '}';
    }
}
