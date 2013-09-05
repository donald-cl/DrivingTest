package com.example.drivingtest;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class QuestionFactory {
	
	ArrayList<Question> questionPool = new ArrayList<Question>();
	
	public QuestionFactory() {
		questionPool.add(new Question("q1", 0));
		questionPool.add(new Question("q1", 0));
		//etc ... 
	}
	
	public static int randInt(int min, int max) {
	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}
	
	public ArrayList<Question> generateQuestionPool(int n) {
		ArrayList<Question> questionList = new ArrayList<Question>();
		Collections.shuffle(questionList);
		int randIndex = randInt(0, questionPool.size());
		questionList.subList(randIndex, randIndex);
		return questionList;
	}
	
	public Question generateRandomQuestion() {
		return questionPool.get(randInt(0, questionPool.size()));
	}
	
}
