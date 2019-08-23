package android.beltrao.com.quiz;

import android.beltrao.com.quiz.model.Question;

public class QuizBuilder {
    private Quiz quiz;

    public QuizBuilder() {
        this.quiz = new Quiz();
    }
    public Quiz addQuestion(Question q) {
        this.quiz.getQuestions().add(q);
        return  this.quiz;
    }

    public Quiz removeQuestion(int index){
        this.quiz.getQuestions().remove(index);
        return this.quiz;
    };
    public Quiz build(){
        return this.quiz;
    }

}
