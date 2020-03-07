package com.pages;



import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Links_Page {

	WebDriver driver;
	
	public void browser() { // url for launch the chrome
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}
	
	public void demoWebShopPage() //using webdriver get visting the testing website
	{
		driver.get("http://demowebshop.tricentis.com/");
		System.out.println(driver.getTitle());
	}
	
	public void linksCount()throws IOException{
		
		
      List <WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        
	}
	public void close() throws InterruptedException
	{
	   
		driver.close(); // close the current tab
	}
}
