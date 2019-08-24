package android.beltrao.com.quiz.model;

public class Answer {

    private String value;
    private boolean isRigth;
    private boolean isChecked;

    public Answer(String value, boolean isRigth) {
        this.value = value;
        this.isRigth = isRigth;
        this.isChecked = false;
    }
    public Answer(String value) {
        this.value = value;
        this.isRigth = false;
        this.isChecked = false;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isRigth() {
        return isRigth;
    }

    public void setRigth(boolean rigth) {
        isRigth = rigth;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public boolean thatIsCorrect(){
        return  this.isChecked() && this.isRigth() == true ;
    }
}
