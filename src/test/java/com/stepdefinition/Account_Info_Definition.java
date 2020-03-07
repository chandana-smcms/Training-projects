package com.stepdefinition;

import java.io.IOException;

import com.pages.Account_Info_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Account_Info_Definition {
	
	Account_Info_Page myinfo = new Account_Info_Page();
	
	@Given("^launching chrome application$")
	public void the_user_launches_the_chrome_application() throws IOException  {
	    // Write code here that turns the phrase above into concrete actions
		myinfo.browser();
	}

	@When("^the user login to home page$")
	public void the_user_loggedin_to_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	  myinfo.loginPage();
	}

	@Then("^the user get logged in$")
	public void the_user_login_using_emailid_and_password() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
			
	 myinfo.accountInfo();
	 
	}
	

	@Then("^user get the customer info$")
	public void click_on_the_login_button_user_nagivate_to_the_next_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	myinfo.close();
	
	}
	
}
