
package com.apiParser.pModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Identifier {

    @SerializedName("scheme")
    @Expose
    public String scheme;
    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("uri")
    @Expose
    public String uri;
    @SerializedName("legalName")
    @Expose
    public String legalName;

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    @Override
    public String toString() {
        return "Identifier{" +
                "scheme='" + scheme + '\'' +
                ", id='" + id + '\'' +
                ", uri='" + uri + '\'' +
                ", legalName='" + legalName + '\'' +
                '}';
    }
}
