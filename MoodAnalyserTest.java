package com.example.demo;

import java.util.*;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() throws MoodAnalysisException {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("SAD", mood);

	}

	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy() throws MoodAnalysisException {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}

	@Test
	public void givenMessage_WhenNull_ShouldThrowCustomException() throws MoodAnalysisException {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		try {
			String mood = moodAnalyser.analyseMood();
		}catch (MoodAnalysisException e) {
			Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL,e.type);
		}
	}
	@Test
	public void givenMessage_WhenEmpty_ShouldThrowCustomException() throws MoodAnalysisException {
		MoodAnalyser moodAnalyser = new MoodAnalyser("");
		try {
			String mood = moodAnalyser.analyseMood();
		}catch (MoodAnalysisException e) {
			Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,e.type);
		}
	}
}
