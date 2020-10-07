package com.example.demo;

public class MoodAnalyser {

	public String analyseMood(String message) {
		String mood=null;
		if(message.contains("Sad"))
			mood="SAD";
		else
			mood="HAPPY";
		return mood;
	}

}
