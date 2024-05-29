package stepDefinationFile;

import org.junit.runner.RunWith;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefination { 
	
	@Given("^User_is_in_net_banking_login_page$")
	public void user_is_in_net_banking_login_page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("User login to home page");
	    throw new PendingException();
	}


	@When("^User login into application with username and password$")
	public void user_login_into_application_with_username_and_password() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("User enter username and password");
	    throw new PendingException();
	}


	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User successfully reached to home page");
	    throw new PendingException();
	}

	@Then("^cards are displayed$")
	public void cards_are_displayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User can see the other cards details");
	    throw new PendingException();
	}
}

