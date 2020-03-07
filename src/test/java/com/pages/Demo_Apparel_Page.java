package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_Apparel_Page {
	
WebDriver driver;
	
	By loginlink=By.xpath("//a[@class='ico-login']");
	By email=By.xpath("//*[@id=\"Email\"]");
	By password=By.xpath("//*[@id=\"Password\"]");
	By loginbtn=By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");	
	By apparel=By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[4]/a");
	By belt=By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[4]/div/div[2]/h2/a");
    By addtocart1=By.xpath("//*[@id=\"add-to-cart-button-40\"]");
    By shopping_cart=By.xpath("//span[contains(text(),'Shopping cart')]");
    By country=By.xpath("//*[@id=\'CountryId\']");
    By i_agree=By.xpath("//*[@id=\'termsofservice\']");
    By checkout=By.xpath("//*[@id=\'checkout\']");
    
    By company=By.xpath("//*[@id=\'BillingNewAddress_Company\']");
    By select_country=By.xpath("//*[@id=\'BillingNewAddress_CountryId\']");
    
	/* By logout=By.xpath("//a[@class='ico-logout']"); */
	
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
	
	public void addToCart() throws IOException, InterruptedException 
	{
	
	
	    driver.findElement(loginlink).click();
		driver.findElement(email).sendKeys("chandana12@gmail.com");;//enter the valid email 
		driver.findElement(password).sendKeys("chandu007!"); // enter the vaild password
		driver.findElement(loginbtn).click();
		driver.findElement(apparel).click();
		driver.findElement(belt).click();
	    driver.findElement(addtocart1).click();
	}
	
	public void checkOut() throws IOException,InterruptedException{
		
	    driver.findElement(shopping_cart).click();
	    WebElement country_dropdown=driver.findElement(country);
	    Select dropdown1=new Select (country_dropdown);
	    dropdown1.selectByVisibleText("India");
	    driver.findElement(i_agree).click();
	    driver.findElement(checkout).click();
	}
	
	public void billingAddress() throws IOException,InterruptedException{
		
	    driver.findElement(company).sendKeys("bluelotus");
	    WebElement country_dropdown1=driver.findElement(select_country);
	    Select dropdown2=new Select (country_dropdown1);
	    dropdown2.selectByVisibleText("India");
	    			
	}
	

	public void closeBrowser() throws InterruptedException
	{
		driver.close(); // close the current tab
	}
}

