package questions;

/**
 * This class represents an abstract question.
 * It provides the functionality common to all questions.
 */
public abstract class AbstractQuestion implements Question {

  protected String question;
  protected String answer;

  protected AbstractQuestion(String question, String answer) {
    this.question = question;
    this.answer = answer;
  }

  @Override
  public String getText() {
    return question;
  }

  @Override
  public String answer(String answer) {
    if (this.answer.equals(answer)) {
      return CORRECT;
    }
    else {
      return INCORRECT;
    }
  }

  protected int compareToTrueFalse(TrueFalse other) {
    return this.getText().compareTo(other.getText());
  }

  protected int compareToMultipleChoice(MultipleChoice other) {
    return this.getText().compareTo(other.getText());
  }

  protected int compareToMultipleSelect(MultipleSelect other) {
    return this.getText().compareTo(other.getText());
  }

  protected int compareToLikert(Likert other) {
    return this.getText().compareTo(other.getText());
  }
}
