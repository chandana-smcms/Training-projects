package com.stepdefinition;

import java.io.IOException;

import com.pages.Demo_Login_Page;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InvalidPassword_Login_Definition {
	
	Demo_Login_Page mylogin = new Demo_Login_Page();

	@Given("^launching the chrome$")
	public void launch_the_chrome_application() throws IOException  {
	    // Write code here that turns the phrase above into concrete actions
		mylogin.browser();
	}

	@When("^user login to the home page$")
	public void user_login_to_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	  mylogin.loginPage();
	}

	@Then("^the user login using valid (.+)$")
	public void the_user_login_using_valid_emailid (String emailid) throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
			
	 mylogin.validEmail(emailid);
	 
	}
	
	@And("^the user login using invalid (.+)$")
	public void invalidPassword(String pass)throws IOException, InterruptedException{
		
		mylogin.invalidPassword(pass);
	}

	@Then("^click on login button user should not navigate to the next page$")
	public void click_on_login_button_user_should_not_navigate_to_the_next_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	mylogin.close();
	
	}
}
