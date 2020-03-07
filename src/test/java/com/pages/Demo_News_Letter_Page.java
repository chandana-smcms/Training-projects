package com.pages;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_News_Letter_Page {
	
	WebDriver driver;
	
	By Letter=By.xpath("//input[@id='newsletter-email']");
	By subscribe=By.xpath("//input[@id='newsletter-subscribe-button']");
	
	public void browser() { // url for launch the chrome
		System.setProperty("webdriver.chrome.driver",  "src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}
	public void loginPage() //using webdriver get visting the testing website
	{
		driver.get("http://demowebshop.tricentis.com/");
		System.out.println(driver.getTitle());
	}
	public void newsLetterSubscribe() throws InterruptedException {
		
		driver.findElement(Letter).sendKeys("chandana12@gmail.com");;
		driver.findElement(subscribe).click();
		Thread.sleep(3000);
		String actual=driver.findElement(By.xpath("//*[@id=\"newsletter-result-block\"]")).getText();		
		String expected="Thank you for signing up! A verification email has been sent. We appreciate your interest.";
		Thread.sleep(3000);
		assertEquals(actual,expected);
		System.out.println("thanks for subscribing");
		
	}
    public void close() throws InterruptedException {
    	driver.close();
    	
    }
}
