package com.demoqa.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class radiobuttonsPage {
	WebDriver driver;
	
	
	public radiobuttonsPage(WebDriver driver) {
		this.driver =driver;
		
	}
	public void getUrl (WebDriver driver) {
		driver.get("https://demoqa.com/radio-button");
	}
	public WebElement findYes() {
		WebElement yes =driver.findElement(By.xpath("//label[text()=\"Yes\"]"));
		return yes;
	}
	public void clickYes (WebElement yes) {
		yes.click();
	}
	public void gettextYes(WebElement yes) {
		yes.getText();
}
	public WebElement findImpressive() {
		WebElement impr =driver.findElement(By.xpath("//label[text()=\"Impressive\"]"));
		return impr;
	}
	public void clickImpressive (WebElement impr) {
		impr.click();
	}
	public void gettext(WebElement impr) {
		impr.getText();
	}
	public WebElement findNo() {
		WebElement no =driver.findElement(By.xpath("//label[text()=\"No\"]"));
		return no;
	}
	public void clickNo (WebElement no) {
		no.click();
	}
	public void gettextNo(WebElement no) {
		no.getText();
	}
}

