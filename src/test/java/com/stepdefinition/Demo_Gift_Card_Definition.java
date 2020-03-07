package com.stepdefinition;

import java.io.IOException;

import com.pages.Demo_Gift_Card_Page;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo_Gift_Card_Definition {

Demo_Gift_Card_Page giftCard =new Demo_Gift_Card_Page();
	
	@Given("^launch the chrome6 application$")
	public void launch_the_chrome6_application() throws IOException  {
	    // Write code here that turns the phrase above into concrete actions
		giftCard.browser();
	}

	@When("^the user6 logged in to the home page$")
	public void the_user6_logged_in_to_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		giftCard.loginPage();
	}

	@Then("^the user6 login using id and password$")
	public void the_user6_login_using_emailid_and_password() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
			
		giftCard.addToCart();
	 
	}
		
	@Then("^the user6 click the giftcard and add to cart$")
	public void the_user5_does_the_checkout()throws InterruptedException, IOException{
		 // Write code here that turns the phrase above into concrete actions
		giftCard.checkOut();
		
	}
	
	@Then("^the user6 does the checkout$")
	public void the_User6_Click_The_chain_And_Add_To_Cart() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		giftCard.closeBrowser();
	
	}
}
