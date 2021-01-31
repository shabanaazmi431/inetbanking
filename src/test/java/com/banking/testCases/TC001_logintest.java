package com.banking.testCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.banking.pageObjects.loginpage;

public class TC001_logintest extends baseclass{
	
	
	@Test
	public void loginTest() throws InterruptedException, IOException  {
	
        driver.get(baseURL);
        logger.info("url opened");
		loginpage lp=new loginpage(driver);
		lp.setusername(username);
		logger.info("username entered");
	    lp.setpwdname(password);
	    logger.info("password entered");
	    
	    lp.clickSubmit();
	    logger.info("submitted");
	   // boolean res =driver.getPageSource().contains("Guru99 ");
	    //if(res==true)
	    //{
	    	//Assert.assertTrue(true);
	    	   
	   //}
	    //else
	    //{
	    	//captureScreen( driver,"loginTest" );
	    	//Assert.assertTrue(false);
	    	//logger.info("login test failed");
	    	lp.clickLogout();
	    }
		
	}
	


