package questions;

/**
 * This class represents a Multiple Choice question.
 * A multiple choice question can have only 1 correct answer and 3 - 8 options.
 * An answer is correct if the correct option is chosen.
 */
public class MultipleChoice extends AbstractQuestion {

  /**
   * Creates and returns a new Multiple Choice question.
   * @param question - The question text.
   * @param answer - The correct answer for the question.
   * @param options - 3 - 8 options for the question.
   */
  public MultipleChoice(String question, String answer, String... options) {
    super(question, answer);
  }

  @Override
  public int compareTo(Question o) {
    AbstractQuestion that = (AbstractQuestion) o;
    return -1 * that.compareToMultipleChoice(this);
  }

  @Override
  protected int compareToTrueFalse(TrueFalse other) {
    return 1;
  }

  @Override
  protected int compareToMultipleSelect(MultipleSelect other) {
    return -1;
  }

  @Override
  protected int compareToLikert(Likert other) {
    return -1;
  }
}
