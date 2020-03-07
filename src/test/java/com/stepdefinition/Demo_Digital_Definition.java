package com.stepdefinition;

import java.io.IOException;
import com.pages.Demo_Digital_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo_Digital_Definition {
	
	Demo_Digital_Page album =new Demo_Digital_Page();
	
	@Given("^launch the chrome4 application$")
	public void launch_the_chrome4_application() throws IOException  {
	    // Write code here that turns the phrase above into concrete actions
		album.browser();
	}

	@When("^the user4 logged in to the home page$")
	public void the_user4_logged_in_to_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		album.loginPage();
	}

	@Then("^the user4 login using id and password$")
	public void the_user4_login_using_emailid_and_password() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
			
		album.addToCart();
	 
	}
		
	@Then("^the user4 does the checkout$")
	public void the_user4_does_the_checkout()throws InterruptedException, IOException{
		 // Write code here that turns the phrase above into concrete actions
		album.checkOut();
		
	}
	
	@Then("^the user4 fills the details in billing address$")
	public void the_user4_fills_the_details_in_billing_address()throws InterruptedException,IOException{
		 // Write code here that turns the phrase above into concrete actions
		
		album.billingAddress();
		
	}
	
	@Then("^the user4 click the album and add to cart$")
	public void the_User4_Click_The_album_And_Add_To_Cart() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		album.closeBrowser();
	
	}
}

