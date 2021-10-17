package questions;

import java.util.Arrays;

/**
 * This class represents a Likert Question.
 * A Likert question has 5 options and any of these are Correct. It returns Incorrect if
 * an option other than the 5 option are selected.
 */
public class Likert extends AbstractQuestion {

  /**
   * Creates a new Likert question.
   * @param question - The question text.
   */
  public Likert(String question) {
    super(question, "");
  }

  @Override
  public String answer(String answer) {
    if (Arrays.asList("1", "2", "3", "4", "5").contains(answer)) {
      return CORRECT;
    } else {
      return INCORRECT;
    }
  }

  @Override
  public int compareTo(Question o) {
    AbstractQuestion that = (AbstractQuestion) o;
    return -1 * that.compareToLikert(this);
  }

  @Override
  protected int compareToTrueFalse(TrueFalse other) {
    return 1;
  }

  @Override
  protected int compareToMultipleChoice(MultipleChoice other) {
    return 1;
  }

  @Override
  protected int compareToMultipleSelect(MultipleSelect other) {
    return 1;
  }
}
