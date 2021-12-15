package com.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pageObjects.CA_LandingPage;

public class JMB_CASignUp_007 extends BaseClass{
  @Test
  public void JMB_CASignUp_007() throws IOException {
	  
	//Started the First name  test
		logger.info("Space in First name ");
		//Create the object for LandingPage
		CA_LandingPage lp = new CA_LandingPage(driver);
		//Clicking on Login button
		lp.click_LookForJob();
		logger.info("Clicked on Look for job ");
		
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("123");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		

		driver.findElement(By.id("sbBt")).click();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement message = driver.findElement(By.xpath("//span[contains(text(),'Please enter valid first name')]"));
		String ExpectedText = "Please enter valid first name";
		
		System.out.println(message.getText());
		Assert.assertEquals(ExpectedText,message.getText());
		System.out.println("Expected message is displayed. SignUp007 passed");
		

  }
}
