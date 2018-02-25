package me.tang.exam;

/**
 * ตฅักฬโ
 * 
 * @author Administrator
 *
 */
public class SingleChoice extends Question {
	private String[] options;
	private char answer;

	public SingleChoice(String text, String[] options, char answer) {
		super(text);
		this.answer = answer;
		this.options = options;
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

	public char getAnswer() {
		return answer;
	}

	public void setAnswer(char answer) {
		this.answer = answer;
	}

}
