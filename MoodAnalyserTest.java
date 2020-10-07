package com.example.demo;
import java.util.*;

import org.junit.Assert;
import org.junit.Test;
public class MoodAnalyserTest{
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad()
	{
	    MoodAnalyser moodAnalyser= new MoodAnalyser();
	    String mood =moodAnalyser.analyseMood("I am in Sad Modd");
	    Assert.assertEquals("SAD",mood);
	    
	}
	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy()
	{
	    MoodAnalyser moodAnalyser= new MoodAnalyser();
	    String mood =moodAnalyser.analyseMood("I am in Happy Modd");
	    Assert.assertEquals("HAPPY",mood);
	}
