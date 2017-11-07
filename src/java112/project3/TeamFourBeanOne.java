package java112.project3;

/**
 * JavaBean
 */
public class TeamFourBeanOne {

    // Declare instance variable
    private String questionOne;
    private String questionTwo;
    private String questionThree;
    private int questionFour;

    public TeamFourBeanOne(String questionOne, String questionTwo, String questionThree, int questionFour) {
        this();
        this.setQuestionOne(questionOne);
        this.setQuestionTwo(questionTwo);
        this.setQuestionThree(questionThree);
        this.setQuestionFour(questionFour);
    }

    public TeamFourBeanOne() {

    }


    public String getQuestionOne() {
        return questionOne;
    }

    public String getQuestionTwo() {
        return questionTwo;
    }

    public String getQuestionThree() {
        return questionThree;
    }

    public int getQuestionFour() {
        return questionFour;
    }

    public void setQuestionOne(String questionOne) {
        this.questionOne = questionOne;
    }

    public void setQuestionTwo(String questionTwo) {
        this.questionTwo = questionTwo;
    }

    public void setQuestionThree(String questionThree) {
        this.questionThree = questionThree;
    }

    public void setQuestionFour(int questionFour) {
        this.questionFour = questionFour;
    }
}