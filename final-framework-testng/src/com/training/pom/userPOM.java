package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class userPOM {
	private WebDriver driver;
	
public userPOM(WebDriver driver) {
	this.driver = driver; 
	PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//a[@class='btn btn-primary btn-large']")
private WebElement coursecatalog; 

@FindBy(xpath="//a[contains(text(),'knlselenium')]")
private WebElement courselink;

@FindBy(xpath="//a[@id='istooldesc_3759']")
private WebElement userslnk;

@FindBy(xpath="//div[@class='actions']//a[1]//img[1]")
private WebElement add;

@FindBy(xpath="//tr[2]//td[1]//input[1]")
private WebElement addchkbox;

@FindBy(xpath="//input[@name='user[]']")
private WebElement userchkbox;

@FindBy(xpath="//a[@class='btn btn-small btn-danger']")
private WebElement btn;

@FindBy(xpath="//tr[2]//td[6]//a[1]")
private WebElement Register;

public void Coursecatalog() {
	this.coursecatalog.click();
}
public void Courselink() {
	this.courselink.click();
}

public void Userlnk() {
	this.userslnk.click();
		
}

public void Add() {
	this.add.click();
}

public void addcheck() {
	this.userchkbox.click();
}
public void checkbox() {
	this.userchkbox.click();
}

public void registerlnk() {
	this.Register.click();
}

public void unsubscribe() {
	this.btn.click();
	driver.switchTo().alert().accept();
}
}
