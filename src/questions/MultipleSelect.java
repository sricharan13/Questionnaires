package questions;

/**
 * This class represents a Multiple Select question.
 * A multiple select question can have multiple correct answers and 3 - 8 options.
 * An answer is correct if all the correct options are chosen and no incorrect option is selected.
 */
public class MultipleSelect extends AbstractQuestion {

  /**
   *  Creates and returns a new Multiple Select question.
   * @param question - The question text.
   * @param answer - The correct answer(s) for the question.
   * @param options - 3 - 8 options for the question.
   */
  public MultipleSelect(String question, String answer, String... options) {
    super(question, answer);
  }

  @Override
  public int compareTo(Question o) {
    AbstractQuestion that = (AbstractQuestion) o;
    return -1 * that.compareToMultipleSelect(this);
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
  protected int compareToLikert(Likert other) {
    return -1;
  }
}
