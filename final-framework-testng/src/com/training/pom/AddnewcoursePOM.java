
package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class AddnewcoursePOM {
	private WebDriver driver;

	public AddnewcoursePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//input[@id='title']")
	private WebElement coursename; 
	
	@FindBy(xpath="//button[@id='advanced_params']")
	private WebElement advsettings; 
	
	@FindBy(xpath="//div[contains(text(),'none')]")
	private WebElement catdropdown;
	
	@FindBy(id="add_course_category_code")
	private WebElement Category;
		
	@FindBy(xpath="//input[@id='add_course_wanted_code']")
	private WebElement coursecode;
	
	@FindBy(xpath="//button[@id='add_course_submit']")
	private WebElement addcoursebtn;
	
	@FindBy(xpath="//div[@class='help-course']//em[@class='fa fa-file-text']")
	private WebElement addintrotext;
	
	@FindBy(xpath="//iframe[@class='cke_wysiwyg_frame cke_reset']")
	private WebElement introtext;
	
	@FindBy(xpath="//button[@id='introduction_text_intro_cmdUpdate']")
	private WebElement save;
	
	public void entercoursename(String coursename) {
		this.coursename.sendKeys(coursename);
	} 
	
	public void clkadvsettings() {
		this.advsettings.click();
	} 
	
	public void Catdropdown() {
			this.catdropdown.click();
			//Select drop=new Select(catdropdown);
			//drop.selectByIndex(3);
			}
	
	public void category() {
		Select drop=new Select(Category);
		drop.selectByIndex(3);
	}
	public void Coursecode(String coursecode) {
		this.coursecode.sendKeys(coursecode);
	}
	
	public void Addcoursebtn() {
		this.addcoursebtn.click();
	}
	
	public void addintro() {
		this.addintrotext.click();
		}
	
	public void enterintro() {
		driver.switchTo().frame(introtext);
		WebElement element = driver.findElement(By.xpath("//html"));
		//executeScript("arguments[0].innerHTML = '<h1>Set text using innerHTML</h1>'", element);
		
		//(JavascriptExecutor)driver.ex
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].innerHTML = '<html>this is a selenium course'", element);
		System.out.println("done");
		driver.switchTo().defaultContent();
	}
	public void saveintrotext() {
		this.save.click();
	}
	
			

}






