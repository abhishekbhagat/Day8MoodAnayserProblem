package com.example.demo;
import java.util.*;

import org.junit.Assert;
import org.junit.Test;
public class MoodAnalyserTest{
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad(){
	    MoodAnalyser moodAnalyser= new MoodAnalyser("I am in Sad Mood");
	    String mood =moodAnalyser.analyseMood();
	    Assert.assertEquals("SAD",mood);
	    
	}
	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy(){
	    MoodAnalyser moodAnalyser= new MoodAnalyser("I am in Happy Mood");
	    String mood =moodAnalyser.analyseMood();
	    Assert.assertEquals("HAPPY",mood);
	}
	
}