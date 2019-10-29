package com.training.sanity.tests;

import org.testng.annotations.Test;

import com.training.pom.AddnewcoursePOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class ELTC_007 {
	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	private LoginPOM loginPOM;
	private AddnewcoursePOM addnewcoursePOM;
	
	
	 @BeforeClass
	  public static void setUpBeforeClass() throws IOException {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/others.properties");
			properties.load(inStream);
 }
	 @BeforeMethod 
	  public void beforeMethod() {
		  driver = DriverFactory.getDriver(DriverNames.CHROME);
			loginPOM = new LoginPOM(driver); 
			addnewcoursePOM = new AddnewcoursePOM(driver);
			baseUrl = properties.getProperty("baseURL");
					// open the browser 
			driver.get(baseUrl);
	  }	
	 
	 @AfterMethod
	  public void afterMethod() throws InterruptedException {
		  Thread.sleep(1000);
			driver.quit();
	  }

  @Test
  public void f() {
	  loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		loginPOM.homepageclk();
		loginPOM.clickcourselink();
		addnewcoursePOM.clkadvsettings();
		addnewcoursePOM.entercoursename("sampletest1");
		addnewcoursePOM.Catdropdown();
		addnewcoursePOM.category();
		addnewcoursePOM.Coursecode("test1");
		addnewcoursePOM.Addcoursebtn();
		addnewcoursePOM.addintro();
		addnewcoursePOM.enterintro();
		addnewcoursePOM.saveintrotext();
		
  }
  
}