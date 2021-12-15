package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.CA_LandingPage;

public class JMB_CASignUp_001 extends BaseClass {
  
	@Test
 
	public void JMB_CASignUp_001() throws IOException
	
	{
  
		//Started the login test
		logger.info("Started Look for job test");
		//Create the object for LandingPage
		CA_LandingPage lp = new CA_LandingPage(driver);
		//Clicking on Login button
		lp.click_LookForJob();
		logger.info("Clicked on Look for job ");
		
		lp.clickSignup();
		logger.info("click on singup ");
		
		//Validate whether Sign Up form for candidate.
				SoftAssert softassert = new SoftAssert();
				if(driver.getTitle().equals("Signup"))
				{
					softassert.assertTrue(true);
					logger.info("Test Passed! Successful!");
				}
				else
				{
					softassert.assertTrue(false);
					logger.error("Test Failed! failed!");
					captureScreen(driver,"Lookforjob");
				}
				softassert.assertAll();
				logger.info("Completed Lookforjob");
				
  
  }
}
