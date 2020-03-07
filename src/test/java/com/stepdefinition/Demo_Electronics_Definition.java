package com.stepdefinition;

import java.io.IOException;


import com.pages.Demo_Electronics_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo_Electronics_Definition {

	Demo_Electronics_Page cellphone=new Demo_Electronics_Page();
	
	@Given("^launch the chrome2 application$")
	public void launch_the_chrome2_application() throws IOException  {
	    // Write code here that turns the phrase above into concrete actions
		cellphone.browser();
	}

	@When("^the user2 logged in to the home page$")
	public void the_user2_logged_in_to_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		cellphone.loginPage();
	}

	@Then("^the user2 login using id and password$")
	public void the_user2_login_using_emailid_and_password() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
			
		cellphone.addToCart();
	 
	}
		
	@Then("^the user2 does the checkout$")
	public void the_user2_does_the_checkout()throws InterruptedException, IOException{
		 // Write code here that turns the phrase above into concrete actions
		cellphone.checkOut();
		
	}
	
	@Then("^the user2 fills the details in billing address$")
	public void the_user2_fills_the_details_in_billing_address()throws InterruptedException,IOException{
		 // Write code here that turns the phrase above into concrete actions
		
		cellphone.billingAddress();
		
	}
	
	@Then("^the user2 click the cellphone and add to cart$")
	public void the_User2_Click_The_Cellphone_And_Add_To_Cart() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		cellphone.closeBrowser();
	
	}
}
