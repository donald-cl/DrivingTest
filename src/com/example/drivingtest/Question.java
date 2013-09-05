package com.example.drivingtest;

import java.util.HashMap;

public class Question {
	private HashMap<String, Boolean> options;
	private String question;
	private int imageUri;
	
	public Question(String question, int uri) {
		this.options = new HashMap<String, Boolean>();
		this.question = question;
		this.imageUri = uri;
	}
	
	public int getImageUri() {
        return imageUri;
    }

    public void setOptions(HashMap<String, Boolean> options) {
		this.options = options;
	}
	
	public HashMap<String, Boolean> getOptions() {
		return this.options;
	}
	
	public boolean answerQuestion(String answer) {
		if (options.containsKey(answer)) {
			return options.get(answer);
		}
		return false;
	}
	
}
