package com.pages;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Account_Info_Page {

	WebDriver driver;
	
	By loginlink=By.xpath("//a[@class='ico-login']");
	By email=By.xpath("//*[@id=\"Email\"]");
	By password=By.xpath("//*[@id=\"Password\"]");
	By loginbtn=By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");	
   
    
    By profile=By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
    By customerinfo=By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div/div[2]/ul/li[1]/a");
    By logout=By.xpath("//a[@class='ico-logout']"); 
	
	public void browser() { // url for launch the chrome
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}
	
	public void loginPage() //using webdriver get visting the testing website
	{
		driver.get("http://demowebshop.tricentis.com/");
		System.out.println(driver.getTitle());
	}
	
	public void accountInfo()throws IOException{
		
		driver.findElement(loginlink).click();
		driver.findElement(email).sendKeys("candychandu186@gmail.com");
		driver.findElement(password).sendKeys("chandu123");
		driver.findElement(loginbtn).click();
		driver.findElement(profile).click();
		driver.findElement(customerinfo).click();
		String actual=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[1]/h1")).getText();
		String expected="My account - Customer info";
        assertEquals(actual, expected);	
        System.out.println("assert equals");
        
	}
	public void close() throws InterruptedException
	{
	    driver.findElement(logout).click();
		driver.close(); // close the current tab
	}
}
