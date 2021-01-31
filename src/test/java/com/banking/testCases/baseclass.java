package com.banking.testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.banking.Utilities.ReadConfig;

import net.bytebuddy.utility.RandomString;

public class baseclass {
	ReadConfig readconfig=new ReadConfig();
	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getpassword();
	public static WebDriver driver;
  public static Logger logger;

  
@BeforeTest
public void setup() {
	
	
	System.setProperty("webdriver.chrome.driver", readconfig.getchromepath());
	
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	logger  =Logger.getLogger("ebanking");
	PropertyConfigurator.configure("Log4j.properties");
	driver.get(baseURL);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@AfterTest

public void teardown() {
	driver.quit();
}


public void captureScreen(WebDriver driver, String tname) throws IOException {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File target = new File(System.getProperty("user.dir") + "/screenshots/" + tname + ".png");
	FileUtils.copyFile(source, target);
	System.out.println("Screenshot taken");
}
public String randomstring() {
String	generatedstring=RandomString.make(10);
	return generatedstring;
}

}