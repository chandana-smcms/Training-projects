package com.stepdefinition;

import java.io.IOException;


import com.pages.Reward_Point_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Reward_Points_Definition {
	
	Reward_Point_Page myinfo = new Reward_Point_Page();
	
	@Given("^launch chrome app$")
	public void launch_chrome_app() throws IOException  {
	    // Write code here that turns the phrase above into concrete actions
		myinfo.browser();
	}

	@When("^user get logged$")
	public void user_get_logged() {
	    // Write code here that turns the phrase above into concrete actions
	  myinfo.loginPage();
	}

	

	@Then("^user get rewardpoint info$")
	public void user_get_rewardpoint_info() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
		myinfo.rewardPoint();
	
	}

	@Then("^browser gets closed$")
	public void browser_gets_closed() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
			
	 myinfo.close();
	 
	}
}
