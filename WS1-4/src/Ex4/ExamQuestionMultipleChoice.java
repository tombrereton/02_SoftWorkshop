package Ex4;

import java.util.ArrayList;

/**
 * This is a class called ExamQuestionMultipleChoice which
 * extends ExamQuestion. It consists of the question, maximum mark
 * a list of possible answers, and a list of the index of correct answers
 * in the possible answers
 *
 * @author Thomas Brereton
 * @version 2016.11.16
 */
public class ExamQuestionMultipleChoice extends ExamQuestion {
    private ArrayList<String> possibleAnswers = new ArrayList<>();
    private ArrayList<Integer> correctAnswers = new ArrayList<>();

    /**
     * We use a constructor to create an object the class
     * which is made up of questionText, maximalMark,
     * possibleAnswers, correctAnswers.
     *
     * @param questionText    The question which must be answered correctly
     * @param maximalMark     The maximum mark that is awarded if the question is answered completely correct
     * @param possibleAnswers A list of possible answers which the user selects from
     * @param correctAnswers  A list of the index of correct answers in possible answers
     */
    public ExamQuestionMultipleChoice(String questionText,
                                      int maximalMark,
                                      ArrayList<String> possibleAnswers,
                                      ArrayList<Integer> correctAnswers) {
        super(questionText, maximalMark);
        this.possibleAnswers = possibleAnswers;
        this.correctAnswers = correctAnswers;
    }

    /**
     * Getter for list of possible answers
     *
     * @return list of possible answers
     */
    public ArrayList<String> getPossibleAnswers() {
        return possibleAnswers;
    }

    /**
     * Getter for list of index of correct answers in possible answers
     *
     * @return list of index of correct answers in possible answers
     */
    public ArrayList<Integer> getCorrectAnswers() {
        return correctAnswers;
    }

    /**
     * Setter for possible answers
     *
     * @param possibleAnswers a list of possible answers
     */
    public void setPossibleAnswers(ArrayList<String> possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }

    /**
     * Setter for correct answers
     *
     * @param correctAnswers a list of the index of correct answers in possible answers
     */
    public void setCorrectAnswers(ArrayList<Integer> correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    /**
     * We use a method that computes the marks dependent
     * on the correct answer(s) and answer(s) provided.
     *
     * @param answersProvided is an ArrayList of answers which are to
     *                        be checked against the correct answers.
     * @return mark of type int, which is the mark awarded depending on
     * on the answers provided and correct answers.
     */
    public int mark(ArrayList<Integer> answersProvided) {
        int numberOfAnswersGiven = answersProvided.size();

        // Do you find the comments here useful or is it
        // simpler to leave it as descriptive variable names?
        // Thank David! Found your feedback last time really
        // useful.

        // We remove all the duplicates (correct answers) between
        // the answersProvided and correctAnswers
        answersProvided.removeAll(this.getCorrectAnswers());

        // We take the size of the ArrayList after removing duplicates
        // to get the number of incorrect answers
        int numberOfIncorrectAnswersGiven = answersProvided.size();

        // We take the size of the correct answers given for computing the mark
        int numberOfCorrectAnswersGiven = numberOfAnswersGiven - numberOfIncorrectAnswersGiven;

        // We take the difference between correct and incorrect answers,
        // or 0 if the difference is negative
        int differenceInAnswers = Math.max(numberOfCorrectAnswersGiven - numberOfIncorrectAnswersGiven, 0);

        // We compute the percentage of difference-in-answers in
        // correct-answers, and scale it to the maximal mark
        return this.getMaximalMark() * (differenceInAnswers) / this.getCorrectAnswers().size();
    }

    /**
     * ToString method which uses the super class for the 1st line
     * and this class for the 2nd line
     *
     * @return a human readable string
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nProvide the index(s) of the correct answer(s) from the following: " +
                this.getPossibleAnswers().toString();
    }
}
