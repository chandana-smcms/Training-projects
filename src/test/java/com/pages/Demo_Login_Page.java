package com.pages;


import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Login_Page {
	WebDriver driver;
	
	By loginlink=By.xpath("//a[@class='ico-login']");
	By email=By.xpath("//*[@id=\"Email\"]");
	By password=By.xpath("//*[@id=\"Password\"]");
	By rememberme=By.xpath("//*[@id=\"RememberMe\"]");
	By loginbtn=By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");	
    By logout=By.xpath("//a[@class='ico-logout']"); 
    
    By profile=By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
    By customerinfo=By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div/div[2]/ul/li[1]/a");
	
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
	
	//valid login
	public void loginDetails() throws IOException, InterruptedException 
	{
	
	    driver.findElement(loginlink).click();
		driver.findElement(email).sendKeys("chandana12@gmail.com");;//enter the valid email 
		driver.findElement(password).sendKeys("chandu007!"); // enter the vaild password
		driver.findElement(rememberme).click();
		driver.findElement(loginbtn).click(); 	
	}
	
	public void login() throws InterruptedException
	{
		driver.findElement(logout).click(); // logout button
		Thread.sleep(3000);
		driver.close(); // close the current tab
	}
	
	//login using invalid emailid
	public void loginInvalidDetails() throws IOException, InterruptedException 
	{
	
	    driver.findElement(loginlink).click();
		driver.findElement(email).sendKeys("chandana@12@gmail.com");;//enter the valid email 
		driver.findElement(password).sendKeys("chandu007!"); // enter the vaild password
		driver.findElement(rememberme).click();
		 driver.findElement(loginbtn).click(); 
		String actual=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[2]/span/span")).getText();
		String expected="Please enter a valid email address.";
        assertEquals(actual, expected);	
        System.out.println("assert equals");
       
			
	}
	
	public void validEmail(String emailid)throws IOException,InterruptedException{
		 driver.findElement(loginlink).click();
			driver.findElement(email).sendKeys(emailid);;//enter the valid email 
	}
	
	//login using invalid password
	public void invalidPassword(String pass) throws IOException, InterruptedException{
		driver.findElement(password).sendKeys(pass); // enter the vaild password
		driver.findElement(rememberme).click();
		 driver.findElement(loginbtn).click(); 
		String actual=driver.findElement(By.xpath("//li[contains(text(),'The credentials provided are incorrect')]")).getText();
		String expected="The credentials provided are incorrect";
        assertEquals(actual, expected);	
        System.out.println("assert equals");
       
	}
	
	public void close() throws InterruptedException
	{
	
		driver.close(); // close the current tab
	}
	
   
	

}