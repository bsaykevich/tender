
package com.apiParser.pDeserializers;

import com.apiParser.pDeserializers.util.DeserializersUtil;
import com.apiParser.pModel.Document;
import com.google.gson.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Type;

public class DocumentDeserializer implements JsonDeserializer<Document> {

/*
    @SerializedName("hash")
    @Expose
    public String hash;
    @SerializedName("author")
    @Expose
    public String author;
    @SerializedName("format")
    @Expose
    public String format;
    @SerializedName("url")
    @Expose
    public String url;
    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("documentOf")
    @Expose
    public String documentOf;
    @SerializedName("datePublished")
    @Expose
    public String datePublished;
    @SerializedName("documentType")
    @Expose
    public String documentType;
    @SerializedName("dateModified")
    @Expose
    public String dateModified;
    @SerializedName("relatedItem")
    @Expose
    public String relatedItem;
    @SerializedName("id")
    @Expose
    public String id;
*/



    @Override
    public Document deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        Document document = new Document();

        JsonObject jsonObject = json.getAsJsonObject();

        JsonElement hash = jsonObject.get("hash");
        document.setHash(DeserializersUtil.convertString(hash));

        JsonElement author = jsonObject.get("author");
        document.setAuthor(DeserializersUtil.convertString(author));

        JsonElement format = jsonObject.get("format");
        document.setFormat(DeserializersUtil.convertString(format));

        JsonElement url = jsonObject.get("url");
        document.setUrl(DeserializersUtil.convertString(url));

        JsonElement title = jsonObject.get("title");
        document.setTitle(DeserializersUtil.convertString(title));

        JsonElement documentOf = jsonObject.get("documentOf");
        document.setDocumentOf(DeserializersUtil.convertString(documentOf));

        JsonElement datePublished = jsonObject.get("datePublished");
        document.setDatePublished(DeserializersUtil.convertString(datePublished));

        JsonElement documentType = jsonObject.get("documentType");
        document.setDocumentType(DeserializersUtil.convertString(documentType));

        JsonElement dateModified = jsonObject.get("dateModified");
        document.setDateModified(DeserializersUtil.convertString(dateModified));

        JsonElement relatedItem = jsonObject.get("relatedItem");
        document.setRelatedItem(DeserializersUtil.convertString(relatedItem));

        JsonElement id = jsonObject.get("id");
        document.setId(DeserializersUtil.convertString(id));

        return document;
    }
}
