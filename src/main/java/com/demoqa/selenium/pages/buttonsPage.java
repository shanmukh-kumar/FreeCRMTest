package com.demoqa.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class buttonsPage {
	WebDriver driver;
	
	public buttonsPage (WebDriver driver) {
		this.driver = driver;
	}
	public void geturl(WebDriver driver) {
		driver.get("https://demoqa.com/buttons");
		
	}
	public WebElement findDoubleclick() {
		WebElement dclick = driver.findElement(By.id("doubleClickBtn"));
		return dclick;
	}
	public void dClick(WebDriver dclick, WebElement element) {
		  Actions dclick1 = new Actions(driver);
		  dclick1.doubleClick(element).perform();

	}public WebElement findRightclick() {
		WebElement dclick = driver.findElement(By.id("rightClickBtn"));
		return dclick;
	}
	public void rClick(WebDriver dclick, WebElement element) {
		  Actions dclick2 = new Actions(driver);
		  dclick2.contextClick(element).perform();

	}public WebElement findClickme() {
		WebElement clickme = driver.findElement(By.xpath("//button[text()='Click Me']"));
		return clickme;
	}
	public void cMe(WebElement clickme) {
		clickme.click();
	}
	

}