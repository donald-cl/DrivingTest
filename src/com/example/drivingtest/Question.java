package com.example.drivingtest;

import java.util.HashMap;
import java.util.ArrayList;

public class Question {
	private HashMap<String, Boolean> options;
	
	public Question() {
		this.options = new HashMap<String, Boolean>();
	}
	
	public void setOptions(HashMap<String, Boolean> options) {
		this.options = options;
	}
	
	public HashMap<String, Boolean> getOptions() {
		return this.options;
	}
	
}
