package questions;

/**
 * This class represents a TrueFalse question.
 * It has 2 options True or False and An answer is correct if the correct option is chosen.
 */
public class TrueFalse extends AbstractQuestion {

  /**
   * Creates and returns a new True False question.
   * @param question - The question text.
   * @param answer - The correct answer for this question.
   */
  public TrueFalse(String question, String answer) {
    super(question, answer);
  }

  @Override
  public int compareTo(Question o) {
    AbstractQuestion that = (AbstractQuestion) o;
    return -1 * that.compareToTrueFalse(this);
  }

  @Override
  protected int compareToMultipleChoice(MultipleChoice other) {
    return -1;
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
