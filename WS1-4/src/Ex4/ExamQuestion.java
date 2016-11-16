package Ex4;

/**
 * This is a class called ExamQuestion.
 * It consists of the question and maximum mark.
 *
 * @author Thomas Brereton
 * @version 2016.11.16
 */
public class ExamQuestion {
    private String questionText;
    private int maximalMark;

    /**
     * We use a constructor to create an object the class
     * which is made up of questionText and maximalMark.
     *
     * @param questionText The question which must be answered correctly
     * @param maximalMark  The maximum mark that is awarded if the question is answered completely correct
     */
    public ExamQuestion(String questionText, int maximalMark) {
        this.questionText = questionText;
        this.maximalMark = maximalMark;
    }

    /**
     * Getter for questionText
     *
     * @return the text of the question
     */
    public String getQuestionText() {
        return questionText;
    }

    /**
     * Getter for maximalMark
     *
     * @return the maximum mark awarded
     */
    public int getMaximalMark() {
        return maximalMark;
    }

    /**
     * Setter for question text
     *
     * @param questionText the text for the question asked
     */
    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    /**
     * Setter for maximalMark
     *
     * @param maximalMark the maximum mark if the question is answered correctly
     */
    public void setMaximalMark(int maximalMark) {
        this.maximalMark = maximalMark;
    }

    /**
     * A toString method which includes the maximalMark and questionText
     * in human readable format
     *
     * @return a human readable text
     */
    @Override
    public String toString() {
        return String.format("Question (maximal mark: %d): %s",
                this.maximalMark,
                this.questionText);
    }
}
