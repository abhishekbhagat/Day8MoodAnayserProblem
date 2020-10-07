package com.example.demo;

import com.example.demo.MoodAnalysisException.ExceptionType;

public class MoodAnalyser {
	private String message;

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() throws MoodAnalysisException {
		String mood = null;
		try {
			if (message.length() == 0)
				throw new MoodAnalysisException(ExceptionType.ENTERED_EMPTY,
						"Please enter valid message you have entered empty message");
			if (message.contains("Sad"))
				mood = "SAD";
			else
				mood = "HAPPY";

		} catch (NullPointerException e) {
			throw new MoodAnalysisException(ExceptionType.ENTERED_NULL,
					"Please enter valid message you have entered null message");
		}
		return mood;
	}
}
