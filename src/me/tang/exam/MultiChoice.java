package me.tang.exam;

/**
 * ∂‡—°Ã‚
 * 
 * @author Administrator
 *
 */
public class MultiChoice extends Question {
	private String[] options;
	private char[] answers;

	public MultiChoice(String text, String[] options, char[] answers) {
		super(text);
		this.options = options;
		this.answers = answers;
	}

	@Override
	public boolean check(char[] answers) {
		return false;

	}

	public String[] getOptions() {
		return options;
	}

	public void setOptions(String[] options) {
		this.options = options;
	}

	public char[] getAnswers() {
		return answers;
	}

	public void setAnswers(char[] answers) {
		this.answers = answers;
	}

}
