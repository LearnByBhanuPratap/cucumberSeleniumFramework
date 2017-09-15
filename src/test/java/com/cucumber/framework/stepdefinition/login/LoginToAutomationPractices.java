package com.cucumber.framework.stepdefinition.login;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.cucumber.framework.PageObject.LoginPage;
import com.cucumber.framework.configreader.ObjectRepo;
import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.TestBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginToAutomationPractices{
	private final Logger log = LoggerHelper.getLogger(LoginToAutomationPractices.class);

	LoginPage loginpage;
	
	@Given("^navigate to application$")
	public void navigate_to_application() throws Throwable {
       TestBase.driver.get(ObjectRepo.reader.getWebsite());
	}

	@When("^user click on sign in link$")
	public void user_click_on_sign_in_link() throws Throwable {
		loginpage= new LoginPage(TestBase.driver);
		loginpage.clickOnSignInLink();
	}
	@When("^enter email address as \"([^\"]*)\"$")
	public void enter_email_address_as(String arg1) throws Throwable {
		loginpage.enterEmailAddress(arg1);
	}

	@When("^enter password as \"([^\"]*)\"$")
	public void enter_password_as(String arg1) throws Throwable {
		loginpage.enterPassword(arg1);
	}

	@When("^click on sign in button$")
	public void click_on_sign_in_button() throws Throwable {
		loginpage.clickOnSubmitButton();
	}

	@Then("^Login is successful$")
	public void login_is_successful() throws Throwable {
		if(loginpage.verifySuccessLoginMsg()){
			log.info("login test is pass");
		}
		else{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
		}
	}


}
