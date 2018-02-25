package me.tang.exam;

/**
 * 考题类
 * 
 * @author Administrator
 *
 */
public class Question {
	private String text;// 题干

	public Question() {
		super();
	}

	public Question(String text) {
		super();
		this.text = text;
	}

	public boolean check(char[] answers) {
		
		return false;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
