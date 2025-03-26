package com.demoqa.selenium.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.demoqa.selenium.pages.textboxesPage;

import io.github.bonigarcia.wdm.WebDriverManager;



public class textboxesTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		textboxesPage tb = new textboxesPage(driver);
		tb.getUrl();
		Thread.sleep(1000);
		WebElement fullname = tb.findFullname();
		tb.sendFullname(fullname);
		WebElement email =tb.findEmail();
		tb.sendEmail(email);
		WebElement address =tb.findAddress();
		tb.sendAddress(address);
		WebElement paddress =tb.findParmenetAddress();
		tb.sendParamentAddress(paddress);
		WebElement submit =tb.findSubimt();
		tb.clickOn(submit);

}
}
