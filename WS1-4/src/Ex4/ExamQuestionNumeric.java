package Ex4;

/**
 * This is a class called ExamQuestionNumeric which
 * extends ExamQuestion. It consists of the question, maximum mark
 * a list of possible answers, and the correct answer
 *
 * @author Thomas Brereton
 * @version 2016.11.16
 */
public class ExamQuestionNumeric extends ExamQuestion {
    private int numericalAnswer;

    /**
     * We use a constructor to create an object the class
     * which is made up of questionText, maximalMark, and
     * possibleAnswers.
     *
     * @param questionText    The question which must be answered correctly
     * @param maximalMark     The maximum mark that is awarded if the question is answered completely correct
     * @param numericalAnswer The correct answer to the question
     */
    public ExamQuestionNumeric(String questionText,
                               int maximalMark,
                               int numericalAnswer) {
        super(questionText, maximalMark);
        this.numericalAnswer = numericalAnswer;
    }

    /**
     * Getter for numericalAnswer
     *
     * @return the numericalAnswer of type int
     */
    public int getNumericalAnswer() {
        return numericalAnswer;
    }

    /**
     * Setter for numerical answer
     *
     * @param numericalAnswer the correct answer to the question
     */
    public void setNumericalAnswer(int numericalAnswer) {
        this.numericalAnswer = numericalAnswer;
    }

    /**
     * We use a method to that returns full marks is the
     * answer is correct, 0 if not
     *
     * @param value the attempt answer for the question of type int
     * @return the mark of type int which is full for correct answer, 0 if not
     */
    public int mark(int value) {
        return (this.getNumericalAnswer() == value) ? this.getMaximalMark() : 0;
    }
}
