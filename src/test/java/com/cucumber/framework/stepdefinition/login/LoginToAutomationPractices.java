package com.cucumber.framework.stepdefinition.login;

import org.openqa.selenium.WebDriver;

import com.cucumber.framework.PageObject.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginToAutomationPractices {
	
	WebDriver driver;
	LoginPage loginpage;
	
	@Given("^navigate to application$")
	public void navigate_to_application() throws Throwable {

	}

	@When("^user click on sign in link$")
	public void user_click_on_sign_in_link() throws Throwable {
		loginpage= new LoginPage(driver);
		loginpage.clickOnSignInLink();
	}

	@When("^enter email address$")
	public void enter_email_address(String emailAddress) throws Throwable {
		loginpage.enterEmailAddress(emailAddress);
	}

	@When("^enter password$")
	public void enter_password(String password) throws Throwable {
		loginpage.enterPassword(password);
	}

	@When("^click on sign in button$")
	public void click_on_sign_in_button() throws Throwable {
		loginpage.clickOnSubmitButton();
	}

	@Then("^Login is successful$")
	public void login_is_successful() throws Throwable {
	    
	}


}
