package com.demoqa.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkboxPage {
	WebDriver driver;


	public checkboxPage(WebDriver driver) {
		this.driver =driver;
		
		
	}
	public void getUrl() {
		driver.get("https://demoqa.com/checkbox");
	}
	public WebElement dropdownPage() {
		WebElement dropd = driver.findElement(By.xpath("//*[@class=\"rct-icon rct-icon-expand-close\"]"));
		return dropd;
	}
	public void clickdropdown (WebElement dropd) {
		dropd.click();
	}
	public WebElement findHome() {
		WebElement home = driver.findElement(By.xpath("//*[@class=\rct-icon rct-icon-uncheck\"]"));
		return home;
	}
	public void clickHome (WebElement home) {
		home.click();
	}
}
