package com.stepdefinition;

import java.io.IOException;

import com.pages.Demo_Apparel_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo_Apparel_Definition {
	
Demo_Apparel_Page belt=new Demo_Apparel_Page();
	
	@Given("^launch the chrome3 application$")
	public void launch_the_chrome3_application() throws IOException  {
	    // Write code here that turns the phrase above into concrete actions
		belt.browser();
	}

	@When("^the user3 logged in to the home page$")
	public void the_user3_logged_in_to_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		belt.loginPage();
	}

	@Then("^the user3 login using id and password$")
	public void the_user3_login_using_emailid_and_password() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
			
		belt.addToCart();
	 
	}
		
	@Then("^the user3 does the checkout$")
	public void the_user3_does_the_checkout()throws InterruptedException, IOException{
		 // Write code here that turns the phrase above into concrete actions
		belt.checkOut();
		
	}
	
	@Then("^the user3 fills the details in billing address$")
	public void the_user3_fills_the_details_in_billing_address()throws InterruptedException,IOException{
		 // Write code here that turns the phrase above into concrete actions
		
		belt.billingAddress();
		
	}
	
	@Then("^the user3 click the belt and add to cart$")
	public void the_User3_Click_The_Cellphone_And_Add_To_Cart() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		belt.closeBrowser();
	
	}
}

