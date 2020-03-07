package com.stepdefinition;



import java.io.IOException;
import com.pages.Demo_Register_Page;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo_Register_Definition {
	Demo_Register_Page myregister = new Demo_Register_Page();
	
	
	
	
	@Given("^the user launch the chrome application$")
	public void the_user_launch_the_chrome_application() throws IOException  {
	    // Write code here that turns the phrase above into concrete actions
		myregister.browser();
	}

	@When("^the user open the DemoWebShop Register page$")
	public void the_user_open_the_DemoWebShop_Register_page() {
	    // Write code here that turns the phrase above into concrete actions
	  myregister.registerPage();
	}

	@Then("^the user register by filling all the neccessary details$")
	public void the_user_register_by_filling_all_the_neccessary_details() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
			
	 myregister.registerDetails();
	 
	}
	

	@Then("^click on the register button user nagivate to the next page$")
	public void click_on_the_register_button_user_nagivate_to_the_next_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	myregister.submit();
	
	}
	
	///invalid details
	
	@Given("^user launch the chrome application$")
	public void user_launch_the_chrome_application() throws IOException  {
	    // Write code here that turns the phrase above into concrete actions
		myregister.browser();
	}

	@When("^user open the DemoWebShop Register page$")
	public void user_open_the_DemoWebShop_Register_page() {
	    // Write code here that turns the phrase above into concrete actions
	  myregister.registerPage();
	}

	@Then("^user register by filling all invalid details$")
	public void user_register_by_filling_all_the_neccessary_details() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
			
	 myregister.registerInvalidDetails();
	 
	}
	

	@Then("^click on the register button user should not nagivate to the next page$")
	public void click_on_the_register_button_user_should_not_nagivate_to_the_next_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
  
		myregister.quit();
	
	}
	

}