package com.demoqa.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class textboxesPage {

	WebDriver driver;
	
	public textboxesPage (WebDriver driver) {
		this.driver =driver;
	}
	
	public void getUrl() {
		driver.get("https://demoqa.com/text-box");
		
	}
	public WebElement findFullname () {
		WebElement fb = driver.findElement(By.xpath("//input[@id='userName']"));
		return fb;
}
	public void sendFullname(WebElement fb) {
		fb.sendKeys("Madhubabu");
	}
	public WebElement findEmail() {
		WebElement email =driver.findElement(By.xpath("//input[@id=\"userEmail\"]"));
		return email;
		
	}
	public void sendEmail(WebElement email) {
		email.sendKeys("madhu2gmail.com");
	}
	public WebElement findAddress() {
		WebElement address =driver.findElement(By.id("currentAddress"));
		return address;
		
	}

	public void sendAddress(WebElement address) {
		address.sendKeys("koduru");
	}
	public WebElement findParmenetAddress() {
		WebElement paddress =driver.findElement(By.id("permanentAddress"));
		return paddress;
		
	}

	public void sendParamentAddress(WebElement paddress) {
		paddress.sendKeys("koduru avanigadda");
	}
	public WebElement findSubimt() {
		WebElement submit = driver.findElement(By.id("submit"));
		return submit;
	}
	public void clickOn(WebElement submit) {
		submit.click();
	

	}
}

