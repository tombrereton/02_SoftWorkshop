package Ex4;

import java.util.ArrayList;

/**
 * This is a class called ExamQuestionSimpleChoice which
 * extends ExamQuestionNumeric. It consists of the question, maximum mark
 * a list of possible answers, and the index of the correct answer
 * in the possible answers
 *
 * @author Thomas Brereton
 * @version 2016.11.16
 */
public class ExamQuestionSimpleChoice extends ExamQuestionNumeric {
    private ArrayList<String> possibleAnswers = new ArrayList<>();

    /**
     * We use a constructor to create an object the class
     * which is made up of questionText, maximalMark,
     * possibleAnswers, correctAnswer.
     * <p>
     * We pass questionText, maximalMark and correctAnswer to the super class.
     * This is possible as the method "mark", in the super class,
     * only compares the value of correctAnswer to the value passed
     * into "mark". If it is true, full marks are awarded, 0 if not.
     *
     * @param questionText    The question which must be answered correctly
     * @param maximalMark     The maximum mark that is awarded if the question is answered completely correct
     * @param possibleAnswers A list of possible answers which the user selects from
     * @param correctAnswer   the index of the correct answer in possible answers
     */
    public ExamQuestionSimpleChoice(String questionText,
                                    int maximalMark,
                                    ArrayList<String> possibleAnswers,
                                    int correctAnswer) {
        super(questionText, maximalMark, correctAnswer);
        this.possibleAnswers = possibleAnswers;
    }

}
