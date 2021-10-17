import static org.junit.Assert.assertEquals;

import org.junit.Test;
import questions.Likert;
import questions.MultipleChoice;
import questions.MultipleSelect;
import questions.Question;
import questions.TrueFalse;

import java.util.Arrays;

/**
 * Tests for The Question Interface. Tests the functionality of all functions.
 */
public class QuestionTest {

  Question q1 = new Likert("PDP is a useful course");
  Question q2 = new MultipleChoice("PDP uses which language?", "Java", "Java", "Python", "C");
  Question q3 = new MultipleSelect("PDP uses which technologies?",
          "Java 11, Junit 4", "Java 11", "Junit 4", "Java 16", "Junit 5");
  Question q4 = new MultipleChoice("PDP is taught by?",
          "Prof. Clark", "Prof. Clark", "Jeff Bezos", "Elon Musk");
  Question q5 = new TrueFalse("PDP stands for Programming Design Paradigms", "True");
  Question q6 = new TrueFalse("PDP is a tough course", "True");
  Question q7 = new MultipleChoice("Prof. Clark is a professor at?",
          "NEU", "NEU", "BU", "MIT", "Wentworth");
  Question q8 = new MultipleSelect("Khoury has which disciplines",
          "CS, DS, AI", "CS", "DS", "AI", "IS");
  Question q9 = new TrueFalse("PDP is taught by Elon Musk", "False");
  Question q10 = new Likert("All questions in this questionnaire are related to PDP");

  /**
   * This test checks if TrueFalse questions are working correctly.
   */
  @Test
  public void testTrueFalse() {
    assertEquals("Correct", q5.answer("True"));
    assertEquals("Incorrect", q5.answer("False"));
  }

  /**
   * This test checks if MultipleChoice questions are working correctly.
   */
  @Test
  public void testMultipleChoice() {
    assertEquals("Correct", q4.answer("Prof. Clark"));
    assertEquals("Incorrect", q4.answer("Elon"));
  }

  /**
   * This test checks if MultipleSelect questions are working correctly.
   */
  @Test
  public void testMultipleSelect() {
    assertEquals("Correct", q8.answer("CS, DS, AI"));
    assertEquals("Incorrect", q8.answer("CS, DS, IS"));
  }

  /**
   * This test checks if Likert questions are working correctly.
   */
  @Test
  public void testLikert() {
    assertEquals("Correct", q1.answer("5"));
    assertEquals("Incorrect", q1.answer("6"));
  }

  /**
   * This test checks if questions are being ordered in the right format.
   */
  @Test
  public void testSort() {
    Question[] questionnaire = {q1, q2, q3, q4, q5, q6, q7, q8, q9, q10};
    // q1, q10 are Likert, lexicographical ordering: q10, q1
    // q2, q4, q7 are MultipleChoice,  lexicographical ordering: q4, q2, q7
    // q3, q8 are MultipleSelect, lexicographical ordering: q8, q3
    // q5, q6, q9 are TrueFalse, lexicographical ordering: q6, q9, q5
    Question[] expected = {q6, q9, q5, q4, q2, q7, q8, q3, q10, q1};
    Arrays.sort(questionnaire);
    for (int i = 0; i < questionnaire.length; i++) {
      assertEquals(expected[i].getText(), questionnaire[i].getText());
    }
  }
}