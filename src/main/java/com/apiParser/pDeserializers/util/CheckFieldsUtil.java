package com.apiParser.pDeserializers.util;

import com.apiParser.pModel.Address;
import com.google.common.collect.ObjectArrays;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;
import gnu.trove.set.hash.THashSet;

import javax.validation.constraints.NotNull;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

public class CheckFieldsUtil {

    public static Boolean hasFieldsForAllJsonAttrs(JsonElement json, Type type) {

        Set<String> fields = collectAllPojoFieldsConsiderAliens(type);
        Set<String> jsonAttrs = getAllJsonAttrs(json);

        if (!fields.containsAll(jsonAttrs)) { // поле есть в json, но нет в Java классе - ошибка
            //throw new JsonParseException("Parse error! The json has keys that isn't found in Java object:" + type);
            return false;
        }

        return true;
    }

    public static Boolean hasValuesForAllNotNullFields(JsonElement json, Type type) {

        Set<String> notNullFields = collectNotNullPojoFieldsConsiderAliens(type);
        Set<String> jsonAttrs = getAllJsonAttrs(json);

        if (!jsonAttrs.containsAll(notNullFields)) { // поле в Java классе помечено как NotNull, но в json его нет  - ошибка
            //throw new JsonParseException("Parse error! The NotNull fields is absent in json for object:" + type);
            return false;
        }

        return true;
    }


    private static Set<String> collectAllPojoFieldsConsiderAliens(Type type) {

        Class cls = (Class) type;
        // Объединяем все поля класса (приватные, публичные, полученные в результате наследования в один массив
        Field[] fieldsArray = ObjectArrays.concat(cls.getDeclaredFields(), cls.getFields(), Field.class);

        Set<String> fields = new THashSet<String>(fieldsArray.length);

        for(Field field: fieldsArray) {
            String name = field.getName().toLowerCase(); // учитываем возможность разных регистров
            Annotation[] annotations = field.getAnnotations(); // получаем все аннотации поля

            for(Annotation annotation: annotations) {
                if(annotation instanceof SerializedName) {
                    name = ((SerializedName) annotation).value().toLowerCase(); // если аннотация SerializedName задана используем её вместо поля класса в fields и notNullFields
                }
            }
            fields.add(name);
        }
        return fields;
    }

    private static Set<String> collectNotNullPojoFieldsConsiderAliens(Type type) {

        Class cls = (Class) type;
        // Объединяем все поля класса (приватные, публичные, полученные в результате наследования в один массив
        Field[] fieldsArray = ObjectArrays.concat(cls.getDeclaredFields(), cls.getFields(), Field.class);

        Set<String> notNullFields = new THashSet<String>(fieldsArray.length); // Массив имен всех полей класса

        for(Field field: fieldsArray) {
            String name = field.getName().toLowerCase(); // учитываем возможность разных регистров
            Annotation[] annotations = field.getAnnotations(); // получаем все аннотации поля

            boolean isNotNull = false;
            for(Annotation annotation: annotations) {
                if(annotation instanceof NotNull) { // получаем все поля помеченные NotNull
                    isNotNull = true;
                } else if(annotation instanceof SerializedName) {
                    name = ((SerializedName) annotation).value().toLowerCase(); // если аннотация SerializedName задана используем её вместо поля класса в fields и notNullFields
                }
            }
            if(isNotNull) {
                notNullFields.add(name);
            }
        }
        return notNullFields;
    }

    private static Set<String> getAllJsonAttrs(JsonElement json){

        Set<String> jsonAttrs = null;

        if(json instanceof JsonObject) {
            Set<Map.Entry<String, JsonElement>> entries = json.getAsJsonObject().entrySet();
            jsonAttrs = new THashSet<String>(entries.size());
            for (Map.Entry<String, JsonElement> entry : entries) {
                if (!entry.getValue().isJsonNull()) { // Игнорируем поля json, у которых значение null
                    jsonAttrs.add(entry.getKey().toLowerCase()); // собираем коллекцию всех имен полей в json
                }
            }

        } else {
            //TODO: create realization for JsonArray, JsonPrimitive and JsonNull
        }
        return jsonAttrs;
    }



}
