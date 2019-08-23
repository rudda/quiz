package android.beltrao.com.quiz;

import android.beltrao.com.quiz.model.Question;
import java.util.Collections;
import java.util.List;

public class Quiz {

    private List<Question> questions;
    private int index = -1;

    /**
     * just shuffles the questions
     */
    public void shuffleQuestions(){
        Collections.shuffle(this.questions);
    }

    /**
     * get the next question
     * @return Question
     */
    public Question next(){
        this.incrementIndex();
        return this.questions.get(this.incrementIndex());
    }

    /**
     * get the back question
     * @return Question
     */
    public Question back(){
        return this.questions.get(this.decrementIndex());
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    /**
     *  increment index at questions size limit
     * @return index
     */
    private int incrementIndex(){
        if( this.questions != null && this.questions.size() < (this.index + 1) ) {
            this.index ++;
        }
        return this.index;
    }

    /**
     * decrement index at zero limit
     * @return index
     */
    private  int decrementIndex(){
        if(this.index >= 0 ){
            this.index--;
        }
        return index;
    }

}
