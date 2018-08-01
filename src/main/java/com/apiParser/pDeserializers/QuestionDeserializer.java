
package com.apiParser.pDeserializers;

import com.apiParser.pDeserializers.util.DeserializersUtil;
import com.apiParser.pModel.Author;
import com.apiParser.pModel.Period;
import com.apiParser.pModel.Question;
import com.google.gson.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Type;

public class QuestionDeserializer implements JsonDeserializer<Question> {

   /* @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("author")
    @Expose
    public Author author;
    @SerializedName("answer")
    @Expose
    public String answer;
    @SerializedName("date")
    @Expose
    public String date;
    @SerializedName("dateAnswered")
    @Expose
    public String dateAnswered;
    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("questionOf")
    @Expose
    public String questionOf;
*/

    @Override
    public Question deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        Question question = new Question();

        JsonObject jsonObject = json.getAsJsonObject();

        JsonElement description = jsonObject.get("description");
        question.setDescription(DeserializersUtil.convertString(description));

        JsonElement title = jsonObject.get("title");
        question.setTitle(DeserializersUtil.convertString(title));

        JsonElement author = jsonObject.get("author");
        question.setAuthor(DeserializersUtil.convertObject(author, Author.class, context));

        JsonElement answer = jsonObject.get("answer");
        question.setAnswer(DeserializersUtil.convertString(answer));

        JsonElement date = jsonObject.get("date");
        question.setDate(DeserializersUtil.convertString(date));

        JsonElement dateAnswered = jsonObject.get("dateAnswered");
        question.setDateAnswered(DeserializersUtil.convertString(dateAnswered));

        JsonElement id = jsonObject.get("id");
        question.setId(DeserializersUtil.convertString(id));

        JsonElement questionOf = jsonObject.get("questionOf");
        question.setQuestionOf(DeserializersUtil.convertString(questionOf));


        return question;
    }
}
