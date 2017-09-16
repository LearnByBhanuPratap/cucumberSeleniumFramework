package com.cucumber.framework.stepdefinition.registration;

import org.apache.log4j.Logger;

import com.cucumber.framework.PageObject.LoginPage;
import com.cucumber.framework.PageObject.RegistrationPage;
import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.TestBase.TestBase;
import com.cucumber.framework.helper.genericHelper.GenericHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Registration {
	
	private final Logger log = LoggerHelper.getLogger(Registration.class);
	
	RegistrationPage registrationPage;
	LoginPage loginpage;
	
	@When("^enter registration emailID$")
	public void enter_registration_emailID() throws Throwable {
		loginpage = new LoginPage(TestBase.driver);
		loginpage.enterRegistrationEmail();
	}

	@When("^click on create an account$")
	public void click_on_create_an_account() throws Throwable {
		registrationPage = loginpage.clickOnCreateAnAccount();
	}

	@Then("^registration firm open$")
	public void registration_firm_open() throws Throwable {
		new GenericHelper().isDisplayed(registrationPage.mrRadioButton);
	}

	@Then("^select mr radion button$")
	public void select_mr_radion_button() throws Throwable {
		registrationPage.setMrRadioButton();
	}

	@Given("^enter first Name \"([^\"]*)\"$")
	public void enter_first_Name(String arg1) throws Throwable {
		registrationPage.setFirstName(arg1);
	}

	@Given("^enter last Name \"([^\"]*)\"$")
	public void enter_last_Name(String arg1) throws Throwable {
		registrationPage.setLastname(arg1);
	}

	@Given("^enter password  \"([^\"]*)\"$")
	public void enter_password(String arg1) throws Throwable {
		registrationPage.setPassword(arg1);
	}

	@Given("^select day \"([^\"]*)\"$")
	public void select_day(String arg1) throws Throwable {
		registrationPage.setDay(arg1);
	}

	@Given("^select month \"([^\"]*)\"$")
	public void select_month(String arg1) throws Throwable {
		registrationPage.setMonth(arg1);
	}

	@Given("^select year \"([^\"]*)\"$")
	public void select_year(String arg1) throws Throwable {
		registrationPage.setYear(arg1);
	}

	@Given("^enter your address first Name \"([^\"]*)\"$")
	public void enter_your_address_first_Name(String arg1) throws Throwable {
		registrationPage.setYourAddressFirstName(arg1);
	}

	@Given("^enter your address last Name \"([^\"]*)\"$")
	public void enter_your_address_last_Name(String arg1) throws Throwable {
		registrationPage.setYourAddressLastName(arg1);
	}

	@Given("^enter your company Name \"([^\"]*)\"$")
	public void enter_your_company_Name(String arg1) throws Throwable {
		registrationPage.setYourAddressCompany(arg1);
	}

	@Given("^enter Address \"([^\"]*)\"$")
	public void enter_Address(String arg1) throws Throwable {
		registrationPage.setAddress(arg1);
	}

	@Given("^enter Address city \"([^\"]*)\"$")
	public void enter_Address_city(String arg1) throws Throwable {
		registrationPage.setYourAddressCity(arg1);
	}

	@Given("^select state \"([^\"]*)\"$")
	public void select_state(String arg1) throws Throwable {
		registrationPage.setYourAddressState(arg1);
	}

	@Given("^select zipcode \"([^\"]*)\"$")
	public void select_zipcode(String arg1) throws Throwable {
		registrationPage.setYourAddressPostCode(arg1);
	}

	@Given("^Select mobile phone nymber \"([^\"]*)\"$")
	public void select_mobile_phone_nymber(String arg1) throws Throwable {
		registrationPage.setMobilePhone(arg1);
	}

	@Given("^Assign an address alias \"([^\"]*)\"$")
	public void assign_an_address_alias(String arg1) throws Throwable {
		registrationPage.setAddressAlias(arg1);
	}
	
	@Given("^click on registration button$")
	public void click_on_registration_button() throws Throwable {
		registrationPage.clickRegistration();
	}

	@Then("^verify Registration success message$")
	public void verify_Registration_success_message() throws Throwable {
		Thread.sleep(8000);
	}


	
}
