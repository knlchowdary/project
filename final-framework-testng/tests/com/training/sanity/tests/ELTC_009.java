package com.training.sanity.tests;

import org.testng.annotations.Test;

import com.training.pom.CoursedescPOM;
import com.training.pom.LoginPOM;
import com.training.pom.userPOM;
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

public class ELTC_009 {
	
	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	private LoginPOM loginPOM;
	private userPOM UserPOM;
	
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
			UserPOM=new userPOM(driver);
			baseUrl = properties.getProperty("baseURL");
					// open the browser 
			driver.get(baseUrl);
	  }	
	 
	 @AfterMethod
	  public void afterMethod() throws InterruptedException {
		  Thread.sleep(1000);
			//driver.quit();
	  }

@Test
public void f() {
	  loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		loginPOM.homepageclk();
		UserPOM.Courselink();
		UserPOM.Userlnk();
		UserPOM.Add();
		UserPOM.registerlnk();
		UserPOM.checkbox();
		UserPOM.unsubscribe();
		driver.close();
		
		
}
}