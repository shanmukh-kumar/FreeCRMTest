package com.demoqa.selenium.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.demoqa.selenium.pages.checkboxPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkboxtest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		checkboxPage cb = new checkboxPage(driver);
		cb.getUrl();
		Thread.sleep(1000);
		WebElement drop = cb.dropdownPage();
		cb.clickdropdown(drop);
		WebElement hc = cb.dropdownPage();
		cb.clickHome(hc);
		Thread.sleep(1000);
		driver.quit();
}
}