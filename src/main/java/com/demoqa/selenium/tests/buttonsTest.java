package com.demoqa.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class buttonsTest {

	@Test
	public void testGoogle() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys(
				"https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-chrome-driver/4.29.0", Keys.ENTER);
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		driver.quit();

	}

	public void testFacebook() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("901000815");
		driver.findElement(By.name("pass")).sendKeys("madhu143");
		driver.findElement(By.name("pass"));
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		driver.quit();
	}
}
