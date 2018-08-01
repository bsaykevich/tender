
package com.apiParser.pModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Question {

    @SerializedName("description")
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDateAnswered() {
        return dateAnswered;
    }

    public void setDateAnswered(String dateAnswered) {
        this.dateAnswered = dateAnswered;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuestionOf() {
        return questionOf;
    }

    public void setQuestionOf(String questionOf) {
        this.questionOf = questionOf;
    }

    @Override
    public String toString() {
        return "Question{" +
                "description='" + description + '\'' +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", answer='" + answer + '\'' +
                ", date='" + date + '\'' +
                ", dateAnswered='" + dateAnswered + '\'' +
                ", id='" + id + '\'' +
                ", questionOf='" + questionOf + '\'' +
                '}';
    }
}
