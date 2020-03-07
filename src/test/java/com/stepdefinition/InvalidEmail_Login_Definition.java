package com.stepdefinition;

import java.io.IOException;

import com.pages.Demo_Login_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InvalidEmail_Login_Definition {
	
	Demo_Login_Page mylogin = new Demo_Login_Page();
	
	@Given("^launching the chrome appy$")
	public void launching_the_chrome_application() throws IOException  {
	    // Write code here that turns the phrase above into concrete actions
		mylogin.browser();
	}

	@When("^user login too home page$")
	public void the_user_login_to_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	  mylogin.loginPage();
	}

	@Then("^the userr login using invalid emailid$")
	public void the_user_login_using_invalid_emailid() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
			
	 mylogin.loginInvalidDetails();
	 
	}
	

	@Then("^click on login button user1 should not navigate to the next page$")
	public void click_on_the_login_button_user_should_not_navigate_to_the_next_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	mylogin.close();
	
	}
	
}
