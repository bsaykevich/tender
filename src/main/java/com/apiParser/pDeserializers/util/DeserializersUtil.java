package com.apiParser.pDeserializers.util;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class DeserializersUtil {

    public static String convertString(JsonElement jsonElement){
        if (jsonElement != null && jsonElement.isJsonPrimitive()){
            return jsonElement.getAsString();
        } else {
            //throw new JsonParseException("log alert");
            System.out.println("parse problem");
            return null;
        }
    }

    public static Boolean convertBoolean(JsonElement jsonElement){
        if (jsonElement != null && jsonElement.isJsonPrimitive()){
            return jsonElement.getAsBoolean();
        } else {
            //throw new JsonParseException("log alert");
            System.out.println("parse problem");
            return null;
        }
    }

    public static Integer convertInteger(JsonElement jsonElement){
        if (jsonElement != null && jsonElement.isJsonPrimitive()){
            return jsonElement.getAsInt();
        } else {
            //throw new JsonParseException("log alert");
            System.out.println("parse problem");
            return null;
        }
    }

    public static <T> T convertObject(
            JsonElement jsonElement,
            Type typeOfT,
            JsonDeserializationContext context
    ){
        if (jsonElement != null && !jsonElement.isJsonNull()){
            return  context.deserialize(jsonElement, typeOfT);
        } else {
            //throw new JsonParseException("log alert");
            System.out.println("parse problem");
            return null;
        }
    }

    public static <T> List<T> convertArray(
            JsonElement jsonElement,
            Type typeOfT,
            JsonDeserializationContext context
    ){
        List<T> objectsList = new ArrayList<>();
        if (jsonElement != null && jsonElement.isJsonArray()){
            JsonArray objArr = (JsonArray) jsonElement;
            for(JsonElement obj : objArr){
                if (jsonElement != null) {
                    T object = context.deserialize(obj, typeOfT);
                    objectsList.add(object);
                } else {
                    //throw new JsonParseException("log alert");
                    System.out.println("parse problem");
                    return null;
                }
            }
            return  objectsList;
        } else {
            //throw new JsonParseException("log alert");
            System.out.println("parse problem");
            return null;
        }
    }

}
