package com.demoqa.selenium.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.demoqa.selenium.pages.radiobuttonsPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class radiobuttonsTest {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		radiobuttonsPage rb = new radiobuttonsPage(driver);
		rb.getUrl(driver);
		Thread.sleep(5000);
		WebElement y = rb.findYes();
		rb.clickYes(y);
//		System.out.print(rb.gettextYes(y));
		Thread.sleep(1000);
		WebElement imp =rb.findImpressive();
		rb.clickImpressive(imp);
		rb.gettext(imp);
		Thread.sleep(1000);
		WebElement n =rb.findNo();
		rb.clickNo(n);
		rb.gettextNo(n);
		Thread.sleep(1000);
		driver.quit();
	}

}
