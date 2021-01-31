package com.banking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	
	 WebDriver ldriver;
	 
   public loginpage(WebDriver rdriver){
	   ldriver=rdriver;
	   PageFactory.initElements(rdriver, this);
	   
   }
   @FindBy (name="uid") WebElement txtusername;
   @FindBy(name="password") WebElement txtpassword;
   @FindBy(name="btnLogin")WebElement btnLogin;
   
   @FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")WebElement lnkLogout;

	
	
   public void setusername(String uname) {
	   txtusername.sendKeys(uname);
	  
   }
   
   public void setpwdname(String pwd) {
	   txtpassword.sendKeys(pwd);
   }
   
   public void clickSubmit() throws InterruptedException
   {
	   Thread.sleep(4000);
	   btnLogin.click();
   }

public void clickLogout()
{
	lnkLogout.click();
}
}
