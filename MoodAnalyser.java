package com.example.demo;

public class MoodAnalyser {
	private String message;

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() {
		String mood = null;
		try {
			if (message.contains("Sad"))
				mood = "SAD";
			else
				mood = "HAPPY";
		} catch (NullPointerException e) {
			mood = "Happy";

		}
		return mood;

	}
}
}