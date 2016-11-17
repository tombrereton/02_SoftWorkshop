package Ex4;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * This is a class called ExamQuestionTest which
 * tests the ExamQuestion and its child classes
 *
 * @author Thomas Brereton
 * @version 2016.11.16
 */
public class ExamQuestionTest {

    // SET UP
    ExamQuestion eq1 = new ExamQuestion("What is 2 times 3?", 10);
    ExamQuestionNumeric eqn1 = new ExamQuestionNumeric("2+3 = ?", 10, 5);

    ArrayList<String> answerList1 = new ArrayList<>(Arrays.asList("4", "5", "10", "20"));
    ExamQuestionSimpleChoice eqsc1 = new ExamQuestionSimpleChoice("2+3 = ?", 10, answerList1, 2);

    ArrayList<String> answerList2 = new ArrayList<>(Arrays.asList("-2", "0", "2", "3"));
    ArrayList<Integer> correctAnswers1 = new ArrayList<>(Arrays.asList(1,3));
    ArrayList<Integer> answersProvided1 = new ArrayList<>(Arrays.asList(1,3));
    ArrayList<Integer> answersProvided2 = new ArrayList<>(Arrays.asList(1,2,3));
    ArrayList<Integer> answersProvided3 = new ArrayList<>(Arrays.asList(1,2,3,4));
    ArrayList<Integer> answersProvided4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
    ExamQuestionMultipleChoice eqmc1 = new ExamQuestionMultipleChoice("2+3 = ?", 10, answerList2, correctAnswers1);


    // TESTS

    @Test
    public void test1() throws Exception {
        String expected = "Question (maximal mark: 10): What is 2 times 3?";

        assertEquals("Should return string matching expected", expected, eq1.toString());

    }

    @Test
    public void test2() throws Exception {
        String expected = "Question (maximal mark: 10): 2+3 = ?";

        assertEquals("Should return string matching expected", expected, eqn1.toString());

    }

    @Test
    public void test3() throws Exception {
        int expected = 10;

        assertEquals("Should return int matching expected", expected, eqn1.mark(5));

    }

    @Test
    public void test4() throws Exception {
        int expected = 0;

        assertEquals("Should return int matching expected", expected, eqn1.mark(6));

    }

    @Test
    public void test5() throws Exception {
        int expected = 10;

        assertEquals("Should return int matching expected", expected, eqsc1.mark(2));

    }

    @Test
    public void test6() throws Exception {
        int expected = 0;

        assertEquals("Should return int matching expected", expected, eqsc1.mark(3));

    }

    @Test
    public void test7() throws Exception {
        int expected = 0;

        assertEquals("Should return int matching expected", expected, eqsc1.mark(0));

    }

    @Test
    public void test8() throws Exception {
        String expected = "Question (maximal mark: 10): 2+3 = ?";

        assertEquals("Should return string matching expected", expected, eqsc1.toString());

    }

    @Test
    public void test9() throws Exception {
        int expected = 10;

        assertEquals("Should return int matching expected", expected, eqmc1.mark(answersProvided1));

    }

    @Test
    public void test10() throws Exception {
        int expected = 5;

        assertEquals("Should return int matching expected", expected, eqmc1.mark(answersProvided2));

    }

    @Test
    public void test11() throws Exception {
        int expected = 0;

        assertEquals("Should return int matching expected", expected, eqmc1.mark(answersProvided3));
    }

    @Test
    public void test12() throws Exception {
        int expected = 0;

        assertEquals("Should return int matching expected", expected, eqmc1.mark(answersProvided4));
    }

    @Test
    public void test13() throws Exception {
        String expected = "Question (maximal mark: 10): 2+3 = ?\n" +
                "Provide the index(s) of the correct answer(s) from the following: [-2, 0, 2, 3]";

        assertEquals("Should return string matching expected", expected, eqmc1.toString());

    }

}