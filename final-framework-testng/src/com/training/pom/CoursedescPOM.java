package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursedescPOM {
private WebDriver driver;

	public CoursedescPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//a[contains(text(),'knlselenium')]")
	private WebElement courselink; 
	
	@FindBy(xpath="//a[@id='istooldesc_3750']")
	private WebElement coursedesclink;
	
	@FindBy(xpath="//section[@id='cm-content']//div[@class='row']//a[1]//img[1]")
	private WebElement coursedesc;

	@FindBy(xpath="//input[@id='course_description_title']")
	private WebElement title;
	
	@FindBy(xpath="//iframe[@class='cke_wysiwyg_frame cke_reset']")
	private WebElement content;
	
	@FindBy(xpath="//button[@id='course_description_submit']")
	private WebElement subbtn;
		
	
public void Courselink() {
	this.courselink.click();
}

public void Coursedesclink() {
	this.coursedesclink.click();
}

public void Coursedesc() {
	this.coursedesc.click();
}

public void Title(String data1) {
	this.title.sendKeys(data1);
}

public void Content() {
	driver.switchTo().frame(content);
	WebElement element = driver.findElement(By.xpath("//body/p"));
	//executeScript("arguments[0].innerHTML = '<h1>Set text using innerHTML</h1>'", element);
	
	//(JavascriptExecutor)driver.ex
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].innerHTML = '<br>Selenium course for beginners'", element);
	System.out.println("done");
	driver.switchTo().defaultContent();
			}

public void Submitbtn() {
	this.subbtn.click();
}

}
