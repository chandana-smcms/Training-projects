package com.stepdefinition;

import java.io.IOException;

import com.pages.Add_To_Cart_Page;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Add_To_Cart_Definition {

	Add_To_Cart_Page mylogin = new Add_To_Cart_Page();
	
	
	@Given("^launch the chrome application$")
	public void the_user_launches_the_chrome_application() throws IOException  {
	    // Write code here that turns the phrase above into concrete actions
		mylogin.browser();
	}

	@When("^the user logged in to the home page$")
	public void the_user_loggedin_to_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	  mylogin.loginPage();
	}

	@Then("^the user login using id and password$")
	public void the_user_login_using_emailid_and_password() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
			
	 mylogin.addToCart();
	 
	}
		
	@Then("^the user does the checkout$")
	public void the_user_does_the_checkout()throws InterruptedException, IOException{
		 // Write code here that turns the phrase above into concrete actions
	mylogin.checkOut();
		
	}
	
	@Then("^the user fills the details in billing address$")
	public void the_user_fills_the_details_in_billing_address()throws InterruptedException,IOException{
		 // Write code here that turns the phrase above into concrete actions
		
	mylogin.billingAddress();
		
	}
	
	@Then("^the user click the book and add to cart$")
	public void click_on_the_login_button_user_nagivate_to_the_next_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	mylogin.closeBrowser();
	
	}
}
