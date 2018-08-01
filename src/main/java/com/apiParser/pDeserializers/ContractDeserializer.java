
package com.apiParser.pDeserializers;

import com.apiParser.pDeserializers.util.DeserializersUtil;
import com.apiParser.pModel.*;
import com.google.gson.*;

import java.lang.reflect.Type;

public class ContractDeserializer implements JsonDeserializer<Contract> {

   /* @SerializedName("status")
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
*/

    @Override
    public Contract deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        Contract contract = new Contract();

        JsonObject jsonObject = json.getAsJsonObject();

        JsonElement status = jsonObject.get("status");
        contract.setStatus(DeserializersUtil.convertString(status));

        JsonElement documents = jsonObject.get("documents");
        contract.setDocuments(DeserializersUtil.convertArray(documents, Document.class, context));

        JsonElement items = jsonObject.get("items");
        contract.setItems(DeserializersUtil.convertArray(items, Item.class, context));

        JsonElement suppliers = jsonObject.get("suppliers");
        contract.setSuppliers(DeserializersUtil.convertArray(suppliers, Supplier.class, context));

        JsonElement contractNumber = jsonObject.get("contractNumber");
        contract.setContractNumber(DeserializersUtil.convertString(contractNumber));

        JsonElement period = jsonObject.get("period");
        contract.setPeriod(DeserializersUtil.convertObject(period, Period.class, context));

        JsonElement dateSigned = jsonObject.get("dateSigned");
        contract.setDateSigned(DeserializersUtil.convertString(dateSigned));

        JsonElement value = jsonObject.get("value");
        contract.setValue(DeserializersUtil.convertObject(value, Value.class, context));

        JsonElement date = jsonObject.get("date");
        contract.setDate(DeserializersUtil.convertString(date));

        JsonElement awardID = jsonObject.get("awardID");
        contract.setAwardID(DeserializersUtil.convertString(awardID));

        JsonElement id = jsonObject.get("id");
        contract.setId(DeserializersUtil.convertString(id));

        JsonElement contractID = jsonObject.get("contractID");
        contract.setContractID(DeserializersUtil.convertString(contractID));


        return contract;
    }
}
