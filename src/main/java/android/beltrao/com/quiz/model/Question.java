package android.beltrao.com.quiz.model;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private String title;
    private String body;
    private Drawable ilustration;
    private List<Answer> anwsers;

    public Question() {
        this.anwsers = new ArrayList<>();
    }

    public Question(String title, String body, Drawable ilustration) {
        this.title = title;
        this.body = body;
        this.ilustration = ilustration;
        this.anwsers = new ArrayList<>();
    }

    public Question(String title, String body) {
        this.title = title;
        this.body = body;
        this.anwsers = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Drawable getIlustration() {
        return ilustration;
    }

    public void setIlustration(Drawable ilustration) {
        this.ilustration = ilustration;
    }

    public List<Answer> getAnwsers() {
        return anwsers;
    }

    public void setAnwsers(List<Answer> anwsers) {
        this.anwsers = anwsers;
    }

    public  Question addAnser( Answer a ){
        this.getAnwsers().add(a);
        return this;
    }
}
