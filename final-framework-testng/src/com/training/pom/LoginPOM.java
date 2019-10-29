package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPOM {
	private WebDriver driver; 
		
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
	PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="login")
	private WebElement userName;

	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(name="submitAuth")
	private WebElement loginBtn;
	 
	@FindBy(xpath="//a[contains(text(),'Homepage')]")
	private WebElement homepage;
	
	@FindBy(xpath="//a[contains(text(),'Create a course')]")
	private WebElement createcourselnk;
	
		
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	private WebElement findElement(By xpath) {
		// TODO Auto-generated method stub
		return null;
	}

	public void sendPassword(String password) {
				this.password.clear(); 
	this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		loginBtn.click(); 
		
	}
	
	public void homepageclk() {
		this.homepage.click();
	}
	public void clickcourselink() {
		this.createcourselnk.click();
	}
	
	
		


}