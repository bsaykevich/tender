
package com.apiParser.pDeserializers;

import com.apiParser.pDeserializers.util.DeserializersUtil;
import com.apiParser.pModel.Unit;
import com.google.gson.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Type;

public class UnitDeserializer implements JsonDeserializer<Unit> {

  /*  @SerializedName("code")
    @Expose
    public String code;
    @SerializedName("name")
    @Expose
    public String name;

*/

    @Override
    public Unit deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

       Unit unit = new Unit();

        JsonObject jsonObject = json.getAsJsonObject();

        JsonElement code = jsonObject.get("code");
        unit.setCode(DeserializersUtil.convertString(code));

        JsonElement name = jsonObject.get("name");
        unit.setName(DeserializersUtil.convertString(name));


        return unit;
    }
}
