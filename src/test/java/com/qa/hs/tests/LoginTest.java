package com.qa.hs.tests;

import org.testng.annotations.Test;

import com.qa.keyword.engine.KeywordEngine;

public class LoginTest {

	public KeywordEngine keywordEngine;
	
	@Test
	public void loginTest(){
		
		keywordEngine= new KeywordEngine();
		keywordEngine.startExecution("Sheet1");
	}
	
	
}
